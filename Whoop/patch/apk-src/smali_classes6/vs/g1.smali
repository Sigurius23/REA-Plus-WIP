.class public final Lvs/g1;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field public static final CURVE_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lvs/g1;

.field public static final ENCODING_FIELD_NUMBER:I = 0x3

.field public static final HASH_TYPE_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field


# instance fields
.field private curve_:I

.field private encoding_:I

.field private hashType_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/g1;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sput-object v0, Lvs/g1;->DEFAULT_INSTANCE:Lvs/g1;

    const-class v1, Lvs/g1;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public static A(Lvs/g1;Lvs/d2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lvs/d2;->b()I

    move-result p1

    iput p1, p0, Lvs/g1;->curve_:I

    return-void
.end method

.method public static B(Lvs/g1;Lvs/l1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lvs/l1;->a()I

    move-result p1

    iput p1, p0, Lvs/g1;->encoding_:I

    return-void
.end method

.method public static D()Lvs/g1;
    .locals 1

    sget-object v0, Lvs/g1;->DEFAULT_INSTANCE:Lvs/g1;

    return-object v0
.end method

.method public static G()Lvs/f1;
    .locals 1

    sget-object v0, Lvs/g1;->DEFAULT_INSTANCE:Lvs/g1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/f1;

    return-object v0
.end method

.method public static z(Lvs/g1;Lvs/g2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lvs/g2;->b()I

    move-result p1

    iput p1, p0, Lvs/g1;->hashType_:I

    return-void
.end method


# virtual methods
.method public final C()Lvs/d2;
    .locals 1

    iget v0, p0, Lvs/g1;->curve_:I

    invoke-static {v0}, Lvs/d2;->a(I)Lvs/d2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvs/d2;->G:Lvs/d2;

    :cond_0
    return-object v0
.end method

.method public final E()Lvs/l1;
    .locals 2

    iget v0, p0, Lvs/g1;->encoding_:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lvs/l1;->z:Lvs/l1;

    goto :goto_0

    :cond_1
    sget-object v0, Lvs/l1;->y:Lvs/l1;

    goto :goto_0

    :cond_2
    sget-object v0, Lvs/l1;->x:Lvs/l1;

    :goto_0
    if-nez v0, :cond_3

    sget-object v0, Lvs/l1;->E:Lvs/l1;

    :cond_3
    return-object v0
.end method

.method public final F()Lvs/g2;
    .locals 1

    iget v0, p0, Lvs/g1;->hashType_:I

    invoke-static {v0}, Lvs/g2;->a(I)Lvs/g2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvs/g2;->H:Lvs/g2;

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
    sget-object p1, Lvs/g1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/g1;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/g1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/g1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/g1;->DEFAULT_INSTANCE:Lvs/g1;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/f1;

    sget-object v0, Lvs/g1;->DEFAULT_INSTANCE:Lvs/g1;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/g1;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "hashType_"

    const-string v0, "curve_"

    const-string v1, "encoding_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u0003\u000c"

    sget-object v1, Lvs/g1;->DEFAULT_INSTANCE:Lvs/g1;

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
