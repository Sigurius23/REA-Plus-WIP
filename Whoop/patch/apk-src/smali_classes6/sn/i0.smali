.class public final Lsn/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/r0;


# instance fields
.field public final w:I

.field public final synthetic x:Lsn/k0;


# direct methods
.method public constructor <init>(Lsn/k0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/i0;->x:Lsn/k0;

    iput p2, p0, Lsn/i0;->w:I

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 3

    iget-object v0, p0, Lsn/i0;->x:Lsn/k0;

    invoke-virtual {v0}, Lsn/k0;->E()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lsn/k0;->R:[Lsn/q0;

    iget v2, p0, Lsn/i0;->w:I

    aget-object v1, v1, v2

    iget-boolean v0, v0, Lsn/k0;->j0:Z

    invoke-virtual {v1, v0}, Lsn/q0;->p(Z)Z

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

    iget v0, p0, Lsn/i0;->w:I

    iget-object v1, p0, Lsn/i0;->x:Lsn/k0;

    iget-object v2, v1, Lsn/k0;->R:[Lsn/q0;

    aget-object v0, v2, v0

    iget-object v2, v0, Lsn/q0;->h:Lty/c;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lty/c;->r()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lsn/q0;->h:Lty/c;

    invoke-virtual {v0}, Lty/c;->n()Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v1, Lsn/k0;->J:Lko/c0;

    iget-object v2, v1, Lsn/k0;->z:Lg73/d;

    iget v1, v1, Lsn/k0;->a0:I

    invoke-virtual {v2, v1}, Lg73/d;->h(I)I

    move-result v1

    iget-object v2, v0, Lko/c0;->c:Ljava/io/IOException;

    if-nez v2, :cond_5

    iget-object v0, v0, Lko/c0;->b:Lko/z;

    if-eqz v0, :cond_4

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_2

    iget v1, v0, Lko/z;->w:I

    :cond_2
    iget-object v2, v0, Lko/z;->z:Ljava/io/IOException;

    if-eqz v2, :cond_4

    iget v0, v0, Lko/z;->E:I

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

.method public final e(Lxl/a;Lum/c;I)I
    .locals 5

    iget-object v0, p0, Lsn/i0;->x:Lsn/k0;

    invoke-virtual {v0}, Lsn/k0;->E()Z

    move-result v1

    const/4 v2, -0x3

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget v1, p0, Lsn/i0;->w:I

    invoke-virtual {v0, v1}, Lsn/k0;->A(I)V

    iget-object v3, v0, Lsn/k0;->R:[Lsn/q0;

    aget-object v3, v3, v1

    iget-boolean v4, v0, Lsn/k0;->j0:Z

    invoke-virtual {v3, p1, p2, p3, v4}, Lsn/q0;->t(Lxl/a;Lum/c;IZ)I

    move-result p1

    if-ne p1, v2, :cond_1

    invoke-virtual {v0, v1}, Lsn/k0;->B(I)V

    :cond_1
    return p1
.end method

.method public final j(J)I
    .locals 4

    iget-object v0, p0, Lsn/i0;->x:Lsn/k0;

    invoke-virtual {v0}, Lsn/k0;->E()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v1, p0, Lsn/i0;->w:I

    invoke-virtual {v0, v1}, Lsn/k0;->A(I)V

    iget-object v2, v0, Lsn/k0;->R:[Lsn/q0;

    aget-object v2, v2, v1

    iget-boolean v3, v0, Lsn/k0;->j0:Z

    invoke-virtual {v2, p1, p2, v3}, Lsn/q0;->n(JZ)I

    move-result p1

    invoke-virtual {v2, p1}, Lsn/q0;->w(I)V

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Lsn/k0;->B(I)V

    :cond_1
    return p1
.end method
