.class final Lfp1/f$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfp1/f;->o(Lfp1/d;Lfp1/g;ZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor$performSave$response$1"
    f = "PostPartumInteractor.kt"
    l = {
        0x58,
        0x5a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

.field w:I

.field final synthetic x:Lfp1/d;

.field final synthetic y:Lfp1/f;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfp1/d;Lfp1/f;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp1/d;",
            "Lfp1/f;",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;",
            "Lq83/d<",
            "-",
            "Lfp1/f$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp1/f$g;->x:Lfp1/d;

    iput-object p2, p0, Lfp1/f$g;->y:Lfp1/f;

    iput-object p3, p0, Lfp1/f$g;->z:Ljava/lang/String;

    iput-object p4, p0, Lfp1/f$g;->E:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

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

    new-instance v0, Lfp1/f$g;

    iget-object v1, p0, Lfp1/f$g;->x:Lfp1/d;

    iget-object v2, p0, Lfp1/f$g;->y:Lfp1/f;

    iget-object v3, p0, Lfp1/f$g;->z:Ljava/lang/String;

    iget-object v4, p0, Lfp1/f$g;->E:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lfp1/f$g;-><init>(Lfp1/d;Lfp1/f;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lfp1/f$g;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lfp1/f$g;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfp1/f$g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lfp1/f$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfp1/f$g;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

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

    iget-object p1, p0, Lfp1/f$g;->x:Lfp1/d;

    invoke-virtual {p1}, Lfp1/d;->i()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object p1

    sget-object v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->ALL:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    if-ne p1, v1, :cond_4

    iget-object p1, p0, Lfp1/f$g;->y:Lfp1/f;

    invoke-static {p1}, Lfp1/f;->d(Lfp1/f;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    move-result-object p1

    iget-object v1, p0, Lfp1/f$g;->z:Ljava/lang/String;

    iget-object v2, p0, Lfp1/f$g;->E:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    iput v3, p0, Lfp1/f$g;->w:I

    invoke-interface {p1, v1, v2, p0}, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;->savePregnancy(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_4
    iget-object p1, p0, Lfp1/f$g;->y:Lfp1/f;

    invoke-static {p1}, Lfp1/f;->d(Lfp1/f;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    move-result-object p1

    iget-object v1, p0, Lfp1/f$g;->x:Lfp1/d;

    invoke-virtual {v1}, Lfp1/d;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lfp1/f$g;->E:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    iput v2, p0, Lfp1/f$g;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;->updatePregnancy(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    return-object p1
.end method
