.class public final Lec3/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lec3/m;Lc93/a;Lw23/p;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lec3/f1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lec3/f1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lec3/f1;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lec3/m;Lq83/j;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lec3/f1;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    .line 5
    invoke-static {p2}, Lhc3/b;->l(Lq83/j;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lec3/f1;->y:Ljava/lang/Object;

    .line 6
    new-instance p2, Ld30/o;

    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-direct {p2, p1, v0, v1}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p2, p0, Lec3/f1;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lec3/f1;->w:I

    iput-object p1, p0, Lec3/f1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lec3/f1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lec3/f1;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast v0, Lg1/n7;

    instance-of v1, p2, Lg1/i7;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lg1/i7;

    iget v2, v1, Lg1/i7;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lg1/i7;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lg1/i7;

    invoke-direct {v1, p0, p2}, Lg1/i7;-><init>(Lec3/f1;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lg1/i7;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg1/i7;->z:I

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lg1/i7;->w:Ljava/util/Map;

    check-cast p1, Ljava/util/Map;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    invoke-static {p2, p1}, Lj93/l0;->g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v3, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v3, Ld0/l;

    move-object v6, p1

    check-cast v6, Ljava/util/Map;

    iput-object v6, v1, Lg1/i7;->w:Ljava/util/Map;

    iput v5, v1, Lg1/i7;->z:I

    invoke-virtual {v0, p2, v3, v1}, Lg1/n7;->a(FLd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    iget-object p2, v0, Lg1/n7;->g:Lp1/g1;

    invoke-virtual {p2}, Lp1/g1;->x()F

    move-result p2

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    sub-float/2addr v3, p2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v3, v3, v4

    if-gez v3, :cond_4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    iget-object p1, v0, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_6
    invoke-virtual {v0, p1}, Lg1/n7;->c(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    :try_start_2
    const-string p2, "The target value must have an associated anchor."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    iget-object v1, v0, Lg1/n7;->g:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    sub-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v5, v5, v4

    if-gez v5, :cond_8

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_9
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_a

    iget-object p1, v0, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_a
    invoke-virtual {v0, p1}, Lg1/n7;->c(Ljava/lang/Object;)V

    throw p2
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lec3/f1;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lw23/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw23/l;

    iget v1, v0, Lw23/l;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw23/l;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw23/l;

    invoke-direct {v0, p0, p2}, Lw23/l;-><init>(Lec3/f1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lw23/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw23/l;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    move-object v2, p1

    check-cast v2, Lorg/webrtc/PeerConnection$PeerConnectionState;

    iget-object v4, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/m;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx23/f;

    iget-object v5, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v5, Lw23/p;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lw23/i;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    if-eq v2, v3, :cond_4

    const/4 v5, 0x2

    if-eq v2, v5, :cond_3

    const/4 v5, 0x3

    if-eq v2, v5, :cond_3

    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    sget-object v2, Lx23/f;->y:Lx23/f;

    goto :goto_1

    :cond_4
    sget-object v2, Lx23/f;->x:Lx23/f;

    :goto_1
    sget-object v5, Lx23/f;->y:Lx23/f;

    if-ne v4, v5, :cond_5

    if-ne v2, v5, :cond_5

    goto :goto_2

    :cond_5
    iput v3, v0, Lw23/l;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_0
    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;

    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Lgm/r;

    iget-object v0, p2, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    iget-object v1, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast v1, Lj43/b;

    iget-object v2, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v2, La3/z0;

    iget-object v3, p2, Lgm/r;->y:Ljava/lang/Object;

    check-cast v3, Lt23/b4;

    instance-of v4, p1, Lio/getstream/android/video/generated/models/LocalCallAcceptedPostEvent;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    check-cast p1, Lio/getstream/android/video/generated/models/LocalCallAcceptedPostEvent;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/LocalCallAcceptedPostEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v3, "[handleIncomingCallAcceptedByMeOnAnotherDevice]"

    invoke-interface {v0, v6, v4, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object p2, p2, Lgm/r;->x:Ljava/lang/Object;

    check-cast p2, Lt23/c0;

    iget-object p2, p2, Lt23/c0;->p:Lt23/s0;

    iget-object p2, p2, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt23/d3;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    instance-of p1, p2, Lt23/z2;

    if-eqz p1, :cond_e

    invoke-virtual {v1}, Lj43/b;->invoke()Ljava/lang/Object;

    goto/16 :goto_5

    :cond_8
    instance-of p2, p1, Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;

    if-eqz p2, :cond_d

    check-cast p1, Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object p1

    invoke-static {p1}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v3, v3, Lt23/b4;->U:Lt23/g1;

    iget-object v3, v3, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_9

    const/4 v3, 0x1

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :goto_4
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v6, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "[handleIncomingCallRejectedByMeOrCaller] rejectedByUserId == myUserId :"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ", rejectedByUserId == createdByUserId :"

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v8, v7, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    :cond_b
    if-eqz v3, :cond_c

    invoke-virtual {v2}, La3/z0;->invoke()Ljava/lang/Object;

    goto :goto_5

    :cond_c
    invoke-virtual {v1}, Lj43/b;->invoke()Ljava/lang/Object;

    goto :goto_5

    :cond_d
    instance-of p1, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;

    if-eqz p1, :cond_e

    invoke-virtual {v1}, Lj43/b;->invoke()Ljava/lang/Object;

    :cond_e
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Li20/q0;

    iget-object v0, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v1, Lhb2/c;

    iget-object v2, p2, Li20/q0;->a:Lbc3/c2;

    const/4 v3, 0x0

    if-eqz v2, :cond_f

    invoke-virtual {v2, v3}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_f
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x2

    if-lt v2, v4, :cond_10

    new-instance v2, Lg20/p;

    const/16 v4, 0x12

    invoke-direct {v2, v1, p1, v3, v4}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p2, Li20/q0;->a:Lbc3/c2;

    :cond_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lg/a;

    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Lp1/c1;

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_11

    iget-object p2, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast p2, Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast p2, Lp1/z0;

    iget p1, p1, Lg/a;->c:F

    check-cast p2, Lp1/g1;

    invoke-virtual {p2, p1}, Lp1/g1;->y(F)V

    :cond_11
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lec3/f1;->b(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lj0/h;

    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    instance-of v0, p1, Lj0/f;

    if-eqz v0, :cond_12

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_12
    instance-of v0, p1, Lj0/g;

    if-eqz v0, :cond_13

    check-cast p1, Lj0/g;

    iget-object p1, p1, Lj0/g;->a:Lj0/f;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_13
    instance-of v0, p1, Lj0/d;

    if-eqz v0, :cond_14

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_14
    instance-of v0, p1, Lj0/e;

    if-eqz v0, :cond_15

    check-cast p1, Lj0/e;

    iget-object p1, p1, Lj0/e;->a:Lj0/d;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_15
    instance-of v0, p1, Lj0/l;

    if-eqz v0, :cond_16

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_16
    instance-of v0, p1, Lj0/m;

    if-eqz v0, :cond_17

    check-cast p1, Lj0/m;

    iget-object p1, p1, Lj0/m;->a:Lj0/l;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_17
    instance-of v0, p1, Lj0/k;

    if-eqz v0, :cond_18

    check-cast p1, Lj0/k;

    iget-object p1, p1, Lj0/k;->a:Lj0/l;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_18
    :goto_6
    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/h;

    iget-object p2, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast p2, Lbc3/c0;

    new-instance v0, Ld30/o;

    iget-object v1, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v1, Lg1/z2;

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v3, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p2, v3, v3, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object v1, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v1, Ld30/o;

    iget-object v2, p0, Lec3/f1;->y:Ljava/lang/Object;

    invoke-static {v0, p1, v2, v1, p2}, Lfc3/b;->c(Lq83/j;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_19

    goto :goto_7

    :cond_19
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object p1

    :pswitch_6
    iget-object p2, p0, Lec3/f1;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object v0, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lec3/p1;

    if-eqz v0, :cond_1a

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_8

    :cond_1a
    iget-object v0, p0, Lec3/f1;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lec3/f1;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/t;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    new-instance v2, Lec3/r1;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Lec3/r1;-><init>(Lec3/p1;Lbc3/k1;)V

    new-instance v0, Ll83/n;

    invoke-direct {v0, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
