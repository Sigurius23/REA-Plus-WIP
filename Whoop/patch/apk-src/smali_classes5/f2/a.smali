.class public final Lf2/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(FFIZ)V
    .locals 0

    iput p1, p0, Lf2/a;->w:F

    iput p2, p0, Lf2/a;->x:F

    iput p3, p0, Lf2/a;->y:I

    iput-boolean p4, p0, Lf2/a;->z:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Li2/g0;

    check-cast p1, Li2/x0;

    iget-object v0, p1, Li2/x0;->S:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    iget v1, p0, Lf2/a;->w:F

    mul-float/2addr v0, v1

    iget-object v1, p1, Li2/x0;->S:Ly3/c;

    invoke-interface {v1}, Ly3/c;->getDensity()F

    move-result v1

    iget v2, p0, Lf2/a;->x:F

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_0

    new-instance v2, Li2/r;

    iget v3, p0, Lf2/a;->y:I

    invoke-direct {v2, v0, v1, v3}, Li2/r;-><init>(FFI)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1, v2}, Li2/x0;->g(Lal/a;)V

    sget-object v0, Li2/w0;->a:Li2/v0;

    invoke-virtual {p1, v0}, Li2/x0;->t(Li2/a1;)V

    iget-boolean v0, p0, Lf2/a;->z:Z

    invoke-virtual {p1, v0}, Li2/x0;->e(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
