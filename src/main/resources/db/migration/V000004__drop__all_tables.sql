ALTER TABLE dnd_character
--    DROP CONSTRAINT dnd_character_campaign_id_fkey,
    DROP CONSTRAINT dnd_character_deity_id_fkey,
    DROP CONSTRAINT dnd_character_feat_id_fkey,
    DROP CONSTRAINT dnd_character_item_id_fkey,
    DROP CONSTRAINT dnd_character_player_id_fkey,
    DROP CONSTRAINT dnd_character_race_id_fkey,
    DROP CONSTRAINT dnd_character_skill_id_fkey;
ALTER TABLE campaign
    DROP CONSTRAINT campaign_character_id_fkey,
    DROP CONSTRAINT campaign_player_id_fkey;
ALTER TABLE player
    DROP CONSTRAINT player_campaign_id_fkey,
    DROP CONSTRAINT player_character_id_fkey;
DROP TABLE dnd_character;
DROP TABLE feat;
DROP TABLE skill;
DROP TABLE deity;
DROP TABLE item;
DROP TABLE race;
DROP TABLE player;
DROP TABLE campaign;