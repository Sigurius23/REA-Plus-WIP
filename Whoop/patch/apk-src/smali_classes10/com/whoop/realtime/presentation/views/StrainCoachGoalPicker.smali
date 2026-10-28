.class public final Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;
.super Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008#\u0010\u001eJ1\u0010)\u001a\u00020\u00122\u0008\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008)\u0010*J1\u0010-\u001a\u00020\u00122\u0008\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008-\u0010*J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008.\u0010!J\u001d\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&\u00a2\u0006\u0004\u00081\u00102J\u0013\u00104\u001a\u0008\u0012\u0004\u0012\u00020&03\u00a2\u0006\u0004\u00084\u00105J\u0013\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001206\u00a2\u0006\u0004\u00087\u00108J\r\u00109\u001a\u00020\u0012\u00a2\u0006\u0004\u00089\u0010:J\u0015\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020&\u00a2\u0006\u0004\u0008<\u0010=J\r\u0010>\u001a\u00020\u000b\u00a2\u0006\u0004\u0008>\u0010\rR*\u0010E\u001a\u00020&2\u0006\u0010?\u001a\u00020&8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010=R\u0016\u0010H\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010GR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u001a\u0010U\u001a\u0008\u0012\u0004\u0012\u00020&038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u001a\u0010X\u001a\u0008\u0012\u0004\u0012\u00020\u0012068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0016\u0010Z\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010AR\u0016\u0010\\\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010AR\u0016\u0010^\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010AR\u0016\u0010`\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010AR\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0016\u0010f\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010AR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010l\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010iR\u0014\u0010n\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010iR\u0014\u0010p\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010iR\u0016\u0010r\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010AR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010x\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010uR\u0014\u0010z\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010uR\u0014\u0010}\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0084\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001\u00a8\u0006\u008e\u0001"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;",
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;",
        "Landroid/view/GestureDetector$OnGestureListener;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "u",
        "()V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "x",
        "(Landroid/graphics/Canvas;)V",
        "",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "onDraw",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "e",
        "onShowPress",
        "(Landroid/view/MotionEvent;)V",
        "onSingleTapUp",
        "onDown",
        "e1",
        "e2",
        "",
        "velocityX",
        "velocityY",
        "onFling",
        "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z",
        "distanceX",
        "distanceY",
        "onScroll",
        "onLongPress",
        "start",
        "end",
        "E",
        "(FF)V",
        "Lze1/d;",
        "A",
        "()Lze1/d;",
        "Llh3/e;",
        "z",
        "()Llh3/e;",
        "y",
        "()Z",
        "target",
        "v",
        "(F)V",
        "B",
        "value",
        "B0",
        "F",
        "getStrainGoal",
        "()F",
        "setStrainGoal",
        "strainGoal",
        "C0",
        "Z",
        "animating",
        "D0",
        "scrolling",
        "",
        "E0",
        "Ljava/lang/Double;",
        "lastTouchPct",
        "Landroid/view/GestureDetector;",
        "F0",
        "Landroid/view/GestureDetector;",
        "gestureDetector",
        "G0",
        "Lze1/d;",
        "goalSubject",
        "H0",
        "Llh3/e;",
        "scrollSubject",
        "I0",
        "controlDiameter",
        "J0",
        "controlIconDiameter",
        "K0",
        "controlBorderDiameter",
        "L0",
        "controlShadowDiameter",
        "Landroid/graphics/PointF;",
        "M0",
        "Landroid/graphics/PointF;",
        "controlCenterPoint",
        "N0",
        "currentGoalAngle",
        "Landroid/graphics/RectF;",
        "O0",
        "Landroid/graphics/RectF;",
        "controlRect",
        "P0",
        "controlIconRect",
        "Q0",
        "controlBorderRect",
        "R0",
        "controlShadowRect",
        "S0",
        "controlPulseScale",
        "Landroid/graphics/Paint;",
        "T0",
        "Landroid/graphics/Paint;",
        "controlPaint",
        "U0",
        "controlBorderPaint",
        "V0",
        "controlShadowPaint",
        "W0",
        "I",
        "controlShadowBaseColor",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "X0",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "controlAvatar",
        "Landroid/widget/ImageView;",
        "Y0",
        "Landroid/widget/ImageView;",
        "controlIcon",
        "Z0",
        "controlZero",
        "a1",
        "controlShadow",
        "Landroid/animation/ValueAnimator;",
        "b1",
        "Landroid/animation/ValueAnimator;",
        "animator",
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


# instance fields
.field private B0:F

.field private C0:Z

.field private D0:Z

.field private E0:Ljava/lang/Double;

.field private final F0:Landroid/view/GestureDetector;

.field private final G0:Lze1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lze1/d<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final H0:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private I0:F

.field private J0:F

.field private K0:F

.field private L0:F

.field private M0:Landroid/graphics/PointF;

.field private N0:F

.field private final O0:Landroid/graphics/RectF;

.field private final P0:Landroid/graphics/RectF;

.field private final Q0:Landroid/graphics/RectF;

.field private final R0:Landroid/graphics/RectF;

.field private S0:F

.field private final T0:Landroid/graphics/Paint;

.field private final U0:Landroid/graphics/Paint;

.field private final V0:Landroid/graphics/Paint;

.field private final W0:I

.field private X0:Lde/hdodenhof/circleimageview/CircleImageView;

.field private Y0:Landroid/widget/ImageView;

.field private Z0:Landroid/widget/ImageView;

.field private a1:Landroid/widget/ImageView;

.field private b1:Landroid/animation/ValueAnimator;


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p2, Landroid/view/GestureDetector;

    invoke-direct {p2, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->F0:Landroid/view/GestureDetector;

    .line 4
    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object p2

    const-string p3, "createSingle(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->G0:Lze1/d;

    .line 5
    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->H0:Llh3/e;

    .line 6
    iget p2, p0, Lcom/whoop/ui/ProgressDial;->K:F

    const p3, 0x40266666    # 2.6f

    mul-float/2addr p3, p2

    iput p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->I0:F

    const/high16 p3, 0x3fc00000    # 1.5f

    mul-float/2addr p3, p2

    .line 7
    iput p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->J0:F

    const p3, 0x404ccccd    # 3.2f

    mul-float/2addr p3, p2

    .line 8
    iput p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->K0:F

    const/high16 p3, 0x40900000    # 4.5f

    mul-float/2addr p2, p3

    .line 9
    iput p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->L0:F

    .line 10
    new-instance p2, Landroid/graphics/PointF;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->M0:Landroid/graphics/PointF;

    .line 11
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->O0:Landroid/graphics/RectF;

    .line 12
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->P0:Landroid/graphics/RectF;

    .line 13
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Q0:Landroid/graphics/RectF;

    .line 14
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->R0:Landroid/graphics/RectF;

    const/high16 p2, 0x3f800000    # 1.0f

    .line 15
    iput p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->S0:F

    .line 16
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    const/4 p3, -0x1

    .line 17
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->T0:Landroid/graphics/Paint;

    .line 20
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lk52/b;->j:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 23
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->U0:Landroid/graphics/Paint;

    .line 24
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 25
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->V0:Landroid/graphics/Paint;

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lk52/b;->k:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    iput p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->W0:I

    .line 28
    new-instance p2, Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-direct {p2, p1}, Lde/hdodenhof/circleimageview/CircleImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->X0:Lde/hdodenhof/circleimageview/CircleImageView;

    .line 29
    new-instance p2, Landroid/widget/ImageView;

    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Y0:Landroid/widget/ImageView;

    .line 30
    new-instance p2, Landroid/widget/ImageView;

    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Z0:Landroid/widget/ImageView;

    .line 31
    new-instance p2, Landroid/widget/ImageView;

    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    .line 32
    iget-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Y0:Landroid/widget/ImageView;

    sget p3, Lvu1/c;->o:I

    invoke-static {p1, p3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    iget-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Z0:Landroid/widget/ImageView;

    sget p3, Lk52/c;->i:I

    invoke-static {p1, p3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 34
    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setDrawGoalIcon(Z)V

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

    .line 35
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final C(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;F)Ll83/a0;
    .locals 0

    iput p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->S0:F

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->u()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic p(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->C(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->w(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic r()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->D()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic s(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)Lde/hdodenhof/circleimageview/CircleImageView;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->X0:Lde/hdodenhof/circleimageview/CircleImageView;

    return-object p0
.end method

.method public static final synthetic t(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->C0:Z

    return-void
.end method

.method private final u()V
    .locals 14

    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->N0:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getDialCenterPoint()Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getDialRadius()F

    move-result v2

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    double-to-float v0, v5

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getDialCenterPoint()Landroid/graphics/PointF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getDialRadius()F

    move-result v1

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    neg-float v3, v3

    mul-float/2addr v1, v3

    add-float/2addr v1, v0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->O0:Landroid/graphics/RectF;

    iget v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->I0:F

    iget v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->S0:F

    mul-float v5, v3, v4

    const/4 v6, 0x2

    int-to-float v6, v6

    div-float/2addr v5, v6

    sub-float v5, v2, v5

    iput v5, v0, Landroid/graphics/RectF;->left:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v1, v5

    iput v5, v0, Landroid/graphics/RectF;->top:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    add-float/2addr v5, v2

    iput v5, v0, Landroid/graphics/RectF;->right:F

    mul-float/2addr v3, v4

    div-float/2addr v3, v6

    add-float/2addr v3, v1

    iput v3, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->P0:Landroid/graphics/RectF;

    iget v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->J0:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v2, v5

    iput v5, v0, Landroid/graphics/RectF;->left:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v1, v5

    iput v5, v0, Landroid/graphics/RectF;->top:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    add-float/2addr v5, v2

    iput v5, v0, Landroid/graphics/RectF;->right:F

    mul-float/2addr v3, v4

    div-float/2addr v3, v6

    add-float/2addr v3, v1

    iput v3, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Q0:Landroid/graphics/RectF;

    iget v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->K0:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v2, v5

    iput v5, v0, Landroid/graphics/RectF;->left:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v1, v5

    iput v5, v0, Landroid/graphics/RectF;->top:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    add-float/2addr v5, v2

    iput v5, v0, Landroid/graphics/RectF;->right:F

    mul-float/2addr v3, v4

    div-float/2addr v3, v6

    add-float/2addr v3, v1

    iput v3, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->R0:Landroid/graphics/RectF;

    iget v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->L0:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v2, v5

    iput v5, v0, Landroid/graphics/RectF;->left:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    sub-float v5, v1, v5

    iput v5, v0, Landroid/graphics/RectF;->top:F

    mul-float v5, v3, v4

    div-float/2addr v5, v6

    add-float/2addr v5, v2

    iput v5, v0, Landroid/graphics/RectF;->right:F

    mul-float/2addr v3, v4

    div-float/2addr v3, v6

    add-float/2addr v3, v1

    iput v3, v0, Landroid/graphics/RectF;->bottom:F

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->M0:Landroid/graphics/PointF;

    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->L0:F

    iget v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->S0:F

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->V0:Landroid/graphics/Paint;

    new-instance v7, Landroid/graphics/RadialGradient;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->R0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float v8, v2, v6

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->R0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float v9, v2, v6

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->R0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float v10, v2, v6

    iget v11, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->W0:I

    const/4 v12, 0x0

    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v7 .. v13}, Landroid/graphics/RadialGradient;-><init>(FFFIILandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x106000d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    float-to-int v2, v0

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v2, v2}, Landroid/view/View;->layout(IIII)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-string v2, "createBitmap(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    div-float/2addr v0, v6

    iget-object v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->V0:Landroid/graphics/Paint;

    invoke-virtual {v2, v0, v0, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->K0:F

    iget v5, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->S0:F

    mul-float/2addr v4, v5

    div-float/2addr v4, v6

    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v2, v0, v0, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private static final w(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->setStrainGoal(F)V

    return-void
.end method

.method private final x(Landroid/graphics/Canvas;)V
    .locals 8

    if-eqz p1, :cond_4

    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    float-to-double v0, v0

    const-wide/high16 v2, 0x4035000000000000L    # 21.0

    mul-double/2addr v0, v2

    const-wide v4, 0x3fb99999a0000000L    # 0.10000000149011612

    cmpg-double v0, v0, v4

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Z0:Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getOptimalRange()Li93/f;

    move-result-object v0

    iget v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Li93/f;->c(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Y0:Landroid/widget/ImageView;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->X0:Lde/hdodenhof/circleimageview/CircleImageView;

    :goto_0
    iget v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    float-to-double v6, v1

    mul-double/2addr v6, v2

    cmpg-double v1, v6, v4

    if-gez v1, :cond_2

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->P0:Landroid/graphics/RectF;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getOptimalRange()Li93/f;

    move-result-object v1

    iget v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v2}, Li93/f;->c(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->P0:Landroid/graphics/RectF;

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->O0:Landroid/graphics/RectF;

    :goto_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->R0:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->a1:Landroid/widget/ImageView;

    invoke-virtual {v2, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Q0:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->U0:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->O0:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->T0:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4, v2, v3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_4
    return-void
.end method


# virtual methods
.method public final A()Lze1/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lze1/d<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->G0:Lze1/d;

    return-object v0
.end method

.method public final B()V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lnf1/e;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    new-instance v1, Ll83/k;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const v6, 0x3fa66666    # 1.3f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v0, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3, v4, v5, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lpf/b;

    const/16 v2, 0x16

    invoke-direct {v1, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lqv1/e;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lqv1/e;-><init>(I)V

    invoke-static {v0, v1, v2}, Lq52/a;->b(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final E(FF)V
    .locals 1

    new-instance v0, Li93/e;

    invoke-direct {v0, p1, p2}, Li93/e;-><init>(FF)V

    invoke-virtual {p0, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setOptimalRange(Li93/f;)V

    return-void
.end method

.method public final getStrainGoal()F
    .locals 1

    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    return v0
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->Q0:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->D0:Z

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->H0:Llh3/e;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->onDraw(Landroid/graphics/Canvas;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->x(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const-string p1, "e2"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->onLayout(ZIIII)V

    move-object p1, p0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->u()V

    iget-object p2, p1, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->X0:Lde/hdodenhof/circleimageview/CircleImageView;

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

    new-instance p2, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$b;

    invoke-direct {p2, p0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$b;-><init>(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)V

    invoke-virtual {p3, p2}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    :cond_0
    return-void
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 9

    const-string p1, "e2"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->D0:Z

    const/4 p3, 0x1

    if-nez p1, :cond_0

    iput-boolean p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->D0:Z

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->H0:Llh3/e;

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p4}, Llh3/e;->onNext(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getDialCenterPoint()Landroid/graphics/PointF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/PointF;->x:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p4

    sub-float/2addr p1, p4

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->getDialCenterPoint()Landroid/graphics/PointF;

    move-result-object p4

    iget p4, p4, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    sub-float/2addr p4, p2

    float-to-double v0, p4

    float-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    double-to-float p1, p1

    float-to-double p1, p1

    const-wide/16 v0, 0x0

    cmpg-double p4, p1, v0

    if-gez p4, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    sub-double p1, v2, p1

    add-double/2addr p1, v2

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const/high16 p4, 0x42b40000    # 90.0f

    float-to-double v2, p4

    sub-double/2addr p1, v2

    const-wide v2, 0x4076800000000000L    # 360.0

    cmpl-double p4, p1, v2

    const/high16 v2, 0x43b40000    # 360.0f

    if-lez p4, :cond_2

    float-to-double v3, v2

    sub-double/2addr p1, v3

    :cond_2
    cmpg-double p4, p1, v0

    if-gez p4, :cond_3

    float-to-double v2, v2

    add-double/2addr p1, v2

    :cond_3
    const/16 p4, 0x168

    int-to-double v2, p4

    div-double/2addr p1, v2

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    iget-object p4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->E0:Ljava/lang/Double;

    if-eqz p4, :cond_a

    invoke-virtual {p4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpg-double p4, v2, v4

    const/4 v6, 0x0

    if-gez p4, :cond_4

    move p4, p3

    goto :goto_0

    :cond_4
    move p4, v6

    :goto_0
    sub-double v7, p1, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    cmpl-double v7, v7, v4

    if-lez v7, :cond_5

    move v7, p3

    goto :goto_1

    :cond_5
    move v7, v6

    :goto_1
    and-int/2addr p4, v7

    if-eqz p4, :cond_6

    goto :goto_2

    :cond_6
    move-wide v0, p1

    :goto_2
    cmpl-double p1, v2, v4

    if-ltz p1, :cond_7

    move p1, p3

    goto :goto_3

    :cond_7
    move p1, v6

    :goto_3
    sub-double v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double p2, v2, v4

    if-lez p2, :cond_8

    move v6, p3

    :cond_8
    and-int/2addr p1, v6

    if-eqz p1, :cond_9

    const-wide p1, 0x3feff7ced916872bL    # 0.999

    goto :goto_4

    :cond_9
    move-wide p1, v0

    :cond_a
    :goto_4
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p4

    iput-object p4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->E0:Ljava/lang/Double;

    double-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->setStrainGoal(F)V

    return p3
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->D0:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    iput-boolean v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->D0:Z

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->H0:Llh3/e;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->N:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->E0:Ljava/lang/Double;

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->F0:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v3

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final setStrainGoal(F)V
    .locals 2

    iput p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->G0:Lze1/d;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->setGoalPct(F)V

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressDial;->setProgress(F)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->u()V

    return-void
.end method

.method public final v(F)V
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->E0:Ljava/lang/Double;

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->b1:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_1
    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B0:F

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput v0, v1, v2

    const/4 v0, 0x1

    aput p1, v1, v0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-instance v0, Ldb/e;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$a;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$a;-><init>(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lnf1/e;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->b1:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->C0:Z

    return v0
.end method

.method public final z()Llh3/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llh3/e;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->H0:Llh3/e;

    return-object v0
.end method
