.class public final Lpj/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Landroid/graphics/Typeface;

.field public final synthetic F:Lp3/r;

.field public final synthetic w:F

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:J


# direct methods
.method public constructor <init>(FJIJLandroid/graphics/Typeface;Lp3/r;)V
    .locals 0

    iput p1, p0, Lpj/g;->w:F

    iput-wide p2, p0, Lpj/g;->x:J

    iput p4, p0, Lpj/g;->y:I

    iput-wide p5, p0, Lpj/g;->z:J

    iput-object p7, p0, Lpj/g;->E:Landroid/graphics/Typeface;

    iput-object p8, p0, Lpj/g;->F:Lp3/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget p1, p0, Lpj/g;->w:F

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-wide v1, p0, Lpj/g;->x:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    iget p1, p0, Lpj/g;->y:I

    invoke-virtual {v0, p1}, Landroid/view/View;->setTextAlignment(I)V

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLinksClickable(Z)V

    iget-wide v1, p0, Lpj/g;->z:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLinkTextColor(I)V

    iget-object p1, p0, Lpj/g;->E:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    iget-object v1, p0, Lpj/g;->F:Lp3/r;

    iget v1, v1, Lp3/r;->w:I

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    const-string v1, "create(textView.typeface\u2026fontWeight.weight, false)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-object v0
.end method
