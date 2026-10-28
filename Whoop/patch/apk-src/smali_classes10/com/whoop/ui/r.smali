.class public Lcom/whoop/ui/r;
.super Landroid/widget/Toast;
.source "SourceFile"


# instance fields
.field private a:Lcom/whoop/ui/WhoopToastView;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lnf1/f;->b:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/WhoopToastView;

    iput-object p1, p0, Lcom/whoop/ui/r;->a:Lcom/whoop/ui/WhoopToastView;

    invoke-virtual {p0, p1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    return-void
.end method

.method public static b(Landroid/content/Context;II)Lcom/whoop/ui/r;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/r;->c(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/whoop/ui/r;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/whoop/ui/r;
    .locals 1

    new-instance v0, Lcom/whoop/ui/r;

    invoke-direct {v0, p0}, Lcom/whoop/ui/r;-><init>(Landroid/content/Context;)V

    iget-object p0, v0, Lcom/whoop/ui/r;->a:Lcom/whoop/ui/WhoopToastView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/widget/Toast;->setDuration(I)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/whoop/ui/WhoopToastView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/r;->a:Lcom/whoop/ui/WhoopToastView;

    return-object v0
.end method

.method public bridge synthetic getView()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/ui/r;->a()Lcom/whoop/ui/WhoopToastView;

    move-result-object v0

    return-object v0
.end method
