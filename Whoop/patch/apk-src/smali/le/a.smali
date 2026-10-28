.class public final Lle/a;
.super Lgg/h;
.source "SourceFile"


# static fields
.field public static final E:Ljava/lang/Object;

.field public static final y:Lle/a;

.field public static final z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lle/a;

    invoke-direct {v0}, Lgg/h;-><init>()V

    sput-object v0, Lle/a;->y:Lle/a;

    sget-object v0, Lgg/f;->y:Lgg/f;

    new-instance v1, Ll83/k;

    const-string v2, "BandwidthLimitExceeded"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "EC2ThrottledException"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v3, Lgg/f;->z:Lgg/f;

    new-instance v4, Ll83/k;

    const-string v5, "IDPCommunicationError"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v4

    new-instance v4, Ll83/k;

    const-string v6, "LimitExceededException"

    invoke-direct {v4, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v6, v5

    new-instance v5, Ll83/k;

    const-string v7, "PriorRequestNotComplete"

    invoke-direct {v5, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v7, v6

    new-instance v6, Ll83/k;

    const-string v8, "ProvisionedThroughputExceededException"

    invoke-direct {v6, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v7

    new-instance v7, Ll83/k;

    const-string v9, "RequestLimitExceeded"

    invoke-direct {v7, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v9, v8

    new-instance v8, Ll83/k;

    const-string v10, "RequestThrottled"

    invoke-direct {v8, v10, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v10, v9

    new-instance v9, Ll83/k;

    const-string v11, "RequestThrottledException"

    invoke-direct {v9, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v10

    new-instance v10, Ll83/k;

    const-string v12, "RequestTimeout"

    invoke-direct {v10, v12, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v12, v11

    new-instance v11, Ll83/k;

    const-string v13, "RequestTimeoutException"

    invoke-direct {v11, v13, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v13, v3

    move-object v3, v12

    new-instance v12, Ll83/k;

    const-string v14, "SlowDown"

    invoke-direct {v12, v14, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v14, v13

    new-instance v13, Ll83/k;

    const-string v15, "ThrottledException"

    invoke-direct {v13, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v15, v14

    new-instance v14, Ll83/k;

    move-object/from16 v16, v1

    const-string v1, "Throttling"

    invoke-direct {v14, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v15

    new-instance v15, Ll83/k;

    move-object/from16 v17, v1

    const-string v1, "ThrottlingException"

    invoke-direct {v15, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v18, v2

    const-string v2, "TooManyRequestsException"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    move-object/from16 v19, v1

    const-string v1, "TransactionInProgressException"

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v1, v16

    move-object/from16 v0, v17

    move-object/from16 v16, v19

    move-object/from16 v17, v2

    move-object/from16 v2, v18

    filled-new-array/range {v1 .. v17}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lle/a;->z:Ljava/lang/Object;

    const/16 v1, 0x1f4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1f6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1f7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1f8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lle/a;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/e;
    .locals 3

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Laws/smithy/kotlin/runtime/ServiceException;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Laws/smithy/kotlin/runtime/ServiceException;

    invoke-virtual {p1}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object p1

    sget-object v0, Lle/a;->z:Ljava/lang/Object;

    invoke-virtual {p1}, Lte/e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/f;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lte/e;->h()Lte/d;

    move-result-object p1

    instance-of v0, p1, Lwf/a;

    if-eqz v0, :cond_0

    check-cast p1, Lwf/a;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lwf/a;->b()Lmf/t;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lmf/t;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    sget-object v0, Lle/a;->E:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lgg/f;

    :cond_2
    if-eqz v0, :cond_3

    new-instance p1, Lgg/b;

    invoke-direct {p1, v0}, Lgg/b;-><init>(Lgg/f;)V

    return-object p1

    :cond_3
    return-object v1
.end method
