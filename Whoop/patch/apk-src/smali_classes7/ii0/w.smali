.class public abstract Lii0/w;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroidx/constraintlayout/widget/Group;

.field public final d:Landroidx/constraintlayout/widget/Guideline;

.field public final e:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final h:Landroid/widget/TextView;

.field public final i:Lcom/airbnb/lottie/LottieAnimationView;

.field public final j:Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;

.field public final k:Landroid/widget/ImageView;

.field public final l:Landroid/widget/ImageView;

.field public final m:Landroid/widget/ImageView;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroidx/appcompat/widget/SwitchCompat;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroid/widget/TextView;

.field public final r:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lcom/airbnb/lottie/LottieAnimationView;Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/appcompat/widget/SwitchCompat;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/w;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p5, p0, Lii0/w;->b:Landroid/widget/LinearLayout;

    iput-object p6, p0, Lii0/w;->c:Landroidx/constraintlayout/widget/Group;

    iput-object p7, p0, Lii0/w;->d:Landroidx/constraintlayout/widget/Guideline;

    iput-object p8, p0, Lii0/w;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p9, p0, Lii0/w;->f:Landroid/widget/ImageView;

    iput-object p10, p0, Lii0/w;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p11, p0, Lii0/w;->h:Landroid/widget/TextView;

    iput-object p12, p0, Lii0/w;->i:Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p13, p0, Lii0/w;->j:Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;

    iput-object p14, p0, Lii0/w;->k:Landroid/widget/ImageView;

    iput-object p15, p0, Lii0/w;->l:Landroid/widget/ImageView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lii0/w;->m:Landroid/widget/ImageView;

    move-object/from16 p1, p17

    iput-object p1, p0, Lii0/w;->n:Landroid/widget/TextView;

    move-object/from16 p1, p18

    iput-object p1, p0, Lii0/w;->o:Landroidx/appcompat/widget/SwitchCompat;

    move-object/from16 p1, p19

    iput-object p1, p0, Lii0/w;->p:Landroid/widget/TextView;

    move-object/from16 p1, p20

    iput-object p1, p0, Lii0/w;->q:Landroid/widget/TextView;

    move-object/from16 p1, p21

    iput-object p1, p0, Lii0/w;->r:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/w;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lii0/w;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/w;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/w;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->m:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/w;

    return-object p0
.end method
