.class final Lkj2/n$f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/n$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressSessionInteractor$refresh$2$1"
    f = "StressSessionInteractor.kt"
    l = {
        0x7e,
        0x80
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lkj2/n;

.field final synthetic z:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkj2/n;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/n;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lkj2/n$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/n$f$a;->y:Lkj2/n;

    iput-object p2, p0, Lkj2/n$f$a;->z:Lec3/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkj2/n$f$a;

    iget-object v1, p0, Lkj2/n$f$a;->y:Lkj2/n;

    iget-object v2, p0, Lkj2/n$f$a;->z:Lec3/m;

    invoke-direct {v0, v1, v2, p1}, Lkj2/n$f$a;-><init>(Lkj2/n;Lec3/m;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lkj2/n$f$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lkj2/n$f$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/n$f$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lkj2/n$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/n$f$a;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkj2/n$f$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stress/domain/model/StressSession;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj2/n$f$a;->y:Lkj2/n;

    invoke-static {p1}, Lkj2/n;->c(Lkj2/n;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object p1

    iget-object v1, p0, Lkj2/n$f$a;->y:Lkj2/n;

    invoke-static {v1}, Lkj2/n;->f(Lkj2/n;)Ljava/lang/String;

    move-result-object v1

    iput v3, p0, Lkj2/n$f$a;->x:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/stress/domain/StressMonitorApi;->getStressInterventionFullRelease(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/stress/domain/model/StressSession;

    iget-object v1, p0, Lkj2/n$f$a;->z:Lec3/m;

    new-instance v3, Lnj2/r$d;

    invoke-direct {v3, p1}, Lnj2/r$d;-><init>(Lcom/whoop/stress/domain/model/StressSession;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lkj2/n$f$a;->w:Ljava/lang/Object;

    iput v2, p0, Lkj2/n$f$a;->x:I

    invoke-interface {v1, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
