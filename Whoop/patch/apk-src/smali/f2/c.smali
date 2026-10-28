.class public final Lf2/c;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/w1;
.implements Lf2/b;
.implements La3/r;


# instance fields
.field public final O:Lf2/d;

.field public P:Z

.field public Q:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lf2/d;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lf2/c;->O:Lf2/d;

    iput-object p2, p0, Lf2/c;->Q:Lkotlin/jvm/functions/Function1;

    iput-object p0, p1, Lf2/d;->w:Lf2/b;

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 0

    invoke-virtual {p0}, Lf2/c;->X0()V

    return-void
.end method

.method public final O(La3/p0;)V
    .locals 3

    iget-boolean v0, p0, Lf2/c;->P:Z

    iget-object v1, p0, Lf2/c;->O:Lf2/d;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, v1, Lf2/d;->x:Lf2/g;

    new-instance v0, La3/m0;

    const/4 v2, 0x4

    invoke-direct {v0, v2, p0, v1}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    iget-object v0, v1, Lf2/d;->x:Lf2/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf2/c;->P:Z

    goto :goto_0

    :cond_0
    const-string p1, "DrawResult not defined, did you forget to call onDraw?"

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-object v0, v1, Lf2/d;->x:Lf2/g;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lf2/g;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final Q0()V
    .locals 0

    return-void
.end method

.method public final R0()V
    .locals 0

    invoke-virtual {p0}, Lf2/c;->X0()V

    return-void
.end method

.method public final X0()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf2/c;->P:Z

    iget-object v0, p0, Lf2/c;->O:Lf2/d;

    const/4 v1, 0x0

    iput-object v1, v0, Lf2/d;->x:Lf2/g;

    invoke-static {p0}, La3/g;->h(La3/r;)V

    return-void
.end method

.method public final c()V
    .locals 0

    invoke-virtual {p0}, Lf2/c;->X0()V

    return-void
.end method

.method public final c0()V
    .locals 0

    invoke-virtual {p0}, Lf2/c;->X0()V

    return-void
.end method

.method public final d()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {p0, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-wide v0, v0, Ly2/j1;->y:J

    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getDensity()Ly3/c;
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Y:Ly3/m;

    return-object v0
.end method

.method public final t()V
    .locals 0

    invoke-virtual {p0}, Lf2/c;->X0()V

    return-void
.end method
