CREATE TABLE customer(
    id     bigserial NOT NULL,
    email  varchar(255) NULL,
    "name" varchar(255) NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id)
);
CREATE TABLE orders (
                               order_date date NULL,
                               sale_amount numeric(38, 2) NULL,
                               sale_date date NULL,
                               customer_id int8 NULL,
                               id bigserial NOT NULL,
                               CONSTRAINT orders_pkey PRIMARY KEY (id)
);


-- public.orders foreign keys

ALTER TABLE public.orders ADD CONSTRAINT fk_orders FOREIGN KEY (customer_id) REFERENCES public.customer(id);
