.class public abstract Lii0/c;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/ImageView;

.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/TextView;

.field public final e:Leq0/f2;

.field public final f:Landroid/widget/Button;

.field public final g:Landroid/widget/LinearLayout;

.field public final h:Landroid/widget/FrameLayout;

.field public final i:Landroid/widget/TextView;

.field public final j:Landroid/widget/LinearLayout;

.field public final k:Landroid/widget/TextView;

.field public final l:Lcom/whoop/ui/views/ConnectingAnimationView;

.field public final m:Landroid/widget/FrameLayout;

.field public final n:Landroid/widget/ViewFlipper;

.field public final o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

.field public final p:Landroid/widget/RelativeLayout;

.field public final q:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Leq0/f2;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/whoop/ui/views/ConnectingAnimationView;Landroid/widget/FrameLayout;Landroid/widget/ViewFlipper;Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;Landroid/widget/RelativeLayout;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/c;->a:Landroid/widget/FrameLayout;

    iput-object p5, p0, Lii0/c;->b:Landroid/widget/ImageView;

    iput-object p6, p0, Lii0/c;->c:Landroid/widget/ImageView;

    iput-object p7, p0, Lii0/c;->d:Landroid/widget/TextView;

    iput-object p8, p0, Lii0/c;->e:Leq0/f2;

    iput-object p9, p0, Lii0/c;->f:Landroid/widget/Button;

    iput-object p10, p0, Lii0/c;->g:Landroid/widget/LinearLayout;

    iput-object p11, p0, Lii0/c;->h:Landroid/widget/FrameLayout;

    iput-object p12, p0, Lii0/c;->i:Landroid/widget/TextView;

    iput-object p13, p0, Lii0/c;->j:Landroid/widget/LinearLayout;

    iput-object p14, p0, Lii0/c;->k:Landroid/widget/TextView;

    iput-object p15, p0, Lii0/c;->l:Lcom/whoop/ui/views/ConnectingAnimationView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lii0/c;->m:Landroid/widget/FrameLayout;

    move-object/from16 p1, p17

    iput-object p1, p0, Lii0/c;->n:Landroid/widget/ViewFlipper;

    move-object/from16 p1, p18

    iput-object p1, p0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    move-object/from16 p1, p19

    iput-object p1, p0, Lii0/c;->p:Landroid/widget/RelativeLayout;

    move-object/from16 p1, p20

    iput-object p1, p0, Lii0/c;->q:Landroid/widget/ImageView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Lii0/c;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lii0/c;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/c;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/c;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/c;

    return-object p0
.end method
