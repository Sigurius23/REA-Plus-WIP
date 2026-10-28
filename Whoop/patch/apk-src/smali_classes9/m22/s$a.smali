.class final Lm22/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm22/s;->l(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic E:Lp1/z0;

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic w:Lbc3/c0;

.field final synthetic x:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic y:F

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Ld0/e;",
            "F",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lm22/s$a;->w:Lbc3/c0;

    iput-object p2, p0, Lm22/s$a;->x:Ld0/e;

    iput p3, p0, Lm22/s$a;->y:F

    iput-object p4, p0, Lm22/s$a;->z:Lp1/z0;

    iput-object p5, p0, Lm22/s$a;->E:Lp1/z0;

    iput-object p6, p0, Lm22/s$a;->F:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(FLd0/e;Lbc3/c0;Lc93/a;Lp1/z0;Lp1/z0;Lu2/r;F)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lm22/s$a;->d(FLd0/e;Lbc3/c0;Lc93/a;Lp1/z0;Lp1/z0;Lu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm22/s$a;->c(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;)Ll83/a0;
    .locals 6

    new-instance v0, Lm22/s$a$a;

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lm22/s$a$a;-><init>(Ld0/e;FLp1/z0;Lp1/z0;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(FLd0/e;Lbc3/c0;Lc93/a;Lp1/z0;Lp1/z0;Lu2/r;F)Ll83/a0;
    .locals 1

    const-string v0, "change"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p6}, Lu2/r;->a()V

    invoke-static {p4}, Lm22/s;->D(Lp1/z0;)F

    move-result p4

    sub-float/2addr p4, p0

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    add-float/2addr p0, p7

    const/4 p6, 0x0

    invoke-static {p0, p6, p4}, Le93/b;->m(FFF)F

    move-result p0

    new-instance p6, Lm22/s$a$b;

    const/4 p7, 0x0

    invoke-direct {p6, p1, p0, p7}, Lm22/s$a$b;-><init>(Ld0/e;FLq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, p7, p7, p6, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    div-float/2addr p0, p4

    const/high16 p1, 0x42c80000    # 100.0f

    mul-float/2addr p0, p1

    invoke-static {p5, p0}, Lm22/s;->C(Lp1/z0;F)V

    invoke-static {p5}, Lm22/s;->B(Lp1/z0;)F

    move-result p0

    const/high16 p1, 0x42b40000    # 90.0f

    cmpl-float p0, p0, p1

    if-lez p0, :cond_0

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    iget-object v1, p0, Lm22/s$a;->w:Lbc3/c0;

    iget-object v2, p0, Lm22/s$a;->x:Ld0/e;

    iget v3, p0, Lm22/s$a;->y:F

    iget-object v4, p0, Lm22/s$a;->z:Lp1/z0;

    iget-object v5, p0, Lm22/s$a;->E:Lp1/z0;

    new-instance v0, Lm22/p;

    invoke-direct/range {v0 .. v5}, Lm22/p;-><init>(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;)V

    move-object v8, v0

    iget-object v6, p0, Lm22/s$a;->F:Lc93/a;

    new-instance v0, Lm22/q;

    invoke-direct/range {v0 .. v6}, Lm22/q;-><init>(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;Lc93/a;)V

    const/4 v11, 0x5

    const/4 v7, 0x0

    move-object v6, p1

    move-object v10, p2

    move-object v9, v0

    invoke-static/range {v6 .. v11}, Lh0/z0;->i(Lu2/v;Lvy0/m;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
