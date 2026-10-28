.class public Lgm/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/b;
.implements Lorg/webrtc/RTCStatsCollectorCallback;
.implements Lhn/k;
.implements Lhg/c;
.implements Lhg/g;
.implements Loa3/p;
.implements Log/g;


# static fields
.field public static E:Lgm/r;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, Lgm/r;->w:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, La0/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, La0/a0;-><init>(I)V

    .line 59
    iput-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgm/r;->w:I

    const/4 p1, 0x0

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lgm/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lab/i0;Lad3/c;Lqy/d;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lgm/r;->w:I

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 13
    iput-object p3, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lgm/r;->w:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lm/k0;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    .line 39
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 40
    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Lgm/r;->w:I

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 44
    sget v0, Llo/y;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 45
    invoke-virtual {p1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 46
    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const/16 v0, 0x16

    iput v0, p0, Lgm/r;->w:I

    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    const-string v1, "scope"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 29
    iput-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 30
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li93/j;[Ljava/util/List;Ljava/lang/reflect/Method;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lgm/r;->w:I

    const-string v0, "argumentRange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lgm/r;->w:I

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lgm/r;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x14

    iput v0, p0, Lgm/r;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgm/r;

    const/16 v1, 0x13

    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lgm/r;-><init>(IZ)V

    .line 6
    iput-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    iput-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lo30/f;Ln30/c;)V
    .locals 3

    const/16 v0, 0x18

    iput v0, p0, Lgm/r;->w:I

    .line 14
    new-instance v0, Lng3/o;

    const/4 v1, 0x6

    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, v1, v2}, Lng3/o;-><init>(IZ)V

    .line 16
    new-instance v1, Ld1/j;

    invoke-direct {v1, p1, p2}, Ld1/j;-><init>(Lo30/f;Ln30/c;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 19
    iput-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq83/j;Log/g;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lgm/r;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 55
    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 56
    iput-object p3, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt23/c0;Lt23/b4;Lhc3/d;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lgm/r;->w:I

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 24
    const-string p1, "CallEventObserver"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt9/r;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lgm/r;->w:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxl/a;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lgm/r;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 9
    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxl/a;Lhc3/d;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lgm/r;->w:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 32
    const-string p1, "CallServiceNotificationManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxl/a;Loa3/r;)V
    .locals 1

    const/16 v0, 0x19

    iput v0, p0, Lgm/r;->w:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    iput-object p2, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz7/a;Lhg/j;Ljg/b;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lgm/r;->w:I

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p3, p0, Lgm/r;->x:Ljava/lang/Object;

    .line 51
    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    .line 52
    iput-object p2, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public static I(Landroid/content/Context;)Lgm/r;
    .locals 2

    sget-object v0, Lgm/r;->E:Lgm/r;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lgm/r;

    const-string v1, "location"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    invoke-direct {v0, p0, v1}, Lgm/r;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v0, Lgm/r;->E:Lgm/r;

    :cond_0
    sget-object p0, Lgm/r;->E:Lgm/r;

    return-object p0
.end method

.method public static J(Lyy/n0;)Lcom/stripe/android/core/exception/StripeException;
    .locals 8

    iget-object v0, p0, Lyy/n0;->f:Lyy/f0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lyy/f0;->a:Ljava/lang/String;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget v2, p0, Lyy/n0;->a:I

    invoke-static {p0}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lwy/a;->b(Lorg/json/JSONObject;)Lqy/f;

    move-result-object v7

    const/16 p0, 0xca

    if-eq v2, p0, :cond_4

    const/16 p0, 0x1ad

    if-eq v2, p0, :cond_3

    const/16 p0, 0x190

    if-eq v2, p0, :cond_4

    const/16 p0, 0x191

    if-eq v2, p0, :cond_2

    const/16 p0, 0x193

    if-eq v2, p0, :cond_1

    const/16 p0, 0x194

    if-eq v2, p0, :cond_4

    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    const/4 v6, 0x0

    const/16 v3, 0x18

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-object v1

    :cond_1
    new-instance p0, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {p0, v7, v4}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lqy/f;Ljava/lang/String;)V

    return-object p0

    :cond_2
    new-instance p0, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {p0, v7, v4}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lqy/f;Ljava/lang/String;)V

    return-object p0

    :cond_3
    new-instance p0, Lcom/stripe/android/core/exception/RateLimitException;

    const/16 v0, 0xc

    invoke-direct {p0, v7, v4, v0}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lqy/f;Ljava/lang/String;I)V

    return-object p0

    :cond_4
    new-instance v1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/4 v6, 0x0

    const/16 v3, 0x18

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-object v1
.end method

.method public static L(Lio/getstream/video/android/core/notifications/internal/service/CallService;Lio/getstream/video/android/model/StreamCallId;ILandroid/app/Notification;)V
    .locals 1

    const-string v0, "notification"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.POST_NOTIFICATIONS"

    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Lt23/i3;->b:Lt23/j3;

    if-eqz p0, :cond_0

    check-cast p0, Lt23/b4;

    invoke-virtual {p0}, Lt23/b4;->c()Ld1/j;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p2, p3, p1}, Ld1/j;->C(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;)V
    .locals 4

    new-instance v0, Lot/f;

    iget-object v1, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    iget-object v2, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    iget-object v3, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v3, Llt/c;

    invoke-direct {v0, p2, v1, v2, v3}, Lot/f;-><init>(Ljava/io/ByteArrayOutputStream;Ljava/util/HashMap;Ljava/util/HashMap;Llt/c;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llt/c;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1, v0}, Llt/a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p2, Lcom/google/firebase/encoders/EncodingException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No encoder for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public B(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 47

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "acsPublicKey"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "directoryServerId"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v2, Ljava/security/interfaces/RSAPublicKey;

    const-string v5, "The JWE algorithm \"alg\" cannot be \"none\""

    const-string v6, "serialize(...)"

    if-eqz v4, :cond_1

    iget-object v3, v1, Lgm/r;->x:Ljava/lang/Object;

    check-cast v3, Lng3/o;

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lgw/l;

    sget-object v8, Lgw/i;->E:Lgw/i;

    sget-object v9, Lgw/f;->z:Lgw/f;

    iget-object v4, v8, Lgw/a;->w:Ljava/lang/String;

    sget-object v7, Lgw/a;->x:Lgw/a;

    iget-object v7, v7, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lgw/k;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v19, p4

    invoke-direct/range {v7 .. v33}, Lgw/k;-><init>(Lgw/a;Lgw/f;Lgw/h;Ljava/lang/String;Ljava/util/HashSet;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/lang/String;Lnw/d;Lgw/d;Lxw/b;Lxw/b;Lxw/b;ILxw/b;Lxw/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;Lxw/b;)V

    new-instance v4, Lgw/r;

    invoke-direct {v4, v0}, Lgw/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v7, v4}, Lgw/l;-><init>(Lgw/k;Lgw/r;)V

    new-instance v0, Lhw/e;

    invoke-direct {v0, v2}, Lhw/e;-><init>(Ljava/security/interfaces/RSAPublicKey;)V

    invoke-virtual {v3, v0}, Lgw/l;->b(Lgw/j;)V

    invoke-virtual {v3}, Lgw/l;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v4, v2, Ljava/security/interfaces/ECPublicKey;

    if-eqz v4, :cond_11

    iget-object v4, v1, Lgm/r;->y:Ljava/lang/Object;

    check-cast v4, Ld1/j;

    check-cast v2, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v8, Lyw/a;->x:I

    const/4 v8, -0x1

    invoke-static {v8, v0}, Lxw/d;->i(ILjava/lang/String;)Ljava/util/Map;

    move-result-object v9

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13

    const-string v14, "aud"

    const-string v15, "sub"

    const-string v8, "nbf"

    const-string v7, "jti"

    move-object/from16 v16, v11

    const-string v11, "iss"

    move/from16 v17, v13

    const-string v13, "iat"

    const-string v1, "exp"

    sparse-switch v17, :sswitch_data_0

    :goto_1
    move-object/from16 v18, v5

    const/16 v17, -0x1

    goto :goto_3

    :sswitch_0
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_2

    goto :goto_1

    :cond_2
    const/16 v17, 0x6

    goto :goto_2

    :sswitch_1
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_3

    goto :goto_1

    :cond_3
    const/16 v17, 0x5

    goto :goto_2

    :sswitch_2
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_4

    goto :goto_1

    :cond_4
    const/16 v17, 0x4

    goto :goto_2

    :sswitch_3
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_5

    goto :goto_1

    :cond_5
    const/16 v17, 0x3

    goto :goto_2

    :sswitch_4
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_6

    goto :goto_1

    :cond_6
    const/16 v17, 0x2

    goto :goto_2

    :sswitch_5
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_7

    goto :goto_1

    :cond_7
    const/16 v17, 0x1

    :goto_2
    move-object/from16 v18, v5

    goto :goto_3

    :sswitch_6
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_8

    goto :goto_1

    :cond_8
    move-object/from16 v18, v5

    const/16 v17, 0x0

    :goto_3
    const-class v5, Ljava/lang/String;

    packed-switch v17, :pswitch_data_0

    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v10, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :pswitch_0
    invoke-interface {v9, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_9

    invoke-static {v9, v15, v5}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v10, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :cond_9
    instance-of v5, v1, Ljava/lang/Number;

    if-eqz v5, :cond_a

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_a
    if-nez v1, :cond_b

    const/4 v1, 0x0

    invoke-interface {v10, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Illegal sub claim"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_1
    invoke-static {v8, v9}, Lxw/d;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Date;

    move-result-object v1

    invoke-interface {v10, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :pswitch_2
    invoke-static {v9, v7, v5}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v10, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :pswitch_3
    invoke-static {v9, v11, v5}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v10, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :pswitch_4
    invoke-static {v13, v9}, Lxw/d;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Date;

    move-result-object v1

    invoke-interface {v10, v13, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :pswitch_5
    invoke-static {v1, v9}, Lxw/d;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Date;

    move-result-object v5

    invoke-interface {v10, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :pswitch_6
    invoke-interface {v9, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_c

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v9, v14, v5}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v10, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_c
    instance-of v5, v1, Ljava/util/List;

    if-eqz v5, :cond_d

    invoke-static {v14, v9}, Lxw/d;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v10, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_d
    if-nez v1, :cond_e

    const/4 v1, 0x0

    invoke-interface {v10, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    move-object/from16 v1, p0

    move-object/from16 v11, v16

    move-object/from16 v5, v18

    const/4 v8, -0x1

    goto/16 :goto_0

    :cond_e
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Illegal aud claim"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_f
    move-object/from16 v18, v5

    new-instance v1, Lyw/a;

    invoke-direct {v1, v10}, Lyw/a;-><init>(Ljava/util/LinkedHashMap;)V

    iget-object v1, v4, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lo30/f;

    invoke-virtual {v1}, Lo30/f;->a()Ljava/security/KeyPair;

    move-result-object v1

    iget-object v4, v4, Ld1/j;->y:Ljava/lang/Object;

    check-cast v4, Lo30/e;

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/security/interfaces/ECPrivateKey;

    invoke-virtual {v4, v2, v5, v3}, Lo30/e;->a(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v2

    sget-object v3, Lnw/a;->y:Lnw/a;

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v4

    invoke-interface {v4}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v4

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v5

    invoke-virtual {v5}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v5

    invoke-static {v4, v5}, Lnw/b;->e(ILjava/math/BigInteger;)Lxw/b;

    move-result-object v21

    invoke-interface {v1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v4

    invoke-interface {v4}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v4

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v4, v1}, Lnw/b;->e(ILjava/math/BigInteger;)Lxw/b;

    move-result-object v22

    const-string v1, "The curve must not be null"

    invoke-static {v3, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    new-instance v19, Lnw/b;

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v26, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v20, v3

    invoke-direct/range {v19 .. v34}, Lnw/b;-><init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Lgw/i;->K:Lgw/i;

    sget-object v22, Lgw/f;->z:Lgw/f;

    iget-object v3, v1, Lgw/a;->w:Ljava/lang/String;

    sget-object v4, Lgw/a;->x:Lgw/a;

    iget-object v4, v4, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    invoke-static/range {v22 .. v22}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Lnw/b;->d()Ljava/util/HashMap;

    move-result-object v3

    invoke-static {v3}, Lxw/d;->j(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    invoke-static {v4, v3}, Lxw/d;->i(ILjava/lang/String;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lnw/b;->h(Ljava/util/Map;)Lnw/b;

    move-result-object v33

    new-instance v20, Lgw/k;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    move-object/from16 v21, v1

    invoke-direct/range {v20 .. v46}, Lgw/k;-><init>(Lgw/a;Lgw/f;Lgw/h;Ljava/lang/String;Ljava/util/HashSet;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/lang/String;Lnw/d;Lgw/d;Lxw/b;Lxw/b;Lxw/b;ILxw/b;Lxw/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;Lxw/b;)V

    move-object/from16 v1, v20

    new-instance v3, Lgw/l;

    new-instance v4, Lgw/r;

    invoke-direct {v4, v0}, Lgw/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v1, v4}, Lgw/l;-><init>(Lgw/k;Lgw/r;)V

    new-instance v0, Lhw/b;

    invoke-direct {v0, v2}, Ljw/c;-><init>(Ljavax/crypto/SecretKey;)V

    invoke-virtual {v3, v0}, Lgw/l;->b(Lgw/j;)V

    invoke-virtual {v3}, Lgw/l;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    move-object/from16 v1, v18

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_11
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-interface {v2}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unsupported public key algorithm: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    move-object/from16 v2, p0

    if-eqz v1, :cond_12

    iget-object v3, v2, Lgm/r;->z:Ljava/lang/Object;

    check-cast v3, Ln30/c;

    invoke-virtual {v3, v1}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_12
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x17ab0 -> :sswitch_6
        0x18a1d -> :sswitch_5
        0x1965c -> :sswitch_4
        0x19889 -> :sswitch_3
        0x19c5f -> :sswitch_2
        0x1a932 -> :sswitch_1
        0x1be40 -> :sswitch_0
    .end sparse-switch

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

.method public C(Lyy/g;Lwc3/c;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lnz/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lnz/a;

    iget v1, v0, Lnz/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnz/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnz/a;

    invoke-direct {v0, p0, p3}, Lnz/a;-><init>(Lgm/r;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lnz/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lnz/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lnq0/m;

    const/4 v2, 0x1

    invoke-direct {p3, v2, p0, p2}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lnz/a;->y:I

    invoke-virtual {p0, p1, p3, v0}, Lgm/r;->D(Lyy/m0;Lnq0/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public D(Lyy/m0;Lnq0/m;Ls83/c;)Ljava/lang/Object;
    .locals 8

    const-string v0, "Failed to execute "

    instance-of v1, p3, Lnz/b;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lnz/b;

    iget v2, v1, Lnz/b;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lnz/b;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lnz/b;

    invoke-direct {v1, p0, p3}, Lnz/b;-><init>(Lgm/r;Ls83/c;)V

    :goto_0
    iget-object p3, v1, Lnz/b;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lnz/b;->F:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p2, v1, Lnz/b;->y:Lnq0/m;

    iget-object p1, v1, Lnz/b;->x:Lyy/m0;

    iget-object v1, v1, Lnz/b;->w:Lgm/r;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast p3, Lqy/d;

    invoke-virtual {p1}, Lyy/m0;->getMethod()Lyy/k0;

    move-result-object v3

    iget-object v3, v3, Lyy/k0;->w:Ljava/lang/String;

    invoke-virtual {p1}, Lyy/m0;->getUrl()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Executing "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " request to "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Lqy/d;->a(Ljava/lang/String;)V

    :try_start_1
    iget-object p3, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast p3, Lab/i0;

    iput-object p0, v1, Lnz/b;->w:Lgm/r;

    iput-object p1, v1, Lnz/b;->x:Lyy/m0;

    iput-object p2, v1, Lnz/b;->y:Lnq0/m;

    iput v4, v1, Lnz/b;->F:I

    invoke-virtual {p3, p1, v1}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v2, :cond_3

    return-object v2

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast p3, Lyy/n0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p3

    move-object v1, p0

    :goto_2
    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_3
    instance-of v2, p3, Ll83/m;

    if-nez v2, :cond_6

    :try_start_3
    check-cast p3, Lyy/n0;

    iget-boolean v2, p3, Lyy/n0;->e:Z

    if-nez v2, :cond_5

    iget-object p3, p3, Lyy/n0;->b:Ljava/lang/Object;

    if-eqz p3, :cond_4

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_4
    move-object p3, p2

    goto :goto_6

    :catchall_2
    move-exception p2

    goto :goto_5

    :cond_4
    const-string p2, "Required value was null."

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Lgm/r;->J(Lyy/n0;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p2

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_5
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    goto :goto_4

    :cond_6
    :goto_6
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_7

    :cond_7
    :try_start_4
    new-instance p3, Lcom/stripe/android/core/exception/APIConnectionException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_7
    return-object p3
.end method

.method public E()J
    .locals 2

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Lt9/k;

    if-eqz v0, :cond_0

    iget-wide v0, v0, Lt9/k;->z:J

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public F()Lio/sentry/e5;
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/e5;

    return-object v0
.end method

.method public G()Lio/sentry/hints/c;
    .locals 1

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Lio/sentry/hints/c;

    return-object v0
.end method

.method public H()Lio/sentry/g0;
    .locals 1

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/g0;

    return-object v0
.end method

.method public K(Lz8/f;Landroid/net/Uri;Ljava/util/Map;JJLl9/s0;)V
    .locals 7

    new-instance v1, Lt9/k;

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p6

    invoke-direct/range {v1 .. v6}, Lt9/k;-><init>(Lu8/h;JJ)V

    iput-object v1, p0, Lgm/r;->z:Ljava/lang/Object;

    iget-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast p1, Lt9/n;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast p1, Lt9/r;

    invoke-interface {p1, p2, p3}, Lt9/r;->c(Landroid/net/Uri;Ljava/util/Map;)[Lt9/n;

    move-result-object p1

    array-length p3, p1

    sget-object p4, Lzr/g0;->x:Lzr/e0;

    const-string p4, "expectedSize"

    invoke-static {p3, p4}, Lzr/q;->c(ILjava/lang/String;)V

    new-instance p4, Lzr/d0;

    invoke-direct {p4, p3}, Lzr/a0;-><init>(I)V

    array-length p3, p1

    const/4 p5, 0x1

    const/4 p6, 0x0

    if-ne p3, p5, :cond_1

    aget-object p1, p1, p6

    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    goto/16 :goto_7

    :cond_1
    array-length p3, p1

    move p7, p6

    :goto_0
    if-ge p7, p3, :cond_7

    aget-object v0, p1, p7

    :try_start_0
    invoke-interface {v0, v1}, Lt9/n;->h(Lt9/o;)Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v0, p0, Lgm/r;->y:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput p6, v1, Lt9/k;->F:I

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-interface {v0}, Lt9/n;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p4, v0}, Lzr/a0;->c(Ljava/lang/Iterable;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Lt9/n;

    if-nez v0, :cond_4

    iget-wide v5, v1, Lt9/k;->z:J

    cmp-long v0, v5, v3

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v0, p6

    goto :goto_2

    :cond_4
    :goto_1
    move v0, p5

    :goto_2
    invoke-static {v0}, Lva3/g;->i(Z)V

    iput p6, v1, Lt9/k;->F:I

    goto :goto_5

    :goto_3
    iget-object p2, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast p2, Lt9/n;

    if-nez p2, :cond_6

    iget-wide p2, v1, Lt9/k;->z:J

    cmp-long p2, p2, v3

    if-nez p2, :cond_5

    goto :goto_4

    :cond_5
    move p5, p6

    :cond_6
    :goto_4
    invoke-static {p5}, Lva3/g;->i(Z)V

    iput p6, v1, Lt9/k;->F:I

    throw p1

    :catch_0
    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Lt9/n;

    if-nez v0, :cond_4

    iget-wide v5, v1, Lt9/k;->z:J

    cmp-long v0, v5, v3

    if-nez v0, :cond_3

    goto :goto_1

    :goto_5
    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    :cond_7
    :goto_6
    iget-object p3, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast p3, Lt9/n;

    if-eqz p3, :cond_8

    :goto_7
    iget-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast p1, Lt9/n;

    invoke-interface {p1, p8}, Lt9/n;->g(Lt9/q;)V

    return-void

    :cond_8
    new-instance p3, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;

    new-instance p7, Ljava/lang/StringBuilder;

    const-string p8, "None of the available extractors ("

    invoke-direct {p7, p8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance p8, Ldb/j0;

    const/16 v0, 0xf

    const-string v1, ", "

    invoke-direct {p8, v1, v0}, Ldb/j0;-><init>(Ljava/lang/String;I)V

    invoke-static {p1}, Lzr/g0;->n([Ljava/lang/Object;)Lzr/w0;

    move-result-object p1

    new-instance v0, Li7/g;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    invoke-static {p1, v0}, Lzr/q;->t(Ljava/util/List;Lyr/e;)Ljava/util/AbstractList;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p8, v0, p1}, Ldb/j0;->c(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") could read the stream."

    invoke-virtual {p7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Lzr/d0;->f()Lzr/w0;

    move-result-object p2

    const/4 p4, 0x0

    invoke-direct {p3, p1, p4, p6, p5}, Landroidx/media3/common/ParserException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    invoke-static {p2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    throw p3
.end method

.method public M()Lkg/f;
    .locals 1

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Lm83/m;

    invoke-virtual {v0}, Lm83/m;->q()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkg/f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lxl/a;

    invoke-virtual {v0}, Lxl/a;->x()Lkg/f;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public N(Ljava/lang/String;La33/c;Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    instance-of v1, p3, Ln53/b2;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Ln53/b2;

    iget v2, v1, Ln53/b2;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ln53/b2;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Ln53/b2;

    invoke-direct {v1, p0, p3}, Ln53/b2;-><init>(Lgm/r;Ls83/c;)V

    :goto_0
    iget-object p3, v1, Ln53/b2;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ln53/b2;->F:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Ln53/b2;->y:Lbc3/i0;

    iget-object p2, v1, Ln53/b2;->x:Ljava/lang/String;

    iget-object v0, v1, Ln53/b2;->w:Lgm/r;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto/16 :goto_5

    :catchall_0
    move-exception p3

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p3

    if-eqz p3, :cond_4

    new-instance p1, Lkotlinx/coroutines/channels/ClosedSendChannelException;

    const-string p2, "SingleFlight is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lbc3/i0;

    if-eqz p3, :cond_6

    :try_start_2
    iput v5, v1, Ln53/b2;->F:I

    invoke-interface {p3, v1}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object p1

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p3, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast p3, Lbc3/c0;

    sget-object v3, Lbc3/d0;->w:Lbc3/d0;

    new-instance v3, Lh00/v;

    const/4 v6, 0x0

    invoke-direct {v3, v4, p2, v6}, Lh00/v;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {p3, v6, v3, v5}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lbc3/i0;

    if-nez p3, :cond_7

    invoke-virtual {p2}, Lbc3/t1;->start()Z

    goto :goto_3

    :cond_7
    move-object p2, p3

    :goto_3
    :try_start_3
    iput-object p0, v1, Ln53/b2;->w:Lgm/r;

    iput-object p1, v1, Ln53/b2;->x:Ljava/lang/String;

    iput-object p2, v1, Ln53/b2;->y:Lbc3/i0;

    iput v4, v1, Ln53/b2;->F:I

    invoke-interface {p2, v1}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p3, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    move-object v0, p0

    :goto_5
    :try_start_4
    check-cast p3, Ll83/n;

    iget-object p3, p3, Ll83/n;->w:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_6
    iget-object v0, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object p3

    :catchall_2
    move-exception p3

    goto :goto_7

    :catchall_3
    move-exception p3

    move-object v0, p0

    :goto_7
    :try_start_5
    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception p3

    iget-object v0, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p3
.end method

.method public O(Lgm/i;IZ)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    iget-object v3, v1, Lgm/r;->z:Ljava/lang/Object;

    check-cast v3, Lmm/a;

    new-instance v4, Landroid/content/ComponentName;

    iget-object v5, v1, Lgm/r;->x:Ljava/lang/Object;

    check-cast v5, Landroid/content/Context;

    const-class v6, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "jobscheduler"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/app/job/JobScheduler;

    new-instance v7, Ljava/util/zip/Adler32;

    invoke-direct {v7}, Ljava/util/zip/Adler32;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const-string v8, "UTF-8"

    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    iget-object v5, v0, Lgm/i;->a:Ljava/lang/String;

    iget-object v9, v0, Lgm/i;->a:Ljava/lang/String;

    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    iget-object v8, v0, Lgm/i;->c:Ldm/d;

    invoke-static {v8}, Lqm/a;->a(Ldm/d;)I

    move-result v10

    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    iget-object v5, v0, Lgm/i;->b:[B

    if-eqz v5, :cond_0

    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    :cond_0
    invoke-virtual {v7}, Ljava/util/zip/Adler32;->getValue()J

    move-result-wide v10

    long-to-int v7, v10

    const-string v10, "JobInfoScheduler"

    const-string v11, "attemptNumber"

    if-nez p3, :cond_2

    invoke-virtual {v6}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/app/job/JobInfo;

    invoke-virtual {v13}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v14

    invoke-virtual {v14, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v13}, Landroid/app/job/JobInfo;->getId()I

    move-result v13

    if-ne v13, v7, :cond_1

    if-lt v14, v2, :cond_2

    const-string v2, "Upload for context %s is already scheduled. Returning..."

    invoke-static {v0, v10, v2}, Ldp/d;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v12, v1, Lgm/r;->y:Ljava/lang/Object;

    check-cast v12, Lnm/d;

    check-cast v12, Lnm/i;

    invoke-virtual {v12}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12

    invoke-static {v8}, Lqm/a;->a(Ldm/d;)I

    move-result v13

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    filled-new-array {v9, v13}, [Ljava/lang/String;

    move-result-object v13

    const-string v14, "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"

    invoke-virtual {v12, v14, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v12

    :try_start_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    move-result v13

    const/4 v14, 0x0

    if-eqz v13, :cond_3

    invoke-interface {v12, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    goto :goto_0

    :cond_3
    const-wide/16 v15, 0x0

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    new-instance v12, Landroid/app/job/JobInfo$Builder;

    invoke-direct {v12, v7, v4}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    move-object v4, v6

    move/from16 v16, v7

    invoke-virtual {v3, v8, v14, v15, v2}, Lmm/a;->a(Ldm/d;JI)J

    move-result-wide v6

    invoke-virtual {v12, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    iget-object v6, v3, Lmm/a;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmm/b;

    iget-object v6, v6, Lmm/b;->c:Ljava/util/Set;

    sget-object v7, Lmm/c;->w:Lmm/c;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    const/4 v1, 0x1

    if-eqz v7, :cond_4

    const/4 v7, 0x2

    invoke-virtual {v12, v7}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    goto :goto_1

    :cond_4
    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    :goto_1
    sget-object v7, Lmm/c;->y:Lmm/c;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    :cond_5
    sget-object v7, Lmm/c;->x:Lmm/c;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    :cond_6
    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    invoke-virtual {v1, v11, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "backendName"

    invoke-virtual {v1, v6, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "priority"

    invoke-static {v8}, Lqm/a;->a(Ldm/d;)I

    move-result v7

    invoke-virtual {v1, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-eqz v5, :cond_7

    const-string v6, "extras"

    const/4 v7, 0x0

    invoke-static {v5, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v8, v14, v15, v2}, Lmm/a;->a(Ldm/d;JI)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v3, v13, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "TRuntime."

    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    invoke-virtual {v12}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public P(Ljava/lang/Integer;)V
    .locals 1

    iget v0, p0, Lgm/r;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void

    :pswitch_1
    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void

    :pswitch_2
    iput-object p1, p0, Lgm/r;->z:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public Q(Lro/i;)V
    .locals 1

    iget v0, p0, Lgm/r;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void

    :pswitch_1
    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void

    :pswitch_2
    iput-object p1, p0, Lgm/r;->y:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public R(Lgs/n;)V
    .locals 0

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public S(Lgs/q;)V
    .locals 0

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public T(Lgs/t;)V
    .locals 0

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public U(Lls/d;)V
    .locals 0

    iput-object p1, p0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public V()V
    .locals 3

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Lxl/a;

    iget-object v1, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Loa3/r;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public W(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lgm/r;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgm/r;-><init>(IZ)V

    iget-object v1, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    iput-object v0, v1, Lgm/r;->z:Ljava/lang/Object;

    iput-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    iput-object p1, v0, Lgm/r;->y:Ljava/lang/Object;

    iput-object p2, v0, Lgm/r;->x:Ljava/lang/Object;

    return-void
.end method

.method public a(IIJI)V
    .locals 8

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/media/MediaCodec;

    const/4 v3, 0x0

    move v2, p1

    move v4, p2

    move-wide v5, p3

    move v7, p5

    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public c(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public d(IJ)V
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public e()I
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v0

    return v0
.end method

.method public f(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 5

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    :cond_0
    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v1

    const/4 v2, -0x3

    if-ne v1, v2, :cond_1

    sget v3, Llo/y;->a:I

    const/16 v4, 0x15

    if-ge v3, v4, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lgm/r;->z:Ljava/lang/Object;

    :cond_1
    if-eq v1, v2, :cond_0

    return v1
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    return-void
.end method

.method public g(Log/b;)Log/e;
    .locals 1

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Log/g;

    invoke-interface {v0, p1}, Log/g;->g(Log/b;)Log/e;

    move-result-object p1

    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lgm/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnm/d;

    iget-object v2, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v2, Lg73/d;

    invoke-virtual {v2}, Lg73/d;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmm/a;

    new-instance v3, Lgm/r;

    const/16 v4, 0x12

    invoke-direct {v3, v0, v1, v2, v4}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v3

    :pswitch_0
    new-instance v6, Lng3/n;

    const/16 v0, 0xe

    invoke-direct {v6, v0}, Lng3/n;-><init>(I)V

    new-instance v7, Lng3/o;

    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-direct {v7, v0, v1}, Lng3/o;-><init>(IZ)V

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    invoke-virtual {v0}, Lb30/m;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Llm/b;

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0}, Lm63/d;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lev/i;

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, La00/g;

    invoke-virtual {v0}, La00/g;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, La00/g;

    new-instance v5, Lgm/q;

    invoke-direct/range {v5 .. v10}, Lgm/q;-><init>(Lpm/a;Lpm/a;Llm/b;Lev/i;La00/g;)V

    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getInputBuffer(I)Ljava/nio/ByteBuffer;
    .locals 2

    sget v0, Llo/y;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getOutputBuffer(I)Ljava/nio/ByteBuffer;
    .locals 2

    sget v0, Llo/y;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, [Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getOutputFormat()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Ljg/b;

    invoke-virtual {v0}, Ljg/b;->h()I

    move-result v0

    return v0
.end method

.method public i(Lva3/c;Lw93/a;)Loa3/n;
    .locals 2

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Lxl/a;

    iget-object v0, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/k0;

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/crypto/tink/internal/k0;->G(Lva3/c;Lw93/a;Ljava/util/List;)Lm63/d;

    move-result-object p1

    return-object p1
.end method

.method public j(Log/b;)Z
    .locals 1

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Log/g;

    invoke-interface {v0, p1}, Log/g;->j(Log/b;)Z

    move-result p1

    return p1
.end method

.method public n(Ljava/lang/Throwable;Lc93/a;)V
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object v1, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Log/b;->x:Log/b;

    invoke-static {v0, v2, v1, p1, p2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Ljg/b;

    invoke-virtual {v0}, Ljg/b;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onStatsDelivered(Lorg/webrtc/RTCStatsReport;)V
    .locals 40

    move-object/from16 v0, p0

    iget-object v1, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lorg/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v2

    iget-object v3, v0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v3, Lb30/m;

    iget-object v4, v3, Lb30/m;->E:Ljava/lang/Object;

    check-cast v4, Lm83/m;

    iget-object v5, v3, Lb30/m;->F:Ljava/lang/Object;

    check-cast v5, Lm83/m;

    iget-object v6, v3, Lb30/m;->y:Ljava/lang/Object;

    check-cast v6, Lstream/video/sfu/models/PeerType;

    sget-object v7, Lh33/b;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v7, 0x1

    const/16 v8, 0xa

    const/16 v13, 0x3e8

    const/16 v16, 0x0

    if-ne v6, v7, :cond_18

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_1

    const-wide/16 v17, 0x0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lorg/webrtc/RTCStats;

    invoke-virtual {v10}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v10

    const-string v11, "inbound-rtp"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-wide/16 v17, 0x0

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v7, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/webrtc/RTCStats;

    invoke-static {v8}, Lds/p;->W(Lorg/webrtc/RTCStats;)Ln33/f;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3

    move-object/from16 v7, v16

    goto :goto_6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_6

    :cond_4
    move-object v8, v7

    check-cast v8, Ln33/f;

    iget-object v9, v8, Ln33/f;->M:Ljava/lang/Long;

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_2

    :cond_5
    const-wide/16 v9, 0x0

    :goto_2
    iget-object v8, v8, Ln33/f;->N:Ljava/lang/Long;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    goto :goto_3

    :cond_6
    const-wide/16 v20, 0x0

    :goto_3
    mul-long v9, v9, v20

    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ln33/f;

    iget-object v12, v11, Ln33/f;->M:Ljava/lang/Long;

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    goto :goto_4

    :cond_8
    const-wide/16 v21, 0x0

    :goto_4
    iget-object v11, v11, Ln33/f;->N:Ljava/lang/Long;

    if-eqz v11, :cond_9

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_5

    :cond_9
    const-wide/16 v11, 0x0

    :goto_5
    mul-long v21, v21, v11

    cmp-long v11, v9, v21

    if-gez v11, :cond_a

    move-object v7, v8

    move-wide/from16 v9, v21

    :cond_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_7

    :goto_6
    check-cast v7, Ln33/f;

    if-nez v7, :cond_b

    sget-object v1, Lm83/y;->w:Lm83/y;

    goto/16 :goto_12

    :cond_b
    iget-object v6, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    iget-object v8, v7, Ln33/f;->a:Ljava/lang/String;

    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/webrtc/RTCStats;

    if-eqz v6, :cond_c

    invoke-static {v6}, Lds/p;->W(Lorg/webrtc/RTCStats;)Ln33/f;

    move-result-object v6

    goto :goto_7

    :cond_c
    move-object/from16 v6, v16

    :goto_7
    iget-object v8, v7, Ln33/f;->Q:Ljava/lang/Double;

    if-eqz v8, :cond_d

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    goto :goto_8

    :cond_d
    move-wide/from16 v8, v17

    :goto_8
    if-eqz v6, :cond_e

    iget-object v10, v6, Ln33/f;->Q:Ljava/lang/Double;

    if-eqz v10, :cond_e

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    goto :goto_9

    :cond_e
    move-wide/from16 v10, v17

    :goto_9
    sub-double/2addr v8, v10

    iget-object v10, v7, Ln33/f;->I:Ljava/lang/Long;

    if-eqz v10, :cond_f

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_a

    :cond_f
    const-wide/16 v10, 0x0

    :goto_a
    if-eqz v6, :cond_10

    iget-object v6, v6, Ln33/f;->I:Ljava/lang/Long;

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    goto :goto_b

    :cond_10
    const-wide/16 v21, 0x0

    :goto_b
    sub-long v10, v10, v21

    long-to-double v10, v10

    cmpl-double v6, v10, v17

    if-lez v6, :cond_11

    div-double/2addr v8, v10

    int-to-double v10, v13

    mul-double/2addr v8, v10

    goto :goto_c

    :cond_11
    move-wide/from16 v8, v17

    :goto_c
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v4, v6}, Lm83/m;->addLast(Ljava/lang/Object;)V

    iget-object v6, v7, Ln33/f;->O:Ljava/lang/Double;

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    goto :goto_d

    :cond_12
    move-wide/from16 v9, v17

    :goto_d
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v5, v6}, Lm83/m;->addLast(Ljava/lang/Object;)V

    iget-object v6, v7, Ln33/f;->k:Ljava/lang/String;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lstream/video/sfu/models/TrackType;

    if-nez v1, :cond_13

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    :cond_13
    move-object/from16 v22, v1

    new-instance v21, Lstream/video/sfu/models/PerformanceStats;

    iget-object v1, v7, Ln33/f;->g:Ljava/lang/String;

    invoke-static {v1, v2}, Lup/d;->j(Ljava/lang/String;Ljava/util/Map;)Lstream/video/sfu/models/Codec;

    move-result-object v23

    invoke-static {v4}, Lup/d;->i(Ljava/util/Collection;)Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    double-to-float v1, v8

    move/from16 v24, v1

    goto :goto_e

    :cond_14
    const/16 v24, 0x0

    :goto_e
    invoke-static {v5}, Lup/d;->i(Ljava/util/Collection;)Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    double-to-float v11, v8

    move/from16 v25, v11

    goto :goto_f

    :cond_15
    const/16 v25, 0x0

    :goto_f
    new-instance v26, Lstream/video/sfu/models/VideoDimension;

    iget-object v1, v7, Ln33/f;->M:Ljava/lang/Long;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    long-to-int v1, v8

    move/from16 v27, v1

    goto :goto_10

    :cond_16
    const/16 v27, 0x0

    :goto_10
    iget-object v1, v7, Ln33/f;->N:Ljava/lang/Long;

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    long-to-int v12, v6

    move/from16 v28, v12

    goto :goto_11

    :cond_17
    const/16 v28, 0x0

    :goto_11
    const/16 v30, 0x4

    const/16 v31, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v26 .. v31}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v29, 0x60

    const/16 v30, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v21 .. v30}, Lstream/video/sfu/models/PerformanceStats;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v21 .. v21}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_12
    const-wide/16 v25, 0x0

    goto/16 :goto_27

    :cond_18
    const-wide/16 v17, 0x0

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_19
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lorg/webrtc/RTCStats;

    invoke-virtual {v11}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v11

    const-string v12, "outbound-rtp"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1a
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v9, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/webrtc/RTCStats;

    invoke-static {v9}, Lds/p;->Z(Lorg/webrtc/RTCStats;)Ln33/l;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_1b
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1c
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ln33/l;

    iget-object v11, v10, Ln33/l;->e:Ljava/lang/String;

    const-string v12, "video"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1c

    iget-object v11, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    iget-object v10, v10, Ln33/l;->a:Ljava/lang/String;

    invoke-interface {v11, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_1d
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ln33/l;

    iget-object v9, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    iget-object v10, v8, Ln33/l;->a:Ljava/lang/String;

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/webrtc/RTCStats;

    if-eqz v9, :cond_1e

    invoke-static {v9}, Lds/p;->Z(Lorg/webrtc/RTCStats;)Ln33/l;

    move-result-object v9

    goto :goto_17

    :cond_1e
    move-object/from16 v9, v16

    :goto_17
    iget-object v10, v8, Ln33/l;->s:Ljava/lang/Double;

    if-eqz v10, :cond_1f

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    goto :goto_18

    :cond_1f
    move-wide/from16 v10, v17

    :goto_18
    if-eqz v9, :cond_20

    iget-object v12, v9, Ln33/l;->s:Ljava/lang/Double;

    if-eqz v12, :cond_20

    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v21

    goto :goto_19

    :cond_20
    move-wide/from16 v21, v17

    :goto_19
    sub-double v10, v10, v21

    iget-object v12, v8, Ln33/l;->z:Ljava/lang/Long;

    if-eqz v12, :cond_21

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    goto :goto_1a

    :cond_21
    const-wide/16 v21, 0x0

    :goto_1a
    if-eqz v9, :cond_22

    iget-object v9, v9, Ln33/l;->z:Ljava/lang/Long;

    if-eqz v9, :cond_22

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    :goto_1b
    const-wide/16 v25, 0x0

    goto :goto_1c

    :cond_22
    const-wide/16 v23, 0x0

    goto :goto_1b

    :goto_1c
    sub-long v14, v21, v23

    long-to-double v14, v14

    cmpl-double v9, v14, v17

    if-lez v9, :cond_23

    div-double/2addr v10, v14

    int-to-double v14, v13

    mul-double/2addr v10, v14

    goto :goto_1d

    :cond_23
    move-wide/from16 v10, v17

    :goto_1d
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v4, v9}, Lm83/m;->addLast(Ljava/lang/Object;)V

    iget-object v9, v8, Ln33/l;->y:Ljava/lang/Double;

    if-eqz v9, :cond_24

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    goto :goto_1e

    :cond_24
    move-wide/from16 v9, v17

    :goto_1e
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v5, v9}, Lm83/m;->addLast(Ljava/lang/Object;)V

    iget-object v9, v8, Ln33/l;->k:Ljava/lang/String;

    if-eqz v9, :cond_26

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/webrtc/RTCStats;

    if-eqz v9, :cond_25

    invoke-static {v9}, Lds/p;->f0(Lorg/webrtc/RTCStats;)Ln33/r;

    move-result-object v9

    goto :goto_1f

    :cond_25
    move-object/from16 v9, v16

    :goto_1f
    if-eqz v9, :cond_26

    iget-object v9, v9, Ln33/r;->e:Ljava/lang/String;

    if-eqz v9, :cond_26

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lstream/video/sfu/models/TrackType;

    if-eqz v9, :cond_26

    :goto_20
    move-object/from16 v28, v9

    goto :goto_21

    :cond_26
    sget-object v9, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    goto :goto_20

    :goto_21
    iget-object v9, v8, Ln33/l;->g:Ljava/lang/String;

    invoke-static {v9, v2}, Lup/d;->j(Ljava/lang/String;Ljava/util/Map;)Lstream/video/sfu/models/Codec;

    move-result-object v29

    invoke-static {v4}, Lup/d;->i(Ljava/util/Collection;)Ljava/lang/Double;

    move-result-object v9

    if-eqz v9, :cond_27

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    double-to-float v9, v9

    move/from16 v30, v9

    goto :goto_22

    :cond_27
    const/16 v30, 0x0

    :goto_22
    invoke-static {v5}, Lup/d;->i(Ljava/util/Collection;)Ljava/lang/Double;

    move-result-object v9

    if-eqz v9, :cond_28

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    double-to-float v9, v9

    move/from16 v31, v9

    goto :goto_23

    :cond_28
    const/16 v31, 0x0

    :goto_23
    iget-object v9, v8, Ln33/l;->q:Ljava/lang/Double;

    if-eqz v9, :cond_29

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    invoke-static {v9, v10}, Le93/b;->W(D)I

    move-result v9

    move/from16 v33, v9

    goto :goto_24

    :cond_29
    const/16 v33, 0x0

    :goto_24
    new-instance v32, Lstream/video/sfu/models/VideoDimension;

    iget-object v9, v8, Ln33/l;->w:Ljava/lang/Long;

    if-eqz v9, :cond_2a

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    long-to-int v9, v9

    move/from16 v35, v9

    goto :goto_25

    :cond_2a
    const/16 v35, 0x0

    :goto_25
    iget-object v8, v8, Ln33/l;->x:Ljava/lang/Long;

    if-eqz v8, :cond_2b

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v36, v8

    goto :goto_26

    :cond_2b
    const/16 v36, 0x0

    :goto_26
    const/16 v38, 0x4

    const/16 v39, 0x0

    const/16 v37, 0x0

    move-object/from16 v34, v32

    invoke-direct/range {v34 .. v39}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lstream/video/sfu/models/PerformanceStats;

    const/16 v35, 0x40

    const/16 v36, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v27 .. v36}, Lstream/video/sfu/models/PerformanceStats;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v27

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_16

    :cond_2c
    move-object v1, v6

    goto/16 :goto_12

    :goto_27
    iget-object v6, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_28
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, "timestamp"

    if-eqz v9, :cond_33

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/webrtc/RTCStats;

    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v6, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lorg/webrtc/RTCStats;

    if-eqz v14, :cond_2d

    invoke-virtual {v14}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v13

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2e

    :cond_2d
    const-string v13, "type"

    invoke-virtual {v9}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2e
    invoke-virtual {v9}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    const-string v15, "getMembers(...)"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_29
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_32

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    check-cast v6, Ljava/lang/String;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v18, v8

    if-eqz v14, :cond_2f

    invoke-virtual {v14}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_2f

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_2a

    :cond_2f
    move-object/from16 v8, v16

    :goto_2a
    invoke-interface/range {v19 .. v19}, Ljava/util/Map;->isEmpty()Z

    move-result v20

    if-nez v20, :cond_31

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_30

    goto :goto_2c

    :cond_30
    :goto_2b
    move-object/from16 v8, v18

    move-object/from16 v6, v19

    goto :goto_29

    :cond_31
    :goto_2c
    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v12, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2b

    :cond_32
    move-object/from16 v19, v6

    move-object/from16 v18, v8

    invoke-virtual {v9}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-interface {v12, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v18

    move-object/from16 v6, v19

    const/16 v13, 0x3e8

    goto/16 :goto_28

    :cond_33
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_34
    :goto_2d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_37

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v11, v9, Ljava/lang/Number;

    if-eqz v11, :cond_35

    check-cast v9, Ljava/lang/Number;

    goto :goto_2e

    :cond_35
    move-object/from16 v9, v16

    :goto_2e
    if-eqz v9, :cond_36

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_2f

    :cond_36
    move-object/from16 v9, v16

    :goto_2f
    if-eqz v9, :cond_34

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    :cond_37
    invoke-static {v8}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    if-eqz v6, :cond_38

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_30

    :cond_38
    const-wide/high16 v8, -0x8000000000000000L

    :goto_30
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_39
    :goto_31
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ljava/lang/Number;

    if-eqz v13, :cond_3a

    check-cast v12, Ljava/lang/Number;

    goto :goto_32

    :cond_3a
    move-object/from16 v12, v16

    :goto_32
    if-eqz v12, :cond_39

    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    cmp-long v12, v12, v8

    if-nez v12, :cond_39

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_31

    :cond_3b
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v6, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/16 v7, 0x3e8

    int-to-long v11, v7

    div-long/2addr v8, v11

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v6, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_33
    iget v7, v4, Lm83/m;->y:I

    const/4 v8, 0x2

    if-le v7, v8, :cond_3c

    invoke-virtual {v4}, Lm83/m;->removeFirst()Ljava/lang/Object;

    goto :goto_33

    :cond_3c
    :goto_34
    iget v4, v5, Lm83/m;->y:I

    if-le v4, v8, :cond_3d

    invoke-virtual {v5}, Lm83/m;->removeFirst()Ljava/lang/Object;

    goto :goto_34

    :cond_3d
    iput-object v2, v3, Lb30/m;->z:Ljava/lang/Object;

    iget-object v2, v0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/m;

    new-instance v3, Lh33/a;

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v6, v1}, Lh33/a;-><init>(Lorg/webrtc/RTCStatsReport;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public q()Ljava/lang/Integer;
    .locals 11

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Lhg/j;

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lz7/a;

    invoke-virtual {v1}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v2

    sget-object v3, Ljg/l;->c:Ljg/l;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Ljg/n;->c:Ljg/n;

    const-class v5, Ljg/n;

    const/4 v6, 0x0

    const-string v7, "; found "

    const-string v8, "expected "

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljg/l;

    if-ne v2, v3, :cond_0

    check-cast v0, Ljg/l;

    goto/16 :goto_1

    :cond_0
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v3, Ljg/k;->c:Ljg/k;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v2, v5, :cond_3

    check-cast v0, Ljg/n;

    goto/16 :goto_1

    :cond_3
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual {v1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v9, Ljg/m;

    if-ne v3, v9, :cond_b

    check-cast v2, Ljg/m;

    iget-object v2, v2, Ljg/m;->c:Ljava/lang/String;

    iget-object v3, v0, Lhg/j;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lhg/i;

    invoke-static {v10}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    move-object v6, v9

    :cond_6
    check-cast v6, Lhg/i;

    iget-object v0, v0, Lhg/i;->c:Ljava/util/Set;

    new-instance v3, Ljg/a;

    invoke-direct {v3, v2}, Ljg/a;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v1}, Lz7/a;->s()V

    invoke-virtual {p0}, Lgm/r;->q()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_7
    if-eqz v6, :cond_8

    iget v0, v6, Lhg/i;->b:I

    goto :goto_0

    :cond_8
    const/4 v0, -0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_1
    if-eqz v6, :cond_a

    invoke-virtual {v1}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v5, :cond_9

    check-cast v0, Ljg/n;

    invoke-virtual {p0}, Lgm/r;->q()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_9
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    return-object v6

    :cond_b
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r(ILa9/c;J)V
    .locals 8

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/media/MediaCodec;

    iget-object v4, p2, La9/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    const/4 v3, 0x0

    const/4 v7, 0x0

    move v2, p1

    move-wide v5, p3

    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    return-void
.end method

.method public release()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    iput-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    return-void
.end method

.method public releaseOutputBuffer(IZ)V
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public s(Ljava/lang/Throwable;Lc93/a;)V
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object v1, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Log/b;->E:Log/b;

    invoke-static {v0, v2, v1, p1, p2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public setParameters(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public skipValue()V
    .locals 1

    iget-object v0, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Lz7/a;

    invoke-virtual {v0}, Lz7/a;->s()V

    return-void
.end method

.method public t(Lmo/h;Landroid/os/Handler;)V
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    new-instance v1, Lhn/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lhn/a;-><init>(Lhn/k;Lmo/h;I)V

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lgm/r;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v1, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    iget-object v1, v1, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    const-string v2, ""

    :goto_0
    if-eqz v1, :cond_2

    iget-object v3, v1, Lgm/r;->y:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_1

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    iget-object v1, v1, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    const-string v2, ", "

    goto :goto_0

    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/Throwable;Lc93/a;)V
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object v1, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Log/b;->z:Log/b;

    invoke-static {v0, v2, v1, p1, p2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public v()J
    .locals 2

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Ljg/b;

    invoke-virtual {v0}, Ljg/b;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public w()Lgs/l;
    .locals 5

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/n;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_8

    iget v2, v0, Lgs/n;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    invoke-virtual {v0}, Lgs/n;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/n;

    invoke-virtual {v0}, Lgs/n;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/n;

    iget-object v0, v0, Lgs/n;->d:Lgs/j;

    sget-object v1, Lgs/j;->m:Lgs/j;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_2

    :cond_4
    sget-object v1, Lgs/j;->l:Lgs/j;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v1, Lgs/j;->k:Lgs/j;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    :goto_2
    new-instance v1, Lgs/l;

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lgs/n;

    iget-object v3, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget-object v4, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lgs/l;-><init>(Lgs/n;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesEaxParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lgs/n;

    iget-object v2, v2, Lgs/n;->d:Lgs/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public x()Lgs/o;
    .locals 5

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/q;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_8

    iget v2, v0, Lgs/q;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    invoke-virtual {v0}, Lgs/q;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/q;

    invoke-virtual {v0}, Lgs/q;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/q;

    iget-object v0, v0, Lgs/q;->d:Lgs/j;

    sget-object v1, Lgs/j;->p:Lgs/j;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_2

    :cond_4
    sget-object v1, Lgs/j;->o:Lgs/j;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v1, Lgs/j;->n:Lgs/j;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    :goto_2
    new-instance v1, Lgs/o;

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lgs/q;

    iget-object v3, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget-object v4, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lgs/o;-><init>(Lgs/q;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesGcmParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lgs/q;

    iget-object v2, v2, Lgs/q;->d:Lgs/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public y()Lgs/r;
    .locals 5

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/t;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_8

    iget v2, v0, Lgs/t;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    invoke-virtual {v0}, Lgs/t;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/t;

    invoke-virtual {v0}, Lgs/t;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lgs/t;

    iget-object v0, v0, Lgs/t;->b:Lgs/j;

    sget-object v1, Lgs/j;->s:Lgs/j;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_2

    :cond_4
    sget-object v1, Lgs/j;->r:Lgs/j;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v1, Lgs/j;->q:Lgs/j;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    :goto_2
    new-instance v1, Lgs/r;

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lgs/t;

    iget-object v3, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget-object v4, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lgs/r;-><init>(Lgs/t;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesGcmSivParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lgs/t;

    iget-object v2, v2, Lgs/t;->b:Lgs/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public z()Lls/a;
    .locals 5

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lls/d;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_8

    iget v2, v0, Lls/d;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    invoke-virtual {v0}, Lls/d;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lls/d;

    invoke-virtual {v0}, Lls/d;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lls/d;

    iget-object v0, v0, Lls/d;->b:Lls/c;

    sget-object v1, Lls/c;->d:Lls/c;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_2

    :cond_4
    sget-object v1, Lls/c;->c:Lls/c;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v1, Lls/c;->b:Lls/c;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    :goto_2
    new-instance v1, Lls/a;

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lls/d;

    iget-object v3, p0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget-object v4, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lls/a;-><init>(Lls/d;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesSivParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v2, Lls/d;

    iget-object v2, v2, Lls/d;->b:Lls/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
