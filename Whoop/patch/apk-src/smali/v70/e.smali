.class public final Lv70/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lv70/c;",
        "Lv70/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lv70/e;",
        "Lod1/g;",
        "Lv70/c;",
        "Lv70/d;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "previousState",
        "action",
        "f",
        "(Lv70/d;Lv70/c;)Lv70/d;",
        "",
        "manualRefresh",
        "Lec3/l;",
        "h",
        "(Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
        "cacheResult",
        "g",
        "(Lpm0/a$c;)Lv70/d;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "activation_release"
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

    iput-object p1, p0, Lv70/e;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lv70/e;Lv70/d;Lv70/c;)Lv70/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lv70/e;->f(Lv70/d;Lv70/c;)Lv70/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lv70/e;Lpm0/a$c;)Lv70/d;
    .locals 0

    invoke-direct {p0, p1}, Lv70/e;->g(Lpm0/a$c;)Lv70/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lv70/e;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lv70/e;->h(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lv70/d;Lv70/c;)Lv70/d;
    .locals 7

    instance-of v0, p2, Lv70/c$b;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of p2, p2, Lv70/c$a;

    if-eqz p2, :cond_1

    sget-object v1, Lv70/b$a;->a:Lv70/b$a;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lv70/d;->b(Lv70/d;Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZILjava/lang/Object;)Lv70/d;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, p1

    return-object v0
.end method

.method private final g(Lpm0/a$c;)Lv70/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
            ">;)",
            "Lv70/d;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lv70/d;

    sget-object v1, Lv70/b$f;->a:Lv70/b$f;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lv70/d;-><init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Lv70/d;

    sget-object v2, Lv70/b$d;->a:Lv70/b$d;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lv70/d;-><init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final h(Z)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/activation/feature/orderconfirmation/domain/GetOrderConfirmationRequest;

    invoke-direct {v0}, Lcom/whoop/activation/feature/orderconfirmation/domain/GetOrderConfirmationRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lv70/e;->a:Lnm0/e;

    new-instance v3, Lv70/e$d;

    invoke-direct {v3, v2, v1}, Lv70/e$d;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lv70/e$e;

    invoke-direct {v1, v0, p1, p0}, Lv70/e$e;-><init>(Lec3/l;ZLv70/e;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
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

    new-instance v0, Lv70/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lv70/e$a;-><init>(Lq83/d;Lv70/e;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lv70/d;

    sget-object v3, Lv70/b$c;->a:Lv70/b$c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lv70/d;-><init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lv70/e$b;

    invoke-direct {v0, p0, v1}, Lv70/e$b;-><init>(Lv70/e;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
