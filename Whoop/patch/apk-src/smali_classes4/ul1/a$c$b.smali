.class public final Lul1/a$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lul1/a$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0001\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lkotlin/Array;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$$inlined$combine$1$3"
    f = "DialogStateCombiner.kt"
    l = {
        0xf6,
        0xf7,
        0xea
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field final synthetic H:Lul1/a;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:Ljava/lang/Object;

.field N:Ljava/lang/Object;

.field O:I

.field P:Z

.field Q:Z

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;Lul1/a;)V
    .locals 0

    iput-object p2, p0, Lul1/a$c$b;->H:Lul1/a;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "[",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lul1/a$c$b;

    iget-object v1, p0, Lul1/a$c$b;->H:Lul1/a;

    invoke-direct {v0, p3, v1}, Lul1/a$c$b;-><init>(Lq83/d;Lul1/a;)V

    iput-object p1, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lul1/a$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lul1/a$c$b;->invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lul1/a$c$b;->w:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v1, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lul1/a$c$b;->N:Ljava/lang/Object;

    check-cast v2, Lgk2/g;

    iget-object v2, v0, Lul1/a$c$b;->M:Ljava/lang/Object;

    check-cast v2, Lml1/d;

    iget-object v2, v0, Lul1/a$c$b;->L:Ljava/lang/Object;

    check-cast v2, Lsx1/e;

    iget-object v2, v0, Lul1/a$c$b;->K:Ljava/lang/Object;

    check-cast v2, Lgt0/h;

    iget-object v2, v0, Lul1/a$c$b;->J:Ljava/lang/Object;

    check-cast v2, Lvv1/b;

    iget-object v2, v0, Lul1/a$c$b;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lul1/a$c$b;->F:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    iget-object v2, v0, Lul1/a$c$b;->E:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lul1/a$c$b;->z:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    check-cast v5, [Ljava/lang/Object;

    iget-object v5, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto/16 :goto_1

    :cond_2
    iget v2, v0, Lul1/a$c$b;->O:I

    iget-boolean v8, v0, Lul1/a$c$b;->Q:Z

    iget-boolean v9, v0, Lul1/a$c$b;->P:Z

    iget v10, v0, Lul1/a$c$b;->G:I

    iget-object v11, v0, Lul1/a$c$b;->N:Ljava/lang/Object;

    check-cast v11, Lgk2/g;

    iget-object v11, v0, Lul1/a$c$b;->M:Ljava/lang/Object;

    check-cast v11, Lml1/d;

    iget-object v11, v0, Lul1/a$c$b;->L:Ljava/lang/Object;

    check-cast v11, Lsx1/e;

    iget-object v11, v0, Lul1/a$c$b;->K:Ljava/lang/Object;

    check-cast v11, Lgt0/h;

    iget-object v11, v0, Lul1/a$c$b;->J:Ljava/lang/Object;

    check-cast v11, Lvv1/b;

    iget-object v11, v0, Lul1/a$c$b;->I:Ljava/lang/Object;

    check-cast v11, Lq83/d;

    iget-object v11, v0, Lul1/a$c$b;->F:Ljava/lang/Object;

    check-cast v11, [Ljava/lang/Object;

    iget-object v11, v0, Lul1/a$c$b;->E:Ljava/lang/Object;

    check-cast v11, Lq83/d;

    iget-object v11, v0, Lul1/a$c$b;->z:Ljava/lang/Object;

    check-cast v11, Lec3/m;

    iget-object v12, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    iget-object v12, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    check-cast v12, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v9

    move v9, v2

    move-object v2, v11

    move v11, v8

    move-object/from16 v8, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v8, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    check-cast v8, [Ljava/lang/Object;

    aget-object v9, v8, v6

    aget-object v10, v8, v4

    aget-object v11, v8, v5

    aget-object v12, v8, v3

    const/4 v13, 0x4

    aget-object v13, v8, v13

    const/4 v14, 0x5

    aget-object v14, v8, v14

    const/4 v15, 0x6

    aget-object v8, v8, v15

    check-cast v8, Lvv1/b;

    check-cast v14, Lgt0/h;

    check-cast v13, Lsx1/e;

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    check-cast v10, Lml1/d;

    check-cast v9, Lgk2/g;

    if-eqz v12, :cond_6

    iget-object v8, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v8}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v8

    const-string v9, "App Crash"

    new-array v10, v6, [Lqr2/a$a;

    invoke-interface {v8, v9, v10}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v8, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v8}, Lul1/a;->f(Lul1/a;)La6/g;

    move-result-object v8

    invoke-interface {v8}, La6/g;->getData()Lec3/l;

    move-result-object v8

    iput-object v7, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    iput-object v2, v0, Lul1/a$c$b;->z:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->E:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->F:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->I:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->J:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->K:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->L:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->M:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->N:Ljava/lang/Object;

    iput v6, v0, Lul1/a$c$b;->G:I

    iput-boolean v12, v0, Lul1/a$c$b;->P:Z

    iput-boolean v11, v0, Lul1/a$c$b;->Q:Z

    iput v6, v0, Lul1/a$c$b;->O:I

    iput v4, v0, Lul1/a$c$b;->w:I

    invoke-static {v8, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_4

    goto/16 :goto_5

    :cond_4
    move v9, v6

    move v10, v9

    :goto_0
    check-cast v8, Lf6/f;

    invoke-static {}, Lrr2/e;->a()Lf6/d;

    move-result-object v13

    invoke-virtual {v8, v13}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    iget-object v8, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v8}, Lul1/a;->f(Lul1/a;)La6/g;

    move-result-object v8

    invoke-interface {v8}, La6/g;->getData()Lec3/l;

    move-result-object v8

    iput-object v7, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    iput-object v2, v0, Lul1/a$c$b;->z:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->E:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->F:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->I:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->J:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->K:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->L:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->M:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->N:Ljava/lang/Object;

    iput v10, v0, Lul1/a$c$b;->G:I

    iput-boolean v12, v0, Lul1/a$c$b;->P:Z

    iput-boolean v11, v0, Lul1/a$c$b;->Q:Z

    iput v9, v0, Lul1/a$c$b;->O:I

    iput v5, v0, Lul1/a$c$b;->w:I

    invoke-static {v8, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_1
    check-cast v5, Lf6/f;

    invoke-static {}, Lrr2/e;->a()Lf6/d;

    move-result-object v8

    invoke-virtual {v5, v8}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    new-instance v8, Lul1/b$a;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lfl1/b;->b:I

    new-instance v11, Lcom/whoop/design/util/TextResource$d$c;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v11, v5}, Lcom/whoop/design/util/TextResource$d$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    new-array v4, v4, [Lcom/whoop/design/util/TextResource$d;

    aput-object v11, v4, v6

    invoke-direct {v9, v10, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-direct {v8, v9}, Lul1/b$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    goto/16 :goto_4

    :cond_6
    sget-object v4, Lgk2/g;->HARD_TOMBSTONE:Lgk2/g;

    if-ne v9, v4, :cond_7

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v4

    const-string v5, "Hard Tombstone"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v8, Lul1/b$g;->m:Lul1/b$g;

    goto/16 :goto_4

    :cond_7
    invoke-virtual {v10}, Lml1/d;->a()Lfn0/b;

    move-result-object v4

    sget-object v10, Lfn0/b;->SHOW_CDM_DIALOG:Lfn0/b;

    if-ne v4, v10, :cond_8

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v4

    const-string v5, "CDM: CDM Dialog"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v8, Lul1/b$h;->m:Lul1/b$h;

    goto/16 :goto_4

    :cond_8
    invoke-virtual {v13}, Lsx1/e;->c()Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v13}, Lsx1/e;->d()Ljava/util/List;

    move-result-object v4

    sget-object v10, Lsx1/b;->HOME_SCREEN:Lsx1/b;

    invoke-interface {v4, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v4

    const-string v5, "Reactivation Dialog"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v8, Lul1/b$j;->m:Lul1/b$j;

    goto/16 :goto_4

    :cond_9
    invoke-virtual {v8}, Lvv1/b;->a()Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v4

    const-string v5, "Dunning Bottom Sheet Dialog"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v8, Lul1/b$c;->m:Lul1/b$c;

    goto/16 :goto_4

    :cond_a
    sget-object v4, Lgk2/g;->SOFT_TOMBSTONE:Lgk2/g;

    if-ne v9, v4, :cond_b

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v4

    const-string v5, "Soft Tombstone"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v8, Lul1/b$l;->m:Lul1/b$l;

    goto/16 :goto_4

    :cond_b
    if-eqz v11, :cond_c

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->d(Lul1/a;)Lul1/d;

    move-result-object v4

    invoke-virtual {v4}, Lul1/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->j(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;

    move-result-object v4

    iget-object v5, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v5}, Lul1/a;->d(Lul1/a;)Lul1/d;

    move-result-object v5

    invoke-virtual {v5}, Lul1/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->j(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;

    move-result-object v5

    iget-object v8, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v8}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v8

    const-string v9, "Show Language Modal"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v8, v9, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v8, Lul1/b$i;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lfl1/b;->q:I

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lfl1/b;->o:I

    filled-new-array {v4, v5}, [Lcom/whoop/design/util/TextResource$d$c;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v9, v10, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;)V

    invoke-direct {v8, v6, v9}, Lul1/b$i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    goto/16 :goto_4

    :cond_c
    instance-of v4, v14, Lgt0/h$d;

    if-eqz v4, :cond_11

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object v4

    const-string v8, "Show New Firmware Update Prompt"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v8, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v4, v0, Lul1/a$c$b;->H:Lul1/a;

    invoke-static {v4}, Lul1/a;->g(Lul1/a;)Lci2/b;

    move-result-object v4

    invoke-interface {v4}, Lci2/b;->b()Lec3/t1;

    move-result-object v4

    invoke-interface {v4}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljk0/d;

    if-eqz v4, :cond_10

    invoke-interface {v4}, Ljk0/d;->k()Lws0/a;

    move-result-object v4

    invoke-virtual {v4}, Lws0/a;->b()Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v4, Lul1/b$b;->m:Lul1/b$b;

    :goto_2
    move-object v8, v4

    goto :goto_3

    :cond_d
    check-cast v14, Lgt0/h$d;

    invoke-virtual {v14}, Lgt0/h$d;->b()Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v4, Lul1/b$e;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v8, Los0/h;->K:I

    invoke-direct {v6, v8, v7, v5, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Los0/h;->J:I

    invoke-direct {v8, v9, v7, v5, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v6, v8}, Lul1/b$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    goto :goto_2

    :cond_e
    invoke-virtual {v14}, Lgt0/h$d;->a()Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v4, Lul1/b$d;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v8, Los0/h;->K:I

    invoke-direct {v6, v8, v7, v5, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Los0/h;->J:I

    invoke-direct {v8, v9, v7, v5, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Los0/h;->I:I

    invoke-direct {v9, v10, v7, v5, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v6, v8, v9}, Lul1/b$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    goto :goto_2

    :cond_f
    sget-object v4, Lul1/b$b;->m:Lul1/b$b;

    goto :goto_2

    :goto_3
    if-nez v8, :cond_12

    :cond_10
    sget-object v8, Lul1/b$b;->m:Lul1/b$b;

    goto :goto_4

    :cond_11
    sget-object v8, Lul1/b$b;->m:Lul1/b$b;

    :cond_12
    :goto_4
    iput-object v7, v0, Lul1/a$c$b;->x:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->y:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->z:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->E:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->F:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->I:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->J:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->K:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->L:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->M:Ljava/lang/Object;

    iput-object v7, v0, Lul1/a$c$b;->N:Ljava/lang/Object;

    iput v3, v0, Lul1/a$c$b;->w:I

    invoke-interface {v2, v8, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_13

    :goto_5
    return-object v1

    :cond_13
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
