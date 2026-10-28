.class final Lcom/whoop/straphistorysync/sync/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/straphistorysync/sync/e;->j(Ljk0/d;Ljava/lang/String;)V
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
    c = "com.whoop.straphistorysync.sync.SensorHistoricalPullApiImpl$requeueHps$1"
    f = "SensorHistoricalPullApiImpl.kt"
    l = {
        0xa1
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/straphistorysync/sync/e;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljk0/d;


# direct methods
.method public constructor <init>(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;Ljk0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/e;",
            "Ljava/lang/String;",
            "Ljk0/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/e$b;->x:Lcom/whoop/straphistorysync/sync/e;

    iput-object p2, p0, Lcom/whoop/straphistorysync/sync/e$b;->y:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/straphistorysync/sync/e$b;->z:Ljk0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/straphistorysync/sync/e$b;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e$b;->x:Lcom/whoop/straphistorysync/sync/e;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/e$b;->y:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/e$b;->z:Ljk0/d;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/straphistorysync/sync/e$b;-><init>(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;Ljk0/d;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/straphistorysync/sync/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/straphistorysync/sync/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/straphistorysync/sync/e$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e$b;->x:Lcom/whoop/straphistorysync/sync/e;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/e;->g(Lcom/whoop/straphistorysync/sync/e;)Ljs0/c;

    move-result-object p1

    sget-object v1, Lcom/whoop/straphistorysync/sync/e$a$a;->a:Lcom/whoop/straphistorysync/sync/e$a$a;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v5, Ljava/lang/Long;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {p1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    goto/16 :goto_0

    :cond_2
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    goto :goto_0

    :cond_3
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {p1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v7

    goto :goto_0

    :cond_4
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {p1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v7

    goto :goto_0

    :cond_5
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {p1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_0

    :cond_6
    const-class v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {p1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_0

    :cond_7
    move-object v7, v1

    :cond_8
    :goto_0
    if-nez v7, :cond_9

    goto :goto_1

    :cond_9
    move-object v1, v7

    :goto_1
    if-eqz v1, :cond_b

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iput v2, p0, Lcom/whoop/straphistorysync/sync/e$b;->w:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_2
    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e$b;->x:Lcom/whoop/straphistorysync/sync/e;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/e;->h(Lcom/whoop/straphistorysync/sync/e;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e$b;->y:Ljava/lang/String;

    const-string v1, "Requeueing HPS for "

    const-string v2, " at Low priority after preemption"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e$b;->x:Lcom/whoop/straphistorysync/sync/e;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e$b;->z:Ljk0/d;

    sget-object v1, Lsj2/a$b;->a:Lsj2/a$b;

    invoke-virtual {p1, v0, v1}, Lcom/whoop/straphistorysync/sync/e;->a(Ljk0/d;Lsj2/a;)Lec3/f2;

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e$b;->x:Lcom/whoop/straphistorysync/sync/e;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e$b;->z:Ljk0/d;

    invoke-static {p1, v0}, Lcom/whoop/straphistorysync/sync/e;->i(Lcom/whoop/straphistorysync/sync/e;Ljk0/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
