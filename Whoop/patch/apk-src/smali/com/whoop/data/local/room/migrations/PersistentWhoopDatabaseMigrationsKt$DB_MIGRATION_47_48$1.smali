.class public final Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_47_48$1;
.super Lmb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_47_48$1",
        "Lmb/b;",
        "Lub/a;",
        "db",
        "Ll83/a0;",
        "migrate",
        "(Lub/a;)V",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x2f

    const/16 v1, 0x30

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 4

    const-string v0, "DROP TABLE protocol_step_to_campaign"

    const-string v1, "CREATE TABLE protocol_step_new (campaign_id INTEGER NOT NULL, step_id INTEGER NOT NULL, \'text\' TEXT NULL, step_order INTEGER NOT NULL, typeform_url TEXT NULL, image_url TEXT NULL, image_alt TEXT NULL, is_bp INTEGER NOT NULL, is_timer_active INTEGER NULL, is_bthr INTEGER NOT NULL, title TEXT NULL, sub_title TEXT NULL, cta TEXT NULL, typeform_title TEXT NULL, systolic_label TEXT NULL, systolic_too_low_text TEXT NULL, systolic_too_high_text TEXT NULL, systolic_required_text TEXT NULL, systolic_max INTEGER NULL, systolic_min INTEGER NULL, systolic_suffix TEXT NULL, systolic_required INTEGER NULL, diastolic_label TEXT NULL, diastolic_too_low_text TEXT NULL, diastolic_too_high_text TEXT NULL, diastolic_required_text TEXT NULL, diastolic_max INTEGER NULL, diastolic_min INTEGER NULL, diastolic_suffix TEXT NULL, diastolic_required INTEGER NULL, heart_rate_label TEXT NULL, heart_rate_too_low_text TEXT NULL, heart_rate_too_high_text TEXT NULL, heart_required_text TEXT NULL, heart_rate_max INTEGER NULL, heart_rate_min INTEGER NULL, heart_rate_suffix TEXT NULL, heart_rate_required INTEGER NULL, input_type TEXT NULL, input_required INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(campaign_id, step_id))"

    const-string v2, "db"

    const-string v3, "ALTER TABLE whoop_labs_study_tag ADD COLUMN \'campaign_id\' INTEGER DEFAULT -1 NOT NULL"

    invoke-static {p1, v2, v3, v0, v1}, Lhc3/i;->s(Lub/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "INSERT INTO protocol_step_new (campaign_id, step_id, text, step_order, typeform_url, image_url, image_alt, is_bp, is_timer_active, is_bthr, title, sub_title, cta, typeform_title, systolic_label, systolic_too_low_text, systolic_too_high_text, systolic_required_text, systolic_max, systolic_min, systolic_suffix, systolic_required, diastolic_label, diastolic_too_low_text, diastolic_too_high_text, diastolic_required_text, diastolic_max, diastolic_min, diastolic_suffix, diastolic_required, heart_rate_label, heart_rate_too_low_text, heart_rate_too_high_text, heart_required_text, heart_rate_max, heart_rate_min, heart_rate_suffix, heart_rate_required, input_type, input_required) SELECT -1, step_id, text, step_order, typeform_url, image_url, image_alt, is_bp, is_timer_active, is_bthr, title, sub_title, cta, typeform_title, systolic_label, systolic_too_low_text, systolic_too_high_text, systolic_required_text, systolic_max, systolic_min, systolic_suffix, systolic_required, diastolic_label, diastolic_too_low_text, diastolic_too_high_text, diastolic_required_text, diastolic_max, diastolic_min, diastolic_suffix, diastolic_required, heart_rate_label, heart_rate_too_low_text, heart_rate_too_high_text, heart_required_text, heart_rate_max, heart_rate_min, heart_rate_suffix, hear_rate_required, input_type, input_required FROM protocol_step"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "DROP TABLE protocol_step"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE protocol_step_new RENAME TO protocol_step"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE protocol_step_result_new (campaign_id INTEGER NOT NULL, result_id INTEGER NOT NULL, start_timestamp TEXT NULL, end_timestamp TEXT NULL, timestamp TEXT NULL, systolic INTEGER NULL, diastolic INTEGER NULL, heart_rate INTEGER NULL, typeform_submitted INTEGER NOT NULL, text_option TEXT NULL, number_input INTEGER NULL, text_input TEXT NULL, step_order INTEGER NOT NULL, PRIMARY KEY(campaign_id, result_id))"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "INSERT INTO protocol_step_result_new (campaign_id, result_id, start_timestamp, end_timestamp, timestamp, systolic, diastolic, heart_rate, typeform_submitted, text_option, number_input, text_input, step_order) SELECT -1, result_id, start_timestamp, end_timestamp, timestamp, systolic, diastolic, heart_rate, typeform_submitted, text_option, number_input, text_input, step_order FROM whoop_labs_protocol_step_result"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "DROP TABLE whoop_labs_protocol_step_result"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE protocol_step_result_new RENAME TO whoop_labs_protocol_step_result"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
