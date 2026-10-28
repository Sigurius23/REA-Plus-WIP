.class final Lcom/whoop/ui/ThrobberView$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/ThrobberView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000fR\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/ui/ThrobberView$a;",
        "",
        "Lcom/whoop/ui/ThrobberView;",
        "target",
        "<init>",
        "(Lcom/whoop/ui/ThrobberView;)V",
        "",
        "scale",
        "",
        "duration",
        "a",
        "(FJ)Lcom/whoop/ui/ThrobberView$a;",
        "Landroid/animation/AnimatorSet;",
        "b",
        "()Landroid/animation/AnimatorSet;",
        "Lcom/whoop/ui/ThrobberView;",
        "Ljava/util/LinkedList;",
        "Landroid/animation/Animator;",
        "Ljava/util/LinkedList;",
        "animators",
        "c",
        "F",
        "prevScale",
        "legacy_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/ui/ThrobberView;

.field private final b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field private c:F


# direct methods
.method public constructor <init>(Lcom/whoop/ui/ThrobberView;)V
    .locals 1

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/ThrobberView$a;->a:Lcom/whoop/ui/ThrobberView;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ThrobberView$a;->b:Ljava/util/LinkedList;

    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result p1

    iput p1, p0, Lcom/whoop/ui/ThrobberView$a;->c:F

    return-void
.end method


# virtual methods
.method public final a(FJ)Lcom/whoop/ui/ThrobberView$a;
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/ThrobberView$a;->b:Ljava/util/LinkedList;

    iget-object v1, p0, Lcom/whoop/ui/ThrobberView$a;->a:Lcom/whoop/ui/ThrobberView;

    iget v2, p0, Lcom/whoop/ui/ThrobberView$a;->c:F

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v2, v3, v4

    const/4 v2, 0x1

    aput p1, v3, v2

    const-string v2, "scale"

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iput p1, p0, Lcom/whoop/ui/ThrobberView$a;->c:F

    return-object p0
.end method

.method public final b()Landroid/animation/AnimatorSet;
    .locals 2

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iget-object v1, p0, Lcom/whoop/ui/ThrobberView$a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playSequentially(Ljava/util/List;)V

    return-object v0
.end method
