.class final Lur1/m$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/m;->C(Lsr1/e$d;Lq83/d;)Ljava/lang/Object;
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
        "Lsr1/e;",
        "<anonymous>",
        "(Lbc3/c0;)Lsr1/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$save$2"
    f = "JournalFetchInteractor.kt"
    l = {
        0x77,
        0x7a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:Z

.field G:Z

.field H:I

.field final synthetic I:Lsr1/e$d;

.field final synthetic J:Lur1/m;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lsr1/e$d;Lur1/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsr1/e$d;",
            "Lur1/m;",
            "Lq83/d<",
            "-",
            "Lur1/m$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur1/m$l;->I:Lsr1/e$d;

    iput-object p2, p0, Lur1/m$l;->J:Lur1/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lur1/m$l;

    iget-object v0, p0, Lur1/m$l;->I:Lsr1/e$d;

    iget-object v1, p0, Lur1/m$l;->J:Lur1/m;

    invoke-direct {p1, v0, v1, p2}, Lur1/m$l;-><init>(Lsr1/e$d;Lur1/m;Lq83/d;)V

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
            "Lsr1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lur1/m$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lur1/m$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lur1/m$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lur1/m$l;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lur1/m$l;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-boolean v1, v0, Lur1/m$l;->G:Z

    iget-boolean v2, v0, Lur1/m$l;->F:Z

    iget-boolean v6, v0, Lur1/m$l;->E:Z

    iget-object v7, v0, Lur1/m$l;->y:Ljava/lang/Object;

    check-cast v7, Lsr1/e$d;

    iget-object v8, v0, Lur1/m$l;->x:Ljava/lang/Object;

    check-cast v8, Lsr1/e$d;

    iget-object v9, v0, Lur1/m$l;->w:Ljava/lang/Object;

    check-cast v9, Lur1/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v19, v1

    move v14, v2

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lur1/m$l;->z:I

    iget-object v6, v0, Lur1/m$l;->y:Ljava/lang/Object;

    check-cast v6, Lsr1/e$d;

    iget-object v7, v0, Lur1/m$l;->x:Ljava/lang/Object;

    check-cast v7, Lsr1/e$d;

    iget-object v8, v0, Lur1/m$l;->w:Ljava/lang/Object;

    check-cast v8, Lur1/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v8

    move-object v8, v7

    move-object/from16 v7, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lur1/m$l;->I:Lsr1/e$d;

    iget-object v6, v0, Lur1/m$l;->J:Lur1/m;

    invoke-static {v6}, Lur1/m;->g(Lur1/m;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object v7

    invoke-virtual {v2}, Lsr1/e$d;->b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    move-result-object v8

    invoke-virtual {v2}, Lsr1/e$d;->c()Ljava/lang/String;

    move-result-object v9

    iput-object v6, v0, Lur1/m$l;->w:Ljava/lang/Object;

    iput-object v2, v0, Lur1/m$l;->x:Ljava/lang/Object;

    iput-object v2, v0, Lur1/m$l;->y:Ljava/lang/Object;

    iput v4, v0, Lur1/m$l;->z:I

    iput v5, v0, Lur1/m$l;->H:I

    invoke-virtual {v7, v8, v9, v0}, Lcom/whoop/data/repositories/JournalRepository;->saveJournalTrackerInputs(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v8, v2

    move-object v9, v6

    move-object v6, v8

    move v2, v4

    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-virtual {v6}, Lsr1/e$d;->d()Z

    move-result v10

    invoke-virtual {v6}, Lsr1/e$d;->e()Z

    move-result v11

    invoke-static {v9}, Lur1/m;->g(Lur1/m;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object v12

    iput-object v9, v0, Lur1/m$l;->w:Ljava/lang/Object;

    iput-object v8, v0, Lur1/m$l;->x:Ljava/lang/Object;

    iput-object v6, v0, Lur1/m$l;->y:Ljava/lang/Object;

    iput v2, v0, Lur1/m$l;->z:I

    iput-boolean v7, v0, Lur1/m$l;->E:Z

    iput-boolean v10, v0, Lur1/m$l;->F:Z

    iput-boolean v11, v0, Lur1/m$l;->G:Z

    iput v3, v0, Lur1/m$l;->H:I

    invoke-virtual {v12, v10, v0}, Lcom/whoop/data/repositories/JournalRepository;->setStateOfUsersLastDefaultToggle(ZLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move v14, v7

    move-object v7, v6

    move v6, v14

    move v14, v10

    move/from16 v19, v11

    :goto_2
    invoke-static {v9}, Lur1/m;->d(Lur1/m;)Lyr1/a;

    move-result-object v12

    invoke-virtual {v8}, Lsr1/e$d;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8}, Lsr1/e$d;->b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;->getNotes()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    move v1, v5

    goto :goto_3

    :cond_5
    move v1, v4

    :goto_3
    move v15, v1

    goto :goto_4

    :cond_6
    move v15, v4

    :goto_4
    invoke-virtual {v8}, Lsr1/e$d;->b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;->getTrackerInputs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v16

    invoke-virtual {v8}, Lsr1/e$d;->b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;->getTrackerInputs()Ljava/util/List;

    move-result-object v1

    invoke-static {v9, v1}, Lur1/m;->c(Lur1/m;Ljava/util/List;)I

    move-result v17

    sget-object v1, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {v8}, Lsr1/e$d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9}, Lur1/m;->h(Lur1/m;)Ltr2/n;

    move-result-object v8

    invoke-virtual {v1, v2, v8}, Lor2/u$a;->l(Ljava/lang/String;Ltr2/n;)Z

    move-result v18

    invoke-virtual/range {v12 .. v19}, Lyr1/a;->o(Ljava/lang/String;ZZIIZZ)V

    if-eqz v6, :cond_7

    new-instance v1, Lsr1/e$c;

    invoke-direct {v1, v5}, Lsr1/e$c;-><init>(Z)V

    return-object v1

    :cond_7
    invoke-static {v9}, Lur1/m;->h(Lur1/m;)Ltr2/n;

    move-result-object v1

    invoke-virtual {v7}, Lsr1/e$d;->a()J

    move-result-wide v5

    invoke-virtual {v7}, Lsr1/e$d;->b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    move-result-object v2

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Saving journal entry for "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " and payload "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " failed"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v5, Lsr1/e$a;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lpr1/c;->h:I

    const/4 v2, 0x0

    invoke-direct {v6, v1, v2, v3, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Lsr1/f;->COULD_NOT_SAVE:Lsr1/f;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lsr1/e$a;-><init>(Lcom/whoop/design/util/TextResource;Lsr1/f;Lwr1/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
