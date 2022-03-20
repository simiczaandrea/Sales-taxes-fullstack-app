insert into category (category_id, category_name, is_tax_free) VALUES (1, 'book', true);
insert into category (category_id, category_name, is_tax_free) values (2, 'food', true);
insert into category (category_id, category_name, is_tax_free) values (3, 'medical products', true);
insert into category (category_id, category_name, is_tax_free) values (4, 'music', false);
insert into category (category_id, category_name, is_tax_free) values (5, 'perfume', false);

insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (1, false, 'book', 12.49, 1);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (2, false, 'music CD', 14.99, 4);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (3, false, 'chocolate bar', 0.85, 2);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (4, true, 'box of chocolates', 10.0, 2);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (5, true, 'bottle of perfume', 47.5, 5);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (6, true, 'bottle of perfume', 27.99, 5);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (7, false, 'bottle of perfume', 18.99, 5);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (8, false, 'packet of headache pills', 9.45, 3);
insert into product (product_id, is_imported, product_name, products_net_price, category_id) values (9, true, 'box of chocolates', 11.25, 2);