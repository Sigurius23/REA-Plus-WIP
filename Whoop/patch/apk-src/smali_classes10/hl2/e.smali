.class public abstract Lhl2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
        "a",
        "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
        "()Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
        "defaultHrSettingResponse",
        "training_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    new-instance v2, Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    const-string v1, ""

    invoke-direct {v2, v1, v1}, Lcom/whoop/training/data/network/response/hrsettings/Introduction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    const-string v9, ""

    const-string v10, ""

    const/4 v4, 0x0

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const-string v8, ""

    sget-object v11, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v3 .. v11}, Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    const-string v1, ""

    move-object v4, v11

    move-object v5, v3

    move-object v3, v11

    invoke-direct/range {v0 .. v5}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;-><init>(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)V

    sput-object v0, Lhl2/e;->a:Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    return-void
.end method

.method public static final a()Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;
    .locals 1

    sget-object v0, Lhl2/e;->a:Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    return-object v0
.end method
