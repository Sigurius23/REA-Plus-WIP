.class final Lbn0/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbn0/d;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcn0/c;Lor2/m;)V
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lan0/a;",
        "domain",
        "Lbn0/a;",
        "accumulated",
        "Lbn0/e;",
        "<anonymous>",
        "(Lan0/a;Lbn0/a;)Lbn0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.calendararchmini.presentation.ArchMiniCalendarViewModelImpl$viewState$1"
    f = "ArchMiniCalendarViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lbn0/d;


# direct methods
.method public constructor <init>(Lbn0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbn0/d;",
            "Lq83/d<",
            "-",
            "Lbn0/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbn0/d$d;->z:Lbn0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lan0/a;Lbn0/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lan0/a;",
            "Lbn0/a;",
            "Lq83/d<",
            "-",
            "Lbn0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbn0/d$d;

    iget-object v1, p0, Lbn0/d$d;->z:Lbn0/d;

    invoke-direct {v0, v1, p3}, Lbn0/d$d;-><init>(Lbn0/d;Lq83/d;)V

    iput-object p1, v0, Lbn0/d$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lbn0/d$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbn0/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lan0/a;

    check-cast p2, Lbn0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbn0/d$d;->f(Lan0/a;Lbn0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lbn0/d$d;->x:Ljava/lang/Object;

    check-cast v0, Lan0/a;

    iget-object v1, p0, Lbn0/d$d;->y:Ljava/lang/Object;

    check-cast v1, Lbn0/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbn0/d$d;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbn0/d$d;->z:Lbn0/d;

    invoke-static {p1}, Lbn0/d;->l(Lbn0/d;)Lcn0/c;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lcn0/c;->c(Lan0/a;Lbn0/a;)Lbn0/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
