.class public abstract Ls70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u000f\u0010\u0008\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lu02/a$b;",
        "",
        "",
        "a",
        "(Lu02/a$b;)Z",
        "Lf70/e$b;",
        "b",
        "()Lf70/e$b;",
        "c",
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
.method public static final a(Lu02/a$b;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a$b<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lu02/a$b$a;

    if-eqz v0, :cond_0

    check-cast p0, Lu02/a$b$a;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lu02/a$b$a;->d()I

    move-result p0

    const/16 v1, 0x190

    if-ne p0, v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method public static final b()Lf70/e$b;
    .locals 20

    new-instance v0, Lf70/e$b;

    new-instance v1, Ln70/e;

    new-instance v6, Ln70/d$a;

    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->MEMBERSHIP_SERVICES:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v6, v2, v3, v4, v3}, Ln70/d$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v18, 0x1fffd

    const/16 v19, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v19}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final c()Lf70/e$b;
    .locals 20

    new-instance v0, Lf70/e$b;

    new-instance v1, Ln70/e;

    sget-object v5, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_CREATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v6, Ln70/d$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v6, v5, v2, v3, v2}, Ln70/d$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v18, 0x1fffd

    const/16 v19, 0x0

    move-object v2, v1

    const/4 v1, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v19}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
