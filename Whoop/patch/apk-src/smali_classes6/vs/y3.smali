.class public final Lvs/y3;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lvs/y3;

.field public static final KEY_INFO_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field

.field public static final PRIMARY_KEY_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0;"
        }
    .end annotation
.end field

.field private primaryKeyId_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/y3;

    invoke-direct {v0}, Lvs/y3;-><init>()V

    sput-object v0, Lvs/y3;->DEFAULT_INSTANCE:Lvs/y3;

    const-class v1, Lvs/y3;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/y0;->z:Lcom/google/crypto/tink/shaded/protobuf/y0;

    iput-object v0, p0, Lvs/y3;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0;

    return-void
.end method

.method public static A(Lvs/y3;Lvs/x3;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lvs/y3;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0;

    move-object v1, v0

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/b;

    iget-boolean v1, v1, Lcom/google/crypto/tink/shaded/protobuf/b;->w:Z

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a0;->i(I)Lcom/google/crypto/tink/shaded/protobuf/a0;

    move-result-object v0

    iput-object v0, p0, Lvs/y3;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0;

    :cond_1
    iget-object p0, p0, Lvs/y3;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static C()Lvs/v3;
    .locals 1

    sget-object v0, Lvs/y3;->DEFAULT_INSTANCE:Lvs/y3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/v3;

    return-object v0
.end method

.method public static z(Lvs/y3;I)V
    .locals 0

    iput p1, p0, Lvs/y3;->primaryKeyId_:I

    return-void
.end method


# virtual methods
.method public final B()Lvs/x3;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lvs/y3;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvs/x3;

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
    sget-object p1, Lvs/y3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/y3;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/y3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/y3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/y3;->DEFAULT_INSTANCE:Lvs/y3;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/v3;

    sget-object v0, Lvs/y3;->DEFAULT_INSTANCE:Lvs/y3;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/y3;

    invoke-direct {p1}, Lvs/y3;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "primaryKeyId_"

    const-string v0, "keyInfo_"

    const-class v1, Lvs/x3;

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object v1, Lvs/y3;->DEFAULT_INSTANCE:Lvs/y3;

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
