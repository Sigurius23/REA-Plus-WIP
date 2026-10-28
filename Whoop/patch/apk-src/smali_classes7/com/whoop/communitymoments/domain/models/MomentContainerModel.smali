.class public final Lcom/whoop/communitymoments/domain/models/MomentContainerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communitymoments/domain/models/MomentContainerModel$$serializer;,
        Lcom/whoop/communitymoments/domain/models/MomentContainerModel$a;,
        Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0003YZ[B\u00ae\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u00a7\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0016\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010)J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J3\u00102\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00101J\u00bd\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0001\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010$J\u0010\u00106\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u001a\u0010:\u001a\u0002092\u0008\u00108\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001\u00a2\u0006\u0004\u0008B\u0010CR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010E\u001a\u0004\u0008F\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010E\u001a\u0004\u0008G\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010H\u001a\u0004\u0008I\u0010\'R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010J\u001a\u0004\u0008K\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010L\u001a\u0004\u0008M\u0010+R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010J\u001a\u0004\u0008N\u0010)R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010J\u001a\u0004\u0008O\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010P\u001a\u0004\u0008Q\u0010/R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010R\u001a\u0004\u0008S\u00101\"\u0004\u0008T\u0010URE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010R\u001a\u0004\u0008V\u00101\"\u0004\u0008W\u0010U\u00a8\u0006\\"
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MomentContainerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "backgroundImageUrl",
        "",
        "photoRevealFraction",
        "",
        "items",
        "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;",
        "headerLeadingButton",
        "headerTrailingItems",
        "footerOverlayItems",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "achievementBackgroundStyle",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()F",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "component9",
        "()Ljava/util/Map;",
        "component10",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;",
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
        "write$Self$community_moments_release",
        "(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getBackgroundImageUrl",
        "F",
        "getPhotoRevealFraction",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;",
        "getHeaderLeadingButton",
        "getHeaderTrailingItems",
        "getFooterOverlayItems",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "getAchievementBackgroundStyle",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "HeaderLeadingButton",
        "$serializer",
        "a",
        "community-moments_release"
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

.field public static final Companion:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$a;


# instance fields
.field private final achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final backgroundImageUrl:Ljava/lang/String;

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final footerOverlayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

.field private final headerTrailingItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final photoRevealFraction:F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->Companion:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lur0/a;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lur0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lur0/a;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lur0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lur0/a;

    const/16 v7, 0xc

    invoke-direct {v6, v7}, Lur0/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lur0/a;

    const/16 v8, 0xd

    invoke-direct {v7, v8}, Lur0/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v4, v4, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v4, v7

    const/4 v7, 0x1

    aput-object v1, v4, v7

    const/4 v7, 0x2

    aput-object v1, v4, v7

    const/4 v7, 0x3

    aput-object v3, v4, v7

    const/4 v3, 0x4

    aput-object v1, v4, v3

    const/4 v3, 0x5

    aput-object v5, v4, v3

    const/4 v3, 0x6

    aput-object v6, v4, v3

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v2, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x83

    const/16 v0, 0x83

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    goto :goto_0

    :cond_1
    iput p4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    :goto_0
    and-int/lit8 p2, p1, 0x8

    sget-object p3, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    const/4 p4, 0x0

    if-nez p2, :cond_3

    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    :goto_4
    iput-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    :goto_5
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_7

    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_7
    iput-object p11, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "F",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerTrailingItems"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerOverlayItems"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    .line 6
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    .line 8
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    .line 11
    iput-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    .line 12
    iput-object p10, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v5, v1

    goto :goto_0

    :cond_0
    move/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 13
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move-object v7, v3

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v11, v3

    goto :goto_5

    :cond_5
    move-object/from16 v11, p9

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_6

    move-object v12, v3

    move-object v2, p0

    move-object v4, p2

    move-object/from16 v10, p8

    move-object v3, p1

    goto :goto_6

    :cond_6
    move-object/from16 v12, p10

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v10, p8

    :goto_6
    invoke-direct/range {v2 .. v12}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;-><init>(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->copy(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$community_moments_release(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton$$serializer;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    sget-object v1, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/communitymoments/domain/models/MomentContainerModel;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "accumulatedState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getBindings()Ljava/util/Map;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v2

    move-object/from16 v3, p0

    invoke-static {v3, v1, v2, v0}, Lcom/whoop/communitymoments/domain/models/a;->a(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    move-result-object v4

    .line 3
    iget-object v1, v4, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 4
    new-instance v8, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 6
    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    .line 7
    invoke-static {v5, v0}, Lur0/d;->a(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v5

    .line 8
    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, v4, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 10
    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 12
    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    .line 13
    invoke-static {v5, v0}, Lur0/d;->a(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v5

    .line 14
    invoke-interface {v10, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 15
    :cond_1
    iget-object v1, v4, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 16
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 18
    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    .line 19
    invoke-static {v2, v0}, Lur0/d;->a(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    .line 20
    invoke-interface {v11, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    const/16 v15, 0x397

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 21
    invoke-static/range {v4 .. v16}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->copy$default(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bind(Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/AchievementsBackgroundStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "F",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/communitymoments/domain/models/MomentContainerModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerTrailingItems"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerOverlayItems"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;-><init>(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    iget v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAchievementBackgroundStyle()Lcom/whoop/design/models/AchievementsBackgroundStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    return-object v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getFooterOverlayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    return-object v0
.end method

.method public final getHeaderLeadingButton()Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    return-object v0
.end method

.method public final getHeaderTrailingItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getPhotoRevealFraction()F
    .locals 1

    iget v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->backgroundImageUrl:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->photoRevealFraction:F

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->items:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerLeadingButton:Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;

    iget-object v5, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->headerTrailingItems:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->footerOverlayItems:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iget-object v8, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->bindings:Ljava/util/Map;

    iget-object v9, p0, Lcom/whoop/communitymoments/domain/models/MomentContainerModel;->aggregateBindings:Ljava/util/Map;

    const-string v10, ", backgroundImageUrl="

    const-string v11, ", photoRevealFraction="

    const-string v12, "MomentContainerModel(id="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerLeadingButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerTrailingItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerOverlayItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", achievementBackgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
