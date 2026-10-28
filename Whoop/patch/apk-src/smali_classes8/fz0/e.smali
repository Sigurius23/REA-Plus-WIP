.class public final enum Lfz0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfz0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lfz0/e;",
        "",
        "Lt0/i;",
        "shape",
        "<init>",
        "(Ljava/lang/String;ILt0/i;)V",
        "Lt0/i;",
        "getShape",
        "()Lt0/i;",
        "Left",
        "Middle",
        "Right",
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

.field private static final synthetic $VALUES:[Lfz0/e;

.field public static final enum Left:Lfz0/e;

.field public static final enum Middle:Lfz0/e;

.field public static final enum Right:Lfz0/e;


# instance fields
.field private final shape:Lt0/i;


# direct methods
.method private static final synthetic $values()[Lfz0/e;
    .locals 3

    sget-object v0, Lfz0/e;->Left:Lfz0/e;

    sget-object v1, Lfz0/e;->Middle:Lfz0/e;

    sget-object v2, Lfz0/e;->Right:Lfz0/e;

    filled-new-array {v0, v1, v2}, [Lfz0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfz0/e;

    const/4 v1, 0x1

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v2, v4, v4, v2, v3}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v3

    const-string v5, "Left"

    const/4 v6, 0x0

    invoke-direct {v0, v5, v6, v3}, Lfz0/e;-><init>(Ljava/lang/String;ILt0/i;)V

    sput-object v0, Lfz0/e;->Left:Lfz0/e;

    new-instance v0, Lfz0/e;

    int-to-float v3, v6

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    const-string v5, "Middle"

    invoke-direct {v0, v5, v1, v3}, Lfz0/e;-><init>(Ljava/lang/String;ILt0/i;)V

    sput-object v0, Lfz0/e;->Middle:Lfz0/e;

    new-instance v0, Lfz0/e;

    const/16 v1, 0x9

    invoke-static {v4, v2, v2, v4, v1}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v1

    const-string v2, "Right"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lfz0/e;-><init>(Ljava/lang/String;ILt0/i;)V

    sput-object v0, Lfz0/e;->Right:Lfz0/e;

    invoke-static {}, Lfz0/e;->$values()[Lfz0/e;

    move-result-object v0

    sput-object v0, Lfz0/e;->$VALUES:[Lfz0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lfz0/e;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILt0/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt0/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lfz0/e;->shape:Lt0/i;

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

    sget-object v0, Lfz0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfz0/e;
    .locals 1

    const-class v0, Lfz0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfz0/e;

    return-object p0
.end method

.method public static values()[Lfz0/e;
    .locals 1

    sget-object v0, Lfz0/e;->$VALUES:[Lfz0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfz0/e;

    return-object v0
.end method


# virtual methods
.method public final getShape()Lt0/i;
    .locals 1

    iget-object v0, p0, Lfz0/e;->shape:Lt0/i;

    return-object v0
.end method
