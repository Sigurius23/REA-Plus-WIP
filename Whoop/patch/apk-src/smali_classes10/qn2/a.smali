.class public final Lqn2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqn2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u0006*\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lqn2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "action",
        "Lwn2/i$c;",
        "sheet",
        "Ll83/a0;",
        "e",
        "(Ljava/lang/String;Lwn2/i$c;)V",
        "",
        "properties",
        "d",
        "(Ljava/lang/String;Ljava/util/Map;)V",
        "c",
        "(Lwn2/i$c;)V",
        "Lwn2/e;",
        "event",
        "b",
        "(Lwn2/e;Lwn2/i$c;)V",
        "a",
        "Lfi0/a;",
        "Lwn2/c;",
        "(Lwn2/c;)Ljava/lang/String;",
        "clickAction",
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqn2/a;->a:Lfi0/a;

    return-void
.end method

.method private final a(Lwn2/c;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lqn2/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "click_payment_method"

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "click_shipping_address"

    return-object p1
.end method

.method private final d(Ljava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lqn2/a;->a:Lfi0/a;

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-string v4, "Universal Buy Now"

    const/4 v5, 0x0

    move-object v2, p1

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final e(Ljava/lang/String;Lwn2/i$c;)V
    .locals 4

    invoke-virtual {p2}, Lwn2/i$c;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lio2/h;

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio2/h;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio2/h;->i()Z

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p2}, Lwn2/i$c;->a()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ll83/k;

    const-string v2, "subtotal"

    invoke-direct {v1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ll83/k;

    const-string v2, "checkout_enabled"

    invoke-direct {v0, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lqn2/a;->d(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final b(Lwn2/e;Lwn2/i$c;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwn2/e$f;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_4

    const-string p1, "subtotal"

    invoke-virtual {p2}, Lwn2/i$c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "place_order"

    invoke-direct {p0, p2, p1}, Lqn2/a;->d(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    instance-of v0, p1, Lwn2/e$j;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_4

    const-string p1, "click_view_full_checkout"

    invoke-direct {p0, p1, p2}, Lqn2/a;->e(Ljava/lang/String;Lwn2/i$c;)V

    return-void

    :cond_1
    instance-of v0, p1, Lwn2/e$c;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_4

    check-cast p1, Lwn2/e$c;

    invoke-virtual {p1}, Lwn2/e$c;->b()Lwn2/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lqn2/a;->a(Lwn2/c;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lqn2/a;->e(Ljava/lang/String;Lwn2/i$c;)V

    return-void

    :cond_2
    sget-object p2, Lwn2/e$g;->a:Lwn2/e$g;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    sget-object p2, Lwn2/e$b;->a:Lwn2/e$b;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    sget-object p2, Lwn2/e$a;->a:Lwn2/e$a;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    instance-of p2, p1, Lwn2/e$e;

    if-nez p2, :cond_4

    instance-of p1, p1, Lwn2/e$h;

    if-eqz p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    return-void
.end method

.method public final c(Lwn2/i$c;)V
    .locals 1

    const-string v0, "sheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-direct {p0, v0, p1}, Lqn2/a;->e(Ljava/lang/String;Lwn2/i$c;)V

    return-void
.end method
