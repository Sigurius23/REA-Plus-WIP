.class final Lyl0/h$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryResponse;",
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
    c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$2$result$1"
    f = "JournalEntryWidgetInteractor.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lyl0/h;

.field final synthetic y:Lyl0/g;


# direct methods
.method public constructor <init>(Lyl0/h;Lyl0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/h;",
            "Lyl0/g;",
            "Lq83/d<",
            "-",
            "Lyl0/h$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyl0/h$c$a;->x:Lyl0/h;

    iput-object p2, p0, Lyl0/h$c$a;->y:Lyl0/g;

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

    new-instance v0, Lyl0/h$c$a;

    iget-object v1, p0, Lyl0/h$c$a;->x:Lyl0/h;

    iget-object v2, p0, Lyl0/h$c$a;->y:Lyl0/g;

    invoke-direct {v0, v1, v2, p1}, Lyl0/h$c$a;-><init>(Lyl0/h;Lyl0/g;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lyl0/h$c$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lyl0/h$c$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyl0/h$c$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lyl0/h$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyl0/h$c$a;->w:I

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

    iget-object p1, p0, Lyl0/h$c$a;->x:Lyl0/h;

    invoke-static {p1}, Lyl0/h;->c(Lyl0/h;)Lcom/whoop/bot/api/CommitJournalEntryApi;

    move-result-object p1

    iget-object v1, p0, Lyl0/h$c$a;->y:Lyl0/g;

    invoke-virtual {v1}, Lyl0/g;->e()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lyl0/h$c$a;->y:Lyl0/g;

    invoke-virtual {v3}, Lyl0/g;->c()Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, p0, Lyl0/h$c$a;->y:Lyl0/g;

    invoke-virtual {v4}, Lyl0/g;->j()Ljava/lang/Double;

    move-result-object v4

    iget-object v5, p0, Lyl0/h$c$a;->y:Lyl0/g;

    invoke-virtual {v5}, Lyl0/g;->k()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-virtual {v5}, Ljava/time/Instant;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    new-instance v6, Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;

    invoke-direct {v6, v3, v4, v5}, Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)V

    iput v2, p0, Lyl0/h$c$a;->w:I

    invoke-interface {p1, v1, v6, p0}, Lcom/whoop/bot/api/CommitJournalEntryApi;->commit(Ljava/lang/String;Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
