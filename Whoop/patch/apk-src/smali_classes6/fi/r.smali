.class public final Lfi/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfi/c;


# instance fields
.field public final w:Landroid/widget/ImageView;

.field public volatile x:Lbc3/j0;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lbc3/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi/r;->w:Landroid/widget/ImageView;

    iput-object p2, p0, Lfi/r;->x:Lbc3/j0;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    invoke-virtual {p0}, Lfi/r;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lfi/r;->w:Landroid/widget/ImageView;

    invoke-static {v0}, Lv8/b;->B(Landroid/widget/ImageView;)Lfi/t;

    move-result-object v0

    invoke-virtual {v0}, Lfi/t;->a()V

    return-void
.end method

.method public final g()Lbc3/i0;
    .locals 1

    iget-object v0, p0, Lfi/r;->x:Lbc3/j0;

    return-object v0
.end method

.method public final isDisposed()Z
    .locals 2

    iget-object v0, p0, Lfi/r;->w:Landroid/widget/ImageView;

    invoke-static {v0}, Lv8/b;->B(Landroid/widget/ImageView;)Lfi/t;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lfi/t;->x:Lfi/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq p0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
