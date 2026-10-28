.class final Lmk2/r$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/r;->y()Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lmk2/n;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$endSession$1"
    f = "TrackSessionMiniArchInteractor.kt"
    l = {
        0x10c,
        0x10f,
        0x111,
        0x113,
        0x114,
        0x117,
        0x118,
        0x119,
        0x11e,
        0x11f,
        0x120,
        0x127
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lmk2/r;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lmk2/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/r;",
            "Lq83/d<",
            "-",
            "Lmk2/r$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmk2/r$d;->G:Lmk2/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lmk2/r$d;

    iget-object v1, p0, Lmk2/r$d;->G:Lmk2/r;

    invoke-direct {v0, v1, p2}, Lmk2/r$d;-><init>(Lmk2/r;Lq83/d;)V

    iput-object p1, v0, Lmk2/r$d;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lmk2/r$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmk2/r$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmk2/r$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmk2/r$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmk2/r$d;->E:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    check-cast v0, Lmk2/g;

    iget-object v0, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    check-cast v0, Lx90/d;

    iget-object v0, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget-object v2, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    check-cast v2, Lmk2/g;

    iget-object v2, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    iget-object v2, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_2
    iget-object v2, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    check-cast v2, Lmk2/g;

    iget-object v2, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    iget-object v2, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_3
    iget-object v2, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    check-cast v2, Lmk2/g;

    iget-object v4, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    check-cast v4, Lx90/d;

    iget-object v4, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    iget-object v2, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    iget-object v2, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    iget-object v2, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_5
    iget-object v2, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_6
    iget-object v2, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lmk2/n$h;->a:Lmk2/n$h;

    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_9

    :cond_0
    :goto_0
    iget-object p1, p0, Lmk2/r$d;->G:Lmk2/r;

    invoke-static {p1}, Lmk2/r;->m(Lmk2/r;)Lmk2/u;

    move-result-object p1

    invoke-interface {p1}, Lmk2/u;->d()Lmk2/l;

    move-result-object p1

    invoke-virtual {p1}, Lmk2/l;->a()Lmk2/d;

    move-result-object p1

    invoke-virtual {p1}, Lmk2/d;->b()Ljava/util/List;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v3

    :goto_1
    iget-object v2, p0, Lmk2/r$d;->G:Lmk2/r;

    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object p1, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Lmk2/r$d;->E:I

    invoke-static {v2, p0}, Lmk2/r;->s(Lmk2/r;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_9

    :cond_2
    move-object v2, p1

    :goto_2
    iget-object p1, p0, Lmk2/r$d;->G:Lmk2/r;

    sget-object v4, Lcom/whoop/data/remote/domain/request/UserState;->Idle:Lcom/whoop/data/remote/domain/request/UserState;

    invoke-static {p1, v4}, Lmk2/r;->r(Lmk2/r;Lcom/whoop/data/remote/domain/request/UserState;)V

    iget-object p1, p0, Lmk2/r$d;->G:Lmk2/r;

    invoke-static {p1}, Lmk2/r;->g(Lmk2/r;)Lx90/f;

    move-result-object p1

    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v2, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p0, Lmk2/r$d;->E:I

    invoke-interface {p1, p0}, Lx90/f;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_9

    :cond_3
    :goto_3
    check-cast p1, Lx90/d;

    if-eqz p1, :cond_4

    iget-object v4, p0, Lmk2/r$d;->G:Lmk2/r;

    invoke-static {v4}, Lmk2/r;->k(Lmk2/r;)Lfi1/a;

    move-result-object v5

    invoke-virtual {p1}, Lx90/d;->e()J

    move-result-wide v6

    invoke-static {v4}, Lmk2/r;->i(Lmk2/r;)Ljava/time/Clock;

    move-result-object v4

    invoke-virtual {v4}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object v4

    invoke-virtual {v4}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v8

    invoke-virtual {v5, v6, v7, v8, v9}, Lfi1/a;->a(JJ)V

    :cond_4
    if-eqz p1, :cond_6

    iget-object v4, p0, Lmk2/r$d;->G:Lmk2/r;

    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Lmk2/r$d;->z:I

    const/4 v5, 0x4

    iput v5, p0, Lmk2/r$d;->E:I

    invoke-static {v4, p1, v2, p0}, Lmk2/r;->q(Lmk2/r;Lx90/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_9

    :cond_5
    :goto_4
    check-cast p1, Lmk2/g;

    move-object v2, p1

    goto :goto_5

    :cond_6
    move-object v2, v3

    :goto_5
    iget-object p1, p0, Lmk2/r$d;->G:Lmk2/r;

    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v2, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, p0, Lmk2/r$d;->E:I

    invoke-static {p1, p0}, Lmk2/r;->c(Lmk2/r;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_9

    :cond_7
    :goto_6
    instance-of p1, v2, Lmk2/g$c;

    if-eqz p1, :cond_a

    sget-object p1, Lmk2/n$l;->a:Lmk2/n$l;

    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto/16 :goto_9

    :cond_8
    :goto_7
    iput-object v0, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lmk2/r$d;->E:I

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_9

    :cond_9
    :goto_8
    sget-object p1, Lmk2/n$n;->a:Lmk2/n$n;

    iput-object v3, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto/16 :goto_9

    :cond_a
    instance-of p1, v2, Lmk2/g$d;

    if-eqz p1, :cond_b

    sget-object p1, Lmk2/n$m;->a:Lmk2/n$m;

    iput-object v3, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/16 v2, 0x9

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto :goto_9

    :cond_b
    instance-of p1, v2, Lmk2/g$b;

    if-eqz p1, :cond_c

    sget-object p1, Lmk2/n$k;->a:Lmk2/n$k;

    iput-object v3, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/16 v2, 0xa

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto :goto_9

    :cond_c
    instance-of p1, v2, Lmk2/g$a;

    if-eqz p1, :cond_d

    new-instance p1, Lmk2/n$j;

    check-cast v2, Lmk2/g$a;

    invoke-virtual {v2}, Lmk2/g$a;->c()Ljava/time/OffsetDateTime;

    move-result-object v4

    invoke-virtual {v2}, Lmk2/g$a;->b()Ljava/time/OffsetDateTime;

    move-result-object v5

    invoke-virtual {v2}, Lmk2/g$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v4, v5, v2}, Lmk2/n$j;-><init>(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V

    iput-object v3, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/16 v2, 0xb

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto :goto_9

    :cond_d
    if-nez v2, :cond_f

    sget-object p1, Lmk2/n$n;->a:Lmk2/n$n;

    iput-object v3, p0, Lmk2/r$d;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmk2/r$d;->y:Ljava/lang/Object;

    const/16 v2, 0xc

    iput v2, p0, Lmk2/r$d;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    :goto_9
    return-object v1

    :cond_e
    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
