.class public abstract Lza2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;",
        "Ll01/n;",
        "a",
        "(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;",
        "settings_release"
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
.method public static final a(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;
    .locals 25

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Llb1/z;->G(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->getSecondCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->getStyle()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-static {v0, v2}, Llb1/d4;->k(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lny0/h;

    move-result-object v2

    :cond_1
    move-object v12, v2

    const v23, 0x1ffbff

    const/16 v24, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v1 .. v24}, Ll01/n;->b(Ll01/n;Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;ILjava/lang/Object;)Ll01/n;

    move-result-object v0

    return-object v0
.end method
