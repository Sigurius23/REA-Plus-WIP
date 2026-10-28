.class public final Lyc1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroidx/cardview/widget/CardView;

.field public final b:Landroidx/compose/ui/platform/ComposeView;

.field public final c:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/cardview/widget/CardView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc1/c;->a:Landroidx/cardview/widget/CardView;

    iput-object p2, p0, Lyc1/c;->b:Landroidx/compose/ui/platform/ComposeView;

    iput-object p3, p0, Lyc1/c;->c:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lyc1/c;
    .locals 3

    sget v0, Lxc1/b;->e:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/platform/ComposeView;

    if-eqz v1, :cond_0

    sget v0, Lxc1/b;->i:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_0

    new-instance v0, Lyc1/c;

    check-cast p0, Landroidx/cardview/widget/CardView;

    invoke-direct {v0, p0, v1, v2}, Lyc1/c;-><init>(Landroidx/cardview/widget/CardView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;)V

    return-object v0

    :cond_0
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

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lyc1/c;
    .locals 2

    sget v0, Lxc1/c;->c:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lyc1/c;->a(Landroid/view/View;)Lyc1/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lyc1/c;->a:Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lyc1/c;->b()Landroidx/cardview/widget/CardView;

    move-result-object v0

    return-object v0
.end method
