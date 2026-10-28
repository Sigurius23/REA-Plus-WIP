.class Lcom/whoop/ui/WhoopZoomageView$b;
.super Lcom/whoop/ui/WhoopZoomageView$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/WhoopZoomageView;->f(Landroid/graphics/Matrix;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/graphics/Matrix;

.field final synthetic c:Lcom/whoop/ui/WhoopZoomageView;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/WhoopZoomageView;Landroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$b;->c:Lcom/whoop/ui/WhoopZoomageView;

    iput-object p2, p0, Lcom/whoop/ui/WhoopZoomageView$b;->b:Landroid/graphics/Matrix;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/WhoopZoomageView$g;-><init>(Lcom/whoop/ui/WhoopZoomageView;I)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$b;->c:Lcom/whoop/ui/WhoopZoomageView;

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView$b;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method
