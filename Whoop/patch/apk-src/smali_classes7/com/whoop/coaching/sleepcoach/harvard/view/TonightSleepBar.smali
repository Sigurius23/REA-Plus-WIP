.class public final Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008/\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J5\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010*\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010+\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010)R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010.R\u0014\u00103\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010.R\u0018\u00106\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0016\u00108\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u0010)R\u0018\u0010;\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008)\u0010)R\u001b\u0010A\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010>\u001a\u0004\u0008D\u0010ER\u0014\u0010H\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008G\u0010)R\u0016\u0010K\u001a\u00020 8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u001b\u0010R\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008P\u0010>\u001a\u0004\u0008Q\u0010@R\u001b\u0010U\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008S\u0010>\u001a\u0004\u0008T\u0010@R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u001b\u0010\\\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Z\u0010>\u001a\u0004\u0008[\u0010@R\u001b\u0010_\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008]\u0010>\u001a\u0004\u0008^\u0010ER\u001b\u0010b\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008`\u0010>\u001a\u0004\u0008a\u0010@R\u001b\u0010e\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008c\u0010>\u001a\u0004\u0008d\u0010@R\u0014\u0010g\u001a\u00020V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010XR\u001b\u0010j\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008h\u0010>\u001a\u0004\u0008i\u0010@R\u001b\u0010m\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008k\u0010>\u001a\u0004\u0008l\u0010ER\u001b\u0010p\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008n\u0010>\u001a\u0004\u0008o\u0010@R\u001b\u0010s\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008q\u0010>\u001a\u0004\u0008r\u0010@R\u0014\u0010u\u001a\u00020V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010XR\u0016\u0010x\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0016\u0010}\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008|\u0010zR\u0016\u0010\u007f\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010)R\u0018\u0010\u0081\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010XR\u0018\u0010\u0083\u0001\u001a\u00020 8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008\u0082\u0001\u0010JR\u0018\u0010\u0085\u0001\u001a\u00020 8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008\u0084\u0001\u0010JR\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R.\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u008d\u0001\u0010\u008e\u0001R.\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u0090\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u0091\u0001\u0010\u008e\u0001R\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R4\u0010\u009d\u0001\u001a\u00030\u0096\u00012\u0008\u0010\u008a\u0001\u001a\u00030\u0096\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001\"\u0006\u0008\u009b\u0001\u0010\u009c\u0001\u00a8\u0006\u009e\u0001"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "Ll83/a0;",
        "onMeasure",
        "(II)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "Llp0/l;",
        "tonightWindow",
        "optimalWindow",
        "Lkp0/a;",
        "alarmType",
        "",
        "sleepTime",
        "",
        "alarmEnabled",
        "x",
        "(Llp0/l;Llp0/l;Lkp0/a;Ljava/lang/String;Z)V",
        "sleepWindow",
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "drawScale",
        "Landroid/graphics/Rect;",
        "s",
        "(Llp0/l;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)Landroid/graphics/Rect;",
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "Landroid/graphics/Bitmap;",
        "t",
        "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;",
        "w",
        "I",
        "topOfBar",
        "bottomOfBar",
        "Landroid/graphics/Paint;",
        "y",
        "Landroid/graphics/Paint;",
        "paint",
        "z",
        "sleepBarBackGroundPaint",
        "E",
        "sleepBarBackGroundStrokePaint",
        "F",
        "Llp0/l;",
        "tonightsSleepWindow",
        "G",
        "screenWidth",
        "H",
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "scale",
        "textScaleFactor",
        "J",
        "Ll83/h;",
        "getHashBitmap",
        "()Landroid/graphics/Bitmap;",
        "hashBitmap",
        "Landroid/graphics/BitmapShader;",
        "K",
        "getBitmapShader",
        "()Landroid/graphics/BitmapShader;",
        "bitmapShader",
        "L",
        "endpointWidth",
        "M",
        "Landroid/graphics/Rect;",
        "mainBarRect",
        "Landroid/graphics/ComposeShader;",
        "N",
        "Landroid/graphics/ComposeShader;",
        "composeShader",
        "O",
        "getPillButtonBitmap",
        "pillButtonBitmap",
        "P",
        "getAlarmTeardrop",
        "alarmTeardrop",
        "Landroid/graphics/LinearGradient;",
        "Q",
        "Landroid/graphics/LinearGradient;",
        "linearGradient",
        "R",
        "getHashBitmapTeal",
        "hashBitmapTeal",
        "S",
        "getBitmapShaderTeal",
        "bitmapShaderTeal",
        "T",
        "getPillButtonBitmapTeal",
        "pillButtonBitmapTeal",
        "U",
        "getAlarmTeardropTeal",
        "alarmTeardropTeal",
        "V",
        "linearGradientTeal",
        "W",
        "getHashBitmapGreen",
        "hashBitmapGreen",
        "a0",
        "getBitmapShaderGreen",
        "bitmapShaderGreen",
        "b0",
        "getPillButtonBitmapGreen",
        "pillButtonBitmapGreen",
        "c0",
        "getAlarmTeardropGreen",
        "alarmTeardropGreen",
        "d0",
        "linearGradientGreen",
        "e0",
        "Landroid/graphics/BitmapShader;",
        "shaderPref",
        "f0",
        "Landroid/graphics/Bitmap;",
        "pillButtonPref",
        "g0",
        "alarmTeardropPref",
        "h0",
        "colorPref",
        "i0",
        "lineGradientPref",
        "j0",
        "leftBarEndpointRectangle",
        "k0",
        "rightBarEndpointRectangle",
        "Landroid/graphics/DashPathEffect;",
        "l0",
        "Landroid/graphics/DashPathEffect;",
        "dashedPathEffect",
        "value",
        "m0",
        "Ljava/lang/String;",
        "getSleepTimeLabel",
        "()Ljava/lang/String;",
        "sleepTimeLabel",
        "n0",
        "getAbovePillLabel",
        "abovePillLabel",
        "o0",
        "Ljava/lang/Boolean;",
        "isAlarmEnabled",
        "Llp0/a;",
        "p0",
        "Llp0/a;",
        "getBarType",
        "()Llp0/a;",
        "setBarType",
        "(Llp0/a;)V",
        "barType",
        "sleep-coach_release"
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
.field private final E:Landroid/graphics/Paint;

.field private F:Llp0/l;

.field private G:I

.field private H:Lcom/whoop/coaching/sleepcoach/harvard/view/a;

.field private final I:I

.field private final J:Ll83/h;

.field private final K:Ll83/h;

.field private final L:I

.field private M:Landroid/graphics/Rect;

.field private N:Landroid/graphics/ComposeShader;

.field private final O:Ll83/h;

.field private final P:Ll83/h;

.field private final Q:Landroid/graphics/LinearGradient;

.field private final R:Ll83/h;

.field private final S:Ll83/h;

.field private final T:Ll83/h;

.field private final U:Ll83/h;

.field private final V:Landroid/graphics/LinearGradient;

.field private final W:Ll83/h;

.field private final a0:Ll83/h;

.field private final b0:Ll83/h;

.field private final c0:Ll83/h;

.field private final d0:Landroid/graphics/LinearGradient;

.field private e0:Landroid/graphics/BitmapShader;

.field private f0:Landroid/graphics/Bitmap;

.field private g0:Landroid/graphics/Bitmap;

.field private h0:I

.field private i0:Landroid/graphics/LinearGradient;

.field private j0:Landroid/graphics/Rect;

.field private k0:Landroid/graphics/Rect;

.field private final l0:Landroid/graphics/DashPathEffect;

.field private m0:Ljava/lang/String;

.field private n0:Ljava/lang/String;

.field private o0:Ljava/lang/Boolean;

.field private p0:Llp0/a;

.field private final w:I

.field private final x:I

.field private final y:Landroid/graphics/Paint;

.field private final z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p2, 0x8c

    iput p2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    const/16 v0, 0xd2

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->x:I

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const-string v1, "#40000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->z:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->E:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->G:I

    const/16 p1, 0xa

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->I:I

    new-instance v0, Llp0/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->J:Ll83/h;

    new-instance v0, Llp0/j;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->K:Ll83/h;

    const/4 v0, 0x6

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->L:I

    new-instance v1, Llp0/j;

    invoke-direct {v1, p0, v0}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->O:Ll83/h;

    new-instance v0, Llp0/j;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->P:Ll83/h;

    new-instance v1, Landroid/graphics/LinearGradient;

    int-to-float p2, p2

    const/high16 v0, 0x41200000    # 10.0f

    sub-float v4, p2, v0

    const/high16 v0, 0x432a0000    # 170.0f

    sub-float v6, p2, v0

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    move v3, v4

    const/4 v4, 0x0

    move v5, v6

    const/4 v6, -0x1

    const/high16 v7, -0x1000000

    move-object v8, v9

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->Q:Landroid/graphics/LinearGradient;

    new-instance p2, Llp0/j;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->R:Ll83/h;

    new-instance p2, Llp0/j;

    const/16 v0, 0x9

    invoke-direct {p2, p0, v0}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->S:Ll83/h;

    new-instance p2, Llp0/j;

    invoke-direct {p2, p0, p1}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->T:Ll83/h;

    new-instance p1, Llp0/j;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->U:Ll83/h;

    new-instance v2, Landroid/graphics/LinearGradient;

    const-string p1, "#00f19f"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const/high16 v8, -0x1000000

    move v4, v3

    const/4 v3, 0x0

    move v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move v3, v4

    move v5, v6

    iput-object v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->V:Landroid/graphics/LinearGradient;

    new-instance p1, Llp0/j;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->W:Ll83/h;

    new-instance p1, Llp0/j;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->a0:Ll83/h;

    new-instance p1, Llp0/j;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->b0:Ll83/h;

    new-instance p1, Llp0/j;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Llp0/j;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->c0:Ll83/h;

    new-instance v2, Landroid/graphics/LinearGradient;

    const-string p1, "#19ec06"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->d0:Landroid/graphics/LinearGradient;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getBitmapShader()Landroid/graphics/BitmapShader;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->e0:Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getPillButtonBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->f0:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getAlarmTeardrop()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->g0:Landroid/graphics/Bitmap;

    const/4 p1, -0x1

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    iput-object v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->i0:Landroid/graphics/LinearGradient;

    new-instance p1, Landroid/graphics/DashPathEffect;

    new-array p2, p2, [F

    fill-array-data p2, :array_0

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->l0:Landroid/graphics/DashPathEffect;

    sget-object p1, Llp0/a;->EXACT_TIME:Llp0/a;

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->p0:Llp0/a;

    return-void

    :array_0
    .array-data 4
        0x41100000    # 9.0f
        0x40e00000    # 7.0f
    .end array-data
.end method

.method private static final A(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->C:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->v(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->q(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->A(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->n(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->r(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;

    move-result-object p0

    return-object p0
.end method

.method private final getAlarmTeardrop()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->P:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getAlarmTeardropGreen()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->c0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getAlarmTeardropTeal()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->U:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getBitmapShader()Landroid/graphics/BitmapShader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->K:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/BitmapShader;

    return-object v0
.end method

.method private final getBitmapShaderGreen()Landroid/graphics/BitmapShader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->a0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/BitmapShader;

    return-object v0
.end method

.method private final getBitmapShaderTeal()Landroid/graphics/BitmapShader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->S:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/BitmapShader;

    return-object v0
.end method

.method private final getHashBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getHashBitmapGreen()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->W:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getHashBitmapTeal()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->R:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getPillButtonBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->O:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getPillButtonBitmapGreen()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->b0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private final getPillButtonBitmapTeal()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->T:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public static synthetic h(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->o(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->p(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->z(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->u(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->m(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->o:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->p:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->n:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;
    .locals 2

    new-instance v0, Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getHashBitmapGreen()Landroid/graphics/Bitmap;

    move-result-object p0

    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, p0, v1, v1}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    return-object v0
.end method

.method private static final q(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;
    .locals 2

    new-instance v0, Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getHashBitmapTeal()Landroid/graphics/Bitmap;

    move-result-object p0

    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, p0, v1, v1}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    return-object v0
.end method

.method private static final r(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/BitmapShader;
    .locals 2

    new-instance v0, Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getHashBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, p0, v1, v1}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    return-object v0
.end method

.method private final s(Llp0/l;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)Landroid/graphics/Rect;
    .locals 3

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v1

    invoke-static {v1, p2}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v1

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    invoke-virtual {p1}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p1

    invoke-static {p1, p2}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result p1

    iget p2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->x:I

    invoke-direct {v0, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method private final setBarType(Llp0/a;)V
    .locals 1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->p0:Llp0/a;

    sget-object v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getBitmapShaderGreen()Landroid/graphics/BitmapShader;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->e0:Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getPillButtonBitmapGreen()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->f0:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getAlarmTeardropGreen()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->g0:Landroid/graphics/Bitmap;

    const-string p1, "#19ec06"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->d0:Landroid/graphics/LinearGradient;

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->i0:Landroid/graphics/LinearGradient;

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getBitmapShaderTeal()Landroid/graphics/BitmapShader;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->e0:Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getPillButtonBitmapTeal()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->f0:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getAlarmTeardropTeal()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->g0:Landroid/graphics/Bitmap;

    const-string p1, "#00f19f"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->V:Landroid/graphics/LinearGradient;

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->i0:Landroid/graphics/LinearGradient;

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getBitmapShader()Landroid/graphics/BitmapShader;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->e0:Landroid/graphics/BitmapShader;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getPillButtonBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->f0:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getAlarmTeardrop()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->g0:Landroid/graphics/Bitmap;

    const/4 p1, -0x1

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->Q:Landroid/graphics/LinearGradient;

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->i0:Landroid/graphics/LinearGradient;

    return-void
.end method

.method private final t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "getBitmap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method private static final u(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->l:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->m:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->k:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->A:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final z(Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/d;->B:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "getDrawable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->t(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getAbovePillLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->n0:Ljava/lang/String;

    return-object v0
.end method

.method public final getBarType()Llp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->p0:Llp0/a;

    return-object v0
.end method

.method public final getSleepTimeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->m0:Ljava/lang/String;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->reset()V

    iget-object v7, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->H:Lcom/whoop/coaching/sleepcoach/harvard/view/a;

    if-nez v7, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v8, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->F:Llp0/l;

    if-nez v8, :cond_1

    goto/16 :goto_3

    :cond_1
    iget v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v2, v2

    const/high16 v9, 0x41a00000    # 20.0f

    sub-float v3, v2, v9

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v4, v2

    iget v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->x:I

    int-to-float v2, v2

    add-float v5, v2, v9

    iget-object v6, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->z:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v1, v1

    sub-float v3, v1, v9

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v4, v1

    iget v1, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->x:I

    int-to-float v1, v1

    add-float v5, v1, v9

    iget-object v6, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->E:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->p0:Llp0/a;

    sget-object v3, Llp0/a;->EXACT_TIME:Llp0/a;

    const-string v4, "mainBarRect"

    const/4 v9, 0x0

    if-eq v2, v3, :cond_4

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->N:Landroid/graphics/ComposeShader;

    if-eqz v5, :cond_3

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    if-eqz v2, :cond_2

    invoke-static {v2}, Llp0/k;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v2

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_3
    const-string v1, "composeShader"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_4
    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->e0:Landroid/graphics/BitmapShader;

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    if-eqz v2, :cond_e

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :goto_0
    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v8}, Llp0/l;->d()Lorg/joda/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v2

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->f0:Landroid/graphics/Bitmap;

    const-string v6, ""

    if-eqz v5, :cond_8

    int-to-float v11, v2

    invoke-direct {v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getPillButtonBitmap()Landroid/graphics/Bitmap;

    move-result-object v12

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    div-int/lit8 v12, v12, 0x2

    int-to-float v12, v12

    sub-float v12, v11, v12

    iget v13, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v13, v13

    invoke-direct {v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->getPillButtonBitmap()Landroid/graphics/Bitmap;

    move-result-object v14

    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    iget-object v15, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    if-eqz v15, :cond_7

    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v15

    sub-int/2addr v14, v15

    div-int/lit8 v14, v14, 0x2

    int-to-float v14, v14

    sub-float/2addr v13, v14

    iget-object v14, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v5, v12, v13, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-double v12, v5

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-double v14, v5

    mul-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    iget v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->I:I

    int-to-double v14, v5

    div-double/2addr v12, v14

    double-to-float v5, v12

    iget-object v12, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    iget v13, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v13, Lgy0/b;->d:I

    invoke-static {v5, v13}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->m0:Ljava/lang/String;

    if-nez v5, :cond_5

    move-object v5, v6

    :cond_5
    iget v12, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v12, v12

    iget-object v13, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    if-eqz v13, :cond_6

    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    add-float/2addr v12, v4

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    const/4 v13, 0x3

    int-to-float v13, v13

    div-float/2addr v4, v13

    add-float/2addr v4, v12

    iget-object v12, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v5, v11, v4, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_8
    :goto_1
    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v5, 0x41f00000    # 30.0f

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    const v5, 0x3dcccccd    # 0.1f

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v11, Lgy0/b;->a:I

    invoke-static {v5, v11}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->n0:Ljava/lang/String;

    if-eqz v4, :cond_9

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v4, "toUpperCase(...)"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    int-to-float v2, v2

    iget v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v4, v4

    const/high16 v5, 0x42340000    # 45.0f

    sub-float/2addr v4, v5

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v6, v2, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {v8}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v11

    invoke-virtual {v8}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v2

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    iget v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->j0:Landroid/graphics/Rect;

    if-eqz v4, :cond_d

    iget-object v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->p0:Llp0/a;

    if-ne v4, v3, :cond_b

    iget-object v3, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->k0:Landroid/graphics/Rect;

    if-eqz v3, :cond_a

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_2

    :cond_a
    const-string v1, "rightBarEndpointRectangle"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_b
    :goto_2
    iget-object v3, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->l0:Landroid/graphics/DashPathEffect;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->h0:I

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->i0:Landroid/graphics/LinearGradient;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    int-to-float v2, v2

    iget v3, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->L:I

    div-int/lit8 v4, v3, 0x2

    int-to-float v4, v4

    add-float/2addr v4, v2

    iget v5, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v6, v5

    const/high16 v7, 0x41200000    # 10.0f

    sub-float/2addr v6, v7

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    add-float/2addr v2, v3

    int-to-float v3, v5

    const/high16 v8, 0x43c80000    # 400.0f

    sub-float v5, v3, v8

    move v3, v6

    iget-object v6, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    move/from16 v16, v4

    move v4, v2

    move/from16 v2, v16

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    int-to-float v11, v11

    iget v1, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->L:I

    div-int/lit8 v2, v1, 0x2

    int-to-float v2, v2

    sub-float v2, v11, v2

    iget v3, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v4, v3

    sub-float/2addr v4, v7

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float v1, v11, v1

    int-to-float v3, v3

    sub-float v5, v3, v8

    iget-object v6, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    move v3, v4

    move v4, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->o0:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->g0:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v11, v3

    const/high16 v3, 0x40400000    # 3.0f

    sub-float/2addr v11, v3

    iget v3, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->g0:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x41500000    # 13.0f

    sub-float/2addr v3, v4

    iget-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v11, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_c
    :goto_3
    return-void

    :cond_d
    const-string v1, "leftBarEndpointRectangle"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_e
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/16 p2, 0xfa

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final x(Llp0/l;Llp0/l;Lkp0/a;Ljava/lang/String;Z)V
    .locals 8

    const-string v0, "tonightWindow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optimalWindow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->F:Llp0/l;

    instance-of v0, p3, Lkp0/c;

    if-eqz v0, :cond_0

    sget-object p3, Llp0/a;->EXACT_TIME:Llp0/a;

    goto :goto_0

    :cond_0
    instance-of v0, p3, Lkp0/n;

    if-eqz v0, :cond_1

    sget-object p3, Llp0/a;->SLEEP_GOAL:Llp0/a;

    goto :goto_0

    :cond_1
    instance-of p3, p3, Lkp0/f;

    if-eqz p3, :cond_4

    sget-object p3, Llp0/a;->IN_THE_GREEN:Llp0/a;

    :goto_0
    invoke-direct {p0, p3}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->setBarType(Llp0/a;)V

    sget-object p3, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->d:Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->G:I

    invoke-virtual {p3, v0, p1, p2}, Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;->a(ILlp0/l;Llp0/l;)Lcom/whoop/coaching/sleepcoach/harvard/view/a;

    move-result-object p2

    invoke-virtual {p1}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p3

    invoke-static {p3, p2}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result p3

    invoke-virtual {p1}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v0

    invoke-static {v0, p2}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v0

    new-instance v1, Landroid/graphics/Rect;

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    iget v3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->L:I

    add-int/2addr v3, v0

    iget v4, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->x:I

    invoke-direct {v1, v0, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->j0:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->L:I

    sub-int v1, p3, v1

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->w:I

    iget v3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->x:I

    invoke-direct {v0, v1, v2, p3, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->k0:Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->s(Llp0/l;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)Landroid/graphics/Rect;

    move-result-object p3

    iput-object p3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/LinearGradient;

    invoke-virtual {p1}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p3

    invoke-static {p3, p2}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result p3

    int-to-float p3, p3

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    const/4 v2, 0x0

    const-string v3, "mainBarRect"

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v1, v4

    add-float/2addr v1, p3

    invoke-virtual {p1}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p1

    invoke-static {p1, p2}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result p1

    int-to-float p1, p1

    iget-object p3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->M:Landroid/graphics/Rect;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p3

    int-to-float p3, p3

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr p3, v2

    sub-float v3, p1, p3

    const/high16 v6, -0x1000000

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    new-instance p1, Landroid/graphics/ComposeShader;

    iget-object p3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->e0:Landroid/graphics/BitmapShader;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, p3, v0, v1}, Landroid/graphics/ComposeShader;-><init>(Landroid/graphics/Shader;Landroid/graphics/Shader;Landroid/graphics/PorterDuff$Mode;)V

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->N:Landroid/graphics/ComposeShader;

    iput-object p2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->H:Lcom/whoop/coaching/sleepcoach/harvard/view/a;

    iput-object p4, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->m0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lqe2/g;->p1:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->n0:Ljava/lang/String;

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;->o0:Ljava/lang/Boolean;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
