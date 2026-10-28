.class public final Le6/d;
.super Landroidx/datastore/preferences/protobuf/z;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Le6/d;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/u0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/u0;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Landroidx/datastore/preferences/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/l0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le6/d;

    invoke-direct {v0}, Le6/d;-><init>()V

    sput-object v0, Le6/d;->DEFAULT_INSTANCE:Le6/d;

    const-class v1, Le6/d;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/z;->j(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/z;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/z;-><init>()V

    sget-object v0, Landroidx/datastore/preferences/protobuf/l0;->x:Landroidx/datastore/preferences/protobuf/l0;

    iput-object v0, p0, Le6/d;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    return-void
.end method

.method public static l(Le6/d;)Landroidx/datastore/preferences/protobuf/l0;
    .locals 2

    iget-object v0, p0, Le6/d;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    iget-boolean v1, v0, Landroidx/datastore/preferences/protobuf/l0;->w:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l0;->b()Landroidx/datastore/preferences/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Le6/d;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    :cond_0
    iget-object p0, p0, Le6/d;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    return-object p0
.end method

.method public static n()Le6/b;
    .locals 2

    sget-object v0, Le6/d;->DEFAULT_INSTANCE:Le6/d;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Le6/d;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/x;

    check-cast v0, Le6/b;

    return-object v0
.end method

.method public static o(Ljava/io/InputStream;)Le6/d;
    .locals 4

    sget-object v0, Le6/d;->DEFAULT_INSTANCE:Le6/d;

    if-nez p0, :cond_0

    sget-object p0, Landroidx/datastore/preferences/protobuf/c0;->b:[B

    array-length v1, p0

    new-instance v2, Landroidx/datastore/preferences/protobuf/j;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v1, v3}, Landroidx/datastore/preferences/protobuf/j;-><init>([BIIZ)V

    :try_start_0
    invoke-virtual {v2, v1}, Landroidx/datastore/preferences/protobuf/j;->l(I)I
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v2, Landroidx/datastore/preferences/protobuf/k;

    invoke-direct {v2, p0}, Landroidx/datastore/preferences/protobuf/k;-><init>(Ljava/io/InputStream;)V

    :goto_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/q;->a()Landroidx/datastore/preferences/protobuf/q;

    move-result-object p0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/z;->i()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v0

    :try_start_1
    sget-object v1, Landroidx/datastore/preferences/protobuf/w0;->c:Landroidx/datastore/preferences/protobuf/w0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/w0;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/z0;

    move-result-object v1

    iget-object v3, v2, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/datastore/preferences/protobuf/m;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Landroidx/datastore/preferences/protobuf/m;

    invoke-direct {v3, v2}, Landroidx/datastore/preferences/protobuf/m;-><init>(Landroidx/datastore/preferences/protobuf/l;)V

    :goto_1
    invoke-interface {v1, v0, v3, p0}, Landroidx/datastore/preferences/protobuf/z0;->f(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m;Landroidx/datastore/preferences/protobuf/q;)V

    invoke-interface {v1, v0}, Landroidx/datastore/preferences/protobuf/z0;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Landroidx/datastore/preferences/protobuf/UninitializedMessageException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 p0, 0x1

    invoke-static {v0, p0}, Landroidx/datastore/preferences/protobuf/z;->f(Landroidx/datastore/preferences/protobuf/z;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    check-cast v0, Le6/d;

    return-object v0

    :cond_2
    new-instance p0, Landroidx/datastore/preferences/protobuf/UninitializedMessageException;

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/UninitializedMessageException;-><init>()V

    new-instance v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_3
    throw p0

    :catch_2
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_4
    new-instance v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_4
    move-exception p0

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->w:Z

    if-eqz v0, :cond_5

    new-instance v0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, v0

    :cond_5
    throw p0
.end method


# virtual methods
.method public final c(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Le6/d;->PARSER:Landroidx/datastore/preferences/protobuf/u0;

    if-nez p1, :cond_1

    const-class v0, Le6/d;

    monitor-enter v0

    :try_start_0
    sget-object p1, Le6/d;->PARSER:Landroidx/datastore/preferences/protobuf/u0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/y;

    invoke-direct {p1}, Landroidx/datastore/preferences/protobuf/y;-><init>()V

    sput-object p1, Le6/d;->PARSER:Landroidx/datastore/preferences/protobuf/u0;

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
    sget-object p1, Le6/d;->DEFAULT_INSTANCE:Le6/d;

    return-object p1

    :pswitch_2
    new-instance p1, Le6/b;

    sget-object v0, Le6/d;->DEFAULT_INSTANCE:Le6/d;

    invoke-direct {p1, v0}, Landroidx/datastore/preferences/protobuf/x;-><init>(Landroidx/datastore/preferences/protobuf/z;)V

    return-object p1

    :pswitch_3
    new-instance p1, Le6/d;

    invoke-direct {p1}, Le6/d;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "preferences_"

    sget-object v0, Le6/c;->a:Landroidx/datastore/preferences/protobuf/k0;

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object v1, Le6/d;->DEFAULT_INSTANCE:Le6/d;

    new-instance v2, Landroidx/datastore/preferences/protobuf/y0;

    invoke-direct {v2, v1, v0, p1}, Landroidx/datastore/preferences/protobuf/y0;-><init>(Landroidx/datastore/preferences/protobuf/z;Ljava/lang/String;[Ljava/lang/Object;)V

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

.method public final m()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Le6/d;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
