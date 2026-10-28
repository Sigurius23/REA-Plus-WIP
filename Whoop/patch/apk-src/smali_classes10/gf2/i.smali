.class public final Lgf2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/ImageView;

.field public final j:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final k:Landroid/widget/ProgressBar;

.field public final l:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final o:Landroid/widget/TextView;

.field public final p:Landroid/widget/ImageView;

.field public final q:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ProgressBar;Lcom/whoop/ui/pills/StrokedPillButton;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf2/i;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lgf2/i;->b:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lgf2/i;->c:Landroid/widget/TextView;

    iput-object p4, p0, Lgf2/i;->d:Landroid/widget/TextView;

    iput-object p5, p0, Lgf2/i;->e:Landroid/widget/ImageView;

    iput-object p6, p0, Lgf2/i;->f:Landroid/widget/TextView;

    iput-object p7, p0, Lgf2/i;->g:Landroid/widget/TextView;

    iput-object p8, p0, Lgf2/i;->h:Landroid/widget/TextView;

    iput-object p9, p0, Lgf2/i;->i:Landroid/widget/ImageView;

    iput-object p10, p0, Lgf2/i;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p11, p0, Lgf2/i;->k:Landroid/widget/ProgressBar;

    iput-object p12, p0, Lgf2/i;->l:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p13, p0, Lgf2/i;->m:Landroid/widget/TextView;

    iput-object p14, p0, Lgf2/i;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p15, p0, Lgf2/i;->o:Landroid/widget/TextView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lgf2/i;->p:Landroid/widget/ImageView;

    move-object/from16 p1, p17

    iput-object p1, p0, Lgf2/i;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public static a(Landroid/view/View;)Lgf2/i;
    .locals 18

    move-object/from16 v0, p0

    move-object v1, v0

    check-cast v1, Landroid/widget/FrameLayout;

    sget v2, Lqe2/e;->b:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    sget v2, Lqe2/e;->c:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v2, Lqe2/e;->d:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v2, Lqe2/e;->t:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v2, Lqe2/e;->F:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v2, Lqe2/e;->G:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    sget v2, Lqe2/e;->H:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    sget v2, Lqe2/e;->I:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v10, :cond_0

    sget v2, Lqe2/e;->D0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/ProgressBar;

    if-eqz v11, :cond_0

    sget v2, Lqe2/e;->T0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/whoop/ui/pills/StrokedPillButton;

    if-eqz v12, :cond_0

    sget v2, Lqe2/e;->X0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    if-eqz v13, :cond_0

    sget v2, Lqe2/e;->Z0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v14, :cond_0

    sget v2, Lqe2/e;->a1:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    sget v2, Lqe2/e;->t1:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/ImageView;

    if-eqz v16, :cond_0

    sget v2, Lqe2/e;->u1:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v17, :cond_0

    new-instance v0, Lgf2/i;

    move-object v2, v1

    invoke-direct/range {v0 .. v17}, Lgf2/i;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ProgressBar;Lcom/whoop/ui/pills/StrokedPillButton;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/i;
    .locals 2

    sget v0, Lqe2/f;->h:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lgf2/i;->a(Landroid/view/View;)Lgf2/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lgf2/i;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lgf2/i;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method
