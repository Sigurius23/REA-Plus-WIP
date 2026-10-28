.class final Lgc0/d$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc0/d;->s(Lgc0/b;Lgc0/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$performSave$response$1"
    f = "HormonalContextInteractor.kt"
    l = {
        0xe6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lgc0/d;

.field final synthetic y:Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;


# direct methods
.method public constructor <init>(Lgc0/d;Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc0/d;",
            "Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;",
            "Lq83/d<",
            "-",
            "Lgc0/d$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgc0/d$k;->x:Lgc0/d;

    iput-object p2, p0, Lgc0/d$k;->y:Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;

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

    new-instance v0, Lgc0/d$k;

    iget-object v1, p0, Lgc0/d$k;->x:Lgc0/d;

    iget-object v2, p0, Lgc0/d$k;->y:Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;

    invoke-direct {v0, v1, v2, p1}, Lgc0/d$k;-><init>(Lgc0/d;Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lgc0/d$k;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lgc0/d$k;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgc0/d$k;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lgc0/d$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgc0/d$k;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgc0/d$k;->x:Lgc0/d;

    invoke-static {p1}, Lgc0/d;->c(Lgc0/d;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    move-result-object p1

    iget-object v1, p0, Lgc0/d$k;->y:Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;

    iput v2, p0, Lgc0/d$k;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;->saveHormonalContext(Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
