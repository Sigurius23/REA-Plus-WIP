.class public final Lt23/n0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt23/s0;


# direct methods
.method public synthetic constructor <init>(Lt23/s0;I)V
    .locals 0

    iput p2, p0, Lt23/n0;->w:I

    iput-object p1, p0, Lt23/n0;->x:Lt23/s0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lt23/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt23/n0;->x:Lt23/s0;

    iget-object v1, v0, Lt23/s0;->v:Lj53/m;

    iget-object v1, v1, Lj53/m;->j:Lec3/h2;

    new-instance v2, Lt23/q0;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lt23/q0;-><init>(Lt23/s0;I)V

    invoke-static {v1, v2}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lt23/n0;->x:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lt23/n0;->x:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->v:Lj53/m;

    iget-object v0, v0, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x19

    if-ge v0, v1, :cond_1

    const-wide/16 v0, 0xfa

    goto :goto_0

    :cond_1
    const/16 v1, 0x32

    if-ge v0, v1, :cond_2

    const-wide/16 v0, 0x1f4

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3e8

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lt23/n0;->x:Lt23/s0;

    invoke-virtual {v0}, Lt23/s0;->b()Lb23/k;

    move-result-object v1

    iget-object v2, v0, Lt23/s0;->v0:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v3, v0, Lt23/s0;->v:Lj53/m;

    iget-object v3, v3, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const-string v7, "[ParticipantJoinedEvent] #participants; #debounce; participants: "

    invoke-static {v3, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v4, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v3, "<get-values>(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/k;

    iget-object v7, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Lstream/video/sfu/models/Participant;

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lstream/video/sfu/models/Participant;

    invoke-virtual {v5}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v0, v7, v8, v9}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v7

    invoke-virtual {v7, v5}, Lt23/g2;->b(Lstream/video/sfu/models/Participant;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v4}, Lt23/s0;->l(Ljava/util/List;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v0, v0, Lt23/s0;->r:La30/w0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    iget-object v3, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lt23/n0;

    iget-object v3, v3, Lt23/n0;->x:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :cond_6
    move v5, v4

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/k;

    iget-object v8, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v8, Lstream/video/sfu/models/Participant;

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v9, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v9, Lt9/c0;

    invoke-static {v2, v8, v7, v3, v9}, La30/w0;->h(Ljava/util/LinkedHashMap;Lstream/video/sfu/models/Participant;ZLjava/util/Map;Lt9/c0;)Z

    move-result v7

    if-nez v7, :cond_7

    if-eqz v5, :cond_6

    :cond_7
    const/4 v5, 0x1

    goto :goto_3

    :cond_8
    if-eqz v5, :cond_9

    iget-object v0, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v6, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
