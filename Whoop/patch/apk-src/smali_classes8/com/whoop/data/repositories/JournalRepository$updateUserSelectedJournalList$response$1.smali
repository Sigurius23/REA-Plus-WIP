.class final Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/JournalRepository;->updateUserSelectedJournalList(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.data.repositories.JournalRepository$updateUserSelectedJournalList$response$1"
    f = "JournalRepository.kt"
    l = {
        0x6b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $listOfSelectedJournals:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/JournalRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/JournalRepository;Ljava/util/ArrayList;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/JournalRepository;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->$listOfSelectedJournals:Ljava/util/ArrayList;

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

    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;

    iget-object v1, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->$listOfSelectedJournals:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2, p1}, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Ljava/util/ArrayList;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->this$0:Lcom/whoop/data/repositories/JournalRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/JournalRepository;->access$getJournalApi$p(Lcom/whoop/data/repositories/JournalRepository;)Lcom/whoop/service/network/JournalApi;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->$listOfSelectedJournals:Ljava/util/ArrayList;

    iput v2, p0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;->label:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/service/network/JournalApi;->updateUserSelectedJournalBehaviors(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
