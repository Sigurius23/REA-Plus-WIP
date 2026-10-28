.class public final Lyr/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/i;
.implements Ljava/io/Serializable;


# instance fields
.field public final transient w:Ljava/lang/Object;

.field public final x:Lyr/i;

.field public volatile transient y:Z

.field public transient z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyr/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyr/j;->w:Ljava/lang/Object;

    iput-object p1, p0, Lyr/j;->x:Lyr/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lyr/j;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lyr/j;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lyr/j;->y:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lyr/j;->x:Lyr/i;

    invoke-interface {v1}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lyr/j;->z:Ljava/lang/Object;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lyr/j;->y:Z

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    goto :goto_1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_1
    iget-object v0, p0, Lyr/j;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Suppliers.memoize("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lyr/j;->y:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<supplier that returned "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lyr/j;->z:Ljava/lang/Object;

    const-string v3, ">"

    invoke-static {v1, v3, v2}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lyr/j;->x:Lyr/i;

    :goto_0
    const-string v2, ")"

    invoke-static {v0, v2, v1}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
