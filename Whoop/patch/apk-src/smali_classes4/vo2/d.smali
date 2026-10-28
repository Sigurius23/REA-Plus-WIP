.class public final Lvo2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvo2/b;",
        "Lvo2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lvo2/d;",
        "Lod1/g;",
        "Lvo2/b;",
        "Lvo2/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "previousState",
        "action",
        "f",
        "(Lvo2/c;Lvo2/b;)Lvo2/c;",
        "",
        "cartId",
        "Lec3/l;",
        "h",
        "(Ljava/lang/String;)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;",
        "cacheResult",
        "g",
        "(Lpm0/a$c;Ljava/lang/String;)Lvo2/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "universal-checkout_release"
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
.field private final a:Lnm0/e;


# direct methods
.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo2/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lvo2/d;Lvo2/c;Lvo2/b;)Lvo2/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvo2/d;->f(Lvo2/c;Lvo2/b;)Lvo2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvo2/d;Lpm0/a$c;Ljava/lang/String;)Lvo2/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvo2/d;->g(Lpm0/a$c;Ljava/lang/String;)Lvo2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lvo2/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lvo2/d;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lvo2/c;Lvo2/b;)Lvo2/c;
    .locals 0

    return-object p1
.end method

.method private final g(Lpm0/a$c;Ljava/lang/String;)Lvo2/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lvo2/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lvo2/c;

    sget-object v1, Lvo2/a$d;->a:Lvo2/a$d;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lvo2/c;-><init>(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    move-object v5, p2

    new-instance v1, Lvo2/c;

    sget-object v2, Lvo2/a$c;->a:Lvo2/a$c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lvo2/c;-><init>(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;

    new-instance v1, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;

    invoke-direct {v1, p1}, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;-><init>(Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "ExternalWebCheckout_SCOPE"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lvo2/d;->a:Lnm0/e;

    new-instance v2, Lvo2/d$f;

    invoke-direct {v2, v3, v1}, Lvo2/d$f;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lvo2/d$g;

    invoke-direct {v1, v0, p1, p0}, Lvo2/d$g;-><init>(Lec3/l;Ljava/lang/String;Lvo2/d;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
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

    new-instance v0, Lvo2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvo2/d$a;-><init>(Lq83/d;Lvo2/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lvo2/c;

    sget-object v3, Lvo2/a$b;->a:Lvo2/a$b;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lvo2/c;-><init>(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvo2/d$d;

    invoke-direct {v0, p0, v1}, Lvo2/d$d;-><init>(Lvo2/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
