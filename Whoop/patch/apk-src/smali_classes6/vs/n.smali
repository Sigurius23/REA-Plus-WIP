.class public final Lvs/n;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field public static final AES_CTR_KEY_FORMAT_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lvs/n;

.field public static final HMAC_KEY_FORMAT_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field


# instance fields
.field private aesCtrKeyFormat_:Lvs/x;

.field private bitField0_:I

.field private hmacKeyFormat_:Lvs/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/n;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sput-object v0, Lvs/n;->DEFAULT_INSTANCE:Lvs/n;

    const-class v1, Lvs/n;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public static A(Lvs/n;Lvs/q2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/n;->hmacKeyFormat_:Lvs/q2;

    iget p1, p0, Lvs/n;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lvs/n;->bitField0_:I

    return-void
.end method

.method public static D()Lvs/m;
    .locals 1

    sget-object v0, Lvs/n;->DEFAULT_INSTANCE:Lvs/n;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/m;

    return-object v0
.end method

.method public static E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/n;
    .locals 1

    sget-object v0, Lvs/n;->DEFAULT_INSTANCE:Lvs/n;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->t(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/n;

    return-object p0
.end method

.method public static z(Lvs/n;Lvs/x;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/n;->aesCtrKeyFormat_:Lvs/x;

    iget p1, p0, Lvs/n;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvs/n;->bitField0_:I

    return-void
.end method


# virtual methods
.method public final B()Lvs/x;
    .locals 1

    iget-object v0, p0, Lvs/n;->aesCtrKeyFormat_:Lvs/x;

    if-nez v0, :cond_0

    invoke-static {}, Lvs/x;->B()Lvs/x;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final C()Lvs/q2;
    .locals 1

    iget-object v0, p0, Lvs/n;->hmacKeyFormat_:Lvs/q2;

    if-nez v0, :cond_0

    invoke-static {}, Lvs/q2;->B()Lvs/q2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lvs/n;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/n;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/n;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/n;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/n;->DEFAULT_INSTANCE:Lvs/n;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/m;

    sget-object v0, Lvs/n;->DEFAULT_INSTANCE:Lvs/n;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/n;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "aesCtrKeyFormat_"

    const-string v1, "hmacKeyFormat_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001"

    sget-object v1, Lvs/n;->DEFAULT_INSTANCE:Lvs/n;

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
