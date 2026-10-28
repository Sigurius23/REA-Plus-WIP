.class public final Lud3/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final E:Lud3/c0;

.field public final F:Lud3/d0;

.field public final G:Lud3/a1;

.field public final H:Lne3/o0;

.field public final I:Lud3/x0;

.field public final J:Lud3/x0;

.field public final K:Lud3/x0;

.field public final L:J

.field public final M:J

.field public final N:Lzd3/g;

.field public final O:Lud3/d1;

.field public P:Lud3/h;

.field public final Q:Z

.field public final w:Lud3/o0;

.field public final x:Lud3/m0;

.field public final y:Ljava/lang/String;

.field public final z:I


# direct methods
.method public constructor <init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V
    .locals 2

    move-object/from16 v0, p17

    const-string v1, "request"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "protocol"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "message"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "trailersSource"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/x0;->w:Lud3/o0;

    iput-object p2, p0, Lud3/x0;->x:Lud3/m0;

    iput-object p3, p0, Lud3/x0;->y:Ljava/lang/String;

    iput p4, p0, Lud3/x0;->z:I

    iput-object p5, p0, Lud3/x0;->E:Lud3/c0;

    iput-object p6, p0, Lud3/x0;->F:Lud3/d0;

    iput-object p7, p0, Lud3/x0;->G:Lud3/a1;

    iput-object p8, p0, Lud3/x0;->H:Lne3/o0;

    iput-object p9, p0, Lud3/x0;->I:Lud3/x0;

    iput-object p10, p0, Lud3/x0;->J:Lud3/x0;

    iput-object p11, p0, Lud3/x0;->K:Lud3/x0;

    iput-wide p12, p0, Lud3/x0;->L:J

    move-wide/from16 p1, p14

    iput-wide p1, p0, Lud3/x0;->M:J

    move-object/from16 p1, p16

    iput-object p1, p0, Lud3/x0;->N:Lzd3/g;

    iput-object v0, p0, Lud3/x0;->O:Lud3/d1;

    const/16 p1, 0xc8

    const/4 p2, 0x0

    if-gt p1, p4, :cond_0

    const/16 p1, 0x12c

    if-ge p4, p1, :cond_0

    const/4 p2, 0x1

    :cond_0
    iput-boolean p2, p0, Lud3/x0;->Q:Z

    return-void
.end method


# virtual methods
.method public final b()Lud3/h;
    .locals 1

    iget-object v0, p0, Lud3/x0;->P:Lud3/h;

    if-nez v0, :cond_0

    sget-object v0, Lud3/h;->n:Lud3/h;

    iget-object v0, p0, Lud3/x0;->F:Lud3/d0;

    invoke-static {v0}, Lq83/g;->O(Lud3/d0;)Lud3/h;

    move-result-object v0

    iput-object v0, p0, Lud3/x0;->P:Lud3/h;

    :cond_0
    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->close()V

    return-void
.end method

.method public final h()Lud3/w0;
    .locals 3

    new-instance v0, Lud3/w0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, -0x1

    iput v1, v0, Lud3/w0;->c:I

    sget-object v1, Lud3/a1;->x:Lud3/z0;

    iput-object v1, v0, Lud3/w0;->g:Lud3/a1;

    sget-object v1, Lud3/d1;->A:Lud3/t;

    iput-object v1, v0, Lud3/w0;->o:Lud3/d1;

    iget-object v1, p0, Lud3/x0;->w:Lud3/o0;

    iput-object v1, v0, Lud3/w0;->a:Lud3/o0;

    iget-object v1, p0, Lud3/x0;->x:Lud3/m0;

    iput-object v1, v0, Lud3/w0;->b:Lud3/m0;

    iget v1, p0, Lud3/x0;->z:I

    iput v1, v0, Lud3/w0;->c:I

    iget-object v1, p0, Lud3/x0;->y:Ljava/lang/String;

    iput-object v1, v0, Lud3/w0;->d:Ljava/lang/String;

    iget-object v1, p0, Lud3/x0;->E:Lud3/c0;

    iput-object v1, v0, Lud3/w0;->e:Lud3/c0;

    iget-object v1, p0, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v1}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object v1

    iput-object v1, v0, Lud3/w0;->f:Lkotlin/jvm/internal/k0;

    iget-object v1, p0, Lud3/x0;->G:Lud3/a1;

    iput-object v1, v0, Lud3/w0;->g:Lud3/a1;

    iget-object v1, p0, Lud3/x0;->H:Lne3/o0;

    iput-object v1, v0, Lud3/w0;->h:Lne3/o0;

    iget-object v1, p0, Lud3/x0;->I:Lud3/x0;

    iput-object v1, v0, Lud3/w0;->i:Lud3/x0;

    iget-object v1, p0, Lud3/x0;->J:Lud3/x0;

    iput-object v1, v0, Lud3/w0;->j:Lud3/x0;

    iget-object v1, p0, Lud3/x0;->K:Lud3/x0;

    iput-object v1, v0, Lud3/w0;->k:Lud3/x0;

    iget-wide v1, p0, Lud3/x0;->L:J

    iput-wide v1, v0, Lud3/w0;->l:J

    iget-wide v1, p0, Lud3/x0;->M:J

    iput-wide v1, v0, Lud3/w0;->m:J

    iget-object v1, p0, Lud3/x0;->N:Lzd3/g;

    iput-object v1, v0, Lud3/w0;->n:Lzd3/g;

    iget-object v1, p0, Lud3/x0;->O:Lud3/d1;

    iput-object v1, v0, Lud3/w0;->o:Lud3/d1;

    return-object v0
.end method

.method public final i(J)Lud3/z0;
    .locals 7

    iget-object v0, p0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->d1()Lne3/j;

    move-result-object v1

    invoke-interface {v1}, Lne3/j;->peek()Lne3/j0;

    move-result-object v1

    new-instance v2, Lne3/h;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, p1, p2}, Lne3/j0;->request(J)Z

    iget-object v3, v1, Lne3/j0;->x:Lne3/h;

    iget-wide v3, v3, Lne3/h;->x:J

    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v3, p1, v3

    if-lez v3, :cond_1

    invoke-virtual {v1, v2, p1, p2}, Lne3/j0;->h1(Lne3/h;J)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v5, v3, v5

    if-eqz v5, :cond_0

    sub-long/2addr p1, v3

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lud3/a1;->x:Lud3/z0;

    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object p1

    iget-wide v0, v2, Lne3/h;->x:J

    new-instance p2, Lud3/z0;

    invoke-direct {p2, p1, v0, v1, v2}, Lud3/z0;-><init>(Lud3/h0;JLne3/h;)V

    return-object p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lud3/x0;->x:Lud3/m0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lud3/x0;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lud3/x0;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lud3/x0;->w:Lud3/o0;

    iget-object v1, v1, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
