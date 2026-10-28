.class public final Landroidx/health/platform/client/proto/c2;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field public static final DATA_TYPE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/c2;

.field public static final ID_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private dataType_:Landroidx/health/platform/client/proto/w;

.field private id_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/c2;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/c2;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/c2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/c2;

    const-class v1, Landroidx/health/platform/client/proto/c2;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Landroidx/health/platform/client/proto/c2;->id_:Ljava/lang/String;

    return-void
.end method

.method public static p(Landroidx/health/platform/client/proto/c2;Landroidx/health/platform/client/proto/w;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/health/platform/client/proto/c2;->dataType_:Landroidx/health/platform/client/proto/w;

    iget p1, p0, Landroidx/health/platform/client/proto/c2;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/health/platform/client/proto/c2;->bitField0_:I

    return-void
.end method

.method public static q(Landroidx/health/platform/client/proto/c2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/c2;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/health/platform/client/proto/c2;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/c2;->id_:Ljava/lang/String;

    return-void
.end method

.method public static r()Landroidx/health/platform/client/proto/b2;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/c2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/c2;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->d()Landroidx/health/platform/client/proto/s0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/b2;

    return-object v0
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Landroidx/health/platform/client/proto/c2;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v0, Landroidx/health/platform/client/proto/c2;

    monitor-enter v0

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/c2;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/c2;->PARSER:Landroidx/health/platform/client/proto/s1;

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
    sget-object p1, Landroidx/health/platform/client/proto/c2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/c2;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/b2;

    sget-object v0, Landroidx/health/platform/client/proto/c2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/c2;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/c2;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/c2;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "dataType_"

    const-string v1, "id_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001"

    sget-object v1, Landroidx/health/platform/client/proto/c2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/c2;

    new-instance v2, Landroidx/health/platform/client/proto/a2;

    invoke-direct {v2, v1, v0, p1}, Landroidx/health/platform/client/proto/a2;-><init>(Landroidx/health/platform/client/proto/a;Ljava/lang/String;[Ljava/lang/Object;)V

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
