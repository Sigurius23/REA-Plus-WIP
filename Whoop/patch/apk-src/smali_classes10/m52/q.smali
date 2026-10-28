.class public abstract Lm52/q;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Landroidx/constraintlayout/widget/Guideline;

.field public final c:Landroidx/constraintlayout/widget/Guideline;

.field public final d:Landroidx/constraintlayout/widget/Guideline;

.field public final e:Landroidx/constraintlayout/widget/Guideline;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/FrameLayout;

.field public final i:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final j:Lcom/whoop/realtime/presentation/views/RealTimeCell;

.field public final k:Lcom/whoop/realtime/presentation/views/RealTimeCell;

.field public final l:Lcom/whoop/realtime/presentation/views/RealTimeCell;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/LinearLayout;

.field public final o:Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;

.field public final p:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeCell;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lm52/q;->a:Landroid/widget/TextView;

    iput-object p5, p0, Lm52/q;->b:Landroidx/constraintlayout/widget/Guideline;

    iput-object p6, p0, Lm52/q;->c:Landroidx/constraintlayout/widget/Guideline;

    iput-object p7, p0, Lm52/q;->d:Landroidx/constraintlayout/widget/Guideline;

    iput-object p8, p0, Lm52/q;->e:Landroidx/constraintlayout/widget/Guideline;

    iput-object p9, p0, Lm52/q;->f:Landroid/widget/TextView;

    iput-object p10, p0, Lm52/q;->g:Landroid/widget/TextView;

    iput-object p11, p0, Lm52/q;->h:Landroid/widget/FrameLayout;

    iput-object p12, p0, Lm52/q;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p13, p0, Lm52/q;->j:Lcom/whoop/realtime/presentation/views/RealTimeCell;

    iput-object p14, p0, Lm52/q;->k:Lcom/whoop/realtime/presentation/views/RealTimeCell;

    iput-object p15, p0, Lm52/q;->l:Lcom/whoop/realtime/presentation/views/RealTimeCell;

    move-object/from16 p1, p16

    iput-object p1, p0, Lm52/q;->m:Landroid/widget/TextView;

    move-object/from16 p1, p17

    iput-object p1, p0, Lm52/q;->n:Landroid/widget/LinearLayout;

    move-object/from16 p1, p18

    iput-object p1, p0, Lm52/q;->o:Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;

    move-object/from16 p1, p19

    iput-object p1, p0, Lm52/q;->p:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/q;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lm52/q;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lm52/q;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lm52/q;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lk52/e;->k:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lm52/q;

    return-object p0
.end method
