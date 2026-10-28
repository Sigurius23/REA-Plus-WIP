.class public final Lcz1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0013\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00192\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lcz1/d;",
        "",
        "Lcom/whoop/milestonepill/api/MilestonePillApi;",
        "api",
        "Lcz1/e;",
        "previousDataStoreHandler",
        "Lcz1/a;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/milestonepill/api/MilestonePillApi;Lcz1/e;Lcz1/a;Ltr2/n;)V",
        "",
        "path",
        "Lcz1/c;",
        "prevState",
        "d",
        "(Ljava/lang/String;Lcz1/c;Lq83/d;)Ljava/lang/Object;",
        "previousCount",
        "currentCount",
        "",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "g",
        "(Lcz1/c;)Lcz1/c;",
        "Lec3/l;",
        "Lcz1/b;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/milestonepill/api/MilestonePillApi;",
        "b",
        "Lcz1/e;",
        "c",
        "Lcz1/a;",
        "Ltr2/n;",
        "milestone-pill-arch-mini_release"
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
.field private final a:Lcom/whoop/milestonepill/api/MilestonePillApi;

.field private final b:Lcz1/e;

.field private final c:Lcz1/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/milestonepill/api/MilestonePillApi;Lcz1/e;Lcz1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousDataStoreHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcz1/d;->a:Lcom/whoop/milestonepill/api/MilestonePillApi;

    .line 3
    iput-object p2, p0, Lcz1/d;->b:Lcz1/e;

    .line 4
    iput-object p3, p0, Lcz1/d;->c:Lcz1/a;

    .line 5
    iput-object p4, p0, Lcz1/d;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/milestonepill/api/MilestonePillApi;Lcz1/e;Lcz1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "MilestonePillInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcz1/d;-><init>(Lcom/whoop/milestonepill/api/MilestonePillApi;Lcz1/e;Lcz1/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lcz1/d;Ljava/lang/String;Lcz1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcz1/d;->d(Ljava/lang/String;Lcz1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcz1/d;)Lcom/whoop/milestonepill/api/MilestonePillApi;
    .locals 0

    iget-object p0, p0, Lcz1/d;->a:Lcom/whoop/milestonepill/api/MilestonePillApi;

    return-object p0
.end method

.method public static final synthetic c(Lcz1/d;Lcz1/c;)Lcz1/c;
    .locals 0

    invoke-direct {p0, p1}, Lcz1/d;->g(Lcz1/c;)Lcz1/c;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/lang/String;Lcz1/c;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcz1/c;",
            "Lq83/d<",
            "-",
            "Lcz1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcz1/d$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcz1/d$a;

    iget v4, v3, Lcz1/d$a;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcz1/d$a;->H:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcz1/d$a;

    invoke-direct {v3, v0, v2}, Lcz1/d$a;-><init>(Lcz1/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcz1/d$a;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lcz1/d$a;->H:I

    const/4 v12, 0x3

    const/4 v13, 0x2

    const/4 v5, 0x1

    const/4 v14, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v5, :cond_3

    if-eq v4, v13, :cond_2

    if-ne v4, v12, :cond_1

    iget-object v1, v9, Lcz1/d$a;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v9, Lcz1/d$a;->z:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    iget-object v4, v9, Lcz1/d$a;->y:Ljava/lang/Object;

    check-cast v4, Lu02/a;

    iget-object v4, v9, Lcz1/d$a;->x:Ljava/lang/Object;

    check-cast v4, Lcz1/c;

    iget-object v4, v9, Lcz1/d$a;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v3

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v9, Lcz1/d$a;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    iget-object v4, v9, Lcz1/d$a;->y:Ljava/lang/Object;

    check-cast v4, Lu02/a;

    iget-object v4, v9, Lcz1/d$a;->x:Ljava/lang/Object;

    check-cast v4, Lcz1/c;

    iget-object v4, v9, Lcz1/d$a;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object v1, v9, Lcz1/d$a;->x:Ljava/lang/Object;

    check-cast v1, Lcz1/c;

    iget-object v4, v9, Lcz1/d$a;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v1

    move-object v1, v4

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v0, Lcz1/d;->d:Ltr2/n;

    new-instance v8, Lcz1/d$b;

    invoke-direct {v8, v0, v1, v14}, Lcz1/d$b;-><init>(Lcz1/d;Ljava/lang/String;Lq83/d;)V

    iput-object v1, v9, Lcz1/d$a;->w:Ljava/lang/Object;

    move-object/from16 v15, p2

    iput-object v15, v9, Lcz1/d$a;->x:Ljava/lang/Object;

    iput v5, v9, Lcz1/d$a;->H:I

    const/4 v6, 0x0

    const-string v7, "Failed to fetch milestone pill data"

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v5, v2

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto :goto_7

    :cond_5
    :goto_2
    check-cast v2, Lu02/a;

    instance-of v4, v2, Lu02/a$c;

    if-eqz v4, :cond_a

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    invoke-virtual {v15}, Lcz1/c;->c()Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getCount()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    move-object/from16 v16, v4

    move-object v4, v1

    :goto_3
    move-object/from16 v1, v16

    goto :goto_6

    :cond_7
    :goto_4
    iget-object v4, v0, Lcz1/d;->b:Lcz1/e;

    iput-object v1, v9, Lcz1/d$a;->w:Ljava/lang/Object;

    iput-object v14, v9, Lcz1/d$a;->x:Ljava/lang/Object;

    iput-object v14, v9, Lcz1/d$a;->y:Ljava/lang/Object;

    iput-object v2, v9, Lcz1/d$a;->z:Ljava/lang/Object;

    iput v13, v9, Lcz1/d$a;->H:I

    invoke-virtual {v4, v1, v9}, Lcz1/e;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_8

    goto :goto_7

    :cond_8
    move-object/from16 v16, v4

    move-object v4, v1

    move-object v1, v2

    move-object/from16 v2, v16

    :goto_5
    check-cast v2, Ljava/lang/String;

    move-object/from16 v16, v2

    move-object v2, v1

    goto :goto_3

    :goto_6
    iget-object v5, v0, Lcz1/d;->b:Lcz1/e;

    invoke-virtual {v2}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getCount()Ljava/lang/String;

    move-result-object v6

    iput-object v14, v9, Lcz1/d$a;->w:Ljava/lang/Object;

    iput-object v14, v9, Lcz1/d$a;->x:Ljava/lang/Object;

    iput-object v14, v9, Lcz1/d$a;->y:Ljava/lang/Object;

    iput-object v2, v9, Lcz1/d$a;->z:Ljava/lang/Object;

    iput-object v1, v9, Lcz1/d$a;->E:Ljava/lang/Object;

    iput v12, v9, Lcz1/d$a;->H:I

    invoke-virtual {v5, v4, v6, v9}, Lcz1/e;->b(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_9

    :goto_7
    return-object v3

    :cond_9
    move-object v5, v2

    :goto_8
    invoke-virtual {v5}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getCount()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcz1/d;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    iget-object v2, v0, Lcz1/d;->c:Lcz1/a;

    invoke-virtual {v2, v1, v5}, Lcz1/a;->c(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)V

    new-instance v2, Lcz1/c;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcz1/c;-><init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_a
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_b

    new-instance v2, Lcz1/c;

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcz1/c;-><init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    if-eqz p1, :cond_0

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    cmp-long p1, v1, p1

    if-ltz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    return v0
.end method

.method private final g(Lcz1/c;)Lcz1/c;
    .locals 7

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lcz1/c;->b(Lcz1/c;ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;ZILjava/lang/Object;)Lcz1/c;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
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

    new-instance v1, Lcz1/c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcz1/c;-><init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcz1/d$c;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcz1/d$c;-><init>(Lcz1/d;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
