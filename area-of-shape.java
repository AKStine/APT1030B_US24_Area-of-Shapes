<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Area Calculator</title>
</head>
<body>
    <h1>Choose a shape to calculate the area:</h1>
    <button onclick="calculateArea('circle')">Circle</button>
    <button onclick="calculateArea('rectangle')">Rectangle</button>
    <button onclick="calculateArea('triangle')">Triangle</button>

    <div id="result"></div>

    <script>
        function calculateArea(shape) {
            let area;
            if (shape === 'circle') {
                let radius = prompt("Enter the radius of the circle:");
                radius = parseFloat(radius);
                area = Math.PI * radius * radius;
                document.getElementById("result").innerText = The area of the circle is ${area.toFixed(2)};
            } else if (shape === 'rectangle') {
                let length = prompt("Enter the length of the rectangle:");
                let width = prompt("Enter the width of the rectangle:");
                length = parseFloat(length);
                width = parseFloat(width);
                area = length * width;
                document.getElementById("result").innerText = The area of the rectangle is ${area.toFixed(2)};
            } else if (shape === 'triangle') {
                let base = prompt("Enter the base of the triangle:");
                let height = prompt("Enter the height of the triangle:");
                base = parseFloat(base);
                height = parseFloat(height);
                area = 0.5 * base * height;
                document.getElementById("result").innerText = The area of the triangle is ${area.toFixed(2)};
            } else {
                document.getElementById("result").innerText = "Invalid choice";
            }
        }
    </script>
</body>
</html>