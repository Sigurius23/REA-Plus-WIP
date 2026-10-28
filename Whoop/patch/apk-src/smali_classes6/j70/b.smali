.class public abstract Lj70/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lf70/e$b;",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "signUpSource",
        "b",
        "(Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;",
        "activation_release"
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
.method public static final synthetic a(Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;
    .locals 0

    invoke-static {p0, p1}, Lj70/b;->b(Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;
    .locals 21

    invoke-virtual/range {p0 .. p0}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v0

    move-object/from16 v15, p1

    if-ne v0, v15, :cond_0

    return-object p0

    :cond_0
    const v19, 0x1dfff

    const/16 v20, 0x0

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

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v20}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    return-object v0
.end method
