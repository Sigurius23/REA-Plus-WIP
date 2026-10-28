.class public final Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$$serializer;,
        Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J8\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0001H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010+\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008,\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010/\u0012\u0004\u00081\u0010.\u001a\u0004\u00080\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00102\u0012\u0004\u00084\u0010.\u001a\u0004\u00083\u0010\u001eR \u0010\u0008\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00105\u0012\u0004\u00087\u0010.\u001a\u0004\u00086\u0010 \u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/HeaderModel;",
        "headerSection",
        "",
        "path",
        "Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;",
        "loadingState",
        "errorState",
        "<init>",
        "(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/HeaderModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;",
        "component4",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "copy",
        "(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/HeaderModel;",
        "getHeaderSection",
        "getHeaderSection$annotations",
        "()V",
        "Ljava/lang/String;",
        "getPath",
        "getPath$annotations",
        "Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;",
        "getLoadingState",
        "getLoadingState$annotations",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getErrorState",
        "getErrorState$annotations",
        "Companion",
        "$serializer",
        "weekly-plan_release"
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

.field public static final Companion:Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$Companion;


# instance fields
.field private final errorState:Lcom/whoop/design/models/DesignSystemModel;

.field private final headerSection:Lcom/whoop/design/models/items/HeaderModel;

.field private final loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

.field private final path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->Companion:Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lmq2/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lmq2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    sput-object v2, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    iput-object p3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    iput-object p5, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)V
    .locals 1

    const-string v0, "headerSection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v1, v2, [Lwc3/c;

    invoke-direct {v0, v3, v4, v1}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->copy(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getErrorState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "error_state"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderSection$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header_section"
    .end annotation

    return-void
.end method

.method public static synthetic getLoadingState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "loading_state"
    .end annotation

    return-void
.end method

.method public static synthetic getPath$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "path"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/HeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/HeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;
    .locals 1

    const-string v0, "headerSection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;-><init>(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;

    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    iget-object p1, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getErrorState()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getHeaderSection()Lcom/whoop/design/models/items/HeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    return-object v0
.end method

.method public final getLoadingState()Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/HeaderModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->headerSection:Lcom/whoop/design/models/items/HeaderModel;

    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->path:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->loadingState:Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;

    iget-object v3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->errorState:Lcom/whoop/design/models/DesignSystemModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ChallengeLandingCustomPlanCard(headerSection="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", loadingState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
