.class public final Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$$serializer;,
        Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBg\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J^\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001\u00a2\u0006\u0004\u00080\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00103\u0012\u0004\u00085\u00106\u001a\u0004\u00084\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00103\u0012\u0004\u00088\u00106\u001a\u0004\u00087\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00103\u0012\u0004\u0008:\u00106\u001a\u0004\u00089\u0010\u0016R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010;\u0012\u0004\u0008=\u00106\u001a\u0004\u0008<\u0010\u001aR \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010>\u0012\u0004\u0008@\u00106\u001a\u0004\u0008?\u0010\u001cR&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010A\u0012\u0004\u0008C\u00106\u001a\u0004\u0008B\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010D\u0012\u0004\u0008F\u00106\u001a\u0004\u0008E\u0010 \u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;",
        "",
        "",
        "navigationTitle",
        "heroImageUrl",
        "januaryJumpstartImageUrl",
        "Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;",
        "headerSection",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "customPlanCard",
        "",
        "items",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "aiContextMetadata",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;",
        "component5",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "getNavigationTitle$annotations",
        "()V",
        "getHeroImageUrl",
        "getHeroImageUrl$annotations",
        "getJanuaryJumpstartImageUrl",
        "getJanuaryJumpstartImageUrl$annotations",
        "Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;",
        "getHeaderSection",
        "getHeaderSection$annotations",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getCustomPlanCard",
        "getCustomPlanCard$annotations",
        "Ljava/util/List;",
        "getItems",
        "getItems$annotations",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "getAiContextMetadata",
        "getAiContextMetadata$annotations",
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

.field public static final Companion:Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$Companion;


# instance fields
.field private final aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

.field private final customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

.field private final headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

.field private final heroImageUrl:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final januaryJumpstartImageUrl:Ljava/lang/String;

.field private final navigationTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->Companion:Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lmq2/a;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lmq2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lmq2/a;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Lmq2/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lmq2/a;

    const/4 v7, 0x7

    invoke-direct {v6, v7}, Lmq2/a;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v6, v7, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v7, 0x2

    aput-object v1, v6, v7

    const/4 v7, 0x3

    aput-object v1, v6, v7

    const/4 v1, 0x4

    aput-object v2, v6, v1

    aput-object v4, v6, v3

    aput-object v0, v6, v5

    sput-object v6, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    iput-object p6, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p7, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heroImageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "januaryJumpstartImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerSection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPlanCard"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 11

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ljava/util/List;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v4, Lwc3/a;

    const-class v5, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    new-instance v7, Lwc3/e;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    new-array v10, v9, [Ljava/lang/annotation/Annotation;

    invoke-direct {v7, v8, v10}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v8, v9, [Lwc3/c;

    invoke-direct {v4, v6, v7, v8}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v3, v4}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    new-instance v4, Lwc3/a;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    new-instance v7, Lwc3/e;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-array v5, v9, [Ljava/lang/annotation/Annotation;

    invoke-direct {v7, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v1, v9, [Lwc3/c;

    invoke-direct {v4, v6, v7, v1}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lwc3/c;

    aput-object v4, v1, v9

    invoke-direct {v0, v2, v3, v1}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata$$serializer;->INSTANCE:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;ILjava/lang/Object;)Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAiContextMetadata$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "ai_context_metadata"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomPlanCard$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "custom_plan_card"
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

.method public static synthetic getHeroImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "hero_image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "items"
    .end annotation

    return-void
.end method

.method public static synthetic getJanuaryJumpstartImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "january_jumpstart_image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getNavigationTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "navigation_title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
            ")",
            "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heroImageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "januaryJumpstartImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerSection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPlanCard"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;

    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    iget-object p1, p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-object v0
.end method

.method public final getCustomPlanCard()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getHeaderSection()Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    return-object v0
.end method

.method public final getHeroImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getJanuaryJumpstartImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->heroImageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->januaryJumpstartImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->headerSection:Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;

    iget-object v4, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->customPlanCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v5, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->items:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->aiContextMetadata:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    const-string v7, ", heroImageUrl="

    const-string v8, ", januaryJumpstartImageUrl="

    const-string v9, "ChallengeLandingResponse(navigationTitle="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", headerSection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customPlanCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aiContextMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
