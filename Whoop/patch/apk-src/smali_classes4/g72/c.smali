.class public final Lg72/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg72/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lg72/a;",
        "Lg72/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ#\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00172\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lg72/c;",
        "Lod1/g;",
        "Lg72/a;",
        "Lg72/b;",
        "Lcom/whoop/sage/domain/SageApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/sage/domain/SageApi;Ltr2/n;)V",
        "",
        "skipToManualEntry",
        "j",
        "(ZLq83/d;)Ljava/lang/Object;",
        "Lg72/a$b;",
        "action",
        "previousState",
        "l",
        "(Lg72/a$b;Lg72/b;)Lg72/b;",
        "k",
        "(Lg72/b;)Lg72/b;",
        "Lg72/b$e;",
        "saveState",
        "Lec3/l;",
        "m",
        "(Lg72/b$e;)Lec3/l;",
        "Lg72/f;",
        "previousData",
        "content",
        "i",
        "(Lg72/f;Lg72/f;)Lg72/f;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/sage/domain/SageApi;",
        "b",
        "Ltr2/n;",
        "c",
        "sage_release"
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
.field public static final c:Lg72/c$a;

.field public static final d:I

.field private static final e:Lj72/g;


# instance fields
.field private final a:Lcom/whoop/sage/domain/SageApi;

.field private final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg72/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg72/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg72/c;->c:Lg72/c$a;

    const/16 v0, 0x8

    sput v0, Lg72/c;->d:I

    sget-object v0, Lj72/g;->SAGE_SUBMIT:Lj72/g;

    sput-object v0, Lg72/c;->e:Lj72/g;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/sage/domain/SageApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg72/c;->a:Lcom/whoop/sage/domain/SageApi;

    .line 3
    iput-object p2, p0, Lg72/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/sage/domain/SageApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "SageOnboardingInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lg72/c;-><init>(Lcom/whoop/sage/domain/SageApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lg72/c;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lg72/c;->j(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lg72/c;)Lcom/whoop/sage/domain/SageApi;
    .locals 0

    iget-object p0, p0, Lg72/c;->a:Lcom/whoop/sage/domain/SageApi;

    return-object p0
.end method

.method public static final synthetic e(Lg72/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lg72/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lg72/c;Lg72/b;)Lg72/b;
    .locals 0

    invoke-direct {p0, p1}, Lg72/c;->k(Lg72/b;)Lg72/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lg72/c;Lg72/a$b;Lg72/b;)Lg72/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lg72/c;->l(Lg72/a$b;Lg72/b;)Lg72/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lg72/c;Lg72/b$e;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lg72/c;->m(Lg72/b$e;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lg72/f;Lg72/f;)Lg72/f;
    .locals 3

    invoke-virtual {p2}, Lg72/f;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lg72/f;->c()Ljava/util/List;

    move-result-object v0

    :cond_0
    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lg72/f;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p2}, Lg72/f;->b()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {p1}, Lg72/f;->d()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p2}, Lg72/f;->d()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v2, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, v1, v0, p2}, Lg72/f;->a(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Lg72/f;

    move-result-object p1

    return-object p1
.end method

.method private final j(ZLq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Lg72/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lg72/c$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lg72/c$b;

    iget v1, v0, Lg72/c$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg72/c$b;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lg72/c$b;

    invoke-direct {v0, p0, p2}, Lg72/c$b;-><init>(Lg72/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lg72/c$b;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lg72/c$b;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lg72/c;->b:Ltr2/n;

    new-instance v5, Lg72/c$c;

    invoke-direct {v5, p0, p2}, Lg72/c$c;-><init>(Lg72/c;Lq83/d;)V

    iput-boolean p1, v6, Lg72/c$b;->w:Z

    iput v3, v6, Lg72/c$b;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p2, Lu02/a;

    goto :goto_5

    :cond_5
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lg72/c;->b:Ltr2/n;

    new-instance v5, Lg72/c$d;

    invoke-direct {v5, p0, p2}, Lg72/c$d;-><init>(Lg72/c;Lq83/d;)V

    iput-boolean p1, v6, Lg72/c$b;->w:Z

    iput v3, v6, Lg72/c$b;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    check-cast p2, Lu02/a;

    :goto_5
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_7

    new-instance v0, Lg72/b$g;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;

    new-instance v2, Lg72/e;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;

    invoke-virtual {p1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;->getInitialScreen()Lj72/g;

    move-result-object p1

    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-direct {v2, p1, p2}, Lg72/e;-><init>(Lj72/g;Ljava/util/List;)V

    new-instance v3, Lg72/f;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lg72/f;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0x8

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lg72/b$g;-><init>(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;Lg72/e;Lg72/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_7
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_8

    sget-object p1, Lg72/b$a;->a:Lg72/b$a;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final k(Lg72/b;)Lg72/b;
    .locals 8

    const-string v0, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Success"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lg72/b$g;

    invoke-virtual {v1}, Lg72/b$g;->c()Lg72/e;

    move-result-object p1

    invoke-virtual {p1}, Lg72/e;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v1 .. v7}, Lg72/b$g;->b(Lg72/b$g;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;Lg72/e;Lg72/f;ZILjava/lang/Object;)Lg72/b$g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v1}, Lg72/b$g;->c()Lg72/e;

    move-result-object p1

    invoke-virtual {p1}, Lg72/e;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj72/g;

    invoke-virtual {v1}, Lg72/b$g;->c()Lg72/e;

    move-result-object v0

    invoke-virtual {v0}, Lg72/e;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    new-instance v3, Lg72/e;

    invoke-direct {v3, p1, v0}, Lg72/e;-><init>(Lj72/g;Ljava/util/List;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lg72/b$g;->b(Lg72/b$g;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;Lg72/e;Lg72/f;ZILjava/lang/Object;)Lg72/b$g;

    move-result-object p1

    return-object p1
.end method

.method private final l(Lg72/a$b;Lg72/b;)Lg72/b;
    .locals 11

    instance-of v0, p2, Lg72/b$g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p2

    check-cast v2, Lg72/b$g;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const-string v3, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Saving"

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lg72/b$g;->c()Lg72/e;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Lg72/b$e;

    invoke-virtual {v2}, Lg72/b$e;->a()Lg72/e;

    move-result-object v2

    :cond_2
    if-eqz v0, :cond_3

    move-object v1, p2

    check-cast v1, Lg72/b$g;

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lg72/b$g;->e()Lg72/f;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lg72/b$e;

    invoke-virtual {v0}, Lg72/b$e;->b()Lg72/f;

    move-result-object v0

    :cond_5
    invoke-virtual {v2}, Lg72/e;->a()Lj72/g;

    move-result-object v1

    invoke-virtual {v2}, Lg72/e;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lg72/a$b;->a()Lg72/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lg72/c;->i(Lg72/f;Lg72/f;)Lg72/f;

    move-result-object v7

    invoke-virtual {p1}, Lg72/a$b;->b()Lj72/g;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lg72/a$b;->b()Lj72/g;

    move-result-object v0

    sget-object v1, Lg72/c;->e:Lj72/g;

    if-eq v0, v1, :cond_6

    const-string v0, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Success"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lg72/b$g;

    new-instance v6, Lg72/e;

    invoke-virtual {p1}, Lg72/a$b;->b()Lj72/g;

    move-result-object p1

    invoke-direct {v6, p1, v3}, Lg72/e;-><init>(Lj72/g;Ljava/util/List;)V

    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lg72/b$g;->b(Lg72/b$g;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;Lg72/e;Lg72/f;ZILjava/lang/Object;)Lg72/b$g;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lg72/b$e;

    invoke-direct {p1, v2, v7}, Lg72/b$e;-><init>(Lg72/e;Lg72/f;)V

    return-object p1
.end method

.method private final m(Lg72/b$e;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg72/b$e;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lg72/c$h;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lg72/c$h;-><init>(Lg72/b$e;Lg72/c;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    new-instance v0, Lg72/d;

    sget-object v1, Lg72/b$b;->a:Lg72/b$b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lg72/d;-><init>(Lg72/b;Lg72/b$g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lg72/c$g;

    invoke-direct {v1, p0, v3}, Lg72/c$g;-><init>(Lg72/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lg72/c$f;

    invoke-direct {p1, v2}, Lg72/c$f;-><init>(Lec3/l;)V

    new-instance v0, Lg72/c$e;

    invoke-direct {v0, v3, p0}, Lg72/c$e;-><init>(Lq83/d;Lg72/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
