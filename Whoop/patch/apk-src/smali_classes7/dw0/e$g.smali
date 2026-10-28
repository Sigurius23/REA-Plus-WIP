.class final Ldw0/e$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldw0/e;->i(Ljava/lang/String;Lhw0/a;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldw0/e$g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/core/details/network/model/CoreDetailsModelState;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$fetchActivityDetails$response$1"
    f = "CoreDetailsNetworkMapper.kt"
    l = {
        0x6b,
        0x6e,
        0x70,
        0x73
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lhw0/a;

.field final synthetic y:Ldw0/e;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lhw0/a;Ldw0/e;Ljava/lang/String;Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhw0/a;",
            "Ldw0/e;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/g0;",
            "Lq83/d<",
            "-",
            "Ldw0/e$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldw0/e$g;->x:Lhw0/a;

    iput-object p2, p0, Ldw0/e$g;->y:Ldw0/e;

    iput-object p3, p0, Ldw0/e$g;->z:Ljava/lang/String;

    iput-object p4, p0, Ldw0/e$g;->E:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Ldw0/e$g;

    iget-object v1, p0, Ldw0/e$g;->x:Lhw0/a;

    iget-object v2, p0, Ldw0/e$g;->y:Ldw0/e;

    iget-object v3, p0, Ldw0/e$g;->z:Ljava/lang/String;

    iget-object v4, p0, Ldw0/e$g;->E:Lkotlin/jvm/internal/g0;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ldw0/e$g;-><init>(Lhw0/a;Ldw0/e;Ljava/lang/String;Lkotlin/jvm/internal/g0;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ldw0/e$g;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/core/details/network/model/CoreDetailsModelState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Ldw0/e$g;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldw0/e$g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ldw0/e$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldw0/e$g;->w:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldw0/e$g;->x:Lhw0/a;

    sget-object v1, Ldw0/e$g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v5, :cond_a

    if-ne p1, v4, :cond_9

    iget-object p1, p0, Ldw0/e$g;->y:Ldw0/e;

    invoke-static {p1}, Ldw0/e;->c(Ldw0/e;)Lcom/whoop/core/details/network/api/CoreDetailsApi;

    move-result-object p1

    iget-object v1, p0, Ldw0/e$g;->z:Ljava/lang/String;

    iput v4, p0, Ldw0/e$g;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/core/details/network/api/CoreDetailsApi;->getActivityScore(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    check-cast p1, Lcom/whoop/core/details/network/model/ActivityScoreTypeResponse;

    invoke-virtual {p1}, Lcom/whoop/core/details/network/model/ActivityScoreTypeResponse;->getScoreType()Ljava/lang/String;

    move-result-object p1

    const-string v1, "CARDIO"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Ldw0/e$g;->E:Lkotlin/jvm/internal/g0;

    sget-object v1, Lhw0/a;->CARDIO:Lhw0/a;

    iput-object v1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Ldw0/e$g;->y:Ldw0/e;

    invoke-static {p1}, Ldw0/e;->c(Ldw0/e;)Lcom/whoop/core/details/network/api/CoreDetailsApi;

    move-result-object p1

    iget-object v1, p0, Ldw0/e$g;->z:Ljava/lang/String;

    iput v3, p0, Ldw0/e$g;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/core/details/network/api/CoreDetailsApi;->fetchCardioDetailsComponents(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    new-instance v0, Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;-><init>(Lcom/whoop/core/details/network/model/CoreDetailsModel;)V

    return-object v0

    :cond_7
    iget-object p1, p0, Ldw0/e$g;->E:Lkotlin/jvm/internal/g0;

    sget-object v1, Lhw0/a;->RECOVERY:Lhw0/a;

    iput-object v1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Ldw0/e$g;->y:Ldw0/e;

    invoke-static {p1}, Ldw0/e;->c(Ldw0/e;)Lcom/whoop/core/details/network/api/CoreDetailsApi;

    move-result-object p1

    iget-object v1, p0, Ldw0/e$g;->z:Ljava/lang/String;

    iput v2, p0, Ldw0/e$g;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/core/details/network/api/CoreDetailsApi;->fetchRecoveryDetailsComponents(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    check-cast p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    new-instance v0, Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;-><init>(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)V

    return-object v0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Ldw0/e$g;->x:Lhw0/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FetchActivityDetails network mapping not supported for "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    iget-object p1, p0, Ldw0/e$g;->y:Ldw0/e;

    invoke-static {p1}, Ldw0/e;->c(Ldw0/e;)Lcom/whoop/core/details/network/api/CoreDetailsApi;

    move-result-object p1

    iget-object v1, p0, Ldw0/e$g;->z:Ljava/lang/String;

    iput v5, p0, Ldw0/e$g;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/core/details/network/api/CoreDetailsApi;->fetchCardioDetailsComponents(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_3
    return-object v0

    :cond_b
    :goto_4
    check-cast p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    new-instance v0, Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;-><init>(Lcom/whoop/core/details/network/model/CoreDetailsModel;)V

    return-object v0
.end method
