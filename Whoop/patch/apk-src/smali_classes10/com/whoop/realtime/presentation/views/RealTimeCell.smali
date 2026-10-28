.class public final Lcom/whoop/realtime/presentation/views/RealTimeCell;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\r\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010$\u001a\u00020\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008#\u0010 R$\u0010*\u001a\u00020%2\u0006\u0010$\u001a\u00020%8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R$\u0010-\u001a\u00020%2\u0006\u0010$\u001a\u00020%8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008+\u0010\'\"\u0004\u0008,\u0010)\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/views/RealTimeCell;",
        "Landroid/widget/LinearLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroid/content/res/TypedArray;",
        "arr",
        "Ll83/a0;",
        "a",
        "(Landroid/content/res/TypedArray;)V",
        "b",
        "c",
        "d",
        "Lm52/u;",
        "w",
        "Lm52/u;",
        "binding",
        "Landroid/widget/ImageView;",
        "x",
        "Landroid/widget/ImageView;",
        "getIcon",
        "()Landroid/widget/ImageView;",
        "icon",
        "Landroid/widget/TextView;",
        "y",
        "Landroid/widget/TextView;",
        "getLabel",
        "()Landroid/widget/TextView;",
        "label",
        "z",
        "getValue",
        "value",
        "",
        "getValueText",
        "()Ljava/lang/CharSequence;",
        "setValueText",
        "(Ljava/lang/CharSequence;)V",
        "valueText",
        "getLabelText",
        "setLabelText",
        "labelText",
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


# instance fields
.field private final w:Lm52/u;

.field private final x:Landroid/widget/ImageView;

.field private final y:Landroid/widget/TextView;

.field private final z:Landroid/widget/TextView;


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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/realtime/presentation/views/RealTimeCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    const/4 v0, 0x1

    invoke-static {p3, p0, v0}, Lm52/u;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/u;

    move-result-object p3

    const-string v0, "inflate(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->w:Lm52/u;

    .line 4
    iget-object v0, p3, Lm52/u;->a:Lcom/whoop/ui/views/ColoredImageView;

    const-string v1, "viewRealtimeCellIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->x:Landroid/widget/ImageView;

    .line 5
    iget-object v0, p3, Lm52/u;->b:Landroid/widget/TextView;

    const-string v1, "viewRealtimeCellLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->y:Landroid/widget/TextView;

    .line 6
    iget-object p3, p3, Lm52/u;->c:Landroid/widget/TextView;

    const-string v0, "viewRealtimeCellValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->z:Landroid/widget/TextView;

    .line 7
    sget-object p3, Lk52/h;->a:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeCell;->a(Landroid/content/res/TypedArray;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/RealTimeCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final a(Landroid/content/res/TypedArray;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeCell;->b(Landroid/content/res/TypedArray;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeCell;->c(Landroid/content/res/TypedArray;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/RealTimeCell;->d(Landroid/content/res/TypedArray;)V

    return-void
.end method

.method private final b(Landroid/content/res/TypedArray;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lk52/h;->b:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    sget v1, Lk52/h;->d:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lk52/h;->d:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_0
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->x:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    sget v0, Lk52/h;->c:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->x:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    sget v1, Lk52/h;->c:I

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    sget v1, Lk52/h;->e:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_2

    sget v1, Lk52/h;->e:I

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_2
    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->x:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    return-void
.end method

.method private final c(Landroid/content/res/TypedArray;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->y:Landroid/widget/TextView;

    sget v1, Lk52/h;->g:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Lk52/h;->f:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->y:Landroid/widget/TextView;

    sget v1, Lk52/h;->f:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method private final d(Landroid/content/res/TypedArray;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->z:Landroid/widget/TextView;

    sget v1, Lk52/h;->i:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Lk52/h;->h:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->z:Landroid/widget/TextView;

    sget v1, Lk52/h;->h:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getIcon()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->x:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getLabel()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->y:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getLabelText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->z:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getValueText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->z:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final setLabelText(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->y:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setValueText(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/RealTimeCell;->z:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
