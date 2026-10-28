.class public final synthetic La01/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, La01/d;->w:I

    iput-object p1, p0, La01/d;->y:Ljava/lang/Object;

    iput-object p2, p0, La01/d;->z:Ljava/lang/Object;

    iput-object p3, p0, La01/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, La01/d;->w:I

    iput-object p1, p0, La01/d;->y:Ljava/lang/Object;

    iput-object p2, p0, La01/d;->z:Ljava/lang/Object;

    iput-object p3, p0, La01/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZII)V
    .locals 0

    .line 3
    iput p6, p0, La01/d;->w:I

    iput-object p1, p0, La01/d;->y:Ljava/lang/Object;

    iput-object p2, p0, La01/d;->x:Ljava/lang/Object;

    iput-object p3, p0, La01/d;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p4, p0, La01/d;->w:I

    iput-object p1, p0, La01/d;->y:Ljava/lang/Object;

    iput-object p2, p0, La01/d;->x:Ljava/lang/Object;

    iput-object p3, p0, La01/d;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 5
    iput p5, p0, La01/d;->w:I

    iput-object p1, p0, La01/d;->z:Ljava/lang/Object;

    iput-object p2, p0, La01/d;->y:Ljava/lang/Object;

    iput-object p3, p0, La01/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 6
    const/16 p4, 0x16

    iput p4, p0, La01/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La01/d;->x:Ljava/lang/Object;

    iput-object p2, p0, La01/d;->y:Ljava/lang/Object;

    iput-object p3, p0, La01/d;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, La01/d;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    iget-object v6, v0, La01/d;->x:Ljava/lang/Object;

    iget-object v7, v0, La01/d;->z:Ljava/lang/Object;

    iget-object v8, v0, La01/d;->y:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v8, Lfm1/a;

    check-cast v7, Lim1/d0;

    check-cast v6, Lfm1/c;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lim1/a1;->h(Lfm1/a;Lim1/d0;Lfm1/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v8, Li20/v0;

    check-cast v7, Li20/k1;

    check-cast v6, Ljava/lang/Integer;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Li20/l1;->c(Li20/v0;Li20/k1;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_1
    check-cast v8, Lk83/a;

    check-cast v6, Li20/k1;

    check-cast v7, Ljava/lang/String;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v6, v7, v1, v2}, Li20/l1;->a(Lk83/a;Li20/k1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_2
    check-cast v8, Li20/v0;

    check-cast v7, Li20/b0;

    check-cast v6, Ljava/lang/Integer;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0xc01

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Li20/l1;->b(Li20/v0;Li20/b0;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_3
    check-cast v8, Landroidx/compose/ui/Modifier;

    check-cast v7, Lb2/f;

    check-cast v6, Lx1/b;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x181

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Li20/l1;->j(Landroidx/compose/ui/Modifier;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_4
    check-cast v8, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    check-cast v7, Lh40/k;

    check-cast v6, Leb/u0;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->z:I

    const/16 v2, 0x9

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-virtual {v8, v7, v6, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->m(Lh40/k;Leb/u0;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_5
    check-cast v8, Ln2/a;

    check-cast v7, Ly2/k;

    check-cast v6, Lb2/h;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lhy0/n;->i(Ln2/a;Ly2/k;Lb2/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v6, v8, v7, v1, v2}, Ltx/f;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_7
    check-cast v7, Ljava/lang/String;

    check-cast v8, Lwz/a1;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v7, v8, v6, v1, v2}, Ltx/f;->m(Ljava/lang/String;Lwz/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_8
    check-cast v8, Lh00/j;

    check-cast v7, Landroidx/compose/ui/Modifier;

    check-cast v6, Lc93/a;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lse/b;->i(Lh00/j;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_9
    check-cast v8, Lkotlin/jvm/internal/d0;

    check-cast v7, Lh0/c3;

    check-cast v6, Lh0/a3;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v8, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v1, v2

    invoke-virtual {v7, v1}, Lh0/c3;->d(F)F

    move-result v1

    invoke-virtual {v7, v1}, Lh0/c3;->h(F)J

    move-result-wide v1

    iget-object v3, v6, Lh0/a3;->a:Lh0/c3;

    iget-object v6, v3, Lh0/c3;->k:Lh0/k2;

    invoke-virtual {v3, v6, v1, v2, v4}, Lh0/c3;->c(Lh0/k2;JI)J

    move-result-wide v1

    invoke-virtual {v7, v1, v2}, Lh0/c3;->g(J)F

    move-result v1

    invoke-virtual {v7, v1}, Lh0/c3;->d(F)F

    move-result v1

    iget v2, v8, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr v2, v1

    iput v2, v8, Lkotlin/jvm/internal/d0;->w:F

    return-object v5

    :pswitch_a
    check-cast v8, Lh0/f1;

    check-cast v7, Lkotlin/jvm/internal/f0;

    check-cast v6, Lv2/c;

    move-object/from16 v1, p1

    check-cast v1, Lu2/r;

    move-object/from16 v2, p2

    check-cast v2, Lh2/b;

    invoke-static {v8}, La3/g;->o(La3/n;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v3

    const-wide/16 v9, 0x0

    invoke-virtual {v3, v9, v10}, Landroidx/compose/ui/node/NodeCoordinator;->S(J)J

    move-result-wide v3

    iget-wide v9, v7, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v3, v4, v9, v10}, Lh2/b;->c(JJ)Z

    move-result v9

    if-nez v9, :cond_0

    iget-wide v9, v7, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v3, v4, v9, v10}, Lh2/b;->g(JJ)J

    move-result-wide v9

    iget-wide v11, v8, Lh0/f1;->X:J

    invoke-static {v11, v12, v9, v10}, Lh2/b;->h(JJ)J

    move-result-wide v9

    iput-wide v9, v8, Lh0/f1;->X:J

    :cond_0
    iput-wide v3, v7, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v3, v8, Lh0/f1;->X:J

    invoke-static {v6, v1, v3, v4}, Lsb3/a;->a(Lv2/c;Lu2/r;J)V

    iget-object v1, v8, Lh0/f1;->U:Ldc3/h;

    if-eqz v1, :cond_1

    new-instance v3, Lh0/h0;

    iget-wide v6, v2, Lh2/b;->a:J

    invoke-direct {v3, v6, v7}, Lh0/h0;-><init>(J)V

    invoke-interface {v1, v3}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v5

    :pswitch_b
    check-cast v8, Lcz/p0;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lbz/i;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v6, v7, v1, v2}, Le4/a;->a(Lcz/p0;Lkotlin/jvm/functions/Function1;Lbz/i;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_c
    check-cast v8, Lcom/whoop/bot/models/feedback/FeedbackReason;

    check-cast v7, Lz1/p;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lgh0/e;->b(Lcom/whoop/bot/models/feedback/FeedbackReason;Lz1/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v8, Lg40/f;

    iget-object v1, v8, Lg40/f;->m:Ljava/util/LinkedHashMap;

    check-cast v7, Lg40/v2;

    check-cast v6, Ljava/util/Map;

    move-object/from16 v9, p1

    check-cast v9, Ljava/lang/String;

    move-object/from16 v10, p2

    check-cast v10, Ljava/util/List;

    const-string v11, "values"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v9, :cond_2

    sget-object v11, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    invoke-interface {v1, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v10, Ljava/lang/Iterable;

    const/16 v9, 0xa

    invoke-static {v10, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-static {v9}, Lm83/g0;->W(I)I

    move-result v9

    const/16 v11, 0x10

    if-ge v9, v11, :cond_3

    move v9, v11

    :cond_3
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll83/k;

    iget-object v12, v10, Ll83/k;->w:Ljava/lang/Object;

    iget-object v10, v10, Ll83/k;->x:Ljava/lang/Object;

    check-cast v10, Ll40/a;

    iget-object v10, v10, Ll40/a;->a:Ljava/lang/String;

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    invoke-interface {v1, v11}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_6

    :cond_5
    move v3, v4

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    if-eqz v6, :cond_8

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v6, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_9

    :cond_8
    const-string v10, ""

    :cond_9
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v8, Lg40/f;->o:Ljava/lang/Boolean;

    if-eqz v7, :cond_b

    iget-object v1, v7, Lg40/v2;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v2, v7, Lg40/v2;->b:Lg40/u2;

    invoke-virtual {v2, v1}, Lg40/u2;->s(Ljava/lang/String;)V

    :cond_a
    move-object v2, v5

    :cond_b
    return-object v2

    :pswitch_e
    check-cast v8, Le32/a;

    check-cast v7, Lc93/a;

    check-cast v6, Lc93/a;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lg32/k;->g(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    check-cast v8, Lx1/b;

    move-object v12, v7

    check-cast v12, Lc93/m;

    move-object/from16 v16, v6

    check-cast v16, Lx1/b;

    move-object/from16 v11, p1

    check-cast v11, Ly2/v1;

    move-object/from16 v14, p2

    check-cast v14, Ly3/a;

    iget-wide v5, v14, Ly3/a;->a:J

    invoke-static {v5, v6}, Ly3/a;->i(J)I

    move-result v18

    sget-object v1, Lg1/d8;->w:Lg1/d8;

    invoke-interface {v11, v1, v8}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    div-int v13, v18, v5

    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    move v7, v3

    :goto_2
    if-ge v7, v6, :cond_c

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    move/from16 p1, v5

    iget-wide v4, v14, Ly3/a;->a:J

    const/16 v24, 0x0

    const/16 v25, 0xc

    const/16 v23, 0x0

    move/from16 v22, v13

    move-wide/from16 v19, v4

    move/from16 v21, v13

    invoke-static/range {v19 .. v25}, Ly3/a;->b(JIIIII)J

    move-result-wide v4

    invoke-interface {v8, v4, v5}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move/from16 v5, p1

    const/4 v4, 0x1

    goto :goto_2

    :cond_c
    move/from16 p1, v5

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_4

    :cond_d
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ly2/j1;

    iget v2, v2, Ly2/j1;->x:I

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    const/4 v9, 0x1

    if-gt v9, v4, :cond_f

    const/4 v9, 0x1

    :goto_3
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ly2/j1;

    iget v6, v6, Ly2/j1;->x:I

    if-ge v2, v6, :cond_e

    move-object v1, v5

    move v2, v6

    :cond_e
    if-eq v9, v4, :cond_f

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_f
    move-object v2, v1

    :goto_4
    check-cast v2, Ly2/j1;

    if-eqz v2, :cond_10

    iget v1, v2, Ly2/j1;->x:I

    move v15, v1

    goto :goto_5

    :cond_10
    move v15, v3

    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_6
    if-ge v3, v2, :cond_11

    new-instance v4, Lg1/w7;

    invoke-interface {v11, v13}, Ly3/c;->e0(I)F

    move-result v5

    int-to-float v6, v3

    mul-float/2addr v5, v6

    invoke-interface {v11, v13}, Ly3/c;->e0(I)F

    move-result v6

    invoke-direct {v4, v5, v6}, Lg1/w7;-><init>(FF)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_11
    new-instance v9, Lg1/a8;

    move-object/from16 v17, v1

    invoke-direct/range {v9 .. v18}, Lg1/a8;-><init>(Ljava/util/ArrayList;Ly2/v1;Lc93/m;ILy3/a;ILx1/b;Ljava/util/ArrayList;I)V

    move/from16 v1, v18

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-interface {v11, v1, v15, v2, v9}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v8, Lcy0/c;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v7, Ljava/lang/String;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v6, v7, v1, v2}, Ley0/i;->b(Lcy0/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v8, Ljava/util/List;

    check-cast v7, Lkotlin/jvm/functions/Function3;

    check-cast v6, Lkotlin/jvm/functions/Function3;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lcp0/p;->o(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v8, Lkotlin/jvm/functions/Function3;

    check-cast v7, Lbc3/c0;

    check-cast v6, Lg1/y3;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->g(Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    check-cast v8, Ll1/g1;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lc93/a;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v6, v7, v1, v2}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->a(Ll1/g1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v8, Landroidx/compose/ui/Modifier;

    check-cast v7, Lc41/i5;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lc41/h5;->c(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v8, Lc41/h3;

    check-cast v7, Lp1/t2;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lc41/f3;->c(Lc41/h3;Lp1/t2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v8, Lp1/c1;

    check-cast v7, Ljava/util/List;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lbm2/z0;->c(Lp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v8, Lcm2/n;

    check-cast v7, Ljava/lang/String;

    check-cast v6, Lp1/c1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lbm2/e0;->e(Lcm2/n;Ljava/lang/String;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v7, Ljava/lang/String;

    check-cast v8, Ljava/lang/String;

    check-cast v6, Ly00/e4;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x201

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v7, v8, v6, v1, v2}, Luf/c0;->s(Ljava/lang/String;Ljava/lang/String;Ly00/e4;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_19
    check-cast v7, Ljava/lang/String;

    check-cast v8, Lc93/a;

    check-cast v6, Lc93/a;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x1

    invoke-static {v9}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v7, v8, v6, v1, v2}, Lse/h;->q(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_1a
    move v9, v4

    check-cast v8, Lb30/q;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, Lse/h;->d(Lb30/q;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object v5

    :pswitch_1b
    check-cast v8, Landroidx/compose/ui/Modifier;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lp1/t2;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v6, v7, v1, v2}, Law0/b;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v8, La01/h;

    check-cast v7, Ljava/lang/String;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v8, v7, v6, v1, v2}, La01/g;->a(La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

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
