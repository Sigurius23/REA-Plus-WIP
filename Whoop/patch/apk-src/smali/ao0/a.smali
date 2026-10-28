.class public final Lao0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lao0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010!R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lao0/a;",
        "",
        "Lvn0/e;",
        "passwordValidator",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lvn0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lvn0/a;",
        "backendPasswordValidationFailureReason",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "(Lvn0/a;)Lcom/whoop/design/util/TextResource;",
        "Lvn0/f;",
        "confirmPasswordErrorReason",
        "b",
        "(Lvn0/f;)Lcom/whoop/design/util/TextResource;",
        "Lwn0/c;",
        "error",
        "c",
        "(Lwn0/c;)Lcom/whoop/design/util/TextResource;",
        "Lvn0/c;",
        "domainResult",
        "Lzn0/c;",
        "d",
        "(Lvn0/c;)Lzn0/c;",
        "Lvn0/e;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "",
        "Lcom/whoop/design/util/TextResource$d$b;",
        "Ljava/util/List;",
        "lengthArg",
        "Lcom/whoop/design/util/TextResource$b;",
        "Lcom/whoop/design/util/TextResource$b;",
        "tooShortTextResource",
        "e",
        "tooShortBackendTextResource",
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
.field private final a:Lvn0/e;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource$d$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/whoop/design/util/TextResource$b;

.field private final e:Lcom/whoop/design/util/TextResource$b;


# direct methods
.method public constructor <init>(Lvn0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "passwordValidator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao0/a;->a:Lvn0/e;

    iput-object p2, p0, Lao0/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Lcom/whoop/design/util/TextResource$d$b;

    const/16 p2, 0xc

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lao0/a;->c:Ljava/util/List;

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->B:I

    invoke-direct {p2, v0, p1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;)V

    iput-object p2, p0, Lao0/a;->d:Lcom/whoop/design/util/TextResource$b;

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->n:I

    invoke-direct {p2, v0, p1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;)V

    iput-object p2, p0, Lao0/a;->e:Lcom/whoop/design/util/TextResource$b;

    return-void
.end method

.method private final a(Lvn0/a;)Lcom/whoop/design/util/TextResource;
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lao0/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    const/4 v1, 0x0

    if-eq p1, v0, :cond_5

    const/4 v0, 0x1

    const/4 v2, 0x2

    if-eq p1, v0, :cond_4

    if-eq p1, v2, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lao0/a;->e:Lcom/whoop/design/util/TextResource$b;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->o:I

    invoke-direct {p1, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->m:I

    invoke-direct {p1, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->t:I

    invoke-direct {p1, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    return-object v1
.end method

.method private final b(Lvn0/f;)Lcom/whoop/design/util/TextResource;
    .locals 3

    sget-object v0, Lao0/a$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    return-object v1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lsn0/b;->s:I

    invoke-direct {p1, v2, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    iget-object p1, p0, Lao0/a;->d:Lcom/whoop/design/util/TextResource$b;

    return-object p1
.end method

.method private final c(Lwn0/c;)Lcom/whoop/design/util/TextResource;
    .locals 3

    instance-of v0, p1, Lwn0/c$b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->k:I

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
    instance-of v0, p1, Lwn0/c$a;

    if-eqz v0, :cond_2

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->j:I

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


# virtual methods
.method public final d(Lvn0/c;)Lzn0/c;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "domainResult"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lvn0/c;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ll83/k;

    new-instance v3, Lqz0/c$a;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->f0()I

    move-result v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lq3/f0;->w:Lg40/h2;

    invoke-direct {v1, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ll83/k;

    new-instance v3, Lqz0/c$a;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->Z()I

    move-result v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lq3/s;

    invoke-direct {v4}, Lq3/s;-><init>()V

    invoke-direct {v1, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iget-object v3, v1, Ll83/k;->w:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Lqz0/c$a;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lq3/g0;

    new-instance v1, Lwn0/g;

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lsn0/b;->C:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v3, v4, v6, v5, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lvn0/c;->g()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lvn0/c;->e()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lvn0/c;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lvn0/c;->e()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v6

    goto :goto_2

    :cond_3
    :goto_1
    move v4, v5

    :goto_2
    const-string v7, "passwords_must_match"

    invoke-direct {v1, v7, v3, v4}, Lwn0/g;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    invoke-virtual {v2}, Lvn0/c;->i()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v0, Lao0/a;->a:Lvn0/e;

    invoke-virtual {v2}, Lvn0/c;->g()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    const-string v4, ""

    :cond_4
    invoke-virtual {v2}, Lvn0/c;->i()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v3, v4, v7}, Lvn0/e;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v1, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    :goto_3
    move-object/from16 v17, v1

    goto :goto_4

    :cond_5
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    :goto_5
    move/from16 v18, v6

    goto :goto_6

    :cond_7
    move-object/from16 v1, v17

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_8

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwn0/g;

    invoke-virtual {v3}, Lwn0/g;->b()Z

    move-result v3

    if-nez v3, :cond_9

    move/from16 v18, v5

    :goto_6
    new-instance v4, Lzn0/c;

    invoke-virtual {v2}, Lvn0/c;->k()Z

    move-result v5

    invoke-virtual {v2}, Lvn0/c;->l()Z

    move-result v6

    invoke-virtual {v2}, Lvn0/c;->m()Z

    move-result v7

    invoke-virtual {v2}, Lvn0/c;->h()Z

    move-result v8

    invoke-virtual {v2}, Lvn0/c;->f()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lvn0/c;->g()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lvn0/c;->e()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lvn0/c;->d()Lvn0/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lao0/a;->b(Lvn0/f;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v2}, Lvn0/c;->c()Lvn0/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lao0/a;->a(Lvn0/a;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v2}, Lvn0/c;->j()Lwn0/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lao0/a;->c(Lwn0/c;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-direct/range {v4 .. v19}, Lzn0/c;-><init>(ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcom/whoop/design/util/TextResource;)V

    return-object v4
.end method
