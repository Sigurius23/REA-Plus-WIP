.class public final Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$a;,
        Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;,
        Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 *2\u00020\u0001:\u0002+,B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;",
        "Landroid/widget/LinearLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;",
        "value",
        "w",
        "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;",
        "getState",
        "()Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;",
        "setState",
        "(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V",
        "state",
        "x",
        "I",
        "position",
        "",
        "y",
        "Ljava/lang/String;",
        "rangeText",
        "Lm52/w;",
        "z",
        "Lm52/w;",
        "binding",
        "Landroid/graphics/drawable/Drawable;",
        "E",
        "Landroid/graphics/drawable/Drawable;",
        "barDrawable",
        "Landroid/widget/ImageView;",
        "F",
        "Landroid/widget/ImageView;",
        "barView",
        "Landroid/widget/TextView;",
        "G",
        "Landroid/widget/TextView;",
        "percentRange",
        "H",
        "a",
        "b",
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
.field public static final H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$a;

.field public static final I:I


# instance fields
.field private final E:Landroid/graphics/drawable/Drawable;

.field private final F:Landroid/widget/ImageView;

.field private final G:Landroid/widget/TextView;

.field private w:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

.field private x:I

.field private y:Ljava/lang/String;

.field private final z:Lm52/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->H:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->I:I

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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget-object p3, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;->NYR:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    iput-object p3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->w:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    const/4 p3, 0x1

    .line 4
    iput p3, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->x:I

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p0, p3}, Lm52/w;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/w;

    move-result-object v0

    const-string v1, "inflate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->z:Lm52/w;

    .line 6
    iget-object v1, v0, Lm52/w;->a:Landroid/widget/ImageView;

    const-string v2, "viewRtstrainRangeBar"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->F:Landroid/widget/ImageView;

    .line 7
    iget-object v0, v0, Lm52/w;->b:Landroid/widget/TextView;

    const-string v2, "viewRtstrainRangePercent"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->G:Landroid/widget/TextView;

    if-eqz p2, :cond_0

    .line 8
    sget-object v2, Lvu1/j;->Y:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 9
    sget p2, Lvu1/j;->Z:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->x:I

    .line 10
    sget p2, Lvu1/j;->a0:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->y:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 12
    :cond_0
    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 13
    iget p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->x:I

    const-string p2, "getDrawable(...)"

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p3, 0x2

    if-eq p1, p3, :cond_1

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lk52/c;->m:I

    invoke-virtual {p1, p3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lk52/c;->l:I

    invoke-virtual {p1, p3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lk52/c;->m:I

    invoke-virtual {p1, p3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lk52/c;->n:I

    invoke-virtual {p1, p3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    :goto_0
    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    .line 19
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->y:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getState()Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->w:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    return-object v0
.end method

.method public final setState(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->w:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;

    sget-object v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lvu1/a;->v:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->F:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lvu1/a;->v:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lvu1/a;->c:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->F:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lvu1/a;->c:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lvu1/a;->b:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->F:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lvu1/a;->b:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
