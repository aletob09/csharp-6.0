static void Main(string[] args)
        {
            int x = 1;
            int y = 2;
            int z = 3;

            if (x > y)
            {
                if (x > z)
                {
                    Console.WriteLine(x);
                }
                else
                {
                    Console.WriteLine(z);
                }
            }
            else if (y > z)
            {
                Console.WriteLine(y);
            }
            else
            {
                Console.WriteLine(z);
            }
        }