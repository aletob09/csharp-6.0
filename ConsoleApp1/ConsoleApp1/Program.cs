﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            string lan;

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
    }
}
