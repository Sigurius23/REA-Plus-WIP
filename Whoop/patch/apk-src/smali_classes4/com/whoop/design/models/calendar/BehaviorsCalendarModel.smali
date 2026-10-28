.class public final Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$$serializer;,
        Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B;\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBO\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 JD\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00081\u0010 R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00100\u001a\u0004\u00082\u0010 \u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;",
        "datePicker",
        "",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
        "months",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
        "legend",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;",
        "getDatePicker",
        "Ljava/util/List;",
        "getMonths",
        "getLegend",
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

.field public static final Companion:Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$Companion;


# instance fields
.field private final datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

.field private final legend:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final months:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->Companion:Lcom/whoop/design/models/calendar/BehaviorsCalendarModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls51/p;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ls51/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ls51/p;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Ls51/p;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    aput-object v2, v3, v1

    const/4 v1, 0x3

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    sget-object p3, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "datePicker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "months"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legend"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    .line 10
    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    .line 11
    iput-object p4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 12
    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 13
    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    new-instance v3, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
            ">;)",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "datePicker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "months"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legend"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    return-object v0
.end method

.method public final getLegend()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    return-object v0
.end method

.method public final getMonths()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->datePicker:Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->months:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->legend:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BehaviorsCalendarModel(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", datePicker="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", months="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", legend="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lq63/c;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
