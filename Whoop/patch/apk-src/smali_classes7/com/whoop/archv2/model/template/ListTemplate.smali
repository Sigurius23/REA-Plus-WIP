.class public final Lcom/whoop/archv2/model/template/ListTemplate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/archv2/model/template/ScreenTemplate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/model/template/ListTemplate$$serializer;,
        Lcom/whoop/archv2/model/template/ListTemplate$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 \\2\u00020\u0001:\u0002]^B\u0085\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0017\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u008e\u0001\u00102\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u00084\u0010)J\u0010\u00105\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u00085\u00106J\u001a\u0010:\u001a\u0002092\u0008\u00108\u001a\u0004\u0018\u000107H\u00d6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001\u00a2\u0006\u0004\u0008B\u0010CR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010E\u001a\u0004\u0008F\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010G\u001a\u0004\u0008H\u0010!R\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010I\u001a\u0004\u0008J\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010K\u001a\u0004\u0008L\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010M\u001a\u0004\u0008N\u0010\'R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010O\u0012\u0004\u0008Q\u0010R\u001a\u0004\u0008P\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010S\u0012\u0004\u0008U\u0010R\u001a\u0004\u0008T\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010V\u001a\u0004\u0008W\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010X\u001a\u0004\u0008Y\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010Z\u001a\u0004\u0008[\u00101\u00a8\u0006_"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/ListTemplate;",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "Lcom/whoop/archv2/model/template/MetaData;",
        "screenMetadata",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "navigationBar",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/design/models/items/FooterModel;",
        "footer",
        "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;",
        "backgroundTheme",
        "",
        "backgroundImageUrl",
        "Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "lifecycleInteractions",
        "Lcom/whoop/archv2/model/template/ListPagination;",
        "pagination",
        "Lcom/whoop/archv2/model/template/PullToRefreshBehavior;",
        "pullToRefreshBehavior",
        "Lcom/whoop/archv2/model/template/TemplatePadding;",
        "padding",
        "<init>",
        "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/archv2/model/template/MetaData;",
        "component2",
        "()Lcom/whoop/design/models/items/NavigationBarModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/design/models/items/FooterModel;",
        "component5",
        "()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "()Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "component8",
        "()Lcom/whoop/archv2/model/template/ListPagination;",
        "component9",
        "()Lcom/whoop/archv2/model/template/PullToRefreshBehavior;",
        "component10",
        "()Lcom/whoop/archv2/model/template/TemplatePadding;",
        "copy",
        "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)Lcom/whoop/archv2/model/template/ListTemplate;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$arch_v2_release",
        "(Lcom/whoop/archv2/model/template/ListTemplate;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/archv2/model/template/MetaData;",
        "getScreenMetadata",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/items/FooterModel;",
        "getFooter",
        "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;",
        "getBackgroundTheme",
        "Ljava/lang/String;",
        "getBackgroundImageUrl",
        "getBackgroundImageUrl$annotations",
        "()V",
        "Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "getLifecycleInteractions",
        "getLifecycleInteractions$annotations",
        "Lcom/whoop/archv2/model/template/ListPagination;",
        "getPagination",
        "Lcom/whoop/archv2/model/template/PullToRefreshBehavior;",
        "getPullToRefreshBehavior",
        "Lcom/whoop/archv2/model/template/TemplatePadding;",
        "getPadding",
        "Companion",
        "$serializer",
        "a",
        "arch-v2_release"
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

.field public static final Companion:Lcom/whoop/archv2/model/template/ListTemplate$a;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

.field private final footer:Lcom/whoop/design/models/items/FooterModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

.field private final navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

.field private final padding:Lcom/whoop/archv2/model/template/TemplatePadding;

.field private final pagination:Lcom/whoop/archv2/model/template/ListPagination;

.field private final pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

.field private final screenMetadata:Lcom/whoop/archv2/model/template/MetaData;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/archv2/model/template/ListTemplate$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/archv2/model/template/ListTemplate$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/archv2/model/template/ListTemplate;->Companion:Lcom/whoop/archv2/model/template/ListTemplate$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/archv2/model/template/ListTemplate;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcb1/a;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcb1/a;

    const/16 v5, 0x1a

    invoke-direct {v4, v5}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xa

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v3, v4, v5

    const/4 v3, 0x3

    aput-object v1, v4, v3

    const/4 v3, 0x4

    aput-object v2, v4, v3

    const/4 v2, 0x5

    aput-object v1, v4, v2

    const/4 v2, 0x6

    aput-object v1, v4, v2

    const/4 v2, 0x7

    aput-object v1, v4, v2

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/archv2/model/template/ListTemplate;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/archv2/model/template/ListTemplate;-><init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const/4 v0, 0x0

    if-nez p12, :cond_0

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    :goto_8
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-void

    :cond_9
    iput-object p11, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/MetaData;",
            "Lcom/whoop/design/models/items/NavigationBarModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/FooterModel;",
            "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/modal/LifecycleInteractions;",
            "Lcom/whoop/archv2/model/template/ListPagination;",
            "Lcom/whoop/archv2/model/template/PullToRefreshBehavior;",
            "Lcom/whoop/archv2/model/template/TemplatePadding;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    .line 5
    iput-object p2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    .line 6
    iput-object p3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    .line 7
    iput-object p4, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    .line 8
    iput-object p5, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    .line 9
    iput-object p6, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    .line 10
    iput-object p7, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    .line 11
    iput-object p8, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    .line 12
    iput-object p9, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    .line 13
    iput-object p10, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move-object p11, p10

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/archv2/model/template/ListTemplate;-><init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)V

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

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;->Companion:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/TemplateBackgroundTheme$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/ListTemplate;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/ListTemplate;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/ListTemplate;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/archv2/model/template/ListTemplate;Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/ListTemplate;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/archv2/model/template/ListTemplate;->copy(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)Lcom/whoop/archv2/model/template/ListTemplate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBackgroundImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "background_image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getLifecycleInteractions$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$arch_v2_release(Lcom/whoop/archv2/model/template/ListTemplate;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/archv2/model/template/ListTemplate;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/archv2/model/template/MetaData$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/MetaData$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/items/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationBarModel$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/items/FooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FooterModel$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/ListTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/modal/LifecycleInteractions$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/LifecycleInteractions$$serializer;

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/ListTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/archv2/model/template/ListPagination$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/ListPagination$$serializer;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lcom/whoop/archv2/model/template/PullToRefreshBehavior$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/PullToRefreshBehavior$$serializer;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lcom/whoop/archv2/model/template/TemplatePadding$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/TemplatePadding$$serializer;

    iget-object p0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/archv2/model/template/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    return-object v0
.end method

.method public final component10()Lcom/whoop/archv2/model/template/TemplatePadding;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    return-object v0
.end method

.method public final component8()Lcom/whoop/archv2/model/template/ListPagination;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    return-object v0
.end method

.method public final component9()Lcom/whoop/archv2/model/template/PullToRefreshBehavior;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    return-object v0
.end method

.method public final copy(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)Lcom/whoop/archv2/model/template/ListTemplate;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/MetaData;",
            "Lcom/whoop/design/models/items/NavigationBarModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/FooterModel;",
            "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/modal/LifecycleInteractions;",
            "Lcom/whoop/archv2/model/template/ListPagination;",
            "Lcom/whoop/archv2/model/template/PullToRefreshBehavior;",
            "Lcom/whoop/archv2/model/template/TemplatePadding;",
            ")",
            "Lcom/whoop/archv2/model/template/ListTemplate;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/archv2/model/template/ListTemplate;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/whoop/archv2/model/template/ListTemplate;-><init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/model/template/ListTemplate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/model/template/ListTemplate;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    iget-object p1, p1, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public bridge failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/archv2/model/template/ScreenTemplate;->failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    return-object p1
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundTheme()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    return-object v0
.end method

.method public getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final getPadding()Lcom/whoop/archv2/model/template/TemplatePadding;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-object v0
.end method

.method public final getPagination()Lcom/whoop/archv2/model/template/ListPagination;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    return-object v0
.end method

.method public final getPullToRefreshBehavior()Lcom/whoop/archv2/model/template/PullToRefreshBehavior;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    return-object v0
.end method

.method public final getScreenMetadata()Lcom/whoop/archv2/model/template/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/MetaData;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NavigationBarModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/FooterModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/design/models/modal/LifecycleInteractions;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/archv2/model/template/ListPagination;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/archv2/model/template/PullToRefreshBehavior;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/archv2/model/template/TemplatePadding;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/archv2/model/template/ListTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/ListTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/ListTemplate;->items:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/ListTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v4, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundTheme:Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    iget-object v5, p0, Lcom/whoop/archv2/model/template/ListTemplate;->backgroundImageUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/archv2/model/template/ListTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    iget-object v7, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pagination:Lcom/whoop/archv2/model/template/ListPagination;

    iget-object v8, p0, Lcom/whoop/archv2/model/template/ListTemplate;->pullToRefreshBehavior:Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    iget-object v9, p0, Lcom/whoop/archv2/model/template/ListTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "ListTemplate(screenMetadata="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationBar="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundTheme="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImageUrl="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lifecycleInteractions="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pagination="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pullToRefreshBehavior="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", padding="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
