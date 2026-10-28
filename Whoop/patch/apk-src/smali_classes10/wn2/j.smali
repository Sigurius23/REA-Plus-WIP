.class public final Lwn2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lwn2/j;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lsn2/i;",
        "Lwn2/i$c;",
        "c",
        "(Lsn2/i;)Lwn2/i$c;",
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
        "Lcom/whoop/navigation/e;",
        "checkoutDestination",
        "Lwn2/g;",
        "d",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Lcom/whoop/navigation/e;)Lwn2/g;",
        "Ly71/o;",
        "a",
        "(Ly71/o;Lcom/whoop/navigation/e;)Ly71/o;",
        "Lsn2/b;",
        "result",
        "Lwn2/i;",
        "b",
        "(Lsn2/b;)Lwn2/i;",
        "Ljb1/a;",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lwn2/j;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwn2/j;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lwn2/d;->k()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lwn2/j;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Ly71/o;Lcom/whoop/navigation/e;)Ly71/o;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Ly71/o;->h()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lwn2/c;->SHIPPING_ADDRESS:Lwn2/c;

    goto :goto_0

    :cond_0
    sget-object v0, Lwn2/c;->PAYMENT_METHOD:Lwn2/c;

    :goto_0
    new-instance v2, Lwn2/e$c;

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lwn2/e$c;-><init>(Lwn2/c;Lcom/whoop/navigation/e;)V

    const/16 v17, 0x5dfe

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v18}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0
.end method

.method private final c(Lsn2/i;)Lwn2/i$c;
    .locals 10

    invoke-virtual {p1}, Lsn2/i;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    invoke-virtual {p1}, Lsn2/i;->b()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lwn2/j;->d(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Lcom/whoop/navigation/e;)Lwn2/g;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lwn2/g;

    invoke-virtual {v2}, Lwn2/g;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lwn2/j;->a:Ljb1/a;

    invoke-virtual {p1}, Lsn2/i;->c()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn2/g;

    invoke-virtual {v2}, Lwn2/g;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    instance-of v2, v2, Lxn2/g;

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v1, v1, Lxn2/c;

    if-eqz v1, :cond_7

    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_8

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v1, v1, Lio2/h;

    if-eqz v1, :cond_9

    new-instance v3, Lwn2/i$c;

    invoke-virtual {p1}, Lsn2/i;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lsn2/i;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lsn2/i;->b()Lcom/whoop/navigation/e;

    move-result-object v8

    invoke-virtual {p1}, Lsn2/i;->d()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v3 .. v9}, Lwn2/i$c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v3

    :cond_a
    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private final d(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Lcom/whoop/navigation/e;)Lwn2/g;
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->getSectionType()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lwn2/j;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->getItems()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    instance-of v4, v3, Ly71/o;

    if-eqz v4, :cond_0

    check-cast v3, Ly71/o;

    invoke-direct {p0, v3, p2}, Lwn2/j;->a(Ly71/o;Lcom/whoop/navigation/e;)Ly71/o;

    move-result-object v3

    :cond_0
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lwn2/g;

    invoke-direct {p1, v0, v1, v2}, Lwn2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method


# virtual methods
.method public final b(Lsn2/b;)Lwn2/i;
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsn2/b$c;->a:Lsn2/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lwn2/i$d;->a:Lwn2/i$d;

    return-object p1

    :cond_0
    instance-of v0, p1, Lsn2/b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lwn2/i$a;

    check-cast p1, Lsn2/b$a;

    invoke-virtual {p1}, Lsn2/b$a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lwn2/i$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lsn2/b$b;

    if-eqz v0, :cond_2

    new-instance v1, Lwn2/i$b;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lwn2/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lwn2/e$i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lsn2/b$g;

    if-eqz v0, :cond_4

    check-cast p1, Lsn2/b$g;

    invoke-virtual {p1}, Lsn2/b$g;->a()Lsn2/i;

    move-result-object p1

    invoke-direct {p0, p1}, Lwn2/j;->c(Lsn2/i;)Lwn2/i$c;

    move-result-object p1

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    new-instance v0, Lwn2/i$b;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lwn2/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lwn2/e$i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    sget-object v0, Lsn2/b$f;->a:Lsn2/b$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lwn2/i$f;->a:Lwn2/i$f;

    return-object p1

    :cond_5
    instance-of v0, p1, Lsn2/b$d;

    if-eqz v0, :cond_6

    new-instance v0, Lwn2/i$e;

    check-cast p1, Lsn2/b$d;

    invoke-virtual {p1}, Lsn2/b$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lwn2/i$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Lsn2/b$e;

    if-eqz v0, :cond_7

    new-instance v0, Lwn2/i$b;

    check-cast p1, Lsn2/b$e;

    invoke-virtual {p1}, Lsn2/b$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lsn2/b$e;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lwn2/e$f;

    invoke-virtual {p1}, Lsn2/b$e;->b()Lsn2/d;

    move-result-object p1

    invoke-direct {v3, p1}, Lwn2/e$f;-><init>(Lsn2/d;)V

    invoke-direct {v0, v1, v2, v3}, Lwn2/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lwn2/e$i;)V

    return-object v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
