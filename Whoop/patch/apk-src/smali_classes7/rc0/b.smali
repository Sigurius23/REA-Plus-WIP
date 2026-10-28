.class public abstract Lrc0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
        "Lc31/k;",
        "a",
        "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lc31/k;",
        "advanced-labs_release"
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
.method public static final a(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lc31/k;
    .locals 21

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Loc0/a;->Companion:Loc0/a$a;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;->getClickAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Loc0/a$a;->a(Ljava/lang/String;)Loc0/a;

    move-result-object v0

    sget-object v2, Loc0/a;->DISMISS:Loc0/a;

    if-eq v0, v2, :cond_1

    sget-object v2, Loc0/a;->UNKNOWN:Loc0/a;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    sget-object v2, Lc31/d;->FILLED:Lc31/d;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lkd1/j;->a:Lkd1/j;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;->getColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lkd1/j;->e(Ljava/lang/String;)Ly81/f;

    move-result-object v13

    if-eqz v0, :cond_2

    sget-object v1, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    :goto_2
    move-object v7, v1

    goto :goto_3

    :cond_2
    sget-object v1, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    goto :goto_2

    :goto_3
    if-eqz v0, :cond_3

    sget-object v0, Ly81/f;->BRAND_BLACK:Ly81/f;

    :goto_4
    move-object v15, v0

    goto :goto_5

    :cond_3
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_4

    :goto_5
    new-instance v1, Lc31/k;

    const v19, 0x1d7dc

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v20}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
