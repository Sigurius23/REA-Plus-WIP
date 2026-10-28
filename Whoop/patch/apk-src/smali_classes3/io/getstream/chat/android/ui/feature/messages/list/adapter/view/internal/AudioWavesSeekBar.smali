.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00102\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008%\u0010\u0012J\u001d\u0010+\u001a\u00020\u00102\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00100\'H\u0000\u00a2\u0006\u0004\u0008)\u0010*J#\u0010/\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100,H\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u001f\u00102\u001a\u00020\u00102\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u00082\u0010$J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u00086\u00107J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u000208H\u0014\u00a2\u0006\u0004\u0008:\u0010;R\u0014\u0010<\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010A\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010C\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010BR\u0014\u0010D\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u001c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00100\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\"\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0016\u0010S\u001a\u0002058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010=R\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010VR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010X8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010BR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010BR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010NR\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R0\u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u000e0X2\u000c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020\u000e0X8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008a\u0010b\"\u0004\u0008c\u0010d\u00a8\u0006f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;",
        "Landroidx/appcompat/widget/LinearLayoutCompat;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "seekWidth",
        "()I",
        "",
        "progress",
        "Ll83/a0;",
        "forceProgress",
        "(F)V",
        "positionX",
        "trackerPosition",
        "(F)F",
        "progressToX",
        "x",
        "xToProgress",
        "color",
        "setPlayedWaveBarColor",
        "(I)V",
        "setFutureWaveBarColor",
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "setScrubberDrawable",
        "(Landroid/graphics/drawable/Drawable;)V",
        "default",
        "pressed",
        "setScrubberWidth",
        "(II)V",
        "setProgress$stream_chat_android_ui_components_release",
        "setProgress",
        "Lkotlin/Function0;",
        "listener",
        "setOnStartDragListener$stream_chat_android_ui_components_release",
        "(Lc93/a;)V",
        "setOnStartDragListener",
        "Lkotlin/Function1;",
        "setOnEndDragListener$stream_chat_android_ui_components_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "setOnEndDragListener",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "isRtl",
        "Z",
        "Landroid/widget/ImageView;",
        "tracker",
        "Landroid/widget/ImageView;",
        "barPadding",
        "I",
        "realPaddingStart",
        "realPaddingEnd",
        "barWidth",
        "Ljava/lang/Float;",
        "spaceWidth",
        "maxHeight",
        "Ljava/lang/Integer;",
        "",
        "barSpacing",
        "D",
        "barHeightRatio",
        "F",
        "onStartDrag",
        "Lc93/a;",
        "onEndDrag",
        "Lkotlin/jvm/functions/Function1;",
        "isDragging",
        "Landroid/graphics/Paint;",
        "paintPlayed",
        "Landroid/graphics/Paint;",
        "paintFuture",
        "",
        "internalWaveBars",
        "Ljava/util/List;",
        "defaultScrubberWidth",
        "pressedScrubberWidth",
        "Landroid/graphics/RectF;",
        "rect",
        "Landroid/graphics/RectF;",
        "value",
        "getWaveBars$stream_chat_android_ui_components_release",
        "()Ljava/util/List;",
        "setWaveBars$stream_chat_android_ui_components_release",
        "(Ljava/util/List;)V",
        "waveBars",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic w:I


# instance fields
.field private barHeightRatio:F

.field private final barPadding:I

.field private final barSpacing:D

.field private barWidth:Ljava/lang/Float;

.field private defaultScrubberWidth:I

.field private internalWaveBars:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private isDragging:Z

.field private final isRtl:Z

.field private maxHeight:Ljava/lang/Integer;

.field private onEndDrag:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onStartDrag:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final paintFuture:Landroid/graphics/Paint;

.field private final paintPlayed:Landroid/graphics/Paint;

.field private pressedScrubberWidth:I

.field private progress:F

.field private final realPaddingEnd:I

.field private final realPaddingStart:I

.field private final rect:Landroid/graphics/RectF;

.field private spaceWidth:Ljava/lang/Float;

.field private final tracker:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    const/4 p1, 0x0

    .line 55
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 56
    new-instance p1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 57
    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 58
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    .line 59
    new-instance v0, Ls/o1;

    const/4 v1, -0x2

    const/4 v2, -0x1

    .line 60
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 61
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barPadding:I

    add-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barPadding:I

    add-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    const-wide v0, 0x3fd999999999999aL    # 0.4

    .line 64
    iput-wide v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barSpacing:D

    const p1, 0x3f666666    # 0.9f

    .line 65
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barHeightRatio:F

    .line 66
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onStartDrag:Lc93/a;

    .line 67
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onEndDrag:Lkotlin/jvm/functions/Function1;

    .line 68
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 71
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintPlayed:Landroid/graphics/Paint;

    .line 72
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 75
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintFuture:Landroid/graphics/Paint;

    const/4 p1, 0x7

    .line 76
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->defaultScrubberWidth:I

    const/16 p1, 0xa

    .line 77
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->pressedScrubberWidth:I

    .line 78
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->rect:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 4
    new-instance p1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 5
    sget p2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    .line 7
    new-instance p2, Ls/o1;

    const/4 v0, -0x2

    const/4 v1, -0x1

    .line 8
    invoke-direct {p2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 9
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barPadding:I

    add-int/2addr p1, p2

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barPadding:I

    add-int/2addr p1, p2

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    const-wide p1, 0x3fd999999999999aL    # 0.4

    .line 12
    iput-wide p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barSpacing:D

    const p1, 0x3f666666    # 0.9f

    .line 13
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barHeightRatio:F

    .line 14
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onStartDrag:Lc93/a;

    .line 15
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onEndDrag:Lkotlin/jvm/functions/Function1;

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {p2, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintPlayed:Landroid/graphics/Paint;

    .line 20
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 23
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintFuture:Landroid/graphics/Paint;

    const/4 p1, 0x7

    .line 24
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->defaultScrubberWidth:I

    const/16 p1, 0xa

    .line 25
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->pressedScrubberWidth:I

    .line 26
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->rect:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    const/4 p1, 0x0

    .line 29
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 30
    new-instance p1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 31
    sget p2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 32
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    .line 33
    new-instance p2, Ls/o1;

    const/4 p3, -0x2

    const/4 v0, -0x1

    .line 34
    invoke-direct {p2, p3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 35
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barPadding:I

    add-int/2addr p1, p2

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barPadding:I

    add-int/2addr p1, p2

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    const-wide p1, 0x3fd999999999999aL    # 0.4

    .line 38
    iput-wide p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barSpacing:D

    const p1, 0x3f666666    # 0.9f

    .line 39
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barHeightRatio:F

    .line 40
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onStartDrag:Lc93/a;

    .line 41
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onEndDrag:Lkotlin/jvm/functions/Function1;

    .line 42
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {p2, p3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintPlayed:Landroid/graphics/Paint;

    .line 46
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {p3, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintFuture:Landroid/graphics/Paint;

    const/4 p1, 0x7

    .line 50
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->defaultScrubberWidth:I

    const/16 p1, 0xa

    .line 51
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->pressedScrubberWidth:I

    .line 52
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->rect:Landroid/graphics/RectF;

    return-void
.end method

.method private final forceProgress(F)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progress:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private static final onEndDrag$lambda$2(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onStartDrag$lambda$1()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final progressToX(F)F
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->seekWidth()I

    move-result v0

    int-to-float v0, v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    const/16 v2, 0x64

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr p1, v2

    sub-float/2addr v1, p1

    mul-float/2addr v1, v0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    int-to-float p1, p1

    add-float/2addr v1, p1

    return v1

    :cond_0
    int-to-float v1, v2

    div-float/2addr p1, v1

    mul-float/2addr p1, v0

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1
.end method

.method private final seekWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    sub-int/2addr v0, v1

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    sub-int/2addr v0, v1

    return v0
.end method

.method private final trackerPosition(F)F
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    int-to-float v0, v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    :goto_0
    int-to-float v1, v1

    add-float/2addr v0, v1

    goto :goto_1

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    int-to-float v0, v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    goto :goto_0

    :goto_1
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    :goto_2
    sub-int/2addr v1, v2

    int-to-float v1, v1

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    goto :goto_2

    :goto_3
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Float;->min(FF)F

    move-result p1

    return p1
.end method

.method private final xToProgress(F)F
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    int-to-float v0, v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Float;->min(FF)F

    move-result p1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    const/16 v1, 0x64

    if-eqz v0, :cond_0

    int-to-float v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v1, p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->seekWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v1, p1

    mul-float/2addr v1, v0

    return v1

    :cond_0
    int-to-float v0, v1

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    int-to-float v1, v1

    sub-float/2addr p1, v1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->seekWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p1, v1

    mul-float/2addr p1, v0

    return p1
.end method


# virtual methods
.method public final getWaveBars$stream_chat_android_ui_components_release()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->internalWaveBars:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x28

    if-ge v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->getWaveBars$stream_chat_android_ui_components_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->getWaveBars$stream_chat_android_ui_components_release()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->maxHeight:Ljava/lang/Integer;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    const v6, 0x3d4ccccd    # 0.05f

    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    mul-float/2addr v3, v5

    iget v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barHeightRatio:F

    mul-float/2addr v3, v5

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    if-eqz v5, :cond_0

    add-int/lit8 v5, v0, -0x1

    sub-int v2, v5, v2

    :cond_0
    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->spaceWidth:Ljava/lang/Float;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    add-float/2addr v6, v5

    int-to-float v2, v2

    mul-float/2addr v6, v2

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    int-to-float v2, v2

    add-float/2addr v6, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v2, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v3

    const/4 v7, 0x2

    int-to-float v8, v7

    div-float/2addr v5, v8

    add-float/2addr v3, v5

    iget-object v9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->rect:Landroid/graphics/RectF;

    invoke-virtual {v9, v6, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isRtl:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progress:F

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progressToX(F)F

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    div-float/2addr v3, v8

    add-float/2addr v3, v6

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintPlayed:Landroid/graphics/Paint;

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintFuture:Landroid/graphics/Paint;

    goto :goto_1

    :cond_2
    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progress:F

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progressToX(F)F

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    div-float/2addr v3, v8

    add-float/2addr v3, v6

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintPlayed:Landroid/graphics/Paint;

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintFuture:Landroid/graphics/Paint;

    :goto_1
    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    iget v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progress:F

    invoke-direct {p0, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progressToX(F)F

    move-result v5

    invoke-direct {p0, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->trackerPosition(F)F

    move-result v5

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    div-int/2addr v6, v7

    int-to-float v6, v6

    sub-float/2addr v5, v6

    invoke-virtual {v3, v5}, Landroid/view/View;->setX(F)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->rect:Landroid/graphics/RectF;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    div-float/2addr v5, v8

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    div-float/2addr v6, v8

    invoke-virtual {p1, v3, v5, v6, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    move v2, v4

    goto/16 :goto_0

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p1, 0x0

    throw p1

    :cond_5
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingStart:I

    sub-int/2addr p1, p2

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->realPaddingEnd:I

    sub-int/2addr p1, p2

    int-to-double p1, p1

    const/4 v0, 0x1

    int-to-double v0, v0

    iget-wide v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barSpacing:D

    sub-double/2addr v0, v2

    mul-double/2addr v0, p1

    mul-double/2addr p1, v2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->getWaveBars$stream_chat_android_ui_components_release()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    double-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->barWidth:Ljava/lang/Float;

    double-to-float p1, p1

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->spaceWidth:Ljava/lang/Float;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->maxHeight:Ljava/lang/Integer;

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    const/4 v2, 0x1

    if-eqz v0, :cond_5

    const/4 v3, 0x0

    if-eq v0, v2, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 v4, 0x3

    if-eq v0, v4, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    iput-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isDragging:Z

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->defaultScrubberWidth:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return v2

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->xToProgress(F)F

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->forceProgress(F)V

    return v2

    :cond_3
    iput-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isDragging:Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onEndDrag:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->xToProgress(F)F

    move-result p1

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_4

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->defaultScrubberWidth:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return v2

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    iput-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isDragging:Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onStartDrag:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_6

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->pressedScrubberWidth:I

    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->xToProgress(F)F

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->forceProgress(F)V

    return v2

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setFutureWaveBarColor(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintFuture:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final setOnEndDragListener$stream_chat_android_ui_components_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onEndDrag:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnStartDragListener$stream_chat_android_ui_components_release(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->onStartDrag:Lc93/a;

    return-void
.end method

.method public final setPlayedWaveBarColor(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->paintPlayed:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final setProgress$stream_chat_android_ui_components_release(F)V
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->isDragging:Z

    if-nez v0, :cond_0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->progress:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setScrubberDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->tracker:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setScrubberWidth(II)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->defaultScrubberWidth:I

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->pressedScrubberWidth:I

    return-void
.end method

.method public final setWaveBars$stream_chat_android_ui_components_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->internalWaveBars:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
