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

            // vorgegebene while Schleife
            int i = 0;
            while (i < 3)
            {
                Foo(i);
                i++;
            }


            Console.WriteLine("----------------------------");
            // do-while Schleife
            i = 0;
            do
            {
                Foo(i);
                i++;
            } while (i < 3);

            Console.WriteLine("----------------------------");
            //for Schleife
            i = 0;
            for (i = 0; i < 3; i++)
            {
                Foo(i);
            }
        }

        static void Foo(int tmp)
        {
            Console.WriteLine(tmp);
        }
    }
}
