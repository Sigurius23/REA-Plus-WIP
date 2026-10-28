.class public final Lvs/i4;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field public static final CONFIG_NAME_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lvs/i4;

.field public static final ENTRY_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field


# instance fields
.field private configName_:Ljava/lang/String;

.field private entry_:Lcom/google/crypto/tink/shaded/protobuf/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/i4;

    invoke-direct {v0}, Lvs/i4;-><init>()V

    sput-object v0, Lvs/i4;->DEFAULT_INSTANCE:Lvs/i4;

    const-class v1, Lvs/i4;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lvs/i4;->configName_:Ljava/lang/String;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/y0;->z:Lcom/google/crypto/tink/shaded/protobuf/y0;

    iput-object v0, p0, Lvs/i4;->entry_:Lcom/google/crypto/tink/shaded/protobuf/a0;

    return-void
.end method

.method public static synthetic z()Lvs/i4;
    .locals 1

    sget-object v0, Lvs/i4;->DEFAULT_INSTANCE:Lvs/i4;

    return-object v0
.end method


# virtual methods
.method public final j(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lvs/i4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/i4;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/i4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/i4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/i4;->DEFAULT_INSTANCE:Lvs/i4;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/a1;

    invoke-direct {p1}, Lvs/a1;-><init>()V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/i4;

    invoke-direct {p1}, Lvs/i4;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "configName_"

    const-string v0, "entry_"

    const-class v1, Lvs/q3;

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b"

    sget-object v1, Lvs/i4;->DEFAULT_INSTANCE:Lvs/i4;

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
