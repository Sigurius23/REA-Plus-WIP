.class public final Ldd0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Ldd0/c;",
        "",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;",
        "response",
        "Ldd0/b;",
        "d",
        "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;)Ldd0/b;",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;",
        "consentAction",
        "",
        "testType",
        "e",
        "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;",
        "request",
        "Lcom/whoop/navigation/e;",
        "finalNavigationAction",
        "g",
        "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Ldd0/a;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "b",
        "Ltr2/n;",
        "advanced-labs_release"
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
.field private final a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldd0/c;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 3
    iput-object p2, p0, Ldd0/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "MultiConsentInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ldd0/c;-><init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ldd0/c;->e(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ldd0/c;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Ldd0/c;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method public static final synthetic c(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ldd0/c;->g(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;)Ldd0/b;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Ldd0/b$d;->a:Ldd0/b$d;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;->getConsentModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ldd0/b$d;->a:Ldd0/b$d;

    return-object p1

    :cond_1
    new-instance v0, Ldd0/b$f;

    invoke-direct {v0, p1}, Ldd0/b$f;-><init>(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;)V

    return-object v0
.end method

.method private final e(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ldd0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ldd0/c$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ldd0/c$a;

    iget v1, v0, Ldd0/c$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldd0/c$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ldd0/c$a;

    invoke-direct {v0, p0, p3}, Ldd0/c$a;-><init>(Ldd0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Ldd0/c$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ldd0/c$a;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ldd0/c$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Ldd0/c$a;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Ldd0/c;->b:Ltr2/n;

    new-instance v5, Ldd0/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, p2, v3}, Ldd0/c$b;-><init>(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Ldd0/c$a;->w:Ljava/lang/Object;

    iput-object v3, v6, Ldd0/c$a;->x:Ljava/lang/Object;

    iput p3, v6, Ldd0/c$a;->E:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_4

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;

    invoke-direct {p0, p1}, Ldd0/c;->d(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;)Ldd0/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Ldd0/b$d;->a:Ldd0/b$d;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;",
            "Lcom/whoop/navigation/e;",
            "Lq83/d<",
            "-",
            "Ldd0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ldd0/c$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ldd0/c$d;

    iget v1, v0, Ldd0/c$d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldd0/c$d;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ldd0/c$d;

    invoke-direct {v0, p0, p3}, Ldd0/c$d;-><init>(Ldd0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Ldd0/c$d;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ldd0/c$d;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ldd0/c$d;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/whoop/navigation/e;

    iget-object p1, v6, Ldd0/c$d;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Ldd0/c;->b:Ltr2/n;

    new-instance v5, Ldd0/c$e;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Ldd0/c$e;-><init>(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lq83/d;)V

    iput-object v3, v6, Ldd0/c$d;->w:Ljava/lang/Object;

    iput-object p2, v6, Ldd0/c$d;->x:Ljava/lang/Object;

    iput p3, v6, Ldd0/c$d;->E:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_4

    new-instance p1, Ldd0/b$b;

    invoke-direct {p1, p2}, Ldd0/b$b;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_4
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_5

    new-instance p1, Ldd0/b$c;

    check-cast p3, Lu02/a$b;

    invoke-virtual {p3}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ldd0/b$c;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
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

    new-instance v0, Ldd0/c$c;

    invoke-direct {v0, p1, p0}, Ldd0/c$c;-><init>(Lec3/l;Ldd0/c;)V

    return-object v0
.end method
