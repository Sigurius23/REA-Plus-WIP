.class public final Lcom/whoop/design/models/items/GoalSettingsTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/GoalSettingsTileModel$$serializer;,
        Lcom/whoop/design/models/items/GoalSettingsTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 X2\u00020\u0001:\u0002YXBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u008c\u0001\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001aJ\u0010\u0010-\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u00020\u000c2\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102J\'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001\u00a2\u0006\u0004\u00089\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010<\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008=\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010<\u0012\u0004\u0008A\u0010?\u001a\u0004\u0008@\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010<\u0012\u0004\u0008C\u0010?\u001a\u0004\u0008B\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010D\u0012\u0004\u0008F\u0010?\u001a\u0004\u0008E\u0010\u001eR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010<\u0012\u0004\u0008H\u0010?\u001a\u0004\u0008G\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010I\u0012\u0004\u0008K\u0010?\u001a\u0004\u0008J\u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010<\u0012\u0004\u0008M\u0010?\u001a\u0004\u0008L\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010N\u0012\u0004\u0008O\u0010?\u001a\u0004\u0008\r\u0010$R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010<\u0012\u0004\u0008Q\u0010?\u001a\u0004\u0008P\u0010\u001aR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010R\u0012\u0004\u0008T\u0010?\u001a\u0004\u0008S\u0010\'R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010U\u0012\u0004\u0008W\u0010?\u001a\u0004\u0008V\u0010)\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/whoop/design/models/items/GoalSettingsTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "subtitle",
        "icon",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "trend",
        "backgroundImage",
        "",
        "selectedValue",
        "avoidTextDisplay",
        "",
        "isAvoidChecked",
        "id",
        "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "style",
        "Lcom/whoop/design/models/items/DayOptions;",
        "dayOptions",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/ImpactModel;",
        "component5",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "component8",
        "()Ljava/lang/Boolean;",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "component11",
        "()Lcom/whoop/design/models/items/DayOptions;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)Lcom/whoop/design/models/items/GoalSettingsTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/GoalSettingsTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getSubtitle",
        "getSubtitle$annotations",
        "getIcon",
        "getIcon$annotations",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "getTrend",
        "getTrend$annotations",
        "getBackgroundImage",
        "getBackgroundImage$annotations",
        "Ljava/lang/Integer;",
        "getSelectedValue",
        "getSelectedValue$annotations",
        "getAvoidTextDisplay",
        "getAvoidTextDisplay$annotations",
        "Ljava/lang/Boolean;",
        "isAvoidChecked$annotations",
        "getId",
        "getId$annotations",
        "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "getStyle",
        "getStyle$annotations",
        "Lcom/whoop/design/models/items/DayOptions;",
        "getDayOptions",
        "getDayOptions$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/items/GoalSettingsTileModel$Companion;


# instance fields
.field private final avoidTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avoid_text_display"
    .end annotation
.end field

.field private final backgroundImage:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "background_image"
    .end annotation
.end field

.field private final dayOptions:Lcom/whoop/design/models/items/DayOptions;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_options"
    .end annotation
.end field

.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final isAvoidChecked:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_avoid_checked"
    .end annotation
.end field

.field private final selectedValue:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selected_value"
    .end annotation
.end field

.field private final style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "style"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final trend:Lcom/whoop/design/models/items/ImpactModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/GoalSettingsTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->Companion:Lcom/whoop/design/models/items/GoalSettingsTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/e;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lw91/e;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xb

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v2, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/GoalSettingsTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/GoalSettingsTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GoalSettingsTileModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/GoalSettingsTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iput-object p6, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    iput-object p8, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    iput-object p10, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    iput-object p12, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOptions"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.GoalSettingsTileStyle"

    invoke-static {}, Lcom/whoop/design/models/items/GoalSettingsTileStyle;->values()[Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/GoalSettingsTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;ILjava/lang/Object;)Lcom/whoop/design/models/items/GoalSettingsTileModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAvoidTextDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "avoid_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getBackgroundImage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "background_image"
    .end annotation

    return-void
.end method

.method public static synthetic getDayOptions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "day_options"
    .end annotation

    return-void
.end method

.method public static synthetic getIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getSelectedValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "selected_value"
    .end annotation

    return-void
.end method

.method public static synthetic getStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "style"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static synthetic getTrend$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend"
    .end annotation

    return-void
.end method

.method public static synthetic isAvoidChecked$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_avoid_checked"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/GoalSettingsTileModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    const/4 v4, 0x5

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/DayOptions$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DayOptions$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/GoalSettingsTileStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/DayOptions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)Lcom/whoop/design/models/items/GoalSettingsTileModel;
    .locals 13

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOptions"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/GoalSettingsTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    iget-object p1, p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAvoidTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayOptions()Lcom/whoop/design/models/items/DayOptions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedValue()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrend()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImpactModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DayOptions;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isAvoidChecked()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->icon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->backgroundImage:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->selectedValue:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->avoidTextDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked:Ljava/lang/Boolean;

    iget-object v8, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->id:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    iget-object v10, p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    const-string v11, ", subtitle="

    const-string v12, ", icon="

    const-string v13, "GoalSettingsTileModel(title="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedValue="

    const-string v2, ", avoidTextDisplay="

    invoke-static {v5, v4, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", isAvoidChecked="

    const-string v2, ", id="

    invoke-static {v7, v6, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dayOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
