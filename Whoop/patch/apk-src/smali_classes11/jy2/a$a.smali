.class final Ljy2/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljy2/a;->a(Lec3/l;)Lec3/l;
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
        "Lky2/g;",
        "previousViewState",
        "Liy2/b;",
        "currentDomainState",
        "<anonymous>",
        "(Lky2/g;Liy2/b;)Lky2/g;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignscreening.reducer.CampaignScreeningViewStateReducer$reduce$1"
    f = "CampaignScreeningViewStateReducer.kt"
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
            "Ljy2/a$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lky2/g;Liy2/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lky2/g;",
            "Liy2/b;",
            "Lq83/d<",
            "-",
            "Lky2/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljy2/a$a;

    invoke-direct {v0, p3}, Ljy2/a$a;-><init>(Lq83/d;)V

    iput-object p1, v0, Ljy2/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Ljy2/a$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljy2/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lky2/g;

    check-cast p2, Liy2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljy2/a$a;->f(Lky2/g;Liy2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ljy2/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lky2/g;

    iget-object v1, p0, Ljy2/a$a;->y:Ljava/lang/Object;

    check-cast v1, Liy2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ljy2/a$a;->w:I

    if-nez v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Liy2/b$d;->a:Liy2/b$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lky2/g$d;->a:Lky2/g$d;

    return-object p1

    :cond_0
    instance-of p1, v1, Liy2/b$b;

    if-eqz p1, :cond_1

    new-instance p1, Lky2/g$b;

    check-cast v1, Liy2/b$b;

    invoke-virtual {v1}, Liy2/b$b;->a()I

    move-result v0

    invoke-virtual {v1}, Liy2/b$b;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lky2/g$b;-><init>(ILjava/lang/Integer;)V

    return-object p1

    :cond_1
    instance-of p1, v1, Liy2/b$f;

    if-eqz p1, :cond_2

    new-instance p1, Lky2/g$e;

    check-cast v1, Liy2/b$f;

    invoke-virtual {v1}, Liy2/b$f;->a()I

    move-result v0

    invoke-virtual {v1}, Liy2/b$f;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lky2/g$e;-><init>(ILjava/lang/Integer;)V

    return-object p1

    :cond_2
    instance-of p1, v1, Liy2/b$e;

    if-eqz p1, :cond_3

    check-cast v1, Liy2/b$e;

    invoke-static {v1}, Ljy2/b;->f(Liy2/b$e;)Lky2/g$a$b;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v1, Liy2/b$a;

    if-eqz p1, :cond_4

    check-cast v1, Liy2/b$a;

    invoke-static {v1}, Ljy2/b;->e(Liy2/b$a;)Lky2/g$a$a;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v1, Liy2/b$c;

    if-eqz p1, :cond_5

    check-cast v1, Liy2/b$c;

    invoke-static {v1}, Ljy2/b;->a(Liy2/b$c;)Lky2/g$c;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v1, Liy2/b$g;

    if-eqz p1, :cond_6

    check-cast v1, Liy2/b$g;

    invoke-static {v1}, Ljy2/b;->b(Liy2/b$g;)Lky2/g$f;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v1, Liy2/b$i;

    if-eqz p1, :cond_7

    check-cast v1, Liy2/b$i;

    invoke-virtual {v1}, Liy2/b$i;->a()Lvy2/c;

    move-result-object p1

    invoke-static {v0, p1}, Ljy2/b;->d(Lky2/g;Lvy2/c;)Lky2/g;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v1, Liy2/b$h;

    if-eqz p1, :cond_8

    check-cast v1, Liy2/b$h;

    invoke-virtual {v1}, Liy2/b$h;->a()Lvy2/c;

    move-result-object p1

    invoke-virtual {v1}, Liy2/b$h;->b()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ljy2/b;->c(Lky2/g;Lvy2/c;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)Lky2/g;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
