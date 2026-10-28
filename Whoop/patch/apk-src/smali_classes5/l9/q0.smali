.class public final Ll9/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z0;


# instance fields
.field public final w:I

.field public final synthetic x:Ll9/s0;


# direct methods
.method public constructor <init>(Ll9/s0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/q0;->x:Ll9/s0;

    iput p2, p0, Ll9/q0;->w:I

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 3

    iget-object v0, p0, Ll9/q0;->x:Ll9/s0;

    invoke-virtual {v0}, Ll9/s0;->F()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Ll9/s0;->T:[Ll9/y0;

    iget v2, p0, Ll9/q0;->w:I

    aget-object v1, v1, v2

    iget-boolean v0, v0, Ll9/s0;->n0:Z

    invoke-virtual {v1, v0}, Ll9/y0;->o(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 4

    iget v0, p0, Ll9/q0;->w:I

    iget-object v1, p0, Ll9/q0;->x:Ll9/s0;

    iget-object v2, v1, Ll9/s0;->T:[Ll9/y0;

    aget-object v0, v2, v0

    iget-object v2, v0, Ll9/y0;->h:Le10/k0;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Le10/k0;->G()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ll9/y0;->h:Le10/k0;

    invoke-virtual {v0}, Le10/k0;->C()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v1, Ll9/s0;->L:Lp9/k;

    iget-object v2, v1, Ll9/s0;->z:Ljc/b;

    iget v1, v1, Ll9/s0;->d0:I

    invoke-virtual {v2, v1}, Ljc/b;->q(I)I

    move-result v1

    iget-object v2, v0, Lp9/k;->y:Ljava/io/IOException;

    if-nez v2, :cond_5

    iget-object v0, v0, Lp9/k;->x:Lp9/h;

    if-eqz v0, :cond_4

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_2

    iget v1, v0, Lp9/h;->w:I

    :cond_2
    iget-object v2, v0, Lp9/h;->E:Ljava/io/IOException;

    if-eqz v2, :cond_4

    iget v0, v0, Lp9/h;->F:I

    if-gt v0, v1, :cond_3

    goto :goto_1

    :cond_3
    throw v2

    :cond_4
    :goto_1
    return-void

    :cond_5
    throw v2
.end method

.method public final j(J)I
    .locals 4

    iget-object v0, p0, Ll9/q0;->x:Ll9/s0;

    invoke-virtual {v0}, Ll9/s0;->F()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v1, p0, Ll9/q0;->w:I

    invoke-virtual {v0, v1}, Ll9/s0;->A(I)V

    iget-object v2, v0, Ll9/s0;->T:[Ll9/y0;

    aget-object v2, v2, v1

    iget-boolean v3, v0, Ll9/s0;->n0:Z

    invoke-virtual {v2, p1, p2, v3}, Ll9/y0;->n(JZ)I

    move-result p1

    invoke-virtual {v2, p1}, Ll9/y0;->v(I)V

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Ll9/s0;->B(I)V

    :cond_1
    return p1
.end method

.method public final l(Lqg3/d;La9/e;I)I
    .locals 5

    iget-object v0, p0, Ll9/q0;->x:Ll9/s0;

    invoke-virtual {v0}, Ll9/s0;->F()Z

    move-result v1

    const/4 v2, -0x3

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget v1, p0, Ll9/q0;->w:I

    invoke-virtual {v0, v1}, Ll9/s0;->A(I)V

    iget-object v3, v0, Ll9/s0;->T:[Ll9/y0;

    aget-object v3, v3, v1

    iget-boolean v4, v0, Ll9/s0;->n0:Z

    invoke-virtual {v3, p1, p2, p3, v4}, Ll9/y0;->r(Lqg3/d;La9/e;IZ)I

    move-result p1

    if-ne p1, v2, :cond_1

    invoke-virtual {v0, v1}, Ll9/s0;->B(I)V

    :cond_1
    return p1
.end method
