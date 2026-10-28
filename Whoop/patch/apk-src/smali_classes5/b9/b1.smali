.class public final Lb9/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/IdentityHashMap;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/HashSet;

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public final i:Landroid/os/Handler$Callback;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb9/l0;Lc9/h;Lx8/r;Lc9/n;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/b1;->a:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p4, p0, Lb9/b1;->h:Ljava/lang/Object;

    .line 24
    iput-object p1, p0, Lb9/b1;->i:Landroid/os/Handler$Callback;

    .line 25
    new-instance p1, Ll9/c1;

    invoke-direct {p1}, Ll9/c1;-><init>()V

    iput-object p1, p0, Lb9/b1;->l:Ljava/lang/Object;

    .line 26
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    .line 27
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb9/b1;->d:Ljava/util/HashMap;

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    .line 29
    iput-object p2, p0, Lb9/b1;->j:Ljava/lang/Object;

    .line 30
    iput-object p3, p0, Lb9/b1;->k:Ljava/lang/Object;

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb9/b1;->e:Ljava/util/HashMap;

    .line 32
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lb9/b1;->f:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Lrm/z;Lsm/d;Landroid/os/Handler;Lsm/f;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb9/b1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Lb9/b1;->h:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lb9/b1;->i:Landroid/os/Handler$Callback;

    .line 4
    new-instance p1, Lsn/u0;

    invoke-direct {p1}, Lsn/u0;-><init>()V

    iput-object p1, p0, Lb9/b1;->l:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb9/b1;->d:Ljava/util/HashMap;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    .line 8
    new-instance p1, Lsn/z;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Lsn/z;-><init>(I)V

    iput-object p1, p0, Lb9/b1;->j:Ljava/lang/Object;

    .line 9
    new-instance p4, Lsn/z;

    invoke-direct {p4, v0}, Lsn/z;-><init>(I)V

    iput-object p4, p0, Lb9/b1;->k:Ljava/lang/Object;

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb9/b1;->e:Ljava/util/HashMap;

    .line 11
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lb9/b1;->f:Ljava/util/HashSet;

    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    new-instance v0, Lsn/y;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p3, v0, Lsn/y;->a:Landroid/os/Handler;

    .line 16
    iput-object p2, v0, Lsn/y;->b:Lsn/a0;

    .line 17
    iget-object p1, p1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance p1, Lvm/d;

    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p2, p1, Lvm/d;->a:Lvm/e;

    .line 21
    iget-object p2, p4, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(ILjava/util/ArrayList;Lsn/u0;)Lrm/o1;
    .locals 6

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iput-object p3, p0, Lb9/b1;->l:Ljava/lang/Object;

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_4

    sub-int v0, p3, p1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrm/t0;

    const/4 v1, 0x0

    iget-object v2, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    if-lez p3, :cond_0

    add-int/lit8 v3, p3, -0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrm/t0;

    iget-object v4, v3, Lrm/t0;->a:Lsn/q;

    iget-object v4, v4, Lsn/q;->o:Lsn/o;

    iget v3, v3, Lrm/t0;->d:I

    iget-object v4, v4, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v4}, Lrm/o1;->o()I

    move-result v4

    add-int/2addr v4, v3

    iput v4, v0, Lrm/t0;->d:I

    iput-boolean v1, v0, Lrm/t0;->e:Z

    iget-object v1, v0, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    :cond_0
    iput v1, v0, Lrm/t0;->d:I

    iput-boolean v1, v0, Lrm/t0;->e:Z

    iget-object v1, v0, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :goto_1
    iget-object v1, v0, Lrm/t0;->a:Lsn/q;

    iget-object v1, v1, Lsn/q;->o:Lsn/o;

    iget-object v1, v1, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v1}, Lrm/o1;->o()I

    move-result v1

    move v3, p3

    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrm/t0;

    iget v5, v4, Lrm/t0;->d:I

    add-int/2addr v5, v1

    iput v5, v4, Lrm/t0;->d:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v2, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object v1, p0, Lb9/b1;->d:Ljava/util/HashMap;

    iget-object v2, v0, Lrm/t0;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lb9/b1;->g:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Lb9/b1;->i(Lrm/t0;)V

    iget-object v1, p0, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrm/s0;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lrm/s0;->a:Lsn/a;

    iget-object v0, v0, Lrm/s0;->b:Lrm/r0;

    invoke-virtual {v1, v0}, Lsn/a;->b(Lsn/w;)V

    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p0}, Lb9/b1;->c()Lrm/o1;

    move-result-object p1

    return-object p1
.end method

.method public b(ILjava/util/ArrayList;Ll9/c1;)Lu8/o0;
    .locals 6

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iput-object p3, p0, Lb9/b1;->l:Ljava/lang/Object;

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_4

    sub-int v0, p3, p1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb9/a1;

    const/4 v1, 0x0

    iget-object v2, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    if-lez p3, :cond_0

    add-int/lit8 v3, p3, -0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb9/a1;

    iget-object v4, v3, Lb9/a1;->a:Ll9/x;

    iget-object v4, v4, Ll9/x;->o:Ll9/v;

    iget v3, v3, Lb9/a1;->d:I

    iget-object v4, v4, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v4}, Lu8/o0;->o()I

    move-result v4

    add-int/2addr v4, v3

    iput v4, v0, Lb9/a1;->d:I

    iput-boolean v1, v0, Lb9/a1;->e:Z

    iget-object v1, v0, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    :cond_0
    iput v1, v0, Lb9/a1;->d:I

    iput-boolean v1, v0, Lb9/a1;->e:Z

    iget-object v1, v0, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :goto_1
    iget-object v1, v0, Lb9/a1;->a:Ll9/x;

    iget-object v1, v1, Ll9/x;->o:Ll9/v;

    iget-object v1, v1, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v1}, Lu8/o0;->o()I

    move-result v1

    move v3, p3

    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb9/a1;

    iget v5, v4, Lb9/a1;->d:I

    add-int/2addr v5, v1

    iput v5, v4, Lb9/a1;->d:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v2, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object v1, p0, Lb9/b1;->d:Ljava/util/HashMap;

    iget-object v2, v0, Lb9/a1;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lb9/b1;->g:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Lb9/b1;->h(Lb9/a1;)V

    iget-object v1, p0, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb9/z0;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lb9/z0;->a:Ll9/a;

    iget-object v0, v0, Lb9/z0;->b:Lb9/u0;

    invoke-virtual {v1, v0}, Ll9/a;->b(Ll9/d0;)V

    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p0}, Lb9/b1;->d()Lu8/o0;

    move-result-object p1

    return-object p1
.end method

.method public c()Lrm/o1;
    .locals 4

    iget-object v0, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lrm/o1;->w:Lrm/l1;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrm/t0;

    iput v2, v3, Lrm/t0;->d:I

    iget-object v3, v3, Lrm/t0;->a:Lsn/q;

    iget-object v3, v3, Lsn/q;->o:Lsn/o;

    iget-object v3, v3, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v3}, Lrm/o1;->o()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lrm/e1;

    iget-object v2, p0, Lb9/b1;->l:Ljava/lang/Object;

    check-cast v2, Lsn/u0;

    invoke-direct {v1, v0, v2}, Lrm/e1;-><init>(Ljava/util/ArrayList;Lsn/u0;)V

    return-object v1
.end method

.method public d()Lu8/o0;
    .locals 4

    iget-object v0, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lu8/o0;->a:Lu8/l0;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb9/a1;

    iput v2, v3, Lb9/a1;->d:I

    iget-object v3, v3, Lb9/a1;->a:Ll9/x;

    iget-object v3, v3, Ll9/x;->o:Ll9/v;

    iget-object v3, v3, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v3}, Lu8/o0;->o()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lb9/h1;

    iget-object v2, p0, Lb9/b1;->l:Ljava/lang/Object;

    check-cast v2, Ll9/c1;

    invoke-direct {v1, v0, v2}, Lb9/h1;-><init>(Ljava/util/ArrayList;Ll9/c1;)V

    return-object v1
.end method

.method public final e()V
    .locals 3

    iget v0, p0, Lb9/b1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/t0;

    iget-object v2, v1, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/s0;

    if-eqz v1, :cond_1

    iget-object v2, v1, Lrm/s0;->a:Lsn/a;

    iget-object v1, v1, Lrm/s0;->b:Lrm/r0;

    invoke-virtual {v2, v1}, Lsn/a;->b(Lsn/w;)V

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb9/a1;

    iget-object v2, v1, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb9/z0;

    if-eqz v1, :cond_4

    iget-object v2, v1, Lb9/z0;->a:Ll9/a;

    iget-object v1, v1, Lb9/z0;->b:Lb9/u0;

    invoke-virtual {v2, v1}, Ll9/a;->b(Ll9/d0;)V

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lb9/a1;)V
    .locals 3

    iget-boolean v0, p1, Lb9/a1;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb9/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lb9/z0;->c:Lb9/y0;

    iget-object v2, v0, Lb9/z0;->a:Ll9/a;

    iget-object v0, v0, Lb9/z0;->b:Lb9/u0;

    invoke-virtual {v2, v0}, Ll9/a;->n(Ll9/d0;)V

    invoke-virtual {v2, v1}, Ll9/a;->q(Ll9/i0;)V

    invoke-virtual {v2, v1}, Ll9/a;->p(Lg9/e;)V

    iget-object v0, p0, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public g(Lrm/t0;)V
    .locals 3

    iget-boolean v0, p1, Lrm/t0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrm/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lrm/s0;->c:Lq/f;

    iget-object v2, v0, Lrm/s0;->a:Lsn/a;

    iget-object v0, v0, Lrm/s0;->b:Lrm/r0;

    invoke-virtual {v2, v0}, Lsn/a;->l(Lsn/w;)V

    invoke-virtual {v2, v1}, Lsn/a;->o(Lsn/a0;)V

    invoke-virtual {v2, v1}, Lsn/a;->n(Lvm/e;)V

    iget-object v0, p0, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public h(Lb9/a1;)V
    .locals 6

    iget-object v0, p1, Lb9/a1;->a:Ll9/x;

    new-instance v1, Lb9/u0;

    invoke-direct {v1, p0}, Lb9/u0;-><init>(Lb9/b1;)V

    new-instance v2, Lb9/y0;

    invoke-direct {v2, p0, p1}, Lb9/y0;-><init>(Lb9/b1;Lb9/a1;)V

    new-instance v3, Lb9/z0;

    invoke-direct {v3, v0, v1, v2}, Lb9/z0;-><init>(Ll9/a;Lb9/u0;Lb9/y0;)V

    iget-object v4, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v4, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget p1, Lx8/t;->a:I

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_0
    new-instance v3, Landroid/os/Handler;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v0, Ll9/a;->c:Lg9/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v5, Ll9/h0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v3, v5, Ll9/h0;->a:Landroid/os/Handler;

    iput-object v2, v5, Ll9/h0;->b:Ljava/lang/Object;

    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_1
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iget-object p1, v0, Ll9/a;->d:Lg9/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lg9/c;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v2, v3, Lg9/c;->a:Ljava/lang/Object;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lb9/b1;->m:Ljava/lang/Object;

    check-cast p1, Lz8/n;

    iget-object v2, p0, Lb9/b1;->h:Ljava/lang/Object;

    check-cast v2, Lc9/n;

    invoke-virtual {v0, v1, p1, v2}, Ll9/a;->j(Ll9/d0;Lz8/n;Lc9/n;)V

    return-void
.end method

.method public i(Lrm/t0;)V
    .locals 6

    iget-object v0, p1, Lrm/t0;->a:Lsn/q;

    new-instance v1, Lrm/r0;

    invoke-direct {v1, p0}, Lrm/r0;-><init>(Lb9/b1;)V

    new-instance v2, Lq/f;

    invoke-direct {v2, p0, p1}, Lq/f;-><init>(Lb9/b1;Lrm/t0;)V

    new-instance v3, Lrm/s0;

    invoke-direct {v3, v0, v1, v2}, Lrm/s0;-><init>(Lsn/a;Lrm/r0;Lq/f;)V

    iget-object v4, p0, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v4, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget p1, Llo/y;->a:I

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_0
    new-instance v3, Landroid/os/Handler;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v0, Lsn/a;->c:Lsn/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v5, Lsn/y;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v3, v5, Lsn/y;->a:Landroid/os/Handler;

    iput-object v2, v5, Lsn/y;->b:Lsn/a0;

    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_1
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iget-object p1, v0, Lsn/a;->d:Lsn/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lvm/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v2, v3, Lvm/d;->a:Lvm/e;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lb9/b1;->m:Ljava/lang/Object;

    check-cast p1, Lko/j0;

    iget-object v2, p0, Lb9/b1;->h:Ljava/lang/Object;

    check-cast v2, Lsm/f;

    invoke-virtual {v0, v1, p1, v2}, Lsn/a;->h(Lsn/w;Lko/j0;Lsm/f;)V

    return-void
.end method

.method public j(Ll9/a0;)V
    .locals 3

    iget-object v0, p0, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb9/a1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lb9/a1;->a:Ll9/x;

    invoke-virtual {v2, p1}, Ll9/x;->m(Ll9/a0;)V

    iget-object v2, v1, Lb9/a1;->c:Ljava/util/ArrayList;

    check-cast p1, Ll9/u;

    iget-object p1, p1, Ll9/u;->w:Ll9/c0;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lb9/b1;->e()V

    :cond_0
    invoke-virtual {p0, v1}, Lb9/b1;->f(Lb9/a1;)V

    return-void
.end method

.method public k(Lsn/s;)V
    .locals 3

    iget-object v0, p0, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/t0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lrm/t0;->a:Lsn/q;

    invoke-virtual {v2, p1}, Lsn/q;->k(Lsn/s;)V

    iget-object v2, v1, Lrm/t0;->c:Ljava/util/ArrayList;

    check-cast p1, Lsn/n;

    iget-object p1, p1, Lsn/n;->w:Lsn/v;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lb9/b1;->e()V

    :cond_0
    invoke-virtual {p0, v1}, Lb9/b1;->g(Lrm/t0;)V

    return-void
.end method

.method public final l(II)V
    .locals 7

    iget v0, p0, Lb9/b1;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :goto_0
    if-lt p2, p1, :cond_2

    iget-object v1, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrm/t0;

    iget-object v3, p0, Lb9/b1;->d:Ljava/util/HashMap;

    iget-object v4, v2, Lrm/t0;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v2, Lrm/t0;->a:Lsn/q;

    iget-object v3, v3, Lsn/q;->o:Lsn/o;

    iget-object v3, v3, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v3}, Lrm/o1;->o()I

    move-result v3

    neg-int v3, v3

    move v4, p2

    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrm/t0;

    iget v6, v5, Lrm/t0;->d:I

    add-int/2addr v6, v3

    iput v6, v5, Lrm/t0;->d:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    iput-boolean v0, v2, Lrm/t0;->e:Z

    iget-boolean v1, p0, Lb9/b1;->g:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2}, Lb9/b1;->g(Lrm/t0;)V

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_2
    return-void

    :pswitch_0
    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :goto_2
    if-lt p2, p1, :cond_5

    iget-object v1, p0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/a1;

    iget-object v3, p0, Lb9/b1;->d:Ljava/util/HashMap;

    iget-object v4, v2, Lb9/a1;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v2, Lb9/a1;->a:Ll9/x;

    iget-object v3, v3, Ll9/x;->o:Ll9/v;

    iget-object v3, v3, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v3}, Lu8/o0;->o()I

    move-result v3

    neg-int v3, v3

    move v4, p2

    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb9/a1;

    iget v6, v5, Lb9/a1;->d:I

    add-int/2addr v6, v3

    iput v6, v5, Lb9/a1;->d:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_3
    iput-boolean v0, v2, Lb9/a1;->e:Z

    iget-boolean v1, p0, Lb9/b1;->g:Z

    if-eqz v1, :cond_4

    invoke-virtual {p0, v2}, Lb9/b1;->f(Lb9/a1;)V

    :cond_4
    add-int/lit8 p2, p2, -0x1

    goto :goto_2

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
