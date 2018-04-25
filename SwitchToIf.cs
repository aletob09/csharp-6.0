static void Main(string[] args)
        {
            string lan = "german";

            if (lan == null)
            {
                Console.WriteLine("error");
            }
            else if (lan == "german")
            {
                Console.WriteLine("hallo");
            }
            else if (lan == "english")
            {
                Console.WriteLine("hello");
            }
            else
            {
                Console.WriteLine("pls choose");
            }
        }