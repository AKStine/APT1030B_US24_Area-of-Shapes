using System;

namespace ShapeAreaCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Choose a shape to calculate the area:");
            Console.WriteLine("1. Circle");
            Console.WriteLine("2. Rectangle");
            Console.WriteLine("3. Triangle");
            Console.Write("Enter the number of your choice: ");
            int choice = int.Parse(Console.ReadLine());

            switch (choice)
            {
                case 1:
                    Console.Write("Enter the radius of the circle: ");
                    double radius = double.Parse(Console.ReadLine());
                    double circleArea = Math.PI * radius * radius;
                    Console.WriteLine($"The area of the circle is {circleArea:F2}");
                    break;
                case 2:
                    Console.Write("Enter the length of the rectangle: ");
                    double length = double.Parse(Console.ReadLine());
                    Console.Write("Enter the width of the rectangle: ");
                    double width = double.Parse(Console.ReadLine());
                    double rectangleArea = length * width;
                    Console.WriteLine($"The area of the rectangle is {rectangleArea:F2}");
                    break;
                case 3:
                    Console.Write("Enter the base of the triangle: ");
                    double baseLength = double.Parse(Console.ReadLine());
                    Console.Write("Enter the height of the triangle: ");
                    double height = double.Parse(Console.ReadLine());
                    double triangleArea = 0.5 * baseLength * height;
                    Console.WriteLine($"The area of the triangle is {triangleArea:F2}");
                    break;
                default:
                    Console.WriteLine("Invalid choice");
                    break;
            }
        }
    }
}