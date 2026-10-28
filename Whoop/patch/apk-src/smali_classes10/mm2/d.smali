.class public Lmm2/d;
.super Llx/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmm2/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llx/a;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llx/a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic L(Llx/d;Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lmm2/d$a;

    check-cast p2, Lmm2/c;

    invoke-virtual {p0, p1, p2, p3}, Lmm2/d;->c0(Lmm2/d$a;Lmm2/c;I)V

    return-void
.end method

.method public bridge synthetic M(Landroid/view/ViewGroup;I)Llx/d;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmm2/d;->d0(Landroid/view/ViewGroup;I)Lmm2/d$a;

    move-result-object p1

    return-object p1
.end method

.method public c0(Lmm2/d$a;Lmm2/c;I)V
    .locals 2

    iget p3, p2, Lmm2/c;->b:I

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    const/4 v0, 0x4

    if-eq p3, v0, :cond_2

    const/16 v0, 0x8

    if-eq p3, v0, :cond_1

    const/16 v0, 0x10

    if-eq p3, v0, :cond_0

    sget p3, Lhi0/c;->d:I

    goto :goto_0

    :cond_0
    sget p3, Lhi0/c;->b:I

    goto :goto_0

    :cond_1
    sget p3, Lhi0/c;->e:I

    goto :goto_0

    :cond_2
    sget p3, Lhi0/c;->c:I

    goto :goto_0

    :cond_3
    sget p3, Lhi0/c;->a:I

    :goto_0
    iget-object v0, p1, Lmm2/d$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p3}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p1, Lmm2/d$a;->a:Landroid/widget/TextView;

    iget-object p2, p2, Lmm2/c;->a:Ljava/lang/String;

    sget-object p3, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method

.method public d0(Landroid/view/ViewGroup;I)Lmm2/d$a;
    .locals 1

    new-instance p2, Lmm2/d$a;

    sget v0, Lhi0/f;->p:I

    invoke-virtual {p0, p1, v0}, Lmx/c;->z(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Lmm2/d$a;-><init>(Landroid/view/View;)V

    return-object p2
.end method
