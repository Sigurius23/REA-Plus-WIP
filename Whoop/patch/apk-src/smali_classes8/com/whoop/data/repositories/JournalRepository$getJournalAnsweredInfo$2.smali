.class final Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/JournalRepository;->getJournalAnsweredInfo(JLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.JournalRepository$getJournalAnsweredInfo$2"
    f = "JournalRepository.kt"
    l = {
        0x99
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $cycleId:J

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/JournalRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/JournalRepository;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/JournalRepository;",
            "J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    iput-wide p2, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->$cycleId:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    iget-wide v1, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->$cycleId:J

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;JLq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/JournalRepository;->access$getJournalDao$p(Lcom/whoop/data/repositories/JournalRepository;)Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    move-result-object p1

    iget-wide v3, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->$cycleId:J

    iput v2, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->label:I

    invoke-interface {p1, v3, v4, p0}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao;->getJournalAnswer(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_1
    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/JournalRepository;->access$getLog$p(Lcom/whoop/data/repositories/JournalRepository;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "failed to get journal answer from db"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method
