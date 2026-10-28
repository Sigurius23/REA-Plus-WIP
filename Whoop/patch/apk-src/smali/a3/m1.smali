.class public final La3/m1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La3/m1;->w:I

    iput-object p1, p0, La3/m1;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lv53/c;Lf63/c;)V
    .locals 0

    const/16 p2, 0x1c

    iput p2, p0, La3/m1;->w:I

    .line 2
    iput-object p1, p0, La3/m1;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, La3/m1;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "args"

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    iget-object v10, v1, La3/m1;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v0, Ljava/lang/Throwable;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast v10, Lbc3/l1;

    new-instance v2, Ljava/util/concurrent/CancellationException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    return-object v9

    :pswitch_0
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    check-cast v10, Lv53/c;

    iget-object v0, v10, Lv53/c;->J:Lad3/z;

    sget-object v2, Lg63/b;->e:Lio/sentry/hints/j;

    invoke-virtual {v0, v2}, Lad3/z;->v(Lio/sentry/hints/j;)V

    :cond_1
    return-object v9

    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    check-cast v10, Lz53/g;

    invoke-virtual {v10}, Lz53/g;->close()V

    return-object v9

    :pswitch_2
    check-cast v0, Lv53/c;

    const-string v2, "scope"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lv53/c;->I:Lo63/f;

    sget-object v3, La63/r;->a:Lo63/a;

    sget-object v4, Lv53/d;->w:Lv53/d;

    invoke-virtual {v2, v3, v4}, Lo63/f;->a(Lo63/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo63/f;

    iget-object v3, v0, Lv53/c;->K:Lv53/e;

    iget-object v3, v3, Lv53/e;->b:Ljava/util/LinkedHashMap;

    check-cast v10, La63/q;

    invoke-interface {v10}, La63/q;->getKey()Lo63/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v10, v3}, La63/q;->a(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v10, v3, v0}, La63/q;->b(Ljava/lang/Object;Lv53/c;)V

    invoke-interface {v10}, La63/q;->getKey()Lo63/a;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lo63/f;->e(Lo63/a;Ljava/lang/Object;)V

    return-object v9

    :pswitch_3
    check-cast v0, La3/p2;

    move-object v2, v0

    check-cast v2, Lb2/v;

    iget-object v2, v2, Lb2/v;->w:Lb2/v;

    iget-boolean v2, v2, Lb2/v;->N:Z

    if-eqz v2, :cond_2

    check-cast v10, Lkotlin/jvm/internal/g0;

    iput-object v0, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move v7, v8

    :cond_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v0, Lo2/b0;

    check-cast v10, Lo2/b;

    invoke-virtual {v10, v0}, Lo2/b;->g(Lo2/b0;)V

    iget-object v2, v10, Lo2/b;->i:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_3

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v9

    :pswitch_5
    check-cast v0, Lk2/e;

    check-cast v10, Ll2/c;

    iget-object v2, v10, Ll2/c;->l:Li2/s0;

    iget-boolean v3, v10, Ll2/c;->n:Z

    if-eqz v3, :cond_4

    iget-boolean v3, v10, Ll2/c;->w:Z

    if-eqz v3, :cond_4

    if-eqz v2, :cond_4

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v3

    invoke-virtual {v3}, La3/p;->A()J

    move-result-wide v4

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v6

    invoke-interface {v6}, Li2/v;->q()V

    :try_start_0
    iget-object v6, v3, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    invoke-virtual {v6, v2, v7}, Laj/d;->b(Li2/s0;I)V

    invoke-virtual {v10, v0}, Ll2/c;->c(Lk2/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    throw v0

    :cond_4
    invoke-virtual {v10, v0}, Ll2/c;->c(Lk2/e;)V

    :goto_1
    return-object v9

    :pswitch_6
    check-cast v0, Ljk/a;

    const-string v2, "event"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Ljk/a;->N:Ljava/util/LinkedHashMap;

    if-eqz v2, :cond_5

    invoke-static {v2}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    goto :goto_2

    :cond_5
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_2
    const-string v3, "[Guides-Surveys] Library"

    const-string v4, "amplitude-engagement-android/1.8.0"

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, v0, Ljk/a;->N:Ljava/util/LinkedHashMap;

    check-cast v10, Lkj/b;

    iget-object v2, v10, Lkj/b;->x:Lgj/d;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v0}, Lgj/d;->h(Ljk/a;)V

    return-object v9

    :cond_6
    const-string v0, "amplitude"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :pswitch_7
    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v0}, Lm83/n;->y0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    :try_start_1
    sget-object v2, Lij/l;->y:Lij/l;

    sget-object v3, Lad3/c;->d:Lad3/b;

    invoke-static {v3, v2}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v2

    sget-object v3, Lcom/amplitude/android/engagement/types/SimulationContext;->Companion:Lcom/amplitude/android/engagement/types/e1;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/e1;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {v2, v3, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amplitude/android/engagement/types/SimulationContext;

    check-cast v10, Lwe/o;

    iget-object v2, v10, Lwe/o;->x:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/a;

    iget-object v2, v2, Lcom/amplitude/android/engagement/a;->i:Lec3/h2;

    invoke-virtual {v2, v0}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to decode SimulationContext: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    move v7, v8

    :goto_3
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_5
    return-object v0

    :pswitch_8
    check-cast v0, [Ljava/lang/Object;

    check-cast v10, Lij/n;

    iget-object v2, v10, Lij/n;->a:Ljava/util/ArrayList;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v3, v0

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    aget-object v0, v0, v8

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v4, "IntegrationsBridge: track() called with args: "

    invoke-static {v4, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    :try_start_2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lhg3/i;->m0(Lorg/json/JSONObject;)Ljk/a;

    move-result-object v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "IntegrationsBridge: event: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", integrations: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :catch_1
    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v3, "IntegrationsBridge: Failed to construct BaseEvent from provided event jsonString="

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    :cond_a
    :goto_7
    return-object v6

    :pswitch_9
    check-cast v0, [Ljava/lang/Object;

    move-object v15, v10

    check-cast v15, Lij/f;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v2, v0, v8

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v0, v7

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_3
    iget-object v3, v15, Lij/f;->e:Lad3/r;

    invoke-virtual {v3, v0}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v14

    iget-object v0, v15, Lij/f;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lij/b;

    if-nez v12, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "No handler registered for function: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v13, v0}, Lij/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_b
    new-instance v0, Ljava/lang/Thread;

    new-instance v11, Lij/a;

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v16}, Lij/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v0, v11}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse arguments JSON: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v13, v0}, Lij/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_8
    return-object v6

    :pswitch_a
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B

    move-result v0

    check-cast v10, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    if-ne v0, v2, :cond_c

    const-string v0, "%20"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_c
    sget-object v2, Li63/a;->a:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    sget-object v2, Li63/a;->d:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_9

    :cond_d
    invoke-static {v0}, Li63/a;->a(B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_e
    :goto_9
    int-to-char v0, v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_a
    return-object v9

    :pswitch_b
    check-cast v0, Li3/z;

    check-cast v10, Ljava/lang/String;

    invoke-static {v10, v0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v9

    :pswitch_c
    check-cast v0, Li3/z;

    check-cast v10, Li3/i;

    iget v2, v10, Li3/i;->a:I

    invoke-static {v0, v2}, Li3/w;->i(Li3/z;I)V

    return-object v9

    :pswitch_d
    check-cast v0, Li2/g0;

    check-cast v10, Li2/b1;

    iget v2, v10, Li2/b1;->O:F

    check-cast v0, Li2/x0;

    invoke-virtual {v0, v2}, Li2/x0;->p(F)V

    iget v2, v10, Li2/b1;->P:F

    invoke-virtual {v0, v2}, Li2/x0;->r(F)V

    iget v2, v10, Li2/b1;->Q:F

    invoke-virtual {v0, v2}, Li2/x0;->a(F)V

    iget v2, v10, Li2/b1;->R:F

    invoke-virtual {v0, v2}, Li2/x0;->C(F)V

    iget v2, v10, Li2/b1;->S:F

    invoke-virtual {v0, v2}, Li2/x0;->E(F)V

    iget v2, v10, Li2/b1;->T:F

    invoke-virtual {v0, v2}, Li2/x0;->s(F)V

    invoke-virtual {v0, v3}, Li2/x0;->k(F)V

    iget v2, v10, Li2/b1;->U:F

    invoke-virtual {v0, v2}, Li2/x0;->n(F)V

    iget v2, v10, Li2/b1;->V:F

    invoke-virtual {v0, v2}, Li2/x0;->o(F)V

    iget v2, v10, Li2/b1;->W:F

    invoke-virtual {v0, v2}, Li2/x0;->c(F)V

    iget-wide v2, v10, Li2/b1;->X:J

    invoke-virtual {v0, v2, v3}, Li2/x0;->y(J)V

    iget-object v2, v10, Li2/b1;->Y:Li2/a1;

    invoke-virtual {v0, v2}, Li2/x0;->t(Li2/a1;)V

    iget-boolean v2, v10, Li2/b1;->Z:Z

    invoke-virtual {v0, v2}, Li2/x0;->e(Z)V

    iget-object v2, v10, Li2/b1;->a0:Lal/a;

    invoke-virtual {v0, v2}, Li2/x0;->g(Lal/a;)V

    iget-wide v2, v10, Li2/b1;->b0:J

    invoke-virtual {v0, v2, v3}, Li2/x0;->b(J)V

    iget-wide v2, v10, Li2/b1;->c0:J

    invoke-virtual {v0, v2, v3}, Li2/x0;->v(J)V

    iget v2, v10, Li2/b1;->d0:I

    invoke-virtual {v0, v2}, Li2/x0;->f(I)V

    iget v2, v10, Li2/b1;->e0:I

    iget v3, v0, Li2/x0;->V:I

    if-ne v3, v2, :cond_f

    goto :goto_b

    :cond_f
    iget v3, v0, Li2/x0;->w:I

    const/high16 v4, 0x80000

    or-int/2addr v3, v4

    iput v3, v0, Li2/x0;->w:I

    iput v2, v0, Li2/x0;->V:I

    :goto_b
    return-object v9

    :pswitch_e
    check-cast v0, Leb/q;

    const-string v2, "entry"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lhb/f;

    new-instance v2, Landroidx/lifecycle/y;

    invoke-direct {v2, v4, v10, v0}, Landroidx/lifecycle/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :pswitch_f
    check-cast v0, Lgj/h;

    const-string v2, "$this$$receiver"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lgj/g;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    iget-boolean v3, v0, Lgj/h;->a:Z

    if-eqz v3, :cond_10

    sget-object v3, Lgj/e;->w:Lgj/e;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_10
    iget-boolean v3, v0, Lgj/h;->b:Z

    if-eqz v3, :cond_11

    sget-object v3, Lgj/e;->x:Lgj/e;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-boolean v3, v0, Lgj/h;->c:Z

    if-eqz v3, :cond_12

    sget-object v3, Lgj/e;->y:Lgj/e;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_12
    iget-boolean v0, v0, Lgj/h;->d:Z

    if-eqz v0, :cond_13

    sget-object v0, Lgj/e;->z:Lgj/e;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_13
    iput-object v2, v10, Lgj/g;->r:Ljava/util/Set;

    return-object v9

    :pswitch_10
    check-cast v0, Li2/g0;

    check-cast v10, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    iget v2, v10, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    check-cast v0, Li2/x0;

    invoke-virtual {v0}, Li2/x0;->getDensity()F

    move-result v3

    mul-float/2addr v3, v2

    invoke-virtual {v0, v3}, Li2/x0;->s(F)V

    iget-object v2, v10, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    invoke-virtual {v0, v2}, Li2/x0;->t(Li2/a1;)V

    iget-boolean v2, v10, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    invoke-virtual {v0, v2}, Li2/x0;->e(Z)V

    iget-wide v2, v10, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    invoke-virtual {v0, v2, v3}, Li2/x0;->b(J)V

    iget-wide v2, v10, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    invoke-virtual {v0, v2, v3}, Li2/x0;->v(J)V

    return-object v9

    :pswitch_11
    check-cast v0, Ljava/lang/String;

    const-string v2, "argName"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroid/os/Bundle;

    invoke-virtual {v10, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    xor-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v0, Li2/g0;

    check-cast v10, Lp1/t2;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    check-cast v0, Li2/x0;

    invoke-virtual {v0, v2}, Li2/x0;->a(F)V

    return-object v9

    :pswitch_13
    check-cast v0, Ld0/q;

    iget v2, v0, Ld0/q;->b:F

    cmpg-float v4, v2, v3

    if-gez v4, :cond_14

    move v2, v3

    :cond_14
    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v5, v2, v4

    if-lez v5, :cond_15

    move v2, v4

    :cond_15
    iget v5, v0, Ld0/q;->c:F

    const/high16 v6, -0x41000000    # -0.5f

    cmpg-float v7, v5, v6

    if-gez v7, :cond_16

    move v5, v6

    :cond_16
    const/high16 v7, 0x3f000000    # 0.5f

    cmpl-float v8, v5, v7

    if-lez v8, :cond_17

    move v5, v7

    :cond_17
    iget v8, v0, Ld0/q;->d:F

    cmpg-float v9, v8, v6

    if-gez v9, :cond_18

    goto :goto_c

    :cond_18
    move v6, v8

    :goto_c
    cmpl-float v8, v6, v7

    if-lez v8, :cond_19

    goto :goto_d

    :cond_19
    move v7, v6

    :goto_d
    iget v0, v0, Ld0/q;->a:F

    cmpg-float v6, v0, v3

    if-gez v6, :cond_1a

    goto :goto_e

    :cond_1a
    move v3, v0

    :goto_e
    cmpl-float v0, v3, v4

    if-lez v0, :cond_1b

    goto :goto_f

    :cond_1b
    move v4, v3

    :goto_f
    sget-object v0, Lj2/d;->x:Lj2/l;

    invoke-static {v2, v5, v7, v4, v0}, Li2/w0;->b(FFFFLj2/c;)J

    move-result-wide v2

    check-cast v10, Lj2/c;

    invoke-static {v2, v3, v10}, Li2/x;->b(JLj2/c;)J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    return-object v0

    :pswitch_14
    check-cast v0, Ly2/i1;

    check-cast v10, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v8

    :goto_10
    if-ge v3, v2, :cond_1c

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/j1;

    invoke-static {v4, v8, v8, v0}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    :cond_1c
    return-object v9

    :pswitch_15
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v0, Lk2/e;

    check-cast v10, Lb3/f2;

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v2

    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v2

    iget-object v3, v10, Lb3/f2;->z:Lc93/m;

    if-eqz v3, :cond_1d

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v0

    iget-object v0, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ll2/c;

    invoke-interface {v3, v2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1d
    return-object v9

    :pswitch_17
    sget-object v0, Lb3/e2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v8, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1e

    check-cast v10, Ldc3/h;

    invoke-interface {v10, v9}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    return-object v9

    :pswitch_18
    check-cast v0, Lp1/i0;

    check-cast v10, Lb3/y1;

    new-instance v0, Lb3/q0;

    invoke-direct {v0, v10, v8}, Lb3/q0;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_19
    check-cast v0, Landroid/content/res/Configuration;

    check-cast v10, Lp1/c1;

    new-instance v2, Landroid/content/res/Configuration;

    invoke-direct {v2, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-interface {v10, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v9

    :pswitch_1a
    check-cast v0, Ljava/lang/Throwable;

    check-cast v10, Lbc3/e2;

    if-eqz v0, :cond_1f

    const-string v2, "Engine failed"

    invoke-static {v2, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-virtual {v10, v0}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_11

    :cond_1f
    invoke-virtual {v10}, Lbc3/l1;->complete()Z

    :goto_11
    return-object v9

    :pswitch_1b
    check-cast v0, La63/l;

    const-string v2, "$this$HttpResponseValidator"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lv53/e;

    iget-boolean v2, v10, Lv53/e;->g:Z

    iput-boolean v2, v0, La63/l;->c:Z

    new-instance v2, La63/f;

    invoke-direct {v2, v4, v6}, Ls83/i;-><init>(ILq83/d;)V

    iget-object v0, v0, La63/l;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v9

    :pswitch_1c
    check-cast v0, Lb2/u;

    check-cast v10, Lr1/c;

    invoke-virtual {v10, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
