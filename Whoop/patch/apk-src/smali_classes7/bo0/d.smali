.class public final Lbo0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lbo0/d;",
        "",
        "Leo0/h;",
        "screenArgs",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lvn0/e;",
        "passwordValidator",
        "<init>",
        "(Leo0/h;Lcom/whoop/data/repositories/FeatureFlagChecker;Lvn0/e;)V",
        "Lwn0/c;",
        "error",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "(Lwn0/c;)Lcom/whoop/design/util/TextResource;",
        "Lwn0/e;",
        "b",
        "(Lwn0/e;)Lcom/whoop/design/util/TextResource;",
        "Lxn0/c;",
        "domainResult",
        "Lbo0/c;",
        "c",
        "(Lxn0/c;)Lbo0/c;",
        "Leo0/h;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lvn0/e;",
        "change-password_release"
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
.field private final a:Leo0/h;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lvn0/e;


# direct methods
.method public constructor <init>(Leo0/h;Lcom/whoop/data/repositories/FeatureFlagChecker;Lvn0/e;)V
    .locals 1

    const-string v0, "screenArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordValidator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo0/d;->a:Leo0/h;

    iput-object p2, p0, Lbo0/d;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lbo0/d;->c:Lvn0/e;

    return-void
.end method

.method private final a(Lwn0/c;)Lcom/whoop/design/util/TextResource;
    .locals 3

    instance-of v0, p1, Lwn0/c$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->j:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lwn0/c$c;

    if-eqz v0, :cond_1

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->j:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lwn0/c$b;

    if-eqz v0, :cond_2

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->k:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    if-nez p1, :cond_3

    return-object v2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final b(Lwn0/e;)Lcom/whoop/design/util/TextResource;
    .locals 3

    instance-of v0, p1, Lwn0/e$e;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->z:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lwn0/e$b;

    if-eqz v0, :cond_1

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->x:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lwn0/e$c;

    if-eqz v0, :cond_2

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->j:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Lwn0/e$d;

    if-eqz v0, :cond_3

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->j:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    instance-of v0, p1, Lwn0/e$a;

    if-eqz v0, :cond_4

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->k:I

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_4
    if-nez p1, :cond_5

    return-object v2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final c(Lxn0/c;)Lbo0/c;
    .locals 13

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxn0/c;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbo0/d;->c:Lvn0/e;

    invoke-virtual {p1}, Lxn0/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lxn0/c;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lvn0/e;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :goto_1
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_4

    move-object v0, v3

    check-cast v0, Ljava/lang/Iterable;

    instance-of v4, v0, Ljava/util/Collection;

    if-eqz v4, :cond_1

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn0/g;

    invoke-virtual {v4}, Lwn0/g;->b()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_3
    :goto_2
    move v4, v2

    goto :goto_4

    :cond_4
    :goto_3
    move v4, v1

    :goto_4
    invoke-virtual {p1}, Lxn0/c;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lxn0/c;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    move v5, v2

    goto :goto_5

    :cond_5
    move v5, v1

    :goto_5
    invoke-virtual {p1}, Lxn0/c;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lxn0/c;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    move v6, v2

    goto :goto_6

    :cond_6
    move v6, v1

    :goto_6
    iget-object v0, p0, Lbo0/d;->a:Leo0/h;

    invoke-virtual {v0}, Leo0/h;->c()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Lxn0/c;->i()Lwn0/e;

    move-result-object v0

    instance-of v0, v0, Lwn0/e$e;

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    move v10, v1

    goto :goto_8

    :cond_8
    :goto_7
    move v10, v2

    :goto_8
    new-instance v1, Lbo0/c;

    invoke-virtual {p1}, Lxn0/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lxn0/c;->f()Lwn0/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lbo0/d;->a(Lwn0/c;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p1}, Lxn0/c;->i()Lwn0/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lbo0/d;->b(Lwn0/e;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p1}, Lxn0/c;->k()Z

    move-result v9

    invoke-virtual {p1}, Lxn0/c;->d()Z

    move-result v11

    invoke-virtual {p1}, Lxn0/c;->h()Z

    move-result v12

    invoke-direct/range {v1 .. v12}, Lbo0/c;-><init>(Ljava/lang/String;Ljava/util/List;ZZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZZ)V

    return-object v1
.end method
