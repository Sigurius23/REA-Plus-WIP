.class public final Lcom/whoop/design/models/items/TogglesModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/TogglesModel$$serializer;,
        Lcom/whoop/design/models/items/TogglesModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 n2\u00020\u0001:\u0002onB\u00c7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u00df\u0001\u0008\u0010\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010/J\u0010\u00105\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00089\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010/J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010/J\u00f2\u0001\u0010@\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008@\u0010AJ\u0010\u0010B\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008B\u0010%J\u0010\u0010C\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008C\u0010DJ\u001a\u0010G\u001a\u00020\u000c2\u0008\u0010F\u001a\u0004\u0018\u00010EH\u00d6\u0003\u00a2\u0006\u0004\u0008G\u0010HJ\'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001\u00a2\u0006\u0004\u0008O\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010R\u001a\u0004\u0008S\u0010%R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010R\u001a\u0004\u0008T\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010R\u001a\u0004\u0008U\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010R\u001a\u0004\u0008V\u0010%R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010W\u001a\u0004\u0008X\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010R\u001a\u0004\u0008Y\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010Z\u001a\u0004\u0008[\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\\\u001a\u0004\u0008\r\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010R\u001a\u0004\u0008]\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010^\u001a\u0004\u0008_\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\\\u001a\u0004\u0008`\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\\\u001a\u0004\u0008\u0012\u0010/R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010a\u001a\u0004\u0008b\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010c\u001a\u0004\u0008d\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010^\u001a\u0004\u0008e\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\\\u001a\u0004\u0008f\u0010/R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010g\u0012\u0004\u0008i\u0010j\u001a\u0004\u0008h\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010k\u001a\u0004\u0008l\u0010>R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\\\u001a\u0004\u0008m\u0010/\u00a8\u0006p"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TogglesModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "icon",
        "subtitle",
        "",
        "categories",
        "avoidTextDisplay",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "trend",
        "",
        "isToggled",
        "backgroundImage",
        "",
        "selectedValue",
        "selected",
        "isAvoidChecked",
        "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "style",
        "Lcom/whoop/design/models/items/DayOptions;",
        "dayOptions",
        "sortPriority",
        "weeklyPlanGoal",
        "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
        "bottomSheetInfo",
        "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;",
        "tag",
        "custom",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/ImpactModel;",
        "component8",
        "()Ljava/lang/Boolean;",
        "component9",
        "component10",
        "()Ljava/lang/Integer;",
        "component11",
        "component12",
        "component13",
        "()Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "component14",
        "()Lcom/whoop/design/models/items/DayOptions;",
        "component15",
        "component16",
        "component17",
        "()Lcom/whoop/design/models/items/BottomSheetInfoModel;",
        "component18",
        "()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;",
        "component19",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/TogglesModel;",
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
        "(Lcom/whoop/design/models/items/TogglesModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getIcon",
        "getSubtitle",
        "Ljava/util/List;",
        "getCategories",
        "getAvoidTextDisplay",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "getTrend",
        "Ljava/lang/Boolean;",
        "getBackgroundImage",
        "Ljava/lang/Integer;",
        "getSelectedValue",
        "getSelected",
        "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "getStyle",
        "Lcom/whoop/design/models/items/DayOptions;",
        "getDayOptions",
        "getSortPriority",
        "getWeeklyPlanGoal",
        "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
        "getBottomSheetInfo",
        "getBottomSheetInfo$annotations",
        "()V",
        "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;",
        "getTag",
        "getCustom",
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

.field public static final Companion:Lcom/whoop/design/models/items/TogglesModel$Companion;


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

.field private final bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bottom_info_sheet"
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

.field private final custom:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "custom"
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

.field private final isToggled:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_toggled"
    .end annotation
.end field

.field private final selected:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selected"
    .end annotation
.end field

.field private final selectedValue:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selected_value"
    .end annotation
.end field

.field private final sortPriority:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sort_priority"
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

.field private final tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

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

.field private final weeklyPlanGoal:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weekly_plan_goal"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/TogglesModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/TogglesModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/TogglesModel;->Companion:Lcom/whoop/design/models/items/TogglesModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/TogglesModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/k;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lw91/k;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/k;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lw91/k;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x13

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v3, v4, v5

    const/4 v3, 0x5

    aput-object v1, v4, v3

    const/4 v3, 0x6

    aput-object v1, v4, v3

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    const/16 v0, 0xb

    aput-object v1, v4, v0

    const/16 v0, 0xc

    aput-object v2, v4, v0

    const/16 v0, 0xd

    aput-object v1, v4, v0

    const/16 v0, 0xe

    aput-object v1, v4, v0

    const/16 v0, 0xf

    aput-object v1, v4, v0

    const/16 v0, 0x10

    aput-object v1, v4, v0

    const/16 v0, 0x11

    aput-object v1, v4, v0

    const/16 v0, 0x12

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/TogglesModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x1ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/TogglesModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TogglesModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iput-object p9, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    iput-object p10, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    iput-object p12, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    iput-object p13, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    goto :goto_0

    :cond_1
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    :goto_0
    const/high16 p2, 0x40000

    and-int/2addr p1, p2

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    return-void

    :cond_2
    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/ImpactModel;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
            "Lcom/whoop/design/models/items/DayOptions;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
            "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-object p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    const/high16 v0, 0x20000

    and-int v0, p20, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object/from16 v20, v1

    goto :goto_0

    :cond_0
    move-object/from16 v20, p18

    :goto_0
    const/high16 v0, 0x40000

    and-int v0, p20, v0

    if-eqz v0, :cond_1

    move-object/from16 v21, v1

    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    goto :goto_2

    :cond_1
    move-object/from16 v21, p19

    goto :goto_1

    .line 22
    :goto_2
    invoke-direct/range {v2 .. v21}, Lcom/whoop/design/models/items/TogglesModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)V

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

    const-string v0, "com.whoop.design.models.items.GoalSettingsTileStyle"

    invoke-static {}, Lcom/whoop/design/models/items/GoalSettingsTileStyle;->values()[Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TogglesModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TogglesModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TogglesModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/TogglesModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/design/models/items/TogglesModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/design/models/items/TogglesModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/TogglesModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getBottomSheetInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bottom_info_sheet"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/TogglesModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/TogglesModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    const/4 v4, 0x6

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    const/16 v4, 0x9

    invoke-interface {p1, p2, v4, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xc

    aget-object v0, v0, v3

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    invoke-interface {p1, p2, v3, v0, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/DayOptions$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DayOptions$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    const/16 v4, 0xd

    invoke-interface {p1, p2, v4, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xe

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xf

    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/BottomSheetInfoModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BottomSheetInfoModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    const/16 v3, 0x10

    invoke-interface {p1, p2, v3, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/design/models/items/GoalSettingsTileTagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GoalSettingsTileTagModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    invoke-interface {p1, p2, v0, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    :goto_1
    iget-object p0, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/GoalSettingsTileStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/items/DayOptions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component16()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component17()Lcom/whoop/design/models/items/BottomSheetInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    return-object v0
.end method

.method public final component18()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    return-object v0
.end method

.method public final component19()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/TogglesModel;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/ImpactModel;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
            "Lcom/whoop/design/models/items/DayOptions;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
            "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/design/models/items/TogglesModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/TogglesModel;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    invoke-direct/range {v1 .. v20}, Lcom/whoop/design/models/items/TogglesModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/TogglesModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/TogglesModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAvoidTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getBottomSheetInfo()Lcom/whoop/design/models/items/BottomSheetInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    return-object v0
.end method

.method public final getCustom()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDayOptions()Lcom/whoop/design/models/items/DayOptions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelected()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSelectedValue()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSortPriority()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrend()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final getWeeklyPlanGoal()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImpactModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    if-nez v0, :cond_9

    move v0, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Lcom/whoop/design/models/items/DayOptions;->hashCode()I

    move-result v0

    :goto_9
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    if-nez v0, :cond_a

    move v0, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_a
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    if-nez v0, :cond_b

    move v0, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_b
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    if-nez v0, :cond_c

    move v0, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v0}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->hashCode()I

    move-result v0

    :goto_c
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    if-nez v0, :cond_d

    move v0, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v0}, Lcom/whoop/design/models/items/GoalSettingsTileTagModel;->hashCode()I

    move-result v0

    :goto_d
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    if-nez v0, :cond_e

    goto :goto_e

    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v2, v3

    return v2
.end method

.method public final isAvoidChecked()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isToggled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/TogglesModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/TogglesModel;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/TogglesModel;->icon:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/TogglesModel;->subtitle:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/TogglesModel;->categories:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/design/models/items/TogglesModel;->avoidTextDisplay:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/TogglesModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v8, v0, Lcom/whoop/design/models/items/TogglesModel;->isToggled:Ljava/lang/Boolean;

    iget-object v9, v0, Lcom/whoop/design/models/items/TogglesModel;->backgroundImage:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/TogglesModel;->selectedValue:Ljava/lang/Integer;

    iget-object v11, v0, Lcom/whoop/design/models/items/TogglesModel;->selected:Ljava/lang/Boolean;

    iget-object v12, v0, Lcom/whoop/design/models/items/TogglesModel;->isAvoidChecked:Ljava/lang/Boolean;

    iget-object v13, v0, Lcom/whoop/design/models/items/TogglesModel;->style:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    iget-object v14, v0, Lcom/whoop/design/models/items/TogglesModel;->dayOptions:Lcom/whoop/design/models/items/DayOptions;

    iget-object v15, v0, Lcom/whoop/design/models/items/TogglesModel;->sortPriority:Ljava/lang/Integer;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/TogglesModel;->weeklyPlanGoal:Ljava/lang/Boolean;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/TogglesModel;->bottomSheetInfo:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/TogglesModel;->tag:Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/TogglesModel;->custom:Ljava/lang/Boolean;

    const-string v0, ", title="

    move-object/from16 v20, v15

    const-string v15, ", icon="

    move-object/from16 v21, v14

    const-string v14, "TogglesModel(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitle="

    const-string v2, ", categories="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", avoidTextDisplay="

    const-string v2, ", trend="

    invoke-static {v1, v6, v2, v0, v5}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isToggled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedValue="

    const-string v2, ", selected="

    invoke-static {v10, v9, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", isAvoidChecked="

    const-string v2, ", style="

    invoke-static {v0, v11, v1, v12, v2}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dayOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sortPriority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSheetInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", custom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v20

    invoke-static {v0, v2, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
