.class public final Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$$serializer;,
        Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0014\u0008\u0081\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bo\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jn\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\"J\u0010\u00103\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00107\u001a\u00020\u000c2\u0008\u00106\u001a\u0004\u0018\u000105H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008;\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008=\u0010%R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010>\u001a\u0004\u0008?\u0010\'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010@\u001a\u0004\u0008A\u0010)R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008\r\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008D\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010E\u001a\u0004\u0008F\u0010/\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "recommendationId",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;",
        "subtitles",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;",
        "targetZones",
        "",
        "isSelected",
        "content",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;",
        "cta",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/util/TextResource;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;",
        "component6",
        "()Z",
        "component7",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component8",
        "()Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getRecommendationId",
        "getIcon",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "Ljava/util/List;",
        "getSubtitles",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;",
        "getTargetZones",
        "Z",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getContent",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;",
        "getCta",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$Companion;


# instance fields
.field private final content:Lcom/whoop/design/models/DesignSystemModel;

.field private final cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

.field private final icon:Ljava/lang/String;

.field private final isSelected:Z

.field private final recommendationId:Ljava/lang/String;

.field private final subtitles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;",
            ">;"
        }
    .end annotation
.end field

.field private final targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->Companion:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lj02/y0;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lj02/y0;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lj02/y0;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lj02/y0;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v4, 0x1

    aput-object v1, v0, v4

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v4, 0x3

    aput-object v3, v0, v4

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xbf

    const/16 v0, 0xbf

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    iput-boolean p7, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    :goto_0
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;",
            ">;",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;",
            "Z",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;",
            ")V"
        }
    .end annotation

    const-string v0, "recommendationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p9, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-boolean v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationCta$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta$$serializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    return v0
.end method

.method public final component7()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;",
            ">;",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;",
            "Z",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;",
            ")",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;"
        }
    .end annotation

    const-string v0, "recommendationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    iget-boolean v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getContent()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getCta()Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecommendationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    return-object v0
.end method

.method public final getTargetZones()Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->recommendationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->subtitles:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->targetZones:Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    iget-boolean v5, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected:Z

    iget-object v6, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v7, p0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->cta:Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    const-string v8, ", icon="

    const-string v9, ", title="

    const-string v10, "ActivityRecommendationModel(recommendationId="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitles="

    const-string v8, ", targetZones="

    invoke-static {v2, v1, v8, v0, v3}, Ljh3/c;->n(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
