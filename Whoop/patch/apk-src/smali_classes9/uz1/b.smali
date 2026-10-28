.class public final enum Luz1/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Luz1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0008\u001a\u0004\u0008\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\u000c\u0010\nj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Luz1/b;",
        "",
        "Ly81/e;",
        "shoppingCartIconColor",
        "badgeTextColor",
        "badgeBackgroundColor",
        "<init>",
        "(Ljava/lang/String;ILy81/e;Ly81/e;Ly81/e;)V",
        "Ly81/e;",
        "getShoppingCartIconColor",
        "()Ly81/e;",
        "getBadgeTextColor",
        "getBadgeBackgroundColor",
        "LIGHT",
        "DARK",
        "native-store_release"
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

.field private static final synthetic $VALUES:[Luz1/b;

.field public static final enum DARK:Luz1/b;

.field public static final enum LIGHT:Luz1/b;


# instance fields
.field private final badgeBackgroundColor:Ly81/e;

.field private final badgeTextColor:Ly81/e;

.field private final shoppingCartIconColor:Ly81/e;


# direct methods
.method private static final synthetic $values()[Luz1/b;
    .locals 2

    sget-object v0, Luz1/b;->LIGHT:Luz1/b;

    sget-object v1, Luz1/b;->DARK:Luz1/b;

    filled-new-array {v0, v1}, [Luz1/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Luz1/b;

    sget-object v1, Luz1/b$a;->w:Luz1/b$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    sget-object v1, Luz1/b$b;->w:Luz1/b$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    sget-object v1, Luz1/b$c;->w:Luz1/b$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const-string v1, "LIGHT"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Luz1/b;-><init>(Ljava/lang/String;ILy81/e;Ly81/e;Ly81/e;)V

    sput-object v0, Luz1/b;->LIGHT:Luz1/b;

    new-instance v1, Luz1/b;

    sget-object v0, Luz1/b$d;->w:Luz1/b$d;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    sget-object v0, Luz1/b$e;->w:Luz1/b$e;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    sget-object v0, Luz1/b$f;->w:Luz1/b$f;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const-string v2, "DARK"

    const/4 v3, 0x1

    invoke-direct/range {v1 .. v6}, Luz1/b;-><init>(Ljava/lang/String;ILy81/e;Ly81/e;Ly81/e;)V

    sput-object v1, Luz1/b;->DARK:Luz1/b;

    invoke-static {}, Luz1/b;->$values()[Luz1/b;

    move-result-object v0

    sput-object v0, Luz1/b;->$VALUES:[Luz1/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Luz1/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/e;Ly81/e;Ly81/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/e;",
            "Ly81/e;",
            "Ly81/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Luz1/b;->shoppingCartIconColor:Ly81/e;

    iput-object p4, p0, Luz1/b;->badgeTextColor:Ly81/e;

    iput-object p5, p0, Luz1/b;->badgeBackgroundColor:Ly81/e;

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

    sget-object v0, Luz1/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Luz1/b;
    .locals 1

    const-class v0, Luz1/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Luz1/b;

    return-object p0
.end method

.method public static values()[Luz1/b;
    .locals 1

    sget-object v0, Luz1/b;->$VALUES:[Luz1/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Luz1/b;

    return-object v0
.end method


# virtual methods
.method public final getBadgeBackgroundColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Luz1/b;->badgeBackgroundColor:Ly81/e;

    return-object v0
.end method

.method public final getBadgeTextColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Luz1/b;->badgeTextColor:Ly81/e;

    return-object v0
.end method

.method public final getShoppingCartIconColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Luz1/b;->shoppingCartIconColor:Ly81/e;

    return-object v0
.end method
