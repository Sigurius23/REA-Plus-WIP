.class public final enum Lc31/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc31/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lc31/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ENABLE",
        "DISABLE",
        "SHOW",
        "HIDE",
        "DISMISS_ERROR",
        "design_release"
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

.field private static final synthetic $VALUES:[Lc31/e;

.field public static final enum DISABLE:Lc31/e;

.field public static final enum DISMISS_ERROR:Lc31/e;

.field public static final enum ENABLE:Lc31/e;

.field public static final enum HIDE:Lc31/e;

.field public static final enum SHOW:Lc31/e;


# direct methods
.method private static final synthetic $values()[Lc31/e;
    .locals 5

    sget-object v0, Lc31/e;->ENABLE:Lc31/e;

    sget-object v1, Lc31/e;->DISABLE:Lc31/e;

    sget-object v2, Lc31/e;->SHOW:Lc31/e;

    sget-object v3, Lc31/e;->HIDE:Lc31/e;

    sget-object v4, Lc31/e;->DISMISS_ERROR:Lc31/e;

    filled-new-array {v0, v1, v2, v3, v4}, [Lc31/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc31/e;

    const-string v1, "ENABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc31/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/e;->ENABLE:Lc31/e;

    new-instance v0, Lc31/e;

    const-string v1, "DISABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc31/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/e;->DISABLE:Lc31/e;

    new-instance v0, Lc31/e;

    const-string v1, "SHOW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc31/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/e;->SHOW:Lc31/e;

    new-instance v0, Lc31/e;

    const-string v1, "HIDE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc31/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/e;->HIDE:Lc31/e;

    new-instance v0, Lc31/e;

    const-string v1, "DISMISS_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lc31/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc31/e;->DISMISS_ERROR:Lc31/e;

    invoke-static {}, Lc31/e;->$values()[Lc31/e;

    move-result-object v0

    sput-object v0, Lc31/e;->$VALUES:[Lc31/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lc31/e;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lc31/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc31/e;
    .locals 1

    const-class v0, Lc31/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc31/e;

    return-object p0
.end method

.method public static values()[Lc31/e;
    .locals 1

    sget-object v0, Lc31/e;->$VALUES:[Lc31/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc31/e;

    return-object v0
.end method
