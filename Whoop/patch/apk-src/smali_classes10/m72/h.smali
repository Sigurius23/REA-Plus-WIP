.class public final enum Lm72/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm72/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0008\u0002\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm72/h;",
        "",
        "Lkotlin/Function0;",
        "Lb91/a;",
        "getStyle",
        "<init>",
        "(Ljava/lang/String;ILc93/m;)V",
        "Lc93/m;",
        "getGetStyle",
        "()Lc93/m;",
        "LARGE",
        "SMALL",
        "sage_release"
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

.field private static final synthetic $VALUES:[Lm72/h;

.field public static final enum LARGE:Lm72/h;

.field public static final enum SMALL:Lm72/h;


# instance fields
.field private final getStyle:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lm72/h;
    .locals 2

    sget-object v0, Lm72/h;->LARGE:Lm72/h;

    sget-object v1, Lm72/h;->SMALL:Lm72/h;

    filled-new-array {v0, v1}, [Lm72/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lm72/h;

    new-instance v1, Lm22/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lm22/b;-><init>(I)V

    const-string v2, "LARGE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lm72/h;-><init>(Ljava/lang/String;ILc93/m;)V

    sput-object v0, Lm72/h;->LARGE:Lm72/h;

    new-instance v0, Lm72/h;

    new-instance v1, Lm22/b;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lm22/b;-><init>(I)V

    const-string v2, "SMALL"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lm72/h;-><init>(Ljava/lang/String;ILc93/m;)V

    sput-object v0, Lm72/h;->SMALL:Lm72/h;

    invoke-static {}, Lm72/h;->$values()[Lm72/h;

    move-result-object v0

    sput-object v0, Lm72/h;->$VALUES:[Lm72/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lm72/h;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILc93/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lm72/h;->getStyle:Lc93/m;

    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 1

    check-cast p0, Lp1/q;

    const p1, -0x200083ae

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p1, p0, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->P()Lb91/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method private static final _init_$lambda$1(Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 1

    check-cast p0, Lp1/q;

    const p1, 0x4483e11e

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p1, p0, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->L()Lb91/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 0

    invoke-static {p0, p1}, Lm72/h;->_init_$lambda$1(Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 0

    invoke-static {p0, p1}, Lm72/h;->_init_$lambda$0(Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lm72/h;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm72/h;
    .locals 1

    const-class v0, Lm72/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm72/h;

    return-object p0
.end method

.method public static values()[Lm72/h;
    .locals 1

    sget-object v0, Lm72/h;->$VALUES:[Lm72/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm72/h;

    return-object v0
.end method


# virtual methods
.method public final getGetStyle()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    iget-object v0, p0, Lm72/h;->getStyle:Lc93/m;

    return-object v0
.end method
