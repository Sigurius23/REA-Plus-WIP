.class public final Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$$serializer;,
        Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 K2\u00020\u0001:\u0002LKBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0090\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0019R \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010;\u001a\u0004\u0008<\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008=\u0010\u0019R(\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010;\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008A\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008B\u0010\u0019R\"\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008C\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010D\u001a\u0004\u0008E\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010F\u0012\u0004\u0008H\u0010@\u001a\u0004\u0008G\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010F\u0012\u0004\u0008J\u0010@\u001a\u0004\u0008I\u0010$\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "",
        "categories",
        "currentCategory",
        "Lcom/whoop/design/models/items/GroupedTogglesModel;",
        "groupedTogglesModels",
        "searchTitle",
        "buttonTitle",
        "Lcom/whoop/design/models/items/TogglesModel;",
        "toggles",
        "Lcom/whoop/design/models/items/ConfirmationModalModel;",
        "confirmationModal",
        "customBehaviorsEmptyState",
        "customBehaviorsWidget",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/ConfirmationModalModel;",
        "component9",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component10",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/List;",
        "getCategories",
        "getCurrentCategory",
        "getGroupedTogglesModels",
        "getGroupedTogglesModels$annotations",
        "()V",
        "getSearchTitle",
        "getButtonTitle",
        "getToggles",
        "Lcom/whoop/design/models/items/ConfirmationModalModel;",
        "getConfirmationModal",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getCustomBehaviorsEmptyState",
        "getCustomBehaviorsEmptyState$annotations",
        "getCustomBehaviorsWidget",
        "getCustomBehaviorsWidget$annotations",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$Companion;


# instance fields
.field private final buttonTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "button_title"
    .end annotation
.end field

.field private final categories:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "categories"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "confirmation_modal"
    .end annotation
.end field

.field private final currentCategory:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_category"
    .end annotation
.end field

.field private final customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "custom_behaviors_empty_state"
    .end annotation
.end field

.field private final customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "custom_behaviors_widget"
    .end annotation
.end field

.field private final groupedTogglesModels:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "grouped_toggles"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GroupedTogglesModel;",
            ">;"
        }
    .end annotation
.end field

.field private final searchTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "search_title"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final toggles:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "toggles"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TogglesModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->Companion:Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/b;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lw91/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/b;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Lw91/b;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/b;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lw91/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lw91/c;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lw91/c;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v8, Lw91/c;

    const/4 v9, 0x1

    invoke-direct {v8, v9}, Lw91/c;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v8, 0xa

    new-array v8, v8, [Ll83/h;

    aput-object v1, v8, v7

    aput-object v3, v8, v9

    const/4 v3, 0x2

    aput-object v1, v8, v3

    const/4 v3, 0x3

    aput-object v4, v8, v3

    const/4 v3, 0x4

    aput-object v1, v8, v3

    const/4 v3, 0x5

    aput-object v1, v8, v3

    const/4 v3, 0x6

    aput-object v5, v8, v3

    const/4 v3, 0x7

    aput-object v1, v8, v3

    aput-object v6, v8, v0

    const/16 v0, 0x9

    aput-object v2, v8, v0

    sput-object v8, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    and-int/lit16 p2, p1, 0x100

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_0

    :cond_1
    iput-object p10, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    :goto_0
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    return-void

    :cond_2
    iput-object p11, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GroupedTogglesModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TogglesModel;",
            ">;",
            "Lcom/whoop/design/models/items/ConfirmationModalModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentCategory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p11, 0x100

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p9, v0

    :cond_0
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_1

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

    :cond_1
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/GroupedTogglesModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GroupedTogglesModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TogglesModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TogglesModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
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

.method private static final _childSerializers$_anonymous_$3()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

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

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCustomBehaviorsEmptyState$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCustomBehaviorsWidget$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGroupedTogglesModels$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "grouped_toggles"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/ConfirmationModalModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ConfirmationModalModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GroupedTogglesModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TogglesModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/ConfirmationModalModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GroupedTogglesModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TogglesModel;",
            ">;",
            "Lcom/whoop/design/models/items/ConfirmationModalModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")",
            "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentCategory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchTitle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    return-object v0
.end method

.method public final getConfirmationModal()Lcom/whoop/design/models/items/ConfirmationModalModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    return-object v0
.end method

.method public final getCurrentCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomBehaviorsEmptyState()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getCustomBehaviorsWidget()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getGroupedTogglesModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GroupedTogglesModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    return-object v0
.end method

.method public final getSearchTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TogglesModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ConfirmationModalModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->categories:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->currentCategory:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->groupedTogglesModels:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->searchTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->buttonTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->toggles:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->confirmationModal:Lcom/whoop/design/models/items/ConfirmationModalModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsEmptyState:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v9, p0, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->customBehaviorsWidget:Lcom/whoop/design/models/DesignSystemModel;

    const-string v10, ", categories="

    const-string v11, ", currentCategory="

    const-string v12, "CustomizeBottomSheetSelectorModel(title="

    invoke-static {v12, v0, v10, v11, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupedTogglesModels="

    const-string v10, ", searchTitle="

    invoke-static {v2, v1, v10, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", buttonTitle="

    const-string v2, ", toggles="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", confirmationModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customBehaviorsEmptyState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customBehaviorsWidget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
