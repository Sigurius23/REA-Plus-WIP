.class public final enum Lmk2/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmk2/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lmk2/j;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "WORKOUT",
        "SLEEP",
        "NAP",
        "RECOVERY",
        "track-activity_release"
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

.field private static final synthetic $VALUES:[Lmk2/j;

.field public static final enum NAP:Lmk2/j;

.field public static final enum RECOVERY:Lmk2/j;

.field public static final enum SLEEP:Lmk2/j;

.field public static final enum WORKOUT:Lmk2/j;


# direct methods
.method private static final synthetic $values()[Lmk2/j;
    .locals 4

    sget-object v0, Lmk2/j;->WORKOUT:Lmk2/j;

    sget-object v1, Lmk2/j;->SLEEP:Lmk2/j;

    sget-object v2, Lmk2/j;->NAP:Lmk2/j;

    sget-object v3, Lmk2/j;->RECOVERY:Lmk2/j;

    filled-new-array {v0, v1, v2, v3}, [Lmk2/j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmk2/j;

    const-string v1, "WORKOUT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmk2/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmk2/j;->WORKOUT:Lmk2/j;

    new-instance v0, Lmk2/j;

    const-string v1, "SLEEP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmk2/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmk2/j;->SLEEP:Lmk2/j;

    new-instance v0, Lmk2/j;

    const-string v1, "NAP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmk2/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmk2/j;->NAP:Lmk2/j;

    new-instance v0, Lmk2/j;

    const-string v1, "RECOVERY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmk2/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmk2/j;->RECOVERY:Lmk2/j;

    invoke-static {}, Lmk2/j;->$values()[Lmk2/j;

    move-result-object v0

    sput-object v0, Lmk2/j;->$VALUES:[Lmk2/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmk2/j;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lmk2/j;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmk2/j;
    .locals 1

    const-class v0, Lmk2/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmk2/j;

    return-object p0
.end method

.method public static values()[Lmk2/j;
    .locals 1

    sget-object v0, Lmk2/j;->$VALUES:[Lmk2/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmk2/j;

    return-object v0
.end method
