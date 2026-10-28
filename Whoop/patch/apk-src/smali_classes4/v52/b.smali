.class public final Lv52/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lv52/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/recommendationtile/domain/c;",
        "state",
        "Lh31/m;",
        "a",
        "(Lcom/whoop/recommendationtile/domain/c;)Lh31/m;",
        "recommendation-tile-arch-mini_release"
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
.method public final a(Lcom/whoop/recommendationtile/domain/c;)Lh31/m;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->e()Lh31/g;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lh31/f;->LOADING:Lh31/f;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->k()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    move-result-object v0

    invoke-static {v0}, Lpc1/d;->b(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/f;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lh31/g;->b(Lh31/g;Lcom/whoop/design/util/TextResource;Lh31/f;Lh31/c;Lgz0/m0;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lh31/g;

    move-result-object v0

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    new-instance v0, Lh31/m;

    new-instance v1, Lh31/q;

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->k()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    move-result-object v3

    invoke-static {v3}, Lpc1/d;->e(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/n;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->h()Lm91/u;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->d()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->m()Z

    move-result v7

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->n()Z

    move-result v8

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->c()Lh31/b;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Lh31/q;-><init>(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZZLh31/b;)V

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->j()Z

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->f()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lh31/m;-><init>(Lh31/q;ZLcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v0
.end method
