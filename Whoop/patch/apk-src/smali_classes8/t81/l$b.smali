.class final Lt81/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt81/l;->q(Lt81/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Lt81/r;

.field final synthetic x:Lf0/r1;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt81/r;",
            "Lf0/r1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/z0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lt81/l$b;->w:Lt81/r;

    iput-object p2, p0, Lt81/l$b;->x:Lf0/r1;

    iput-object p3, p0, Lt81/l$b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lt81/l$b;->z:Lp1/z0;

    iput-object p5, p0, Lt81/l$b;->E:Lp1/c1;

    iput-object p6, p0, Lt81/l$b;->F:Lp1/c1;

    iput-object p7, p0, Lt81/l$b;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;FZ)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lt81/l$b;->b(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;FZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;FZ)Ll83/a0;
    .locals 11

    invoke-static {p3}, Lt81/l;->V(Lp1/z0;)F

    move-result v0

    mul-float v0, v0, p8

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Lt81/r;->l()Lt81/s;

    move-result-object v1

    invoke-virtual {v1}, Lt81/s;->b()F

    move-result v1

    invoke-virtual {p0}, Lt81/r;->l()Lt81/s;

    move-result-object v2

    invoke-virtual {v2}, Lt81/s;->a()F

    move-result v2

    new-instance v3, Li93/e;

    invoke-direct {v3, v1, v2}, Li93/e;-><init>(FF)V

    invoke-static {v0, v3}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v1, Lu81/d;

    invoke-static {p3}, Lt81/l;->V(Lp1/z0;)F

    move-result v2

    invoke-direct {v1, v2, v0}, Lu81/d;-><init>(FF)V

    invoke-static {p4, v1}, Lt81/l;->Z(Lp1/c1;Lu81/d;)V

    invoke-virtual {p0}, Lt81/r;->i()Lh71/k;

    move-result-object p0

    invoke-virtual {p0}, Lh71/k;->g()Lg61/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lg61/b;->h()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    :goto_0
    iget-object v1, p1, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v8

    sget-object v3, Lt81/a;->a:Lt81/a;

    move-object/from16 v1, p7

    iget-wide v4, v1, Lh2/b;->a:J

    invoke-static {p3}, Lt81/l;->V(Lp1/z0;)F

    move-result v6

    invoke-static {p4}, Lt81/l;->Y(Lp1/c1;)Lu81/d;

    move-result-object v1

    invoke-virtual {v1}, Lu81/d;->a()F

    move-result v7

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    invoke-virtual/range {v3 .. v10}, Lt81/a;->a(JFFID)I

    move-result p0

    new-instance v1, Lu81/b;

    invoke-direct {v1, v8, p0}, Lu81/b;-><init>(II)V

    move-object/from16 p0, p5

    invoke-static {p0, v1}, Lt81/l;->b0(Lp1/c1;Lu81/b;)V

    const/4 v1, 0x0

    move-object/from16 v3, p6

    invoke-static {v3, v1}, Lt81/l;->U(Lp1/c1;Z)V

    invoke-static {p3}, Lt81/l;->V(Lp1/z0;)F

    move-result v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-static {p0}, Lt81/l;->a0(Lp1/c1;)Lu81/b;

    move-result-object v0

    invoke-virtual {v0}, Lu81/b;->a()I

    move-result v0

    invoke-static {p0}, Lt81/l;->a0(Lp1/c1;)Lu81/b;

    move-result-object p0

    invoke-virtual {p0}, Lu81/b;->b()I

    move-result p0

    sub-int/2addr v0, p0

    int-to-float p0, v0

    invoke-virtual {p1, p0}, Lf0/r1;->e(F)F

    invoke-static {p4}, Lt81/l;->Y(Lp1/c1;)Lu81/d;

    move-result-object p0

    invoke-virtual {p0}, Lu81/d;->a()F

    move-result p0

    invoke-static {p3, p0}, Lt81/l;->X(Lp1/z0;F)V

    new-instance p0, Lt81/f$b;

    invoke-static {p3}, Lt81/l;->V(Lp1/z0;)F

    move-result p1

    move/from16 v0, p9

    invoke-direct {p0, p1, v1, v0}, Lt81/f$b;-><init>(FZZ)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    iget-object v1, p0, Lt81/l$b;->w:Lt81/r;

    iget-object v2, p0, Lt81/l$b;->x:Lf0/r1;

    iget-object v3, p0, Lt81/l$b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lt81/l$b;->z:Lp1/z0;

    iget-object v5, p0, Lt81/l$b;->E:Lp1/c1;

    iget-object v6, p0, Lt81/l$b;->F:Lp1/c1;

    iget-object v7, p0, Lt81/l$b;->G:Lp1/c1;

    new-instance v0, Lt81/m;

    invoke-direct/range {v0 .. v7}, Lt81/m;-><init>(Lt81/r;Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;)V

    invoke-static {p1, v0, p2}, Lt81/d;->a(Lu2/v;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
