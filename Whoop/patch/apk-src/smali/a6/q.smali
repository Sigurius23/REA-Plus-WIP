.class public final La6/q;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, La6/q;->w:I

    .line 1
    check-cast p1, Ls83/i;

    iput-object p1, p0, La6/q;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, La6/q;->w:I

    iput-object p1, p0, La6/q;->x:Ljava/lang/Object;

    iput-object p2, p0, La6/q;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p3, p0, La6/q;->w:I

    iput-object p1, p0, La6/q;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, La6/q;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, La6/q;

    iget-object v0, p0, La6/q;->x:Ljava/lang/Object;

    check-cast v0, Lnk/m;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xa

    invoke-direct {p1, v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, La6/q;

    iget-object v0, p0, La6/q;->x:Ljava/lang/Object;

    check-cast v0, La3/p;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x9

    invoke-direct {p1, v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance v0, La6/q;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {v0, v1, p2}, La6/q;-><init>(Lc93/m;Lq83/d;)V

    iput-object p1, v0, La6/q;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance p1, La6/q;

    iget-object v0, p0, La6/q;->x:Ljava/lang/Object;

    check-cast v0, Lkj/b;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Ljk/a;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance v0, La6/q;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    const/4 v2, 0x6

    invoke-direct {v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/q;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance p1, La6/q;

    iget-object v0, p0, La6/q;->x:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Lck/f;

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance v0, La6/q;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    const/4 v2, 0x4

    invoke-direct {v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/q;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance v0, La6/q;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/b0;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/q;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_7
    new-instance p1, La6/q;

    iget-object v0, p0, La6/q;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/p0;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/v0;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, La6/q;

    iget-object v0, p0, La6/q;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/p0;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/p;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance v0, La6/q;

    iget-object v1, p0, La6/q;->y:Ljava/lang/Object;

    check-cast v1, La6/e1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/q;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/q;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_9
    check-cast p1, La6/e1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, La6/q;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, p0, La6/q;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lnk/m;

    iget-object p1, p1, Lnk/m;->a:Ldk/f;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1, v5}, Ldk/f;->i(Ljava/lang/String;)V

    return-object v4

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, La3/p;

    iget-object p1, p1, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Ldk/f;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1, v5}, Ldk/f;->i(Ljava/lang/String;)V

    return-object v4

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object v0, Lq83/e;->w:Lq83/e;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lq83/f;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, La6/v;

    check-cast v5, Ls83/i;

    invoke-direct {v3, v0, v5, v2}, La6/v;-><init>(Lbc3/t;Lc93/m;Lq83/d;)V

    sget-object v4, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {v4, p1, v1, v3}, Lbc3/f0;->y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;

    :catch_0
    invoke-virtual {v0}, Lbc3/t1;->isCompleted()Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    new-instance v1, Landroidx/room/z1;

    const/16 v3, 0x8

    invoke-direct {v1, v0, v2, v3}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v1}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lbc3/t1;->A()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lkj/b;

    iget-object p1, p1, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    check-cast v5, Ljk/a;

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Lhj/o;

    invoke-direct {v1, v3, v5}, Lhj/o;-><init>(ILjk/a;)V

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    invoke-static {v5}, Lge3/g;->v(Ljk/a;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object p1, p1, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "window.engagement.forwardEvent("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lhj/i;->y:Lhj/i;

    invoke-virtual {p1, v0, v1}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-object v4

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lf6/f;

    invoke-virtual {p1}, Lf6/f;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf6/d;

    iget-object v2, v2, Lf6/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    check-cast v5, Ljava/util/Set;

    sget-object p1, Le6/j;->a:Ljava/util/LinkedHashSet;

    if-ne v5, p1, :cond_2

    goto :goto_2

    :cond_2
    check-cast v5, Ljava/lang/Iterable;

    instance-of p1, v5, Ljava/util/Collection;

    if-eqz p1, :cond_4

    move-object p1, v5

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    move v1, v3

    goto :goto_2

    :cond_4
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lgj/d;

    iget-object p1, p1, Lgj/d;->a:Lgj/g;

    check-cast v5, Lck/f;

    iget-object v0, v5, Lck/f;->w:Lch3/h;

    if-eqz v0, :cond_c

    iget-object v2, v0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v2, Lfk/a;

    iget-boolean v5, v0, Lch3/h;->y:Z

    if-nez v5, :cond_7

    :cond_6
    :goto_3
    move v3, v1

    goto :goto_5

    :cond_7
    :try_start_1
    iget-object v0, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v5, "connectivity"

    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Landroid/net/ConnectivityManager;

    if-eqz v5, :cond_a

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {v0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_a
    const-string v0, "Service is not an instance of ConnectivityManager. Offline mode is not supported"

    invoke-interface {v2, v0}, Lfk/a;->debug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Error checking network connectivity: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lfk/a;->warn(Ljava/lang/String;)V

    invoke-static {v0}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lfk/a;->warn(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    :goto_5
    xor-int/lit8 v0, v3, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lgj/g;->p:Ljava/lang/Boolean;

    return-object v4

    :cond_c
    const-string p1, "networkConnectivityChecker"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    check-cast v5, Lc93/a;

    :try_start_2
    new-instance v0, Lbc3/h2;

    invoke-direct {v0}, Lbc3/h2;-><init>()V

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    invoke-static {p1, v1, v0}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    move-result-object p1

    iput-object p1, v0, Lbc3/h2;->F:Lbc3/s0;

    sget-object p1, Lbc3/h2;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_d
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_f

    const/4 p1, 0x2

    if-eq v1, p1, :cond_10

    const/4 p1, 0x3

    if-ne v1, p1, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v1}, Lbc3/h2;->l(I)V

    throw v2

    :cond_f
    invoke-virtual {p1, v0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v1, :cond_d

    :cond_10
    :goto_6
    :try_start_3
    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v0}, Lbc3/h2;->k()V

    return-object p1

    :catch_1
    move-exception p1

    goto :goto_7

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lbc3/h2;->k()V

    throw p1
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    :goto_7
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Blocking call was interrupted due to parent cancellation"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    check-cast v5, Landroidx/lifecycle/b0;

    iget-object v0, v5, Landroidx/lifecycle/b0;->w:Landroidx/lifecycle/x;

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v1

    sget-object v3, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_11

    invoke-virtual {v0, v5}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    goto :goto_8

    :cond_11
    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1, v2}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    :goto_8
    return-object v4

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/p0;

    check-cast v5, Landroidx/lifecycle/v0;

    invoke-virtual {p1, v5}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    return-object v4

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/p0;

    check-cast v5, Landroidx/lifecycle/p;

    invoke-virtual {p1, v5}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    return-object v4

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/q;->x:Ljava/lang/Object;

    check-cast p1, La6/e1;

    instance-of v0, p1, La6/b;

    if-eqz v0, :cond_12

    check-cast p1, La6/b;

    iget p1, p1, La6/e1;->a:I

    check-cast v5, La6/e1;

    check-cast v5, La6/b;

    iget v0, v5, La6/e1;->a:I

    if-gt p1, v0, :cond_12

    goto :goto_9

    :cond_12
    move v1, v3

    :goto_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
