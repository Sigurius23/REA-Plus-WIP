.class public abstract Lf70/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/navigation/e;",
        "",
        "a",
        "(Lcom/whoop/navigation/e;)Ljava/lang/String;",
        "Lf70/t$a;",
        "Ln70/d$a;",
        "b",
        "(Lf70/t$a;)Ln70/d$a;",
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
.method public static final a(Lcom/whoop/navigation/e;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;->getSource()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final b(Lf70/t$a;)Ln70/d$a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf70/t$a;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v0

    invoke-virtual {p0}, Lf70/t$a;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "source"

    invoke-static {v1, p0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lm83/z;->w:Lm83/z;

    :cond_1
    new-instance v1, Ln70/d$a;

    invoke-direct {v1, v0, p0}, Ln70/d$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)V

    return-object v1
.end method
