.class public final synthetic Lc6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc6/e;


# direct methods
.method public synthetic constructor <init>(Lc6/e;I)V
    .locals 0

    iput p2, p0, Lc6/d;->w:I

    iput-object p1, p0, Lc6/d;->x:Lc6/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lc6/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc6/d;->x:Lc6/e;

    iget-object v0, v0, Lc6/e;->d:Lal0/f;

    invoke-virtual {v0}, Lal0/f;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/e0;

    invoke-static {v1}, Loe3/c;->a(Lne3/e0;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    iget-object v0, v1, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OkioStorage requires absolute paths, but did not get an absolute path from producePath = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", instead got "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v0, p0, Lc6/d;->x:Lc6/e;

    sget-object v1, Lc6/e;->g:Lkr/e;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lc6/e;->f:Ljava/util/LinkedHashSet;

    iget-object v0, v0, Lc6/e;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne3/e0;

    iget-object v0, v0, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
