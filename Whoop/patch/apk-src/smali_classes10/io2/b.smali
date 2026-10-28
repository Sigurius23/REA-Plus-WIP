.class public final enum Lio2/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio2/b;",
        "",
        "Ly81/e;",
        "textColor",
        "<init>",
        "(Ljava/lang/String;ILy81/e;)V",
        "Ly81/e;",
        "getTextColor",
        "()Ly81/e;",
        "REGULAR",
        "HIGHLIGHT_GREEN",
        "universal-checkout_release"
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

.field private static final synthetic $VALUES:[Lio2/b;

.field public static final enum HIGHLIGHT_GREEN:Lio2/b;

.field public static final enum REGULAR:Lio2/b;


# instance fields
.field private final textColor:Ly81/e;


# direct methods
.method private static final synthetic $values()[Lio2/b;
    .locals 2

    sget-object v0, Lio2/b;->REGULAR:Lio2/b;

    sget-object v1, Lio2/b;->HIGHLIGHT_GREEN:Lio2/b;

    filled-new-array {v0, v1}, [Lio2/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio2/b;

    sget-object v1, Lio2/b$a;->w:Lio2/b$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const-string v2, "REGULAR"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio2/b;-><init>(Ljava/lang/String;ILy81/e;)V

    sput-object v0, Lio2/b;->REGULAR:Lio2/b;

    new-instance v0, Lio2/b;

    sget-object v1, Lio2/b$b;->w:Lio2/b$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const-string v2, "HIGHLIGHT_GREEN"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lio2/b;-><init>(Ljava/lang/String;ILy81/e;)V

    sput-object v0, Lio2/b;->HIGHLIGHT_GREEN:Lio2/b;

    invoke-static {}, Lio2/b;->$values()[Lio2/b;

    move-result-object v0

    sput-object v0, Lio2/b;->$VALUES:[Lio2/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio2/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio2/b;->textColor:Ly81/e;

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

    sget-object v0, Lio2/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio2/b;
    .locals 1

    const-class v0, Lio2/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio2/b;

    return-object p0
.end method

.method public static values()[Lio2/b;
    .locals 1

    sget-object v0, Lio2/b;->$VALUES:[Lio2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio2/b;

    return-object v0
.end method


# virtual methods
.method public final getTextColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Lio2/b;->textColor:Ly81/e;

    return-object v0
.end method
