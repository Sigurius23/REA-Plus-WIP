.class final Lui0/n$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/n;->n(Lqi0/d;Lqi0/a;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Ljava/lang/String;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$10$1"
    f = "GenericScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lqi0/a;

.field final synthetic y:Lqi0/d;

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqi0/a;Lqi0/d;Lp1/t2;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqi0/a;",
            "Lqi0/d;",
            "Lp1/t2;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lui0/n$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lui0/n$c;->x:Lqi0/a;

    iput-object p2, p0, Lui0/n$c;->y:Lqi0/d;

    iput-object p3, p0, Lui0/n$c;->z:Lp1/t2;

    iput-object p4, p0, Lui0/n$c;->E:Ll83/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lui0/n$c;

    iget-object v1, p0, Lui0/n$c;->x:Lqi0/a;

    iget-object v2, p0, Lui0/n$c;->y:Lqi0/d;

    iget-object v3, p0, Lui0/n$c;->z:Lp1/t2;

    iget-object v4, p0, Lui0/n$c;->E:Ll83/h;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lui0/n$c;-><init>(Lqi0/a;Lqi0/d;Lp1/t2;Ll83/h;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lui0/n$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui0/n$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui0/n$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui0/n$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lui0/n$c;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lui0/n$c;->z:Lp1/t2;

    invoke-static {p1}, Lui0/n;->J(Lp1/t2;)Lri0/e;

    move-result-object p1

    invoke-virtual {p1}, Lri0/e;->i()Lcom/whoop/design/models/modal/ModalLifecycleInteraction;

    move-result-object p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/ModalLifecycleInteraction;->getOnStart()Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lui0/n$c;->E:Ll83/h;

    invoke-static {p1}, Lui0/n;->I(Ll83/h;)Lri0/c;

    move-result-object v2

    iget-object v3, p0, Lui0/n$c;->x:Lqi0/a;

    iget-object v4, p0, Lui0/n$c;->y:Lqi0/d;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const-string v5, "modal on_start"

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lui0/n;->M(Lcom/whoop/design/models/modal/DecodedGenericInteraction;Lri0/c;Lqi0/a;Lqi0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
