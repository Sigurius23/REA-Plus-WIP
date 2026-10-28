.class public final Lof1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/FrameLayout;

.field public final d:Lcom/whoop/ui/ProgressBar;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/FrameLayout;Lcom/whoop/ui/ProgressBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof1/a;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lof1/a;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lof1/a;->c:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lof1/a;->d:Lcom/whoop/ui/ProgressBar;

    return-void
.end method

.method public static a(Landroid/view/View;)Lof1/a;
    .locals 4

    sget v0, Lnf1/d;->l:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Landroid/widget/FrameLayout;

    sget v2, Lnf1/d;->n:I

    invoke-static {p0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/whoop/ui/ProgressBar;

    if-eqz v3, :cond_0

    new-instance p0, Lof1/a;

    invoke-direct {p0, v0, v1, v0, v3}, Lof1/a;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/FrameLayout;Lcom/whoop/ui/ProgressBar;)V

    return-object p0

    :cond_0
    move v0, v2

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lof1/a;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lof1/a;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method
