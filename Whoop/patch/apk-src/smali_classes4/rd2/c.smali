.class public final Lrd2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J!\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lrd2/c;",
        "",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lxm0/b;",
        "cacheUpdater",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;Lxm0/b;Lfi0/a;)V",
        "Lrd2/b;",
        "domainState",
        "",
        "historyDate",
        "f",
        "(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "e",
        "Lec3/l;",
        "Lrd2/a;",
        "upstream",
        "g",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lxm0/b;",
        "d",
        "Lfi0/a;",
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

.field private final b:Ltr2/n;

.field private final c:Lxm0/b;

.field private final d:Lfi0/a;


# direct methods
.method public constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;Lxm0/b;Lfi0/a;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheUpdater"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    iput-object p2, p0, Lrd2/c;->b:Ltr2/n;

    iput-object p3, p0, Lrd2/c;->c:Lxm0/b;

    iput-object p4, p0, Lrd2/c;->d:Lfi0/a;

    return-void
.end method

.method public static final synthetic a(Lrd2/c;Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrd2/c;->e(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lrd2/c;Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrd2/c;->f(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lrd2/c;)Lfi0/a;
    .locals 0

    iget-object p0, p0, Lrd2/c;->d:Lfi0/a;

    return-object p0
.end method

.method public static final synthetic d(Lrd2/c;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lrd2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method private final e(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lrd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lrd2/c$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lrd2/c$a;

    iget v4, v3, Lrd2/c$a;->I:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lrd2/c$a;->I:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lrd2/c$a;

    invoke-direct {v3, v0, v2}, Lrd2/c$a;-><init>(Lrd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lrd2/c$a;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lrd2/c$a;->I:I

    const/4 v12, 0x0

    const/4 v5, 0x1

    const/4 v13, 0x2

    const/4 v14, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v13, :cond_1

    iget-object v1, v9, Lrd2/c$a;->z:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v9, Lrd2/c$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v9, Lrd2/c$a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v9, Lrd2/c$a;->w:Ljava/lang/Object;

    check-cast v3, Lrd2/b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v9, Lrd2/c$a;->E:I

    iget-object v4, v9, Lrd2/c$a;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v9, Lrd2/c$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v9, Lrd2/c$a;->w:Ljava/lang/Object;

    check-cast v5, Lrd2/b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v4

    move v4, v1

    move-object v1, v15

    move-object v15, v5

    move-object v5, v2

    move-object v2, v15

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrd2/c;->b:Ltr2/n;

    invoke-static {v1, v2}, Lrd2/d;->a(Ljava/lang/String;Ltr2/n;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lrd2/c;->b:Ltr2/n;

    const-string v7, "Failed to delete arrhythmia history by date: "

    invoke-static {v7, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lrd2/c$b;

    invoke-direct {v8, v0, v2, v14}, Lrd2/c$b;-><init>(Lrd2/c;Ljava/lang/String;Lq83/d;)V

    move-object/from16 v2, p1

    iput-object v2, v9, Lrd2/c$a;->w:Ljava/lang/Object;

    iput-object v1, v9, Lrd2/c$a;->x:Ljava/lang/Object;

    iput-object v14, v9, Lrd2/c$a;->y:Ljava/lang/Object;

    iput v12, v9, Lrd2/c$a;->E:I

    iput v5, v9, Lrd2/c$a;->I:I

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v5, v4

    move v4, v12

    :goto_2
    check-cast v5, Lu02/a;

    instance-of v6, v5, Lu02/a$b;

    if-eqz v6, :cond_5

    new-instance v3, Lrd2/e$b;

    invoke-direct {v3, v1}, Lrd2/e$b;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3, v14, v13, v14}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object v3

    goto :goto_5

    :cond_5
    instance-of v5, v5, Lu02/a$c;

    if-eqz v5, :cond_8

    iget-object v5, v0, Lrd2/c;->c:Lxm0/b;

    iput-object v2, v9, Lrd2/c$a;->w:Ljava/lang/Object;

    iput-object v1, v9, Lrd2/c$a;->x:Ljava/lang/Object;

    iput-object v14, v9, Lrd2/c$a;->y:Ljava/lang/Object;

    iput-object v14, v9, Lrd2/c$a;->z:Ljava/lang/Object;

    iput v4, v9, Lrd2/c$a;->E:I

    iput v12, v9, Lrd2/c$a;->F:I

    iput v13, v9, Lrd2/c$a;->I:I

    const-string v4, "shepherdrefreshscope"

    invoke-virtual {v5, v4, v9}, Lxm0/b;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    :goto_3
    return-object v3

    :cond_6
    move-object v3, v2

    :goto_4
    sget-object v2, Lrd2/e$g;->a:Lrd2/e$g;

    invoke-virtual {v3, v2, v14}, Lrd2/b;->a(Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;)Lrd2/b;

    move-result-object v2

    move-object v15, v3

    move-object v3, v2

    move-object v2, v15

    :goto_5
    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    return-object v3

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    move-object/from16 v2, p1

    :goto_6
    new-instance v3, Lrd2/e$b;

    invoke-direct {v3, v1}, Lrd2/e$b;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3, v14, v13, v14}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object v1

    return-object v1
.end method

.method private final f(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lrd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lrd2/c$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lrd2/c$c;

    iget v1, v0, Lrd2/c$c;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrd2/c$c;->I:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrd2/c$c;

    invoke-direct {v0, p0, p3}, Lrd2/c$c;-><init>(Lrd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lrd2/c$c;->G:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrd2/c$c;->I:I

    const/4 v2, 0x1

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lrd2/c$c;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lrd2/c$c;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lrd2/c$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lrd2/c$c;->w:Ljava/lang/Object;

    check-cast p1, Lrd2/b;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_9

    iget-object p3, p0, Lrd2/c;->b:Ltr2/n;

    invoke-static {p2, p3}, Lrd2/d;->a(Ljava/lang/String;Ltr2/n;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lrd2/c;->b:Ltr2/n;

    new-instance v5, Lrd2/c$d;

    invoke-direct {v5, p0, p2, v10}, Lrd2/c$d;-><init>(Lrd2/c;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v6, Lrd2/c$c;->w:Ljava/lang/Object;

    iput-object v10, v6, Lrd2/c$c;->x:Ljava/lang/Object;

    iput-object v10, v6, Lrd2/c$c;->y:Ljava/lang/Object;

    iput-object v10, v6, Lrd2/c$c;->z:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, v6, Lrd2/c$c;->E:I

    iput p2, v6, Lrd2/c$c;->F:I

    iput p3, v6, Lrd2/c$c;->I:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch history detail data."

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p2, p3, Lu02/a$c;

    if-eqz p2, :cond_4

    sget-object p2, Lrd2/e$d;->a:Lrd2/e$d;

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    invoke-virtual {p1, p2, p3}, Lrd2/b;->a(Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;)Lrd2/b;

    move-result-object p2

    goto :goto_3

    :cond_4
    instance-of p2, p3, Lu02/a$b;

    if-eqz p2, :cond_5

    sget-object p2, Lrd2/e$c;->a:Lrd2/e$c;

    invoke-static {p1, p2, v10, v9, v10}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object p2

    :goto_3
    if-nez p2, :cond_7

    goto :goto_4

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_4
    sget-object p2, Lrd2/e$c;->a:Lrd2/e$c;

    invoke-static {p1, p2, v10, v9, v10}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object p2

    :cond_7
    if-nez p2, :cond_8

    goto :goto_5

    :cond_8
    return-object p2

    :cond_9
    :goto_5
    sget-object p2, Lrd2/e$c;->a:Lrd2/e$c;

    invoke-static {p1, p2, v10, v9, v10}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final g(Lec3/l;)Lec3/l;
    .locals 4
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

    new-instance v0, Lrd2/b;

    sget-object v1, Lrd2/e$e;->a:Lrd2/e$e;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lrd2/b;-><init>(Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lrd2/c$e;

    invoke-direct {v1, p0, v3}, Lrd2/c$e;-><init>(Lrd2/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
