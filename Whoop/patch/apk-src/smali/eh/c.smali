.class public final Leh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Leh/b;

.field public x:Z

.field public final synthetic y:Leh/e;


# direct methods
.method public constructor <init>(Leh/e;Leh/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/c;->y:Leh/e;

    iput-object p2, p0, Leh/c;->w:Leh/b;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-boolean v0, p0, Leh/c;->x:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Leh/c;->x:Z

    iget-object v0, p0, Leh/c;->y:Leh/e;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Leh/c;->w:Leh/b;

    iget v2, v1, Leh/b;->h:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Leh/b;->h:I

    if-nez v2, :cond_0

    iget-boolean v2, v1, Leh/b;->f:Z

    if-eqz v2, :cond_0

    sget-object v2, Leh/e;->Q:Lyb3/p;

    invoke-virtual {v0, v1}, Leh/e;->T(Leh/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1

    :cond_1
    return-void
.end method
