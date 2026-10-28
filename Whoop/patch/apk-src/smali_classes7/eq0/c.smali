.class public abstract Leq0/c;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/ImageView;

.field public final c:Landroidx/constraintlayout/widget/Guideline;

.field public final d:Landroidx/constraintlayout/widget/Guideline;

.field public final e:Landroidx/constraintlayout/widget/Guideline;

.field public final f:Landroid/widget/TextView;

.field public final g:Lcom/whoop/ui/WhoopEditText;

.field public final h:Leq0/f2;

.field public final i:Landroid/widget/LinearLayout;

.field public final j:Landroid/widget/TextView;

.field public final k:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final l:Landroid/view/View;

.field public final m:Landroid/view/View;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroid/widget/TextView;

.field public final p:Lcom/whoop/ui/WhoopToolbar;

.field public final q:Lcom/whoop/ui/WhoopToolbar;

.field public final r:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Lcom/whoop/ui/WhoopEditText;Leq0/f2;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillButton;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/ui/WhoopToolbar;Lcom/whoop/ui/WhoopToolbar;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p5, p0, Leq0/c;->b:Landroid/widget/ImageView;

    iput-object p6, p0, Leq0/c;->c:Landroidx/constraintlayout/widget/Guideline;

    iput-object p7, p0, Leq0/c;->d:Landroidx/constraintlayout/widget/Guideline;

    iput-object p8, p0, Leq0/c;->e:Landroidx/constraintlayout/widget/Guideline;

    iput-object p9, p0, Leq0/c;->f:Landroid/widget/TextView;

    iput-object p10, p0, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    iput-object p11, p0, Leq0/c;->h:Leq0/f2;

    iput-object p12, p0, Leq0/c;->i:Landroid/widget/LinearLayout;

    iput-object p13, p0, Leq0/c;->j:Landroid/widget/TextView;

    iput-object p14, p0, Leq0/c;->k:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p15, p0, Leq0/c;->l:Landroid/view/View;

    move-object/from16 p1, p16

    iput-object p1, p0, Leq0/c;->m:Landroid/view/View;

    move-object/from16 p1, p17

    iput-object p1, p0, Leq0/c;->n:Landroid/widget/TextView;

    move-object/from16 p1, p18

    iput-object p1, p0, Leq0/c;->o:Landroid/widget/TextView;

    move-object/from16 p1, p19

    iput-object p1, p0, Leq0/c;->p:Lcom/whoop/ui/WhoopToolbar;

    move-object/from16 p1, p20

    iput-object p1, p0, Leq0/c;->q:Lcom/whoop/ui/WhoopToolbar;

    move-object/from16 p1, p21

    iput-object p1, p0, Leq0/c;->r:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Leq0/c;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Leq0/c;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Leq0/c;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Leq0/c;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/c;

    return-object p0
.end method
