.class public final Lvs/t;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field public static final CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lvs/t;

.field public static final DERIVED_KEY_SIZE_FIELD_NUMBER:I = 0x2

.field public static final HKDF_HASH_TYPE_FIELD_NUMBER:I = 0x3

.field public static final HMAC_PARAMS_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private ciphertextSegmentSize_:I

.field private derivedKeySize_:I

.field private hkdfHashType_:I

.field private hmacParams_:Lvs/s2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/t;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sput-object v0, Lvs/t;->DEFAULT_INSTANCE:Lvs/t;

    const-class v1, Lvs/t;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public static A(Lvs/t;I)V
    .locals 0

    iput p1, p0, Lvs/t;->derivedKeySize_:I

    return-void
.end method

.method public static B(Lvs/t;Lvs/g2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lvs/g2;->b()I

    move-result p1

    iput p1, p0, Lvs/t;->hkdfHashType_:I

    return-void
.end method

.method public static C(Lvs/t;Lvs/s2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/t;->hmacParams_:Lvs/s2;

    iget p1, p0, Lvs/t;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvs/t;->bitField0_:I

    return-void
.end method

.method public static E()Lvs/t;
    .locals 1

    sget-object v0, Lvs/t;->DEFAULT_INSTANCE:Lvs/t;

    return-object v0
.end method

.method public static I()Lvs/s;
    .locals 1

    sget-object v0, Lvs/t;->DEFAULT_INSTANCE:Lvs/t;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/s;

    return-object v0
.end method

.method public static z(Lvs/t;I)V
    .locals 0

    iput p1, p0, Lvs/t;->ciphertextSegmentSize_:I

    return-void
.end method


# virtual methods
.method public final D()I
    .locals 1

    iget v0, p0, Lvs/t;->ciphertextSegmentSize_:I

    return v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, Lvs/t;->derivedKeySize_:I

    return v0
.end method

.method public final G()Lvs/g2;
    .locals 1

    iget v0, p0, Lvs/t;->hkdfHashType_:I

    invoke-static {v0}, Lvs/g2;->a(I)Lvs/g2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvs/g2;->H:Lvs/g2;

    :cond_0
    return-object v0
.end method

.method public final H()Lvs/s2;
    .locals 1

    iget-object v0, p0, Lvs/t;->hmacParams_:Lvs/s2;

    if-nez v0, :cond_0

    invoke-static {}, Lvs/s2;->B()Lvs/s2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 4

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lvs/t;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/t;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/t;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/t;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/t;->DEFAULT_INSTANCE:Lvs/t;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/s;

    sget-object v0, Lvs/t;->DEFAULT_INSTANCE:Lvs/t;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/t;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "ciphertextSegmentSize_"

    const-string v1, "derivedKeySize_"

    const-string v2, "hkdfHashType_"

    const-string v3, "hmacParams_"

    filled-new-array {p1, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000c\u0004\u1009\u0000"

    sget-object v1, Lvs/t;->DEFAULT_INSTANCE:Lvs/t;

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
