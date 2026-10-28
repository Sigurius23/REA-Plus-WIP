.class public final Lfi/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public E:Z

.field public final w:Landroid/widget/ImageView;

.field public x:Lfi/r;

.field public y:Lbc3/c2;

.field public z:Lfi/s;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi/t;->w:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfi/t;->y:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lbc3/e1;->w:Lbc3/e1;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v2

    new-instance v3, La13/h;

    const/16 v4, 0xc

    invoke-direct {v3, p0, v1, v4}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x2

    invoke-static {v0, v2, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lfi/t;->y:Lbc3/c2;

    iput-object v1, p0, Lfi/t;->x:Lfi/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lfi/t;->z:Lfi/s;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lfi/t;->E:Z

    iget-object v0, p1, Lfi/s;->w:Lrh/t;

    iget-object p1, p1, Lfi/s;->x:Lfi/i;

    invoke-virtual {v0, p1}, Lrh/t;->a(Lfi/i;)Lfi/c;

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lfi/t;->z:Lfi/s;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lfi/s;->c()V

    :cond_0
    return-void
.end method
