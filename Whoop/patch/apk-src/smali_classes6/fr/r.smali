.class public final Lfr/r;
.super Lb3/b;
.source "SourceFile"


# static fields
.field public static final j:Lbc/b;


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public final e:Lh8/a;

.field public final f:Lfr/u;

.field public g:I

.field public h:Z

.field public i:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbc/b;

    const-string v1, "animationFraction"

    const/16 v2, 0xa

    const-class v3, Ljava/lang/Float;

    invoke-direct {v0, v3, v1, v2}, Lbc/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lfr/r;->j:Lbc/b;

    return-void
.end method

.method public constructor <init>(Lfr/u;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lb3/b;-><init>(I)V

    const/4 v0, 0x1

    iput v0, p0, Lfr/r;->g:I

    iput-object p1, p0, Lfr/r;->f:Lfr/u;

    new-instance p1, Lh8/a;

    invoke-direct {p1, v0}, Lh8/a;-><init>(I)V

    iput-object p1, p0, Lfr/r;->e:Lh8/a;

    return-void
.end method


# virtual methods
.method public final D(Lfr/c;)V
    .locals 0

    return-void
.end method

.method public final E()V
    .locals 0

    return-void
.end method

.method public final I()V
    .locals 3

    iget-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sget-object v1, Lfr/r;->j:Lbc/b;

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x14d

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    new-instance v1, Lar/d;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    invoke-virtual {p0}, Lfr/r;->L()V

    iget-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final K()V
    .locals 0

    return-void
.end method

.method public final L()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfr/r;->h:Z

    iput v0, p0, Lfr/r;->g:I

    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfr/n;

    iget-object v2, p0, Lfr/r;->f:Lfr/u;

    iget-object v3, v2, Lfr/e;->c:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    iput v3, v1, Lfr/n;->c:I

    iget v2, v2, Lfr/e;->g:I

    div-int/lit8 v2, v2, 0x2

    iput v2, v1, Lfr/n;->d:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lfr/r;->d:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 0

    invoke-virtual {p0}, Lfr/r;->L()V

    return-void
.end method
