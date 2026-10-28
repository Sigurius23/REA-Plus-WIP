.class public final enum Lrq0/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrq0/w;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lrq0/w;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SPLASH",
        "NAME",
        "BANNER",
        "LOGO",
        "SHARING",
        "community_release"
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

.field private static final synthetic $VALUES:[Lrq0/w;

.field public static final enum BANNER:Lrq0/w;

.field public static final enum LOGO:Lrq0/w;

.field public static final enum NAME:Lrq0/w;

.field public static final enum SHARING:Lrq0/w;

.field public static final enum SPLASH:Lrq0/w;


# direct methods
.method private static final synthetic $values()[Lrq0/w;
    .locals 5

    sget-object v0, Lrq0/w;->SPLASH:Lrq0/w;

    sget-object v1, Lrq0/w;->NAME:Lrq0/w;

    sget-object v2, Lrq0/w;->BANNER:Lrq0/w;

    sget-object v3, Lrq0/w;->LOGO:Lrq0/w;

    sget-object v4, Lrq0/w;->SHARING:Lrq0/w;

    filled-new-array {v0, v1, v2, v3, v4}, [Lrq0/w;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrq0/w;

    const-string v1, "SPLASH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrq0/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrq0/w;->SPLASH:Lrq0/w;

    new-instance v0, Lrq0/w;

    const-string v1, "NAME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrq0/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrq0/w;->NAME:Lrq0/w;

    new-instance v0, Lrq0/w;

    const-string v1, "BANNER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrq0/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrq0/w;->BANNER:Lrq0/w;

    new-instance v0, Lrq0/w;

    const-string v1, "LOGO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrq0/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrq0/w;->LOGO:Lrq0/w;

    new-instance v0, Lrq0/w;

    const-string v1, "SHARING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lrq0/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrq0/w;->SHARING:Lrq0/w;

    invoke-static {}, Lrq0/w;->$values()[Lrq0/w;

    move-result-object v0

    sput-object v0, Lrq0/w;->$VALUES:[Lrq0/w;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lrq0/w;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lrq0/w;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrq0/w;
    .locals 1

    const-class v0, Lrq0/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrq0/w;

    return-object p0
.end method

.method public static values()[Lrq0/w;
    .locals 1

    sget-object v0, Lrq0/w;->$VALUES:[Lrq0/w;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrq0/w;

    return-object v0
.end method
