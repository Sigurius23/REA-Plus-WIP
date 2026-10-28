.class public final Ll0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ll0/o0;

.field public final c:J

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(ILl0/o0;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll0/l0;->a:I

    iput-object p2, p0, Ll0/l0;->b:Ll0/o0;

    iput-wide p3, p0, Ll0/l0;->c:J

    iput p5, p0, Ll0/l0;->d:I

    iput p6, p0, Ll0/l0;->e:I

    return-void
.end method


# virtual methods
.method public final a(Ll0/k0;ZIIII)Ll0/g2;
    .locals 0

    iget-boolean p1, p1, Ll0/k0;->b:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll0/l0;->b:Ll0/o0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll0/n0;->w:Ll0/n0;

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(ZIJLa0/q;IIIZZ)Ll0/k0;
    .locals 14

    move/from16 v0, p2

    move-object/from16 v1, p5

    move/from16 v2, p6

    move/from16 v3, p8

    add-int v7, p7, v3

    const/4 v11, 0x1

    if-nez v1, :cond_0

    new-instance p1, Ll0/k0;

    invoke-direct {p1, v11, v11}, Ll0/k0;-><init>(ZZ)V

    return-object p1

    :cond_0
    iget-wide v4, v1, La0/q;->a:J

    iget-object v1, p0, Ll0/l0;->b:Ll0/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ll0/n0;->w:Ll0/n0;

    sget-object v1, Ll0/n0;->w:Ll0/n0;

    const v1, 0x7fffffff

    if-lt v2, v1, :cond_1

    goto :goto_0

    :cond_1
    const-wide v8, 0xffffffffL

    and-long v12, p3, v8

    long-to-int v1, v12

    and-long v12, v4, v8

    long-to-int v6, v12

    sub-int/2addr v1, v6

    if-gez v1, :cond_2

    :goto_0
    new-instance p1, Ll0/k0;

    invoke-direct {p1, v11, v11}, Ll0/k0;-><init>(ZZ)V

    return-object p1

    :cond_2
    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget v1, p0, Ll0/l0;->a:I

    const/16 v6, 0x20

    if-lt v0, v1, :cond_4

    goto :goto_1

    :cond_4
    shr-long v0, p3, v6

    long-to-int v0, v0

    shr-long v12, v4, v6

    long-to-int v1, v12

    sub-int/2addr v0, v1

    if-gez v0, :cond_6

    :goto_1
    if-eqz p9, :cond_5

    new-instance p1, Ll0/k0;

    invoke-direct {p1, v11, v11}, Ll0/k0;-><init>(ZZ)V

    return-object p1

    :cond_5
    iget-wide v0, p0, Ll0/l0;->c:J

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result v0

    and-long v12, p3, v8

    long-to-int v1, v12

    iget v10, p0, Ll0/l0;->e:I

    sub-int/2addr v1, v10

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, La0/q;->a(II)J

    move-result-wide v0

    shr-long v12, v4, v6

    long-to-int v3, v12

    iget v6, p0, Ll0/l0;->d:I

    sub-int/2addr v3, v6

    and-long/2addr v4, v8

    long-to-int v4, v4

    invoke-static {v3, v4}, La0/q;->a(II)J

    move-result-wide v3

    new-instance v5, La0/q;

    invoke-direct {v5, v3, v4}, La0/q;-><init>(J)V

    add-int/lit8 v6, v2, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x0

    move-wide v3, v0

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v10}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object p1

    new-instance v0, Ll0/k0;

    iget-boolean p1, p1, Ll0/k0;->b:Z

    invoke-direct {v0, v11, p1}, Ll0/k0;-><init>(ZZ)V

    return-object v0

    :cond_6
    :goto_2
    and-long v0, v4, v8

    long-to-int p1, v0

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    new-instance p1, Ll0/k0;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Ll0/k0;-><init>(ZZ)V

    return-object p1
.end method
