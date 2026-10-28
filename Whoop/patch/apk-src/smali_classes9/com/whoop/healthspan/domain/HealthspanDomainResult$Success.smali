.class public final Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;
.super Lcom/whoop/healthspan/domain/HealthspanDomainResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/healthspan/domain/HealthspanDomainResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Success"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$$serializer;,
        Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:;BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JZ\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020\u00042\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u0008\u0007\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010#R#\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u00088\u0010%\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;",
        "Lcom/whoop/healthspan/domain/HealthspanDomainResult;",
        "Lcom/whoop/healthspan/domain/models/HealthspanResponse;",
        "response",
        "",
        "hasClosedCalibration",
        "hasClosedInfoCallout",
        "isFromDateChange",
        "",
        "previousPaceOfAgingValueIndex",
        "",
        "",
        "drawerExpandedStates",
        "<init>",
        "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$healthspan_release",
        "(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/healthspan/domain/models/HealthspanResponse;",
        "component2",
        "()Z",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "()Ljava/util/Map;",
        "copy",
        "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/healthspan/domain/models/HealthspanResponse;",
        "getResponse",
        "Z",
        "getHasClosedCalibration",
        "getHasClosedInfoCallout",
        "Ljava/lang/Integer;",
        "getPreviousPaceOfAgingValueIndex",
        "Ljava/util/Map;",
        "getDrawerExpandedStates",
        "Companion",
        "$serializer",
        "a",
        "healthspan_release"
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

.field public static final Companion:Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$a;


# instance fields
.field private final drawerExpandedStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final hasClosedCalibration:Z

.field private final hasClosedInfoCallout:Z

.field private final isFromDateChange:Z

.field private final previousPaceOfAgingValueIndex:Ljava/lang/Integer;

.field private final response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->Companion:Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lf1/z1;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lf1/z1;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v1, 0x5

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$$serializer;

    invoke-virtual {p8}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    const/4 p8, 0x0

    invoke-direct {p0, p8}, Lcom/whoop/healthspan/domain/HealthspanDomainResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    iput-boolean p3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-boolean p3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    goto :goto_0

    :cond_1
    iput-boolean p4, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-boolean p3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    goto :goto_1

    :cond_2
    iput-boolean p5, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p8, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    :goto_2
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_4

    .line 2
    sget-object p1, Lm83/z;->w:Lm83/z;

    .line 3
    iput-object p1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p7, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthspan/domain/models/HealthspanResponse;",
            "ZZZ",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawerExpandedStates"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/whoop/healthspan/domain/HealthspanDomainResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput-object p1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    .line 6
    iput-boolean p2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    .line 7
    iput-boolean p3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    .line 8
    iput-boolean p4, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    .line 9
    iput-object p5, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    .line 10
    iput-object p6, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_1

    move p4, v0

    :cond_1
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_2

    const/4 p5, 0x0

    :cond_2
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_3

    .line 11
    sget-object p6, Lm83/z;->w:Lm83/z;

    :cond_3
    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p7}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;-><init>(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->copy(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$healthspan_release(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/healthspan/domain/models/HealthspanResponse$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/HealthspanResponse$$serializer;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    if-eqz v2, :cond_1

    :goto_0
    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    if-eqz v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/healthspan/domain/models/HealthspanResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthspan/domain/models/HealthspanResponse;",
            "ZZZ",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawerExpandedStates"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;-><init>(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDrawerExpandedStates()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    return-object v0
.end method

.method public final getHasClosedCalibration()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    return v0
.end method

.method public final getHasClosedInfoCallout()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    return v0
.end method

.method public final getPreviousPaceOfAgingValueIndex()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getResponse()Lcom/whoop/healthspan/domain/models/HealthspanResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    invoke-virtual {v0}, Lcom/whoop/healthspan/domain/models/HealthspanResponse;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isFromDateChange()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->response:Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedCalibration:Z

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->hasClosedInfoCallout:Z

    iget-boolean v3, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange:Z

    iget-object v4, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->previousPaceOfAgingValueIndex:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->drawerExpandedStates:Ljava/util/Map;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Success(response="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hasClosedCalibration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hasClosedInfoCallout="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isFromDateChange="

    const-string v1, ", previousPaceOfAgingValueIndex="

    invoke-static {v6, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", drawerExpandedStates="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
