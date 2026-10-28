.class public Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final E:Ld50/d;

.field public final F:Landroid/view/View;

.field public final G:[I

.field public final H:Z

.field public I:I

.field public J:Z

.field public K:F

.field public L:F

.field public final M:Landroid/os/Handler;

.field public final w:I

.field public final x:Ld50/a;

.field public final y:Ld50/d;

.field public final z:Ld50/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, -0x1

    iput p2, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->M:Landroid/os/Handler;

    invoke-virtual {p0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->w:I

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->J:Z

    new-instance v1, Ld50/b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ld50/b;-><init>(Landroid/content/Context;I)V

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/a;

    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->x:Ld50/a;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/d;

    invoke-direct {v1, p1}, Ld50/d;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->y:Ld50/d;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/d;

    invoke-direct {v1, p1}, Ld50/d;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->z:Ld50/d;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/d;

    invoke-direct {v1, p1}, Ld50/d;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->E:Ld50/d;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/e;

    invoke-direct {v1, p1}, Ld50/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/e;

    invoke-direct {v1, p1}, Ld50/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld50/e;

    invoke-direct {v1, p1}, Ld50/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v1, 0x169

    new-array v2, v1, [I

    iput-object v2, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->G:[I

    const/4 v2, 0x1

    const/16 v3, 0x8

    move v5, v2

    move v4, v3

    move v3, v0

    :goto_0
    const/4 v6, 0x4

    if-ge v0, v1, :cond_3

    iget-object v7, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->G:[I

    aput v3, v7, v0

    if-ne v5, v4, :cond_2

    add-int/lit8 v3, v3, 0x6

    const/16 v4, 0x168

    if-ne v3, v4, :cond_0

    const/4 v6, 0x7

    goto :goto_1

    :cond_0
    rem-int/lit8 v4, v3, 0x1e

    if-nez v4, :cond_1

    const/16 v6, 0xe

    :cond_1
    :goto_1
    move v5, v2

    move v4, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iput-boolean v2, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->H:Z

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->F:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const p2, 0x7f0603a2

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string p2, "accessibility"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    return-void
.end method

.method private getCurrentlyShowingValue()I
    .locals 3

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getCurrentItemShowing()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    throw v1

    :cond_1
    throw v1

    :cond_2
    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getCurrentItemShowing()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->E:Ld50/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    iget-object v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->z:Ld50/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    iget-object v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->y:Ld50/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getHours()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xc

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getMinutes()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xd

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getSeconds()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v0, v1, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v3

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getCurrentItemShowing()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHours()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getIsCurrentlyAmOrPm()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getMinutes()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getSeconds()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getTime()Ld50/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_BACKWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_FORWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    iget-boolean v1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->H:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_c

    const-string v5, "RadialPickerLayout"

    iget-object v6, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->M:Landroid/os/Handler;

    iget-object v7, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->x:Ld50/a;

    const/4 v8, -0x1

    if-eq p2, v4, :cond_6

    const/4 v9, 0x2

    if-eq p2, v9, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    const-string p1, "Input was disabled, but received ACTION_MOVE."

    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    :cond_1
    iget p2, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->L:F

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->K:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-boolean v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->J:Z

    if-nez v0, :cond_2

    iget v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->w:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_2

    cmpg-float p1, p2, v0

    if-gtz p1, :cond_2

    goto :goto_1

    :cond_2
    iget p1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    if-eqz p1, :cond_4

    if-ne p1, v4, :cond_3

    goto :goto_0

    :cond_3
    iput-boolean v4, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->J:Z

    invoke-virtual {v6, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->a()V

    return v4

    :cond_4
    :goto_0
    invoke-virtual {v6, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    if-eq v8, p1, :cond_5

    invoke-virtual {v7, v8}, Ld50/a;->setAmOrPmPressed(I)V

    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    iput v8, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    :cond_5
    :goto_1
    return v2

    :cond_6
    if-eqz v1, :cond_b

    invoke-virtual {v6, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget p1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    if-eqz p1, :cond_8

    if-ne p1, v4, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->a()V

    iput-boolean v2, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->J:Z

    return v4

    :cond_8
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, v8}, Ld50/a;->setAmOrPmPressed(I)V

    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    iget p1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    if-ne v8, p1, :cond_a

    invoke-virtual {v7, v8}, Ld50/a;->setAmOrPm(I)V

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getIsCurrentlyAmOrPm()I

    move-result p1

    if-ne p1, v8, :cond_9

    goto :goto_3

    :cond_9
    throw v3

    :cond_a
    :goto_3
    iput v8, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->I:I

    return v2

    :cond_b
    const-string p1, "Input was disabled, but received ACTION_UP."

    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    throw v3

    :cond_c
    if-nez v1, :cond_d

    return v4

    :cond_d
    iput p1, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->K:F

    iput v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->L:F

    iput-boolean v2, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->J:Z

    throw v3
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 7

    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    const/16 p2, 0x1000

    const/4 v1, 0x0

    if-ne p1, p2, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    const/16 p2, 0x2000

    if-ne p1, p2, :cond_2

    const/4 p1, -0x1

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    if-eqz p1, :cond_f

    invoke-direct {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getCurrentlyShowingValue()I

    move-result p2

    invoke-virtual {p0}, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->getCurrentItemShowing()I

    move-result v2

    const/4 v3, 0x2

    if-nez v2, :cond_3

    rem-int/lit8 p2, p2, 0xc

    const/16 v1, 0x1e

    goto :goto_2

    :cond_3
    const/4 v4, 0x6

    if-ne v2, v0, :cond_4

    :goto_1
    move v1, v4

    goto :goto_2

    :cond_4
    if-ne v2, v3, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    mul-int/2addr p2, v1

    div-int/lit8 v4, p2, 0x1e

    mul-int/lit8 v4, v4, 0x1e

    add-int/lit8 v5, v4, 0x1e

    const/4 v6, 0x1

    if-ne p1, v6, :cond_6

    goto :goto_3

    :cond_6
    const/4 v6, -0x1

    if-ne p1, v6, :cond_7

    if-ne p2, v4, :cond_9

    add-int/lit8 v4, v4, -0x1e

    goto :goto_4

    :cond_7
    sub-int p1, p2, v4

    sub-int p2, v5, p2

    if-ge p1, p2, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    move v4, v5

    :cond_9
    :goto_4
    div-int/2addr v4, v1

    const/4 p1, 0x0

    if-eqz v2, :cond_e

    if-eq v2, v0, :cond_d

    if-eq v2, v3, :cond_c

    if-eqz v2, :cond_b

    if-eq v2, v0, :cond_a

    throw p1

    :cond_a
    throw p1

    :cond_b
    throw p1

    :cond_c
    throw p1

    :cond_d
    throw p1

    :cond_e
    throw p1

    :cond_f
    return v1
.end method

.method public setAmOrPm(I)V
    .locals 1

    iget-object v0, p0, Lcom/wdullaer/materialdatetimepicker/time/RadialPickerLayout;->x:Ld50/a;

    invoke-virtual {v0, p1}, Ld50/a;->setAmOrPm(I)V

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x0

    throw p1
.end method

.method public setOnValueSelectedListener(Ld50/c;)V
    .locals 0

    return-void
.end method

.method public setTime(Ld50/f;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
