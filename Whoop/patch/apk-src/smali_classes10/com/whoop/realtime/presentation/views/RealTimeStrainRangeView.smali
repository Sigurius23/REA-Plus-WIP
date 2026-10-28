.class public final Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cR*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u0018R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u0018R\u0014\u0010\'\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u0018R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0018\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "d",
        "()V",
        "c",
        "value",
        "w",
        "I",
        "getStrainPercent",
        "()I",
        "setStrainPercent",
        "(I)V",
        "strainPercent",
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;",
        "x",
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;",
        "currentSegment",
        "Lm52/s;",
        "y",
        "Lm52/s;",
        "binding",
        "Landroid/widget/ImageView;",
        "z",
        "Landroid/widget/ImageView;",
        "indicatorView",
        "E",
        "fiftyPercentRange",
        "F",
        "sixtyPercentRange",
        "G",
        "seventyPercentRange",
        "H",
        "eightyPercentRange",
        "ninetyPercentRange",
        "J",
        "a",
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


# static fields
.field public static final J:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView$a;

.field public static final K:I

.field private static final L:Li93/j;

.field private static final M:Li93/j;

.field private static final N:Li93/j;

.field private static final O:Li93/j;

.field private static final P:Li93/j;


# instance fields
.field private final E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field private final F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field private final G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field private final H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field private final I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field private w:I

.field private x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field private final y:Lm52/s;

.field private final z:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->J:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->K:I

    const/16 v0, 0x32

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    sput-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->L:Li93/j;

    const/16 v0, 0x46

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    sput-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->M:Li93/j;

    const/16 v1, 0x50

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    sput-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->N:Li93/j;

    const/16 v0, 0x5a

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    sput-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->O:Li93/j;

    const/16 v1, 0x64

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    sput-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->P:Li93/j;

    return-void
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Lm52/s;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/s;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->y:Lm52/s;

    .line 4
    iget-object p2, p1, Lm52/s;->c:Landroid/widget/ImageView;

    const-string p3, "viewRealTimeStrainRangeIndicator"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->z:Landroid/widget/ImageView;

    .line 5
    iget-object p2, p1, Lm52/s;->b:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    const-string p3, "viewRealTimeStrainRangeFifty"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    .line 6
    iget-object p2, p1, Lm52/s;->f:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    const-string p3, "viewRealTimeStrainRangeSixty"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    .line 7
    iget-object p2, p1, Lm52/s;->e:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    const-string p3, "viewRealTimeStrainRangeSeventy"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    .line 8
    iget-object p2, p1, Lm52/s;->a:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    const-string p3, "viewRealTimeStrainRangeEighty"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    .line 9
    iget-object p1, p1, Lm52/s;->d:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    const-string p2, "viewRealTimeStrainRangeNinety"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

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

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->b(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;)V

    return-void
.end method

.method private static final b(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->d()V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->c()V

    return-void
.end method

.method private final c()V
    .locals 3

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->w:I

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    iget v2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->w:I

    rem-int/lit8 v2, v2, 0xa

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->z:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationX(F)V

    :cond_1
    return-void
.end method

.method private final d()V
    .locals 3

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->w:I

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->L:Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v0, v1, :cond_0

    if-gt v2, v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->ACTIVE:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->NYR:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    return-void

    :cond_0
    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->M:Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v0, v1, :cond_1

    if-gt v2, v0, :cond_1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->PREV:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->ACTIVE:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->NYR:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    return-void

    :cond_1
    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->N:Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v0, v1, :cond_2

    if-gt v2, v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->PREV:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->ACTIVE:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->NYR:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    return-void

    :cond_2
    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->O:Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v0, v1, :cond_3

    if-gt v2, v0, :cond_3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->PREV:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->ACTIVE:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->NYR:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    return-void

    :cond_3
    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->P:Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v0, v1, :cond_4

    if-gt v2, v0, :cond_4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->PREV:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->ACTIVE:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->E:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->x:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    sget-object v1, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->NYR:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->F:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->G:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->I:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V

    return-void
.end method


# virtual methods
.method public final getStrainPercent()I
    .locals 1

    iget v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->w:I

    return v0
.end method

.method public final setStrainPercent(I)V
    .locals 2

    iput p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->w:I

    invoke-static {}, Lse/b;->J()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Llr/e;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
