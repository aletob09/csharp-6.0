using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    struct Time
    {
        public int s;

        public Time(int sec, int min, int hour)
        {
            s = (3600 * hour + 60 * min + sec) % 86400;
        }

        public Time(int sec)
        {
            s = sec;
        }

        int ConvertTime(int)
        {
            if (s > 59)
            {
               
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {

        }
    }
}
