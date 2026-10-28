.class Lcom/whoop/whooplive/selfie/SelfieActivity$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field A:Landroid/widget/ViewFlipper;

.field B:Landroid/view/View;

.field C:Landroid/view/View;

.field D:Landroid/view/View;

.field E:Landroid/view/View;

.field F:Landroid/view/View;

.field G:Landroid/widget/ImageView;

.field H:Landroid/view/View;

.field I:Landroid/view/View;

.field J:Lcom/whoop/ui/ProgressDial;

.field K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

.field L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

.field M:Landroid/widget/ImageView;

.field N:Landroid/view/View;

.field O:Landroid/widget/ImageView;

.field P:Landroid/view/View;

.field Q:Landroid/view/View;

.field R:Landroid/widget/ImageView;

.field S:Landroid/widget/TextView;

.field a:Lcom/whoop/whooplive/selfie/camera/CameraView;

.field b:Landroid/widget/TextView;

.field c:Lcom/whoop/whooplive/live/views/AspectLetterboxView;

.field d:Landroidx/viewpager/widget/ViewPager;

.field e:Landroid/view/View;

.field f:Landroid/view/View;

.field g:Landroid/view/View;

.field h:Landroid/view/View;

.field i:Landroid/widget/ViewFlipper;

.field j:Landroid/view/View;

.field k:Landroid/view/View;

.field l:Landroid/view/View;

.field m:Landroid/widget/ViewFlipper;

.field n:Landroid/view/View;

.field o:Landroid/view/View;

.field p:Landroid/view/View;

.field q:Landroid/view/View;

.field r:Landroid/view/View;

.field s:Landroid/widget/TextView;

.field t:Lcom/whoop/whooplive/selfie/OverlayView;

.field u:Landroid/view/View;

.field v:Landroid/view/View;

.field w:Landroid/view/View;

.field x:Landroid/view/View;

.field y:Landroid/widget/ImageView;

.field z:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lpz2/e;->h:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/selfie/camera/CameraView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    sget v0, Lpz2/e;->i:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->b:Landroid/widget/TextView;

    sget v0, Lpz2/e;->e:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->c:Lcom/whoop/whooplive/live/views/AspectLetterboxView;

    sget v0, Lpz2/e;->x:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    sget v0, Lpz2/e;->H:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->e:Landroid/view/View;

    sget v0, Lpz2/e;->k:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->f:Landroid/view/View;

    sget v0, Lpz2/e;->u:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->g:Landroid/view/View;

    sget v0, Lpz2/e;->y:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->h:Landroid/view/View;

    sget v0, Lpz2/e;->b:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->i:Landroid/widget/ViewFlipper;

    sget v0, Lpz2/e;->d:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->j:Landroid/view/View;

    sget v0, Lpz2/e;->c:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->k:Landroid/view/View;

    sget v0, Lpz2/e;->C:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->l:Landroid/view/View;

    sget v0, Lpz2/e;->p:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->m:Landroid/widget/ViewFlipper;

    sget v0, Lpz2/e;->r:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->n:Landroid/view/View;

    sget v0, Lpz2/e;->q:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->o:Landroid/view/View;

    sget v0, Lpz2/e;->z:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->p:Landroid/view/View;

    sget v0, Lpz2/e;->l:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->q:Landroid/view/View;

    sget v0, Lpz2/e;->v:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->r:Landroid/view/View;

    sget v0, Lpz2/e;->w:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->s:Landroid/widget/TextView;

    sget v0, Lpz2/e;->n0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/selfie/OverlayView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    sget v0, Lpz2/e;->o0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->u:Landroid/view/View;

    sget v0, Lpz2/e;->B0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->v:Landroid/view/View;

    sget v0, Lpz2/e;->t0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->w:Landroid/view/View;

    sget v0, Lpz2/e;->x0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->x:Landroid/view/View;

    sget v0, Lpz2/e;->F:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->y:Landroid/widget/ImageView;

    sget v0, Lpz2/e;->j:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->z:Landroid/view/View;

    sget v0, Lpz2/e;->m:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->A:Landroid/widget/ViewFlipper;

    sget v0, Lpz2/e;->o:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->B:Landroid/view/View;

    sget v0, Lpz2/e;->n:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->C:Landroid/view/View;

    sget v0, Lpz2/e;->a:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->D:Landroid/view/View;

    sget v0, Lpz2/e;->A:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->E:Landroid/view/View;

    sget v0, Lpz2/e;->B:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->F:Landroid/view/View;

    sget v0, Lpz2/e;->f:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->G:Landroid/widget/ImageView;

    sget v0, Lpz2/e;->g:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->H:Landroid/view/View;

    sget v0, Lpz2/e;->D:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->I:Landroid/view/View;

    sget v0, Lpz2/e;->E:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDial;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->J:Lcom/whoop/ui/ProgressDial;

    sget v0, Lpz2/e;->s:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->K:Lcom/whoop/whooplive/live/views/WhoopPlaybackView;

    sget v0, Lpz2/e;->t:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->L:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    sget v0, Lpz2/e;->e0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->M:Landroid/widget/ImageView;

    sget v0, Lpz2/e;->f0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->N:Landroid/view/View;

    sget v0, Lpz2/e;->k0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->O:Landroid/widget/ImageView;

    sget v0, Lpz2/e;->I:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->P:Landroid/view/View;

    sget v0, Lpz2/e;->J:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->Q:Landroid/view/View;

    sget v0, Lpz2/e;->g0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->R:Landroid/widget/ImageView;

    sget v0, Lpz2/e;->K:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->S:Landroid/widget/TextView;

    return-void
.end method
