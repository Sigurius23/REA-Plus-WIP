.class public final Landroidx/health/platform/client/proto/y;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

.field public static final IDENTIFIER_FIELD_NUMBER:I = 0x1

.field public static final MANUFACTURER_FIELD_NUMBER:I = 0x2

.field public static final MODEL_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field

.field public static final TYPE_FIELD_NUMBER:I = 0x4


# instance fields
.field private bitField0_:I

.field private identifier_:Ljava/lang/String;

.field private manufacturer_:Ljava/lang/String;

.field private model_:Ljava/lang/String;

.field private type_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/y;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/y;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/y;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

    const-class v1, Landroidx/health/platform/client/proto/y;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Landroidx/health/platform/client/proto/y;->identifier_:Ljava/lang/String;

    iput-object v0, p0, Landroidx/health/platform/client/proto/y;->manufacturer_:Ljava/lang/String;

    iput-object v0, p0, Landroidx/health/platform/client/proto/y;->model_:Ljava/lang/String;

    iput-object v0, p0, Landroidx/health/platform/client/proto/y;->type_:Ljava/lang/String;

    return-void
.end method

.method public static p(Landroidx/health/platform/client/proto/y;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/y;->manufacturer_:Ljava/lang/String;

    return-void
.end method

.method public static q(Landroidx/health/platform/client/proto/y;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/y;->model_:Ljava/lang/String;

    return-void
.end method

.method public static r(Landroidx/health/platform/client/proto/y;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/y;->type_:Ljava/lang/String;

    return-void
.end method

.method public static s()Landroidx/health/platform/client/proto/y;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/y;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

    return-object v0
.end method

.method public static y()Landroidx/health/platform/client/proto/x;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/y;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->d()Landroidx/health/platform/client/proto/s0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/x;

    return-object v0
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 4

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Landroidx/health/platform/client/proto/y;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v0, Landroidx/health/platform/client/proto/y;

    monitor-enter v0

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/y;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/y;->PARSER:Landroidx/health/platform/client/proto/s1;

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
    sget-object p1, Landroidx/health/platform/client/proto/y;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/x;

    sget-object v0, Landroidx/health/platform/client/proto/y;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/y;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/y;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "identifier_"

    const-string v1, "manufacturer_"

    const-string v2, "model_"

    const-string v3, "type_"

    filled-new-array {p1, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003"

    sget-object v1, Landroidx/health/platform/client/proto/y;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/y;

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

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/y;->manufacturer_:Ljava/lang/String;

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/y;->model_:Ljava/lang/String;

    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/y;->type_:Ljava/lang/String;

    return-object v0
.end method

.method public final w()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final x()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/y;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
