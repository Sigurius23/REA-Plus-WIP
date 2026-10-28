.class final Lvy0/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvy0/p;->g0(Ljava/lang/String;FILc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lp1/z0;

.field final synthetic x:F

.field final synthetic y:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic z:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/z0;FLc93/a;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/z0;",
            "F",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lvy0/p$a;->w:Lp1/z0;

    iput p2, p0, Lvy0/p$a;->x:F

    iput-object p3, p0, Lvy0/p$a;->y:Lc93/a;

    iput-object p4, p0, Lvy0/p$a;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/z0;Lu2/r;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvy0/p$a;->f(Lp1/z0;Lu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/z0;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvy0/p$a;->d(Lp1/z0;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FLc93/a;Lc93/a;Lp1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvy0/p$a;->e(FLc93/a;Lc93/a;Lp1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lp1/z0;Lh2/b;)Ll83/a0;
    .locals 0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lvy0/p;->k1(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(FLc93/a;Lc93/a;Lp1/z0;)Ll83/a0;
    .locals 1

    invoke-static {p3}, Lvy0/p;->j1(Lp1/z0;)F

    move-result v0

    cmpl-float v0, v0, p0

    if-lez v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lvy0/p;->j1(Lp1/z0;)F

    move-result p1

    neg-float p0, p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_1

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/z0;Lu2/r;F)Ll83/a0;
    .locals 1

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lu2/r;->a()V

    invoke-static {p0}, Lvy0/p;->j1(Lp1/z0;)F

    move-result p1

    add-float/2addr p1, p2

    invoke-static {p0, p1}, Lvy0/p;->k1(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lvy0/p$a;->w:Lp1/z0;

    new-instance v2, Lvy0/m;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lvy0/m;-><init>(Lp1/z0;I)V

    iget v1, p0, Lvy0/p$a;->x:F

    iget-object v3, p0, Lvy0/p$a;->y:Lc93/a;

    iget-object v4, p0, Lvy0/p$a;->z:Lc93/a;

    move-object v5, v3

    new-instance v3, Lvy0/n;

    invoke-direct {v3, v1, v5, v4, v0}, Lvy0/n;-><init>(FLc93/a;Lc93/a;Lp1/z0;)V

    new-instance v4, Lvy0/o;

    const/4 v1, 0x0

    invoke-direct {v4, v0, v1}, Lvy0/o;-><init>(Ljava/lang/Object;I)V

    const/4 v6, 0x4

    move-object v1, p1

    move-object v5, p2

    invoke-static/range {v1 .. v6}, Lh0/z0;->i(Lu2/v;Lvy0/m;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
