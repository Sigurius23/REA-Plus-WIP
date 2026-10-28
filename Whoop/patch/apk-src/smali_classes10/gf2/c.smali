.class public abstract Lgf2/c;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/Guideline;

.field public final b:Landroidx/constraintlayout/widget/Guideline;

.field public final c:Lgf2/q;

.field public final d:Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;

.field public final e:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;

.field public final i:Landroid/view/View;

.field public final j:Landroid/widget/TextView;

.field public final k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Lgf2/q;Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lgf2/c;->a:Landroidx/constraintlayout/widget/Guideline;

    iput-object p5, p0, Lgf2/c;->b:Landroidx/constraintlayout/widget/Guideline;

    iput-object p6, p0, Lgf2/c;->c:Lgf2/q;

    iput-object p7, p0, Lgf2/c;->d:Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;

    iput-object p8, p0, Lgf2/c;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p9, p0, Lgf2/c;->f:Landroid/widget/TextView;

    iput-object p10, p0, Lgf2/c;->g:Landroid/widget/TextView;

    iput-object p11, p0, Lgf2/c;->h:Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;

    iput-object p12, p0, Lgf2/c;->i:Landroid/view/View;

    iput-object p13, p0, Lgf2/c;->j:Landroid/widget/TextView;

    iput-object p14, p0, Lgf2/c;->k:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Lgf2/c;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lgf2/c;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lgf2/c;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lgf2/c;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lqe2/f;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lgf2/c;

    return-object p0
.end method
