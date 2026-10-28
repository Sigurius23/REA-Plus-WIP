.class public final enum Lcj1/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcj1/s;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcj1/s;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SINUS_RHYTHM",
        "LOW_HEART_RATE",
        "AFIB",
        "AFIB_HIGH_HEART_RATE",
        "HIGH_HEART_RATE",
        "HIGH_HEART_RATE_NO_AFIB_DETECTED",
        "UNREADABLE",
        "INCONCLUSIVE",
        "health_release"
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

.field private static final synthetic $VALUES:[Lcj1/s;

.field public static final enum AFIB:Lcj1/s;

.field public static final enum AFIB_HIGH_HEART_RATE:Lcj1/s;

.field public static final enum HIGH_HEART_RATE:Lcj1/s;

.field public static final enum HIGH_HEART_RATE_NO_AFIB_DETECTED:Lcj1/s;

.field public static final enum INCONCLUSIVE:Lcj1/s;

.field public static final enum LOW_HEART_RATE:Lcj1/s;

.field public static final enum SINUS_RHYTHM:Lcj1/s;

.field public static final enum UNREADABLE:Lcj1/s;


# direct methods
.method private static final synthetic $values()[Lcj1/s;
    .locals 8

    sget-object v0, Lcj1/s;->SINUS_RHYTHM:Lcj1/s;

    sget-object v1, Lcj1/s;->LOW_HEART_RATE:Lcj1/s;

    sget-object v2, Lcj1/s;->AFIB:Lcj1/s;

    sget-object v3, Lcj1/s;->AFIB_HIGH_HEART_RATE:Lcj1/s;

    sget-object v4, Lcj1/s;->HIGH_HEART_RATE:Lcj1/s;

    sget-object v5, Lcj1/s;->HIGH_HEART_RATE_NO_AFIB_DETECTED:Lcj1/s;

    sget-object v6, Lcj1/s;->UNREADABLE:Lcj1/s;

    sget-object v7, Lcj1/s;->INCONCLUSIVE:Lcj1/s;

    filled-new-array/range {v0 .. v7}, [Lcj1/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcj1/s;

    const-string v1, "SINUS_RHYTHM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->SINUS_RHYTHM:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "LOW_HEART_RATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->LOW_HEART_RATE:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "AFIB"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->AFIB:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "AFIB_HIGH_HEART_RATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->AFIB_HIGH_HEART_RATE:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "HIGH_HEART_RATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->HIGH_HEART_RATE:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "HIGH_HEART_RATE_NO_AFIB_DETECTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->HIGH_HEART_RATE_NO_AFIB_DETECTED:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "UNREADABLE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->UNREADABLE:Lcj1/s;

    new-instance v0, Lcj1/s;

    const-string v1, "INCONCLUSIVE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcj1/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj1/s;->INCONCLUSIVE:Lcj1/s;

    invoke-static {}, Lcj1/s;->$values()[Lcj1/s;

    move-result-object v0

    sput-object v0, Lcj1/s;->$VALUES:[Lcj1/s;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcj1/s;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
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

    sget-object v0, Lcj1/s;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcj1/s;
    .locals 1

    const-class v0, Lcj1/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcj1/s;

    return-object p0
.end method

.method public static values()[Lcj1/s;
    .locals 1

    sget-object v0, Lcj1/s;->$VALUES:[Lcj1/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcj1/s;

    return-object v0
.end method
