.class public final synthetic Leg/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Leg/j;->w:I

    iput-object p1, p0, Leg/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Leg/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lha0/g;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lha0/g;->h(Lha0/g;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lha0/c;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lha0/c;->f(Lha0/c;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lh0/z3;

    check-cast p1, Lh2/b;

    iget-object p1, v0, Lh0/z3;->R:Lgo1/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lcz0/e;

    check-cast p1, Lu2/r;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v1

    new-instance v3, Lh2/b;

    invoke-direct {v3, v1, v2}, Lh2/b;-><init>(J)V

    invoke-virtual {v0, p1, v3}, Lcz0/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lu2/r;->a()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/feedback/FeedbackReason;

    check-cast p1, Lcom/whoop/bot/models/feedback/FeedbackReason;

    invoke-static {v0, p1}, Lgh0/e;->c(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/b3;

    check-cast p1, Ll40/a;

    const-string v1, "formFieldEntry"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/v2;

    check-cast p1, Ll40/a;

    const-string v1, "formFieldEntry"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lg40/v2;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg2/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0}, Lg2/s;->b()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/o1;

    check-cast p1, Ljava/lang/String;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lg40/o1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll40/a;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x6

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v1, p1, v2}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/e0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, v0, Lg40/e0;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll40/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/d0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-boolean p1, v0, Lg40/d0;->b:Z

    if-eqz p1, :cond_1

    new-instance p1, Lg40/f1;

    const v0, 0x7f141008

    invoke-direct {p1, v0, v1}, Lg40/f1;-><init>(ILjava/util/List;)V

    move-object v1, p1

    :cond_1
    return-object v1

    :pswitch_a
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/t;

    check-cast p1, Lg40/y;

    const-string v1, "event"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lg40/t;->p:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll40/a;

    iget-object v3, v3, Ll40/a;->a:Ljava/lang/String;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Lg40/y;->a()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, Lm83/z;->w:Lm83/z;

    :cond_3
    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    instance-of v3, p1, Lg40/x;

    if-nez v3, :cond_5

    instance-of p1, p1, Lg40/w;

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, v0, Lg40/t;->k:Z

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_2
    iget-boolean p1, v0, Lg40/t;->k:Z

    invoke-virtual {v0, p1, v1}, Lg40/t;->v(ZLjava/util/Map;)Lg40/m;

    move-result-object p1

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lg40/t;->o:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/f;

    iget-object v2, v2, Lg40/f;->c:Lg40/m;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_7

    iget-object v2, v0, Lg40/t;->b:Lg40/r0;

    invoke-virtual {v2, p1}, Lg40/r0;->s(Ljava/lang/String;)V

    :cond_7
    iget-object p1, v0, Lg40/t;->n:Lec3/h2;

    iget-boolean v2, v0, Lg40/t;->k:Z

    invoke-virtual {v0, v2, v1}, Lg40/t;->v(ZLjava/util/Map;)Lg40/m;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lg40/t;->u(Ljava/util/Map;Lg40/m;)Lg40/f;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg40/f;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    iget-object v1, v0, Lg40/f;->l:Lg40/a2;

    iget-object v1, v1, Lg40/a2;->c:Lg40/z1;

    iget-object v1, v1, Lg40/z1;->j:Lg40/r0;

    invoke-virtual {v1, p1}, Lg40/r0;->s(Ljava/lang/String;)V

    :cond_9
    iget-object v1, v0, Lg40/f;->n:Lqg3/d;

    if-eqz p1, :cond_a

    iget-object v1, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    goto :goto_3

    :cond_a
    iget-object v1, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    :goto_3
    if-nez v1, :cond_b

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_b
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    iget-object v4, v0, Lg40/f;->c:Lg40/m;

    iget-boolean v5, v0, Lg40/f;->e:Z

    const-string v6, "field"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "addressInputMode"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    instance-of v6, v3, Lg40/c3;

    const/4 v7, 0x0

    if-eqz v6, :cond_c

    move-object v6, v3

    check-cast v6, Lg40/c3;

    goto :goto_5

    :cond_c
    move-object v6, v7

    :goto_5
    if-eqz v6, :cond_d

    iget-object v6, v6, Lg40/c3;->c:Lg40/m3;

    goto :goto_6

    :cond_d
    move-object v6, v7

    :goto_6
    instance-of v8, v6, Lg40/f3;

    if-eqz v8, :cond_e

    check-cast v6, Lg40/f3;

    goto :goto_7

    :cond_e
    move-object v6, v7

    :goto_7
    if-eqz v6, :cond_f

    iget-object v6, v6, Lg40/f3;->a:Lg40/l3;

    goto :goto_8

    :cond_f
    move-object v6, v7

    :goto_8
    instance-of v8, v6, Lg40/d3;

    if-eqz v8, :cond_10

    check-cast v6, Lg40/d3;

    goto :goto_9

    :cond_10
    move-object v6, v7

    :goto_9
    if-eqz v6, :cond_14

    instance-of v8, v4, Le40/c;

    if-eqz v8, :cond_11

    move-object v8, v4

    check-cast v8, Le40/c;

    goto :goto_a

    :cond_11
    move-object v8, v7

    :goto_a
    if-eqz v8, :cond_12

    invoke-interface {v8, p1, v5}, Le40/c;->f(Ljava/lang/String;Z)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_b

    :cond_12
    move-object v5, v7

    :goto_b
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    new-instance v7, Lg40/q3;

    const v5, 0x7f140fa6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v8, Ld1/i;

    const/16 v9, 0x19

    invoke-direct {v8, v4, v9}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    const v4, 0x7f08084b

    const/4 v9, 0x1

    invoke-direct {v7, v4, v5, v9, v8}, Lg40/q3;-><init>(ILjava/lang/Integer;ZLc93/a;)V

    :cond_13
    iget-object v4, v6, Lg40/d3;->z:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4, v7}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_14
    iget-object v4, v0, Lg40/f;->b:Ljava/util/Map;

    invoke-interface {v3, v4}, Lg40/y2;->h(Ljava/util/Map;)V

    goto/16 :goto_4

    :cond_15
    check-cast v1, Ljava/util/List;

    return-object v1

    :pswitch_c
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg1/l6;

    check-cast p1, Lg1/v2;

    iget-object p1, p1, Lg1/v2;->a:Ljava/lang/Object;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg1/q2;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    invoke-virtual {v0}, Lg1/q2;->a()Ly3/c;

    move-result-object p1

    sget v0, Lg1/p2;->a:F

    invoke-interface {p1, v0}, Ly3/c;->q0(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lg1/s0;

    check-cast p1, Ly3/c;

    iget-object p1, v0, Lg1/s0;->a:Lg1/a0;

    invoke-virtual {p1}, Lg1/a0;->g()F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    const/4 v0, 0x0

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_f
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lgy2/a;

    check-cast p1, Lcy2/a;

    invoke-static {v0, p1}, Lfy2/a;->h(Lgy2/a;Lcy2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lfu2/d;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-static {v0, p1}, Lfu2/d;->d(Lfu2/d;Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    check-cast p1, Lii/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lii/b;->getCacheKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lrh/j;

    check-cast p1, Lfi/i;

    return-object v0

    :pswitch_13
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lqt/e;

    check-cast p1, Lfg/o;

    const-string v1, "<this>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lfg/j;

    check-cast p1, Lfg/h;

    const-string v1, "<this>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lfg/i;

    if-eqz v1, :cond_16

    check-cast p1, Lfg/i;

    iget-wide v1, v0, Lfg/j;->a:J

    iput-wide v1, p1, Lfg/i;->a:J

    iget-wide v1, v0, Lfg/j;->b:D

    iput-wide v1, p1, Lfg/i;->b:D

    iget-wide v1, v0, Lfg/j;->c:D

    iput-wide v1, p1, Lfg/i;->c:D

    iget-wide v0, v0, Lfg/j;->d:J

    iput-wide v0, p1, Lfg/i;->d:J

    :cond_16
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lfg/b;

    check-cast p1, Lfg/l;

    const-string v1, "<this>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lfg/a;

    if-eqz v1, :cond_17

    check-cast p1, Lfg/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, v0, Lfg/b;->a:J

    iput-wide v1, p1, Lfg/a;->a:J

    iget-wide v1, v0, Lfg/b;->b:D

    iput-wide v1, p1, Lfg/a;->b:D

    iget-wide v1, v0, Lfg/b;->c:D

    iput-wide v1, p1, Lfg/a;->c:D

    iget-wide v1, v0, Lfg/b;->d:D

    iput-wide v1, p1, Lfg/a;->d:D

    iget-wide v0, v0, Lfg/b;->e:D

    iput-wide v0, p1, Lfg/a;->e:D

    :cond_17
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_16
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lbe0/b;

    check-cast p1, Lbe0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->y(Lbe0/b;Lbe0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lzc0/b;

    check-cast p1, Lzc0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->G(Lzc0/b;Lzc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;

    invoke-static {v0, p1}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->z(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lbp1/c;

    check-cast p1, Lbp1/b;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->A(Lbp1/c;Lbp1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    check-cast p1, Lkb1/e;

    invoke-static {v0, p1}, Lep1/h;->c(Ljava/util/LinkedHashMap;Lkb1/e;)Lqy0/a;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/health/view/HealthTabFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/whoop/health/view/HealthTabFragment;->z(Lcom/whoop/health/view/HealthTabFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Leg/j;->x:Ljava/lang/Object;

    check-cast v0, Lae3/k;

    check-cast p1, Leg/k;

    const-string v1, "<this>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, Lfg/k;

    iget-object v2, p1, Leg/k;->a:Ljc/b0;

    invoke-virtual {v2, v1}, Ljc/b0;->a(Ljava/lang/Object;)V

    iget v1, v0, Lae3/k;->b:I

    iput v1, p1, Leg/k;->b:I

    iget-object v0, v0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v0, Lfg/n;

    iget-object p1, p1, Leg/k;->c:Ljc/b0;

    invoke-virtual {p1, v0}, Ljc/b0;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

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
