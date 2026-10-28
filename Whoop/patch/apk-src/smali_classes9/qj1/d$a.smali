.class final Lqj1/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj1/d;->g(Ljava/util/List;Ljava/util/List;ZZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lm7/b0;",
        "recordsChunk",
        "",
        "deletionsChunk",
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ljava/util/List;Ljava/util/List;)Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectHeightManager$handleRecords$2"
    f = "HealthConnectHeightManager.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Z

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqj1/d;


# direct methods
.method public constructor <init>(Lqj1/d;ZZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj1/d;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lqj1/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj1/d$a;->z:Lqj1/d;

    iput-boolean p2, p0, Lqj1/d$a;->E:Z

    iput-boolean p3, p0, Lqj1/d$a;->F:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm7/b0;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqj1/d$a;

    iget-object v1, p0, Lqj1/d$a;->z:Lqj1/d;

    iget-boolean v2, p0, Lqj1/d$a;->E:Z

    iget-boolean v3, p0, Lqj1/d$a;->F:Z

    invoke-direct {v0, v1, v2, v3, p3}, Lqj1/d$a;-><init>(Lqj1/d;ZZLq83/d;)V

    iput-object p1, v0, Lqj1/d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqj1/d$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqj1/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqj1/d$a;->f(Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lqj1/d$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lqj1/d$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lqj1/d$a;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqj1/d$a;->z:Lqj1/d;

    invoke-static {p1}, Lqj1/d;->k(Lqj1/d;)Lcom/whoop/healthconnect/domain/HealthConnectApi;

    move-result-object p1

    check-cast v0, Ljava/lang/Iterable;

    iget-object v3, p0, Lqj1/d$a;->z:Lqj1/d;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm7/b0;

    invoke-static {v3}, Lqj1/d;->l(Lqj1/d;)Lrj1/a;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModelKt;->toModel(Lm7/b0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    check-cast v1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v6, Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;

    const-string v7, "HeightRecords"

    invoke-direct {v6, v3, v7}, Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-boolean v1, p0, Lqj1/d$a;->E:Z

    iget-boolean v3, p0, Lqj1/d$a;->F:Z

    new-instance v6, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;

    invoke-direct {v6, v5, v0, v1, v3}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;-><init>(Ljava/util/List;Ljava/util/List;ZZ)V

    const/4 v0, 0x0

    iput-object v0, p0, Lqj1/d$a;->x:Ljava/lang/Object;

    iput-object v0, p0, Lqj1/d$a;->y:Ljava/lang/Object;

    iput v4, p0, Lqj1/d$a;->w:I

    invoke-interface {p1, v6, p0}, Lcom/whoop/healthconnect/domain/HealthConnectApi;->sendBodyMeasurementRecords(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    return-object v2

    :cond_4
    return-object p1
.end method
