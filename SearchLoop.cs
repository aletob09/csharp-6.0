 static void Main(string[] args)
        {
            int[] tab = new int[5];
            int foo = 8;

            for (int i = 0; i < tab.Length; i++)
            {
                tab[i] = foo;
                foo--;
                Console.WriteLine(tab[i]);
            }

            Console.WriteLine(Search(tab, 3));
        }



        static int Search(int[] tab,  int val)
        {
            int index = 0;

            for (int i = 0; i < tab.Length; i++)
            {
                index++;
                if (tab[i] == val)
                {
                    return index;
                }
            }
            index = 0;
            return index;
        }