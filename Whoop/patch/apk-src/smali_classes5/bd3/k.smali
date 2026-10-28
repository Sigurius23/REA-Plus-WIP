.class public Lbd3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x4

    iput v0, p0, Lbd3/k;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lzk/c0;

    .line 4
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 10

    const/4 p1, 0x1

    iput p1, p0, Lbd3/k;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lbd3/k;->c:Ljava/lang/Object;

    .line 13
    sget-object v0, Lcg/u;->w:Lcg/u;

    .line 14
    new-instance v1, Landroidx/room/u;

    .line 15
    sget-object v3, Ltg/g;->i:Ltg/g;

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v2, 0x1

    .line 16
    const-class v4, Ltg/e;

    const-string v5, "encodableFromDecoded"

    const-string v6, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 17
    invoke-static {p1, v0, v1}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    .line 18
    sget-object v0, Lcg/v;->w:Lcg/v;

    .line 19
    new-instance v2, Landroidx/room/u;

    const/4 v8, 0x0

    const/4 v9, 0x7

    move-object v4, v3

    const/4 v3, 0x1

    .line 20
    const-class v5, Ltg/e;

    const-string v6, "encodableFromEncoded"

    const-string v7, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v2 .. v9}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 21
    invoke-static {p1, v0, v2}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lbd3/k;->b:Z

    return-void
.end method

.method public constructor <init>(Lbd3/v;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbd3/k;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3/k;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lbd3/k;->b:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lbd3/k;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lbd3/k;->c:Ljava/lang/Object;

    .line 25
    iput-boolean p2, p0, Lbd3/k;->b:Z

    return-void
.end method

.method public constructor <init>(Z[Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lbd3/k;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean p1, p0, Lbd3/k;->b:Z

    .line 10
    iput-object p2, p0, Lbd3/k;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbd3/k;->b:Z

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbd3/k;->b:Z

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbd3/k;->b:Z

    return-void
.end method

.method public d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-string v1, ""

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Lbd3/k;->b:Z

    return-void

    :cond_0
    const-string v1, "/"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iput-boolean v4, p0, Lbd3/k;->b:Z

    return-void

    :cond_1
    invoke-static {p1, v1}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/16 v3, 0x2f

    invoke-static {p1, v3}, Lyb3/r;->Z(Ljava/lang/String;C)Z

    move-result v5

    iput-boolean v5, p0, Lbd3/k;->b:Z

    if-eqz v5, :cond_2

    invoke-static {p1, v1}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    new-array v1, v4, [C

    aput-char v3, v1, v2

    const/4 v3, 0x6

    invoke-static {p1, v1, v2, v3}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 9

    const-string v0, "encoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroidx/room/u;

    sget-object v3, Ltg/g;->i:Ltg/g;

    const/4 v7, 0x0

    const/16 v8, 0x8

    const/4 v2, 0x1

    const-class v4, Ltg/e;

    const-string v5, "encodableFromEncoded"

    const-string v6, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {p0, p1, v1}, Lbd3/k;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public f(B)V
    .locals 3

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbd3/v;->p(Ljava/lang/String;)V

    return-void
.end method

.method public g(C)V
    .locals 4

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    const/4 v1, 0x1

    iget v2, v0, Lbd3/v;->x:I

    invoke-virtual {v0, v2, v1}, Lbd3/v;->f(II)V

    iget-object v1, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [C

    iget v2, v0, Lbd3/v;->x:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lbd3/v;->x:I

    aput-char p1, v1, v2

    return-void
.end method

.method public h(I)V
    .locals 3

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbd3/v;->p(Ljava/lang/String;)V

    return-void
.end method

.method public i(J)V
    .locals 1

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbd3/v;->p(Ljava/lang/String;)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-virtual {v0, p1}, Lbd3/v;->p(Ljava/lang/String;)V

    return-void
.end method

.method public k(S)V
    .locals 3

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbd3/v;->p(Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 11

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    add-int/2addr v1, v2

    iget v3, v0, Lbd3/v;->x:I

    invoke-virtual {v0, v3, v1}, Lbd3/v;->f(II)V

    iget-object v1, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [C

    iget v3, v0, Lbd3/v;->x:I

    add-int/lit8 v4, v3, 0x1

    const/16 v5, 0x22

    aput-char v5, v1, v3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v6, 0x0

    invoke-virtual {p1, v6, v3, v1, v4}, Ljava/lang/String;->getChars(II[CI)V

    add-int/2addr v3, v4

    move v7, v4

    :goto_0
    if-ge v7, v3, :cond_5

    aget-char v8, v1, v7

    sget-object v9, Lbd3/j0;->b:[B

    array-length v10, v9

    if-ge v8, v10, :cond_4

    aget-byte v8, v9, v8

    if-eqz v8, :cond_4

    sub-int v1, v7, v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    :goto_1
    const/4 v4, 0x1

    if-ge v1, v3, :cond_3

    invoke-virtual {v0, v7, v2}, Lbd3/v;->f(II)V

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    sget-object v9, Lbd3/j0;->b:[B

    array-length v10, v9

    if-ge v8, v10, :cond_2

    aget-byte v9, v9, v8

    if-nez v9, :cond_0

    iget-object v4, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v4, [C

    add-int/lit8 v9, v7, 0x1

    int-to-char v8, v8

    aput-char v8, v4, v7

    :goto_2
    move v7, v9

    goto :goto_3

    :cond_0
    if-ne v9, v4, :cond_1

    sget-object v4, Lbd3/j0;->a:[Ljava/lang/String;

    aget-object v4, v4, v8

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v0, v7, v8}, Lbd3/v;->f(II)V

    iget-object v8, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v8, [C

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {v4, v6, v9, v8, v7}, Ljava/lang/String;->getChars(II[CI)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v7

    iput v4, v0, Lbd3/v;->x:I

    move v7, v4

    goto :goto_3

    :cond_1
    iget-object v4, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v4, [C

    const/16 v8, 0x5c

    aput-char v8, v4, v7

    add-int/lit8 v8, v7, 0x1

    int-to-char v9, v9

    aput-char v9, v4, v8

    add-int/lit8 v7, v7, 0x2

    iput v7, v0, Lbd3/v;->x:I

    goto :goto_3

    :cond_2
    iget-object v4, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v4, [C

    add-int/lit8 v9, v7, 0x1

    int-to-char v8, v8

    aput-char v8, v4, v7

    goto :goto_2

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v7, v4}, Lbd3/v;->f(II)V

    iget-object p1, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, [C

    add-int/lit8 v1, v7, 0x1

    aput-char v5, p1, v7

    iput v1, v0, Lbd3/v;->x:I

    return-void

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_5
    add-int/lit8 p1, v3, 0x1

    aput-char v5, v1, v3

    iput p1, v0, Lbd3/v;->x:I

    return-void
.end method

.method public declared-synchronized m(Lzk/z;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbd3/k;->b:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lbd3/k;->b:Z

    invoke-interface {p1}, Lzk/z;->a()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lbd3/k;->b:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p2, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public n()V
    .locals 0

    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lbd3/k;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lbd3/k;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "FALL_THROUGH"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
