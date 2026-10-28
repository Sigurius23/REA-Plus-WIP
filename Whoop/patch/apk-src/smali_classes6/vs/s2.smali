.class public final Lvs/s2;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lvs/s2;

.field public static final HASH_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field

.field public static final TAG_SIZE_FIELD_NUMBER:I = 0x2


# instance fields
.field private hash_:I

.field private tagSize_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/s2;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sput-object v0, Lvs/s2;->DEFAULT_INSTANCE:Lvs/s2;

    const-class v1, Lvs/s2;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public static A(Lvs/s2;I)V
    .locals 0

    iput p1, p0, Lvs/s2;->tagSize_:I

    return-void
.end method

.method public static B()Lvs/s2;
    .locals 1

    sget-object v0, Lvs/s2;->DEFAULT_INSTANCE:Lvs/s2;

    return-object v0
.end method

.method public static E()Lvs/r2;
    .locals 1

    sget-object v0, Lvs/s2;->DEFAULT_INSTANCE:Lvs/s2;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/r2;

    return-object v0
.end method

.method public static z(Lvs/s2;Lvs/g2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lvs/g2;->b()I

    move-result p1

    iput p1, p0, Lvs/s2;->hash_:I

    return-void
.end method


# virtual methods
.method public final C()Lvs/g2;
    .locals 1

    iget v0, p0, Lvs/s2;->hash_:I

    invoke-static {v0}, Lvs/g2;->a(I)Lvs/g2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvs/g2;->H:Lvs/g2;

    :cond_0
    return-object v0
.end method

.method public final D()I
    .locals 1

    iget v0, p0, Lvs/s2;->tagSize_:I

    return v0
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
    sget-object p1, Lvs/s2;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/s2;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/s2;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/s2;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/s2;->DEFAULT_INSTANCE:Lvs/s2;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/r2;

    sget-object v0, Lvs/s2;->DEFAULT_INSTANCE:Lvs/s2;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/s2;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "hash_"

    const-string v0, "tagSize_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000c\u0002\u000b"

    sget-object v1, Lvs/s2;->DEFAULT_INSTANCE:Lvs/s2;

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
