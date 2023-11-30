package ru.mirea.PR14;

import java.util.HashMap; // Импорт класса HashMap для создания словаря
import java.util.Map; // Импорт интерфейса Map для работы с коллекцией Map

public class task5 { // Объявление публичного класса с именем FrequencyDictionary

    public static void main(String[] args) { // Основной метод программы
        String text = "Этот текст предназначен для анализа частоты букв в русском алфавите.";

        // Убираем все пробелы и приводим к нижнему регистру
        text = text.replaceAll("\\s+", "").toLowerCase();
        // "\\s+" - регулярное выражение для одного или более пробелов

        // Создаем словарь для хранения частот
        Map<Character, Integer> frequencyDictionary = new HashMap<>();
        // Инициализация словаря, где ключ - символ, значение - частота

        // Перебираем символы в тексте
        for (char symbol : text.toCharArray()) {
            // Преобразование строки в массив символов и итерация по символам
            // в тексте

            // Проверяем, является ли символ буквой русского алфавита
            if (Character.isLetter(symbol) && symbol >= 'а' && symbol <= 'я') {
                // Проверка на то, что символ - буква и принадлежит русскому алфавиту

                // Если символ подходит, увеличиваем частоту
                frequencyDictionary.put(symbol, frequencyDictionary.getOrDefault(symbol, 0) + 1);
                // Увеличиваем частоту данного символа на 1, или 0 если символ встречается впервые
            }
        }

        // Выводим результат
        for (Map.Entry<Character, Integer> entry : frequencyDictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            // Перебор и вывод всех элементов словаря (символ:частота)
        }
    }
}
