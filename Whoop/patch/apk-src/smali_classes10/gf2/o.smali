.class public final Lgf2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroidx/core/widget/NestedScrollView;

.field public final b:Landroidx/constraintlayout/widget/Guideline;

.field public final c:Landroidx/constraintlayout/widget/Guideline;

.field public final d:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final e:Lgf2/s;

.field public final f:Landroidx/constraintlayout/widget/Guideline;


# direct methods
.method private constructor <init>(Landroidx/core/widget/NestedScrollView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Lcom/whoop/ui/pills/StrokedPillButton;Lgf2/s;Landroidx/constraintlayout/widget/Guideline;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf2/o;->a:Landroidx/core/widget/NestedScrollView;

    iput-object p2, p0, Lgf2/o;->b:Landroidx/constraintlayout/widget/Guideline;

    iput-object p3, p0, Lgf2/o;->c:Landroidx/constraintlayout/widget/Guideline;

    iput-object p4, p0, Lgf2/o;->d:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p5, p0, Lgf2/o;->e:Lgf2/s;

    iput-object p6, p0, Lgf2/o;->f:Landroidx/constraintlayout/widget/Guideline;

    return-void
.end method

.method public static a(Landroid/view/View;)Lgf2/o;
    .locals 9

    sget v0, Lqe2/e;->s:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v4, :cond_0

    sget v0, Lqe2/e;->E:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v5, :cond_0

    sget v0, Lqe2/e;->V0:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/whoop/ui/pills/StrokedPillButton;

    if-eqz v6, :cond_0

    sget v0, Lqe2/e;->h1:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lgf2/s;->c(Landroid/view/View;)Lgf2/s;

    move-result-object v7

    sget v0, Lqe2/e;->r1:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v8, :cond_0

    new-instance v2, Lgf2/o;

    move-object v3, p0

    check-cast v3, Landroidx/core/widget/NestedScrollView;

    invoke-direct/range {v2 .. v8}, Lgf2/o;-><init>(Landroidx/core/widget/NestedScrollView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Lcom/whoop/ui/pills/StrokedPillButton;Lgf2/s;Landroidx/constraintlayout/widget/Guideline;)V

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

.method public static c(Landroid/view/LayoutInflater;)Lgf2/o;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lgf2/o;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/o;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/o;
    .locals 2

    sget v0, Lqe2/f;->n:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lgf2/o;->a(Landroid/view/View;)Lgf2/o;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lgf2/o;->a:Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lgf2/o;->b()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    return-object v0
.end method
