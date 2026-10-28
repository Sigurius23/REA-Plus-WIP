.class public final Lvs/m3;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lvs/m3;

.field public static final KEY_MATERIAL_TYPE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1

.field public static final VALUE_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyMaterialType_:I

.field private typeUrl_:Ljava/lang/String;

.field private value_:Lcom/google/crypto/tink/shaded/protobuf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/m3;

    invoke-direct {v0}, Lvs/m3;-><init>()V

    sput-object v0, Lvs/m3;->DEFAULT_INSTANCE:Lvs/m3;

    const-class v1, Lvs/m3;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lvs/m3;->typeUrl_:Ljava/lang/String;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lvs/m3;->value_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static A(Lvs/m3;Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/m3;->value_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static B(Lvs/m3;Lvs/l3;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvs/l3;->G:Lvs/l3;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lvs/l3;->w:I

    iput p1, p0, Lvs/m3;->keyMaterialType_:I

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static C()Lvs/m3;
    .locals 1

    sget-object v0, Lvs/m3;->DEFAULT_INSTANCE:Lvs/m3;

    return-object v0
.end method

.method public static G()Lvs/k3;
    .locals 1

    sget-object v0, Lvs/m3;->DEFAULT_INSTANCE:Lvs/m3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/k3;

    return-object v0
.end method

.method public static z(Lvs/m3;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/m3;->typeUrl_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final D()Lvs/l3;
    .locals 2

    iget v0, p0, Lvs/m3;->keyMaterialType_:I

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
    sget-object v0, Lvs/l3;->F:Lvs/l3;

    goto :goto_0

    :cond_1
    sget-object v0, Lvs/l3;->E:Lvs/l3;

    goto :goto_0

    :cond_2
    sget-object v0, Lvs/l3;->z:Lvs/l3;

    goto :goto_0

    :cond_3
    sget-object v0, Lvs/l3;->y:Lvs/l3;

    goto :goto_0

    :cond_4
    sget-object v0, Lvs/l3;->x:Lvs/l3;

    :goto_0
    if-nez v0, :cond_5

    sget-object v0, Lvs/l3;->G:Lvs/l3;

    :cond_5
    return-object v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvs/m3;->typeUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public final F()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/m3;->value_:Lcom/google/crypto/tink/shaded/protobuf/i;

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
    sget-object p1, Lvs/m3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/m3;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/m3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/m3;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/m3;->DEFAULT_INSTANCE:Lvs/m3;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/k3;

    sget-object v0, Lvs/m3;->DEFAULT_INSTANCE:Lvs/m3;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/m3;

    invoke-direct {p1}, Lvs/m3;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "typeUrl_"

    const-string v0, "value_"

    const-string v1, "keyMaterialType_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    sget-object v1, Lvs/m3;->DEFAULT_INSTANCE:Lvs/m3;

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
