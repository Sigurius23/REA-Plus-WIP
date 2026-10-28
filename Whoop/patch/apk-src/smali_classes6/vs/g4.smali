.class public final Lvs/g4;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lvs/g4;

.field public static final DEK_TEMPLATE_FIELD_NUMBER:I = 0x2

.field public static final KEK_URI_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v0;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private dekTemplate_:Lvs/p3;

.field private kekUri_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvs/g4;

    invoke-direct {v0}, Lvs/g4;-><init>()V

    sput-object v0, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

    const-class v1, Lvs/g4;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lvs/g4;->kekUri_:Ljava/lang/String;

    return-void
.end method

.method public static A(Lvs/g4;Lvs/p3;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/g4;->dekTemplate_:Lvs/p3;

    iget p1, p0, Lvs/g4;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvs/g4;->bitField0_:I

    return-void
.end method

.method public static B()Lvs/g4;
    .locals 1

    sget-object v0, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

    return-object v0
.end method

.method public static E()Lvs/f4;
    .locals 1

    sget-object v0, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/f4;

    return-object v0
.end method

.method public static F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/g4;
    .locals 1

    sget-object v0, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->t(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/g4;

    return-object p0
.end method

.method public static z(Lvs/g4;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvs/g4;->kekUri_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final C()Lvs/p3;
    .locals 1

    iget-object v0, p0, Lvs/g4;->dekTemplate_:Lvs/p3;

    if-nez v0, :cond_0

    invoke-static {}, Lvs/p3;->C()Lvs/p3;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvs/g4;->kekUri_:Ljava/lang/String;

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
    sget-object p1, Lvs/g4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_1

    const-class v0, Lvs/g4;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lvs/g4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lvs/g4;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/v0;

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
    sget-object p1, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

    return-object p1

    :pswitch_2
    new-instance p1, Lvs/f4;

    sget-object v0, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lvs/g4;

    invoke-direct {p1}, Lvs/g4;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string v0, "kekUri_"

    const-string v1, "dekTemplate_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000"

    sget-object v1, Lvs/g4;->DEFAULT_INSTANCE:Lvs/g4;

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
