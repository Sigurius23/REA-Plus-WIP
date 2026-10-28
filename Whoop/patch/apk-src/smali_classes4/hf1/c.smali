.class public final Lhf1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhf1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0097@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0018H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J0\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lhf1/c;",
        "Lhf1/b;",
        "Lcom/whoop/experiments/api/ExperimentsApi;",
        "experimentsApi",
        "Lcom/whoop/experiments/api/ExperimentsAuthApi;",
        "experimentsAuthApi",
        "Ljf1/a;",
        "experimentsDataStoreHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/experiments/api/ExperimentsApi;Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljf1/a;Ltr2/n;)V",
        "Lhf1/a;",
        "experiment",
        "",
        "isAuthenticated",
        "",
        "e",
        "(Lhf1/a;ZLq83/d;)Ljava/lang/Object;",
        "f",
        "(Lhf1/a;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "c",
        "",
        "cacheTtlSeconds",
        "shouldBucketUser",
        "a",
        "(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/experiments/api/ExperimentsApi;",
        "Lcom/whoop/experiments/api/ExperimentsAuthApi;",
        "Ljf1/a;",
        "d",
        "Ltr2/n;",
        "experiments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lhf1/c$a;


# instance fields
.field private final a:Lcom/whoop/experiments/api/ExperimentsApi;

.field private final b:Lcom/whoop/experiments/api/ExperimentsAuthApi;

.field private final c:Ljf1/a;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhf1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhf1/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhf1/c;->e:Lhf1/c$a;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/experiments/api/ExperimentsApi;Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljf1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "experimentsApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentsAuthApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentsDataStoreHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhf1/c;->a:Lcom/whoop/experiments/api/ExperimentsApi;

    .line 3
    iput-object p2, p0, Lhf1/c;->b:Lcom/whoop/experiments/api/ExperimentsAuthApi;

    .line 4
    iput-object p3, p0, Lhf1/c;->c:Ljf1/a;

    .line 5
    iput-object p4, p0, Lhf1/c;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/experiments/api/ExperimentsApi;Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljf1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ExperimentsRepository"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lhf1/c;-><init>(Lcom/whoop/experiments/api/ExperimentsApi;Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljf1/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic g(Lhf1/c;)Lcom/whoop/experiments/api/ExperimentsApi;
    .locals 0

    iget-object p0, p0, Lhf1/c;->a:Lcom/whoop/experiments/api/ExperimentsApi;

    return-object p0
.end method

.method public static final synthetic h(Lhf1/c;)Lcom/whoop/experiments/api/ExperimentsAuthApi;
    .locals 0

    iget-object p0, p0, Lhf1/c;->b:Lcom/whoop/experiments/api/ExperimentsAuthApi;

    return-object p0
.end method


# virtual methods
.method public a(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhf1/a;",
            "JZZ",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-wide/from16 v0, p2

    move-object/from16 v2, p6

    instance-of v3, v2, Lhf1/c$c;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lhf1/c$c;

    iget v4, v3, Lhf1/c$c;->I:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lhf1/c$c;->I:I

    goto :goto_0

    :cond_0
    new-instance v3, Lhf1/c$c;

    invoke-direct {v3, p0, v2}, Lhf1/c$c;-><init>(Lhf1/c;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lhf1/c$c;->G:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lhf1/c$c;->I:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lhf1/c$c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v3, Lhf1/c$c;->x:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v3, Lhf1/c$c;->w:Ljava/lang/Object;

    check-cast v1, Lhf1/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v3, Lhf1/c$c;->F:Z

    iget-boolean v1, v3, Lhf1/c$c;->E:Z

    iget-wide v7, v3, Lhf1/c$c;->z:J

    iget-object v5, v3, Lhf1/c$c;->w:Ljava/lang/Object;

    check-cast v5, Lhf1/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-boolean v0, v3, Lhf1/c$c;->F:Z

    iget-boolean v1, v3, Lhf1/c$c;->E:Z

    iget-wide v8, v3, Lhf1/c$c;->z:J

    iget-object v5, v3, Lhf1/c$c;->w:Ljava/lang/Object;

    check-cast v5, Lhf1/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v11, v0

    move v10, v1

    move-wide v0, v8

    move-object v9, v5

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lhf1/c;->c:Ljf1/a;

    invoke-interface {p1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v5

    move-object v9, p1

    iput-object v9, v3, Lhf1/c$c;->w:Ljava/lang/Object;

    iput-wide v0, v3, Lhf1/c$c;->z:J

    move/from16 v10, p4

    iput-boolean v10, v3, Lhf1/c$c;->E:Z

    move/from16 v11, p5

    iput-boolean v11, v3, Lhf1/c$c;->F:Z

    iput v8, v3, Lhf1/c$c;->I:I

    invoke-virtual {v2, v5, v0, v1, v3}, Ljf1/a;->e(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_6

    return-object v2

    :cond_6
    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v5, p0, Lhf1/c;->d:Ltr2/n;

    invoke-interface {v9}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v12, "failed to fetch variant for experiment "

    invoke-static {v12, v8}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v12, Lhf1/c$d;

    const/4 v13, 0x0

    move-object/from16 p3, p0

    move-object/from16 p4, v9

    move/from16 p2, v10

    move/from16 p5, v11

    move-object p1, v12

    move-object/from16 p6, v13

    invoke-direct/range {p1 .. p6}, Lhf1/c$d;-><init>(ZLhf1/c;Lhf1/a;ZLq83/d;)V

    iput-object v9, v3, Lhf1/c$c;->w:Ljava/lang/Object;

    iput-wide v0, v3, Lhf1/c$c;->z:J

    iput-boolean v10, v3, Lhf1/c$c;->E:Z

    iput-boolean v11, v3, Lhf1/c$c;->F:Z

    iput v7, v3, Lhf1/c$c;->I:I

    const/4 v7, 0x0

    move-object p1, v2

    move-object/from16 p6, v3

    move-object/from16 p2, v5

    move-object/from16 p3, v7

    move-object/from16 p4, v8

    move-object/from16 p5, v12

    invoke-virtual/range {p1 .. p6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    goto :goto_3

    :cond_7
    move-wide v7, v0

    move-object v5, v9

    move v1, v10

    move v0, v11

    :goto_2
    check-cast v2, Lu02/a;

    instance-of v9, v2, Lu02/a$c;

    const-string v10, "error"

    if-eqz v9, :cond_a

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpg3/v0;

    iget-object v2, v2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_8

    goto :goto_4

    :cond_8
    iget-object v9, p0, Lhf1/c;->c:Ljf1/a;

    invoke-interface {v5}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    iput-object v10, v3, Lhf1/c$c;->w:Ljava/lang/Object;

    iput-object v10, v3, Lhf1/c$c;->x:Ljava/lang/Object;

    iput-object v2, v3, Lhf1/c$c;->y:Ljava/lang/Object;

    iput-wide v7, v3, Lhf1/c$c;->z:J

    iput-boolean v1, v3, Lhf1/c$c;->E:Z

    iput-boolean v0, v3, Lhf1/c$c;->F:Z

    iput v6, v3, Lhf1/c$c;->I:I

    invoke-virtual {v9, v5, v2, v3}, Ljf1/a;->h(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_9

    :goto_3
    return-object v4

    :cond_9
    return-object v2

    :cond_a
    :goto_4
    return-object v10
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lhf1/c;->c:Ljf1/a;

    invoke-virtual {v0, p1}, Ljf1/a;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lhf1/c;->c:Ljf1/a;

    invoke-virtual {v0, p1}, Ljf1/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lhf1/a;ZLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhf1/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    instance-of v0, p3, Lhf1/c$e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lhf1/c$e;

    iget v1, v0, Lhf1/c$e;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhf1/c$e;->G:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lhf1/c$e;

    invoke-direct {v0, p0, p3}, Lhf1/c$e;-><init>(Lhf1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lhf1/c$e;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lhf1/c$e;->G:I

    const/4 v7, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v6, Lhf1/c$e;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v6, Lhf1/c$e;->x:Ljava/lang/Object;

    check-cast p2, Lu02/a;

    iget-object p2, v6, Lhf1/c$e;->w:Ljava/lang/Object;

    check-cast p2, Lhf1/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v6, Lhf1/c$e;->z:Z

    iget-object p2, v6, Lhf1/c$e;->w:Ljava/lang/Object;

    check-cast p2, Lhf1/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-boolean p2, v6, Lhf1/c$e;->z:Z

    iget-object p1, v6, Lhf1/c$e;->w:Ljava/lang/Object;

    check-cast p1, Lhf1/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lhf1/c;->c:Ljf1/a;

    invoke-interface {p1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object p1, v6, Lhf1/c$e;->w:Ljava/lang/Object;

    iput-boolean p2, v6, Lhf1/c$e;->z:Z

    iput v3, v6, Lhf1/c$e;->G:I

    invoke-virtual {p3, v1, v6}, Ljf1/a;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_6

    return-object p3

    :cond_6
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lhf1/c;->d:Ltr2/n;

    invoke-interface {p1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "failed to fetch variant for experiment "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lhf1/c$f;

    invoke-direct {v5, p2, p0, p1, v8}, Lhf1/c$f;-><init>(ZLhf1/c;Lhf1/a;Lq83/d;)V

    iput-object p1, v6, Lhf1/c$e;->w:Ljava/lang/Object;

    iput-boolean p2, v6, Lhf1/c$e;->z:Z

    iput p3, v6, Lhf1/c$e;->G:I

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_7

    goto :goto_4

    :cond_7
    move v9, p2

    move-object p2, p1

    move p1, v9

    :goto_3
    check-cast p3, Lu02/a;

    instance-of v1, p3, Lu02/a$c;

    if-eqz v1, :cond_b

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lpg3/v0;

    iget-object p3, p3, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_a

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    iget-object v1, p0, Lhf1/c;->c:Ljf1/a;

    invoke-interface {p2}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object p2

    iput-object v8, v6, Lhf1/c$e;->w:Ljava/lang/Object;

    iput-object v8, v6, Lhf1/c$e;->x:Ljava/lang/Object;

    iput-object p3, v6, Lhf1/c$e;->y:Ljava/lang/Object;

    iput-boolean p1, v6, Lhf1/c$e;->z:Z

    iput v7, v6, Lhf1/c$e;->G:I

    invoke-virtual {v1, p2, p3, v6}, Ljf1/a;->g(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    :goto_4
    return-object v0

    :cond_9
    return-object p3

    :cond_a
    :goto_5
    invoke-interface {p2}, Lhf1/a;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-interface {p2}, Lhf1/a;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Lhf1/a;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhf1/a;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lhf1/c$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhf1/c$b;

    iget v1, v0, Lhf1/c$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhf1/c$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhf1/c$b;

    invoke-direct {v0, p0, p2}, Lhf1/c$b;-><init>(Lhf1/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lhf1/c$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhf1/c$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lhf1/c$b;->w:Ljava/lang/Object;

    check-cast p1, Lhf1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lhf1/c;->c:Ljf1/a;

    invoke-interface {p1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object p1, v0, Lhf1/c$b;->w:Ljava/lang/Object;

    iput v3, v0, Lhf1/c$b;->z:I

    invoke-virtual {p2, v2, v0}, Ljf1/a;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_4

    invoke-interface {p1}, Lhf1/a;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    return-object p2
.end method
