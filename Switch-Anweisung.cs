static void Main(string[] args)
        {
            int month = 4; //gefragtes Monat
            switch (month) //gibt die anzahl der Tage für das gefragte Monat aus
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    Console.WriteLine("31 Days");
                    break;

                case 4: case 6: case 9: case 11:
                    Console.WriteLine("30 Days");
                    break;

                case 2:
                    Console.WriteLine("28 Days");
                    break;

                default:
                    break;
            }
        }