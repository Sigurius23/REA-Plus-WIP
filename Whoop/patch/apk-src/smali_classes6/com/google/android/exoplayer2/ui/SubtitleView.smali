.class public final Lcom/google/android/exoplayer2/ui/SubtitleView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lrm/z0;


# instance fields
.field public E:Z

.field public F:Z

.field public G:I

.field public H:Ljo/z;

.field public I:Landroid/view/View;

.field public w:Ljava/util/List;

.field public x:Ljo/d;

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->w:Ljava/util/List;

    sget-object p2, Ljo/d;->g:Ljo/d;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->x:Ljo/d;

    const p2, 0x3d5a511a    # 0.0533f

    iput p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->y:F

    const p2, 0x3da3d70a    # 0.08f

    iput p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->z:F

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->E:Z

    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->F:Z

    new-instance v0, Ljo/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ljo/c;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->H:Ljo/z;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->I:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput p2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->G:I

    return-void
.end method

.method private getCuesWithStylingPreferencesApplied()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxn/b;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->E:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->F:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->w:Ljava/util/List;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->w:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->w:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxn/b;

    invoke-virtual {v3}, Lxn/b;->a()Lxn/a;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->E:Z

    if-nez v4, :cond_4

    iput-boolean v1, v3, Lxn/a;->n:Z

    iget-object v4, v3, Lxn/a;->a:Ljava/lang/CharSequence;

    instance-of v5, v4, Landroid/text/Spanned;

    if-eqz v5, :cond_3

    instance-of v5, v4, Landroid/text/Spannable;

    if-nez v5, :cond_1

    invoke-static {v4}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v4

    iput-object v4, v3, Lxn/a;->a:Ljava/lang/CharSequence;

    :cond_1
    iget-object v4, v3, Lxn/a;->a:Ljava/lang/CharSequence;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Landroid/text/Spannable;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const-class v6, Ljava/lang/Object;

    invoke-interface {v4, v1, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    array-length v6, v5

    move v7, v1

    :goto_1
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    instance-of v9, v8, Lbo/b;

    if-nez v9, :cond_2

    invoke-interface {v4, v8}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    invoke-static {v3}, Le4/a;->O(Lxn/a;)V

    goto :goto_2

    :cond_4
    iget-boolean v4, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->F:Z

    if-nez v4, :cond_5

    invoke-static {v3}, Le4/a;->O(Lxn/a;)V

    :cond_5
    :goto_2
    invoke-virtual {v3}, Lxn/a;->a()Lxn/b;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method private getUserCaptionFontScale()F
    .locals 3

    sget v0, Llo/y;->a:I

    const/16 v1, 0x13

    const/high16 v2, 0x3f800000    # 1.0f

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "captioning"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/CaptioningManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/accessibility/CaptioningManager;->getFontScale()F

    move-result v0

    return v0

    :cond_1
    :goto_0
    return v2
.end method

.method private getUserCaptionStyle()Ljo/d;
    .locals 11

    sget v0, Llo/y;->a:I

    const/16 v1, 0x13

    sget-object v2, Ljo/d;->g:Ljo/d;

    if-lt v0, v1, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "captioning"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/CaptioningManager;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object v1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_6

    new-instance v3, Ljo/d;

    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasForegroundColor()Z

    move-result v0

    const/4 v2, -0x1

    if-eqz v0, :cond_1

    iget v0, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->foregroundColor:I

    move v4, v0

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasBackgroundColor()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->backgroundColor:I

    :goto_1
    move v5, v0

    goto :goto_2

    :cond_2
    const/high16 v0, -0x1000000

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasWindowColor()Z

    move-result v0

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    iget v0, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->windowColor:I

    goto :goto_3

    :cond_3
    move v0, v6

    :goto_3
    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasEdgeType()Z

    move-result v7

    if-eqz v7, :cond_4

    iget v6, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeType:I

    :cond_4
    move v7, v6

    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasEdgeColor()Z

    move-result v6

    if-eqz v6, :cond_5

    iget v2, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeColor:I

    :cond_5
    move v8, v2

    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v9

    move v6, v0

    invoke-direct/range {v3 .. v9}, Ljo/d;-><init>(IIIIILandroid/graphics/Typeface;)V

    return-object v3

    :cond_6
    new-instance v4, Ljo/d;

    iget v5, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->foregroundColor:I

    iget v6, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->backgroundColor:I

    iget v8, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeType:I

    iget v9, v1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeColor:I

    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v10

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v10}, Ljo/d;-><init>(IIIIILandroid/graphics/Typeface;)V

    return-object v4

    :cond_7
    :goto_4
    return-object v2
.end method

.method private setView(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ":",
            "Ljo/z;",
            ">(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->I:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->I:Landroid/view/View;

    instance-of v1, v0, Ljo/c0;

    if-eqz v1, :cond_0

    check-cast v0, Ljo/c0;

    iget-object v0, v0, Ljo/c0;->x:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->I:Landroid/view/View;

    move-object v0, p1

    check-cast v0, Ljo/z;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->H:Ljo/z;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->getUserCaptionStyle()Ljo/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setStyle(Ljo/d;)V

    return-void
.end method

.method public final h()V
    .locals 2

    const v0, 0x3d5a511a    # 0.0533f

    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->getUserCaptionFontScale()F

    move-result v1

    mul-float/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setFractionalTextSize(F)V

    return-void
.end method

.method public final onCues(Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setCues(Ljava/util/List;)V

    return-void
.end method

.method public setApplyEmbeddedFontSizes(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->F:Z

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->t()V

    return-void
.end method

.method public setApplyEmbeddedStyles(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->E:Z

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->t()V

    return-void
.end method

.method public setBottomPaddingFraction(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->z:F

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->t()V

    return-void
.end method

.method public setCues(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxn/b;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->w:Ljava/util/List;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->t()V

    return-void
.end method

.method public setFractionalTextSize(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->y:F

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->t()V

    return-void
.end method

.method public setStyle(Ljo/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->x:Ljo/d;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->t()V

    return-void
.end method

.method public setViewType(I)V
    .locals 3

    iget v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->G:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    new-instance v0, Ljo/c0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ljo/c0;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Ljo/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljo/c;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setView(Landroid/view/View;)V

    :goto_0
    iput p1, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->G:I

    return-void
.end method

.method public final t()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->H:Ljo/z;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/SubtitleView;->getCuesWithStylingPreferencesApplied()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->x:Ljo/d;

    iget v3, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->y:F

    iget v4, p0, Lcom/google/android/exoplayer2/ui/SubtitleView;->z:F

    invoke-interface {v0, v1, v2, v3, v4}, Ljo/z;->a(Ljava/util/List;Ljo/d;FF)V

    return-void
.end method
