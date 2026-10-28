.class public final enum Lpx2/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpx2/d$g;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpx2/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpx2/d;",
        "",
        "Ly81/e;",
        "iconColor",
        "iconBackgroundColor",
        "<init>",
        "(Ljava/lang/String;ILy81/e;Ly81/e;)V",
        "Ly81/e;",
        "getIconColor",
        "()Ly81/e;",
        "getIconBackgroundColor",
        "Companion",
        "g",
        "NEUTRAL",
        "POSITIVE",
        "NEGATIVE",
        "whooplabs_release"
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

.field private static final synthetic $VALUES:[Lpx2/d;

.field public static final Companion:Lpx2/d$g;

.field public static final enum NEGATIVE:Lpx2/d;

.field public static final enum NEUTRAL:Lpx2/d;

.field public static final enum POSITIVE:Lpx2/d;


# instance fields
.field private final iconBackgroundColor:Ly81/e;

.field private final iconColor:Ly81/e;


# direct methods
.method private static final synthetic $values()[Lpx2/d;
    .locals 3

    sget-object v0, Lpx2/d;->NEUTRAL:Lpx2/d;

    sget-object v1, Lpx2/d;->POSITIVE:Lpx2/d;

    sget-object v2, Lpx2/d;->NEGATIVE:Lpx2/d;

    filled-new-array {v0, v1, v2}, [Lpx2/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lpx2/d;

    sget-object v1, Lpx2/d$a;->w:Lpx2/d$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    sget-object v2, Lpx2/d$b;->w:Lpx2/d$b;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    const-string v3, "NEUTRAL"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lpx2/d;-><init>(Ljava/lang/String;ILy81/e;Ly81/e;)V

    sput-object v0, Lpx2/d;->NEUTRAL:Lpx2/d;

    new-instance v0, Lpx2/d;

    sget-object v1, Lpx2/d$c;->w:Lpx2/d$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    sget-object v2, Lpx2/d$d;->w:Lpx2/d$d;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    const-string v3, "POSITIVE"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lpx2/d;-><init>(Ljava/lang/String;ILy81/e;Ly81/e;)V

    sput-object v0, Lpx2/d;->POSITIVE:Lpx2/d;

    new-instance v0, Lpx2/d;

    sget-object v1, Lpx2/d$e;->w:Lpx2/d$e;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    sget-object v2, Lpx2/d$f;->w:Lpx2/d$f;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    const-string v3, "NEGATIVE"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lpx2/d;-><init>(Ljava/lang/String;ILy81/e;Ly81/e;)V

    sput-object v0, Lpx2/d;->NEGATIVE:Lpx2/d;

    invoke-static {}, Lpx2/d;->$values()[Lpx2/d;

    move-result-object v0

    sput-object v0, Lpx2/d;->$VALUES:[Lpx2/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lpx2/d;->$ENTRIES:Lt83/a;

    new-instance v0, Lpx2/d$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpx2/d$g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpx2/d;->Companion:Lpx2/d$g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/e;Ly81/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/e;",
            "Ly81/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lpx2/d;->iconColor:Ly81/e;

    iput-object p4, p0, Lpx2/d;->iconBackgroundColor:Ly81/e;

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

    sget-object v0, Lpx2/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpx2/d;
    .locals 1

    const-class v0, Lpx2/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpx2/d;

    return-object p0
.end method

.method public static values()[Lpx2/d;
    .locals 1

    sget-object v0, Lpx2/d;->$VALUES:[Lpx2/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpx2/d;

    return-object v0
.end method


# virtual methods
.method public final getIconBackgroundColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Lpx2/d;->iconBackgroundColor:Ly81/e;

    return-object v0
.end method

.method public final getIconColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Lpx2/d;->iconColor:Ly81/e;

    return-object v0
.end method
