.class public final Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J7\u0010#\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010%\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008%\u0010\u000eR\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0011\u0010,\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lcom/whoop/ui/views/a;",
        "viewState",
        "Ll83/a0;",
        "setPuffinChargingStateVisibility",
        "(Lcom/whoop/ui/views/a;)V",
        "setStandardChargingStateVisibility",
        "batteryPercent",
        "q",
        "(I)V",
        "p",
        "m",
        "()V",
        "Lkn2/c;",
        "strapGeneration",
        "r",
        "(Lkn2/c;)V",
        "o",
        "l",
        "k",
        "",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "j",
        "Lii0/k0;",
        "w",
        "Lii0/k0;",
        "binding",
        "getBatteryLevel",
        "()I",
        "batteryLevel",
        "app_prodStandardRelease"
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
.field private w:Lii0/k0;


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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    .line 4
    invoke-static {p2, p0, p3}, Lii0/k0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/k0;

    move-result-object p2

    const-string p3, "inflate(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    .line 5
    invoke-static {p1}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    .line 6
    sget p2, Lhi0/i;->j:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->l(Ljava/lang/Integer;)Lcom/bumptech/glide/f;

    move-result-object p1

    const/high16 p2, -0x80000000

    .line 7
    invoke-virtual {p1, p2, p2}, Lpl/a;->i(II)Lpl/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/f;

    .line 8
    iget-object p2, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p2, p2, Lii0/k0;->h:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

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

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/ui/views/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->n(Lcom/whoop/ui/views/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final k()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v1, v1, Lii0/k0;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    add-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v1, v0

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->b:Lio/github/florent37/shapeofview/shapes/BubbleView;

    invoke-virtual {v0, v1}, Lio/github/florent37/shapeofview/shapes/BubbleView;->setPositionPer(F)V

    return-void
.end method

.method private final l()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->b:Lio/github/florent37/shapeofview/shapes/BubbleView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final m()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->j:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->g:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private static final n(Lcom/whoop/ui/views/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/whoop/ui/views/a;->e()Lyg2/f;

    move-result-object p0

    sget p2, Lyg2/f;->e:I

    invoke-static {p0, p1, p2}, Los0/e;->e(Lyg2/f;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final o()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->b:Lio/github/florent37/shapeofview/shapes/BubbleView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final p(Lcom/whoop/ui/views/a;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->j:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->c()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v0

    sget-object v2, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PENGUIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    const/16 v3, 0x8

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p1, p1, Lii0/k0;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p1, p1, Lii0/k0;->j:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p1, p1, Lii0/k0;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p1, p1, Lii0/k0;->j:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private final q(I)V
    .locals 2

    sget-object v0, Lcom/whoop/ui/views/b;->Companion:Lcom/whoop/ui/views/b$a;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/b$a;->a(I)Lcom/whoop/ui/views/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/ui/views/b;->getColorResId()I

    move-result v0

    invoke-static {v1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v1, v1, Lii0/k0;->f:Landroid/widget/ProgressBar;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    if-ltz p1, :cond_0

    const/16 v0, 0x65

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->e:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p1, p1, Lii0/k0;->e:Landroid/widget/TextView;

    sget v0, Lhi0/j;->D:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object p1, p1, Lii0/k0;->f:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method

.method private final r(Lkn2/c;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->k:Landroid/widget/TextView;

    const-string v1, "batteryIndicatorStrapGeneration"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkn2/c;->DISCONNECTED:Lkn2/c;

    const/4 v2, 0x0

    if-eq p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lkn2/c;->getTextResId()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lkn2/c;->getTextResId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    return-void
.end method

.method private final setPuffinChargingStateVisibility(Lcom/whoop/ui/views/a;)V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->g:Landroidx/compose/ui/platform/ComposeView;

    const-string v1, "batteryIndicatorPuffinContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->i()Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->h:Landroid/widget/ImageView;

    const-string v2, "batteryIndicatorStrapChargingAnimation"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->j:Landroid/widget/ImageView;

    const-string v2, "batteryIndicatorStrapChargingImage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->g:Landroidx/compose/ui/platform/ComposeView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkk1/b;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lx1/b;

    const v3, -0x1905c52a

    invoke-direct {p1, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v0, p1}, Ld91/b;->c(Landroidx/compose/ui/platform/ComposeView;Lc93/m;)V

    :cond_2
    return-void
.end method

.method private final setStandardChargingStateVisibility(Lcom/whoop/ui/views/a;)V
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->p(Lcom/whoop/ui/views/a;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->m()V

    return-void
.end method


# virtual methods
.method public final getBatteryLevel()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->w:Lii0/k0;

    iget-object v0, v0, Lii0/k0;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    return v0
.end method

.method public final j(Lcom/whoop/ui/views/a;)V
    .locals 2

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->q(I)V

    invoke-direct {p0}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->m()V

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->c()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v0

    sget-object v1, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->setPuffinChargingStateVisibility(Lcom/whoop/ui/views/a;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->setStandardChargingStateVisibility(Lcom/whoop/ui/views/a;)V

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->o()V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->l()V

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/ui/views/a;->h()Lkn2/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->r(Lkn2/c;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V

    invoke-direct {p0}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->k()V

    return-void
.end method
