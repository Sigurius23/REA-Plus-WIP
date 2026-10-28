.class public final Ld72/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ld72/a;",
        "Ld72/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J#\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001d2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Ld72/c;",
        "Lod1/g;",
        "Ld72/a;",
        "Ld72/b;",
        "Lcom/whoop/sage/domain/SageApi;",
        "api",
        "Lu02/c;",
        "apiClient",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/sage/domain/SageApi;Lu02/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lo51/a$a;",
        "action",
        "l",
        "(Ld72/c;Lo51/a$a;Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "j",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sage/domain/models/SageResponse;",
        "response",
        "Ld72/b$f;",
        "i",
        "(Lcom/whoop/sage/domain/models/SageResponse;)Ld72/b$f;",
        "date",
        "k",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/sage/domain/SageApi;",
        "b",
        "Lu02/c;",
        "c",
        "Ltr2/n;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
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


# instance fields
.field private final a:Lcom/whoop/sage/domain/SageApi;

.field private final b:Lu02/c;

.field private final c:Ltr2/n;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/sage/domain/SageApi;Lu02/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld72/c;->a:Lcom/whoop/sage/domain/SageApi;

    .line 3
    iput-object p2, p0, Ld72/c;->b:Lu02/c;

    .line 4
    iput-object p3, p0, Ld72/c;->c:Ltr2/n;

    .line 5
    iput-object p4, p0, Ld72/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/sage/domain/SageApi;Lu02/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "SageInteractor"

    invoke-virtual {p3, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ld72/c;-><init>(Lcom/whoop/sage/domain/SageApi;Lu02/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method

.method public static final synthetic c(Ld72/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ld72/c;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ld72/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ld72/c;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ld72/c;Ld72/c;Lo51/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld72/c;->l(Ld72/c;Lo51/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ld72/c;)Lcom/whoop/sage/domain/SageApi;
    .locals 0

    iget-object p0, p0, Ld72/c;->a:Lcom/whoop/sage/domain/SageApi;

    return-object p0
.end method

.method public static final synthetic g(Ld72/c;)Lu02/c;
    .locals 0

    iget-object p0, p0, Ld72/c;->b:Lu02/c;

    return-object p0
.end method

.method public static final synthetic h(Ld72/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Ld72/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method private final i(Lcom/whoop/sage/domain/models/SageResponse;)Ld72/b$f;
    .locals 1

    new-instance v0, Ld72/b$f;

    invoke-direct {v0, p1}, Ld72/b$f;-><init>(Lcom/whoop/sage/domain/models/SageResponse;)V

    return-object v0
.end method

.method private final j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ld72/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ld72/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld72/c$a;

    iget v1, v0, Ld72/c$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld72/c$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ld72/c$a;

    invoke-direct {v0, p0, p2}, Ld72/c$a;-><init>(Ld72/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ld72/c$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld72/c$a;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ld72/c$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/network/request/DismissUpsellCardRequest;

    iget-object p1, v6, Ld72/c$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lcom/whoop/network/request/DismissUpsellCardRequest;

    new-instance v1, Lz02/b;

    invoke-direct {v1, p1}, Lz02/b;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v1}, Lcom/whoop/network/request/DismissUpsellCardRequest;-><init>(Lz02/b;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Ld72/c;->c:Ltr2/n;

    const-string v4, "Failed to dismiss upsell card with id "

    invoke-static {v4, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ld72/c$b;

    const/4 v7, 0x0

    invoke-direct {v5, p0, p2, v7}, Ld72/c$b;-><init>(Ld72/c;Lcom/whoop/network/request/DismissUpsellCardRequest;Lq83/d;)V

    iput-object p1, v6, Ld72/c$a;->w:Ljava/lang/Object;

    iput-object v7, v6, Ld72/c$a;->x:Ljava/lang/Object;

    iput v3, v6, Ld72/c$a;->E:I

    const/4 v3, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of v0, p2, Lu02/a$c;

    if-eqz v0, :cond_4

    new-instance p2, Ld72/b$b;

    invoke-direct {p2, p1}, Ld72/b$b;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Ld72/b$e;->a:Ld72/b$e;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ld72/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ld72/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld72/c$c;

    iget v1, v0, Ld72/c$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld72/c$c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ld72/c$c;

    invoke-direct {v0, p0, p2}, Ld72/c$c;-><init>(Ld72/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ld72/c$c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld72/c$c;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ld72/c$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Ld72/c;->c:Ltr2/n;

    new-instance v5, Ld72/c$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Ld72/c$d;-><init>(Ld72/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Ld72/c$c;->w:Ljava/lang/Object;

    iput p2, v6, Ld72/c$c;->z:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/domain/models/SageResponse;

    invoke-direct {p0, p1}, Ld72/c;->i(Lcom/whoop/sage/domain/models/SageResponse;)Ld72/b$f;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Ld72/b$c;->a:Ld72/b$c;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final l(Ld72/c;Lo51/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld72/c;",
            "Lo51/a$a;",
            "Lq83/d<",
            "-",
            "Ld72/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ld72/c$e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ld72/c$e;

    iget v1, v0, Ld72/c$e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld72/c$e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld72/c$e;

    invoke-direct {v0, p0, p3}, Ld72/c$e;-><init>(Ld72/c;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ld72/c$e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld72/c$e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ld72/c$e;->x:Ljava/lang/Object;

    check-cast p1, Lo51/a$a;

    iget-object p1, v0, Ld72/c$e;->w:Ljava/lang/Object;

    check-cast p1, Ld72/c;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p1, Ld72/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "sage-feature"

    invoke-interface {p3, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {p2}, Lo51/a$a;->a()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    iput-object p3, v0, Ld72/c$e;->w:Ljava/lang/Object;

    iput-object p3, v0, Ld72/c$e;->x:Ljava/lang/Object;

    iput v3, v0, Ld72/c$e;->E:I

    invoke-direct {p1, p2, v0}, Ld72/c;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ld72/b;

    instance-of p1, p3, Ld72/b$f;

    if-eqz p1, :cond_4

    new-instance p1, Ld72/b$a;

    check-cast p3, Ld72/b$f;

    invoke-virtual {p3}, Ld72/b$f;->a()Lcom/whoop/sage/domain/models/SageResponse;

    move-result-object p2

    invoke-direct {p1, p2}, Ld72/b$a;-><init>(Lcom/whoop/sage/domain/models/SageResponse;)V

    return-object p1

    :cond_4
    sget-object p1, Ld72/b$c;->a:Ld72/b$c;

    return-object p1

    :cond_5
    sget-object p1, Ld72/b$c;->a:Ld72/b$c;

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 1
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

    new-instance v0, Ld72/c$f;

    invoke-direct {v0, p1, p0}, Ld72/c$f;-><init>(Lec3/l;Ld72/c;)V

    return-object v0
.end method
