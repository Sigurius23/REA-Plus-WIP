.class public final Ll83/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll83/h;
.implements Ljava/io/Serializable;


# instance fields
.field public w:Lc93/a;

.field public volatile x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll83/p;->w:Lc93/a;

    sget-object p1, Ll83/x;->a:Ll83/x;

    iput-object p1, p0, Ll83/p;->x:Ljava/lang/Object;

    iput-object p0, p0, Ll83/p;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-object v0, p0, Ll83/p;->x:Ljava/lang/Object;

    sget-object v1, Ll83/x;->a:Ll83/x;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll83/p;->x:Ljava/lang/Object;

    sget-object v1, Ll83/x;->a:Ll83/x;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll83/p;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Ll83/p;->x:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll83/p;->w:Lc93/a;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ll83/p;->x:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Ll83/p;->w:Lc93/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ll83/p;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    return-object v0
.end method
