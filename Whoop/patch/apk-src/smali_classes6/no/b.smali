.class public final Lno/b;
.super Lrm/d;
.source "SourceFile"


# instance fields
.field public final M:Lum/c;

.field public final N:Led3/a;

.field public O:J

.field public P:Lno/a;

.field public Q:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lrm/d;-><init>(I)V

    new-instance v0, Lum/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lum/c;-><init>(I)V

    iput-object v0, p0, Lno/b;->M:Lum/c;

    new-instance v0, Led3/a;

    invoke-direct {v0}, Led3/a;-><init>()V

    iput-object v0, p0, Lno/b;->N:Led3/a;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    check-cast p2, Lno/a;

    iput-object p2, p0, Lno/b;->P:Lno/a;

    :cond_0
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public final j()Z
    .locals 1

    invoke-virtual {p0}, Lrm/d;->i()Z

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()V
    .locals 1

    iget-object v0, p0, Lno/b;->P:Lno/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lno/a;->c()V

    :cond_0
    return-void
.end method

.method public final n(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lno/b;->Q:J

    iget-object p1, p0, Lno/b;->P:Lno/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lno/a;->c()V

    :cond_0
    return-void
.end method

.method public final r([Lrm/c0;JJ)V
    .locals 0

    iput-wide p4, p0, Lno/b;->O:J

    return-void
.end method

.method public final t(JJ)V
    .locals 4

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lrm/d;->i()Z

    move-result p3

    if-nez p3, :cond_6

    iget-wide p3, p0, Lno/b;->Q:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long p3, p3, v0

    if-gez p3, :cond_6

    iget-object p3, p0, Lno/b;->M:Lum/c;

    invoke-virtual {p3}, Lum/c;->o()V

    iget-object p4, p0, Lrm/d;->x:Lxl/a;

    invoke-virtual {p4}, Lxl/a;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, p4, p3, v0}, Lrm/d;->s(Lxl/a;Lum/c;I)I

    move-result p4

    const/4 v1, -0x4

    if-ne p4, v1, :cond_6

    const/4 p4, 0x4

    invoke-virtual {p3, p4}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    :cond_1
    iget-wide v1, p3, Lum/c;->F:J

    iput-wide v1, p0, Lno/b;->Q:J

    iget-object v1, p0, Lno/b;->P:Lno/a;

    if-eqz v1, :cond_0

    const/high16 v1, -0x80000000

    invoke-virtual {p3, v1}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lum/c;->r()V

    iget-object p3, p3, Lum/c;->z:Ljava/nio/ByteBuffer;

    sget v1, Llo/y;->a:I

    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/16 v2, 0x10

    if-eq v1, v2, :cond_3

    const/4 p3, 0x0

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result v2

    iget-object v3, p0, Lno/b;->N:Led3/a;

    invoke-virtual {v3, v2, v1}, Led3/a;->I(I[B)V

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p3

    add-int/2addr p3, p4

    invoke-virtual {v3, p3}, Led3/a;->K(I)V

    const/4 p3, 0x3

    new-array p4, p3, [F

    :goto_1
    if-ge v0, p3, :cond_4

    invoke-virtual {v3}, Led3/a;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    aput v1, p4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    move-object p3, p4

    :goto_2
    if-nez p3, :cond_5

    goto :goto_0

    :cond_5
    iget-object p4, p0, Lno/b;->P:Lno/a;

    iget-wide v0, p0, Lno/b;->Q:J

    iget-wide v2, p0, Lno/b;->O:J

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Lno/a;->b(J[F)V

    goto/16 :goto_0

    :cond_6
    :goto_3
    return-void
.end method

.method public final x(Lrm/c0;)I
    .locals 1

    const-string v0, "application/x-camera-motion"

    iget-object p1, p1, Lrm/c0;->L:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    invoke-static {p1, v0, v0}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_0
    invoke-static {v0, v0, v0}, Lrm/d;->d(III)I

    move-result p1

    return p1
.end method
