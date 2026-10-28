.class public abstract Lb80/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lf70/e$b;",
        "",
        "d",
        "(Lf70/e$b;)Z",
        "",
        "c",
        "(Lf70/e$b;)Ljava/lang/String;",
        "currentScreenAnalyticsName",
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
.method public static final synthetic a(Lf70/e$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lb80/d;->c(Lf70/e$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lf70/e$b;)Z
    .locals 0

    invoke-static {p0}, Lb80/d;->d(Lf70/e$b;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lf70/e$b;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf70/e$b;->l()Ln70/e;

    move-result-object p0

    invoke-virtual {p0}, Ln70/e;->d()I

    move-result p0

    invoke-static {p0, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d(Lf70/e$b;)Z
    .locals 2

    invoke-virtual {p0}, Lf70/e$b;->f()Lf70/b0;

    move-result-object v0

    sget-object v1, Lf70/b0;->CONTENT:Lf70/b0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lf70/e$b;->l()Ln70/e;

    move-result-object p0

    invoke-virtual {p0}, Ln70/e;->g()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
