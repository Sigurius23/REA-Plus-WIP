.class public final Lq0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/b0;


# instance fields
.field public final a:Lq0/y;

.field public final b:Lp0/y;

.field public final c:Lab/h0;


# direct methods
.method public constructor <init>(Lq0/y;Lq0/n;Lab/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/o;->a:Lq0/y;

    iput-object p2, p0, Lq0/o;->b:Lp0/y;

    iput-object p3, p0, Lq0/o;->c:Lab/h0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lq0/o;->c:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq0/o;->c:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->o(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq0/o;->b:Lp0/y;

    invoke-virtual {v0, p1}, Lp0/y;->n(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final d(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, -0x479b9c4d

    invoke-virtual {v4, p3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p1}, Lp1/q;->e(I)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p3, v0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p3, v0

    and-int/lit16 v0, p3, 0x93

    const/16 v1, 0x92

    if-eq v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    and-int/lit8 v1, p3, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lq0/o;->a:Lq0/y;

    iget-object v2, v0, Lq0/y;->C:Lp0/h0;

    new-instance v0, Ln0/h;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Ln0/h;-><init>(Lp0/b0;II)V

    const v1, 0x441527a7

    invoke-static {v1, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xc00

    shl-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int v5, v0, p3

    move v1, p1

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lp0/y;->d(Ljava/lang/Object;ILp0/h0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_4
    move v1, p1

    move-object v0, p2

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lof2/d;

    invoke-direct {p2, p0, v1, v0, p4}, Lof2/d;-><init>(Lq0/o;ILjava/lang/Object;I)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lq0/o;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lq0/o;

    iget-object p1, p1, Lq0/o;->b:Lp0/y;

    iget-object v0, p0, Lq0/o;->b:Lp0/y;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lq0/o;->b:Lp0/y;

    invoke-virtual {v0}, Lp0/y;->m()Lab/h0;

    move-result-object v0

    iget v0, v0, Lab/h0;->x:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lq0/o;->b:Lp0/y;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
