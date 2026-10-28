.class public final Lvs/t3;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lvs/t3;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private bitField0_:I

.field private keyData_:Lvs/m3;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/t3;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sput-object v0, Lvs/t3;->DEFAULT_INSTANCE:Lvs/t3;

    const-class v1, Lvs/t3;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public static A(Lvs/t3;Lvs/h4;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lvs/h4;->b()I

    move-result p1

    iput p1, p0, Lvs/t3;->outputPrefixType_:I

    return-void
.end method

.method public static B(Lvs/t3;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvs/n3;->y:Lvs/n3;

    invoke-virtual {v0}, Lvs/n3;->a()I

    move-result v0

    iput v0, p0, Lvs/t3;->status_:I

    return-void
.end method

.method public static C(Lvs/t3;I)V
    .locals 0

    iput p1, p0, Lvs/t3;->keyId_:I

    return-void
.end method

.method public static I()Lvs/s3;
    .locals 1

    sget-object v0, Lvs/t3;->DEFAULT_INSTANCE:Lvs/t3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/s3;

    return-object v0
.end method

.method public static z(Lvs/t3;Lvs/m3;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/t3;->keyData_:Lvs/m3;

    iget p1, p0, Lvs/t3;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvs/t3;->bitField0_:I

    return-void
.end method


# virtual methods
.method public final D()Lvs/m3;
    .locals 1

    iget-object v0, p0, Lvs/t3;->keyData_:Lvs/m3;

    if-nez v0, :cond_0

    invoke-static {}, Lvs/m3;->C()Lvs/m3;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final E()I
    .locals 1

    iget v0, p0, Lvs/t3;->keyId_:I

    return v0
.end method

.method public final F()Lvs/h4;
    .locals 1

    iget v0, p0, Lvs/t3;->outputPrefixType_:I

    invoke-static {v0}, Lvs/h4;->a(I)Lvs/h4;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvs/h4;->G:Lvs/h4;

    :cond_0
    return-object v0
.end method

.method public final G()Lvs/n3;
    .locals 2

    iget v0, p0, Lvs/t3;->status_:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lvs/n3;->E:Lvs/n3;

    goto :goto_0

    :cond_1
    sget-object v0, Lvs/n3;->z:Lvs/n3;

    goto :goto_0

    :cond_2
    sget-object v0, Lvs/n3;->y:Lvs/n3;

    goto :goto_0

    :cond_3
    sget-object v0, Lvs/n3;->x:Lvs/n3;

    :goto_0
    if-nez v0, :cond_4

    sget-object v0, Lvs/n3;->F:Lvs/n3;

    :cond_4
    return-object v0
.end method

.method public final H()Z
    .locals 2

    iget v0, p0, Lvs/t3;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
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
    sget-object p1, Lvs/t3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/t3;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/t3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/t3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/t3;->DEFAULT_INSTANCE:Lvs/t3;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/s3;

    sget-object v0, Lvs/t3;->DEFAULT_INSTANCE:Lvs/t3;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/t3;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "keyData_"

    const-string v1, "status_"

    const-string v2, "keyId_"

    const-string v3, "outputPrefixType_"

    filled-new-array {p1, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object v1, Lvs/t3;->DEFAULT_INSTANCE:Lvs/t3;

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
