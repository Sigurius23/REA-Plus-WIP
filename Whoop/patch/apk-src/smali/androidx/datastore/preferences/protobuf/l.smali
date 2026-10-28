.class public abstract Landroidx/datastore/preferences/protobuf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/l;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/datastore/preferences/protobuf/l;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/datastore/preferences/protobuf/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Landroidx/datastore/preferences/protobuf/l;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    .line 6
    iput p2, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    return-void
.end method

.method public static b(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public static c(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static f([BIIZ)Lcom/google/crypto/tink/shaded/protobuf/j;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/j;-><init>([BIIZ)V

    :try_start_0
    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/j;->l(I)I
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public abstract A()J
.end method

.method public abstract B()Ljava/lang/String;
.end method

.method public abstract C()Ljava/lang/String;
.end method

.method public abstract D()I
.end method

.method public abstract E()I
.end method

.method public abstract F()J
.end method

.method public G([C)V
    .locals 3

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    array-length v1, p1

    add-int/2addr v1, v0

    sget v2, Lbd3/e;->a:I

    if-ge v1, v2, :cond_0

    array-length v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    check-cast v0, Lm83/m;

    invoke-virtual {v0, p1}, Lm83/m;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public abstract H(I)Z
.end method

.method public I()V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/l;->D()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    const/16 v2, 0x64

    if-ge v1, v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/l;->H(I)Z

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_2
    new-instance v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public J(I)[C
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    check-cast v0, Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm83/m;->removeLast()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, [C

    if-eqz v0, :cond_1

    iget v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    array-length v2, v0

    sub-int/2addr v1, v2

    iput v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit p0

    if-nez v2, :cond_2

    new-array p1, p1, [C

    return-object p1

    :cond_2
    return-object v2

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public abstract a(I)V
.end method

.method public abstract d()I
.end method

.method public abstract e()Z
.end method

.method public g(Lh5/d1;)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public abstract i(Lh5/q1;Ljava/util/List;)Lh5/q1;
.end method

.method public abstract j(Lh5/d1;Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
.end method

.method public abstract k(I)V
.end method

.method public abstract l(I)I
.end method

.method public abstract m()Z
.end method

.method public abstract n()Landroidx/datastore/preferences/protobuf/h;
.end method

.method public abstract p()Lcom/google/crypto/tink/shaded/protobuf/h;
.end method

.method public abstract q()D
.end method

.method public abstract r()I
.end method

.method public abstract s()I
.end method

.method public abstract t()J
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/l;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p0, Landroidx/datastore/preferences/protobuf/l;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s(0x%04x)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public abstract u()F
.end method

.method public abstract v()I
.end method

.method public abstract w()J
.end method

.method public abstract x()I
.end method

.method public abstract y()J
.end method

.method public abstract z()I
.end method
