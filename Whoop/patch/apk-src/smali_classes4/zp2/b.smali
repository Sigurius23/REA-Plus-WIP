.class public final Lzp2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lzp2/b;",
        "",
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "userJourneyApi",
        "Lhq2/a;",
        "dataStoreHandler",
        "Lmr2/a;",
        "syncScheduler",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Lhq2/a;Lmr2/a;Ltr2/n;)V",
        "",
        "year",
        "",
        "text",
        "",
        "b",
        "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "Lhq2/a;",
        "Lmr2/a;",
        "d",
        "Ltr2/n;",
        "user-journey_release"
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
.field private final a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

.field private final b:Lhq2/a;

.field private final c:Lmr2/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Lhq2/a;Lmr2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "userJourneyApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStoreHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncScheduler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp2/b;->a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    iput-object p2, p0, Lzp2/b;->b:Lhq2/a;

    iput-object p3, p0, Lzp2/b;->c:Lmr2/a;

    iput-object p4, p0, Lzp2/b;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lzp2/b;)Lcom/whoop/user/journey/sources/data/UserJourneyApi;
    .locals 0

    iget-object p0, p0, Lzp2/b;->a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    return-object p0
.end method


# virtual methods
.method public final b(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    instance-of v4, v0, Lzp2/b$a;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lzp2/b$a;

    iget v5, v4, Lzp2/b$a;->G:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lzp2/b$a;->G:I

    :goto_0
    move-object v10, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lzp2/b$a;

    invoke-direct {v4, v1, v0}, Lzp2/b$a;-><init>(Lzp2/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Lzp2/b$a;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v10, Lzp2/b$a;->G:I

    const/4 v13, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v7, :cond_3

    if-eq v5, v6, :cond_2

    if-ne v5, v13, :cond_1

    iget-object v2, v10, Lzp2/b$a;->z:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, v10, Lzp2/b$a;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v2, v10, Lzp2/b$a;->x:I

    iget v3, v10, Lzp2/b$a;->w:I

    iget-object v5, v10, Lzp2/b$a;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget v2, v10, Lzp2/b$a;->x:I

    iget v3, v10, Lzp2/b$a;->w:I

    iget-object v5, v10, Lzp2/b$a;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v2, v3

    move-object v3, v5

    goto :goto_2

    :catch_1
    move-exception v0

    move v7, v2

    move v2, v3

    move-object v3, v5

    goto :goto_4

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v1, Lzp2/b;->b:Lhq2/a;

    iput-object v3, v10, Lzp2/b$a;->y:Ljava/lang/Object;

    iput v2, v10, Lzp2/b$a;->w:I

    iput v15, v10, Lzp2/b$a;->x:I

    iput v7, v10, Lzp2/b$a;->G:I

    invoke-virtual {v0, v2, v3, v10}, Lhq2/a;->f(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-ne v0, v4, :cond_5

    goto :goto_7

    :cond_5
    :goto_2
    :try_start_3
    iget-object v0, v1, Lzp2/b;->d:Ltr2/n;

    const-string v5, "Saved time capsule to local storage as backup"

    new-array v8, v15, [Lqr2/a$a;

    invoke-interface {v0, v5, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :goto_3
    move-object v0, v3

    move v3, v2

    move v2, v7

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    move v7, v15

    :goto_4
    iget-object v5, v1, Lzp2/b;->d:Ltr2/n;

    const-string v8, "Failed to save time capsule locally"

    new-array v9, v15, [Lqr2/a$a;

    invoke-interface {v5, v8, v0, v9}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_5
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object v7, v1, Lzp2/b;->d:Ltr2/n;

    new-instance v9, Lzp2/b$b;

    invoke-direct {v9, v1, v3, v0, v14}, Lzp2/b$b;-><init>(Lzp2/b;ILjava/lang/String;Lq83/d;)V

    iput-object v14, v10, Lzp2/b$a;->y:Ljava/lang/Object;

    iput v3, v10, Lzp2/b$a;->w:I

    iput v2, v10, Lzp2/b$a;->x:I

    iput v6, v10, Lzp2/b$a;->G:I

    move-object v6, v7

    const/4 v7, 0x0

    const-string v8, "Failed to save time capsule for YIR 2025"

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_6

    goto :goto_7

    :cond_6
    :goto_6
    check-cast v0, Lu02/a;

    instance-of v5, v0, Lu02/a$c;

    if-eqz v5, :cond_9

    if-eqz v2, :cond_8

    :try_start_4
    iget-object v0, v1, Lzp2/b;->b:Lhq2/a;

    iput-object v14, v10, Lzp2/b$a;->y:Ljava/lang/Object;

    iput-object v14, v10, Lzp2/b$a;->z:Ljava/lang/Object;

    iput v3, v10, Lzp2/b$a;->w:I

    iput v2, v10, Lzp2/b$a;->x:I

    iput v13, v10, Lzp2/b$a;->G:I

    invoke-virtual {v0, v10}, Lhq2/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_7

    :goto_7
    return-object v4

    :cond_7
    :goto_8
    iget-object v0, v1, Lzp2/b;->d:Ltr2/n;

    const-string v2, "Successfully saved time capsule immediately for YIR 2025, cleared local backup"

    new-array v3, v15, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_a

    :goto_9
    iget-object v2, v1, Lzp2/b;->d:Ltr2/n;

    const-string v3, "Failed to clear local time capsule after successful API save"

    new-array v4, v15, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_8
    :goto_a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_9
    instance-of v3, v0, Lu02/a$b;

    if-eqz v3, :cond_b

    iget-object v3, v1, Lzp2/b;->d:Ltr2/n;

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    const-string v4, "Failed to save time capsule immediately, will sync later: "

    invoke-static {v4, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v4, v15, [Lqr2/a$a;

    invoke-interface {v3, v0, v4}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v2, :cond_a

    iget-object v0, v1, Lzp2/b;->c:Lmr2/a;

    invoke-virtual {v0}, Lmr2/a;->a()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_a
    iget-object v0, v1, Lzp2/b;->d:Ltr2/n;

    const-string v2, "Failed to save time capsule both locally and via API"

    new-array v3, v15, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Failed to sync time capsule for year YIR 2025: "

    instance-of v1, p1, Lzp2/b$c;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lzp2/b$c;

    iget v2, v1, Lzp2/b$c;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lzp2/b$c;->F:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lzp2/b$c;

    invoke-direct {v1, p0, p1}, Lzp2/b$c;-><init>(Lzp2/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v7, Lzp2/b$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v7, Lzp2/b$c;->F:I

    const/4 v10, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v11, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v10, :cond_1

    iget-object v0, v7, Lzp2/b$c;->y:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v7, Lzp2/b$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v0, v7, Lzp2/b$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v7, Lzp2/b$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    iget-object v2, v7, Lzp2/b$c;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :cond_3
    iget-object v2, v7, Lzp2/b$c;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p1, p0, Lzp2/b;->b:Lhq2/a;

    iput v11, v7, Lzp2/b$c;->F:I

    invoke-virtual {p1, v7}, Lhq2/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    iget-object p1, p0, Lzp2/b;->b:Lhq2/a;

    iput-object v2, v7, Lzp2/b$c;->w:Ljava/lang/Object;

    iput v4, v7, Lzp2/b$c;->F:I

    invoke-virtual {p1, v7}, Lhq2/a;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_7
    :goto_3
    check-cast p1, Ljava/lang/Integer;

    if-eqz v2, :cond_d

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_d

    if-nez p1, :cond_8

    goto :goto_8

    :cond_8
    move-object v4, v2

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    move v5, v3

    iget-object v3, p0, Lzp2/b;->d:Ltr2/n;

    move v6, v5

    const-string v5, "Failed to sync time capsule for YIR 2025"

    move v8, v6

    new-instance v6, Lzp2/b$d;

    invoke-direct {v6, p0, p1, v4, v13}, Lzp2/b$d;-><init>(Lzp2/b;Ljava/lang/Integer;Ljava/lang/String;Lq83/d;)V

    iput-object v13, v7, Lzp2/b$c;->w:Ljava/lang/Object;

    iput-object v13, v7, Lzp2/b$c;->x:Ljava/lang/Object;

    iput v8, v7, Lzp2/b$c;->F:I

    const/4 v4, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_b

    iget-object p1, p0, Lzp2/b;->b:Lhq2/a;

    iput-object v13, v7, Lzp2/b$c;->w:Ljava/lang/Object;

    iput-object v13, v7, Lzp2/b$c;->x:Ljava/lang/Object;

    iput-object v13, v7, Lzp2/b$c;->y:Ljava/lang/Object;

    iput v10, v7, Lzp2/b$c;->F:I

    invoke-virtual {p1, v7}, Lhq2/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_5
    return-object v1

    :cond_a
    :goto_6
    iget-object p1, p0, Lzp2/b;->d:Ltr2/n;

    const-string v0, "Successfully synced time capsule for YIR 2025"

    new-array v1, v12, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_7

    :cond_b
    instance-of v1, p1, Lu02/a$b;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lzp2/b;->d:Ltr2/n;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v12, [Lqr2/a$a;

    invoke-interface {v1, p1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    move v11, v12

    :goto_7
    move v12, v11

    goto :goto_a

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    :goto_8
    iget-object p1, p0, Lzp2/b;->d:Ltr2/n;

    const-string v0, "No time capsule to sync"

    new-array v1, v12, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :goto_9
    iget-object v0, p0, Lzp2/b;->d:Ltr2/n;

    const-string v1, "Exception syncing time capsule"

    new-array v2, v12, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_a
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
