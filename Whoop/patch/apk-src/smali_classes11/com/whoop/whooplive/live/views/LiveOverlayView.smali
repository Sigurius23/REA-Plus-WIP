.class public Lcom/whoop/whooplive/live/views/LiveOverlayView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplive/live/views/LiveOverlayView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u0001B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001bR\'\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00080%j\u0008\u0012\u0004\u0012\u00020\u0008`&8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/whoop/whooplive/live/views/LiveOverlayView;",
        "Landroid/widget/RelativeLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "onFinishInflate",
        "()V",
        "f",
        "Lcom/whoop/service/network/model/cycles/Strain;",
        "strain",
        "c",
        "(Lcom/whoop/service/network/model/cycles/Strain;)V",
        "d",
        "e",
        "Lrz2/a;",
        "mode",
        "i",
        "(Lrz2/a;)V",
        "",
        "w",
        "[I",
        "getDisplays",
        "()[I",
        "displays",
        "x",
        "addDisplays",
        "y",
        "removeDisplayIcons",
        "z",
        "hideDisplayIcons",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "E",
        "Ljava/util/ArrayList;",
        "getHideList",
        "()Ljava/util/ArrayList;",
        "hideList",
        "whooplive_release"
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
.field private final E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final w:[I

.field private final x:[I

.field private final y:[I

.field private final z:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/whooplive/live/views/LiveOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget p2, Lpz2/e;->R:I

    .line 4
    sget p3, Lpz2/e;->L:I

    .line 5
    sget v0, Lpz2/e;->b0:I

    .line 6
    sget v1, Lpz2/e;->Y:I

    filled-new-array {p2, p3, v0, v1}, [I

    move-result-object p2

    .line 7
    iput-object p2, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->w:[I

    .line 8
    sget p2, Lpz2/e;->S:I

    sget p3, Lpz2/e;->M:I

    sget v0, Lpz2/e;->c0:I

    sget v1, Lpz2/e;->X:I

    filled-new-array {p2, p3, v0, v1}, [I

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->x:[I

    .line 9
    sget v2, Lpz2/e;->T:I

    .line 10
    sget v3, Lpz2/e;->N:I

    .line 11
    sget v4, Lpz2/e;->d0:I

    .line 12
    sget v5, Lpz2/e;->Z:I

    filled-new-array {v2, v3, v4, v5}, [I

    move-result-object v2

    .line 13
    iput-object v2, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->y:[I

    .line 14
    filled-new-array {p2, p3, v0, v1}, [I

    move-result-object p2

    .line 15
    iput-object p2, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->z:[I

    .line 16
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->E:Ljava/util/ArrayList;

    .line 17
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lpz2/f;->c:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/whooplive/live/views/LiveOverlayView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->h(Lcom/whoop/whooplive/live/views/LiveOverlayView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/whooplive/live/views/LiveOverlayView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->g(Lcom/whoop/whooplive/live/views/LiveOverlayView;Landroid/view/View;)V

    return-void
.end method

.method private static final g(Lcom/whoop/whooplive/live/views/LiveOverlayView;Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lpz2/e;->S:I

    if-ne p1, v0, :cond_0

    sget p1, Lpz2/e;->R:I

    goto :goto_0

    :cond_0
    sget v0, Lpz2/e;->M:I

    if-ne p1, v0, :cond_1

    sget p1, Lpz2/e;->L:I

    goto :goto_0

    :cond_1
    sget v0, Lpz2/e;->c0:I

    if-ne p1, v0, :cond_2

    sget p1, Lpz2/e;->b0:I

    goto :goto_0

    :cond_2
    sget p1, Lpz2/e;->Y:I

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final h(Lcom/whoop/whooplive/live/views/LiveOverlayView;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lpz2/e;->T:I

    if-ne p1, v0, :cond_0

    sget p1, Lpz2/e;->S:I

    sget v0, Lpz2/e;->R:I

    goto :goto_0

    :cond_0
    sget v0, Lpz2/e;->N:I

    if-ne p1, v0, :cond_1

    sget p1, Lpz2/e;->M:I

    sget v0, Lpz2/e;->L:I

    goto :goto_0

    :cond_1
    sget v0, Lpz2/e;->d0:I

    if-ne p1, v0, :cond_2

    sget p1, Lpz2/e;->c0:I

    sget v0, Lpz2/e;->b0:I

    goto :goto_0

    :cond_2
    sget p1, Lpz2/e;->X:I

    sget v0, Lpz2/e;->Y:I

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public c(Lcom/whoop/service/network/model/cycles/Strain;)V
    .locals 5

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Strain;->getScore()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Strain;->getScorePercent()D

    move-result-wide v3

    double-to-float v3, v3

    if-nez v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lpz2/g;->k:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {v0, v1}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object v0

    :goto_0
    sget v1, Lpz2/e;->R:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_5

    sget v2, Lpz2/e;->h0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/whoop/ui/ProgressDial;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v3}, Lcom/whoop/ui/ProgressDial;->setProgress(F)V

    :cond_3
    sget v2, Lpz2/e;->i0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    sget v0, Lpz2/e;->j0:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lpz2/g;->i:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_1
    sget v0, Lpz2/e;->L:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    sget v1, Lpz2/e;->P:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Strain;->getKilocalories()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final d()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->y:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x8

    if-ge v3, v1, :cond_0

    aget v5, v0, v3

    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->z:[I

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    aget v3, v0, v2

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->isShown()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->E:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final e()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->y:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->E:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public f()V
    .locals 7

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->x:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v5, Ltz2/a;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Ltz2/a;-><init>(Lcom/whoop/whooplive/live/views/LiveOverlayView;I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->y:[I

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_3

    aget v3, v0, v2

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v4, Ltz2/a;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Ltz2/a;-><init>(Lcom/whoop/whooplive/live/views/LiveOverlayView;I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final getDisplays()[I
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->w:[I

    return-object v0
.end method

.method public final getHideList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/LiveOverlayView;->E:Ljava/util/ArrayList;

    return-object v0
.end method

.method public i(Lrz2/a;)V
    .locals 8

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/whooplive/live/views/LiveOverlayView$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget p1, Lvu1/a;->b:I

    sget v0, Lvu1/a;->B:I

    sget v1, Lpz2/e;->a0:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v1}, Lcom/whoop/ui/views/LiveHeartRateView;->k()V

    sget v1, Lvu1/a;->b:I

    sget v2, Lvu1/a;->B:I

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget p1, Lvu1/a;->O:I

    sget v0, Lvu1/a;->R:I

    sget v1, Lpz2/e;->a0:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v1}, Lcom/whoop/ui/views/LiveHeartRateView;->j()V

    sget v1, Lvu1/a;->u:I

    sget v2, Lvu1/a;->R:I

    goto :goto_0

    :cond_2
    sget p1, Lvu1/a;->O:I

    sget v0, Lvu1/a;->R:I

    sget v1, Lpz2/e;->a0:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v1}, Lcom/whoop/ui/views/LiveHeartRateView;->j()V

    sget v1, Lvu1/a;->u:I

    sget v2, Lvu1/a;->R:I

    sget v3, Lvu1/a;->b:I

    :goto_1
    sget v4, Lpz2/e;->R:I

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    sget v7, Lpz2/e;->i0:I

    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_3

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    sget v6, Lpz2/e;->j0:I

    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_4

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_4
    sget v4, Lpz2/e;->L:I

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    sget v5, Lpz2/e;->O:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_5

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_5
    sget v5, Lpz2/e;->P:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_6

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_6
    sget v1, Lpz2/e;->Q:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_7

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_7
    sget v1, Lpz2/e;->R:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    sget v3, Lpz2/e;->h0:I

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whoop/ui/ProgressDial;

    if-eqz v1, :cond_8

    invoke-virtual {v1, v2}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    :cond_8
    sget v1, Lpz2/e;->W:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplive/live/views/WhoopGraphView;

    if-eqz v1, :cond_9

    invoke-virtual {v1, p1, v0}, Lcom/whoop/whooplive/live/views/WhoopGraphView;->i(II)V

    :cond_9
    return-void
.end method

.method public onFinishInflate()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->f()V

    return-void
.end method
