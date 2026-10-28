.class public final Lbm1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lbm1/e;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Lcom/google/gson/Gson;",
        "gson",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(La6/g;Lcom/google/gson/Gson;Ltr2/n;)V",
        "Lcom/whoop/home/domain/models/StreakMetadata;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "metadata",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)Ljava/lang/Object;",
        "a",
        "La6/g;",
        "Lcom/google/gson/Gson;",
        "Ltr2/n;",
        "home_release"
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
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/gson/Gson;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(La6/g;Lcom/google/gson/Gson;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lcom/google/gson/Gson;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gson"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbm1/e;->a:La6/g;

    .line 3
    iput-object p2, p0, Lbm1/e;->b:Lcom/google/gson/Gson;

    .line 4
    iput-object p3, p0, Lbm1/e;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Lcom/google/gson/Gson;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Lcom/google/gson/GsonBuilder;

    invoke-direct {p2}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 p5, 0x3

    const/4 v0, 0x0

    invoke-static {p2, v0, v0, p5, v0}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p2

    const-string p5, "create(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "StreaksHomePreviousStreakDataStoreHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lbm1/e;-><init>(La6/g;Lcom/google/gson/Gson;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lbm1/e;)Lcom/google/gson/Gson;
    .locals 0

    iget-object p0, p0, Lbm1/e;->b:Lcom/google/gson/Gson;

    return-object p0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/domain/models/StreakMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lbm1/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbm1/e$a;

    iget v1, v0, Lbm1/e$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbm1/e$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbm1/e$a;

    invoke-direct {v0, p0, p1}, Lbm1/e$a;-><init>(Lbm1/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lbm1/e$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbm1/e$a;->y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lbm1/e;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Lbm1/e$a;->y:I

    invoke-static {p1, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    if-eqz p1, :cond_4

    sget-object v1, Lts0/b;->a:Lts0/b;

    invoke-virtual {v1}, Lts0/b;->a()Lf6/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object p1, v4

    :goto_2
    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lbm1/e;->b:Lcom/google/gson/Gson;

    const-class v2, Lbm1/a;

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbm1/a;

    new-instance v5, Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {p1}, Lbm1/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lbm1/a;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lbm1/a;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lbm1/a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lbm1/a;->d()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual {p1}, Lbm1/a;->a()Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {v5 .. v11}, Lcom/whoop/home/domain/models/StreakMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v5

    :cond_6
    :goto_3
    return-object v4

    :catch_0
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V

    return-object v4
.end method

.method public final c(Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/domain/models/StreakMetadata;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lbm1/e$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbm1/e$b;

    iget v1, v0, Lbm1/e$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbm1/e$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbm1/e$b;

    invoke-direct {v0, p0, p2}, Lbm1/e$b;-><init>(Lbm1/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lbm1/e$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbm1/e$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lbm1/e$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/home/domain/models/StreakMetadata;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lbm1/e;->a:La6/g;

    new-instance v2, Lbm1/e$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lbm1/e$c;-><init>(Lbm1/e;Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)V

    iput-object v4, v0, Lbm1/e$b;->w:Ljava/lang/Object;

    iput v3, v0, Lbm1/e$b;->z:I

    invoke-static {p2, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lbm1/e;->c:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to update previous streak data in DataStore"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
