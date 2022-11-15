using System;
using System.Collections;

namespace ProgramOne
{
    public class Tree
    {
        public class TreeNode // Підклас елемент дерева
        {
            public int Value; // числове значення
            public int Count = 0; // скільки разів добавленно число значення
            public TreeNode Left; // ліве піддерево
            public TreeNode Right; // праве піддерево
        }
        public TreeNode Node; // екземпляр класса "элемент дерева"
    }
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList MyList = new();
            MyList.Add(5);
        }
    }
}
