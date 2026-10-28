.class public final Lcom/whoop/ui/views/ConnectingAnimationView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001d\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nJ7\u0010\u0013\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010 R\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008 \u0010 R\u0016\u0010(\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010 R\u0016\u0010*\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010 R\u0014\u0010+\u001a\u00020\u001e8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010 R\u0016\u0010.\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00108R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010E\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010B\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/ui/views/ConnectingAnimationView;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Ll83/a0;",
        "c",
        "()V",
        "f",
        "",
        "changed",
        "",
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
        "w",
        "I",
        "blueOpaque",
        "x",
        "blue",
        "",
        "y",
        "F",
        "halfHeight",
        "z",
        "radius",
        "E",
        "diameter",
        "strokeW",
        "G",
        "middleW",
        "H",
        "middlePadding",
        "dotRadius",
        "J",
        "Z",
        "flip",
        "Landroid/graphics/Bitmap;",
        "K",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "L",
        "Landroid/graphics/Canvas;",
        "dotCanvas",
        "Landroid/os/Handler;",
        "M",
        "Landroid/os/Handler;",
        "drawHandler",
        "Landroid/os/HandlerThread;",
        "N",
        "Landroid/os/HandlerThread;",
        "backgroundThread",
        "O",
        "uiHandler",
        "Landroid/graphics/Paint;",
        "P",
        "Landroid/graphics/Paint;",
        "paint",
        "Q",
        "paintStroke",
        "legacy_release"
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
.field private E:F

.field private final F:F

.field private G:F

.field private H:F

.field private final I:F

.field private J:Z

.field private K:Landroid/graphics/Bitmap;

.field private L:Landroid/graphics/Canvas;

.field private final M:Landroid/os/Handler;

.field private final N:Landroid/os/HandlerThread;

.field private final O:Landroid/os/Handler;

.field private final P:Landroid/graphics/Paint;

.field private final Q:Landroid/graphics/Paint;

.field private final w:I

.field private final x:I

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x40800000    # 4.0f

    iput p1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->F:F

    const/high16 p2, 0x40c00000    # 6.0f

    iput p2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->H:F

    const/high16 p2, 0x40a00000    # 5.0f

    iput p2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->I:F

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->J:Z

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, p2}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, p2}, Landroid/graphics/Paint;-><init>(I)V

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/high16 p1, -0x1000000

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iput-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->Q:Landroid/graphics/Paint;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lvu1/a;->b:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lvu1/a;->h:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->w:I

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->O:Landroid/os/Handler;

    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "ConnectingAnimationView draw thread"

    const/16 v0, 0xa

    invoke-direct {p1, p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->M:Landroid/os/Handler;

    iput-object p1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->N:Landroid/os/HandlerThread;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/ui/views/ConnectingAnimationView;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/views/ConnectingAnimationView;->d(Lcom/whoop/ui/views/ConnectingAnimationView;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/ui/views/ConnectingAnimationView;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/views/ConnectingAnimationView;->e(Lcom/whoop/ui/views/ConnectingAnimationView;)V

    return-void
.end method

.method private final c()V
    .locals 8

    iget v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->G:F

    float-to-int v0, v0

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->I:F

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x2

    if-lez v0, :cond_0

    if-lez v1, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->K:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->K:Landroid/graphics/Bitmap;

    const-string v2, "null cannot be cast to non-null type android.graphics.Bitmap"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->L:Landroid/graphics/Canvas;

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->L:Landroid/graphics/Canvas;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-boolean v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->J:Z

    if-eqz v1, :cond_1

    iget v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->x:I

    iget v3, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->w:I

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->w:I

    iget v3, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->x:I

    :goto_0
    const/4 v4, 0x1

    xor-int/2addr v1, v4

    iput-boolean v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->J:Z

    iget-object v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->I:F

    iget-object v5, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v1, v1, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v5, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->I:F

    sub-float/2addr v1, v5

    iget-object v6, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v5, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->G:F

    const/high16 v5, 0x41a00000    # 20.0f

    div-float/2addr v1, v5

    :goto_1
    const/16 v5, 0x14

    if-ge v4, v5, :cond_3

    rem-int/lit8 v5, v4, 0x2

    if-nez v5, :cond_2

    iget-object v5, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    :goto_2
    int-to-float v5, v4

    mul-float/2addr v5, v1

    iget v6, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->I:F

    iget-object v7, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {v0, v5, v6, v6, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->O:Landroid/os/Handler;

    new-instance v1, Lkn2/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lkn2/a;-><init>(Lcom/whoop/ui/views/ConnectingAnimationView;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final d(Lcom/whoop/ui/views/ConnectingAnimationView;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private static final e(Lcom/whoop/ui/views/ConnectingAnimationView;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/views/ConnectingAnimationView;->c()V

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->N:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->y:F

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    iget-object v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->y:F

    sub-float/2addr v0, v1

    iget v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    iget-object v3, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->P:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->K:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->E:F

    iget v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->H:F

    add-float/2addr v1, v2

    iget v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_0
    iget v0, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->y:F

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    iget-object v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->Q:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->y:F

    sub-float/2addr v0, v1

    iget v2, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    iget-object v3, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->Q:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/whoop/ui/views/ConnectingAnimationView;->M:Landroid/os/Handler;

    new-instance v0, Lkn2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkn2/a;-><init>(Lcom/whoop/ui/views/ConnectingAnimationView;I)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    move-object p1, p0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    iput p2, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->y:F

    iget p4, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->F:F

    div-float/2addr p4, p3

    sub-float/2addr p2, p4

    iput p2, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    mul-float/2addr p2, p3

    iput p2, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->E:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    iget p4, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->z:F

    const/high16 p5, 0x40800000    # 4.0f

    mul-float/2addr p5, p4

    sub-float/2addr p2, p5

    iget p5, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->H:F

    mul-float/2addr p5, p3

    sub-float/2addr p2, p5

    iput p2, p1, Lcom/whoop/ui/views/ConnectingAnimationView;->G:F

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p5, "onLayout radius = "

    invoke-direct {p3, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, ", middleW = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "ConnectingAnimationView"

    invoke-static {p3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/whoop/ui/views/ConnectingAnimationView;->c()V

    return-void
.end method
