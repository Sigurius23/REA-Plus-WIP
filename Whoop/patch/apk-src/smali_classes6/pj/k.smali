.class public final Lpj/k;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;J)V
    .locals 0

    iput-object p1, p0, Lpj/k;->w:Ljava/lang/String;

    iput-object p2, p0, Lpj/k;->x:Lkotlin/jvm/functions/Function1;

    iput-wide p3, p0, Lpj/k;->y:J

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lpj/k;->w:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lpj/k;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    const-string v0, "ds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    iget-wide v0, p0, Lpj/k;->y:J

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    return-void
.end method
