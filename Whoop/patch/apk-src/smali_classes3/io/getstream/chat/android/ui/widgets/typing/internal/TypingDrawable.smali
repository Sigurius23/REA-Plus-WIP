.class final Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0019\u0010&\u001a\u00020\u000f2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008(\u0010\u001bR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010-R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00101\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00100R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00100R\u001c\u00105\u001a\n 4*\u0004\u0018\u000103038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00068"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;",
        "Landroid/graphics/drawable/Drawable;",
        "Landroid/graphics/drawable/Animatable;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "dotIndex",
        "",
        "phase",
        "calculateAlpha",
        "(IF)I",
        "calculateCx",
        "(I)F",
        "Ll83/a0;",
        "start",
        "()V",
        "stop",
        "",
        "isRunning",
        "()Z",
        "visible",
        "restart",
        "setVisible",
        "(ZZ)Z",
        "getIntrinsicWidth",
        "()I",
        "getIntrinsicHeight",
        "Landroid/graphics/Canvas;",
        "canvas",
        "draw",
        "(Landroid/graphics/Canvas;)V",
        "alpha",
        "setAlpha",
        "(I)V",
        "Landroid/graphics/ColorFilter;",
        "colorFilter",
        "setColorFilter",
        "(Landroid/graphics/ColorFilter;)V",
        "getOpacity",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Paint;",
        "intrinsicHeight",
        "I",
        "intrinsicWidth",
        "dotSpacingPx",
        "F",
        "dotDiameterPx",
        "dotRadiusPx",
        "Landroid/animation/ValueAnimator;",
        "kotlin.jvm.PlatformType",
        "animator",
        "Landroid/animation/ValueAnimator;",
        "Companion",
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
.field private static final ANIMATION_OFFSET_MILLIS:I = 0xa6

.field public static final Companion:Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable$Companion;

.field private static final DELAY_DURATION_MILLIS:I = 0x12c

.field private static final DOTS_ANIMATION_DURATION_MILLIS:I = 0x1f4

.field private static final DOT_COUNT:I = 0x3

.field private static final DOT_SIZE_DP:I = 0x5

.field private static final DOT_SPACING_DP:I = 0x3

.field private static final FULL_ANIMATION_DURATION:I = 0x320


# instance fields
.field private final animator:Landroid/animation/ValueAnimator;

.field private final dotDiameterPx:F

.field private final dotRadiusPx:F

.field private final dotSpacingPx:F

.field private final intrinsicHeight:I

.field private final intrinsicWidth:I

.field private final paint:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->Companion:Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v3, 0x320

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    new-instance v4, Lio/getstream/chat/android/ui/widgets/typing/internal/a;

    invoke-direct {v4, p0}, Lio/getstream/chat/android/ui/widgets/typing/internal/a;-><init>(Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;)V

    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator:Landroid/animation/ValueAnimator;

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {p1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 p1, 0x3

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotSpacingPx:F

    const/4 p1, 0x5

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotDiameterPx:F

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotRadiusPx:F

    const/16 v0, 0x18

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->intrinsicWidth:I

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->intrinsicHeight:I

    return-void

    :array_0
    .array-data 4
        0x0
        0x44480000    # 800.0f
    .end array-data
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator$lambda$1$lambda$0(Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final animator$lambda$1$lambda$0(Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method private final calculateAlpha(IF)I
    .locals 4

    rsub-int/lit8 p1, p1, 0x3

    mul-int/lit16 p1, p1, 0xa6

    int-to-float p1, p1

    add-float/2addr p2, p1

    const/16 p1, 0x320

    int-to-float p1, p1

    rem-float/2addr p2, p1

    const/high16 p1, 0x43fa0000    # 500.0f

    cmpl-float v0, p2, p1

    if-lez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    float-to-double v2, p2

    mul-double/2addr v2, v0

    float-to-double p1, p1

    div-double/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    double-to-float p1, p1

    :goto_0
    const/high16 p2, 0x3f000000    # 0.5f

    mul-float/2addr p1, p2

    add-float/2addr p1, p2

    const/16 p2, 0xff

    int-to-float p2, p2

    mul-float/2addr p1, p2

    float-to-int p1, p1

    return p1
.end method

.method private final calculateCx(I)F
    .locals 2

    int-to-float p1, p1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotDiameterPx:F

    mul-float/2addr v0, p1

    iget v1, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotSpacingPx:F

    mul-float/2addr p1, v1

    add-float/2addr p1, v0

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotRadiusPx:F

    add-float/2addr p1, v0

    return p1
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Float;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x0

    :goto_2
    const/4 v2, 0x3

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->paint:Landroid/graphics/Paint;

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->calculateAlpha(IF)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->calculateCx(I)F

    move-result v2

    iget v3, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->dotRadiusPx:F

    iget-object v4, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->intrinsicHeight:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->intrinsicWidth:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->start()V

    return p2

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->stop()V

    return p2
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method
