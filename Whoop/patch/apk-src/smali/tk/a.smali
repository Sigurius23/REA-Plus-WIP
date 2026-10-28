.class public final Ltk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:Ltk/d;


# direct methods
.method public constructor <init>(Ltk/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk/a;->w:Ltk/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltk/a;->w:Ltk/d;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltk/a;->w:Ltk/d;

    iget-object v2, v1, Ltk/d;->I:Ljava/io/BufferedWriter;

    if-nez v2, :cond_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ltk/d;->x0()V

    iget-object v1, p0, Ltk/a;->w:Ltk/d;

    invoke-virtual {v1}, Ltk/d;->x()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ltk/a;->w:Ltk/d;

    invoke-virtual {v1}, Ltk/d;->o0()V

    iget-object v1, p0, Ltk/a;->w:Ltk/d;

    const/4 v2, 0x0

    iput v2, v1, Ltk/d;->K:I

    :cond_1
    monitor-exit v0

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
