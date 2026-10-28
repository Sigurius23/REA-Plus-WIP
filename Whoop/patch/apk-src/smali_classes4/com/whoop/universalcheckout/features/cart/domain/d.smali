.class public final Lcom/whoop/universalcheckout/features/cart/domain/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/universalcheckout/features/cart/domain/a;",
        "Lcom/whoop/universalcheckout/features/cart/domain/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J>\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ \u0010 \u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0004\u0008 \u0010!J2\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008#\u0010$J2\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008%\u0010&J@\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\'\u001a\u00020\u00172\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00170(2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008*\u0010+J2\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020,2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008-\u0010.J,\u00102\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0082@\u00a2\u0006\u0004\u00082\u00103J \u00104\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u00084\u00105J#\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u0003062\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000206H\u0016\u00a2\u0006\u0004\u00088\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010C\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/d;",
        "Lod1/g;",
        "Lcom/whoop/universalcheckout/features/cart/domain/a;",
        "Lcom/whoop/universalcheckout/features/cart/domain/c;",
        "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;",
        "api",
        "Lao2/a;",
        "cartIndicatorRepository",
        "Lw02/a;",
        "errorBodyParser",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Lcom/whoop/universalcheckout/features/cart/domain/CartApi;Lao2/a;Lw02/a;Ltr2/n;Lrr2/c;)V",
        "state",
        "Lcom/whoop/universalcheckout/features/cart/domain/e$a;",
        "action",
        "l",
        "(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;",
        "addIntent",
        "",
        "sku",
        "cartId",
        "storeDomain",
        "Lu02/a;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
        "m",
        "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/e$d;",
        "n",
        "(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$d;Lq83/d;)Ljava/lang/Object;",
        "intent",
        "g",
        "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "h",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "packSku",
        "",
        "childItemSkus",
        "i",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;",
        "j",
        "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "lineItemId",
        "",
        "quantity",
        "o",
        "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "k",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;",
        "b",
        "Lao2/a;",
        "c",
        "Lw02/a;",
        "d",
        "Ltr2/n;",
        "e",
        "Lrr2/c;",
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
.field private final a:Lcom/whoop/universalcheckout/features/cart/domain/CartApi;

.field private final b:Lao2/a;

.field private final c:Lw02/a;

.field private final d:Ltr2/n;

.field private final e:Lrr2/c;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/CartApi;Lao2/a;Lw02/a;Ltr2/n;Lrr2/c;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartIndicatorRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorBodyParser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->a:Lcom/whoop/universalcheckout/features/cart/domain/CartApi;

    .line 3
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->b:Lao2/a;

    .line 4
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->c:Lw02/a;

    .line 5
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->d:Ltr2/n;

    .line 6
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->e:Lrr2/c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/CartApi;Lao2/a;Lw02/a;Ltr2/n;Lrr2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "CartInteractor"

    invoke-virtual {p4, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/universalcheckout/features/cart/domain/d;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/CartApi;Lao2/a;Lw02/a;Ltr2/n;Lrr2/c;)V

    return-void
.end method

.method public static final synthetic c(Lcom/whoop/universalcheckout/features/cart/domain/d;)Lcom/whoop/universalcheckout/features/cart/domain/CartApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->a:Lcom/whoop/universalcheckout/features/cart/domain/CartApi;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/universalcheckout/features/cart/domain/d;Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/universalcheckout/features/cart/domain/d;->l(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/universalcheckout/features/cart/domain/d;Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/universalcheckout/features/cart/domain/d;->n(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$d;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/cart/domain/d;->o(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;->getSku()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/cart/domain/d;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;->getPackSku()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;->getChildItemSkus()Ljava/util/List;

    move-result-object v2

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/whoop/universalcheckout/features/cart/domain/d;->i(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    instance-of p2, p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    if-eqz p2, :cond_2

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-direct {p0, p1, v3, v4, v5}, Lcom/whoop/universalcheckout/features/cart/domain/d;->j(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->d:Ltr2/n;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->e:Lrr2/c;

    if-nez p3, :cond_0

    const-string v3, "SHOP"

    goto :goto_0

    :cond_0
    move-object v3, p3

    :goto_0
    const-string v4, ", cartId="

    const-string v5, ", storeDomain="

    const-string v6, "cart addItem failed (sku="

    invoke-static {v6, p1, v4, p2, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-static {v3, v5, v4}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/universalcheckout/features/cart/domain/d$a;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/whoop/universalcheckout/features/cart/domain/d$a;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final i(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->d:Ltr2/n;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->e:Lrr2/c;

    if-nez p4, :cond_0

    const-string v3, "SHOP"

    goto :goto_0

    :cond_0
    move-object v3, p4

    :goto_0
    const-string v4, ", cartId="

    const-string v5, ", storeDomain="

    const-string v6, "cart addPack failed (packSku="

    invoke-static {v6, p1, v4, p3, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-static {v3, v5, v4}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/universalcheckout/features/cart/domain/d$b;

    const/4 v10, 0x0

    move-object v5, p0

    move-object v7, p1

    move-object v8, p2

    move-object v6, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v10}, Lcom/whoop/universalcheckout/features/cart/domain/d$b;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)V

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final j(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->d:Ltr2/n;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->e:Lrr2/c;

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getWywSku()Ljava/lang/String;

    move-result-object v3

    if-nez p3, :cond_0

    const-string v4, "SHOP"

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    const-string v5, ", cartId="

    const-string v6, ", storeDomain="

    const-string v7, "cart addWyw failed (wywSku="

    invoke-static {v7, v3, v5, p2, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ")"

    invoke-static {v4, v5, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/universalcheckout/features/cart/domain/d$c;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v7, p1

    move-object v6, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/whoop/universalcheckout/features/cart/domain/d$c;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Lq83/d;)V

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->d:Ltr2/n;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->e:Lrr2/c;

    const-string v3, "cart getCart failed (cartId="

    const-string v4, ")"

    invoke-static {v3, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/universalcheckout/features/cart/domain/d$d;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p1, v5}, Lcom/whoop/universalcheckout/features/cart/domain/d$d;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Lq83/d;)V

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final l(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/c;",
            "Lcom/whoop/universalcheckout/features/cart/domain/e$a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$g;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/universalcheckout/features/cart/domain/d$g;

    iget v3, v2, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/whoop/universalcheckout/features/cart/domain/d$g;

    invoke-direct {v2, v0, v1}, Lcom/whoop/universalcheckout/features/cart/domain/d$g;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->H:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v2, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    const/4 v7, 0x2

    const/4 v3, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v7, :cond_1

    iget-object v2, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->G:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    iget-object v3, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->F:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/universalcheckout/features/cart/domain/c;

    iget-object v4, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->E:Ljava/lang/Object;

    check-cast v4, Lu02/a;

    iget-object v4, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->x:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/universalcheckout/features/cart/domain/e$a;

    iget-object v5, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/universalcheckout/features/cart/domain/c;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v3

    move-object v13, v4

    move-object v12, v6

    move-object v4, v2

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/universalcheckout/features/cart/domain/e$a;

    iget-object v4, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/universalcheckout/features/cart/domain/c;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/universalcheckout/features/cart/domain/e$a;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->c()Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/whoop/universalcheckout/features/cart/domain/e$a;->d()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->e()Ljava/lang/String;

    move-result-object v2

    :cond_5
    move-object v4, v2

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/universalcheckout/features/cart/domain/e$a;->a()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/universalcheckout/features/cart/domain/e$a;->c()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v10, p1

    iput-object v10, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->w:Ljava/lang/Object;

    iput-object v8, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->x:Ljava/lang/Object;

    iput-object v1, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->y:Ljava/lang/Object;

    iput-object v4, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->z:Ljava/lang/Object;

    iput v3, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    move-object v3, v1

    move-object v1, v2

    move-object v2, v9

    invoke-direct/range {v0 .. v5}, Lcom/whoop/universalcheckout/features/cart/domain/d;->m(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, v4

    move-object v4, v10

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v9, v1, Lu02/a$c;

    if-eqz v9, :cond_8

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getCartId()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    move-object v3, v5

    :goto_3
    iget-object v5, v0, Lcom/whoop/universalcheckout/features/cart/domain/d;->b:Lao2/a;

    invoke-virtual {v5, v3}, Lao2/a;->i(Ljava/lang/String;)V

    new-instance v5, Lcom/whoop/universalcheckout/features/cart/domain/b$b;

    invoke-direct {v5, v1}, Lcom/whoop/universalcheckout/features/cart/domain/b$b;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;)V

    const/4 v1, 0x0

    invoke-virtual {v4, v5, v1, v3, v2}, Lcom/whoop/universalcheckout/features/cart/domain/c;->a(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v9, v1, Lu02/a$b;

    if-eqz v9, :cond_b

    sget-object v9, Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;->Load:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    iget-object v10, v0, Lcom/whoop/universalcheckout/features/cart/domain/d;->c:Lw02/a;

    check-cast v1, Lu02/a$b;

    invoke-virtual {v1}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object v1

    sget-object v11, Lcom/whoop/universalcheckout/features/cart/domain/models/CartErrorResponse;->Companion:Lcom/whoop/universalcheckout/features/cart/domain/models/CartErrorResponse$a;

    invoke-virtual {v11}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartErrorResponse$a;->serializer()Lwc3/c;

    move-result-object v11

    check-cast v11, Lwc3/b;

    iput-object v8, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->w:Ljava/lang/Object;

    iput-object v8, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->x:Ljava/lang/Object;

    iput-object v3, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->y:Ljava/lang/Object;

    iput-object v2, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->z:Ljava/lang/Object;

    iput-object v8, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->E:Ljava/lang/Object;

    iput-object v4, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->F:Ljava/lang/Object;

    iput-object v9, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->G:Ljava/lang/Object;

    iput v7, v5, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    invoke-virtual {v10, v1, v11, v5}, Lw02/a;->a(Ljava/lang/Exception;Lwc3/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_9

    :goto_4
    return-object v6

    :cond_9
    move-object v12, v9

    move-object v9, v4

    move-object v4, v12

    move-object v13, v2

    move-object v12, v3

    :goto_5
    check-cast v1, Lcom/whoop/universalcheckout/features/cart/domain/models/CartErrorResponse;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartErrorResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v8

    :cond_a
    move-object v5, v8

    new-instance v2, Lcom/whoop/universalcheckout/features/cart/domain/b$a;

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/b$a;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v11, 0x0

    move-object v10, v2

    invoke-static/range {v9 .. v15}, Lcom/whoop/universalcheckout/features/cart/domain/c;->b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object v1

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final m(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, p3, p4, p5}, Lcom/whoop/universalcheckout/features/cart/domain/d;->g(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/whoop/universalcheckout/features/cart/domain/d;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p3, p5}, Lcom/whoop/universalcheckout/features/cart/domain/d;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$d;Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/c;",
            "Lcom/whoop/universalcheckout/features/cart/domain/e$d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/d$h;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;

    iget v2, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;

    invoke-direct {v1, p0, v0}, Lcom/whoop/universalcheckout/features/cart/domain/d$h;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->G:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->z:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;

    iget-object p1, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/universalcheckout/features/cart/domain/e$d;

    iget-object v1, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v3, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/universalcheckout/features/cart/domain/e$d;

    iget-object v3, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/universalcheckout/features/cart/domain/c;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v3

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/universalcheckout/features/cart/domain/e$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/universalcheckout/features/cart/domain/e$d;->b()I

    move-result v7

    iput-object p1, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->w:Ljava/lang/Object;

    iput-object v6, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->x:Ljava/lang/Object;

    iput-object v0, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->y:Ljava/lang/Object;

    iput v5, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->G:I

    invoke-direct {p0, v0, v3, v7, v1}, Lcom/whoop/universalcheckout/features/cart/domain/d;->o(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v7, p1

    move-object p1, v0

    move-object v0, v3

    :goto_1
    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getCartId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    move-object v10, p1

    goto :goto_2

    :cond_5
    move-object v10, v1

    :goto_2
    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->b:Lao2/a;

    invoke-virtual {p1, v10}, Lao2/a;->i(Ljava/lang/String;)V

    new-instance v8, Lcom/whoop/universalcheckout/features/cart/domain/b$b;

    invoke-direct {v8, v0}, Lcom/whoop/universalcheckout/features/cart/domain/b$b;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;)V

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lcom/whoop/universalcheckout/features/cart/domain/c;->b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object p1

    return-object p1

    :cond_6
    iput-object v7, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->w:Ljava/lang/Object;

    iput-object v6, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->x:Ljava/lang/Object;

    iput-object p1, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->y:Ljava/lang/Object;

    iput-object v6, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->z:Ljava/lang/Object;

    iput v4, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$h;->G:I

    invoke-direct {p0, p1, v1}, Lcom/whoop/universalcheckout/features/cart/domain/d;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    move-object v1, v7

    :goto_4
    check-cast v0, Lu02/a;

    invoke-static {v0}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;

    if-eqz v3, :cond_9

    new-instance v2, Lcom/whoop/universalcheckout/features/cart/domain/b$a;

    sget-object v4, Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;->Mutation:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/b$a;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getCartId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    move-object v4, p1

    goto :goto_5

    :cond_8
    move-object v4, v0

    :goto_5
    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/c;->b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v2, Lcom/whoop/universalcheckout/features/cart/domain/b$a;

    sget-object v4, Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;->Mutation:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/b$a;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/c;->b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object p1

    return-object p1
.end method

.method private final o(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move/from16 v4, p3

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/d$i;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/whoop/universalcheckout/features/cart/domain/d$i;

    iget v2, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->F:I

    const/high16 v3, -0x80000000

    and-int v5, v2, v3

    if-eqz v5, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->F:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/d$i;

    invoke-direct {v1, p0, v0}, Lcom/whoop/universalcheckout/features/cart/domain/d$i;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->z:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->F:I

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v6, :cond_1

    iget-object p1, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v9, Lu02/a;->a:Lu02/a$a;

    iget-object v10, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->d:Ltr2/n;

    iget-object v11, p0, Lcom/whoop/universalcheckout/features/cart/domain/d;->e:Lrr2/c;

    const-string v0, ", quantity="

    const-string v1, ", cartId="

    const-string v2, "cart updateQuantity failed (lineItemId="

    invoke-static {v4, v2, p2, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {p1, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v12

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/d$j;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/universalcheckout/features/cart/domain/d$j;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Ljava/lang/String;ILq83/d;)V

    const/4 p1, 0x0

    iput-object p1, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->w:Ljava/lang/Object;

    iput-object p1, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->x:Ljava/lang/Object;

    iput v4, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->y:I

    iput v6, v7, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->F:I

    move-object v6, v0

    move-object v2, v9

    move-object v3, v10

    move-object v4, v11

    move-object v5, v12

    invoke-virtual/range {v2 .. v7}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    :goto_2
    check-cast v0, Lu02/a;

    invoke-static {v0}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/d$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/cart/domain/d$e;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lcom/whoop/universalcheckout/features/cart/domain/c;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/universalcheckout/features/cart/domain/c;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;

    invoke-direct {v0, p0, v1}, Lcom/whoop/universalcheckout/features/cart/domain/d$f;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v1, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    return-object p1
.end method
