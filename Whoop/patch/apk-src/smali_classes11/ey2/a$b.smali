.class final Ley2/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ley2/a;->a(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ley2/c;",
        "accumulator",
        "Ldy2/b;",
        "currentDomainState",
        "<anonymous>",
        "(Ley2/c;Ldy2/b;)Ley2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignschedule.reducer.CampaignScheduleViewStateReducer$reduce$1"
    f = "CampaignScheduleViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ley2/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ley2/c;Ldy2/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ley2/c;",
            "Ldy2/b;",
            "Lq83/d<",
            "-",
            "Ley2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ley2/a$b;

    invoke-direct {v0, p3}, Ley2/a$b;-><init>(Lq83/d;)V

    iput-object p1, v0, Ley2/a$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Ley2/a$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ley2/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ley2/c;

    check-cast p2, Ldy2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ley2/a$b;->f(Ley2/c;Ldy2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ley2/a$b;->x:Ljava/lang/Object;

    check-cast v0, Ley2/c;

    iget-object v1, p0, Ley2/a$b;->y:Ljava/lang/Object;

    check-cast v1, Ldy2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ley2/a$b;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ldy2/b$c;->a:Ldy2/b$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    sget-object p1, Lfy2/b$c;->a:Lfy2/b$c;

    invoke-static {v0, p1, v3, v2, v3}, Ley2/c;->b(Ley2/c;Lfy2/b;Lfy2/b$b;ILjava/lang/Object;)Ley2/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Ldy2/b$a;

    if-eqz p1, :cond_1

    check-cast v1, Ldy2/b$a;

    invoke-virtual {v1}, Ldy2/b$a;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;

    move-result-object p1

    invoke-static {p1}, Ley2/b;->a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;

    move-result-object p1

    invoke-virtual {v1}, Ldy2/b$a;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;

    move-result-object v1

    invoke-static {v1}, Ley2/b;->a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ley2/c;->a(Lfy2/b;Lfy2/b$b;)Ley2/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Ldy2/b$b;

    if-eqz p1, :cond_2

    new-instance p1, Lfy2/b$a;

    check-cast v1, Ldy2/b$b;

    invoke-virtual {v1}, Ldy2/b$b;->a()I

    move-result v1

    invoke-direct {p1, v1}, Lfy2/b$a;-><init>(I)V

    invoke-static {v0, p1, v3, v2, v3}, Ley2/c;->b(Ley2/c;Lfy2/b;Lfy2/b$b;ILjava/lang/Object;)Ley2/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
