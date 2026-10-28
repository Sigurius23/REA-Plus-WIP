.class public final Lxn/c;
.super La9/a;
.source "SourceFile"

# interfaces
.implements Lxn/e;


# instance fields
.field public E:J

.field public final synthetic F:I

.field public G:Ljava/lang/Object;

.field public y:J

.field public z:Lxn/e;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lxn/c;->F:I

    const/4 v0, 0x3

    invoke-direct {p0, v0}, La9/a;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lxn/f;I)V
    .locals 0

    .line 2
    iput p2, p0, Lxn/c;->F:I

    const/4 p2, 0x3

    invoke-direct {p0, p2}, La9/a;-><init>(I)V

    iput-object p1, p0, Lxn/c;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(J)I
    .locals 3

    iget-object v0, p0, Lxn/c;->z:Lxn/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p0, Lxn/c;->E:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lxn/e;->b(J)I

    move-result p1

    return p1
.end method

.method public final d(J)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lxn/c;->z:Lxn/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p0, Lxn/c;->E:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lxn/e;->d(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h(I)J
    .locals 4

    iget-object v0, p0, Lxn/c;->z:Lxn/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1}, Lxn/e;->h(I)J

    move-result-wide v0

    iget-wide v2, p0, Lxn/c;->E:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lxn/c;->z:Lxn/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lxn/e;->j()I

    move-result v0

    return v0
.end method

.method public final o()V
    .locals 5

    iget v0, p0, Lxn/c;->F:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxn/c;->G:Ljava/lang/Object;

    check-cast v0, Lrm/p;

    iget-object v0, v0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lyn/h;

    const/4 v1, 0x0

    iput v1, p0, La9/a;->x:I

    const/4 v1, 0x0

    iput-object v1, p0, Lxn/c;->z:Lxn/e;

    iget-object v0, v0, Lyn/h;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lxn/c;->G:Ljava/lang/Object;

    check-cast v0, Lxn/d;

    iget-object v1, v0, Lxn/d;->b:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    iput v2, p0, La9/a;->x:I

    const/4 v2, 0x0

    iput-object v2, p0, Lxn/c;->z:Lxn/e;

    iget-object v2, v0, Lxn/d;->f:[Lxn/c;

    iget v3, v0, Lxn/d;->h:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Lxn/d;->h:I

    aput-object p0, v2, v3

    iget-object v2, v0, Lxn/d;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget v2, v0, Lxn/d;->h:I

    if-lez v2, :cond_0

    iget-object v0, v0, Lxn/d;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lxn/c;->G:Ljava/lang/Object;

    check-cast v0, Le73/b;

    iget-object v0, v0, Le73/b;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v1, v2, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    invoke-static {v1}, Llo/a;->i(Z)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->contains(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Llo/a;->e(Z)V

    iput v3, p0, La9/a;->x:I

    const/4 v1, 0x0

    iput-object v1, p0, Lxn/c;->z:Lxn/e;

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(JLxn/e;J)V
    .locals 2

    iput-wide p1, p0, Lxn/c;->y:J

    iput-object p3, p0, Lxn/c;->z:Lxn/e;

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p3, p4, v0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p4

    :goto_0
    iput-wide p1, p0, Lxn/c;->E:J

    return-void
.end method
