#include <stdio.h>
#include <math.h>

int main() {
    int choice;
    double radius, length, width, base, height, area;

    printf("Choose a shape to calculate the area:\n");
    printf("1. Circle\n");
    printf("2. Rectangle\n");
    printf("3. Triangle\n");
    printf("Enter the number of your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            printf("Enter the radius of the circle: ");
            scanf("%lf", &radius);
            area = M_PI * radius * radius;
            printf("The area of the circle is %.2f\n", area);
            break;
        case 2:
            printf("Enter the length of the rectangle: ");
            scanf("%lf", &length);
            printf("Enter the width of the rectangle: ");
            scanf("%lf", &width);
            area = length * width;
            printf("The area of the rectangle is %.2f\n", area);
            break;
        case 3:
            printf("Enter the base of the triangle: ");
            scanf("%lf", &base);
            printf("Enter the height of the triangle: ");
            scanf("%lf", &height);
            area = 0.5 * base * height;
            printf("The area of the triangle is %.2f\n", area);
            break;
        default:
            printf("Invalid choice\n");
            break;
    }

    return 0;
}