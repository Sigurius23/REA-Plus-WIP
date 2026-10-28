.class public final enum Lmc1/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmc1/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmc1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lmc1/b;",
        "",
        "",
        "name",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ly81/f;",
        "defaultColorKey",
        "toWhoopColorKey",
        "(Ly81/f;)Ly81/f;",
        "EXHALE",
        "HARD",
        "HOLD",
        "HIGH_STRESS",
        "INHALE",
        "LIGHT",
        "LIGHT_SLEEP",
        "LOW_STRESS",
        "MAX",
        "MEDIUM_STRESS",
        "MODERATE",
        "NONE",
        "NO_DATA",
        "REM_SLEEP",
        "RESTORATIVE",
        "SWS_SLEEP",
        "VERY_LIGHT",
        "AWAKE",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lmc1/b;

.field public static final enum AWAKE:Lmc1/b;

.field public static final enum EXHALE:Lmc1/b;

.field public static final enum HARD:Lmc1/b;

.field public static final enum HIGH_STRESS:Lmc1/b;

.field public static final enum HOLD:Lmc1/b;

.field public static final enum INHALE:Lmc1/b;

.field public static final enum LIGHT:Lmc1/b;

.field public static final enum LIGHT_SLEEP:Lmc1/b;

.field public static final enum LOW_STRESS:Lmc1/b;

.field public static final enum MAX:Lmc1/b;

.field public static final enum MEDIUM_STRESS:Lmc1/b;

.field public static final enum MODERATE:Lmc1/b;

.field public static final enum NONE:Lmc1/b;

.field public static final enum NO_DATA:Lmc1/b;

.field public static final enum REM_SLEEP:Lmc1/b;

.field public static final enum RESTORATIVE:Lmc1/b;

.field public static final enum SWS_SLEEP:Lmc1/b;

.field public static final enum VERY_LIGHT:Lmc1/b;


# direct methods
.method private static final synthetic $values()[Lmc1/b;
    .locals 19

    sget-object v1, Lmc1/b;->EXHALE:Lmc1/b;

    sget-object v2, Lmc1/b;->HARD:Lmc1/b;

    sget-object v3, Lmc1/b;->HOLD:Lmc1/b;

    sget-object v4, Lmc1/b;->HIGH_STRESS:Lmc1/b;

    sget-object v5, Lmc1/b;->INHALE:Lmc1/b;

    sget-object v6, Lmc1/b;->LIGHT:Lmc1/b;

    sget-object v7, Lmc1/b;->LIGHT_SLEEP:Lmc1/b;

    sget-object v8, Lmc1/b;->LOW_STRESS:Lmc1/b;

    sget-object v9, Lmc1/b;->MAX:Lmc1/b;

    sget-object v10, Lmc1/b;->MEDIUM_STRESS:Lmc1/b;

    sget-object v11, Lmc1/b;->MODERATE:Lmc1/b;

    sget-object v12, Lmc1/b;->NONE:Lmc1/b;

    sget-object v13, Lmc1/b;->NO_DATA:Lmc1/b;

    sget-object v14, Lmc1/b;->REM_SLEEP:Lmc1/b;

    sget-object v15, Lmc1/b;->RESTORATIVE:Lmc1/b;

    sget-object v16, Lmc1/b;->SWS_SLEEP:Lmc1/b;

    sget-object v17, Lmc1/b;->VERY_LIGHT:Lmc1/b;

    sget-object v18, Lmc1/b;->AWAKE:Lmc1/b;

    filled-new-array/range {v1 .. v18}, [Lmc1/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmc1/b;

    const-string v1, "EXHALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->EXHALE:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "HARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->HARD:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "HOLD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->HOLD:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "HIGH_STRESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->HIGH_STRESS:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "INHALE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->INHALE:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "LIGHT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->LIGHT:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "LIGHT_SLEEP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->LIGHT_SLEEP:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "LOW_STRESS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->LOW_STRESS:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "MAX"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->MAX:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "MEDIUM_STRESS"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->MEDIUM_STRESS:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "MODERATE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->MODERATE:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "NONE"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->NONE:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "NO_DATA"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->NO_DATA:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "REM_SLEEP"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->REM_SLEEP:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "RESTORATIVE"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->RESTORATIVE:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "SWS_SLEEP"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->SWS_SLEEP:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "VERY_LIGHT"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->VERY_LIGHT:Lmc1/b;

    new-instance v0, Lmc1/b;

    const-string v1, "AWAKE"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2, v1}, Lmc1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmc1/b;->AWAKE:Lmc1/b;

    invoke-static {}, Lmc1/b;->$values()[Lmc1/b;

    move-result-object v0

    sput-object v0, Lmc1/b;->$VALUES:[Lmc1/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmc1/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lmc1/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static synthetic toWhoopColorKey$default(Lmc1/b;Ly81/f;ILjava/lang/Object;)Ly81/f;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Ly81/f;->SLEEP:Ly81/f;

    :cond_0
    invoke-virtual {p0, p1}, Lmc1/b;->toWhoopColorKey(Ly81/f;)Ly81/f;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toWhoopColorKey"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lmc1/b;
    .locals 1

    const-class v0, Lmc1/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmc1/b;

    return-object p0
.end method

.method public static values()[Lmc1/b;
    .locals 1

    sget-object v0, Lmc1/b;->$VALUES:[Lmc1/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmc1/b;

    return-object v0
.end method


# virtual methods
.method public final toWhoopColorKey(Ly81/f;)Ly81/f;
    .locals 2

    const-string v0, "defaultColorKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmc1/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    return-object p1

    :pswitch_0
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1

    :pswitch_1
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p1

    :pswitch_2
    sget-object p1, Ly81/f;->RECOVERY:Ly81/f;

    return-object p1

    :pswitch_3
    sget-object p1, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    return-object p1

    :pswitch_4
    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1

    :pswitch_5
    sget-object p1, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    return-object p1

    :pswitch_6
    sget-object p1, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p1

    :pswitch_7
    sget-object p1, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object p1

    :pswitch_8
    sget-object p1, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p1

    :pswitch_9
    sget-object p1, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p1

    :pswitch_a
    sget-object p1, Ly81/f;->STRAIN:Ly81/f;

    return-object p1

    :pswitch_b
    sget-object p1, Ly81/f;->SLEEP_AWAKE:Ly81/f;

    return-object p1

    :pswitch_c
    sget-object p1, Ly81/f;->SLEEP_DEEP_SLEEP:Ly81/f;

    return-object p1

    :pswitch_d
    sget-object p1, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    return-object p1

    :pswitch_e
    sget-object p1, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
