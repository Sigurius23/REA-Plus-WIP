.class final Liy2/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liy2/c;->n(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Liy2/c$a;",
        "internalState",
        "Liy2/c$b;",
        "action",
        "<anonymous>",
        "(Liy2/c$a;Liy2/c$b;)Liy2/c$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor$interact$2"
    f = "CampaignScreeningInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Liy2/c;


# direct methods
.method public constructor <init>(Liy2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liy2/c;",
            "Lq83/d<",
            "-",
            "Liy2/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liy2/c$f;->z:Liy2/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Liy2/c$a;Liy2/c$b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liy2/c$a;",
            "Liy2/c$b;",
            "Lq83/d<",
            "-",
            "Liy2/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Liy2/c$f;

    iget-object v1, p0, Liy2/c$f;->z:Liy2/c;

    invoke-direct {v0, v1, p3}, Liy2/c$f;-><init>(Liy2/c;Lq83/d;)V

    iput-object p1, v0, Liy2/c$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Liy2/c$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Liy2/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Liy2/c$a;

    check-cast p2, Liy2/c$b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Liy2/c$f;->f(Liy2/c$a;Liy2/c$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Liy2/c$f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liy2/c$a;

    iget-object v0, p0, Liy2/c$f;->y:Ljava/lang/Object;

    check-cast v0, Liy2/c$b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liy2/c$f;->w:I

    if-nez v2, :cond_b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Liy2/c$b$d;->a:Liy2/c$b$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v2, Liy2/b$d;->a:Liy2/b$d;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Liy2/c$b$c;

    if-eqz p1, :cond_1

    new-instance v2, Liy2/b$b;

    check-cast v0, Liy2/c$b$c;

    invoke-virtual {v0}, Liy2/c$b$c;->a()I

    move-result p1

    invoke-virtual {v0}, Liy2/c$b$c;->b()Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Liy2/b$b;-><init>(ILjava/lang/Integer;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Liy2/c$b$h;

    if-eqz p1, :cond_2

    new-instance v2, Liy2/b$f;

    check-cast v0, Liy2/c$b$h;

    invoke-virtual {v0}, Liy2/c$b$h;->a()I

    move-result p1

    invoke-virtual {v0}, Liy2/c$b$h;->b()Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Liy2/b$f;-><init>(ILjava/lang/Integer;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Liy2/c$b$a;

    if-eqz p1, :cond_3

    check-cast v0, Liy2/c$b$a;

    invoke-virtual {v0}, Liy2/c$b$a;->b()Lvy2/b;

    move-result-object p1

    invoke-virtual {p1}, Lvy2/b;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lvy2/e;

    invoke-virtual {v0}, Liy2/c$b$a;->a()I

    move-result p1

    invoke-virtual {v0}, Liy2/c$b$a;->b()Lvy2/b;

    move-result-object v2

    invoke-virtual {v2}, Lvy2/b;->c()I

    move-result v9

    invoke-virtual {v0}, Liy2/c$b$a;->b()Lvy2/b;

    move-result-object v2

    invoke-virtual {v2}, Lvy2/b;->b()Ljava/util/List;

    move-result-object v10

    iget-object v2, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v1}, Liy2/c$a;->i()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3}, Lvy2/e;->b()I

    move-result v5

    invoke-static {v2, v4, v5}, Liy2/c;->a(Liy2/c;Ljava/util/Map;I)Ljava/util/Map;

    move-result-object v11

    iget-object v2, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v0}, Liy2/c$b$a;->a()I

    move-result v4

    invoke-virtual {v0}, Liy2/c$b$a;->b()Lvy2/b;

    move-result-object v5

    invoke-virtual {v5}, Lvy2/b;->c()I

    move-result v5

    move v6, v5

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v6}, Ljava/lang/Integer;-><init>(I)V

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Liy2/c;->m(Liy2/c;Lvy2/e;ILjava/lang/Integer;Ljava/util/Set;ILjava/lang/Object;)Liy2/b;

    move-result-object v2

    invoke-virtual {v0}, Liy2/c$b$a;->b()Lvy2/b;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/b;->a()Lvy2/c;

    move-result-object v7

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, p1}, Ljava/lang/Integer;-><init>(I)V

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v9}, Ljava/lang/Integer;-><init>(I)V

    const/16 v9, 0x40

    move-object v5, v10

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, v11

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Liy2/c$b$e;->a:Liy2/c$b$e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Liy2/c$a;->e()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1}, Liy2/c$a;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_4

    new-instance v2, Liy2/b$i;

    invoke-virtual {v1}, Liy2/c$a;->d()Lvy2/c;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v2, p1}, Liy2/b$i;-><init>(Lvy2/c;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {v1}, Liy2/c$a;->h()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1}, Liy2/c$a;->e()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvy2/e;

    iget-object v0, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v1}, Liy2/c$a;->i()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lvy2/e;->b()I

    move-result v3

    invoke-static {v0, v2, v3}, Liy2/c;->a(Liy2/c;Ljava/util/Map;I)Ljava/util/Map;

    move-result-object v6

    iget-object v0, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {p1}, Lvy2/e;->b()I

    move-result v2

    invoke-static {v0, v6, v2}, Liy2/c;->b(Liy2/c;Ljava/util/Map;I)Ljava/util/Set;

    move-result-object v0

    iget-object v2, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v1}, Liy2/c$a;->c()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Liy2/c$a;->j()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, p1, v3, v4, v0}, Liy2/c;->c(Liy2/c;Lvy2/e;ILjava/lang/Integer;Ljava/util/Set;)Liy2/b;

    move-result-object v2

    invoke-virtual {v1}, Liy2/c$a;->e()I

    move-result p1

    add-int/lit8 v8, p1, 0x1

    const/16 v9, 0x2e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Liy2/c$b$j;->a:Liy2/c$b$j;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    sget-object p1, Liy2/c$b$g;->a:Liy2/c$b$g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto/16 :goto_0

    :cond_6
    instance-of p1, v0, Liy2/c$b$i;

    if-eqz p1, :cond_7

    new-instance v2, Liy2/b$g;

    invoke-virtual {v1}, Liy2/c$a;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Liy2/c$a;->j()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    check-cast v0, Liy2/c$b$i;

    invoke-virtual {v0}, Liy2/c$b$i;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;->getIcon()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Liy2/c$b$i;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;->getIconColor()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Liy2/c$b$i;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;->getContent()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Liy2/c$b$i;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;->getCta()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Liy2/c$b$i;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;->getBackgroundUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Liy2/c$b$i;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-direct/range {v2 .. v10}, Liy2/b$g;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v0, Liy2/c$b$f;

    if-eqz p1, :cond_8

    iget-object p1, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v1}, Liy2/c$a;->i()Ljava/util/Map;

    move-result-object v2

    check-cast v0, Liy2/c$b$f;

    invoke-virtual {v0}, Liy2/c$b$f;->b()I

    move-result v3

    invoke-virtual {v0}, Liy2/c$b$f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {p1, v2, v3, v4}, Liy2/c;->i(Liy2/c;Ljava/util/Map;ILjava/util/List;)Ljava/util/Map;

    move-result-object v6

    new-instance v2, Liy2/b$e;

    invoke-virtual {v1}, Liy2/c$a;->f()Lvy2/e;

    move-result-object p1

    invoke-virtual {v0}, Liy2/c$b$f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Liy2/b$e;-><init>(Lvy2/e;Ljava/lang/String;)V

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v0, Liy2/c$b$b;

    if-eqz p1, :cond_9

    iget-object p1, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v1}, Liy2/c$a;->i()Ljava/util/Map;

    move-result-object v2

    check-cast v0, Liy2/c$b$b;

    invoke-virtual {v0}, Liy2/c$b$b;->b()I

    move-result v3

    invoke-virtual {v0}, Liy2/c$b$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Liy2/c$b$b;->c()Z

    move-result v5

    invoke-static {p1, v2, v3, v4, v5}, Liy2/c;->h(Liy2/c;Ljava/util/Map;ILjava/lang/String;Z)Ljava/util/Map;

    move-result-object v6

    iget-object p1, p0, Liy2/c$f;->z:Liy2/c;

    invoke-virtual {v0}, Liy2/c$b$b;->b()I

    move-result v0

    invoke-static {p1, v6, v0}, Liy2/c;->b(Liy2/c;Ljava/util/Map;I)Ljava/util/Set;

    move-result-object p1

    new-instance v2, Liy2/b$a;

    invoke-virtual {v1}, Liy2/c$a;->f()Lvy2/e;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Liy2/b$a;-><init>(Lvy2/e;Ljava/util/Set;)V

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_0
    new-instance v2, Liy2/b$i;

    invoke-virtual {v1}, Liy2/c$a;->d()Lvy2/c;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v2, p1}, Liy2/b$i;-><init>(Lvy2/c;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Liy2/c$a;->b(Liy2/c$a;Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;IILjava/lang/Object;)Liy2/c$a;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
