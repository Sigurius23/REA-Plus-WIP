.class public final Lr6/n;
.super Landroidx/glance/appwidget/protobuf/a0;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lr6/n;

.field public static final DELETE_FIELD_NUMBER:I = 0x3

.field public static final LAMBDA_FIELD_NUMBER:I = 0x4

.field public static final MY_PACKAGE_REPLACED_FIELD_NUMBER:I = 0x6

.field public static final OPTIONS_CHANGED_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Landroidx/glance/appwidget/protobuf/w0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/w0;"
        }
    .end annotation
.end field

.field public static final RUN_CALLBACK_FIELD_NUMBER:I = 0x5

.field public static final UPDATE_FIELD_NUMBER:I = 0x1


# instance fields
.field private requestCase_:I

.field private request_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/n;

    invoke-direct {v0}, Lr6/n;-><init>()V

    sput-object v0, Lr6/n;->DEFAULT_INSTANCE:Lr6/n;

    const-class v1, Lr6/n;

    invoke-static {v1, v0}, Landroidx/glance/appwidget/protobuf/a0;->k(Ljava/lang/Class;Landroidx/glance/appwidget/protobuf/a0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lr6/n;->requestCase_:I

    return-void
.end method

.method public static E()Lr6/a;
    .locals 1

    sget-object v0, Lr6/n;->DEFAULT_INSTANCE:Lr6/n;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->c()Landroidx/glance/appwidget/protobuf/y;

    move-result-object v0

    check-cast v0, Lr6/a;

    return-object v0
.end method

.method public static F([B)Lr6/n;
    .locals 7

    sget-object v0, Lr6/n;->DEFAULT_INSTANCE:Lr6/n;

    array-length v5, p0

    invoke-static {}, Landroidx/glance/appwidget/protobuf/s;->a()Landroidx/glance/appwidget/protobuf/s;

    move-result-object v1

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->j()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v2

    :try_start_0
    sget-object v0, Landroidx/glance/appwidget/protobuf/y0;->c:Landroidx/glance/appwidget/protobuf/y0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/glance/appwidget/protobuf/y0;->a(Ljava/lang/Class;)Landroidx/glance/appwidget/protobuf/b1;

    move-result-object v0

    new-instance v6, Landroidx/glance/appwidget/protobuf/d;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    move-object v3, p0

    move-object v1, v0

    invoke-interface/range {v1 .. v6}, Landroidx/glance/appwidget/protobuf/b1;->g(Ljava/lang/Object;[BIILandroidx/glance/appwidget/protobuf/d;)V

    invoke-interface {v1, v2}, Landroidx/glance/appwidget/protobuf/b1;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroidx/glance/appwidget/protobuf/UninitializedMessageException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    const/4 p0, 0x1

    invoke-static {v0, p0}, Landroidx/glance/appwidget/protobuf/a0;->g(Landroidx/glance/appwidget/protobuf/a0;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Landroidx/glance/appwidget/protobuf/UninitializedMessageException;

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/UninitializedMessageException;-><init>()V

    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    check-cast v0, Lr6/n;

    return-object v0

    :catch_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->g()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :catch_1
    move-exception v0

    move-object p0, v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_3
    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v0

    move-object p0, v0

    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_3
    move-exception v0

    move-object p0, v0

    iget-boolean v0, p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->w:Z

    if-eqz v0, :cond_4

    new-instance v0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, v0

    :cond_4
    throw p0
.end method

.method public static n(Lr6/n;Lr6/m;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/n;->request_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lr6/n;->requestCase_:I

    return-void
.end method

.method public static o(Lr6/n;Lr6/i;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/n;->request_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lr6/n;->requestCase_:I

    return-void
.end method

.method public static p(Lr6/n;Lr6/c;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/n;->request_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lr6/n;->requestCase_:I

    return-void
.end method

.method public static q(Lr6/n;Lr6/e;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/n;->request_:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lr6/n;->requestCase_:I

    return-void
.end method

.method public static r(Lr6/n;Lr6/k;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/n;->request_:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lr6/n;->requestCase_:I

    return-void
.end method

.method public static s(Lr6/n;Lr6/g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/n;->request_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lr6/n;->requestCase_:I

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final B()Z
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final C()Z
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D()Z
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 8

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lr6/n;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_1

    const-class v1, Lr6/n;

    monitor-enter v1

    :try_start_0
    sget-object p1, Lr6/n;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/glance/appwidget/protobuf/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lr6/n;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-object p1

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Lr6/n;->DEFAULT_INSTANCE:Lr6/n;

    return-object p1

    :pswitch_2
    new-instance p1, Lr6/a;

    sget-object v0, Lr6/n;->DEFAULT_INSTANCE:Lr6/n;

    invoke-direct {p1, v0}, Landroidx/glance/appwidget/protobuf/y;-><init>(Landroidx/glance/appwidget/protobuf/a0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lr6/n;

    invoke-direct {p1}, Lr6/n;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "request_"

    const-string v1, "requestCase_"

    const-class v2, Lr6/m;

    const-class v3, Lr6/i;

    const-class v4, Lr6/c;

    const-class v5, Lr6/e;

    const-class v6, Lr6/k;

    const-class v7, Lr6/g;

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000"

    sget-object v1, Lr6/n;->DEFAULT_INSTANCE:Lr6/n;

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

    nop

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

.method public final t()Lr6/c;
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr6/n;->request_:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    return-object v0

    :cond_0
    invoke-static {}, Lr6/c;->q()Lr6/c;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lr6/e;
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr6/n;->request_:Ljava/lang/Object;

    check-cast v0, Lr6/e;

    return-object v0

    :cond_0
    invoke-static {}, Lr6/e;->s()Lr6/e;

    move-result-object v0

    return-object v0
.end method

.method public final v()Lr6/i;
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr6/n;->request_:Ljava/lang/Object;

    check-cast v0, Lr6/i;

    return-object v0

    :cond_0
    invoke-static {}, Lr6/i;->s()Lr6/i;

    move-result-object v0

    return-object v0
.end method

.method public final w()Lr6/k;
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr6/n;->request_:Ljava/lang/Object;

    check-cast v0, Lr6/k;

    return-object v0

    :cond_0
    invoke-static {}, Lr6/k;->s()Lr6/k;

    move-result-object v0

    return-object v0
.end method

.method public final x()Lr6/m;
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr6/n;->request_:Ljava/lang/Object;

    check-cast v0, Lr6/m;

    return-object v0

    :cond_0
    invoke-static {}, Lr6/m;->q()Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final y()Z
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final z()Z
    .locals 2

    iget v0, p0, Lr6/n;->requestCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
