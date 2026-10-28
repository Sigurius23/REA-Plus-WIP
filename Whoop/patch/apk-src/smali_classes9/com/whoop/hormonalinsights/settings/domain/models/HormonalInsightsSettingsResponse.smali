.class public final Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;,
        Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 ^2\u00020\u0001:\u0002_^B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00a3\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u00ac\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010!J\u0010\u00109\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010=\u001a\u00020<2\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001\u00a2\u0006\u0004\u0008E\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010H\u001a\u0004\u0008I\u0010!R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010J\u001a\u0004\u0008K\u0010#R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010L\u001a\u0004\u0008M\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010L\u001a\u0004\u0008N\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010O\u001a\u0004\u0008P\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010O\u001a\u0004\u0008Q\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010O\u001a\u0004\u0008R\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010S\u001a\u0004\u0008T\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010U\u001a\u0004\u0008V\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010L\u001a\u0004\u0008W\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010X\u001a\u0004\u0008Y\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010Z\u001a\u0004\u0008[\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\\\u001a\u0004\u0008]\u00105\u00a8\u0006`"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
        "",
        "",
        "navigationBarTitle",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "tiles",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
        "hormonalInsightsModeDrawer",
        "contraceptionTypeDrawer",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
        "disablingDialog",
        "switchingModeDialog",
        "switchingContraceptionTypeDialog",
        "Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;",
        "pregnancyDueDateDrawer",
        "Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;",
        "previousPregnancies",
        "disableFertilityInsightsSurveyDrawer",
        "Lcom/whoop/navigation/e;",
        "enableFertilityInsightsDestination",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "enablePregnancyInsightsConfirmation",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;",
        "goalsDrawer",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
        "component4",
        "component5",
        "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;",
        "component9",
        "()Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;",
        "component10",
        "component11",
        "()Lcom/whoop/navigation/e;",
        "component12",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "component13",
        "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
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
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getNavigationBarTitle",
        "Ljava/util/List;",
        "getTiles",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
        "getHormonalInsightsModeDrawer",
        "getContraceptionTypeDrawer",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
        "getDisablingDialog",
        "getSwitchingModeDialog",
        "getSwitchingContraceptionTypeDialog",
        "Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;",
        "getPregnancyDueDateDrawer",
        "Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;",
        "getPreviousPregnancies",
        "getDisableFertilityInsightsSurveyDrawer",
        "Lcom/whoop/navigation/e;",
        "getEnableFertilityInsightsDestination",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getEnablePregnancyInsightsConfirmation",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;",
        "getGoalsDrawer",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$Companion;


# instance fields
.field private final contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

.field private final disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

.field private final disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

.field private final enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

.field private final enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

.field private final goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

.field private final hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

.field private final navigationBarTitle:Ljava/lang/String;

.field private final pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

.field private final previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

.field private final switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

.field private final switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

.field private final tiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->Companion:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lri2/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lri2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lri2/a;

    const/16 v6, 0xe

    invoke-direct {v5, v6}, Lri2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lri2/a;

    const/16 v7, 0xf

    invoke-direct {v6, v7}, Lri2/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v3, v4, v6

    const/4 v3, 0x2

    aput-object v1, v4, v3

    const/4 v3, 0x3

    aput-object v1, v4, v3

    const/4 v3, 0x4

    aput-object v1, v4, v3

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

    aput-object v5, v4, v0

    const/16 v0, 0xb

    aput-object v2, v4, v0

    const/16 v0, 0xc

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1fff

    const/16 v1, 0x1fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iput-object p9, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    iput-object p10, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    iput-object p11, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iput-object p12, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    iput-object p13, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hormonalInsightsModeDrawer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    .line 10
    iput-object p8, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    .line 11
    iput-object p9, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    .line 13
    iput-object p11, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    .line 14
    iput-object p12, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    .line 15
    iput-object p13, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

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
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    const/16 v4, 0x8

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    const/16 v1, 0xc

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    return-object v0
.end method

.method public final component11()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component13()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    return-object v0
.end method

.method public final component4()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    return-object v0
.end method

.method public final component5()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final component6()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final component7()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final component8()Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    return-object v0
.end method

.method public final component9()Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;",
            ")",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;"
        }
    .end annotation

    const-string v0, "navigationBarTitle"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hormonalInsightsModeDrawer"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getContraceptionTypeDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    return-object v0
.end method

.method public final getDisableFertilityInsightsSurveyDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    return-object v0
.end method

.method public final getDisablingDialog()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final getEnableFertilityInsightsDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEnablePregnancyInsightsConfirmation()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getGoalsDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    return-object v0
.end method

.method public final getHormonalInsightsModeDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    return-object v0
.end method

.method public final getNavigationBarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getPregnancyDueDateDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    return-object v0
.end method

.method public final getPreviousPregnancies()Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    return-object v0
.end method

.method public final getSwitchingContraceptionTypeDialog()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final getSwitchingModeDialog()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final getTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v0, :cond_8

    move v0, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v0

    :goto_8
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    if-nez v0, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->navigationBarTitle:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->tiles:Ljava/util/List;

    iget-object v3, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->hormonalInsightsModeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iget-object v4, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->contraceptionTypeDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iget-object v5, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disablingDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iget-object v6, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingModeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iget-object v7, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->switchingContraceptionTypeDialog:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    iget-object v8, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->pregnancyDueDateDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    iget-object v9, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->previousPregnancies:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    iget-object v10, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->disableFertilityInsightsSurveyDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    iget-object v11, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enableFertilityInsightsDestination:Lcom/whoop/navigation/e;

    iget-object v12, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->enablePregnancyInsightsConfirmation:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v13, v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->goalsDrawer:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    const-string v14, ", tiles="

    const-string v15, ", hormonalInsightsModeDrawer="

    const-string v0, "HormonalInsightsSettingsResponse(navigationBarTitle="

    invoke-static {v0, v1, v14, v15, v2}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contraceptionTypeDrawer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disablingDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", switchingModeDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", switchingContraceptionTypeDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pregnancyDueDateDrawer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", previousPregnancies="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disableFertilityInsightsSurveyDrawer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enableFertilityInsightsDestination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enablePregnancyInsightsConfirmation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", goalsDrawer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
