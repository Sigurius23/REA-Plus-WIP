.class public final Landroidx/datastore/preferences/protobuf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final y:I

.field public final synthetic z:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    .line 5
    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    .line 6
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/h;->size()I

    move-result p1

    iput p1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    return-void
.end method

.method public constructor <init>(Landroidx/glance/appwidget/protobuf/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    .line 10
    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/h;->size()I

    move-result p1

    iput p1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    return-void
.end method

.method public constructor <init>(Landroidx/health/platform/client/proto/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    .line 14
    invoke-virtual {p1}, Landroidx/health/platform/client/proto/h;->size()I

    move-result p1

    iput p1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    .line 18
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    iput p1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    return-void
.end method

.method public constructor <init>(Lmp/t0;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    invoke-virtual {p1}, Lmp/t0;->e()I

    move-result p1

    iput p1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    return-void
.end method

.method public constructor <init>(Lwa3/u;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    .line 20
    iput v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    .line 21
    iget-object p1, p1, Lwa3/u;->x:[B

    array-length p1, p1

    .line 22
    iput p1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    return-void
.end method


# virtual methods
.method public a()B
    .locals 3

    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    sparse-switch v0, :sswitch_data_0

    :try_start_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    check-cast v0, Lwa3/u;

    iget-object v0, v0, Lwa3/u;->x:[B

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    aget-byte v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->f(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :sswitch_1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_1

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    check-cast v1, Landroidx/datastore/preferences/protobuf/h;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/h;->g(I)B

    move-result v0

    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :pswitch_1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    :pswitch_2
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return v0

    :pswitch_3
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    return v0

    :pswitch_4
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/e;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    check-cast v1, Lmp/t0;

    invoke-virtual {v1, v0}, Lmp/t0;->c(I)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/e;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_1

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    check-cast v1, Landroidx/health/platform/client/proto/h;

    invoke-virtual {v1, v0}, Landroidx/health/platform/client/proto/h;->f(I)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_3
    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/e;->y:I

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/e;->x:I

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/e;->z:Ljava/lang/Iterable;

    check-cast v1, Landroidx/glance/appwidget/protobuf/h;

    invoke-virtual {v1, v0}, Landroidx/glance/appwidget/protobuf/h;->g(I)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_4
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/e;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/e;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
