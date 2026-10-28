.class public abstract Lp31/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "showAddToJournal",
        "includeStartActivityRevamp",
        "",
        "Lp31/b;",
        "a",
        "(ZZ)Ljava/util/List;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(ZZ)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Ljava/util/List<",
            "Lp31/b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    new-instance v1, Lp31/b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->o()I

    move-result v2

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lgy0/f;->w0:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v3, v4, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lkd1/l;->START_ACTIVITY:Lkd1/l;

    invoke-direct {v1, v2, v3, v4}, Lp31/b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/l;)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    new-instance v1, Lp31/b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->a()I

    move-result v2

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lgy0/f;->s0:I

    invoke-direct {v3, v4, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lkd1/l;->ADD_ACTIVITY:Lkd1/l;

    invoke-direct {v1, v2, v3, v4}, Lp31/b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/l;)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    new-instance v1, Lp31/b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c;->f()I

    move-result v2

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lgy0/f;->x0:I

    invoke-direct {v3, v4, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lkd1/l;->STRENGTH_BUILDER:Lkd1/l;

    invoke-direct {v1, v2, v3, v4}, Lp31/b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/l;)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p0, :cond_0

    new-instance p0, Lp31/b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->k()I

    move-result v1

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lgy0/f;->t0:I

    invoke-direct {v2, v3, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lkd1/l;->JOURNAL:Lkd1/l;

    invoke-direct {p0, v1, v2, v3}, Lp31/b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/l;)V

    invoke-virtual {v0, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance p0, Lp31/b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/w;->f()I

    move-result v1

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lgy0/f;->u0:I

    invoke-direct {v2, v3, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lkd1/l;->WHOOP_LIVE:Lkd1/l;

    invoke-direct {p0, v1, v2, v3}, Lp31/b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/l;)V

    invoke-virtual {v0, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_1

    new-instance p0, Lp31/b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/a;->o()I

    move-result p1

    const-string v1, "START ACTIVITY REVAMP"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Lkd1/l;->START_ACTIVITY_REVAMP:Lkd1/l;

    invoke-direct {p0, p1, v1, v2}, Lp31/b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/l;)V

    invoke-virtual {v0, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZZILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lp31/e;->a(ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
