.class final Liw1/h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liw1/h$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.extensions.presentation.ExtensionsViewModel$sendViewEvent$1"
    f = "ExtensionsViewModel.kt"
    l = {
        0x6c,
        0x6d,
        0x6f,
        0x71,
        0x75,
        0x7d,
        0x85,
        0x94,
        0xa6,
        0xa8,
        0xab,
        0xb2,
        0xb3,
        0xb4,
        0xb5,
        0xb6,
        0xb8,
        0xc6,
        0xcb,
        0xd5,
        0xe4
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field final synthetic G:Liw1/h;

.field final synthetic H:Liw1/g;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Ljava/lang/Boolean;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Liw1/h;Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw1/h;",
            "Liw1/g;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lq83/d<",
            "-",
            "Liw1/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liw1/h$a;->G:Liw1/h;

    iput-object p2, p0, Liw1/h$a;->H:Liw1/g;

    iput-object p3, p0, Liw1/h$a;->I:Ljava/lang/String;

    iput-object p4, p0, Liw1/h$a;->J:Ljava/lang/Boolean;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Liw1/h$a;

    iget-object v1, p0, Liw1/h$a;->G:Liw1/h;

    iget-object v2, p0, Liw1/h$a;->H:Liw1/g;

    iget-object v3, p0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v4, p0, Liw1/h$a;->J:Ljava/lang/Boolean;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Liw1/h$a;-><init>(Liw1/h;Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Liw1/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liw1/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liw1/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liw1/h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Liw1/h$a;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Liw1/h$a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Liw1/h$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_1
    iget-object v1, v0, Liw1/h$a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Liw1/h$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_3
    iget-object v1, v0, Liw1/h$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iget-object v1, v0, Liw1/h$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_e
    iget-object v1, v0, Liw1/h$a;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/CheckoutScreenModel;

    iget-object v1, v0, Liw1/h$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/AppScreen;

    iget-object v1, v0, Liw1/h$a;->w:Ljava/lang/Object;

    check-cast v1, Ljx1/v;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_f
    iget-object v1, v0, Liw1/h$a;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/CheckoutScreenModel;

    iget-object v1, v0, Liw1/h$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/AppScreen;

    iget-object v1, v0, Liw1/h$a;->w:Ljava/lang/Object;

    check-cast v1, Ljx1/v;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_10
    iget-object v1, v0, Liw1/h$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_13
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_14
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    iget-object v4, v0, Liw1/h$a;->H:Liw1/g;

    invoke-static {v2, v4}, Liw1/h;->n(Liw1/h;Liw1/g;)V

    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    instance-of v4, v2, Liw1/j$c;

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$e;

    iget-object v6, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v7, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v6, v7}, Lfw1/b$e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_0
    instance-of v4, v2, Liw1/j$e;

    const/4 v6, 0x2

    if-eqz v4, :cond_1

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$j;

    iget-object v5, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v5, Liw1/j$e;

    invoke-virtual {v5}, Liw1/j$e;->a()I

    move-result v5

    invoke-direct {v4, v5}, Lfw1/b$j;-><init>(I)V

    iput v6, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_1
    instance-of v4, v2, Liw1/j$d;

    const/4 v7, 0x3

    if-eqz v4, :cond_2

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$h;

    iget-object v5, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v5, Liw1/j$d;

    invoke-virtual {v5}, Liw1/j$d;->a()Ljx1/v;

    move-result-object v5

    invoke-direct {v4, v5}, Lfw1/b$h;-><init>(Ljx1/v;)V

    iput v7, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_2
    instance-of v4, v2, Liw1/j$a;

    const/4 v8, 0x4

    if-eqz v4, :cond_3

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$e;

    iget-object v5, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v6, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v6}, Lfw1/b$e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    iput v8, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_3
    instance-of v4, v2, Liw1/j$b;

    const-string v9, "new_tier"

    const-string v10, ""

    const-string v11, "sku"

    const-string v12, "promo_code"

    const/4 v13, 0x5

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v4, :cond_c

    check-cast v2, Liw1/j$b;

    invoke-virtual {v2}, Liw1/j$b;->a()Ljx1/v;

    move-result-object v2

    invoke-virtual {v2}, Ljx1/v;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v4}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v4

    new-instance v5, Lfw1/b$f;

    sget-object v6, Lfw1/h;->REACTIVATION:Lfw1/h;

    invoke-direct {v5, v2, v6}, Lfw1/b$f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Lfw1/h;)V

    iput-object v15, v0, Liw1/h$a;->w:Ljava/lang/Object;

    iput v14, v0, Liw1/h$a;->z:I

    iput v13, v0, Liw1/h$a;->F:I

    invoke-interface {v4, v5, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_4
    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v2, Liw1/j$b;

    invoke-virtual {v2}, Liw1/j$b;->a()Ljx1/v;

    move-result-object v2

    invoke-virtual {v2}, Ljx1/v;->b()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v4

    instance-of v4, v4, Lcom/whoop/navigation/AppScreen$g1;

    if-eqz v4, :cond_b

    invoke-virtual {v2}, Ljx1/v;->b()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/navigation/CheckoutScreenModel;

    if-eqz v4, :cond_5

    check-cast v2, Lcom/whoop/navigation/CheckoutScreenModel;

    goto :goto_0

    :cond_5
    move-object v2, v15

    :goto_0
    if-eqz v2, :cond_29

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getSkipConfirmation()Ljava/lang/Boolean;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v4}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v4

    new-instance v16, Lfw1/b$b;

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPath()Ljava/lang/String;

    move-result-object v17

    new-instance v5, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    move-object v10, v6

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-direct {v5, v10, v6, v7}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/String;

    const/16 v21, 0x8

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v5

    invoke-direct/range {v16 .. v22}, Lfw1/b$b;-><init>(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    iput-object v15, v0, Liw1/h$a;->w:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->x:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->y:Ljava/lang/Object;

    iput v14, v0, Liw1/h$a;->z:I

    const/4 v5, 0x6

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v4, v2, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_7
    invoke-static {v4}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_9

    new-instance v9, Ll83/k;

    invoke-direct {v9, v8, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    move-object v9, v15

    :goto_3
    if-eqz v9, :cond_8

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    invoke-static {v6}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v17

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPath()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/String;

    new-instance v16, Lfw1/b$d;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x38

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v24}, Lfw1/b$d;-><init>(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    iput-object v15, v0, Liw1/h$a;->w:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->x:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->y:Ljava/lang/Object;

    iput v14, v0, Liw1/h$a;->z:I

    const/4 v5, 0x7

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v4, v2, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_b
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    new-instance v4, Lhw1/a$b;

    invoke-virtual {v2}, Ljx1/v;->b()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-direct {v4, v2}, Lhw1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {v1, v4}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_c
    instance-of v4, v2, Liw1/c$e;

    if-eqz v4, :cond_d

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$c;

    iget-object v5, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v6, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v6}, Lfw1/b$c;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    const/16 v5, 0x8

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_d
    instance-of v4, v2, Liw1/c$a;

    if-eqz v4, :cond_f

    check-cast v2, Liw1/c$a;

    invoke-virtual {v2}, Liw1/c$a;->a()Llw1/i;

    move-result-object v1

    invoke-virtual {v1}, Llw1/i;->e()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/navigation/CheckoutScreenModel;

    if-eqz v2, :cond_29

    check-cast v1, Lcom/whoop/navigation/CheckoutScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_e

    goto :goto_4

    :cond_e
    move-object v10, v2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v11, Lfw1/b$a;

    new-instance v12, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-direct {v12, v10, v2, v4}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPath()Ljava/lang/String;

    move-result-object v13

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lfw1/b$a;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_f
    instance-of v4, v2, Liw1/c$c;

    if-eqz v4, :cond_10

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    check-cast v2, Liw1/c$c;

    invoke-virtual {v2}, Liw1/c$c;->a()Llw1/i;

    move-result-object v2

    const/16 v5, 0x9

    iput v5, v0, Liw1/h$a;->F:I

    invoke-static {v4, v2, v0}, Liw1/h;->l(Liw1/h;Llw1/i;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_10
    instance-of v4, v2, Liw1/c$d;

    if-eqz v4, :cond_11

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    check-cast v2, Liw1/c$d;

    invoke-virtual {v2}, Liw1/c$d;->a()Llw1/i;

    move-result-object v2

    const/16 v5, 0xa

    iput v5, v0, Liw1/h$a;->F:I

    invoke-static {v4, v2, v0}, Liw1/h;->o(Liw1/h;Llw1/i;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_11
    instance-of v4, v2, Liw1/c$b;

    if-eqz v4, :cond_17

    check-cast v2, Liw1/c$b;

    invoke-virtual {v2}, Liw1/c$b;->a()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object v2

    sget-object v4, Liw1/h$a$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    if-eq v2, v5, :cond_16

    if-eq v2, v6, :cond_15

    if-eq v2, v7, :cond_14

    if-eq v2, v8, :cond_13

    if-ne v2, v13, :cond_12

    goto/16 :goto_6

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_13
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    new-instance v2, Lhw1/a$b;

    new-instance v8, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v10, Lcom/whoop/navigation/HomeScreenModel;

    invoke-direct {v10, v15, v15, v7, v15}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v8}, Lhw1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_14
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    sget-object v2, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_15
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    sget-object v2, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_16
    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$c;

    iget-object v5, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v6, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v6}, Lfw1/b$c;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    const/16 v5, 0xb

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_17
    instance-of v4, v2, Liw1/a$e;

    if-eqz v4, :cond_18

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    iget-object v4, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v4, Liw1/a$e;

    invoke-virtual {v4}, Liw1/a$e;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v6

    iget-object v4, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v4, Liw1/a$e;

    invoke-virtual {v4}, Liw1/a$e;->c()Ljava/lang/String;

    move-result-object v8

    iget-object v4, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v4, Liw1/a$e;

    invoke-virtual {v4}, Liw1/a$e;->a()Ljava/lang/String;

    move-result-object v7

    new-instance v5, Lfw1/b$a;

    const/16 v12, 0x38

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lfw1/b$a;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v4, 0xc

    iput v4, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v5, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_18
    instance-of v4, v2, Liw1/a$c;

    if-eqz v4, :cond_19

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$c;

    iget-object v5, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v6, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v6}, Lfw1/b$c;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    const/16 v5, 0xd

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_19
    instance-of v4, v2, Liw1/a$b;

    if-eqz v4, :cond_1a

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$e;

    iget-object v5, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v6, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v6}, Lfw1/b$e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    const/16 v5, 0xe

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_1a
    instance-of v4, v2, Liw1/a$g;

    if-eqz v4, :cond_1b

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$k;

    iget-object v5, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v5, Liw1/a$g;

    invoke-virtual {v5}, Liw1/a$g;->a()Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Lfw1/b$k;-><init>(Ljava/util/List;)V

    const/16 v5, 0xf

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_1b
    instance-of v4, v2, Liw1/a$f;

    if-eqz v4, :cond_1c

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$i;

    iget-object v5, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v5, Liw1/a$f;

    invoke-virtual {v5}, Liw1/a$f;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v5

    invoke-direct {v4, v5}, Lfw1/b$i;-><init>(Lcom/whoop/payments/domain/models/Card;)V

    const/16 v5, 0x10

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_1c
    instance-of v4, v2, Liw1/a$d;

    if-eqz v4, :cond_1d

    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$g;

    iget-object v5, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v5, Liw1/a$d;

    invoke-virtual {v5}, Liw1/a$d;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v5

    iget-object v6, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v6, Liw1/a$d;

    invoke-virtual {v6}, Liw1/a$d;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v7, Liw1/a$d;

    invoke-virtual {v7}, Liw1/a$d;->c()Llw1/j;

    move-result-object v7

    invoke-virtual {v7}, Llw1/j;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v7

    iget-object v8, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v8, Liw1/a$d;

    invoke-virtual {v8}, Liw1/a$d;->a()Ljava/util/List;

    move-result-object v8

    iget-object v9, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v9, Liw1/a$d;

    invoke-virtual {v9}, Liw1/a$d;->e()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v4 .. v9}, Lfw1/b$g;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;)V

    const/16 v5, 0x11

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_1d
    instance-of v4, v2, Liw1/a$a;

    if-eqz v4, :cond_23

    check-cast v2, Liw1/a$a;

    invoke-virtual {v2}, Liw1/a$a;->a()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object v2

    sget-object v4, Liw1/h$a$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    if-eq v2, v5, :cond_22

    if-eq v2, v6, :cond_21

    if-eq v2, v7, :cond_20

    if-eq v2, v8, :cond_1f

    if-ne v2, v13, :cond_1e

    goto/16 :goto_6

    :cond_1e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1f
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    new-instance v2, Lhw1/a$b;

    new-instance v8, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v10, Lcom/whoop/navigation/HomeScreenModel;

    invoke-direct {v10, v15, v15, v7, v15}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v8}, Lhw1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_20
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    sget-object v2, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_21
    iget-object v2, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v2}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v2

    new-instance v4, Lfw1/b$c;

    iget-object v5, v0, Liw1/h$a;->I:Ljava/lang/String;

    iget-object v6, v0, Liw1/h$a;->J:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v6}, Lfw1/b$c;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    const/16 v5, 0x13

    iput v5, v0, Liw1/h$a;->F:I

    invoke-interface {v2, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_22
    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v2, Liw1/a$a;

    invoke-virtual {v2}, Liw1/a$a;->b()Liw1/b;

    move-result-object v2

    invoke-interface {v2}, Liw1/b;->getPath()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_29

    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    check-cast v2, Liw1/a$a;

    invoke-virtual {v2}, Liw1/a$a;->b()Liw1/b;

    move-result-object v5

    invoke-interface {v5}, Liw1/b;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v5

    if-eqz v5, :cond_29

    invoke-static {v4}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v13

    invoke-virtual {v2}, Liw1/a$a;->b()Liw1/b;

    move-result-object v2

    invoke-interface {v2}, Liw1/b;->a()Ljava/lang/String;

    move-result-object v7

    new-instance v4, Lfw1/b$a;

    const/16 v11, 0x38

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lfw1/b$a;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v15, v0, Liw1/h$a;->w:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->x:Ljava/lang/Object;

    iput v14, v0, Liw1/h$a;->z:I

    iput v14, v0, Liw1/h$a;->E:I

    const/16 v2, 0x12

    iput v2, v0, Liw1/h$a;->F:I

    invoke-interface {v13, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto/16 :goto_5

    :cond_23
    instance-of v4, v2, Liw1/e$a;

    if-eqz v4, :cond_2a

    check-cast v2, Liw1/e$a;

    invoke-virtual {v2}, Liw1/e$a;->a()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object v2

    sget-object v4, Liw1/h$a$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    if-eq v2, v5, :cond_28

    if-eq v2, v6, :cond_27

    if-eq v2, v7, :cond_26

    if-eq v2, v8, :cond_25

    if-ne v2, v13, :cond_24

    goto/16 :goto_6

    :cond_24
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_25
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    new-instance v2, Lhw1/a$b;

    new-instance v8, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v10, Lcom/whoop/navigation/HomeScreenModel;

    invoke-direct {v10, v15, v15, v7, v15}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v8}, Lhw1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_26
    iget-object v1, v0, Liw1/h$a;->G:Liw1/h;

    invoke-static {v1}, Liw1/h;->j(Liw1/h;)Lhw1/b;

    move-result-object v1

    sget-object v2, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v1, v2}, Lhw1/b;->a(Lhw1/a;)V

    return-object v3

    :cond_27
    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v2, Liw1/e$a;

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v2

    invoke-interface {v2}, Liw1/f;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v5

    if-eqz v5, :cond_29

    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    check-cast v2, Liw1/e$a;

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v6

    invoke-interface {v6}, Liw1/f;->getPath()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_29

    invoke-static {v4}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v13

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v4

    invoke-interface {v4}, Liw1/f;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v4

    invoke-interface {v4}, Liw1/f;->d()Lcom/whoop/payments/domain/models/Card;

    move-result-object v8

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v2

    invoke-interface {v2}, Liw1/f;->c()Ljava/util/List;

    move-result-object v9

    new-instance v4, Lfw1/b$a;

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lfw1/b$a;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v15, v0, Liw1/h$a;->w:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->x:Ljava/lang/Object;

    iput v14, v0, Liw1/h$a;->z:I

    iput v14, v0, Liw1/h$a;->E:I

    const/16 v2, 0x15

    iput v2, v0, Liw1/h$a;->F:I

    invoke-interface {v13, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    goto :goto_5

    :cond_28
    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    check-cast v2, Liw1/e$a;

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v2

    invoke-interface {v2}, Liw1/f;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v5

    if-eqz v5, :cond_29

    iget-object v2, v0, Liw1/h$a;->H:Liw1/g;

    iget-object v4, v0, Liw1/h$a;->G:Liw1/h;

    check-cast v2, Liw1/e$a;

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v6

    invoke-interface {v6}, Liw1/f;->getPath()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_29

    invoke-static {v4}, Liw1/h;->g(Liw1/h;)Lec3/o1;

    move-result-object v10

    new-instance v4, Lfw1/b$g;

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v6

    invoke-interface {v6}, Liw1/f;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v7

    invoke-interface {v7}, Liw1/f;->d()Lcom/whoop/payments/domain/models/Card;

    move-result-object v7

    invoke-virtual {v2}, Liw1/e$a;->b()Liw1/f;

    move-result-object v2

    invoke-interface {v2}, Liw1/f;->c()Ljava/util/List;

    move-result-object v8

    invoke-direct/range {v4 .. v9}, Lfw1/b$g;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;)V

    iput-object v15, v0, Liw1/h$a;->w:Ljava/lang/Object;

    iput-object v15, v0, Liw1/h$a;->x:Ljava/lang/Object;

    iput v14, v0, Liw1/h$a;->z:I

    iput v14, v0, Liw1/h$a;->E:I

    const/16 v2, 0x14

    iput v2, v0, Liw1/h$a;->F:I

    invoke-interface {v10, v4, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_29

    :goto_5
    return-object v1

    :cond_29
    :goto_6
    return-object v3

    :cond_2a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
