.class public final Lvs/o4;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field public static final CRT_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lvs/o4;

.field public static final DP_FIELD_NUMBER:I = 0x6

.field public static final DQ_FIELD_NUMBER:I = 0x7

.field public static final D_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field

.field public static final PUBLIC_KEY_FIELD_NUMBER:I = 0x2

.field public static final P_FIELD_NUMBER:I = 0x4

.field public static final Q_FIELD_NUMBER:I = 0x5

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private crt_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private d_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private dp_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private dq_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private p_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private publicKey_:Lvs/q4;

.field private q_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/o4;

    invoke-direct {v0}, Lvs/o4;-><init>()V

    sput-object v0, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    const-class v1, Lvs/o4;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lvs/o4;->d_:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object v0, p0, Lvs/o4;->p_:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object v0, p0, Lvs/o4;->q_:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object v0, p0, Lvs/o4;->dp_:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object v0, p0, Lvs/o4;->dq_:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object v0, p0, Lvs/o4;->crt_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static A(Lvs/o4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lvs/o4;->version_:I

    return-void
.end method

.method public static B(Lvs/o4;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->q_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static C(Lvs/o4;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->dp_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static D(Lvs/o4;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->dq_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static E(Lvs/o4;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->crt_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static F(Lvs/o4;Lvs/q4;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->publicKey_:Lvs/q4;

    iget p1, p0, Lvs/o4;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvs/o4;->bitField0_:I

    return-void
.end method

.method public static G(Lvs/o4;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->d_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static H(Lvs/o4;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/o4;->p_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static Q()Lvs/n4;
    .locals 1

    sget-object v0, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/n4;

    return-object v0
.end method

.method public static R(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/o4;
    .locals 1

    sget-object v0, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->t(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/o4;

    return-object p0
.end method

.method public static S()Lcom/google/crypto/tink/shaded/protobuf/v0;
    .locals 1

    sget-object v0, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->m()Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic z()Lvs/o4;
    .locals 1

    sget-object v0, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    return-object v0
.end method


# virtual methods
.method public final I()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/o4;->crt_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final J()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/o4;->d_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final K()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/o4;->dp_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final L()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/o4;->dq_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final M()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/o4;->p_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final N()Lvs/q4;
    .locals 1

    iget-object v0, p0, Lvs/o4;->publicKey_:Lvs/q4;

    if-nez v0, :cond_0

    invoke-static {}, Lvs/q4;->D()Lvs/q4;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final O()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/o4;->q_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final P()I
    .locals 1

    iget v0, p0, Lvs/o4;->version_:I

    return v0
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 9

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lvs/o4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v1, Lvs/o4;

    monitor-enter v1

    :try_start_0
    sget-object p1, Lvs/o4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/o4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/n4;

    invoke-direct {p1}, Lvs/n4;-><init>()V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/o4;

    invoke-direct {p1}, Lvs/o4;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "bitField0_"

    const-string v1, "version_"

    const-string v2, "publicKey_"

    const-string v3, "d_"

    const-string v4, "p_"

    const-string v5, "q_"

    const-string v6, "dp_"

    const-string v7, "dq_"

    const-string v8, "crt_"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\u0008\n"

    sget-object v1, Lvs/o4;->DEFAULT_INSTANCE:Lvs/o4;

    new-instance v2, Lcom/google/crypto/tink/shaded/protobuf/z0;

    invoke-direct {v2, v1, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/a;Ljava/lang/String;[Ljava/lang/Object;)V

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
