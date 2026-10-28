.class public final Lth/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final w:Lth/b;

.field public x:Z

.field public final synthetic y:Lth/e;


# direct methods
.method public constructor <init>(Lth/e;Lth/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth/c;->y:Lth/e;

    iput-object p2, p0, Lth/c;->w:Lth/b;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lth/c;->x:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lth/c;->x:Z

    iget-object v0, p0, Lth/c;->y:Lth/e;

    iget-object v1, v0, Lth/e;->H:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lth/c;->w:Lth/b;

    iget v3, v2, Lth/b;->h:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v2, Lth/b;->h:I

    if-nez v3, :cond_0

    iget-boolean v3, v2, Lth/b;->f:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Lth/e;->T(Lth/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw v0

    :cond_1
    return-void
.end method
