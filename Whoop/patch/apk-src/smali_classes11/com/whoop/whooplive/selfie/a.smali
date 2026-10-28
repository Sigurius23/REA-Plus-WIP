.class Lcom/whoop/whooplive/selfie/a;
.super Lfc/a;
.source "SourceFile"


# instance fields
.field private c:Landroid/view/LayoutInflater;

.field private d:[Ljava/lang/String;

.field private e:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLandroid/view/View$OnClickListener;)V
    .locals 1

    invoke-direct {p0}, Lfc/a;-><init>()V

    if-eqz p2, :cond_0

    sget p2, Lpz2/a;->a:I

    goto :goto_0

    :cond_0
    sget p2, Lpz2/a;->b:I

    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplive/selfie/a;->d:[Ljava/lang/String;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/a;->c:Landroid/view/LayoutInflater;

    iput-object p3, p0, Lcom/whoop/whooplive/selfie/a;->e:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/a;->d:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/a;->c:Landroid/view/LayoutInflater;

    sget v1, Lpz2/f;->b:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/a;->d:[Ljava/lang/String;

    aget-object p2, v1, p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/a;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public i(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
