.class public final Lrg2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lrg2/r;",
        "",
        "<init>",
        "()V",
        "Lpg2/c;",
        "domain",
        "Lrg2/s;",
        "a",
        "(Lpg2/c;)Lrg2/s;",
        "start-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpg2/c;)Lrg2/s;
    .locals 5

    const-string v0, "domain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpg2/c;->d()Ljava/util/List;

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

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lpg2/c;->g()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lpg2/c;->c()Ljava/util/Map;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lrg2/l;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/j;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrg2/j;

    invoke-virtual {p1}, Lpg2/c;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lrg2/k;->a(Lrg2/j;Ljava/lang/String;)Lrg2/h;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lpg2/c;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpg2/c;->c()Ljava/util/Map;

    move-result-object p1

    invoke-static {v2, v1, p1}, Lrg2/a;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/u;

    move-result-object p1

    new-instance v1, Lrg2/s;

    invoke-virtual {p1}, Lrg2/u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lrg2/u;->b()Z

    move-result p1

    invoke-direct {v1, v0, v2, p1}, Lrg2/s;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    return-object v1
.end method
