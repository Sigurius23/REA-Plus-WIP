.class Lcom/whoop/whooplive/selfie/OverlayView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/OverlayView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Lcom/whoop/ui/ProgressDialLayout;

.field c:Landroid/widget/TextView;

.field d:Lcom/whoop/ui/ProgressDialLayout;

.field e:Landroid/widget/TextView;

.field f:Lcom/whoop/ui/ProgressDialLayout;

.field g:Landroid/widget/TextView;

.field h:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

.field i:Lcom/whoop/ui/ProgressDialLayout;

.field j:Landroid/widget/TextView;

.field k:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

.field l:Lcom/whoop/ui/ProgressDialLayout;

.field m:Landroid/widget/TextView;

.field n:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

.field o:Lcom/whoop/ui/ProgressDialLayout;

.field p:Landroid/widget/TextView;

.field q:Lcom/whoop/whooplive/live/views/LiveOverlayView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lpz2/e;->o0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->a:Landroid/view/View;

    sget v0, Lpz2/e;->C0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->b:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lpz2/e;->E0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->c:Landroid/widget/TextView;

    sget v0, Lpz2/e;->u0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->d:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lpz2/e;->w0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->e:Landroid/widget/TextView;

    sget v0, Lpz2/e;->y0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->f:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lpz2/e;->A0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->g:Landroid/widget/TextView;

    sget v0, Lpz2/e;->r0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->h:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    sget v0, Lpz2/e;->B0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->i:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lpz2/e;->D0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->j:Landroid/widget/TextView;

    sget v0, Lpz2/e;->p0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->k:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    sget v0, Lpz2/e;->t0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->l:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lpz2/e;->v0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->m:Landroid/widget/TextView;

    sget v0, Lpz2/e;->q0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->n:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    sget v0, Lpz2/e;->x0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->o:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lpz2/e;->z0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->p:Landroid/widget/TextView;

    sget v0, Lpz2/e;->s0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplive/live/views/LiveOverlayView;

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    return-void
.end method
