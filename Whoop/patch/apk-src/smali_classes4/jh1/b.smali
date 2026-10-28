.class public final Ljh1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JK\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001aR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Ljh1/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "source",
        "giftType",
        "numberOfTests",
        "",
        "analyticsProperties",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "g",
        "(Ljava/lang/String;)V",
        "e",
        "f",
        "Lnh1/a$l;",
        "event",
        "d",
        "(Lnh1/a$l;)V",
        "Lnh1/a$a;",
        "c",
        "(Lnh1/a$a;)V",
        "Lfi0/a;",
        "Lec3/p1;",
        "Ljh1/a;",
        "b",
        "Lec3/p1;",
        "_analyticsContext",
        "gifting_release"
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

.field private final b:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 8

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljh1/b;->a:Lfi0/a;

    new-instance v1, Ljh1/a;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Ljh1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Ljh1/b;->b:Lec3/p1;

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ljh1/b;->b:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljh1/a;

    if-nez p1, :cond_1

    invoke-virtual {v3}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, p1

    :goto_0
    if-nez p2, :cond_2

    invoke-virtual {v3}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, p2

    :goto_1
    if-nez p3, :cond_3

    invoke-virtual {v3}, Ljh1/a;->d()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_3
    move-object v6, p3

    :goto_2
    if-nez p4, :cond_4

    invoke-virtual {v3}, Ljh1/a;->b()Ljava/util/Map;

    move-result-object v7

    goto :goto_3

    :cond_4
    move-object v7, p4

    :goto_3
    invoke-virtual {v3, v4, v5, v6, v7}, Ljh1/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljh1/a;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public static synthetic b(Ljh1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ljh1/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final d(Lnh1/a$l;)V
    .locals 2

    invoke-virtual {p1}, Lnh1/a$l;->a()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lq31/f;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnh1/a$l;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lq31/b;

    if-eqz v0, :cond_1

    new-instance v0, Lnh1/a$e;

    check-cast p1, Lq31/b;

    invoke-virtual {p1}, Lq31/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnh1/a$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljh1/b;->c(Lnh1/a$a;)V

    return-void

    :cond_0
    instance-of p1, v0, Lny0/h;

    if-eqz p1, :cond_1

    iget-object p1, p0, Ljh1/b;->b:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljh1/a;

    invoke-virtual {p1}, Ljh1/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v0, Lnh1/a$f;

    invoke-virtual {p1}, Ljh1/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnh1/a$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljh1/b;->c(Lnh1/a$a;)V

    :cond_1
    return-void
.end method

.method private final e(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ljh1/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljh1/a;

    invoke-virtual {v0}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Ljh1/b;->a:Lfi0/a;

    invoke-virtual {v0}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljh1/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {v1, v2, v3, p1, v0}, Ljh1/c;->a(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final f(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ljh1/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljh1/a;

    invoke-virtual {v0}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Ljh1/b;->a:Lfi0/a;

    invoke-virtual {v0}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljh1/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {v1, v2, v3, p1, v0}, Ljh1/c;->b(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final g(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ljh1/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljh1/a;

    invoke-virtual {v0}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Ljh1/b;->a:Lfi0/a;

    invoke-virtual {v0}, Ljh1/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljh1/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljh1/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {v1, v2, v3, p1, v0}, Ljh1/c;->d(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Lnh1/a$a;)V
    .locals 14

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnh1/a$k;

    if-eqz v0, :cond_0

    check-cast p1, Lnh1/a$k;

    invoke-virtual {p1}, Lnh1/a$k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnh1/a$k;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Ljh1/b;->b(Ljh1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lnh1/a$i;

    if-eqz v0, :cond_1

    check-cast p1, Lnh1/a$i;

    invoke-virtual {p1}, Lnh1/a$i;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lnh1/a$i;->a()Ljava/util/Map;

    move-result-object v11

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v13}, Ljh1/b;->b(Ljh1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lnh1/a$i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljh1/b;->g(Ljava/lang/String;)V

    return-void

    :cond_1
    move-object v7, p0

    instance-of v0, p1, Lnh1/a$e;

    if-eqz v0, :cond_2

    check-cast p1, Lnh1/a$e;

    invoke-virtual {p1}, Lnh1/a$e;->a()Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0xb

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Ljh1/b;->b(Ljh1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lnh1/a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljh1/b;->e(Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lnh1/a$f;

    if-eqz v0, :cond_3

    check-cast p1, Lnh1/a$f;

    invoke-virtual {p1}, Lnh1/a$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljh1/b;->f(Ljava/lang/String;)V

    return-void

    :cond_3
    instance-of v0, p1, Lnh1/a$l;

    if-eqz v0, :cond_4

    check-cast p1, Lnh1/a$l;

    invoke-direct {p0, p1}, Ljh1/b;->d(Lnh1/a$l;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
