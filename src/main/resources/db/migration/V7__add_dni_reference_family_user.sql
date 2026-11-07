ALTER TABLE "dni"
ADD COLUMN family_user_id VARCHAR(255) REFERENCES "family_user"(username);