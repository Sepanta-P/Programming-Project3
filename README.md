# Programming-Project3

# Overview:
My program lets users browse and buy products. It simulates an online where users can add items to cart, check out, and view orders. There is an Admin feature which lets admin see all the orders and control them.
# Features:

This program allows users to browse products in categories, add items to theri cart, and view or remove cart items. Users can checkout to place orders. Admins can view all orders by entering a password. Users can exit the program anytime by choosing the Exit option.

# Data Storage:
The program uses lists to store categories, product names, stock avalability, prices, cart items, and orders. These lists make it easy to manage and update product details, track user selection and keep record of orders.
# User Input Handling:
A scanner is used to get input from the user. The program checks all inputs to avoid errors. For example, it ensures to pick valid categories and products and prevent adding more items than available stock.
# Product Browsing Logic:
When user selects a category, the program shows the products, their prices, and availability. Users can choose a product, enter a quantity, and add it to their cart if it's in stock. The stock is updated after adding an item.
# Shopping Cart Management:
Users can view all items in their cart, including quantities and prices. They can also remove items or proceed to checkout. If the cart is empty, the program shows a message saying that your cart is empty and it will redirect you to the main menu.
# Checkout Logic
During checkout, the program calculates the total price of all items in the cart and shows an invoice. The order is then saved and the cart is cleared for new purchases. The program will then thank the user for shopping using this wesbite.
# Admin:
Admins can view all oderders by entering a password. If the passoword is worng access is denied and they will be asked to enter the password again. If no orders have been placed, the program shows a message saying no orders are available.
# Exit:
The program allows the user to exit anytime, It shows a goodbye message as well.
