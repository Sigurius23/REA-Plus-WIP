.class public final Lkb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DateModel:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J+\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J#\u0010\u0018\u001a\u00020\u00172\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R&\u0010\u0006\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lkb1/c;",
        "DateModel",
        "",
        "Lkotlin/Function1;",
        "Lkb1/e;",
        "Lqy0/a;",
        "mapper",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "",
        "dateModels",
        "Lkb1/a;",
        "dateInfo",
        "c",
        "(Ljava/util/List;Lkb1/a;)Ljava/util/List;",
        "b",
        "(Lkb1/a;)Ljava/util/List;",
        "d",
        "a",
        "Lh91/b;",
        "domainState",
        "",
        "monthIndex",
        "Lg51/c;",
        "e",
        "(Lh91/b;I)Lg51/c;",
        "Lkotlin/jvm/functions/Function1;",
        "design-models_release"
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
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb1/c;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method private final a(Lkb1/a;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/a;",
            ")",
            "Ljava/util/List<",
            "Lqy0/a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lkb1/a;->f()I

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    sget-object v2, Lqy0/c;->a:Lqy0/c;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final b(Lkb1/a;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/a;",
            ")",
            "Ljava/util/List<",
            "Lqy0/a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lkb1/a;->g()I

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    sget-object v2, Lqy0/c;->a:Lqy0/c;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final c(Ljava/util/List;Lkb1/a;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TDateModel;>;",
            "Lkb1/a;",
            ")",
            "Ljava/util/List<",
            "Lqy0/a;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lkb1/c;->b(Lkb1/a;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0, p1, p2}, Lkb1/c;->d(Ljava/util/List;Lkb1/a;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p0, p2}, Lkb1/c;->a(Lkb1/a;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method private final d(Ljava/util/List;Lkb1/a;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TDateModel;>;",
            "Lkb1/a;",
            ")",
            "Ljava/util/List<",
            "Lqy0/a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p2}, Lkb1/a;->c()I

    move-result v1

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

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

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-static {v2, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lkb1/e;->i:Lkb1/e$a;

    invoke-virtual {v4, p2, v3, v2}, Lkb1/e$a;->a(Lkb1/a;ILjava/lang/Object;)Lkb1/e;

    move-result-object v2

    iget-object v3, p0, Lkb1/c;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqy0/a;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final e(Lh91/b;I)Lg51/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "TDateModel;>;I)",
            "Lg51/c;"
        }
    .end annotation

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lh91/b;->m(I)Lh91/a;

    move-result-object v0

    new-instance v1, Lkb1/a;

    invoke-direct {v1, v0}, Lkb1/a;-><init>(Lh91/a;)V

    sget-object v0, Lkb1/i;->a:Lkb1/i;

    invoke-virtual {p1}, Lh91/b;->i()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkb1/i;->a(Ljava/util/Locale;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lkb1/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lh91/b;->h()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lg51/c;

    invoke-virtual {p1, p2}, Lh91/b;->c(I)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Lkb1/c;->c(Ljava/util/List;Lkb1/a;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v4, v0, p1, v2, v3}, Lg51/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v4
.end method
