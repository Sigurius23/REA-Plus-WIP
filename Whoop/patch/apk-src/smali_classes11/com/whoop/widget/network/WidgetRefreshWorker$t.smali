.class final Lcom/whoop/widget/network/WidgetRefreshWorker$t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/network/WidgetRefreshWorker;->G(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lf6/f;",
        "preferences",
        "<anonymous>",
        "(Lf6/f;)Lf6/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.widget.network.WidgetRefreshWorker$updateStressWidget$2$1"
    f = "WidgetRefreshWorker.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/widget/model/WidgetStressResponse;


# direct methods
.method public constructor <init>(Lcom/whoop/widget/model/WidgetStressResponse;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/model/WidgetStressResponse;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/network/WidgetRefreshWorker$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->y:Lcom/whoop/widget/model/WidgetStressResponse;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;

    iget-object v1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->y:Lcom/whoop/widget/model/WidgetStressResponse;

    invoke-direct {v0, v1, p2}, Lcom/whoop/widget/network/WidgetRefreshWorker$t;-><init>(Lcom/whoop/widget/model/WidgetStressResponse;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lf6/f;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lq83/d<",
            "-",
            "Lf6/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/widget/network/WidgetRefreshWorker$t;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->f(Lf6/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->x:Ljava/lang/Object;

    check-cast v0, Lf6/f;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf6/f;->c()Lf6/a;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$t;->y:Lcom/whoop/widget/model/WidgetStressResponse;

    const-string v1, "WIDGET_KEY_STRESS_SCORE"

    invoke-static {v1}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/widget/model/WidgetStressResponse;->getValueDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    const-string v1, "WIDGET_KEY_STRESS_STATE"

    invoke-static {v1}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/widget/model/WidgetStressResponse;->getState()Lcom/whoop/widget/model/WidgetStressState;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/widget/model/WidgetStressResponse;->getBucketDisplay()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WIDGET_KEY_STRESS_BUCKET"

    if-eqz v1, :cond_0

    invoke-static {v2}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/widget/model/WidgetStressResponse;->getBucketDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-static {v2}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/a;->f(Lf6/d;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
