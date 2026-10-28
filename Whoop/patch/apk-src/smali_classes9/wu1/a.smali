.class public final Lwu1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Lcom/whoop/ui/pills/StrokedPillFrameLayout;

.field public final e:Landroid/widget/TextView;

.field public final f:Lcom/whoop/ui/pills/StrokedPillFrameLayout;

.field public final g:Landroid/widget/TextView;

.field public final h:Lcom/whoop/ui/pills/StrokedPillFrameLayout;

.field public final i:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillFrameLayout;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillFrameLayout;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillFrameLayout;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu1/a;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lwu1/a;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lwu1/a;->c:Landroid/widget/TextView;

    iput-object p4, p0, Lwu1/a;->d:Lcom/whoop/ui/pills/StrokedPillFrameLayout;

    iput-object p5, p0, Lwu1/a;->e:Landroid/widget/TextView;

    iput-object p6, p0, Lwu1/a;->f:Lcom/whoop/ui/pills/StrokedPillFrameLayout;

    iput-object p7, p0, Lwu1/a;->g:Landroid/widget/TextView;

    iput-object p8, p0, Lwu1/a;->h:Lcom/whoop/ui/pills/StrokedPillFrameLayout;

    iput-object p9, p0, Lwu1/a;->i:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lwu1/a;
    .locals 12

    sget v0, Lvu1/e;->y:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, Lvu1/e;->z:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v0, Lvu1/e;->A:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/whoop/ui/pills/StrokedPillFrameLayout;

    if-eqz v6, :cond_0

    sget v0, Lvu1/e;->B:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v0, Lvu1/e;->C:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/whoop/ui/pills/StrokedPillFrameLayout;

    if-eqz v8, :cond_0

    sget v0, Lvu1/e;->D:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    sget v0, Lvu1/e;->E:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/whoop/ui/pills/StrokedPillFrameLayout;

    if-eqz v10, :cond_0

    sget v0, Lvu1/e;->F:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    new-instance v2, Lwu1/a;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v11}, Lwu1/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillFrameLayout;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillFrameLayout;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillFrameLayout;Landroid/widget/TextView;)V

    return-object v2

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

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lwu1/a;
    .locals 2

    sget v0, Lvu1/g;->d:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lwu1/a;->a(Landroid/view/View;)Lwu1/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lwu1/a;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lwu1/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
