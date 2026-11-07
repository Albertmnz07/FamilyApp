CREATE TABLE "family_user" (
    username VARCHAR(255) PRIMARY KEY,
    user_id UUID REFERENCES "user"(id)
);