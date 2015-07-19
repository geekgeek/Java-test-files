//Turn string into an array of words
//http://stackoverflow.com/questions/4674850/converting-a-sentence-string-to-a-string-array-of-words-in-java

String s = "This is a sample sentence.";
String[] words = s.split("\\s+");
for (int i = 0; i < words.length; i++) {
    // You may want to check for a non-word character before blindly
    // performing a replacement
    // It may also be necessary to adjust the character class
    words[i] = words[i].replaceAll("[^\\w]", "");
}
