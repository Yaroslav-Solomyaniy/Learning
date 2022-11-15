using System;
using System.Collections.Generic;

namespace AppTwo
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack<string> brackets = new Stack<string>();
            brackets.Push("{");
            string stackElement = brackets.Pop(); // в стеке 5, 3
            Console.WriteLine(stackElement);
        }
    }
}
