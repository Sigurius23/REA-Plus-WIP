.class final Lmk2/r$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/r;->w()Lec3/l;
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
    c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$confirmDiscard$1"
    f = "TrackSessionMiniArchInteractor.kt"
    l = {
        0x174,
        0x175,
        0x176,
        0x178,
        0x17b,
        0x17c,
        0x17e
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
            "Lmk2/r$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmk2/r$b;->G:Lmk2/r;

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

    new-instance v0, Lmk2/r$b;

    iget-object v1, p0, Lmk2/r$b;->G:Lmk2/r;

    invoke-direct {v0, v1, p2}, Lmk2/r$b;-><init>(Lmk2/r;Lq83/d;)V

    iput-object p1, v0, Lmk2/r$b;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lmk2/r$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmk2/r$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmk2/r$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmk2/r$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmk2/r$b;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    check-cast v0, Lx90/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object v2, p0, Lmk2/r$b;->y:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    iget-object v2, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object v2, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget-object v0, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    check-cast v0, Lx90/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v2, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lmk2/n$b;->a:Lmk2/n$b;

    iput-object v0, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lmk2/r$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_0
    iget-object p1, p0, Lmk2/r$b;->G:Lmk2/r;

    invoke-static {p1}, Lmk2/r;->g(Lmk2/r;)Lx90/f;

    move-result-object p1

    iput-object v0, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lmk2/r$b;->E:I

    invoke-interface {p1, p0}, Lx90/f;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    check-cast p1, Lx90/d;

    iget-object v2, p0, Lmk2/r$b;->G:Lmk2/r;

    invoke-static {v2}, Lmk2/r;->g(Lmk2/r;)Lx90/f;

    move-result-object v2

    iput-object v0, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    iput-object p1, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, p0, Lmk2/r$b;->E:I

    invoke-interface {v2, p0}, Lx90/f;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto :goto_6

    :cond_2
    move-object v7, v2

    move-object v2, p1

    move-object p1, v7

    :goto_2
    instance-of p1, p1, Ll83/m;

    if-eqz p1, :cond_4

    sget-object p1, Lmk2/n$a;->a:Lmk2/n$a;

    iput-object v4, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->x:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, p0, Lmk2/r$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_6

    :cond_3
    :goto_3
    return-object v3

    :cond_4
    iget-object p1, p0, Lmk2/r$b;->G:Lmk2/r;

    iput-object v0, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    iput-object v2, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->x:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, p0, Lmk2/r$b;->E:I

    invoke-static {p1, p0}, Lmk2/r;->s(Lmk2/r;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_6

    :cond_5
    :goto_4
    if-eqz v2, :cond_6

    iget-object p1, p0, Lmk2/r$b;->G:Lmk2/r;

    invoke-static {p1}, Lmk2/r;->j(Lmk2/r;)Lei1/a;

    move-result-object p1

    invoke-virtual {v2}, Lx90/d;->e()J

    move-result-wide v5

    iput-object v0, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->y:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, p0, Lmk2/r$b;->z:I

    const/4 v2, 0x6

    iput v2, p0, Lmk2/r$b;->E:I

    invoke-interface {p1, v5, v6, p0}, Lei1/a;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_6

    :cond_6
    :goto_5
    iget-object p1, p0, Lmk2/r$b;->G:Lmk2/r;

    sget-object v2, Lcom/whoop/data/remote/domain/request/UserState;->Idle:Lcom/whoop/data/remote/domain/request/UserState;

    invoke-static {p1, v2}, Lmk2/r;->r(Lmk2/r;Lcom/whoop/data/remote/domain/request/UserState;)V

    sget-object p1, Lmk2/n$c;->a:Lmk2/n$c;

    iput-object v4, p0, Lmk2/r$b;->F:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lmk2/r$b;->y:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Lmk2/r$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_6
    return-object v1

    :cond_7
    :goto_7
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
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
