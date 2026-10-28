.class final Lcom/whoop/puffin/sync/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/puffin/sync/d;->q(Lfk0/d;Lcom/whoop/puffin/sync/e$b;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$validateAndSaveData$2"
    f = "BatterySyncInteractor.kt"
    l = {
        0x81,
        0x81,
        0x86
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lfk0/d;

.field final synthetic J:Lcom/whoop/puffin/sync/e$b;

.field final synthetic K:Lcom/whoop/puffin/sync/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfk0/d;Lcom/whoop/puffin/sync/e$b;Lcom/whoop/puffin/sync/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfk0/d;",
            "Lcom/whoop/puffin/sync/e$b;",
            "Lcom/whoop/puffin/sync/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/puffin/sync/d$c;->I:Lfk0/d;

    iput-object p2, p0, Lcom/whoop/puffin/sync/d$c;->J:Lcom/whoop/puffin/sync/e$b;

    iput-object p3, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

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

    new-instance v0, Lcom/whoop/puffin/sync/d$c;

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$c;->I:Lfk0/d;

    iget-object v2, p0, Lcom/whoop/puffin/sync/d$c;->J:Lcom/whoop/puffin/sync/e$b;

    iget-object v3, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/whoop/puffin/sync/d$c;-><init>(Lfk0/d;Lcom/whoop/puffin/sync/e$b;Lcom/whoop/puffin/sync/d;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/puffin/sync/d$c;->H:Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/puffin/sync/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/puffin/sync/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c;->H:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/puffin/sync/d$c;->G:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v0, p0, Lcom/whoop/puffin/sync/d$c;->F:I

    iget v2, p0, Lcom/whoop/puffin/sync/d$c;->E:I

    iget-object v4, p0, Lcom/whoop/puffin/sync/d$c;->y:Ljava/lang/Object;

    check-cast v4, Lbc3/i0;

    iget-object v5, p0, Lcom/whoop/puffin/sync/d$c;->x:Ljava/lang/Object;

    check-cast v5, Lbc3/i0;

    iget-object v5, p0, Lcom/whoop/puffin/sync/d$c;->w:Ljava/lang/Object;

    check-cast v5, Lbc3/i0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    iget v0, p0, Lcom/whoop/puffin/sync/d$c;->F:I

    iget v2, p0, Lcom/whoop/puffin/sync/d$c;->E:I

    iget-object v5, p0, Lcom/whoop/puffin/sync/d$c;->z:Ljava/lang/Object;

    check-cast v5, Lou0/e;

    iget-object v8, p0, Lcom/whoop/puffin/sync/d$c;->y:Ljava/lang/Object;

    check-cast v8, Lbc3/i0;

    iget-object v9, p0, Lcom/whoop/puffin/sync/d$c;->x:Ljava/lang/Object;

    check-cast v9, Lbc3/i0;

    iget-object v9, p0, Lcom/whoop/puffin/sync/d$c;->w:Ljava/lang/Object;

    check-cast v9, Lbc3/i0;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/puffin/sync/d$c;->I:Lfk0/d;

    invoke-virtual {p1}, Lfk0/d;->J()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    long-to-int p1, v8

    iget-object v2, p0, Lcom/whoop/puffin/sync/d$c;->J:Lcom/whoop/puffin/sync/e$b;

    invoke-virtual {v2}, Lcom/whoop/puffin/sync/e$b;->a()Lf52/g;

    move-result-object v2

    invoke-static {v2}, Lf52/h;->a(Lf52/g;)I

    move-result v2

    iget-object v8, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    invoke-static {v8}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object v8

    iget-object v9, p0, Lcom/whoop/puffin/sync/d$c;->I:Lfk0/d;

    invoke-virtual {v9}, Lfk0/d;->J()Ljava/lang/Long;

    move-result-object v9

    iget-object v10, p0, Lcom/whoop/puffin/sync/d$c;->J:Lcom/whoop/puffin/sync/e$b;

    invoke-virtual {v10}, Lcom/whoop/puffin/sync/e$b;->a()Lf52/g;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Expected number of packets: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, ", Received "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " packets: "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v6, [Lqr2/a$a;

    invoke-interface {v8, v9, v10}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eq p1, v2, :cond_4

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    new-instance v8, Lcom/whoop/puffin/sync/d$c$a;

    iget-object v9, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    iget-object v10, p0, Lcom/whoop/puffin/sync/d$c;->J:Lcom/whoop/puffin/sync/e$b;

    invoke-direct {v8, v9, v10, v7}, Lcom/whoop/puffin/sync/d$c$a;-><init>(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/e$b;Lq83/d;)V

    invoke-static {v0, v7, v8, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v8

    new-instance v9, Lcom/whoop/puffin/sync/d$c$b;

    iget-object v10, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    iget-object v11, p0, Lcom/whoop/puffin/sync/d$c;->J:Lcom/whoop/puffin/sync/e$b;

    invoke-direct {v9, v10, v11, v7}, Lcom/whoop/puffin/sync/d$c$b;-><init>(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/e$b;Lq83/d;)V

    invoke-static {v0, v7, v9, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v9

    new-instance v10, Lcom/whoop/puffin/sync/d$c$c;

    iget-object v11, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    invoke-direct {v10, v11, v8, v7}, Lcom/whoop/puffin/sync/d$c$c;-><init>(Lcom/whoop/puffin/sync/d;Lbc3/i0;Lq83/d;)V

    invoke-static {v0, v7, v10, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    :try_start_2
    iget-object v8, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    invoke-static {v8}, Lcom/whoop/puffin/sync/d;->e(Lcom/whoop/puffin/sync/d;)Lou0/e;

    move-result-object v8

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->H:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->w:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->x:Ljava/lang/Object;

    iput-object v0, p0, Lcom/whoop/puffin/sync/d$c;->y:Ljava/lang/Object;

    iput-object v8, p0, Lcom/whoop/puffin/sync/d$c;->z:Ljava/lang/Object;

    iput p1, p0, Lcom/whoop/puffin/sync/d$c;->E:I

    iput v2, p0, Lcom/whoop/puffin/sync/d$c;->F:I

    iput v5, p0, Lcom/whoop/puffin/sync/d$c;->G:I

    invoke-virtual {v9, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_5

    goto :goto_2

    :cond_5
    move v13, v2

    move v2, p1

    move-object p1, v5

    move-object v5, v8

    move-object v8, v0

    move v0, v13

    :goto_0
    check-cast p1, Ljava/util/List;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->H:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->w:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->x:Ljava/lang/Object;

    iput-object v8, p0, Lcom/whoop/puffin/sync/d$c;->y:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->z:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/puffin/sync/d$c;->E:I

    iput v0, p0, Lcom/whoop/puffin/sync/d$c;->F:I

    iput v4, p0, Lcom/whoop/puffin/sync/d$c;->G:I

    invoke-interface {v5, p1, p0}, Lou0/e;->insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    move-object v4, v8

    :goto_1
    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->H:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->w:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->x:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/d$c;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/puffin/sync/d$c;->E:I

    iput v0, p0, Lcom/whoop/puffin/sync/d$c;->F:I

    iput v3, p0, Lcom/whoop/puffin/sync/d$c;->G:I

    invoke-interface {v4, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1

    :goto_3
    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    invoke-static {v0}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object v0

    const-string v1, "Failed to save firmware event data to database"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c;->K:Lcom/whoop/puffin/sync/d;

    invoke-static {v0}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object v0

    const-string v1, "Failed to read expected packet count"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1
.end method
