CREATE TABLE "user" (
    id UUID PRIMARY KEY,
    username VARCHAR(255),
    family_id UUID REFERENCES family(id)
);