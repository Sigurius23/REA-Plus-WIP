.class final Lvv1/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvv1/a;->l()Lbc3/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
    c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$fetchDunningBottomSheet$1"
    f = "DunningBottomSheetCoordinator.kt"
    l = {
        0x52,
        0x57,
        0x58,
        0x5d,
        0x5e,
        0x62,
        0x66
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field final synthetic G:Lvv1/a;

.field w:I

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvv1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvv1/a;",
            "Lq83/d<",
            "-",
            "Lvv1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lvv1/a$c;

    iget-object v0, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-direct {p1, v0, p2}, Lvv1/a$c;-><init>(Lvv1/a;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lvv1/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvv1/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvv1/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvv1/a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvv1/a$c;->F:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget v1, p0, Lvv1/a$c;->w:I

    iget-object v4, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    check-cast v4, Lvv1/e;

    iget-object v5, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    check-cast v5, Llf1/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1
    iget-object v0, p0, Lvv1/a$c;->E:Ljava/lang/Object;

    check-cast v0, Lzv1/a;

    :pswitch_2
    iget-object v0, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    check-cast v0, Lvv1/e;

    iget-object v0, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    check-cast v0, Llf1/d;

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    iget v1, p0, Lvv1/a$c;->w:I

    iget-object v4, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    check-cast v4, Lvv1/e;

    iget-object v5, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    check-cast v5, Llf1/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_5
    iget v1, p0, Lvv1/a$c;->w:I

    iget-object v4, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    check-cast v4, Llf1/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->g(Lvv1/a;)Lrv1/a;

    move-result-object p1

    invoke-virtual {p1}, Lrv1/a;->G()Landroidx/lifecycle/p0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->PAST_DUE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v4, 0x1

    if-ne p1, v1, :cond_0

    move p1, v4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_6

    new-instance v5, Llf1/d;

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Llf1/d;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {v1}, Lvv1/a;->f(Lvv1/a;)Lhf1/b;

    move-result-object v1

    iput-object v3, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    iput p1, p0, Lvv1/a$c;->w:I

    iput v4, p0, Lvv1/a$c;->F:I

    invoke-interface {v1, v5, v4, p0}, Lhf1/b;->e(Lhf1/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    goto/16 :goto_4

    :cond_1
    move-object v12, v1

    move v1, p1

    move-object p1, v12

    :goto_1
    check-cast p1, Ljava/lang/String;

    iget-object v4, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {v4}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvv1/e;

    const-string v5, "payment options"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    iput-object v3, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    iput-object v4, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    iput v1, p0, Lvv1/a$c;->w:I

    const/4 v5, 0x2

    iput v5, p0, Lvv1/a$c;->F:I

    invoke-static {p1, p0}, Lvv1/a;->c(Lvv1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto/16 :goto_4

    :cond_2
    :goto_2
    move-object v5, p1

    check-cast v5, Lzv1/a;

    iget-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object p1

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lvv1/e;->b(Lvv1/e;Lzv1/a;ZZILjava/lang/Object;)Lvv1/e;

    move-result-object v4

    iput-object v3, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->E:Ljava/lang/Object;

    iput v1, p0, Lvv1/a$c;->w:I

    const/4 v1, 0x3

    iput v1, p0, Lvv1/a$c;->F:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v2, v0, :cond_7

    goto/16 :goto_4

    :cond_3
    const-string v5, "cycle data"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    iput-object v3, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    iput-object v4, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    iput v1, p0, Lvv1/a$c;->w:I

    const/4 v5, 0x4

    iput v5, p0, Lvv1/a$c;->F:I

    invoke-static {p1, p0}, Lvv1/a;->a(Lvv1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    move-object v5, p1

    check-cast v5, Lzv1/a;

    iget-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object p1

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lvv1/e;->b(Lvv1/e;Lzv1/a;ZZILjava/lang/Object;)Lvv1/e;

    move-result-object v4

    iput-object v3, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->E:Ljava/lang/Object;

    iput v1, p0, Lvv1/a$c;->w:I

    const/4 v1, 0x5

    iput v1, p0, Lvv1/a$c;->F:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v2, v0, :cond_7

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object p1

    new-instance v4, Lvv1/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lvv1/e;-><init>(Lzv1/a;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, Lvv1/a$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Lvv1/a$c;->z:Ljava/lang/Object;

    iput v1, p0, Lvv1/a$c;->w:I

    const/4 v1, 0x6

    iput v1, p0, Lvv1/a$c;->F:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v2, v0, :cond_7

    goto :goto_4

    :cond_6
    iget-object v1, p0, Lvv1/a$c;->G:Lvv1/a;

    invoke-static {v1}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object v1

    new-instance v3, Lvv1/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lvv1/e;-><init>(Lzv1/a;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lvv1/a$c;->w:I

    const/4 p1, 0x7

    iput p1, p0, Lvv1/a$c;->F:I

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v3, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v2, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    :goto_5
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
