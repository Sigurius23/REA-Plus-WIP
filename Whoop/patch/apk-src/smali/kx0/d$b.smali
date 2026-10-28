.class public final Lkx0/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkx0/d;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$$inlined$flatMapLatest$1"
    f = "StrapSyncInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkx0/d;


# direct methods
.method public constructor <init>(Lq83/d;Lkx0/d;)V
    .locals 0

    iput-object p2, p0, Lkx0/d$b;->z:Lkx0/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lkx0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkx0/d$b;

    iget-object v1, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-direct {v0, p3, v1}, Lkx0/d$b;-><init>(Lq83/d;Lkx0/d;)V

    iput-object p1, v0, Lkx0/d$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkx0/d$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkx0/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkx0/d$b;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkx0/d$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkx0/d$b;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkx0/d$b;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lkx0/d$b;->y:Ljava/lang/Object;

    check-cast v1, Lkx0/b;

    invoke-interface {v1}, Lkx0/b;->a()Ldt0/c;

    move-result-object v3

    invoke-virtual {v3}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v3

    iget-object v4, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v4}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object v4

    invoke-interface {v1}, Lkx0/b;->a()Ldt0/c;

    move-result-object v5

    invoke-virtual {v5}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Receiving Strap sync action for job: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of v4, v1, Lkx0/b$a;

    const/4 v5, 0x2

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    iget-object v3, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v3}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object v3

    const-string v4, "Bypassing strap sync to upload"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v3, v4, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v3, Lkx0/e$a;

    check-cast v1, Lkx0/b$a;

    invoke-virtual {v1}, Lkx0/b$a;->a()Ldt0/c;

    move-result-object v1

    invoke-direct {v3, v1, v7, v5, v7}, Lkx0/e$a;-><init>(Ldt0/c;Lts0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, La6/u;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :cond_2
    iget-object v4, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v4}, Lkx0/d;->f(Lkx0/d;)Lci2/b;

    move-result-object v4

    invoke-interface {v4}, Lci2/b;->b()Lec3/t1;

    move-result-object v4

    invoke-interface {v4}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljk0/d;

    if-nez v4, :cond_3

    iget-object v3, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v3}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object v3

    const-string v4, "Sensor HPS: no connected strap available"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v3, v4, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v3, Lkx0/e$b;

    invoke-interface {v1}, Lkx0/b;->a()Ldt0/c;

    move-result-object v1

    invoke-direct {v3, v1, v7, v5, v7}, Lkx0/e$b;-><init>(Ldt0/c;Lts0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, La6/u;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_2

    :cond_3
    sget-object v5, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->Companion:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;

    invoke-virtual {v5, v3}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;->isProcessNow(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lsj2/a$c;->a:Lsj2/a$c;

    goto :goto_0

    :cond_4
    sget-object v3, Lsj2/a$b;->a:Lsj2/a$b;

    :goto_0
    iget-object v5, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v5}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object v5

    invoke-interface {v4}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_5
    move-object v8, v7

    :goto_1
    const-string v9, "Sensor HPS: submitting sync for "

    invoke-static {v9, v8}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v5, v8, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v5, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v5}, Lkx0/d;->d(Lkx0/d;)Lyh2/c;

    move-result-object v5

    invoke-interface {v5, v4, v3}, Lyh2/c;->a(Ljk0/d;Lsj2/a;)Lec3/f2;

    move-result-object v3

    new-instance v4, Lkx0/d$d;

    invoke-direct {v4, v3}, Lkx0/d$d;-><init>(Lec3/l;)V

    new-instance v3, Lkx0/d$e;

    iget-object v5, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-direct {v3, v4, v5, v1}, Lkx0/d$e;-><init>(Lec3/l;Lkx0/d;Lkx0/b;)V

    iget-object v4, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-static {v4}, Lkx0/d;->e(Lkx0/d;)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lec3/v;->O(Lec3/l;J)La6/u;

    move-result-object v3

    new-instance v4, Lkx0/d$c;

    iget-object v5, p0, Lkx0/d$b;->z:Lkx0/d;

    invoke-direct {v4, v5, v1, v7}, Lkx0/d$c;-><init>(Lkx0/d;Lkx0/b;Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v3, v4}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    :goto_2
    iput-object v7, p0, Lkx0/d$b;->x:Ljava/lang/Object;

    iput-object v7, p0, Lkx0/d$b;->y:Ljava/lang/Object;

    iput v2, p0, Lkx0/d$b;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
