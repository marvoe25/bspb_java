public class Lesson2 {
    public static void main(String[] args) {
        String[][] clientsArr = {
                {"Te", "Anna", "Ivanovna", "25", "female"},
                {"Test", "Ian", "Bill", "12", "male"},
                {"Brig", "Inna", "Kimovna", "35", "female"},
                {"Shtab", "Stepanida", "Petrovna", "27", "female"},
                {"Pelevin", "Denis", "Mantovich", "19", "male"},
                {"Space", "Kim", "Denisovich", "32", "male"},
                {"Zamyatina", "Inga", "Ianovna", "70", "female"},
                {"Space", "Buran", "Denisovich", "22", "male"},
                {"Akimova", "Julia", "Dmitrievna", "55", "female"},
                {"Suvorov", "Sergey", "Danilovich", "42", "male"}};


        //print the array
        System.out.println("Start array:");
        for (int i = 0; i < clientsArr.length; i++) {
            System.out.print(i + 1 + ") ");
            for (int j = 0; j < clientsArr[i].length; j++)
                System.out.print(clientsArr[i][j] + " ");
            System.out.println();
        }

        //sort array
        for (int i = 0; i < clientsArr.length; i++) {
            int minValue = Integer.parseInt(clientsArr[i][3]);
            //System.out.println("minValue=" + minValue);
            int minIndex = i;
            //System.out.println("minIndex=i: " + minIndex);
            for (int j = i + 1; j < clientsArr.length; j++) {
                if (Integer.parseInt(clientsArr[j][3]) < minValue) {
                    minValue = Integer.parseInt(clientsArr[j][3]);
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                String[] tmpArr = clientsArr[i];
                clientsArr[i] = clientsArr[minIndex];
                clientsArr[minIndex] = tmpArr;
            }
        }

        //print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < clientsArr.length; i++) {
            System.out.print(i + 1 + ") ");
            for (int j = 0; j < clientsArr[i].length; j++)
                System.out.print(clientsArr[i][j] + " ");
            System.out.println();
        }

        //print the part of array - only women
        System.out.println("The sorted array of women:");
        for (int i = 0, c = 1; i < clientsArr.length; i++) {
            if (clientsArr[i][4].equals("female")) {
                System.out.print(c + ") ");
                c++;
                for (int j = 0; j < clientsArr[i].length; j++)
                    System.out.print(clientsArr[i][j] + " ");
                System.out.println();
            }
        }
    }
}



