.class public final Lxd2/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd2/k$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lxd2/k;


# direct methods
.method public constructor <init>(Lec3/m;Lxd2/k;)V
    .locals 0

    iput-object p1, p0, Lxd2/k$a$a;->w:Lec3/m;

    iput-object p2, p0, Lxd2/k$a$a;->x:Lxd2/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lxd2/k$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxd2/k$a$a$a;

    iget v3, v2, Lxd2/k$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxd2/k$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lxd2/k$a$a$a;

    invoke-direct {v2, v0, v1}, Lxd2/k$a$a$a;-><init>(Lxd2/k$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lxd2/k$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lxd2/k$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lxd2/k$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lxd2/k$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lxd2/k$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lxd2/k$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lvd2/b;

    invoke-virtual {v4}, Lvd2/b;->c()Lvd2/d;

    move-result-object v6

    sget-object v7, Lvd2/d$g;->a:Lvd2/d$g;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    sget-object v4, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v4}, Lxd2/j$a$a;->d()Lxd2/j$a;

    move-result-object v4

    goto/16 :goto_2

    :cond_3
    sget-object v7, Lvd2/d$e;->a:Lvd2/d$e;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    sget-object v4, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v4}, Lxd2/j$a$a;->c()Lxd2/j$a;

    move-result-object v4

    goto/16 :goto_2

    :cond_4
    sget-object v7, Lvd2/d$f;->a:Lvd2/d$f;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v6, v0, Lxd2/k$a$a;->x:Lxd2/k;

    invoke-virtual {v4}, Lvd2/b;->d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v7

    invoke-virtual {v4}, Lvd2/b;->e()Z

    move-result v9

    invoke-static {v6, v4, v7, v9}, Lxd2/k;->a(Lxd2/k;Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;

    move-result-object v4

    goto/16 :goto_2

    :cond_5
    sget-object v7, Lvd2/d$a;->a:Lvd2/d$a;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v6, v0, Lxd2/k$a$a;->x:Lxd2/k;

    invoke-virtual {v4}, Lvd2/b;->d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v7

    invoke-virtual {v4}, Lvd2/b;->e()Z

    move-result v9

    invoke-static {v6, v4, v7, v9}, Lxd2/k;->a(Lxd2/k;Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;

    move-result-object v4

    goto/16 :goto_2

    :cond_6
    sget-object v7, Lvd2/d$h;->a:Lvd2/d$h;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    sget-object v4, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v4}, Lxd2/j$a$a;->a()Lxd2/j$a;

    move-result-object v9

    sget-object v16, Lxd2/h$a;->a:Lxd2/h$a;

    const/16 v17, 0x3f

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v18}, Lxd2/j$a;->f(Lxd2/j$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;ILjava/lang/Object;)Lxd2/j$a;

    move-result-object v4

    goto/16 :goto_2

    :cond_7
    sget-object v7, Lvd2/d$j;->a:Lvd2/d$j;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x2

    if-eqz v9, :cond_8

    new-instance v11, Lxd2/j$a;

    new-instance v12, Lsz0/p0$h;

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lkd2/a;->b:I

    invoke-direct {v13, v4, v8, v10, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x6

    const/16 v18, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v18, Lxd2/h$m;->a:Lxd2/h$m;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v20}, Lxd2/j$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v4, v11

    goto/16 :goto_2

    :cond_8
    sget-object v9, Lvd2/d$c;->a:Lvd2/d$c;

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    sget-object v4, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v4}, Lxd2/j$a$a;->b()Lxd2/j$a;

    move-result-object v9

    sget-object v13, Lxd2/h$n;->a:Lxd2/h$n;

    sget-object v15, Lxd2/h$c;->a:Lxd2/h$c;

    const/16 v17, 0x57

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lxd2/j$a;->f(Lxd2/j$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;ILjava/lang/Object;)Lxd2/j$a;

    move-result-object v4

    goto/16 :goto_2

    :cond_9
    instance-of v9, v6, Lvd2/d$b;

    if-eqz v9, :cond_a

    iget-object v6, v0, Lxd2/k$a$a;->x:Lxd2/k;

    invoke-virtual {v4}, Lvd2/b;->d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v7

    invoke-virtual {v4}, Lvd2/b;->e()Z

    move-result v9

    invoke-static {v6, v4, v7, v9}, Lxd2/k;->a(Lxd2/k;Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;

    move-result-object v4

    goto/16 :goto_2

    :cond_a
    instance-of v9, v6, Lvd2/d$i;

    if-eqz v9, :cond_b

    sget-object v6, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v6}, Lxd2/j$a$a;->a()Lxd2/j$a;

    move-result-object v9

    new-instance v6, Lxd2/h$b;

    invoke-virtual {v4}, Lvd2/b;->c()Lvd2/d;

    move-result-object v4

    check-cast v4, Lvd2/d$i;

    invoke-virtual {v4}, Lvd2/d$i;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Lxd2/h$b;-><init>(Ljava/lang/String;)V

    const/16 v17, 0x3f

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v6

    invoke-static/range {v9 .. v18}, Lxd2/j$a;->f(Lxd2/j$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;ILjava/lang/Object;)Lxd2/j$a;

    move-result-object v4

    goto :goto_2

    :cond_b
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    new-instance v11, Lxd2/j$a;

    new-instance v12, Lsz0/p0$h;

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lkd2/a;->b:I

    invoke-direct {v13, v4, v8, v10, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x6

    const/16 v18, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v18, Lxd2/h$m;->a:Lxd2/h$m;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v20}, Lxd2/j$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_c
    instance-of v6, v6, Lvd2/d$d;

    if-eqz v6, :cond_e

    sget-object v6, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v6}, Lxd2/j$a$a;->b()Lxd2/j$a;

    move-result-object v9

    new-instance v13, Lxd2/h$o;

    invoke-virtual {v4}, Lvd2/b;->c()Lvd2/d;

    move-result-object v4

    check-cast v4, Lvd2/d$d;

    invoke-virtual {v4}, Lvd2/d$d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v13, v4}, Lxd2/h$o;-><init>(Ljava/lang/String;)V

    sget-object v15, Lxd2/h$c;->a:Lxd2/h$c;

    const/16 v17, 0x57

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lxd2/j$a;->f(Lxd2/j$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;ILjava/lang/Object;)Lxd2/j$a;

    move-result-object v4

    :goto_2
    iput-object v8, v2, Lxd2/k$a$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lxd2/k$a$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lxd2/k$a$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lxd2/k$a$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lxd2/k$a$a$a;->H:I

    iput v5, v2, Lxd2/k$a$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    return-object v3

    :cond_d
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
