.class public final Lvs/f3;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field public static final AEAD_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lvs/f3;

.field public static final KDF_FIELD_NUMBER:I = 0x2

.field public static final KEM_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field


# instance fields
.field private aead_:I

.field private kdf_:I

.field private kem_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/f3;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sput-object v0, Lvs/f3;->DEFAULT_INSTANCE:Lvs/f3;

    const-class v1, Lvs/f3;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public static A(Lvs/f3;Lvs/a3;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvs/a3;->F:Lvs/a3;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lvs/a3;->w:I

    iput p1, p0, Lvs/f3;->kdf_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static B(Lvs/f3;Lvs/z2;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvs/z2;->F:Lvs/z2;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lvs/z2;->w:I

    iput p1, p0, Lvs/f3;->aead_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static D()Lvs/f3;
    .locals 1

    sget-object v0, Lvs/f3;->DEFAULT_INSTANCE:Lvs/f3;

    return-object v0
.end method

.method public static G()Lvs/e3;
    .locals 1

    sget-object v0, Lvs/f3;->DEFAULT_INSTANCE:Lvs/f3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/e3;

    return-object v0
.end method

.method public static z(Lvs/f3;Lvs/b3;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvs/b3;->G:Lvs/b3;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lvs/b3;->w:I

    iput p1, p0, Lvs/f3;->kem_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final C()Lvs/z2;
    .locals 2

    iget v0, p0, Lvs/f3;->aead_:I

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
    sget-object v0, Lvs/z2;->E:Lvs/z2;

    goto :goto_0

    :cond_1
    sget-object v0, Lvs/z2;->z:Lvs/z2;

    goto :goto_0

    :cond_2
    sget-object v0, Lvs/z2;->y:Lvs/z2;

    goto :goto_0

    :cond_3
    sget-object v0, Lvs/z2;->x:Lvs/z2;

    :goto_0
    if-nez v0, :cond_4

    sget-object v0, Lvs/z2;->F:Lvs/z2;

    :cond_4
    return-object v0
.end method

.method public final E()Lvs/a3;
    .locals 2

    iget v0, p0, Lvs/f3;->kdf_:I

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
    sget-object v0, Lvs/a3;->E:Lvs/a3;

    goto :goto_0

    :cond_1
    sget-object v0, Lvs/a3;->z:Lvs/a3;

    goto :goto_0

    :cond_2
    sget-object v0, Lvs/a3;->y:Lvs/a3;

    goto :goto_0

    :cond_3
    sget-object v0, Lvs/a3;->x:Lvs/a3;

    :goto_0
    if-nez v0, :cond_4

    sget-object v0, Lvs/a3;->F:Lvs/a3;

    :cond_4
    return-object v0
.end method

.method public final F()Lvs/b3;
    .locals 2

    iget v0, p0, Lvs/f3;->kem_:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lvs/b3;->F:Lvs/b3;

    goto :goto_0

    :cond_1
    sget-object v0, Lvs/b3;->E:Lvs/b3;

    goto :goto_0

    :cond_2
    sget-object v0, Lvs/b3;->z:Lvs/b3;

    goto :goto_0

    :cond_3
    sget-object v0, Lvs/b3;->y:Lvs/b3;

    goto :goto_0

    :cond_4
    sget-object v0, Lvs/b3;->x:Lvs/b3;

    :goto_0
    if-nez v0, :cond_5

    sget-object v0, Lvs/b3;->G:Lvs/b3;

    :cond_5
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
    sget-object p1, Lvs/f3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/f3;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/f3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/f3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/f3;->DEFAULT_INSTANCE:Lvs/f3;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/e3;

    sget-object v0, Lvs/f3;->DEFAULT_INSTANCE:Lvs/f3;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/f3;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "kem_"

    const-string v0, "kdf_"

    const-string v1, "aead_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u0003\u000c"

    sget-object v1, Lvs/f3;->DEFAULT_INSTANCE:Lvs/f3;

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
