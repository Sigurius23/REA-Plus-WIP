.class public final synthetic Ls40/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public synthetic constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls40/r;->w:I

    iput-object p2, p0, Ls40/r;->x:Lcom/stripe/android/view/CardMultilineWidget;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    sget-object p2, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iget p2, p0, Ls40/r;->w:I

    add-int/2addr p1, p2

    iget-object p2, p0, Ls40/r;->x:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object p2, p2, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    move-result p5

    invoke-virtual {p2, p3, p4, p1, p5}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method
