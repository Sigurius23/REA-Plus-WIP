.class public final Lc0/p1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ly2/j1;

.field public final synthetic w:J

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ly2/t0;


# direct methods
.method public constructor <init>(Lc0/q1;JIILy2/t0;Ly2/j1;)V
    .locals 0

    iput-wide p2, p0, Lc0/p1;->w:J

    iput p4, p0, Lc0/p1;->x:I

    iput p5, p0, Lc0/p1;->y:I

    iput-object p6, p0, Lc0/p1;->z:Ly2/t0;

    iput-object p7, p0, Lc0/p1;->E:Ly2/j1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Ly2/i1;

    iget v0, p0, Lc0/p1;->x:I

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    iget v3, p0, Lc0/p1;->y:I

    int-to-long v3, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v0, v3

    iget-object v3, p0, Lc0/p1;->z:Ly2/t0;

    invoke-interface {v3}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    shr-long v7, v0, v2

    long-to-int v4, v7

    iget-wide v7, p0, Lc0/p1;->w:J

    shr-long v9, v7, v2

    long-to-int v9, v9

    sub-int/2addr v4, v9

    int-to-float v4, v4

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v4, v9

    and-long/2addr v0, v5

    long-to-int v0, v0

    and-long/2addr v7, v5

    long-to-int v1, v7

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float/2addr v0, v9

    sget-object v1, Ly3/m;->w:Ly3/m;

    const/high16 v7, -0x40800000    # -1.0f

    if-ne v3, v1, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    int-to-float v1, v1

    mul-float/2addr v1, v7

    :goto_0
    const/4 v3, 0x1

    int-to-float v3, v3

    add-float/2addr v1, v3

    mul-float/2addr v1, v4

    add-float/2addr v3, v7

    mul-float/2addr v3, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-long v3, v0

    shl-long v2, v3, v2

    int-to-long v0, v1

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    iget-object v2, p0, Lc0/p1;->E:Ly2/j1;

    invoke-static {p1, v2, v0, v1}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
