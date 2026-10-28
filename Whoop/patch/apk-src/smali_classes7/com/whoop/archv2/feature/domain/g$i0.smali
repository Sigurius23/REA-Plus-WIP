.class public final Lcom/whoop/archv2/feature/domain/g$i0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->F(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;ZLc93/m;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$$inlined$flatMapLatest$1"
    f = "GenericInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/archv2/feature/domain/g;

.field final synthetic F:Lc93/m;

.field final synthetic G:Z

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/navigation/models/ApiRequest;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/g;Lc93/m;Z)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$i0;->z:Lcom/whoop/navigation/models/ApiRequest;

    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/g$i0;->E:Lcom/whoop/archv2/feature/domain/g;

    iput-object p4, p0, Lcom/whoop/archv2/feature/domain/g$i0;->F:Lc93/m;

    iput-boolean p5, p0, Lcom/whoop/archv2/feature/domain/g$i0;->G:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/archv2/feature/domain/g$i0;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$i0;->z:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$i0;->E:Lcom/whoop/archv2/feature/domain/g;

    iget-object v4, p0, Lcom/whoop/archv2/feature/domain/g$i0;->F:Lc93/m;

    iget-boolean v5, p0, Lcom/whoop/archv2/feature/domain/g$i0;->G:Z

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lcom/whoop/archv2/feature/domain/g$i0;-><init>(Lq83/d;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/g;Lc93/m;Z)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$i0;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/archv2/feature/domain/g$i0;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/archv2/feature/domain/g$i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/g$i0;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/archv2/feature/domain/g$i0;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$i0;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$i0;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$i0;->y:Ljava/lang/Object;

    check-cast v1, Lqw2/b;

    instance-of v3, v1, Lqw2/b$f;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    iget-object v7, p0, Lcom/whoop/archv2/feature/domain/g$i0;->z:Lcom/whoop/navigation/models/ApiRequest;

    if-eqz v7, :cond_2

    iget-object v6, p0, Lcom/whoop/archv2/feature/domain/g$i0;->E:Lcom/whoop/archv2/feature/domain/g;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/whoop/archv2/feature/domain/g;->C(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/ApiRequest;ZLjava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v1

    new-instance v3, Lcom/whoop/archv2/feature/domain/g$o0;

    iget-boolean v4, p0, Lcom/whoop/archv2/feature/domain/g$i0;->G:Z

    invoke-direct {v3, v5, v4}, Lcom/whoop/archv2/feature/domain/g$o0;-><init>(Lq83/d;Z)V

    invoke-static {v1, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    goto/16 :goto_4

    :cond_2
    new-instance v1, Lcom/whoop/archv2/feature/domain/i$o;

    new-instance v3, Lcom/whoop/archv2/feature/domain/b$d;

    invoke-direct {v3, v4, v2, v5}, Lcom/whoop/archv2/feature/domain/b$d;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v1, v3

    goto/16 :goto_4

    :cond_3
    instance-of v3, v1, Lqw2/b$g;

    if-eqz v3, :cond_6

    check-cast v1, Lqw2/b$g;

    invoke-virtual {v1}, Lqw2/b$g;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v1

    instance-of v3, v1, Lcom/whoop/whoopaction/domain/models/ReloadAction;

    if-eqz v3, :cond_4

    check-cast v1, Lcom/whoop/whoopaction/domain/models/ReloadAction;

    goto :goto_1

    :cond_4
    move-object v1, v5

    :goto_1
    if-nez v1, :cond_5

    new-instance v1, Lcom/whoop/archv2/feature/domain/i$o;

    invoke-direct {v1, v5}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_5

    :cond_5
    new-instance v3, Lcom/whoop/archv2/feature/domain/i$l;

    invoke-direct {v3, v1}, Lcom/whoop/archv2/feature/domain/i$l;-><init>(Lcom/whoop/whoopaction/domain/models/ReloadAction;)V

    new-instance v1, La6/u;

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_4

    :cond_6
    instance-of v3, v1, Lqw2/b$c;

    if-eqz v3, :cond_9

    new-instance v3, Lcom/whoop/archv2/feature/domain/i$o;

    check-cast v1, Lqw2/b$c;

    invoke-virtual {v1}, Lqw2/b$c;->b()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    move-result-object v4

    if-eqz v4, :cond_7

    new-instance v4, Lcom/whoop/archv2/feature/domain/b$b;

    invoke-virtual {v1}, Lqw2/b$c;->b()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    move-result-object v1

    invoke-direct {v4, v1}, Lcom/whoop/archv2/feature/domain/b$b;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Lqw2/b$c;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    if-eqz v1, :cond_8

    move-object v4, v5

    goto :goto_2

    :cond_8
    new-instance v4, Lcom/whoop/archv2/feature/domain/b$b;

    invoke-direct {v4, v5, v2, v5}, Lcom/whoop/archv2/feature/domain/b$b;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    invoke-direct {v3, v4}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    new-instance v1, La6/u;

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_4

    :cond_9
    instance-of v3, v1, Lqw2/b$i;

    if-eqz v3, :cond_a

    new-instance v1, Lcom/whoop/archv2/feature/domain/i$o;

    new-instance v3, Lcom/whoop/archv2/feature/domain/b$b;

    invoke-direct {v3, v5, v2, v5}, Lcom/whoop/archv2/feature/domain/b$b;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_a
    instance-of v3, v1, Lqw2/b$n;

    if-eqz v3, :cond_b

    new-instance v1, Lcom/whoop/archv2/feature/domain/i$o;

    sget-object v3, Lcom/whoop/archv2/feature/domain/b$e;->a:Lcom/whoop/archv2/feature/domain/b$e;

    invoke-direct {v1, v3}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_b
    instance-of v3, v1, Lqw2/b$d;

    if-eqz v3, :cond_d

    move-object v3, v1

    check-cast v3, Lqw2/b$d;

    invoke-virtual {v3}, Lqw2/b$d;->c()Lj02/s;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v1, Lcom/whoop/archv2/feature/domain/g$k0;

    invoke-direct {v1, v3, v5}, Lcom/whoop/archv2/feature/domain/g$k0;-><init>(Lj02/s;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_0

    :cond_c
    new-instance v3, Lcom/whoop/archv2/feature/domain/g$l0;

    invoke-direct {v3, v1, v5}, Lcom/whoop/archv2/feature/domain/g$l0;-><init>(Lqw2/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_4

    :cond_d
    instance-of v3, v1, Lqw2/b$b;

    if-eqz v3, :cond_e

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$i0;->E:Lcom/whoop/archv2/feature/domain/g;

    check-cast v1, Lqw2/b$b;

    invoke-virtual {v1}, Lqw2/b$b;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    iget-object v4, p0, Lcom/whoop/archv2/feature/domain/g$i0;->z:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v6, p0, Lcom/whoop/archv2/feature/domain/g$i0;->F:Lc93/m;

    invoke-static {v3, v1, v4, v6}, Lcom/whoop/archv2/feature/domain/g;->g(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;

    move-result-object v1

    goto/16 :goto_4

    :cond_e
    instance-of v3, v1, Lqw2/b$a;

    if-eqz v3, :cond_f

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$i0;->E:Lcom/whoop/archv2/feature/domain/g;

    check-cast v1, Lqw2/b$a;

    invoke-static {v3, v1}, Lcom/whoop/archv2/feature/domain/g;->p(Lcom/whoop/archv2/feature/domain/g;Lqw2/b$a;)Lec3/l;

    move-result-object v1

    goto/16 :goto_4

    :cond_f
    instance-of v3, v1, Lqw2/b$m;

    if-eqz v3, :cond_13

    move-object v3, v1

    check-cast v3, Lqw2/b$m;

    invoke-virtual {v3}, Lqw2/b$m;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v6

    instance-of v7, v6, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    if-eqz v7, :cond_10

    check-cast v6, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    goto :goto_3

    :cond_10
    move-object v6, v5

    :goto_3
    if-eqz v6, :cond_11

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;->getDismissModal()Z

    move-result v4

    :cond_11
    if-eqz v4, :cond_12

    new-instance v3, Lcom/whoop/archv2/feature/domain/g$m0;

    invoke-direct {v3, v1, v5}, Lcom/whoop/archv2/feature/domain/g$m0;-><init>(Lqw2/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_4

    :cond_12
    new-instance v1, Lcom/whoop/archv2/feature/domain/i$n;

    invoke-virtual {v3}, Lqw2/b$m;->b()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/whoop/archv2/feature/domain/i$n;-><init>(Ljava/util/Map;)V

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_13
    instance-of v3, v1, Lqw2/b$l;

    if-eqz v3, :cond_14

    new-instance v3, Lcom/whoop/archv2/feature/domain/g$n0;

    invoke-direct {v3, v1, v5}, Lcom/whoop/archv2/feature/domain/g$n0;-><init>(Lqw2/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_4

    :cond_14
    instance-of v3, v1, Lqw2/b$k;

    if-eqz v3, :cond_15

    new-instance v3, Lcom/whoop/archv2/feature/domain/i$h;

    check-cast v1, Lqw2/b$k;

    invoke-virtual {v1}, Lqw2/b$k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lqw2/b$k;->c()Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lcom/whoop/archv2/feature/domain/i$h;-><init>(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    new-instance v1, La6/u;

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_4

    :cond_15
    instance-of v3, v1, Lqw2/b$j;

    if-eqz v3, :cond_16

    new-instance v3, Lcom/whoop/archv2/feature/domain/i$g;

    check-cast v1, Lqw2/b$j;

    invoke-virtual {v1}, Lqw2/b$j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/whoop/archv2/feature/domain/i$g;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_4

    :cond_16
    instance-of v3, v1, Lqw2/b$h;

    if-eqz v3, :cond_17

    new-instance v3, Lcom/whoop/archv2/feature/domain/i$k;

    new-instance v4, Lcom/whoop/archv2/feature/domain/q;

    check-cast v1, Lqw2/b$h;

    invoke-virtual {v1}, Lqw2/b$h;->c()Lcom/whoop/whoopaction/domain/models/PermissionType;

    move-result-object v6

    invoke-virtual {v1}, Lqw2/b$h;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    invoke-direct {v4, v6, v1}, Lcom/whoop/archv2/feature/domain/q;-><init>(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-direct {v3, v4}, Lcom/whoop/archv2/feature/domain/i$k;-><init>(Lcom/whoop/archv2/feature/domain/q;)V

    new-instance v1, La6/u;

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_4

    :cond_17
    instance-of v3, v1, Lqw2/b$e;

    if-eqz v3, :cond_19

    new-instance v3, Lcom/whoop/archv2/feature/domain/i$o;

    invoke-direct {v3, v5}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    new-instance v6, Lcom/whoop/archv2/feature/domain/i$j;

    new-instance v7, Lcom/whoop/archv2/feature/domain/p;

    check-cast v1, Lqw2/b$e;

    invoke-virtual {v1}, Lqw2/b$e;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lqw2/b$e;->d()Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    move-result-object v9

    invoke-virtual {v1}, Lqw2/b$e;->c()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v10

    invoke-virtual {v1}, Lqw2/b$e;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    invoke-direct {v7, v8, v9, v10, v1}, Lcom/whoop/archv2/feature/domain/p;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-direct {v6, v7}, Lcom/whoop/archv2/feature/domain/i$j;-><init>(Lcom/whoop/archv2/feature/domain/p;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/whoop/archv2/feature/domain/i;

    aput-object v3, v1, v4

    aput-object v6, v1, v2

    new-instance v3, Lbm/g;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :goto_4
    move-object v3, v1

    :goto_5
    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$i0;->x:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$i0;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/archv2/feature/domain/g$i0;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_18

    return-object v0

    :cond_18
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
