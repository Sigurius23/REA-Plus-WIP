.class public final Lvd2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0014\u0010\r\u001a\u00020\u000c*\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u00020\u000c*\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u000c*\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ \u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J!\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lvd2/c;",
        "",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "api",
        "Lfi0/a;",
        "analytics",
        "Lxm0/b;",
        "cacheUpdater",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/shepherd/domain/ShepherdApi;Lfi0/a;Lxm0/b;Ltr2/n;)V",
        "Lvd2/b;",
        "j",
        "(Lvd2/b;Lq83/d;)Ljava/lang/Object;",
        "",
        "nextToken",
        "i",
        "(Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "g",
        "domainState",
        "historyDate",
        "h",
        "Lec3/l;",
        "Lvd2/a;",
        "upstream",
        "k",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "b",
        "Lfi0/a;",
        "c",
        "Lxm0/b;",
        "d",
        "Ltr2/n;",
        "shepherd_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/shepherd/domain/ShepherdApi;

.field private final b:Lfi0/a;

.field private final c:Lxm0/b;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Lfi0/a;Lxm0/b;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheUpdater"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    iput-object p2, p0, Lvd2/c;->b:Lfi0/a;

    iput-object p3, p0, Lvd2/c;->c:Lxm0/b;

    iput-object p4, p0, Lvd2/c;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lvd2/c;Lvd2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvd2/c;->g(Lvd2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lvd2/c;Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvd2/c;->h(Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lvd2/c;Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvd2/c;->i(Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvd2/c;Lvd2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvd2/c;->j(Lvd2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lvd2/c;)Lfi0/a;
    .locals 0

    iget-object p0, p0, Lvd2/c;->b:Lfi0/a;

    return-object p0
.end method

.method public static final synthetic f(Lvd2/c;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lvd2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method private final g(Lvd2/b;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd2/b;",
            "Lq83/d<",
            "-",
            "Lvd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lvd2/c$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lvd2/c$a;

    iget v3, v2, Lvd2/c$a;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvd2/c$a;->F:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lvd2/c$a;

    invoke-direct {v2, v0, v1}, Lvd2/c$a;-><init>(Lvd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lvd2/c$a;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lvd2/c$a;->F:I

    const/4 v11, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Lvd2/c$a;->x:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v3, v8, Lvd2/c$a;->w:Ljava/lang/Object;

    check-cast v3, Lvd2/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lvd2/c$a;->w:Ljava/lang/Object;

    check-cast v3, Lvd2/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v3

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lvd2/c;->d:Ltr2/n;

    new-instance v7, Lvd2/c$b;

    const/4 v5, 0x0

    invoke-direct {v7, v0, v5}, Lvd2/c$b;-><init>(Lvd2/c;Lq83/d;)V

    move-object/from16 v12, p1

    iput-object v12, v8, Lvd2/c$a;->w:Ljava/lang/Object;

    iput v4, v8, Lvd2/c$a;->F:I

    const-string v6, "Failed to delete all arrhythmia history"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast v1, Lu02/a;

    instance-of v3, v1, Lu02/a$c;

    if-eqz v3, :cond_6

    iget-object v3, v0, Lvd2/c;->c:Lxm0/b;

    iput-object v12, v8, Lvd2/c$a;->w:Ljava/lang/Object;

    iput-object v1, v8, Lvd2/c$a;->x:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v8, Lvd2/c$a;->y:I

    iput v11, v8, Lvd2/c$a;->F:I

    const-string v4, "shepherdrefreshscope"

    invoke-virtual {v3, v4, v8}, Lxm0/b;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    move-object v2, v1

    move-object v3, v12

    :goto_4
    sget-object v4, Lvd2/d$j;->a:Lvd2/d$j;

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_7

    sget-object v13, Lvd2/d$c;->a:Lvd2/d$c;

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v1

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final h(Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lvd2/c$c;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lvd2/c$c;

    iget v4, v3, Lvd2/c$c;->I:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lvd2/c$c;->I:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lvd2/c$c;

    invoke-direct {v3, v0, v2}, Lvd2/c$c;-><init>(Lvd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lvd2/c$c;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lvd2/c$c;->I:I

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v5, 0x1

    const/4 v14, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v13, :cond_1

    iget-object v1, v9, Lvd2/c$c;->z:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v9, Lvd2/c$c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v9, Lvd2/c$c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v9, Lvd2/c$c;->w:Ljava/lang/Object;

    check-cast v3, Lvd2/b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v3

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v9, Lvd2/c$c;->E:I

    iget-object v4, v9, Lvd2/c$c;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v9, Lvd2/c$c;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v9, Lvd2/c$c;->w:Ljava/lang/Object;

    check-cast v5, Lvd2/b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v2

    move v2, v1

    move-object v1, v4

    move-object v4, v15

    move-object v15, v5

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lvd2/c;->d:Ltr2/n;

    invoke-static {v1, v2}, Lrd2/d;->a(Ljava/lang/String;Ltr2/n;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lvd2/c;->d:Ltr2/n;

    const-string v7, "Failed to delete arrhythmia history by date: "

    invoke-static {v7, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lvd2/c$d;

    invoke-direct {v8, v0, v2, v14}, Lvd2/c$d;-><init>(Lvd2/c;Ljava/lang/String;Lq83/d;)V

    move-object/from16 v2, p1

    iput-object v2, v9, Lvd2/c$c;->w:Ljava/lang/Object;

    iput-object v1, v9, Lvd2/c$c;->x:Ljava/lang/Object;

    iput-object v14, v9, Lvd2/c$c;->y:Ljava/lang/Object;

    iput v12, v9, Lvd2/c$c;->E:I

    iput v5, v9, Lvd2/c$c;->I:I

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v15, v2

    move v2, v12

    :goto_2
    check-cast v4, Lu02/a;

    instance-of v5, v4, Lu02/a$b;

    if-eqz v5, :cond_5

    new-instance v2, Lvd2/d$d;

    invoke-direct {v2, v1}, Lvd2/d$d;-><init>(Ljava/lang/String;)V

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v15 .. v21}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v2

    goto :goto_5

    :cond_5
    instance-of v4, v4, Lu02/a$c;

    if-eqz v4, :cond_8

    iget-object v4, v0, Lvd2/c;->c:Lxm0/b;

    iput-object v15, v9, Lvd2/c$c;->w:Ljava/lang/Object;

    iput-object v1, v9, Lvd2/c$c;->x:Ljava/lang/Object;

    iput-object v14, v9, Lvd2/c$c;->y:Ljava/lang/Object;

    iput-object v14, v9, Lvd2/c$c;->z:Ljava/lang/Object;

    iput v2, v9, Lvd2/c$c;->E:I

    iput v12, v9, Lvd2/c$c;->F:I

    iput v13, v9, Lvd2/c$c;->I:I

    const-string v2, "shepherdrefreshscope"

    invoke-virtual {v4, v2, v9}, Lxm0/b;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_6

    :goto_3
    return-object v3

    :cond_6
    move-object v2, v15

    :goto_4
    sget-object v3, Lvd2/d$j;->a:Lvd2/d$j;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v3

    move-object v15, v2

    move-object v2, v3

    :goto_5
    if-nez v2, :cond_7

    move-object v2, v15

    goto :goto_6

    :cond_7
    return-object v2

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    move-object/from16 v2, p1

    :goto_6
    new-instance v3, Lvd2/d$d;

    invoke-direct {v3, v1}, Lvd2/d$d;-><init>(Ljava/lang/String;)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v1

    return-object v1
.end method

.method private final i(Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lvd2/c$e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lvd2/c$e;

    iget v3, v2, Lvd2/c$e;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvd2/c$e;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lvd2/c$e;

    invoke-direct {v2, v0, v1}, Lvd2/c$e;-><init>(Lvd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lvd2/c$e;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lvd2/c$e;->E:I

    const/4 v4, 0x1

    const/4 v11, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lvd2/c$e;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lvd2/c$e;->w:Ljava/lang/Object;

    check-cast v2, Lvd2/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v2

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lvd2/c;->d:Ltr2/n;

    new-instance v7, Lvd2/c$f;

    move-object/from16 v5, p2

    invoke-direct {v7, v0, v5, v11}, Lvd2/c$f;-><init>(Lvd2/c;Ljava/lang/String;Lq83/d;)V

    move-object/from16 v12, p1

    iput-object v12, v8, Lvd2/c$e;->w:Ljava/lang/Object;

    iput-object v11, v8, Lvd2/c$e;->x:Ljava/lang/Object;

    iput v4, v8, Lvd2/c$e;->E:I

    const/4 v5, 0x0

    const-string v6, "Failed to fetch arrhythmia history"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v3, v12

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v2, v1, Lu02/a$b;

    if-eqz v2, :cond_4

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_7

    invoke-virtual {v3}, Lvd2/b;->d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v12

    if-eqz v12, :cond_6

    invoke-virtual {v3}, Lvd2/b;->d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v4

    invoke-virtual {v3}, Lvd2/b;->d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->getShepherdPaginatedHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->getRecords()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    invoke-virtual {v6}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->getRecords()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->getNextToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v5, v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->copy(Ljava/util/List;Ljava/lang/String;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    move-result-object v11

    :cond_5
    move-object v8, v11

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->copy$default(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v19

    const/16 v22, 0x1bf

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v12 .. v23}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->copy$default(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object v11

    :cond_6
    move-object v5, v11

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object v1

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final j(Lvd2/b;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd2/b;",
            "Lq83/d<",
            "-",
            "Lvd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvd2/c$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvd2/c$g;

    iget v1, v0, Lvd2/c$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvd2/c$g;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lvd2/c$g;

    invoke-direct {v0, p0, p2}, Lvd2/c$g;-><init>(Lvd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lvd2/c$g;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lvd2/c$g;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    iget-object p1, v6, Lvd2/c$g;->w:Ljava/lang/Object;

    check-cast p1, Lvd2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lvd2/c;->d:Ltr2/n;

    new-instance v5, Lvd2/c$h;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lvd2/c$h;-><init>(Lvd2/c;Lq83/d;)V

    iput-object p1, v6, Lvd2/c$g;->w:Ljava/lang/Object;

    iput p2, v6, Lvd2/c$g;->z:I

    const-string v4, "Failed to fetch arrhythmia settings BFF"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    return-object v0

    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_4

    sget-object v2, Lvd2/d$e;->a:Lvd2/d$e;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_5

    sget-object v2, Lvd2/d$f;->a:Lvd2/d$f;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final k(Lec3/l;)Lec3/l;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvd2/b;

    sget-object v2, Lvd2/d$g;->a:Lvd2/d$g;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lvd2/b;-><init>(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvd2/c$i;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lvd2/c$i;-><init>(Lvd2/c;Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lvd2/c$j;

    invoke-direct {p1, v2}, Lvd2/c$j;-><init>(Lq83/d;)V

    invoke-static {p1, v3}, Lec3/v;->D(Lc93/m;Lec3/l;)Lch/o;

    move-result-object p1

    return-object p1
.end method
