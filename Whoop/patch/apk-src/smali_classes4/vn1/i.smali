.class public final enum Lvn1/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvn1/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lvn1/i;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT",
        "LEFT_SWIPE",
        "SCALE_OUT",
        "home-notifications-center_release"
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

.field private static final synthetic $VALUES:[Lvn1/i;

.field public static final enum FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT:Lvn1/i;

.field public static final enum LEFT_SWIPE:Lvn1/i;

.field public static final enum SCALE_OUT:Lvn1/i;


# direct methods
.method private static final synthetic $values()[Lvn1/i;
    .locals 3

    sget-object v0, Lvn1/i;->FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT:Lvn1/i;

    sget-object v1, Lvn1/i;->LEFT_SWIPE:Lvn1/i;

    sget-object v2, Lvn1/i;->SCALE_OUT:Lvn1/i;

    filled-new-array {v0, v1, v2}, [Lvn1/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvn1/i;

    const-string v1, "FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvn1/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn1/i;->FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT:Lvn1/i;

    new-instance v0, Lvn1/i;

    const-string v1, "LEFT_SWIPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvn1/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn1/i;->LEFT_SWIPE:Lvn1/i;

    new-instance v0, Lvn1/i;

    const-string v1, "SCALE_OUT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvn1/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn1/i;->SCALE_OUT:Lvn1/i;

    invoke-static {}, Lvn1/i;->$values()[Lvn1/i;

    move-result-object v0

    sput-object v0, Lvn1/i;->$VALUES:[Lvn1/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lvn1/i;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lvn1/i;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvn1/i;
    .locals 1

    const-class v0, Lvn1/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvn1/i;

    return-object p0
.end method

.method public static values()[Lvn1/i;
    .locals 1

    sget-object v0, Lvn1/i;->$VALUES:[Lvn1/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvn1/i;

    return-object v0
.end method
