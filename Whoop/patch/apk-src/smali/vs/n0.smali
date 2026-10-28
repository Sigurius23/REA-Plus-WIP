.class public final Lvs/n0;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lvs/n0;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/n0;

    invoke-direct {v0}, Lvs/n0;-><init>()V

    sput-object v0, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

    const-class v1, Lvs/n0;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lvs/n0;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static A(Lvs/n0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/n0;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static D()Lvs/m0;
    .locals 1

    sget-object v0, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/m0;

    return-object v0
.end method

.method public static E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/n0;
    .locals 1

    sget-object v0, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->t(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/n0;

    return-object p0
.end method

.method public static F()Lcom/google/crypto/tink/shaded/protobuf/v0;
    .locals 1

    sget-object v0, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->m()Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic z()Lvs/n0;
    .locals 1

    sget-object v0, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

    return-object v0
.end method


# virtual methods
.method public final B()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lvs/n0;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public final C()I
    .locals 1

    iget v0, p0, Lvs/n0;->version_:I

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
    sget-object p1, Lvs/n0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/n0;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/n0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/n0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/m0;

    invoke-direct {p1}, Lvs/m0;-><init>()V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/n0;

    invoke-direct {p1}, Lvs/n0;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "version_"

    const-string v0, "keyValue_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n"

    sget-object v1, Lvs/n0;->DEFAULT_INSTANCE:Lvs/n0;

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
