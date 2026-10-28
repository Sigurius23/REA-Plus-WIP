.class public final Lj70/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lj70/c;",
        "",
        "Lh80/c;",
        "analyticsHelper",
        "Lb80/c;",
        "iajfAnalyticsHelper",
        "<init>",
        "(Lh80/c;Lb80/c;)V",
        "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
        "currentScreen",
        "Lf70/e$b;",
        "prevDomainResult",
        "",
        "isSkipAction",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Z)V",
        "result",
        "b",
        "(Lf70/e$b;)V",
        "Lh80/c;",
        "Lb80/c;",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lh80/c;

.field private final b:Lb80/c;


# direct methods
.method public constructor <init>(Lh80/c;Lb80/c;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iajfAnalyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj70/c;->a:Lh80/c;

    iput-object p2, p0, Lj70/c;->b:Lb80/c;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Z)V
    .locals 10

    const-string v0, "prevDomainResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v0, p0, Lj70/c;->a:Lh80/c;

    new-instance v1, Lh80/b$i;

    instance-of v3, p1, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;

    if-eqz v3, :cond_0

    if-nez p3, :cond_0

    const-string v3, "share_your_code"

    :goto_0
    move-object v4, v3

    goto :goto_1

    :cond_0
    const-string v3, "cta"

    goto :goto_0

    :goto_1
    instance-of v3, p1, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;

    if-nez v3, :cond_3

    instance-of v3, p1, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    if-nez v3, :cond_3

    instance-of v3, p1, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;

    if-eqz v3, :cond_1

    goto :goto_3

    :cond_1
    if-eqz p3, :cond_2

    const-string v3, "skip"

    :goto_2
    move-object v5, v3

    goto :goto_4

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    :goto_3
    const-string v3, "next"

    goto :goto_2

    :goto_4
    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lh80/c;->p(Lh80/b;)V

    :cond_4
    iget-object v0, p0, Lj70/c;->b:Lb80/c;

    invoke-virtual {p2}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v1

    invoke-virtual {p2}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2, p3}, Lb80/c;->p(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Z)V

    return-void
.end method

.method public final b(Lf70/e$b;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v0

    invoke-static {v0}, Lc80/a;->a(Lcom/whoop/activation/iajf/domain/SignUpSource;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj70/c;->b:Lb80/c;

    invoke-virtual {p1}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lb80/c;->r(Lf70/e;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    :cond_0
    return-void
.end method
