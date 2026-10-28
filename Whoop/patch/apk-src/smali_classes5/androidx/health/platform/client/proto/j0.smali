.class public final Landroidx/health/platform/client/proto/j0;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field public static final CODE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

.field public static final MESSAGE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field

.field public static final PERMISSION_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private code_:I

.field private message_:Ljava/lang/String;

.field private permission_:Landroidx/health/platform/client/proto/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/w0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/j0;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/j0;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/j0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

    const-class v1, Landroidx/health/platform/client/proto/j0;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Landroidx/health/platform/client/proto/j0;->message_:Ljava/lang/String;

    sget-object v0, Landroidx/health/platform/client/proto/z1;->z:Landroidx/health/platform/client/proto/z1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/j0;->permission_:Landroidx/health/platform/client/proto/w0;

    return-void
.end method

.method public static p(Landroidx/health/platform/client/proto/j0;I)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/j0;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/health/platform/client/proto/j0;->bitField0_:I

    iput p1, p0, Landroidx/health/platform/client/proto/j0;->code_:I

    return-void
.end method

.method public static q(Landroidx/health/platform/client/proto/j0;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/j0;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/health/platform/client/proto/j0;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/j0;->message_:Ljava/lang/String;

    return-void
.end method

.method public static u()Landroidx/health/platform/client/proto/i0;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/j0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->d()Landroidx/health/platform/client/proto/s0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/i0;

    return-object v0
.end method

.method public static v([B)Landroidx/health/platform/client/proto/j0;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/j0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

    invoke-static {v0, p0}, Landroidx/health/platform/client/proto/u0;->m(Landroidx/health/platform/client/proto/u0;[B)Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/j0;

    return-object p0
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
    sget-object p1, Landroidx/health/platform/client/proto/j0;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v0, Landroidx/health/platform/client/proto/j0;

    monitor-enter v0

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/j0;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/j0;->PARSER:Landroidx/health/platform/client/proto/s1;

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
    sget-object p1, Landroidx/health/platform/client/proto/j0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/i0;

    sget-object v0, Landroidx/health/platform/client/proto/j0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/j0;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/j0;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "code_"

    const-string v1, "message_"

    const-string v2, "permission_"

    const-class v3, Landroidx/health/platform/client/proto/w1;

    filled-new-array {p1, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b"

    sget-object v1, Landroidx/health/platform/client/proto/j0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/j0;

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

.method public final r()I
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/j0;->code_:I

    return v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/j0;->message_:Ljava/lang/String;

    return-object v0
.end method

.method public final t()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/j0;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
