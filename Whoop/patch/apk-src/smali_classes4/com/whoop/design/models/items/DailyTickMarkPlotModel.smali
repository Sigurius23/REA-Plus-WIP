.class public final Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;,
        Lcom/whoop/design/models/items/DailyTickMarkPlotModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLB[\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014Bu\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u0010\u0010,\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101Jt\u00102\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00105\u001a\u000204H\u00d6\u0001\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u00087\u00108J\u001a\u0010;\u001a\u00020\u00062\u0008\u0010:\u001a\u0004\u0018\u000109H\u00d6\u0003\u00a2\u0006\u0004\u0008;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010=\u001a\u0004\u0008>\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010?\u001a\u0004\u0008@\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010A\u001a\u0004\u0008B\u0010(R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010C\u001a\u0004\u0008D\u0010*R\u001f\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008E\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010F\u001a\u0004\u0008G\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010H\u001a\u0004\u0008I\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010J\u001a\u0004\u0008K\u00101\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;",
        "header",
        "Lcom/whoop/design/models/items/TickMarksStyle;",
        "style",
        "",
        "fillFullSpace",
        "",
        "Lcom/whoop/design/models/items/TickMarkStateModel;",
        "tickMarks",
        "Lcom/whoop/design/models/items/TickLabelModel;",
        "tickMarksLabels",
        "Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;",
        "tickMarkWidthStyle",
        "Lcom/whoop/design/models/items/ExpectedAnnotationModel;",
        "expectedAnnotation",
        "Lcom/whoop/design/models/items/TickMarkFooterModel;",
        "footer",
        "<init>",
        "(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;",
        "component2",
        "()Lcom/whoop/design/models/items/TickMarksStyle;",
        "component3",
        "()Z",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;",
        "component7",
        "()Lcom/whoop/design/models/items/ExpectedAnnotationModel;",
        "component8",
        "()Lcom/whoop/design/models/items/TickMarkFooterModel;",
        "copy",
        "(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;",
        "getHeader",
        "Lcom/whoop/design/models/items/TickMarksStyle;",
        "getStyle",
        "Z",
        "getFillFullSpace",
        "Ljava/util/List;",
        "getTickMarks",
        "getTickMarksLabels",
        "Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;",
        "getTickMarkWidthStyle",
        "Lcom/whoop/design/models/items/ExpectedAnnotationModel;",
        "getExpectedAnnotation",
        "Lcom/whoop/design/models/items/TickMarkFooterModel;",
        "getFooter",
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

.field public static final Companion:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$Companion;


# instance fields
.field private final expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

.field private final fillFullSpace:Z

.field private final footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

.field private final header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

.field private final style:Lcom/whoop/design/models/items/TickMarksStyle;

.field private final tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

.field private final tickMarks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickMarkStateModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tickMarksLabels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickLabelModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->Companion:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/c;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lw91/c;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/c;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lw91/c;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/c;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, Lw91/c;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lw91/c;

    const/4 v10, 0x5

    invoke-direct {v9, v10}, Lw91/c;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v0, v9

    const/4 v9, 0x1

    aput-object v3, v0, v9

    aput-object v1, v0, v4

    aput-object v5, v0, v6

    aput-object v7, v0, v8

    aput-object v2, v0, v10

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    iput-object p3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    iput-boolean p4, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    iput-object p5, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    iput-object p8, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    iput-object p9, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;",
            "Lcom/whoop/design/models/items/TickMarksStyle;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickMarkStateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickLabelModel;",
            ">;",
            "Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;",
            "Lcom/whoop/design/models/items/ExpectedAnnotationModel;",
            "Lcom/whoop/design/models/items/TickMarkFooterModel;",
            ")V"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tickMarks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tickMarkWidthStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.TickMarksStyle"

    invoke-static {}, Lcom/whoop/design/models/items/TickMarksStyle;->values()[Lcom/whoop/design/models/items/TickMarksStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TickMarkStateModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TickMarkStateModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TickLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TickLabelModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.DailyTickMarkWidthStyle"

    invoke-static {}, Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;->values()[Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->copy(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/ExpectedAnnotationModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ExpectedAnnotationModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/TickMarkFooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TickMarkFooterModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/TickMarksStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickMarkStateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickLabelModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/ExpectedAnnotationModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/TickMarkFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;",
            "Lcom/whoop/design/models/items/TickMarksStyle;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickMarkStateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickLabelModel;",
            ">;",
            "Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;",
            "Lcom/whoop/design/models/items/ExpectedAnnotationModel;",
            "Lcom/whoop/design/models/items/TickMarkFooterModel;",
            ")",
            "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tickMarks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tickMarkWidthStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;-><init>(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getExpectedAnnotation()Lcom/whoop/design/models/items/ExpectedAnnotationModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    return-object v0
.end method

.method public final getFillFullSpace()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    return v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/TickMarkFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/TickMarksStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    return-object v0
.end method

.method public final getTickMarkWidthStyle()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    return-object v0
.end method

.method public final getTickMarks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickMarkStateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    return-object v0
.end method

.method public final getTickMarksLabels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TickLabelModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    invoke-static {v3, v2, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ExpectedAnnotationModel;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TickMarkFooterModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->header:Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->style:Lcom/whoop/design/models/items/TickMarksStyle;

    iget-boolean v2, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->fillFullSpace:Z

    iget-object v3, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarks:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarksLabels:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->tickMarkWidthStyle:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    iget-object v6, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->expectedAnnotation:Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    iget-object v7, p0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->footer:Lcom/whoop/design/models/items/TickMarkFooterModel;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "DailyTickMarkPlotModel(header="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillFullSpace="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tickMarks="

    const-string v1, ", tickMarksLabels="

    invoke-static {v0, v1, v8, v3, v2}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tickMarkWidthStyle="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expectedAnnotation="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
