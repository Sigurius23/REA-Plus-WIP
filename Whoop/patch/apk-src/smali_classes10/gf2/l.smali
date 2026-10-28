.class public final Lgf2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroidx/fragment/app/FragmentContainerView;

.field public final c:Landroidx/fragment/app/FragmentContainerView;

.field public final d:Landroidx/constraintlayout/widget/Guideline;

.field public final e:Landroidx/constraintlayout/widget/Guideline;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/ImageView;

.field public final i:Landroid/widget/FrameLayout;

.field public final j:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final k:Landroidx/fragment/app/FragmentContainerView;

.field public final l:Landroidx/fragment/app/FragmentContainerView;

.field public final m:Landroidx/fragment/app/FragmentContainerView;

.field public final n:Landroidx/fragment/app/FragmentContainerView;

.field public final o:Landroidx/fragment/app/FragmentContainerView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf2/l;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lgf2/l;->b:Landroidx/fragment/app/FragmentContainerView;

    iput-object p3, p0, Lgf2/l;->c:Landroidx/fragment/app/FragmentContainerView;

    iput-object p4, p0, Lgf2/l;->d:Landroidx/constraintlayout/widget/Guideline;

    iput-object p5, p0, Lgf2/l;->e:Landroidx/constraintlayout/widget/Guideline;

    iput-object p6, p0, Lgf2/l;->f:Landroid/widget/TextView;

    iput-object p7, p0, Lgf2/l;->g:Landroid/widget/TextView;

    iput-object p8, p0, Lgf2/l;->h:Landroid/widget/ImageView;

    iput-object p9, p0, Lgf2/l;->i:Landroid/widget/FrameLayout;

    iput-object p10, p0, Lgf2/l;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p11, p0, Lgf2/l;->k:Landroidx/fragment/app/FragmentContainerView;

    iput-object p12, p0, Lgf2/l;->l:Landroidx/fragment/app/FragmentContainerView;

    iput-object p13, p0, Lgf2/l;->m:Landroidx/fragment/app/FragmentContainerView;

    iput-object p14, p0, Lgf2/l;->n:Landroidx/fragment/app/FragmentContainerView;

    iput-object p15, p0, Lgf2/l;->o:Landroidx/fragment/app/FragmentContainerView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lgf2/l;
    .locals 19

    move-object/from16 v0, p0

    sget v1, Lqe2/e;->f:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v5, :cond_0

    sget v1, Lqe2/e;->x:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v6, :cond_0

    sget v1, Lqe2/e;->Q:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v7, :cond_0

    sget v1, Lqe2/e;->S:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v8, :cond_0

    sget v1, Lqe2/e;->q0:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    sget v1, Lqe2/e;->r0:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    sget v1, Lqe2/e;->s0:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/ImageView;

    if-eqz v11, :cond_0

    sget v1, Lqe2/e;->z0:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/FrameLayout;

    if-eqz v12, :cond_0

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v1, Lqe2/e;->Y0:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v14, :cond_0

    sget v1, Lqe2/e;->E1:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v15, :cond_0

    sget v1, Lqe2/e;->F1:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v16, :cond_0

    sget v1, Lqe2/e;->P1:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v17, :cond_0

    sget v1, Lqe2/e;->Y1:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v18, :cond_0

    new-instance v3, Lgf2/l;

    move-object v13, v4

    invoke-direct/range {v3 .. v18}, Lgf2/l;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static c(Landroid/view/LayoutInflater;)Lgf2/l;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lgf2/l;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/l;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/l;
    .locals 2

    sget v0, Lqe2/f;->k:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lgf2/l;->a(Landroid/view/View;)Lgf2/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lgf2/l;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lgf2/l;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
