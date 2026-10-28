.class public final Lh5/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;Lh5/d1;Lio/sentry/internal/debugmeta/c;Landroid/animation/ValueAnimator;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh5/w0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/w0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lh5/w0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lh5/w0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lh5/w0;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq30/u0;Lr/e;Lr/n;Lr/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh5/w0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/w0;->E:Ljava/lang/Object;

    iput-object p2, p0, Lh5/w0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lh5/w0;->y:Ljava/lang/Object;

    iput-object p4, p0, Lh5/w0;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lh5/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh5/w0;->E:Ljava/lang/Object;

    check-cast v0, Lq30/u0;

    iget-object v0, v0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lr/f;

    iget-object v1, p0, Lh5/w0;->y:Ljava/lang/Object;

    check-cast v1, Lr/n;

    iget-object v2, p0, Lh5/w0;->x:Ljava/lang/Object;

    check-cast v2, Lr/e;

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    iput-boolean v3, v0, Lr/f;->Z:Z

    iget-object v2, v2, Lr/e;->b:Lr/l;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lr/l;->d(Z)V

    iput-boolean v3, v0, Lr/f;->Z:Z

    :cond_0
    invoke-virtual {v1}, Lr/n;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lr/n;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh5/w0;->z:Ljava/lang/Object;

    check-cast v0, Lr/l;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lr/l;->r(Landroid/view/MenuItem;Lr/x;I)Z

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lh5/w0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lh5/w0;->y:Ljava/lang/Object;

    check-cast v1, Lh5/d1;

    iget-object v2, p0, Lh5/w0;->z:Ljava/lang/Object;

    check-cast v2, Lio/sentry/internal/debugmeta/c;

    invoke-static {v0, v1, v2}, Lh5/y0;->h(Landroid/view/View;Lh5/d1;Lio/sentry/internal/debugmeta/c;)V

    iget-object v0, p0, Lh5/w0;->E:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
