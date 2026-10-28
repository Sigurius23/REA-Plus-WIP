.class Lcom/whoop/ui/views/LiveHeartRateView$e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/LiveHeartRateView$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field final a:Landroid/animation/Animator;

.field final b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/animation/Animator;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$c;->a:Landroid/animation/Animator;

    iput-object p2, p0, Lcom/whoop/ui/views/LiveHeartRateView$e$c;->b:Landroid/view/View;

    return-void
.end method
