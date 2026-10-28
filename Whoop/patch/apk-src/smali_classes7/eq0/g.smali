.class public abstract Leq0/g;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroidx/constraintlayout/widget/Guideline;

.field public final e:Landroidx/constraintlayout/widget/Guideline;

.field public final f:Landroidx/constraintlayout/widget/Guideline;

.field public final g:Landroidx/constraintlayout/widget/Guideline;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/TextView;

.field public final j:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final k:Lcom/whoop/ui/WhoopEditText;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/ImageView;

.field public final n:Landroid/widget/ScrollView;

.field public final o:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final p:Landroid/widget/TextView;

.field public final q:Lcom/whoop/ui/WhoopToolbar;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillButton;Lcom/whoop/ui/WhoopEditText;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ScrollView;Lcom/whoop/ui/pills/StrokedPillButton;Landroid/widget/TextView;Lcom/whoop/ui/WhoopToolbar;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/g;->a:Landroid/widget/ImageView;

    iput-object p5, p0, Leq0/g;->b:Landroid/widget/TextView;

    iput-object p6, p0, Leq0/g;->c:Landroid/widget/TextView;

    iput-object p7, p0, Leq0/g;->d:Landroidx/constraintlayout/widget/Guideline;

    iput-object p8, p0, Leq0/g;->e:Landroidx/constraintlayout/widget/Guideline;

    iput-object p9, p0, Leq0/g;->f:Landroidx/constraintlayout/widget/Guideline;

    iput-object p10, p0, Leq0/g;->g:Landroidx/constraintlayout/widget/Guideline;

    iput-object p11, p0, Leq0/g;->h:Landroid/widget/TextView;

    iput-object p12, p0, Leq0/g;->i:Landroid/widget/TextView;

    iput-object p13, p0, Leq0/g;->j:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p14, p0, Leq0/g;->k:Lcom/whoop/ui/WhoopEditText;

    iput-object p15, p0, Leq0/g;->l:Landroid/widget/TextView;

    move-object/from16 p1, p16

    iput-object p1, p0, Leq0/g;->m:Landroid/widget/ImageView;

    move-object/from16 p1, p17

    iput-object p1, p0, Leq0/g;->n:Landroid/widget/ScrollView;

    move-object/from16 p1, p18

    iput-object p1, p0, Leq0/g;->o:Lcom/whoop/ui/pills/StrokedPillButton;

    move-object/from16 p1, p19

    iput-object p1, p0, Leq0/g;->p:Landroid/widget/TextView;

    move-object/from16 p1, p20

    iput-object p1, p0, Leq0/g;->q:Lcom/whoop/ui/WhoopToolbar;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Leq0/g;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Leq0/g;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Leq0/g;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Leq0/g;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->f:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/g;

    return-object p0
.end method
