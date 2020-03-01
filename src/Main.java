class Main {
    public static void main (String[] args) {
        Employers[] persArray = new Employers[5];
        persArray[ 0 ] = new Employers("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
        persArray[ 1 ] = new Employers("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 42);
        persArray[ 2 ] = new Employers("Дмитрий Медведев", "Охранник", "dm@primer,ru", "+79997771234", 19000, 21);
        persArray[ 3 ] = new Employers("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
        persArray[ 4 ] = new Employers("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();


    }
}