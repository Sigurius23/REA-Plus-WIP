.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBK\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJD\u0010 \u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010(\u001a\u00020\u00072\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008+\u0010\u001bR \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008,\u0010\u001bR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008\u0008\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010-\u001a\u0004\u0008\t\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;",
        "",
        "",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "records",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;",
        "deletedRecords",
        "",
        "isInitialImport",
        "isTokenRefreshImport",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;ZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "copy",
        "(Ljava/util/List;Ljava/util/List;ZZ)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getRecords",
        "getDeletedRecords",
        "Z",
        "Companion",
        "$serializer",
        "health-connect_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$Companion;


# instance fields
.field private final deletedRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;",
            ">;"
        }
    .end annotation
.end field

.field private final isInitialImport:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_initial_import"
    .end annotation
.end field

.field private final isTokenRefreshImport:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_token_refresh_import"
    .end annotation
.end field

.field private final records:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Llh1/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Llh1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Llh1/a;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Llh1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$$serializer;

    invoke-virtual {p6}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    iput-boolean p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    iput-boolean p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedRecords"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Ljava/util/List;Ljava/util/List;ZZILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->copy(Ljava/util/List;Ljava/util/List;ZZ)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget-boolean p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    return v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;ZZ)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;",
            ">;ZZ)",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedRecords"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;-><init>(Ljava/util/List;Ljava/util/List;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    iget-boolean v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    iget-boolean p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDeletedRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isInitialImport()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    return v0
.end method

.method public final isTokenRefreshImport()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->records:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->deletedRecords:Ljava/util/List;

    iget-boolean v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isInitialImport:Z

    iget-boolean v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->isTokenRefreshImport:Z

    const-string v4, ", deletedRecords="

    const-string v5, ", isInitialImport="

    const-string v6, "HealthConnectBodyMeasurementRequestBody(records="

    invoke-static {v6, v4, v0, v5, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isTokenRefreshImport="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
