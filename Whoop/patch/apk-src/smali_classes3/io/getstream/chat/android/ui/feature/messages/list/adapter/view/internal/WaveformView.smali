.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010&R.\u00107\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R.\u0010=\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u00108\u001a\u0004\u0008>\u0010:\"\u0004\u0008?\u0010<R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010BR$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020,0Dj\u0008\u0012\u0004\u0012\u00020,`E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR*\u0010I\u001a\u00020,2\u0006\u0010H\u001a\u00020,8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010QR$\u0010S\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008S\u0010T\"\u0004\u0008U\u0010VR0\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020,0W2\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020,0W8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008X\u0010Y\"\u0004\u0008Z\u0010[\u00a8\u0006]"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;",
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
        "color",
        "Ll83/a0;",
        "setWaveformColor",
        "(I)V",
        "clearData",
        "()V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "isRtl",
        "Z",
        "Landroid/widget/ImageView;",
        "slider",
        "Landroid/widget/ImageView;",
        "barLimit",
        "I",
        "",
        "barWidth",
        "Ljava/lang/Float;",
        "spaceWidth",
        "maxHeight",
        "Ljava/lang/Integer;",
        "",
        "barSpacing",
        "D",
        "isDragging",
        "Lkotlin/Function1;",
        "onSliderDragStart",
        "Lkotlin/jvm/functions/Function1;",
        "getOnSliderDragStart",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnSliderDragStart",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onSliderDragStop",
        "getOnSliderDragStop",
        "setOnSliderDragStop",
        "Landroid/graphics/Paint;",
        "paintPassed",
        "Landroid/graphics/Paint;",
        "paintUpcoming",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "_waveform",
        "Ljava/util/ArrayList;",
        "value",
        "progress",
        "F",
        "getProgress",
        "()F",
        "setProgress",
        "(F)V",
        "Landroid/graphics/RectF;",
        "viewportRect",
        "Landroid/graphics/RectF;",
        "barRect",
        "isSliderVisible",
        "()Z",
        "setSliderVisible",
        "(Z)V",
        "",
        "getWaveform",
        "()Ljava/util/List;",
        "setWaveform",
        "(Ljava/util/List;)V",
        "waveform",
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
.field private final _waveform:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private barLimit:I

.field private final barRect:Landroid/graphics/RectF;

.field private final barSpacing:D

.field private barWidth:Ljava/lang/Float;

.field private isDragging:Z

.field private final isRtl:Z

.field private final logger$delegate:Ll83/h;

.field private maxHeight:Ljava/lang/Integer;

.field private onSliderDragStart:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onSliderDragStop:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final paintPassed:Landroid/graphics/Paint;

.field private final paintUpcoming:Landroid/graphics/Paint;

.field private progress:F

.field private final slider:Landroid/widget/ImageView;

.field private spaceWidth:Ljava/lang/Float;

.field private final viewportRect:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    const-string p1, "WaveformView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->logger$delegate:Ll83/h;

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    const/4 p1, 0x0

    .line 58
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 59
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 60
    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    const/16 v1, 0x8

    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    .line 63
    new-instance v1, Ls/o1;

    const/4 v2, -0x2

    const/4 v3, -0x1

    .line 64
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 65
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/16 p1, 0x64

    .line 67
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barLimit:I

    const-wide v0, 0x3fd999999999999aL    # 0.4

    .line 68
    iput-wide v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barSpacing:D

    .line 69
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStart:Lkotlin/jvm/functions/Function1;

    .line 70
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStop:Lkotlin/jvm/functions/Function1;

    .line 71
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 74
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintPassed:Landroid/graphics/Paint;

    .line 75
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 78
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintUpcoming:Landroid/graphics/Paint;

    .line 79
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    .line 80
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    .line 81
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    const-string p1, "WaveformView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->logger$delegate:Ll83/h;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 5
    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 6
    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    const/16 v0, 0x8

    .line 7
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    .line 9
    new-instance v0, Ls/o1;

    const/4 v1, -0x2

    const/4 v2, -0x1

    .line 10
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 11
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/16 p1, 0x64

    .line 13
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barLimit:I

    const-wide p1, 0x3fd999999999999aL    # 0.4

    .line 14
    iput-wide p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barSpacing:D

    .line 15
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStart:Lkotlin/jvm/functions/Function1;

    .line 16
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStop:Lkotlin/jvm/functions/Function1;

    .line 17
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {p2, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintPassed:Landroid/graphics/Paint;

    .line 21
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintUpcoming:Landroid/graphics/Paint;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    .line 26
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    .line 27
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    const-string p1, "WaveformView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->logger$delegate:Ll83/h;

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 32
    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 33
    sget p3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundResource(I)V

    const/16 p3, 0x8

    .line 34
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 35
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    .line 36
    new-instance p3, Ls/o1;

    const/4 v0, -0x2

    const/4 v1, -0x1

    .line 37
    invoke-direct {p3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 38
    invoke-virtual {p0, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/16 p1, 0x64

    .line 40
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barLimit:I

    const-wide p1, 0x3fd999999999999aL    # 0.4

    .line 41
    iput-wide p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barSpacing:D

    .line 42
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStart:Lkotlin/jvm/functions/Function1;

    .line 43
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStop:Lkotlin/jvm/functions/Function1;

    .line 44
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {p2, p3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 47
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintPassed:Landroid/graphics/Paint;

    .line 48
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {p3, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintUpcoming:Landroid/graphics/Paint;

    .line 52
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    .line 53
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    .line 54
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private static final onSliderDragStart$lambda$1(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onSliderDragStop$lambda$2(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final clearData()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getOnSliderDragStart()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStart:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnSliderDragStop()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStop:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getProgress()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->progress:F

    return v0
.end method

.method public final getWaveform()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final isSliderVisible()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barLimit:I

    int-to-float v3, v3

    div-float v3, v2, v3

    const v4, 0x3e99999a    # 0.3f

    mul-float/2addr v4, v3

    sub-float v4, v3, v4

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v8

    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v9

    sub-int/2addr v8, v9

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    iget-object v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    iget v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barLimit:I

    sub-int/2addr v10, v11

    const/4 v11, 0x0

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    const/4 v13, 0x1

    if-eqz v12, :cond_0

    int-to-float v12, v13

    iget v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->progress:F

    sub-float/2addr v12, v14

    mul-float/2addr v12, v2

    goto :goto_0

    :cond_0
    iget v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->progress:F

    mul-float/2addr v12, v2

    :goto_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    if-gt v10, v2, :cond_8

    :goto_1
    iget-object v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "get(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    mul-float/2addr v14, v5

    invoke-static {v14, v4}, Ljava/lang/Math;->max(FF)F

    move-result v14

    sub-int v15, v2, v10

    move/from16 v16, v7

    const/4 v7, 0x2

    int-to-float v7, v7

    div-float/2addr v14, v7

    sub-float v7, v6, v14

    add-float/2addr v14, v6

    iget-boolean v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    if-eqz v11, :cond_1

    int-to-float v13, v8

    add-int/lit8 v15, v15, 0x1

    int-to-float v15, v15

    mul-float/2addr v15, v3

    sub-float/2addr v13, v15

    goto :goto_2

    :cond_1
    int-to-float v13, v9

    int-to-float v15, v15

    mul-float/2addr v15, v3

    add-float/2addr v13, v15

    :goto_2
    add-float v11, v13, v4

    div-float v15, v4, v16

    move/from16 v17, v3

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    invoke-virtual {v3, v13, v7, v11, v14}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    iget v7, v3, Landroid/graphics/RectF;->left:F

    int-to-float v11, v9

    cmpg-float v7, v7, v11

    if-gez v7, :cond_2

    iput v11, v3, Landroid/graphics/RectF;->left:F

    goto :goto_3

    :cond_2
    iget v7, v3, Landroid/graphics/RectF;->right:F

    int-to-float v11, v8

    cmpl-float v7, v7, v11

    if-lez v7, :cond_3

    iput v11, v3, Landroid/graphics/RectF;->right:F

    :cond_3
    :goto_3
    iget-boolean v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isSliderVisible()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    cmpl-float v3, v3, v12

    if-lez v3, :cond_4

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isSliderVisible()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    cmpg-float v3, v3, v12

    if-gez v3, :cond_4

    goto :goto_4

    :goto_5
    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barRect:Landroid/graphics/RectF;

    if-eqz v3, :cond_7

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintPassed:Landroid/graphics/Paint;

    goto :goto_6

    :cond_7
    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintUpcoming:Landroid/graphics/Paint;

    :goto_6
    invoke-virtual {v1, v7, v15, v15, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-eq v2, v10, :cond_9

    add-int/lit8 v2, v2, -0x1

    move/from16 v7, v16

    move/from16 v3, v17

    const/4 v11, 0x0

    const/4 v13, 0x1

    goto/16 :goto_1

    :cond_8
    move/from16 v16, v7

    :cond_9
    iget-boolean v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    if-eqz v1, :cond_a

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    :goto_7
    int-to-float v1, v1

    div-float v1, v1, v16

    sub-float/2addr v12, v1

    goto :goto_8

    :cond_a
    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    goto :goto_7

    :goto_8
    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v1, v3

    invoke-static {v12, v2, v1}, Le93/b;->m(FFF)F

    move-result v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/view/View;->setX(F)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p2

    sub-int/2addr p1, p2

    int-to-double p1, p1

    const/4 v0, 0x1

    int-to-double v0, v0

    iget-wide v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barSpacing:D

    sub-double/2addr v0, v2

    mul-double/2addr v0, p1

    mul-double/2addr p1, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    double-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->barWidth:Ljava/lang/Float;

    double-to-float p1, p1

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->spaceWidth:Ljava/lang/Float;

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

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->maxHeight:Ljava/lang/Integer;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p2

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v0

    sub-int/2addr p2, v0

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    sub-int/2addr p2, v0

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isRtl:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/16 v2, 0xa

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    const/4 v4, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_2

    const/4 v5, 0x2

    if-eq v1, v5, :cond_1

    const/4 v5, 0x3

    if-eq v1, v5, :cond_2

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    div-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setProgress(F)V

    return v4

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    div-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setProgress(F)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStop:Lkotlin/jvm/functions/Function1;

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->progress:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isDragging:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return v4

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iput-boolean v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->isDragging:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_5

    iget v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v2

    add-int/2addr v2, v3

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->viewportRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    div-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setProgress(F)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStart:Lkotlin/jvm/functions/Function1;

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->progress:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v4

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOnSliderDragStart(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStart:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnSliderDragStop(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->onSliderDragStop:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setProgress(F)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[setProgress] progress: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->progress:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setSliderVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->slider:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setWaveform(Ljava/util/List;)V
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->_waveform:Ljava/util/ArrayList;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setWaveformColor(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->paintPassed:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method
