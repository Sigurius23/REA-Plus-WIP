.class public final Lbb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbb/b;
.implements Lgn/b;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:J

.field public d:I

.field public e:J

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lbb/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lt9/q;Lt9/k0;Lbb/e;Ljava/lang/String;I)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lbb/c;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lbb/c;->f:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lbb/c;->g:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, Lbb/c;->h:Ljava/lang/Object;

    .line 25
    iget p1, p3, Lbb/e;->a:I

    iget p2, p3, Lbb/e;->b:I

    iget v0, p3, Lbb/e;->d:I

    mul-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x8

    .line 26
    iget p3, p3, Lbb/e;->c:I

    if-ne p3, v0, :cond_0

    mul-int p3, p2, v0

    mul-int/lit8 v1, p3, 0x8

    .line 27
    div-int/lit8 p3, p3, 0xa

    .line 28
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iput p3, p0, Lbb/c;->b:I

    .line 29
    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    const-string v2, "audio/wav"

    .line 30
    invoke-static {v2}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lu8/o;->l:Ljava/lang/String;

    .line 31
    invoke-static {p4}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iput-object p4, v0, Lu8/o;->m:Ljava/lang/String;

    .line 32
    iput v1, v0, Lu8/o;->h:I

    .line 33
    iput v1, v0, Lu8/o;->i:I

    .line 34
    iput p3, v0, Lu8/o;->n:I

    .line 35
    iput p1, v0, Lu8/o;->C:I

    .line 36
    iput p2, v0, Lu8/o;->D:I

    .line 37
    iput p5, v0, Lu8/o;->E:I

    .line 38
    new-instance p1, Lu8/p;

    invoke-direct {p1, v0}, Lu8/p;-><init>(Lu8/o;)V

    .line 39
    iput-object p1, p0, Lbb/c;->i:Ljava/lang/Object;

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Expected block size: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "; got: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1
.end method

.method public constructor <init>(Lwm/k;Lwm/s;Lbb/e;Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lbb/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbb/c;->f:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lbb/c;->g:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lbb/c;->h:Ljava/lang/Object;

    .line 6
    iget p1, p3, Lbb/e;->a:I

    iget p2, p3, Lbb/e;->b:I

    iget v0, p3, Lbb/e;->d:I

    mul-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x8

    .line 7
    iget p3, p3, Lbb/e;->c:I

    if-ne p3, v0, :cond_0

    mul-int p3, p2, v0

    mul-int/lit8 v1, p3, 0x8

    .line 8
    div-int/lit8 p3, p3, 0xa

    .line 9
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iput p3, p0, Lbb/c;->b:I

    .line 10
    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    .line 11
    iput-object p4, v0, Lrm/b0;->k:Ljava/lang/String;

    .line 12
    iput v1, v0, Lrm/b0;->f:I

    .line 13
    iput v1, v0, Lrm/b0;->g:I

    .line 14
    iput p3, v0, Lrm/b0;->l:I

    .line 15
    iput p1, v0, Lrm/b0;->x:I

    .line 16
    iput p2, v0, Lrm/b0;->y:I

    .line 17
    iput p5, v0, Lrm/b0;->z:I

    .line 18
    new-instance p1, Lrm/c0;

    invoke-direct {p1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    .line 19
    iput-object p1, p0, Lbb/c;->i:Ljava/lang/Object;

    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const/16 p2, 0x32

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Expected block size: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "; got: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public a(IJ)V
    .locals 8

    iget v0, p0, Lbb/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbb/c;->f:Ljava/lang/Object;

    check-cast v0, Lwm/k;

    new-instance v1, Lgn/d;

    iget-object v2, p0, Lbb/c;->h:Ljava/lang/Object;

    check-cast v2, Lbb/e;

    const/4 v3, 0x1

    int-to-long v4, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lgn/d;-><init>(Lbb/e;IJJ)V

    invoke-interface {v0, v1}, Lwm/k;->x(Lwm/p;)V

    iget-object p1, p0, Lbb/c;->g:Ljava/lang/Object;

    check-cast p1, Lwm/s;

    iget-object p2, p0, Lbb/c;->i:Ljava/lang/Object;

    check-cast p2, Lrm/c0;

    invoke-interface {p1, p2}, Lwm/s;->a(Lrm/c0;)V

    return-void

    :pswitch_0
    move-wide v5, p2

    new-instance v0, Lbb/g;

    iget-object p2, p0, Lbb/c;->h:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Lbb/e;

    const/4 v2, 0x1

    int-to-long v3, p1

    invoke-direct/range {v0 .. v6}, Lbb/g;-><init>(Lbb/e;IJJ)V

    iget-object p1, p0, Lbb/c;->f:Ljava/lang/Object;

    check-cast p1, Lt9/q;

    invoke-interface {p1, v0}, Lt9/q;->v(Lt9/e0;)V

    iget-object p1, p0, Lbb/c;->g:Ljava/lang/Object;

    check-cast p1, Lt9/k0;

    iget-object p2, p0, Lbb/c;->i:Ljava/lang/Object;

    check-cast p2, Lu8/p;

    invoke-interface {p1, p2}, Lt9/k0;->a(Lu8/p;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(J)V
    .locals 1

    iget v0, p0, Lbb/c;->a:I

    packed-switch v0, :pswitch_data_0

    iput-wide p1, p0, Lbb/c;->c:J

    const/4 p1, 0x0

    iput p1, p0, Lbb/c;->d:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lbb/c;->e:J

    return-void

    :pswitch_0
    iput-wide p1, p0, Lbb/c;->c:J

    const/4 p1, 0x0

    iput p1, p0, Lbb/c;->d:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lbb/c;->e:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lwm/j;J)Z
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v6, 0x1

    if-lez v5, :cond_1

    iget v7, v0, Lbb/c;->d:I

    iget v8, v0, Lbb/c;->b:I

    if-ge v7, v8, :cond_1

    sub-int/2addr v8, v7

    int-to-long v7, v8

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v5, v7

    iget-object v7, v0, Lbb/c;->g:Ljava/lang/Object;

    check-cast v7, Lwm/s;

    move-object/from16 v8, p1

    invoke-interface {v7, v8, v5, v6}, Lwm/s;->b(Lko/i;IZ)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    move-wide v1, v3

    goto :goto_0

    :cond_0
    iget v3, v0, Lbb/c;->d:I

    add-int/2addr v3, v5

    iput v3, v0, Lbb/c;->d:I

    int-to-long v3, v5

    sub-long/2addr v1, v3

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lbb/c;->h:Ljava/lang/Object;

    check-cast v1, Lbb/e;

    iget v2, v1, Lbb/e;->c:I

    iget v3, v0, Lbb/c;->d:I

    div-int/2addr v3, v2

    if-lez v3, :cond_2

    iget-wide v7, v0, Lbb/c;->c:J

    iget-wide v9, v0, Lbb/c;->e:J

    iget v1, v1, Lbb/e;->b:I

    int-to-long v13, v1

    const-wide/32 v11, 0xf4240

    invoke-static/range {v9 .. v14}, Llo/y;->D(JJJ)J

    move-result-wide v9

    add-long v12, v7, v9

    mul-int v15, v3, v2

    iget v1, v0, Lbb/c;->d:I

    sub-int v16, v1, v15

    iget-object v1, v0, Lbb/c;->g:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lwm/s;

    const/4 v14, 0x1

    const/16 v17, 0x0

    invoke-interface/range {v11 .. v17}, Lwm/s;->d(JIIILwm/r;)V

    move/from16 v1, v16

    iget-wide v7, v0, Lbb/c;->e:J

    int-to-long v2, v3

    add-long/2addr v7, v2

    iput-wide v7, v0, Lbb/c;->e:J

    iput v1, v0, Lbb/c;->d:I

    :cond_2
    if-gtz v5, :cond_3

    return v6

    :cond_3
    const/4 v1, 0x0

    return v1
.end method

.method public d(Lt9/o;J)Z
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v6, 0x1

    if-lez v5, :cond_1

    iget v7, v0, Lbb/c;->d:I

    iget v8, v0, Lbb/c;->b:I

    if-ge v7, v8, :cond_1

    sub-int/2addr v8, v7

    int-to-long v7, v8

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v5, v7

    iget-object v7, v0, Lbb/c;->g:Ljava/lang/Object;

    check-cast v7, Lt9/k0;

    move-object/from16 v8, p1

    invoke-interface {v7, v8, v5, v6}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    move-wide v1, v3

    goto :goto_0

    :cond_0
    iget v3, v0, Lbb/c;->d:I

    add-int/2addr v3, v5

    iput v3, v0, Lbb/c;->d:I

    int-to-long v3, v5

    sub-long/2addr v1, v3

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lbb/c;->h:Ljava/lang/Object;

    check-cast v1, Lbb/e;

    iget v2, v1, Lbb/e;->c:I

    iget v3, v0, Lbb/c;->d:I

    div-int/2addr v3, v2

    if-lez v3, :cond_2

    iget-wide v7, v0, Lbb/c;->c:J

    iget-wide v9, v0, Lbb/c;->e:J

    iget v1, v1, Lbb/e;->b:I

    int-to-long v13, v1

    sget v1, Lx8/t;->a:I

    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v11, 0xf4240

    invoke-static/range {v9 .. v15}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v9

    add-long v12, v7, v9

    mul-int v15, v3, v2

    iget v1, v0, Lbb/c;->d:I

    sub-int v16, v1, v15

    iget-object v1, v0, Lbb/c;->g:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lt9/k0;

    const/4 v14, 0x1

    const/16 v17, 0x0

    invoke-interface/range {v11 .. v17}, Lt9/k0;->b(JIIILt9/j0;)V

    move/from16 v1, v16

    iget-wide v7, v0, Lbb/c;->e:J

    int-to-long v2, v3

    add-long/2addr v7, v2

    iput-wide v7, v0, Lbb/c;->e:J

    iput v1, v0, Lbb/c;->d:I

    :cond_2
    if-gtz v5, :cond_3

    return v6

    :cond_3
    const/4 v1, 0x0

    return v1
.end method
