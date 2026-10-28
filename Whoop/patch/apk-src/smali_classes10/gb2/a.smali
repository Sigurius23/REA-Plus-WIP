.class public final Lgb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final c:Lcom/whoop/ui/WhoopNewToolbar;

.field public final d:Lcom/whoop/ui/views/ColoredImageView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final g:Lcom/whoop/ui/views/ColoredImageView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final j:Lcom/whoop/ui/views/ColoredImageView;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final m:Lcom/whoop/ui/views/ColoredImageView;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final p:Lcom/whoop/ui/views/ColoredImageView;

.field public final q:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final r:Lcom/whoop/ui/views/ColoredImageView;

.field public final s:Landroid/widget/TextView;

.field public final t:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/WhoopNewToolbar;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb2/a;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lgb2/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p3, p0, Lgb2/a;->c:Lcom/whoop/ui/WhoopNewToolbar;

    iput-object p4, p0, Lgb2/a;->d:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p5, p0, Lgb2/a;->e:Landroid/widget/TextView;

    iput-object p6, p0, Lgb2/a;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p7, p0, Lgb2/a;->g:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p8, p0, Lgb2/a;->h:Landroid/widget/TextView;

    iput-object p9, p0, Lgb2/a;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p10, p0, Lgb2/a;->j:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p11, p0, Lgb2/a;->k:Landroid/widget/TextView;

    iput-object p12, p0, Lgb2/a;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p13, p0, Lgb2/a;->m:Lcom/whoop/ui/views/ColoredImageView;

    iput-object p14, p0, Lgb2/a;->n:Landroid/widget/TextView;

    iput-object p15, p0, Lgb2/a;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 p1, p16

    iput-object p1, p0, Lgb2/a;->p:Lcom/whoop/ui/views/ColoredImageView;

    move-object/from16 p1, p17

    iput-object p1, p0, Lgb2/a;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 p1, p18

    iput-object p1, p0, Lgb2/a;->r:Lcom/whoop/ui/views/ColoredImageView;

    move-object/from16 p1, p19

    iput-object p1, p0, Lgb2/a;->s:Landroid/widget/TextView;

    move-object/from16 p1, p20

    iput-object p1, p0, Lgb2/a;->t:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public static a(Landroid/view/View;)Lgb2/a;
    .locals 21

    move-object/from16 v0, p0

    move-object v1, v0

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v2, Lea2/q;->a:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/whoop/ui/WhoopNewToolbar;

    if-eqz v3, :cond_0

    sget v2, Lea2/q;->G:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/whoop/ui/views/ColoredImageView;

    if-eqz v4, :cond_0

    sget v2, Lea2/q;->H:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v2, Lea2/q;->I:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v6, :cond_0

    sget v2, Lea2/q;->J:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/whoop/ui/views/ColoredImageView;

    if-eqz v7, :cond_0

    sget v2, Lea2/q;->K:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    sget v2, Lea2/q;->L:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v9, :cond_0

    sget v2, Lea2/q;->S:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/whoop/ui/views/ColoredImageView;

    if-eqz v10, :cond_0

    sget v2, Lea2/q;->T:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v2, Lea2/q;->U:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v12, :cond_0

    sget v2, Lea2/q;->e0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/whoop/ui/views/ColoredImageView;

    if-eqz v13, :cond_0

    sget v2, Lea2/q;->f0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v2, Lea2/q;->g0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v15, :cond_0

    sget v2, Lea2/q;->k0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lcom/whoop/ui/views/ColoredImageView;

    if-eqz v16, :cond_0

    sget v2, Lea2/q;->l0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v17, :cond_0

    sget v2, Lea2/q;->q0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v18

    check-cast v18, Lcom/whoop/ui/views/ColoredImageView;

    if-eqz v18, :cond_0

    sget v2, Lea2/q;->r0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v19

    check-cast v19, Landroid/widget/TextView;

    if-eqz v19, :cond_0

    sget v2, Lea2/q;->s0:I

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v20

    check-cast v20, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v20, :cond_0

    new-instance v0, Lgb2/a;

    move-object v2, v1

    invoke-direct/range {v0 .. v20}, Lgb2/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/WhoopNewToolbar;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/ui/views/ColoredImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;)V

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

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgb2/a;
    .locals 2

    sget v0, Lea2/r;->a:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lgb2/a;->a(Landroid/view/View;)Lgb2/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lgb2/a;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lgb2/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
