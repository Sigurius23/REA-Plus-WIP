.class public final La3/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v0, 0x1

    iput v0, p0, La3/l1;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lwe/o;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(IZ)V

    iput-object v0, p0, La3/l1;->i:Ljava/lang/Object;

    .line 14
    new-instance v0, Lol/c;

    invoke-direct {v0}, Lol/c;-><init>()V

    iput-object v0, p0, La3/l1;->j:Ljava/lang/Object;

    .line 15
    new-instance v0, Lg5/f;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg5/f;-><init>(I)V

    new-instance v1, Ljc/a;

    const/16 v2, 0x1a

    .line 16
    invoke-direct {v1, v2}, Ljc/a;-><init>(I)V

    .line 17
    new-instance v2, Ljc/b;

    const/16 v3, 0x1a

    .line 18
    invoke-direct {v2, v3}, Ljc/b;-><init>(I)V

    .line 19
    new-instance v3, Ls/m2;

    invoke-direct {v3, v0, v1, v2}, Ls/m2;-><init>(Lg5/f;Lul/a;Ljc/b;)V

    .line 20
    iput-object v3, p0, La3/l1;->k:Ljava/lang/Object;

    .line 21
    new-instance v0, Lwe/o;

    .line 22
    new-instance v1, Ldl/z;

    invoke-direct {v1, v3}, Ldl/z;-><init>(Ls/m2;)V

    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v2, Laj/c;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Laj/c;-><init>(IB)V

    iput-object v2, v0, Lwe/o;->x:Ljava/lang/Object;

    .line 25
    iput-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    .line 26
    iput-object v0, p0, La3/l1;->b:Ljava/lang/Object;

    .line 27
    new-instance v0, Lol/b;

    invoke-direct {v0}, Lol/b;-><init>()V

    iput-object v0, p0, La3/l1;->c:Ljava/lang/Object;

    .line 28
    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(I)V

    iput-object v0, p0, La3/l1;->d:Ljava/lang/Object;

    .line 29
    new-instance v1, Lio/sentry/e2;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lio/sentry/e2;-><init>(I)V

    iput-object v1, p0, La3/l1;->e:Ljava/lang/Object;

    .line 30
    new-instance v1, Lxk/h;

    invoke-direct {v1}, Lxk/h;-><init>()V

    iput-object v1, p0, La3/l1;->f:Ljava/lang/Object;

    .line 31
    new-instance v1, Lkotlin/jvm/internal/k0;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iput-object v1, p0, La3/l1;->g:Ljava/lang/Object;

    .line 32
    new-instance v1, Lij/n;

    invoke-direct {v1}, Lij/n;-><init>()V

    iput-object v1, p0, La3/l1;->h:Ljava/lang/Object;

    .line 33
    const-string v1, "Gif"

    const-string v2, "Bitmap"

    const-string v3, "BitmapDrawable"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    .line 34
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x0

    .line 37
    const-string v3, "legacy_prepend_all"

    invoke-virtual {v2, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 38
    const-string v1, "legacy_append"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    monitor-enter v0

    .line 40
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 41
    iget-object v3, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 42
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 43
    iget-object v5, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 45
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 46
    iget-object v4, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 47
    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public constructor <init>(La3/n0;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, La3/l1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/l1;->b:Ljava/lang/Object;

    .line 2
    new-instance v0, La3/k1;

    .line 3
    invoke-direct {v0}, Lb2/v;-><init>()V

    const/4 v1, -0x1

    .line 4
    iput v1, v0, Lb2/v;->z:I

    .line 5
    iput-object v0, p0, La3/l1;->c:Ljava/lang/Object;

    .line 6
    new-instance v0, Landroidx/compose/ui/node/a;

    invoke-direct {v0, p1}, Landroidx/compose/ui/node/a;-><init>(La3/n0;)V

    iput-object v0, p0, La3/l1;->d:Ljava/lang/Object;

    .line 7
    iput-object v0, p0, La3/l1;->e:Ljava/lang/Object;

    .line 8
    iget-object p1, v0, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iput-object p1, p0, La3/l1;->f:Ljava/lang/Object;

    .line 9
    iput-object p1, p0, La3/l1;->g:Ljava/lang/Object;

    .line 10
    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v0, v0, [Landroidx/compose/ui/Modifier;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 11
    iput-object p1, p0, La3/l1;->j:Ljava/lang/Object;

    return-void
.end method

.method public static final a(La3/l1;Lb2/v;Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1

    iget-object p1, p1, Lb2/v;->E:Lb2/v;

    :goto_0
    if-eqz p1, :cond_3

    iget-object v0, p0, La3/l1;->c:Ljava/lang/Object;

    check-cast v0, La3/k1;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La3/l1;->b:Ljava/lang/Object;

    check-cast p1, La3/n0;

    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->d:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/node/a;

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p2, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object p2, p0, La3/l1;->e:Ljava/lang/Object;

    return-void

    :cond_1
    iget v0, p1, Lb2/v;->y:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, p2}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    iget-object p1, p1, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public static f(Lb2/u;Lb2/v;)Lb2/v;
    .locals 2

    instance-of v0, p0, La3/h1;

    if-eqz v0, :cond_0

    check-cast p0, La3/h1;

    invoke-virtual {p0}, La3/h1;->create()Lb2/v;

    move-result-object p0

    invoke-static {p0}, La3/r1;->f(Lb2/v;)I

    move-result v0

    iput v0, p0, Lb2/v;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, La3/d;

    invoke-direct {v0}, Lb2/v;-><init>()V

    invoke-static {p0}, La3/r1;->d(Lb2/u;)I

    move-result v1

    iput v1, v0, Lb2/v;->y:I

    iput-object p0, v0, La3/d;->O:Lb2/u;

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    iput-object p0, v0, La3/d;->Q:Ljava/util/HashSet;

    move-object p0, v0

    :goto_0
    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb2/v;->I:Z

    iget-object v0, p1, Lb2/v;->F:Lb2/v;

    if-eqz v0, :cond_2

    iput-object p0, v0, Lb2/v;->E:Lb2/v;

    iput-object v0, p0, Lb2/v;->F:Lb2/v;

    :cond_2
    iput-object p0, p1, Lb2/v;->F:Lb2/v;

    iput-object p1, p0, Lb2/v;->E:Lb2/v;

    return-object p0
.end method

.method public static g(Lb2/v;)Lb2/v;
    .locals 3

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    sget-object v1, La3/r1;->a:La0/m0;

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, La3/r1;->a(Lb2/v;II)V

    invoke-virtual {p0}, Lb2/v;->U0()V

    invoke-virtual {p0}, Lb2/v;->O0()V

    :cond_1
    iget-object v0, p0, Lb2/v;->F:Lb2/v;

    iget-object v1, p0, Lb2/v;->E:Lb2/v;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iput-object v1, v0, Lb2/v;->E:Lb2/v;

    iput-object v2, p0, Lb2/v;->F:Lb2/v;

    :cond_2
    if-eqz v1, :cond_3

    iput-object v0, v1, Lb2/v;->F:Lb2/v;

    iput-object v2, p0, Lb2/v;->E:Lb2/v;

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v1
.end method

.method public static p(Lb2/u;Lb2/u;Lb2/v;)V
    .locals 2

    instance-of p0, p0, La3/h1;

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    instance-of p0, p1, La3/h1;

    if-eqz p0, :cond_1

    check-cast p1, La3/h1;

    const-string p0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, La3/h1;->update(Lb2/v;)V

    iget-boolean p0, p2, Lb2/v;->N:Z

    if-eqz p0, :cond_0

    invoke-static {p2}, La3/r1;->c(Lb2/v;)V

    return-void

    :cond_0
    iput-boolean v0, p2, Lb2/v;->J:Z

    return-void

    :cond_1
    instance-of p0, p2, La3/d;

    if-eqz p0, :cond_5

    move-object p0, p2

    check-cast p0, La3/d;

    iget-boolean v1, p0, Lb2/v;->N:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, La3/d;->Y0()V

    :cond_2
    iput-object p1, p0, La3/d;->O:Lb2/u;

    invoke-static {p1}, La3/r1;->d(Lb2/u;)I

    move-result p1

    iput p1, p0, Lb2/v;->y:I

    iget-boolean p1, p0, Lb2/v;->N:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, La3/d;->X0(Z)V

    :cond_3
    iget-boolean p0, p2, Lb2/v;->N:Z

    if-eqz p0, :cond_4

    invoke-static {p2}, La3/r1;->c(Lb2/v;)V

    return-void

    :cond_4
    iput-boolean v0, p2, Lb2/v;->J:Z

    return-void

    :cond_5
    const-string p0, "Unknown Modifier.Node type"

    invoke-static {p0}, Lx2/a;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V
    .locals 2

    iget-object v0, p0, La3/l1;->b:Ljava/lang/Object;

    check-cast v0, Lwe/o;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Ldl/z;

    invoke-virtual {v1, p1, p2, p3}, Ldl/z;->a(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    iget-object p1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Ljava/lang/Class;Lwk/c;)V
    .locals 3

    iget-object v0, p0, La3/l1;->c:Ljava/lang/Object;

    check-cast v0, Lol/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lol/b;->w:Ljava/util/ArrayList;

    new-instance v2, Lol/a;

    invoke-direct {v2, p1, p2}, Lol/a;-><init>(Ljava/lang/Class;Lwk/c;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d(Ljava/lang/Class;Lwk/k;)V
    .locals 3

    iget-object v0, p0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Lio/sentry/e2;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    new-instance v2, Lol/e;

    invoke-direct {v2, p1, p2}, Lol/e;-><init>(Ljava/lang/Class;Lwk/k;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V
    .locals 2

    iget-object v0, p0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->S(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lol/d;

    invoke-direct {v1, p2, p3, p4}, Lol/d;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h()Ljava/util/ArrayList;
    .locals 2

    iget-object v0, p0, La3/l1;->h:Ljava/lang/Object;

    check-cast v0, Lij/n;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lij/n;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;

    invoke-direct {v0}, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;-><init>()V

    throw v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public i(Ljava/lang/Object;)Ljava/util/List;
    .locals 8

    iget-object v0, p0, La3/l1;->b:Ljava/lang/Object;

    check-cast v0, Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v2, Laj/c;

    iget-object v2, v2, Laj/c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldl/v;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Ldl/v;->a:Ljava/util/List;

    :goto_0
    if-nez v2, :cond_2

    iget-object v2, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ldl/z;

    invoke-virtual {v2, v1}, Ldl/z;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v3, Laj/c;

    iget-object v3, v3, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    new-instance v4, Ldl/v;

    invoke-direct {v4, v2}, Ldl/v;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldl/v;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Already cached loaders for model: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    monitor-exit v0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v5, v3

    :goto_2
    if-ge v5, v0, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldl/t;

    invoke-interface {v6, p1}, Ldl/t;->a(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v4, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    sub-int v4, v0, v5

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v3

    :cond_3
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;

    invoke-direct {v0, p1, v2}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Object;Ljava/util/List;)V

    throw v0

    :cond_7
    new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Object;)V

    throw v0

    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public j(I)Z
    .locals 1

    iget-object v0, p0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    iget v0, v0, Lb2/v;->z:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public k(Ljava/lang/Class;Ljava/lang/Class;Lll/a;)V
    .locals 3

    iget-object v0, p0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/k0;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    new-instance v2, Lll/b;

    invoke-direct {v2, p1, p2, p3}, Lll/b;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lll/a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public l(Lxk/f;)V
    .locals 3

    iget-object v0, p0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, Lxk/h;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lxk/h;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-interface {p1}, Lxk/f;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lb2/v;->T0()V

    iget-boolean v1, v0, Lb2/v;->I:Z

    if-eqz v1, :cond_1

    sget-object v1, La3/r1;->a:La0/m0;

    iget-boolean v1, v0, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "autoInvalidateInsertedNode called on unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, La3/r1;->a(Lb2/v;II)V

    :cond_1
    iget-boolean v1, v0, Lb2/v;->J:Z

    if-eqz v1, :cond_2

    invoke-static {v0}, La3/r1;->c(Lb2/v;)V

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, v0, Lb2/v;->I:Z

    iput-boolean v1, v0, Lb2/v;->J:Z

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public n(ILr1/c;Lr1/c;Lb2/v;Z)V
    .locals 31

    move-object/from16 v1, p0

    iget-object v0, v1, La3/l1;->k:Ljava/lang/Object;

    check-cast v0, La3/j1;

    if-nez v0, :cond_0

    new-instance v0, La3/j1;

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v2, p4

    move/from16 v6, p5

    invoke-direct/range {v0 .. v6}, La3/j1;-><init>(La3/l1;Lb2/v;ILr1/c;Lr1/c;Z)V

    iput-object v0, v1, La3/l1;->k:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v2, p4

    iput-object v2, v0, La3/j1;->a:Lb2/v;

    iput v3, v0, La3/j1;->b:I

    iput-object v4, v0, La3/j1;->c:Lr1/c;

    iput-object v5, v0, La3/j1;->d:Lr1/c;

    move/from16 v6, p5

    iput-boolean v6, v0, La3/j1;->e:Z

    :goto_0
    iget-object v2, v0, La3/j1;->f:La3/l1;

    iget v4, v4, Lr1/c;->y:I

    sub-int/2addr v4, v3

    iget v5, v5, Lr1/c;->y:I

    sub-int/2addr v5, v3

    add-int v3, v4, v5

    const/4 v6, 0x1

    add-int/2addr v3, v6

    const/4 v7, 0x2

    div-int/2addr v3, v7

    new-instance v8, La3/x;

    mul-int/lit8 v9, v3, 0x3

    invoke-direct {v8, v9}, La3/x;-><init>(I)V

    new-instance v9, La3/x;

    mul-int/lit8 v10, v3, 0x4

    invoke-direct {v9, v10}, La3/x;-><init>(I)V

    const/4 v10, 0x0

    invoke-virtual {v9, v10, v4, v10, v5}, La3/x;->e(IIII)V

    mul-int/2addr v3, v7

    add-int/2addr v3, v6

    new-array v11, v3, [I

    new-array v12, v3, [I

    const/4 v13, 0x5

    new-array v13, v13, [I

    :goto_1
    iget v14, v9, La3/x;->b:I

    if-eqz v14, :cond_1d

    move/from16 p1, v7

    iget-object v7, v9, La3/x;->a:[I

    move/from16 p2, v10

    add-int/lit8 v10, v14, -0x1

    iput v10, v9, La3/x;->b:I

    aget v10, v7, v10

    const/16 p3, 0x3

    add-int/lit8 v15, v14, -0x2

    iput v15, v9, La3/x;->b:I

    aget v15, v7, v15

    add-int/lit8 v6, v14, -0x3

    iput v6, v9, La3/x;->b:I

    aget v6, v7, v6

    add-int/lit8 v14, v14, -0x4

    iput v14, v9, La3/x;->b:I

    aget v7, v7, v14

    sub-int v14, v6, v7

    move/from16 p5, v3

    sub-int v3, v10, v15

    move-object/from16 v16, v11

    const/4 v11, 0x1

    if-lt v14, v11, :cond_1c

    if-ge v3, v11, :cond_1

    goto/16 :goto_19

    :cond_1
    add-int v17, v14, v3

    add-int/lit8 v17, v17, 0x1

    move/from16 p4, v11

    div-int/lit8 v11, v17, 0x2

    div-int/lit8 v17, p5, 0x2

    add-int/lit8 v18, v17, 0x1

    aput v7, v16, v18

    aput v6, v12, v18

    move/from16 v18, v3

    move/from16 v3, p2

    :goto_2
    if-ge v3, v11, :cond_1c

    sub-int v19, v14, v18

    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I

    move-result v20

    move/from16 v21, v11

    and-int/lit8 v11, v20, 0x1

    move-object/from16 v20, v12

    move/from16 v12, p4

    if-ne v11, v12, :cond_2

    const/4 v11, 0x1

    goto :goto_3

    :cond_2
    move/from16 v11, p2

    :goto_3
    neg-int v12, v3

    move/from16 v22, v11

    move v11, v12

    :goto_4
    const/16 v23, 0x4

    if-gt v11, v3, :cond_b

    if-eq v11, v12, :cond_5

    if-eq v11, v3, :cond_3

    add-int/lit8 v24, v11, 0x1

    add-int v24, v24, v17

    move/from16 v25, v11

    aget v11, v16, v24

    add-int/lit8 v24, v25, -0x1

    add-int v24, v24, v17

    move-object/from16 v26, v13

    aget v13, v16, v24

    if-le v11, v13, :cond_4

    goto :goto_5

    :cond_3
    move/from16 v25, v11

    move-object/from16 v26, v13

    :cond_4
    add-int/lit8 v11, v25, -0x1

    add-int v11, v11, v17

    aget v11, v16, v11

    add-int/lit8 v13, v11, 0x1

    goto :goto_6

    :cond_5
    move/from16 v25, v11

    move-object/from16 v26, v13

    :goto_5
    add-int/lit8 v11, v25, 0x1

    add-int v11, v11, v17

    aget v11, v16, v11

    move v13, v11

    :goto_6
    sub-int v24, v13, v7

    add-int v24, v24, v15

    sub-int v24, v24, v25

    if-eqz v3, :cond_6

    const/16 v27, 0x1

    goto :goto_7

    :cond_6
    move/from16 v27, p2

    :goto_7
    if-ne v13, v11, :cond_7

    const/16 v28, 0x1

    goto :goto_8

    :cond_7
    move/from16 v28, p2

    :goto_8
    and-int v27, v27, v28

    sub-int v27, v24, v27

    move/from16 v30, v24

    move/from16 v24, v11

    move/from16 v11, v30

    :goto_9
    if-ge v13, v6, :cond_8

    if-ge v11, v10, :cond_8

    invoke-virtual {v0, v13, v11}, La3/j1;->a(II)Z

    move-result v28

    if-eqz v28, :cond_8

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_8
    add-int v28, v17, v25

    aput v13, v16, v28

    if-eqz v22, :cond_9

    move/from16 v28, v11

    sub-int v11, v19, v25

    move/from16 v29, v14

    add-int/lit8 v14, v12, 0x1

    if-lt v11, v14, :cond_a

    add-int/lit8 v14, v3, -0x1

    if-gt v11, v14, :cond_a

    add-int v11, v17, v11

    aget v11, v20, v11

    if-gt v11, v13, :cond_a

    aput v24, v26, p2

    const/4 v11, 0x1

    aput v27, v26, v11

    aput v13, v26, p1

    aput v28, v26, p3

    aput p2, v26, v23

    const/4 v11, 0x1

    goto/16 :goto_11

    :cond_9
    move/from16 v29, v14

    :cond_a
    add-int/lit8 v11, v25, 0x2

    move-object/from16 v13, v26

    move/from16 v14, v29

    goto/16 :goto_4

    :cond_b
    move-object/from16 v26, v13

    move/from16 v29, v14

    and-int/lit8 v11, v19, 0x1

    if-nez v11, :cond_c

    const/4 v11, 0x1

    goto :goto_a

    :cond_c
    move/from16 v11, p2

    :goto_a
    move v13, v12

    :goto_b
    if-gt v13, v3, :cond_1b

    if-eq v13, v12, :cond_f

    if-eq v13, v3, :cond_d

    add-int/lit8 v14, v13, 0x1

    add-int v14, v14, v17

    aget v14, v20, v14

    add-int/lit8 v22, v13, -0x1

    add-int v22, v22, v17

    move/from16 v24, v11

    aget v11, v20, v22

    if-ge v14, v11, :cond_e

    goto :goto_c

    :cond_d
    move/from16 v24, v11

    :cond_e
    add-int/lit8 v11, v13, -0x1

    add-int v11, v11, v17

    aget v11, v20, v11

    add-int/lit8 v14, v11, -0x1

    goto :goto_d

    :cond_f
    move/from16 v24, v11

    :goto_c
    add-int/lit8 v11, v13, 0x1

    add-int v11, v11, v17

    aget v11, v20, v11

    move v14, v11

    :goto_d
    sub-int v22, v6, v14

    sub-int v22, v22, v13

    sub-int v22, v10, v22

    if-eqz v3, :cond_10

    const/16 v25, 0x1

    goto :goto_e

    :cond_10
    move/from16 v25, p2

    :goto_e
    if-ne v14, v11, :cond_11

    const/16 v27, 0x1

    goto :goto_f

    :cond_11
    move/from16 v27, p2

    :goto_f
    and-int v25, v25, v27

    add-int v25, v22, v25

    move/from16 v30, v22

    move/from16 v22, v11

    move/from16 v11, v30

    :goto_10
    if-le v14, v7, :cond_12

    if-le v11, v15, :cond_12

    move/from16 v27, v11

    add-int/lit8 v11, v14, -0x1

    move/from16 v28, v13

    add-int/lit8 v13, v27, -0x1

    invoke-virtual {v0, v11, v13}, La3/j1;->a(II)Z

    move-result v11

    if-eqz v11, :cond_13

    add-int/lit8 v14, v14, -0x1

    add-int/lit8 v11, v27, -0x1

    move/from16 v13, v28

    goto :goto_10

    :cond_12
    move/from16 v27, v11

    move/from16 v28, v13

    :cond_13
    add-int v13, v17, v28

    aput v14, v20, v13

    if-eqz v24, :cond_1a

    sub-int v11, v19, v28

    if-lt v11, v12, :cond_1a

    if-gt v11, v3, :cond_1a

    add-int v11, v17, v11

    aget v11, v16, v11

    if-lt v11, v14, :cond_1a

    aput v14, v26, p2

    const/4 v11, 0x1

    aput v27, v26, v11

    aput v22, v26, p1

    aput v25, v26, p3

    aput v11, v26, v23

    :goto_11
    aget v3, v26, p1

    aget v12, v26, p2

    sub-int/2addr v3, v12

    aget v12, v26, p3

    aget v13, v26, v11

    sub-int/2addr v12, v13

    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-lez v3, :cond_19

    aget v3, v26, p2

    aget v12, v26, v11

    aget v11, v26, p3

    sub-int/2addr v11, v12

    aget v13, v26, p1

    sub-int/2addr v13, v3

    if-eq v11, v13, :cond_18

    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    move-result v13

    aget v11, v26, v23

    if-eqz v11, :cond_14

    const/4 v14, 0x1

    goto :goto_12

    :cond_14
    move/from16 v14, p2

    :goto_12
    aget v17, v26, p3

    const/16 v18, 0x1

    aget v19, v26, v18

    move/from16 p4, v3

    sub-int v3, v17, v19

    aget v21, v26, p1

    aget v22, v26, p2

    move/from16 v23, v11

    sub-int v11, v21, v22

    if-le v3, v11, :cond_15

    move/from16 v3, v18

    goto :goto_13

    :cond_15
    move/from16 v3, p2

    :goto_13
    or-int/2addr v3, v14

    xor-int/lit8 v3, v3, 0x1

    add-int v3, p4, v3

    if-eqz v23, :cond_16

    move/from16 v11, v18

    goto :goto_14

    :cond_16
    move/from16 v11, p2

    :goto_14
    sub-int v14, v17, v19

    move/from16 p4, v3

    sub-int v3, v21, v22

    if-le v14, v3, :cond_17

    move/from16 v3, v18

    goto :goto_15

    :cond_17
    move/from16 v3, p2

    :goto_15
    xor-int/lit8 v3, v3, 0x1

    or-int/2addr v3, v11

    xor-int/lit8 v3, v3, 0x1

    add-int/2addr v12, v3

    move/from16 v3, p4

    goto :goto_16

    :cond_18
    move/from16 p4, v3

    const/16 v18, 0x1

    :goto_16
    invoke-virtual {v8, v3, v12, v13}, La3/x;->d(III)V

    goto :goto_17

    :cond_19
    move/from16 v18, v11

    :goto_17
    aget v3, v26, p2

    aget v11, v26, v18

    invoke-virtual {v9, v7, v3, v15, v11}, La3/x;->e(IIII)V

    aget v3, v26, p1

    aget v7, v26, p3

    invoke-virtual {v9, v3, v6, v7, v10}, La3/x;->e(IIII)V

    :goto_18
    move/from16 v7, p1

    move/from16 v10, p2

    move/from16 v3, p5

    move-object/from16 v11, v16

    move-object/from16 v12, v20

    move-object/from16 v13, v26

    const/4 v6, 0x1

    goto/16 :goto_1

    :cond_1a
    add-int/lit8 v13, v28, 0x2

    move/from16 v11, v24

    goto/16 :goto_b

    :cond_1b
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v12, v20

    move/from16 v11, v21

    move-object/from16 v13, v26

    move/from16 v14, v29

    const/16 p4, 0x1

    goto/16 :goto_2

    :cond_1c
    :goto_19
    move-object/from16 v20, v12

    move-object/from16 v26, v13

    goto :goto_18

    :cond_1d
    move/from16 p1, v7

    move/from16 p2, v10

    const/16 p3, 0x3

    iget v3, v8, La3/x;->b:I

    rem-int/lit8 v6, v3, 0x3

    if-nez v6, :cond_1e

    :goto_1a
    move/from16 v6, p3

    goto :goto_1b

    :cond_1e
    const-string v6, "Array size not a multiple of 3"

    invoke-static {v6}, Lx2/a;->b(Ljava/lang/String;)V

    goto :goto_1a

    :goto_1b
    if-le v3, v6, :cond_1f

    sub-int/2addr v3, v6

    move/from16 v6, p2

    invoke-virtual {v8, v6, v3}, La3/x;->f(II)V

    goto :goto_1c

    :cond_1f
    move/from16 v6, p2

    :goto_1c
    invoke-virtual {v8, v4, v5, v6}, La3/x;->d(III)V

    move v3, v6

    move v4, v3

    move v5, v4

    :cond_20
    iget v7, v8, La3/x;->b:I

    if-ge v3, v7, :cond_29

    iget-object v7, v8, La3/x;->a:[I

    aget v9, v7, v3

    add-int/lit8 v10, v3, 0x2

    aget v10, v7, v10

    sub-int/2addr v9, v10

    add-int/lit8 v11, v3, 0x1

    aget v7, v7, v11

    sub-int/2addr v7, v10

    add-int/lit8 v3, v3, 0x3

    :goto_1d
    if-ge v4, v9, :cond_23

    iget-object v11, v0, La3/j1;->a:Lb2/v;

    iget-object v11, v11, Lb2/v;->F:Lb2/v;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v12, v11, Lb2/v;->y:I

    and-int/lit8 v12, v12, 0x2

    if-eqz v12, :cond_22

    iget-object v12, v11, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v13, v12, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v12, v12, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz v13, :cond_21

    iput-object v12, v13, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    :cond_21
    iput-object v13, v12, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v13, v0, La3/j1;->a:Lb2/v;

    invoke-static {v2, v13, v12}, La3/l1;->a(La3/l1;Lb2/v;Landroidx/compose/ui/node/NodeCoordinator;)V

    :cond_22
    invoke-static {v11}, La3/l1;->g(Lb2/v;)Lb2/v;

    move-result-object v11

    iput-object v11, v0, La3/j1;->a:Lb2/v;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_23
    :goto_1e
    if-ge v5, v7, :cond_27

    iget v9, v0, La3/j1;->b:I

    add-int/2addr v9, v5

    iget-object v11, v0, La3/j1;->a:Lb2/v;

    iget-object v12, v0, La3/j1;->d:Lr1/c;

    iget-object v12, v12, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v9, v12, v9

    check-cast v9, Lb2/u;

    invoke-static {v9, v11}, La3/l1;->f(Lb2/u;Lb2/v;)Lb2/v;

    move-result-object v9

    iput-object v9, v0, La3/j1;->a:Lb2/v;

    iget-boolean v11, v0, La3/j1;->e:Z

    if-eqz v11, :cond_26

    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v9, v9, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v11, v0, La3/j1;->a:Lb2/v;

    invoke-static {v11}, La3/g;->e(Lb2/v;)La3/c0;

    move-result-object v11

    if-eqz v11, :cond_24

    new-instance v12, Landroidx/compose/ui/node/b;

    iget-object v13, v2, La3/l1;->b:Ljava/lang/Object;

    check-cast v13, La3/n0;

    invoke-direct {v12, v13, v11}, Landroidx/compose/ui/node/b;-><init>(La3/n0;La3/c0;)V

    iget-object v11, v0, La3/j1;->a:Lb2/v;

    invoke-virtual {v11, v12}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    iget-object v11, v0, La3/j1;->a:Lb2/v;

    invoke-static {v2, v11, v12}, La3/l1;->a(La3/l1;Lb2/v;Landroidx/compose/ui/node/NodeCoordinator;)V

    iget-object v11, v9, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v11, v12, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v9, v12, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v12, v9, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_1f

    :cond_24
    iget-object v11, v0, La3/j1;->a:Lb2/v;

    invoke-virtual {v11, v9}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    :goto_1f
    iget-object v9, v0, La3/j1;->a:Lb2/v;

    invoke-virtual {v9}, Lb2/v;->N0()V

    iget-object v9, v0, La3/j1;->a:Lb2/v;

    invoke-virtual {v9}, Lb2/v;->T0()V

    iget-object v9, v0, La3/j1;->a:Lb2/v;

    sget-object v11, La3/r1;->a:La0/m0;

    iget-boolean v11, v9, Lb2/v;->N:Z

    if-nez v11, :cond_25

    const-string v11, "autoInvalidateInsertedNode called on unattached node"

    invoke-static {v11}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_25
    const/4 v11, -0x1

    const/4 v12, 0x1

    invoke-static {v9, v11, v12}, La3/r1;->a(Lb2/v;II)V

    goto :goto_20

    :cond_26
    const/4 v12, 0x1

    iput-boolean v12, v9, Lb2/v;->I:Z

    :goto_20
    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    :cond_27
    const/4 v12, 0x1

    :goto_21
    add-int/lit8 v7, v10, -0x1

    if-lez v10, :cond_20

    iget-object v9, v0, La3/j1;->a:Lb2/v;

    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v9, v0, La3/j1;->a:Lb2/v;

    iget-object v9, v0, La3/j1;->c:Lr1/c;

    iget v10, v0, La3/j1;->b:I

    add-int v11, v10, v4

    iget-object v9, v9, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v9, v9, v11

    check-cast v9, Lb2/u;

    iget-object v11, v0, La3/j1;->d:Lr1/c;

    add-int/2addr v10, v5

    iget-object v11, v11, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v10, v11, v10

    check-cast v10, Lb2/u;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    iget-object v11, v0, La3/j1;->a:Lb2/v;

    invoke-static {v9, v10, v11}, La3/l1;->p(Lb2/u;Lb2/u;Lb2/v;)V

    :cond_28
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    move v10, v7

    goto :goto_21

    :cond_29
    iget-object v0, v1, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    move v10, v6

    :goto_22
    if-eqz v0, :cond_2a

    iget-object v2, v1, La3/l1;->c:Ljava/lang/Object;

    check-cast v2, La3/k1;

    if-eq v0, v2, :cond_2a

    iget v2, v0, Lb2/v;->y:I

    or-int/2addr v10, v2

    iput v10, v0, Lb2/v;->z:I

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_22

    :cond_2a
    return-void
.end method

.method public o()V
    .locals 6

    iget-object v0, p0, La3/l1;->b:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v1, p0, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    iget-object v2, p0, La3/l1;->f:Ljava/lang/Object;

    check-cast v2, La3/l2;

    iget-object v2, v2, Lb2/v;->E:Lb2/v;

    :goto_0
    if-eqz v2, :cond_3

    invoke-static {v2}, La3/g;->e(Lb2/v;)La3/c0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v4, :cond_0

    check-cast v4, Landroidx/compose/ui/node/b;

    iget-object v5, v4, Landroidx/compose/ui/node/b;->p0:La3/c0;

    invoke-virtual {v4, v3}, Landroidx/compose/ui/node/b;->J1(La3/c0;)V

    if-eq v5, v2, :cond_1

    iget-object v3, v4, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v3, :cond_1

    check-cast v3, Lb3/f2;

    invoke-virtual {v3}, Lb3/f2;->invalidate()V

    goto :goto_1

    :cond_0
    new-instance v4, Landroidx/compose/ui/node/b;

    invoke-direct {v4, v0, v3}, Landroidx/compose/ui/node/b;-><init>(La3/n0;La3/c0;)V

    invoke-virtual {v2, v4}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    :cond_1
    :goto_1
    iput-object v4, v1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v1, v4, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    move-object v1, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v1}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    :goto_2
    iget-object v2, v2, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    iput-object v0, v1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v1, p0, La3/l1;->e:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, La3/l1;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La3/l1;->g:Ljava/lang/Object;

    check-cast v1, Lb2/v;

    iget-object v2, p0, La3/l1;->f:Ljava/lang/Object;

    check-cast v2, La3/l2;

    const-string v3, "]"

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lb2/v;->F:Lb2/v;

    if-ne v4, v2, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
