.class public Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;
.super Lcom/whoop/ui/ProgressDial;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0017\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0089\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001b\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001d\u0010\u0012J\u0015\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\u000c2\u0006\u0010 \u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008!\u0010\u0012J\u001f\u0010$\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008$\u0010%J7\u0010+\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010/\u001a\u00020\u000c2\u0006\u0010.\u001a\u00020-H\u0014\u00a2\u0006\u0004\u0008/\u00100R6\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u000f012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000f018\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010B\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010?R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010K\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010HR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010HR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008N\u0010HR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008P\u0010HR\u0016\u0010S\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008R\u0010HR\u0016\u0010U\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010HR\u0016\u0010W\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010HR\u0016\u0010Y\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010HR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0016\u0010d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0014\u0010f\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010\\R\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0014\u0010p\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010?R\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR\u0016\u0010v\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008u\u0010cR\u0014\u0010x\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010\\R\u0014\u0010z\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010?R\u0016\u0010|\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010cR%\u0010\u0082\u0001\u001a\u00020g8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0014\n\u0004\u0008}\u0010i\u001a\u0004\u0008~\u0010\u007f\"\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\'\u0010\u0087\u0001\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0016\n\u0005\u0008\u0083\u0001\u0010H\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\"\u0005\u0008\u0086\u0001\u0010\u0012\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;",
        "Lcom/whoop/ui/ProgressDial;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "value",
        "Ll83/a0;",
        "setFillWhite",
        "(Z)V",
        "",
        "progress",
        "o",
        "(F)V",
        "j",
        "()V",
        "k",
        "l",
        "angle",
        "i",
        "(F)F",
        "h",
        "setDrawGoalIcon",
        "textSize",
        "setOptimalLabelTextSize",
        "animate",
        "setGoalReached",
        "goalPct",
        "setGoalPct",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "Li93/f;",
        "S",
        "Li93/f;",
        "getOptimalRange",
        "()Li93/f;",
        "setOptimalRange",
        "(Li93/f;)V",
        "optimalRange",
        "Landroid/graphics/Path;",
        "T",
        "Landroid/graphics/Path;",
        "optimalRangePath",
        "Landroid/graphics/Paint;",
        "U",
        "Landroid/graphics/Paint;",
        "optimalRangePaint",
        "V",
        "optimalLabelPaint",
        "",
        "W",
        "Ljava/lang/String;",
        "optimalString",
        "a0",
        "F",
        "optimalLabelLength",
        "b0",
        "optimalLabelHeight",
        "c0",
        "optimalRangeRadius",
        "d0",
        "totalOptimalArcLength",
        "e0",
        "totalOptimalArcAngle",
        "f0",
        "arcSegmentLength",
        "g0",
        "firstSegmentStartAngle",
        "h0",
        "secondSegmentStartAngle",
        "i0",
        "segmentSweepAngle",
        "Landroid/graphics/RectF;",
        "j0",
        "Landroid/graphics/RectF;",
        "optimalRangeRect",
        "Landroid/graphics/Typeface;",
        "k0",
        "Landroid/graphics/Typeface;",
        "labelTypeface",
        "l0",
        "Z",
        "drawGoalIcon",
        "m0",
        "goalIconRect",
        "Landroid/graphics/PointF;",
        "n0",
        "Landroid/graphics/PointF;",
        "goalIconCenterPoint",
        "Landroid/widget/ImageView;",
        "o0",
        "Landroid/widget/ImageView;",
        "goalIcon",
        "p0",
        "goalIconPaint",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "q0",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "goalAvatar",
        "r0",
        "fillWhite",
        "s0",
        "fillWhiteRect",
        "t0",
        "fillWhitePaint",
        "u0",
        "goalReached",
        "v0",
        "getDialCenterPoint",
        "()Landroid/graphics/PointF;",
        "setDialCenterPoint",
        "(Landroid/graphics/PointF;)V",
        "dialCenterPoint",
        "w0",
        "getDialRadius",
        "()F",
        "setDialRadius",
        "dialRadius",
        "x0",
        "a",
        "realtime-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final A0:F

.field public static final x0:Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$a;

.field public static final y0:I

.field private static final z0:F


# instance fields
.field private S:Li93/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li93/f;"
        }
    .end annotation
.end field

.field private final T:Landroid/graphics/Path;

.field private final U:Landroid/graphics/Paint;

.field private final V:Landroid/graphics/Paint;

.field private final W:Ljava/lang/String;

.field private a0:F

.field private b0:F

.field private c0:F

.field private d0:F

.field private e0:F

.field private f0:F

.field private g0:F

.field private h0:F

.field private i0:F

.field private final j0:Landroid/graphics/RectF;

.field private k0:Landroid/graphics/Typeface;

.field private l0:Z

.field private final m0:Landroid/graphics/RectF;

.field private n0:Landroid/graphics/PointF;

.field private o0:Landroid/widget/ImageView;

.field private final p0:Landroid/graphics/Paint;

.field private final q0:Lde/hdodenhof/circleimageview/CircleImageView;

.field private r0:Z

.field private final s0:Landroid/graphics/RectF;

.field private final t0:Landroid/graphics/Paint;

.field private u0:Z

.field private v0:Landroid/graphics/PointF;

.field private w0:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->x0:Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->y0:I

    const/high16 v0, 0x42500000    # 52.0f

    sput v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->z0:F

    const/high16 v0, 0x42080000    # 34.0f

    sput v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->A0:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/ProgressDial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v0, Li93/e;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Li93/e;-><init>(FF)V

    .line 4
    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    .line 5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->T:Landroid/graphics/Path;

    .line 6
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    .line 8
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->n0:Landroid/graphics/PointF;

    .line 9
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->o0:Landroid/widget/ImageView;

    .line 10
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v2, -0x1

    .line 11
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->p0:Landroid/graphics/Paint;

    .line 14
    new-instance v0, Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-direct {v0, p1}, Lde/hdodenhof/circleimageview/CircleImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->q0:Lde/hdodenhof/circleimageview/CircleImageView;

    .line 15
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->s0:Landroid/graphics/RectF;

    .line 16
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 17
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->t0:Landroid/graphics/Paint;

    .line 20
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    .line 21
    sget-object v0, Lk52/h;->j:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string p3, "obtainStyledAttributes(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget p3, Lk52/h;->l:I

    .line 23
    sget v0, Lvu1/a;->a:I

    invoke-static {p1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 24
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    .line 25
    sget v0, Lk52/h;->k:I

    const/4 v4, 0x1

    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/whoop/ui/ProgressDial;->setDrawGoalLine(Z)V

    .line 26
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 27
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setFlags(I)V

    .line 28
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 31
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 32
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lvu1/b;->c:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    int-to-float v5, v5

    const/4 v6, 0x2

    .line 34
    new-array v6, v6, [F

    aput v5, v6, v2

    const/high16 v5, 0x40c00000    # 6.0f

    aput v5, v6, v4

    .line 35
    invoke-direct {v0, v6, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 36
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->U:Landroid/graphics/Paint;

    .line 37
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 38
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setFlags(I)V

    .line 39
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->V:Landroid/graphics/Paint;

    .line 42
    sget p3, Lk52/f;->D:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "toUpperCase(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->W:Ljava/lang/String;

    .line 43
    sget v0, Lgy0/b;->a:I

    invoke-static {p1, v0}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->k0:Landroid/graphics/Typeface;

    .line 44
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lvu1/b;->j:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 47
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2, p3, v2, v1, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 48
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->a0:F

    .line 49
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->b0:F

    const/high16 p3, 0x3fc00000    # 1.5f

    mul-float/2addr p2, p3

    .line 50
    invoke-virtual {p0, p2}, Lcom/whoop/ui/ProgressDial;->setGoalMargin(F)V

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 52
    new-instance p2, Li93/e;

    const p3, 0x3f19999a    # 0.6f

    const v0, 0x3f4ccccd    # 0.8f

    invoke-direct {p2, p3, v0}, Li93/e;-><init>(FF)V

    .line 53
    invoke-virtual {p0, p2}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setOptimalRange(Li93/f;)V

    const p2, 0x3f2147ae    # 0.63f

    .line 54
    invoke-virtual {p0, p2}, Lcom/whoop/ui/ProgressDial;->setProgress(F)V

    .line 55
    :cond_0
    iget-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->o0:Landroid/widget/ImageView;

    sget p3, Lvu1/c;->o:I

    invoke-static {p1, p3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 56
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic e(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->n(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;)Lde/hdodenhof/circleimageview/CircleImageView;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->q0:Lde/hdodenhof/circleimageview/CircleImageView;

    return-object p0
.end method

.method private final h(F)F
    .locals 2

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method private final i(F)F
    .locals 2

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method private final j()V
    .locals 9

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->N:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->n0:Landroid/graphics/PointF;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    iget v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->w0:F

    sget v4, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->z0:F

    sub-float/2addr v3, v4

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    double-to-float v0, v7

    mul-float/2addr v3, v0

    add-float/2addr v3, v2

    iput v3, v1, Landroid/graphics/PointF;->x:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->n0:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->w0:F

    sub-float/2addr v2, v4

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    neg-float v3, v3

    mul-float/2addr v2, v3

    add-float/2addr v2, v1

    iput v2, v0, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->n0:Landroid/graphics/PointF;

    iget v2, v1, Landroid/graphics/PointF;->x:F

    sget v3, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->A0:F

    sub-float v4, v2, v3

    iput v4, v0, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float v4, v1, v3

    iput v4, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v3

    iput v2, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method private final k()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/16 v1, 0x168

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    invoke-interface {v2}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    mul-float/2addr v2, v1

    const/4 v1, 0x2

    int-to-float v1, v1

    sub-float/2addr v2, v1

    invoke-direct {p0, v2}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i(F)F

    move-result v3

    iget v4, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    mul-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    sub-float/2addr v2, v0

    invoke-direct {p0, v2}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i(F)F

    move-result v2

    iget v4, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    mul-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iput v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->d0:F

    iget v4, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->a0:F

    cmpl-float v5, v4, v2

    if-ltz v5, :cond_0

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    div-float/2addr v2, v0

    invoke-direct {p0, v2}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v0

    iput v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->e0:F

    return-void

    :cond_0
    sub-float/2addr v2, v4

    div-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iput v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->f0:F

    iget v4, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    div-float/2addr v2, v4

    invoke-direct {p0, v2}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v2

    iput v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i0:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->g0:F

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->f0:F

    sub-float/2addr v3, v0

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    div-float/2addr v3, v0

    invoke-direct {p0, v3}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v0

    iput v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h0:F

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->l()V

    return-void
.end method

.method private final l()V
    .locals 5

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->g0:F

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i(F)F

    move-result v0

    iget v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i0:F

    invoke-direct {p0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i(F)F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->a0:F

    iget v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    div-float/2addr v1, v2

    invoke-direct {p0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v1

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float v3, v1, v3

    add-float/2addr v3, v2

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->T:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    const/high16 v2, 0x42340000    # 45.0f

    cmpl-float v2, v3, v2

    const/16 v4, 0x5a

    if-lez v2, :cond_0

    const/high16 v2, 0x43870000    # 270.0f

    cmpg-float v2, v3, v2

    if-gez v2, :cond_0

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->T:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v0

    int-to-float v4, v4

    sub-float/2addr v4, v1

    sub-float/2addr v0, v4

    const/4 v4, 0x0

    int-to-float v4, v4

    sub-float/2addr v4, v1

    invoke-virtual {v2, v3, v0, v4}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->T:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h(F)F

    move-result v0

    int-to-float v4, v4

    sub-float/2addr v0, v4

    invoke-virtual {v2, v3, v0, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    return-void
.end method

.method private static final m(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;F)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->o(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setDrawGoalIcon(Z)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setFillWhite(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final o(F)V
    .locals 5

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->n0:Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p1

    mul-float/2addr v1, v2

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    iget v4, v3, Landroid/graphics/PointF;->x:F

    mul-float/2addr v4, p1

    add-float/2addr v4, v1

    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, v2

    iget v1, v3, Landroid/graphics/PointF;->y:F

    mul-float/2addr v1, p1

    add-float/2addr v1, v0

    sget v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->A0:F

    mul-float/2addr v0, v2

    iget v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->w0:F

    iget v3, p0, Lcom/whoop/ui/ProgressDial;->K:F

    invoke-static {v2, v3, p1, v0}, Lb9/y;->a(FFFF)F

    move-result p1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->s0:Landroid/graphics/RectF;

    sub-float v2, v4, p1

    iput v2, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v4, p1

    iput v4, v0, Landroid/graphics/RectF;->right:F

    sub-float v2, v1, p1

    iput v2, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, p1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final setFillWhite(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->r0:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->r0:Z

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getDialCenterPoint()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    return-object v0
.end method

.method public final getDialRadius()F
    .locals 1

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->w0:F

    return v0
.end method

.method public final getOptimalRange()Li93/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li93/f;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    const-string v1, "canvas"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Lcom/whoop/ui/ProgressDial;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    new-instance v2, Li93/e;

    const/4 v6, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, v6, v3}, Li93/e;-><init>(FF)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->a0:F

    iget v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->d0:F

    cmpl-float v1, v1, v2

    const/16 v2, 0x5a

    if-ltz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    iget v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->g0:F

    int-to-float v2, v2

    sub-float v2, v3, v2

    iget v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->e0:F

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->U:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->g0:F

    int-to-float v7, v2

    sub-float v2, v0, v7

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i0:F

    const/4 v3, 0x3

    int-to-float v3, v3

    sub-float v3, v0, v3

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->U:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->W:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->T:Landroid/graphics/Path;

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->b0:F

    const/high16 v3, 0x3f400000    # 0.75f

    mul-float v4, v0, v3

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->V:Landroid/graphics/Paint;

    const/4 v3, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->h0:F

    sub-float/2addr v0, v7

    const/4 v2, 0x5

    int-to-float v2, v2

    add-float/2addr v2, v0

    iget v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->i0:F

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->U:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_1
    :goto_0
    iget-boolean v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->l0:Z

    iget v2, p0, Lcom/whoop/ui/ProgressDial;->N:F

    cmpl-float v3, v2, v6

    const/4 v4, 0x0

    if-lez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    and-int/2addr v1, v3

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v2}, Li93/f;->c(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->u0:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->p0:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const v2, 0x3ecccccd    # 0.4f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->o0:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    float-to-int v3, v3

    sub-int/2addr v3, v1

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    float-to-int v5, v5

    sub-int/2addr v5, v1

    invoke-virtual {v2, v4, v4, v3, v5}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v3, v1

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v1

    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->o0:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->q0:Lde/hdodenhof/circleimageview/CircleImageView;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->m0:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->q0:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {v1, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_4
    :goto_2
    iget-boolean v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->r0:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->s0:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->t0:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_5
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lvu1/b;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    iput v0, v1, Landroid/graphics/RectF;->left:F

    iput v0, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j0:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->c0:F

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->k()V

    invoke-super/range {p0 .. p5}, Lcom/whoop/ui/ProgressDial;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object p2, p1, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result p2

    div-float/2addr p2, v1

    iput p2, p1, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->w0:F

    iget-object p2, p1, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    iget p3, p2, Landroid/graphics/RectF;->right:F

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result p2

    div-float/2addr p2, v1

    sub-float/2addr p3, p2

    iget-object p2, p1, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    iget p4, p2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p2

    div-float/2addr p2, v1

    sub-float/2addr p4, p2

    iget-object p2, p1, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    iput p3, p2, Landroid/graphics/PointF;->x:F

    iput p4, p2, Landroid/graphics/PointF;->y:F

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j()V

    iget-object p2, p1, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->q0:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget p4, Lvu1/c;->n:I

    invoke-static {p3, p4}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p2, p3}, Lde/hdodenhof/circleimageview/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p2

    invoke-virtual {p2}, Le50/b;->g()Lod1/u;

    move-result-object p2

    invoke-virtual {p2}, Lod1/u;->f()Lcom/whoop/domain/model/User;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    move-result-object p3

    invoke-virtual {p2}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p3, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p2, 0x1

    iput-boolean p2, p3, Lcom/bumptech/glide/f;->a0:Z

    new-instance p2, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$b;

    invoke-direct {p2, p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial$b;-><init>(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;)V

    invoke-virtual {p3, p2}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->K:F

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v2, v0, v1

    add-float/2addr v2, p1

    add-float/2addr v2, v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    iget p2, p0, Lcom/whoop/ui/ProgressDial;->K:F

    mul-float/2addr v1, p2

    add-float/2addr v1, p1

    add-float/2addr v1, p2

    float-to-int p1, v2

    float-to-int p2, v1

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setDialCenterPoint(Landroid/graphics/PointF;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->v0:Landroid/graphics/PointF;

    return-void
.end method

.method public final setDialRadius(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->w0:F

    return-void
.end method

.method public final setDrawGoalIcon(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->l0:Z

    if-eq p1, v0, :cond_1

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->l0:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressDial;->setDrawGoalLine(Z)V

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->c()V

    :cond_1
    return-void
.end method

.method public setGoalPct(F)V
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/ui/ProgressDial;->setGoalPct(F)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->j()V

    return-void
.end method

.method public final setGoalReached(Z)V
    .locals 6

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-boolean v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->u0:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->u0:Z

    const-string v3, "STRAINCOACH"

    const-string v4, "strainDial animating goal complete"

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->q0:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lk52/c;->c:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Lde/hdodenhof/circleimageview/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v3, Lnf1/e;->d:I

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lnf1/e;->c:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lnf1/e;->e:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p0, v5}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setDrawGoalIcon(Z)V

    invoke-direct {p0, v2}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setFillWhite(Z)V

    new-instance v2, Ll83/k;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p1, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p1, v3, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lpf/b;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v1}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lq80/h;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0, v1}, Lq52/a;->b(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method

.method public final setOptimalLabelTextSize(F)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->V:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->V:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->W:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->a0:F

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->b0:F

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->k()V

    return-void
.end method

.method public final setOptimalRange(Li93/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li93/f;",
            ")V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->S:Li93/f;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->k()V

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->c()V

    return-void
.end method
