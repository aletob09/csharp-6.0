namespace A
    {

        public struct Time //Version 1 von Time mit *
        {
            public int h;
            public int m;

            public Time(int h, int m)
            {
                this.h = h;
                this.m = m;
            }

            public int DoCalc()
            {
                int foo = m * h;
                return foo;
            }
        }

    }

    namespace B
    {

        using System;
        using A;

        public class Test
        {

            public static void Main()
            {
                A.Time t = new A.Time(3, 20); //A. erzwingt die verwendung von Version 1(*)
                Console.WriteLine();
            }
        }

        public struct Time //Version 2 von Time mit +
        {
            public int h;
            public int m;

            public Time(int h, int m)
            {
                this.h = h;
                this.m = m;
            }

            public int DoCalc()
            {
                int foo = m + h;
                return foo;
            }
        }

    }