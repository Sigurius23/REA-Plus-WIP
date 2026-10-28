.class public final Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$$serializer;,
        Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 i2\u00020\u0001:\u0002jiB\u00c1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u001cB\u00d9\u0001\u0008\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0010\u0010(\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010#J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010#J\u0010\u0010,\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010%J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010#J\u0010\u0010.\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010%J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010%J\u00e2\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010%J\u0010\u0010>\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u001a\u0010C\u001a\u00020B2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u00d6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001\u00a2\u0006\u0004\u0008K\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010N\u001a\u0004\u0008O\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010P\u001a\u0004\u0008Q\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010P\u001a\u0004\u0008R\u0010%R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010P\u001a\u0004\u0008S\u0010%R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010P\u001a\u0004\u0008T\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010N\u001a\u0004\u0008U\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010N\u001a\u0004\u0008V\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010N\u001a\u0004\u0008W\u0010#R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010P\u001a\u0004\u0008X\u0010%R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010N\u001a\u0004\u0008Y\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010N\u001a\u0004\u0008Z\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010N\u001a\u0004\u0008[\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\\\u001a\u0004\u0008]\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010N\u001a\u0004\u0008^\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010_\u001a\u0004\u0008`\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010a\u001a\u0004\u0008b\u00106R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010c\u0012\u0004\u0008e\u0010f\u001a\u0004\u0008d\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010P\u001a\u0004\u0008g\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010P\u001a\u0004\u0008h\u0010%\u00a8\u0006k"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "leftIcon",
        "rightIcon",
        "backgroundStyle",
        "bedtimeIcon",
        "bedtimeDisplay",
        "bedtimeTitle",
        "bedtimePeriodDisplay",
        "waketimeIcon",
        "waketimeDisplay",
        "waketimeTitle",
        "waketimeSubtitle",
        "Lk01/f;",
        "waketimeLabelStyle",
        "waketimePeriodDisplay",
        "Lk01/a;",
        "heightStyle",
        "Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;",
        "ctaText",
        "Lcom/whoop/navigation/e;",
        "destination",
        "ctaButtonText",
        "ctaButtonIcon",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Lk01/f;",
        "component14",
        "component15",
        "()Lk01/a;",
        "component16",
        "()Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;",
        "component17",
        "()Lcom/whoop/navigation/e;",
        "component18",
        "component19",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;",
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
        "(Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "Ljava/lang/String;",
        "getLeftIcon",
        "getRightIcon",
        "getBackgroundStyle",
        "getBedtimeIcon",
        "getBedtimeDisplay",
        "getBedtimeTitle",
        "getBedtimePeriodDisplay",
        "getWaketimeIcon",
        "getWaketimeDisplay",
        "getWaketimeTitle",
        "getWaketimeSubtitle",
        "Lk01/f;",
        "getWaketimeLabelStyle",
        "getWaketimePeriodDisplay",
        "Lk01/a;",
        "getHeightStyle",
        "Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;",
        "getCtaText",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "getCtaButtonText",
        "getCtaButtonIcon",
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

.field public static final Companion:Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$Companion;


# instance fields
.field private final backgroundStyle:Ljava/lang/String;

.field private final bedtimeDisplay:Lcom/whoop/design/util/TextResource;

.field private final bedtimeIcon:Ljava/lang/String;

.field private final bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

.field private final bedtimeTitle:Lcom/whoop/design/util/TextResource;

.field private final ctaButtonIcon:Ljava/lang/String;

.field private final ctaButtonText:Ljava/lang/String;

.field private final ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

.field private final destination:Lcom/whoop/navigation/e;

.field private final heightStyle:Lk01/a;

.field private final leftIcon:Ljava/lang/String;

.field private final rightIcon:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final waketimeDisplay:Lcom/whoop/design/util/TextResource;

.field private final waketimeIcon:Ljava/lang/String;

.field private final waketimeLabelStyle:Lk01/f;

.field private final waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

.field private final waketimeSubtitle:Lcom/whoop/design/util/TextResource;

.field private final waketimeTitle:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->Companion:Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lun1/f;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lun1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lun1/f;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lun1/f;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lun1/f;

    const/16 v5, 0x1b

    invoke-direct {v4, v5}, Lun1/f;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

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

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v5, 0x7

    aput-object v1, v4, v5

    const/16 v5, 0x8

    aput-object v1, v4, v5

    const/16 v5, 0x9

    aput-object v1, v4, v5

    const/16 v5, 0xa

    aput-object v1, v4, v5

    const/16 v5, 0xb

    aput-object v1, v4, v5

    const/16 v5, 0xc

    aput-object v2, v4, v5

    const/16 v2, 0xd

    aput-object v1, v4, v2

    const/16 v2, 0xe

    aput-object v3, v4, v2

    const/16 v2, 0xf

    aput-object v1, v4, v2

    const/16 v2, 0x10

    aput-object v0, v4, v2

    const/16 v0, 0x11

    aput-object v1, v4, v0

    const/16 v0, 0x12

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x1877f

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    and-int/lit16 p2, p1, 0x80

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    iput-object p9, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    :goto_0
    iput-object p10, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p12, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_2
    iput-object p13, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    goto :goto_2

    :cond_3
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    :goto_2
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_4
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    :goto_3
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_5

    .line 2
    sget-object p2, Lk01/a;->DEFAULT:Lk01/a;

    .line 3
    :goto_4
    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    move-object/from16 p2, p17

    goto :goto_5

    :cond_5
    move-object/from16 p2, p16

    goto :goto_4

    :goto_5
    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    :goto_6
    const/high16 p2, 0x40000

    and-int/2addr p1, p2

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    return-void

    :cond_7
    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bedtimeIcon"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bedtimeDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bedtimeTitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waketimeIcon"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waketimeDisplay"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waketimeTitle"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    move-object p1, p12

    .line 16
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    move-object p1, p13

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    move-object p1, p14

    .line 18
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    move-object/from16 p1, p17

    .line 21
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    move-object/from16 p1, p18

    .line 22
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 23
    iput-object p1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p20

    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v11, v2

    goto :goto_0

    :cond_0
    move-object/from16 v11, p8

    :goto_0
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_1

    move-object v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v15, p12

    :goto_1
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_2

    move-object/from16 v16, v2

    goto :goto_2

    :cond_2
    move-object/from16 v16, p13

    :goto_2
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_3

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p14

    :goto_3
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_4

    .line 24
    sget-object v1, Lk01/a;->DEFAULT:Lk01/a;

    move-object/from16 v18, v1

    goto :goto_4

    :cond_4
    move-object/from16 v18, p15

    :goto_4
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_5

    move-object/from16 v21, v2

    goto :goto_5

    :cond_5
    move-object/from16 v21, p18

    :goto_5
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_6

    move-object/from16 v22, v2

    :goto_6
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    goto :goto_7

    :cond_6
    move-object/from16 v22, p19

    goto :goto_6

    .line 25
    :goto_7
    invoke-direct/range {v3 .. v22}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.card.sleepplanner.alarm.WakeTimeLabelStyle"

    invoke-static {}, Lk01/f;->values()[Lk01/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.card.sleepplanner.alarm.HeightStyle"

    invoke-static {}, Lk01/a;->values()[Lk01/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

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
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    if-eqz v4, :cond_1

    :goto_0
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v3, 0x8

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    if-eqz v4, :cond_3

    :goto_1
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v3, 0xc

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    if-eqz v4, :cond_5

    :goto_2
    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/j;

    iget-object v5, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    invoke-interface {p1, p2, v3, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v3, 0xd

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    if-eqz v4, :cond_7

    :goto_3
    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    sget-object v4, Lk01/a;->DEFAULT:Lk01/a;

    if-eq v3, v4, :cond_9

    :goto_4
    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    sget-object v1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    const/16 v4, 0xf

    invoke-interface {p1, p2, v4, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    if-eqz v1, :cond_d

    :goto_6
    iget-object p0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component13()Lk01/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component15()Lk01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    return-object v0
.end method

.method public final component16()Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    return-object v0
.end method

.method public final component17()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;
    .locals 21

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftIcon"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bedtimeIcon"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bedtimeDisplay"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bedtimeTitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waketimeIcon"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waketimeDisplay"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waketimeTitle"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;

    move-object/from16 v4, p3

    move-object/from16 v9, p8

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    invoke-direct/range {v1 .. v20}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBedtimeDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getBedtimeIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getBedtimePeriodDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getBedtimeTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCtaButtonIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getHeightStyle()Lk01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    return-object v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWaketimeDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWaketimeIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getWaketimeLabelStyle()Lk01/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    return-object v0
.end method

.method public final getWaketimePeriodDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWaketimeSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWaketimeTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->leftIcon:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->rightIcon:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeIcon:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimeTitle:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->bedtimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeIcon:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v11, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeTitle:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v13, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimeLabelStyle:Lk01/f;

    iget-object v14, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->waketimePeriodDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v15, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->heightStyle:Lk01/a;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaText:Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->destination:Lcom/whoop/navigation/e;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonText:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;->ctaButtonIcon:Ljava/lang/String;

    const-string v0, ", leftIcon="

    move-object/from16 v20, v15

    const-string v15, ", rightIcon="

    move-object/from16 v21, v14

    const-string v14, "SleepPlannerAlarmCardModel(title="

    invoke-static {v14, v1, v0, v2, v15}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", backgroundStyle="

    const-string v2, ", bedtimeIcon="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", bedtimeDisplay="

    const-string v2, ", bedtimeTitle="

    invoke-static {v0, v5, v1, v6, v2}, Lq63/c;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", bedtimePeriodDisplay="

    const-string v2, ", waketimeIcon="

    invoke-static {v0, v7, v1, v8, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", waketimeDisplay="

    const-string v2, ", waketimeTitle="

    invoke-static {v0, v9, v1, v10, v2}, Lq63/c;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", waketimeSubtitle="

    const-string v2, ", waketimeLabelStyle="

    invoke-static {v0, v11, v1, v12, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", waketimePeriodDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heightStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaButtonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaButtonIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v20

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
