.class public final Lv63/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/io/Closeable;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public final w:Lx63/f;

.field public x:Lw63/a;

.field public y:Lw63/a;

.field public z:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lw63/a;->k:Lio/ktor/utils/io/internal/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lv63/d;->w:Lx63/f;

    sget-object v0, Lt63/b;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv63/d;->z:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final append(C)Ljava/lang/Appendable;
    .locals 12

    .line 2
    iget v0, p0, Lv63/d;->E:I

    .line 3
    iget v1, p0, Lv63/d;->F:I

    sub-int/2addr v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/high16 v4, 0x110000

    const/high16 v5, 0x10000

    const/16 v6, 0x800

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/16 v9, 0x80

    const/4 v10, 0x3

    if-lt v1, v10, :cond_4

    .line 4
    iget-object v1, p0, Lv63/d;->z:Ljava/nio/ByteBuffer;

    if-ltz p1, :cond_0

    if-ge p1, v9, :cond_0

    int-to-byte p1, p1

    .line 5
    invoke-virtual {v1, v0, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v3, v8

    goto :goto_0

    :cond_0
    if-gt v9, p1, :cond_1

    if-ge p1, v6, :cond_1

    shr-int/lit8 v2, p1, 0x6

    and-int/lit8 v2, v2, 0x1f

    or-int/lit16 v2, v2, 0xc0

    int-to-byte v2, v2

    invoke-virtual {v1, v0, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v0, 0x1

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v9

    int-to-byte p1, p1

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v3, v7

    goto :goto_0

    :cond_1
    if-gt v6, p1, :cond_2

    if-ge p1, v5, :cond_2

    shr-int/lit8 v2, p1, 0xc

    and-int/lit8 v2, v2, 0xf

    or-int/lit16 v2, v2, 0xe0

    int-to-byte v2, v2

    invoke-virtual {v1, v0, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v9

    int-to-byte v3, v3

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v0, 0x2

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v9

    int-to-byte p1, p1

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v3, v10

    goto :goto_0

    :cond_2
    if-gt v5, p1, :cond_3

    if-ge p1, v4, :cond_3

    shr-int/lit8 v2, p1, 0x12

    and-int/lit8 v2, v2, 0x7

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    invoke-virtual {v1, v0, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v4, p1, 0xc

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v9

    int-to-byte v4, v4

    invoke-virtual {v1, v2, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v0, 0x2

    shr-int/lit8 v4, p1, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v9

    int-to-byte v4, v4

    invoke-virtual {v1, v2, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v0, 0x3

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v9

    int-to-byte p1, p1

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    :goto_0
    add-int/2addr v0, v3

    .line 6
    iput v0, p0, Lv63/d;->E:I

    return-object p0

    .line 7
    :cond_3
    invoke-static {p1}, Ls7/a;->o(I)V

    throw v2

    .line 8
    :cond_4
    invoke-virtual {p0, v10}, Lv63/d;->k(I)Lw63/a;

    move-result-object v0

    .line 9
    :try_start_0
    iget-object v1, v0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    .line 10
    iget v11, v0, Lio/seon/androidsdk/service/e1;->c:I

    if-ltz p1, :cond_5

    if-ge p1, v9, :cond_5

    int-to-byte p1, p1

    .line 11
    invoke-virtual {v1, v11, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v3, v8

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_5
    if-gt v9, p1, :cond_6

    if-ge p1, v6, :cond_6

    shr-int/lit8 v2, p1, 0x6

    and-int/lit8 v2, v2, 0x1f

    or-int/lit16 v2, v2, 0xc0

    int-to-byte v2, v2

    invoke-virtual {v1, v11, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/2addr v11, v8

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v9

    int-to-byte p1, p1

    invoke-virtual {v1, v11, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v3, v7

    goto :goto_1

    :cond_6
    if-gt v6, p1, :cond_7

    if-ge p1, v5, :cond_7

    shr-int/lit8 v2, p1, 0xc

    and-int/lit8 v2, v2, 0xf

    or-int/lit16 v2, v2, 0xe0

    int-to-byte v2, v2

    invoke-virtual {v1, v11, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v11, 0x1

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v9

    int-to-byte v3, v3

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/2addr v11, v7

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v9

    int-to-byte p1, p1

    invoke-virtual {v1, v11, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v3, v10

    goto :goto_1

    :cond_7
    if-gt v5, p1, :cond_8

    if-ge p1, v4, :cond_8

    shr-int/lit8 v2, p1, 0x12

    and-int/lit8 v2, v2, 0x7

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    invoke-virtual {v1, v11, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v11, 0x1

    shr-int/lit8 v4, p1, 0xc

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v9

    int-to-byte v4, v4

    invoke-virtual {v1, v2, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v11, 0x2

    shr-int/lit8 v4, p1, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v9

    int-to-byte v4, v4

    invoke-virtual {v1, v2, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/2addr v11, v10

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v9

    int-to-byte p1, p1

    invoke-virtual {v1, v11, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 12
    :goto_1
    invoke-virtual {v0, v3}, Lio/seon/androidsdk/service/e1;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {p0}, Lv63/d;->b()V

    return-object p0

    .line 14
    :cond_8
    :try_start_1
    invoke-static {p1}, Ls7/a;->o(I)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :goto_2
    invoke-virtual {p0}, Lv63/d;->b()V

    throw p1
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 16
    const-string p1, "null"

    const/4 v1, 0x4

    .line 17
    invoke-virtual {p0, p1, v0, v1}, Lv63/d;->h(Ljava/lang/CharSequence;II)Lv63/d;

    return-object p0

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 19
    invoke-virtual {p0, p1, v0, v1}, Lv63/d;->h(Ljava/lang/CharSequence;II)Lv63/d;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lv63/d;->h(Ljava/lang/CharSequence;II)Lv63/d;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lv63/d;->y:Lw63/a;

    if-eqz v0, :cond_0

    iget v0, v0, Lio/seon/androidsdk/service/e1;->c:I

    iput v0, p0, Lv63/d;->E:I

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 5

    iget-object v0, p0, Lv63/d;->w:Lx63/f;

    invoke-virtual {p0}, Lv63/d;->m()Lw63/a;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    move-object v2, v1

    :cond_1
    :try_start_0
    iget-object v3, v2, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    const-string v4, "source"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lw63/a;->h()Lw63/a;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    invoke-static {v1, v0}, Ls4/a;->j(Lw63/a;Lx63/f;)V

    return-void

    :catchall_0
    move-exception v2

    invoke-static {v1, v0}, Ls4/a;->j(Lw63/a;Lx63/f;)V

    throw v2
.end method

.method public final h(Ljava/lang/CharSequence;II)Lv63/d;
    .locals 8

    if-nez p1, :cond_0

    const-string p1, "null"

    invoke-virtual {p0, p1, p2, p3}, Lv63/d;->h(Ljava/lang/CharSequence;II)Lv63/d;

    move-result-object p1

    goto/16 :goto_4

    :cond_0
    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v1, "text"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "charset"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object v0

    move v4, p2

    :goto_0
    :try_start_0
    iget-object p2, v0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    move-object v2, p2

    check-cast v2, Ljava/nio/ByteBuffer;

    iget v6, v0, Lio/seon/androidsdk/service/e1;->c:I

    iget v7, v0, Lio/seon/androidsdk/service/e1;->e:I

    move-object v3, p1

    move v5, p3

    invoke-static/range {v2 .. v7}, Ls7/a;->d(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I

    move-result p1

    invoke-static {p1}, Ls6/a;->b(I)S

    move-result p2

    invoke-static {p1}, Ls6/a;->c(I)S

    move-result p1

    const p3, 0xffff

    and-int/2addr p2, p3

    add-int/2addr v4, p2

    and-int/2addr p1, p3

    invoke-virtual {v0, p1}, Lio/seon/androidsdk/service/e1;->b(I)V

    if-nez p2, :cond_1

    if-ge v4, v5, :cond_1

    const/16 p1, 0x8

    goto :goto_1

    :cond_1
    if-ge v4, v5, :cond_2

    move p1, v1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-lez p1, :cond_3

    invoke-static {p0, p1, v0}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, v3

    move p3, v5

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lv63/d;->b()V

    goto :goto_3

    :goto_2
    invoke-virtual {p0}, Lv63/d;->b()V

    throw p1

    :cond_4
    move-object v3, p1

    move v5, p3

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    const-string p3, "charset.newEncoder()"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0, v3, p2, v5}, Lhg3/i;->I(Ljava/nio/charset/CharsetEncoder;Lv63/d;Ljava/lang/CharSequence;II)V

    :goto_3
    move-object p1, p0

    :goto_4
    return-object p1
.end method

.method public final i()Lv63/e;
    .locals 5

    iget v0, p0, Lv63/d;->H:I

    iget v1, p0, Lv63/d;->E:I

    iget v2, p0, Lv63/d;->G:I

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    invoke-virtual {p0}, Lv63/d;->m()Lw63/a;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lv63/e;->H:Lv63/e;

    return-object v0

    :cond_0
    new-instance v2, Lv63/e;

    int-to-long v3, v1

    iget-object v1, p0, Lv63/d;->w:Lx63/f;

    invoke-direct {v2, v0, v3, v4, v1}, Lv63/e;-><init>(Lw63/a;JLx63/f;)V

    return-object v2
.end method

.method public final k(I)Lw63/a;
    .locals 3

    iget v0, p0, Lv63/d;->F:I

    iget v1, p0, Lv63/d;->E:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    iget-object p1, p0, Lv63/d;->y:Lw63/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Lio/seon/androidsdk/service/e1;->c(I)V

    return-object p1

    :cond_0
    iget-object p1, p0, Lv63/d;->w:Lx63/f;

    invoke-interface {p1}, Lx63/f;->t0()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw63/a;

    invoke-virtual {p1}, Lio/seon/androidsdk/service/e1;->f()V

    invoke-virtual {p1}, Lw63/a;->h()Lw63/a;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lv63/d;->y:Lw63/a;

    if-nez v0, :cond_1

    iput-object p1, p0, Lv63/d;->x:Lw63/a;

    const/4 v0, 0x0

    iput v0, p0, Lv63/d;->H:I

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Lw63/a;->l(Lw63/a;)V

    iget v1, p0, Lv63/d;->E:I

    invoke-virtual {v0, v1}, Lio/seon/androidsdk/service/e1;->c(I)V

    iget v0, p0, Lv63/d;->H:I

    iget v2, p0, Lv63/d;->G:I

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lv63/d;->H:I

    :goto_0
    iput-object p1, p0, Lv63/d;->y:Lw63/a;

    iget v0, p0, Lv63/d;->H:I

    iput v0, p0, Lv63/d;->H:I

    iget-object v0, p1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv63/d;->z:Ljava/nio/ByteBuffer;

    iget v0, p1, Lio/seon/androidsdk/service/e1;->c:I

    iput v0, p0, Lv63/d;->E:I

    iget v0, p1, Lio/seon/androidsdk/service/e1;->b:I

    iput v0, p0, Lv63/d;->G:I

    iget v0, p1, Lio/seon/androidsdk/service/e1;->e:I

    iput v0, p0, Lv63/d;->F:I

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "It should be a single buffer chunk."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m()Lw63/a;
    .locals 4

    iget-object v0, p0, Lv63/d;->x:Lw63/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, Lv63/d;->y:Lw63/a;

    if-eqz v2, :cond_1

    iget v3, p0, Lv63/d;->E:I

    invoke-virtual {v2, v3}, Lio/seon/androidsdk/service/e1;->c(I)V

    :cond_1
    iput-object v1, p0, Lv63/d;->x:Lw63/a;

    iput-object v1, p0, Lv63/d;->y:Lw63/a;

    const/4 v1, 0x0

    iput v1, p0, Lv63/d;->E:I

    iput v1, p0, Lv63/d;->F:I

    iput v1, p0, Lv63/d;->G:I

    iput v1, p0, Lv63/d;->H:I

    sget-object v1, Lt63/b;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lv63/d;->z:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BytePacketBuilder("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lv63/d;->H:I

    iget v2, p0, Lv63/d;->E:I

    iget v3, p0, Lv63/d;->G:I

    sub-int/2addr v2, v3

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bytes written)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
