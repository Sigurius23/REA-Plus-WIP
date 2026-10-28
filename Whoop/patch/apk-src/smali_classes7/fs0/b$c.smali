.class final Lfs0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs0/b;->n(Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lec3/l;
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
        "Lds0/e;",
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
    c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$performSend$1"
    f = "ReactionsSendInteractor.kt"
    l = {
        0x75,
        0x80,
        0x85,
        0x89,
        0x8b,
        0x90,
        0x93,
        0x97
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lds0/b;

.field final synthetic I:Lfs0/b;

.field final synthetic J:Lcom/whoop/whoopaction/domain/models/UpdateAction;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lds0/b;Lfs0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds0/b;",
            "Lfs0/b;",
            "Lcom/whoop/whoopaction/domain/models/UpdateAction;",
            "Lq83/d<",
            "-",
            "Lfs0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfs0/b$c;->H:Lds0/b;

    iput-object p2, p0, Lfs0/b$c;->I:Lfs0/b;

    iput-object p3, p0, Lfs0/b$c;->J:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lfs0/b$c;

    iget-object v1, p0, Lfs0/b$c;->H:Lds0/b;

    iget-object v2, p0, Lfs0/b$c;->I:Lfs0/b;

    iget-object v3, p0, Lfs0/b$c;->J:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-direct {v0, v1, v2, v3, p2}, Lfs0/b$c;-><init>(Lds0/b;Lfs0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V

    iput-object p1, v0, Lfs0/b$c;->G:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfs0/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfs0/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfs0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfs0/b$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfs0/b$c;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v0, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget-object v2, p0, Lfs0/b$c;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_0

    :pswitch_2
    iget-object v2, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    check-cast v2, Lqw2/b;

    iget-object v6, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/g0;

    iget-object v7, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :goto_0
    :pswitch_3
    iget-object v2, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    check-cast v2, Lqw2/b;

    iget-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v6, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    iget-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v6, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfs0/b$c;->H:Lds0/b;

    instance-of p1, p1, Lds0/b$b;

    if-eqz p1, :cond_0

    new-instance p1, Lfs0/b$c$b;

    invoke-direct {p1, v0, v5}, Lfs0/b$c$b;-><init>(Lec3/m;Lq83/d;)V

    :goto_1
    move-object v6, p1

    goto :goto_2

    :cond_0
    new-instance p1, Lfs0/b$c$c;

    invoke-direct {p1, v5}, Lfs0/b$c$c;-><init>(Lq83/d;)V

    goto :goto_1

    :goto_2
    new-instance p1, Lkotlin/jvm/internal/g0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lfs0/b$c;->I:Lfs0/b;

    iget-object v7, p0, Lfs0/b$c;->J:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-static {v2, v7}, Lfs0/b;->i(Lfs0/b;Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;

    move-result-object v2

    new-instance v7, Lfs0/b$c$a;

    invoke-direct {v7, v6, p1}, Lfs0/b$c$a;-><init>(Lc93/m;Lkotlin/jvm/internal/g0;)V

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v6, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object p1, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput v3, p0, Lfs0/b$c;->F:I

    invoke-interface {v2, v7, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    goto/16 :goto_7

    :cond_1
    move-object v2, p1

    :goto_3
    iget-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    if-nez p1, :cond_2

    iget-object p1, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {p1}, Lfs0/b;->d(Lfs0/b;)Ltr2/n;

    move-result-object p1

    iget-object v7, p0, Lfs0/b$c;->H:Lds0/b;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " never settled"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {p1, v7, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lds0/a$a;

    iget-object v7, p0, Lfs0/b$c;->J:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-direct {p1, v7}, Lds0/a$a;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, p0, Lfs0/b$c;->F:I

    invoke-interface {v6, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_7

    :cond_2
    instance-of v7, p1, Lqw2/b$a;

    if-eqz v7, :cond_3

    iget-object v7, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {v7}, Lfs0/b;->d(Lfs0/b;)Ltr2/n;

    move-result-object v7

    iget-object v8, p0, Lfs0/b$c;->H:Lds0/b;

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " failed: "

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v7, p1, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lds0/a$a;

    iget-object v7, p0, Lfs0/b$c;->J:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-direct {p1, v7}, Lds0/a$a;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, p0, Lfs0/b$c;->F:I

    invoke-interface {v6, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_7

    :cond_3
    instance-of v7, p1, Lqw2/b$b;

    if-eqz v7, :cond_7

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object p1, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    const/4 v7, 0x4

    iput v7, p0, Lfs0/b$c;->F:I

    invoke-interface {v6, v5, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    goto/16 :goto_7

    :cond_4
    move-object v6, v2

    move-object v2, p1

    :goto_4
    check-cast v2, Lqw2/b$b;

    invoke-virtual {v2}, Lqw2/b$b;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    iget-object v2, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {v2}, Lfs0/b;->c(Lfs0/b;)Lad3/c;

    move-result-object v2

    invoke-static {p1, v2}, Lds0/i;->b(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v2, Lds0/e$f;

    invoke-direct {v2, p1}, Lds0/e$f;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v6, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->z:Ljava/lang/Object;

    iput v4, p0, Lfs0/b$c;->E:I

    const/4 p1, 0x5

    iput p1, p0, Lfs0/b$c;->F:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_7

    :cond_5
    iget-object p1, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {p1}, Lfs0/b;->d(Lfs0/b;)Ltr2/n;

    move-result-object p1

    iget-object v2, p0, Lfs0/b$c;->H:Lds0/b;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned an interaction this bar cannot present"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_6
    move-object v2, v6

    goto :goto_5

    :cond_7
    iget-object v7, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {v7, p1}, Lfs0/b;->e(Lfs0/b;Lqw2/b;)Z

    move-result v7

    if-eqz v7, :cond_8

    sget-object p1, Lds0/a$c;->a:Lds0/a$c;

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    const/4 v7, 0x6

    iput v7, p0, Lfs0/b$c;->F:I

    invoke-interface {v6, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_7

    :cond_8
    iget-object v7, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {v7}, Lfs0/b;->d(Lfs0/b;)Ltr2/n;

    move-result-object v7

    iget-object v8, p0, Lfs0/b$c;->H:Lds0/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " settled as "

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", not routed on this host"

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v7, p1, v8}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v0, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lfs0/b$c;->F:I

    invoke-interface {v6, v5, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_7

    :cond_9
    :goto_5
    new-instance p1, Lds0/e$g;

    iget-object v6, p0, Lfs0/b$c;->H:Lds0/b;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lqw2/b;

    if-eqz v2, :cond_a

    iget-object v7, p0, Lfs0/b$c;->I:Lfs0/b;

    invoke-static {v7, v2}, Lfs0/b;->e(Lfs0/b;Lqw2/b;)Z

    move-result v2

    if-ne v2, v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v4

    :goto_6
    invoke-direct {p1, v6, v3}, Lds0/e$g;-><init>(Lds0/b;Z)V

    iput-object v5, p0, Lfs0/b$c;->G:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->y:Ljava/lang/Object;

    iput-object v5, p0, Lfs0/b$c;->z:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, p0, Lfs0/b$c;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_7
    return-object v1

    :cond_b
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method
