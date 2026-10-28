.class public final Lr6/s;
.super Landroidx/glance/appwidget/protobuf/a0;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lr6/s;

.field public static final LAYOUT_FIELD_NUMBER:I = 0x1

.field public static final NEXT_INDEX_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Landroidx/glance/appwidget/protobuf/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/w0;"
        }
    .end annotation
.end field


# instance fields
.field private layout_:Landroidx/glance/appwidget/protobuf/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/e0;"
        }
    .end annotation
.end field

.field private nextIndex_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/s;

    invoke-direct {v0}, Lr6/s;-><init>()V

    sput-object v0, Lr6/s;->DEFAULT_INSTANCE:Lr6/s;

    const-class v1, Lr6/s;

    invoke-static {v1, v0}, Landroidx/glance/appwidget/protobuf/a0;->k(Ljava/lang/Class;Landroidx/glance/appwidget/protobuf/a0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    sget-object v0, Landroidx/glance/appwidget/protobuf/z0;->z:Landroidx/glance/appwidget/protobuf/z0;

    iput-object v0, p0, Lr6/s;->layout_:Landroidx/glance/appwidget/protobuf/e0;

    return-void
.end method

.method public static n(Lr6/s;Lr6/u;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lr6/s;->layout_:Landroidx/glance/appwidget/protobuf/e0;

    move-object v1, v0

    check-cast v1, Landroidx/glance/appwidget/protobuf/b;

    iget-boolean v1, v1, Landroidx/glance/appwidget/protobuf/b;->w:Z

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-interface {v0, v1}, Landroidx/glance/appwidget/protobuf/e0;->i(I)Landroidx/glance/appwidget/protobuf/e0;

    move-result-object v0

    iput-object v0, p0, Lr6/s;->layout_:Landroidx/glance/appwidget/protobuf/e0;

    :cond_1
    iget-object p0, p0, Lr6/s;->layout_:Landroidx/glance/appwidget/protobuf/e0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static o(Lr6/s;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroidx/glance/appwidget/protobuf/z0;->z:Landroidx/glance/appwidget/protobuf/z0;

    iput-object v0, p0, Lr6/s;->layout_:Landroidx/glance/appwidget/protobuf/e0;

    return-void
.end method

.method public static p(Lr6/s;I)V
    .locals 0

    iput p1, p0, Lr6/s;->nextIndex_:I

    return-void
.end method

.method public static q()Lr6/s;
    .locals 1

    sget-object v0, Lr6/s;->DEFAULT_INSTANCE:Lr6/s;

    return-object v0
.end method

.method public static t(Ljava/io/InputStream;)Lr6/s;
    .locals 4

    sget-object v0, Lr6/s;->DEFAULT_INSTANCE:Lr6/s;

    if-nez p0, :cond_0

    sget-object p0, Landroidx/glance/appwidget/protobuf/f0;->b:[B

    array-length v1, p0

    new-instance v2, Landroidx/glance/appwidget/protobuf/j;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v1, v3}, Landroidx/glance/appwidget/protobuf/j;-><init>([BIIZ)V

    :try_start_0
    invoke-virtual {v2, v1}, Landroidx/glance/appwidget/protobuf/j;->q(I)I
    :try_end_0
    .catch Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v2, Landroidx/glance/appwidget/protobuf/k;

    invoke-direct {v2, p0}, Landroidx/glance/appwidget/protobuf/k;-><init>(Ljava/io/InputStream;)V

    :goto_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/s;->a()Landroidx/glance/appwidget/protobuf/s;

    move-result-object p0

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->j()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    :try_start_1
    sget-object v1, Landroidx/glance/appwidget/protobuf/y0;->c:Landroidx/glance/appwidget/protobuf/y0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/glance/appwidget/protobuf/y0;->a(Ljava/lang/Class;)Landroidx/glance/appwidget/protobuf/b1;

    move-result-object v1

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v3, Landroidx/glance/appwidget/protobuf/m;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Landroidx/glance/appwidget/protobuf/m;

    invoke-direct {v3, v2}, Landroidx/glance/appwidget/protobuf/m;-><init>(Landroidx/glance/appwidget/protobuf/l;)V

    :goto_1
    invoke-interface {v1, v0, v3, p0}, Landroidx/glance/appwidget/protobuf/b1;->e(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m;Landroidx/glance/appwidget/protobuf/s;)V

    invoke-interface {v1, v0}, Landroidx/glance/appwidget/protobuf/b1;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Landroidx/glance/appwidget/protobuf/UninitializedMessageException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 p0, 0x1

    invoke-static {v0, p0}, Landroidx/glance/appwidget/protobuf/a0;->g(Landroidx/glance/appwidget/protobuf/a0;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    check-cast v0, Lr6/s;

    return-object v0

    :cond_2
    new-instance p0, Landroidx/glance/appwidget/protobuf/UninitializedMessageException;

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/UninitializedMessageException;-><init>()V

    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_3
    throw p0

    :catch_2
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_4
    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_4
    move-exception p0

    iget-boolean v0, p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->w:Z

    if-eqz v0, :cond_5

    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, v0

    :cond_5
    throw p0
.end method


# virtual methods
.method public final d(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lr6/s;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_1

    const-class v0, Lr6/s;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lr6/s;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/glance/appwidget/protobuf/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lr6/s;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Lr6/s;->DEFAULT_INSTANCE:Lr6/s;

    return-object p1

    :pswitch_2
    new-instance p1, Lr6/r;

    sget-object v0, Lr6/s;->DEFAULT_INSTANCE:Lr6/s;

    invoke-direct {p1, v0}, Landroidx/glance/appwidget/protobuf/y;-><init>(Landroidx/glance/appwidget/protobuf/a0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lr6/s;

    invoke-direct {p1}, Lr6/s;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "layout_"

    const-class v0, Lr6/u;

    const-string v1, "nextIndex_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004"

    sget-object v1, Lr6/s;->DEFAULT_INSTANCE:Lr6/s;

    new-instance v2, Landroidx/glance/appwidget/protobuf/a1;

    invoke-direct {v2, v1, v0, p1}, Landroidx/glance/appwidget/protobuf/a1;-><init>(Landroidx/glance/appwidget/protobuf/a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r()Landroidx/glance/appwidget/protobuf/e0;
    .locals 1

    iget-object v0, p0, Lr6/s;->layout_:Landroidx/glance/appwidget/protobuf/e0;

    return-object v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Lr6/s;->nextIndex_:I

    return v0
.end method
