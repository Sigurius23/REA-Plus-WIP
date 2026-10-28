.class final Lkx0/d$c;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lkx0/e;",
        "",
        "exception",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$2$3"
    f = "StrapSyncInteractor.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkx0/b;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkx0/d;


# direct methods
.method public constructor <init>(Lkx0/d;Lkx0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkx0/d;",
            "Lkx0/b;",
            "Lq83/d<",
            "-",
            "Lkx0/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkx0/d$c;->z:Lkx0/d;

    iput-object p2, p0, Lkx0/d$c;->E:Lkx0/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkx0/d$c;

    iget-object v1, p0, Lkx0/d$c;->z:Lkx0/d;

    iget-object v2, p0, Lkx0/d$c;->E:Lkx0/b;

    invoke-direct {v0, v1, v2, p3}, Lkx0/d$c;-><init>(Lkx0/d;Lkx0/b;Lq83/d;)V

    iput-object p1, v0, Lkx0/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkx0/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkx0/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkx0/d$c;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lkx0/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lkx0/d$c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lkx0/d$c;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lkotlinx/coroutines/TimeoutCancellationException;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Lkx0/d$c;->z:Lkx0/d;

    invoke-static {p1}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object p1

    const-string v5, "Sensor HPS timed out"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v5, v1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lkx0/e$b;

    iget-object v1, p0, Lkx0/d$c;->E:Lkx0/b;

    invoke-interface {v1}, Lkx0/b;->a()Ldt0/c;

    move-result-object v1

    sget-object v3, Lts0/e;->TIMEOUT:Lts0/e;

    invoke-direct {p1, v1, v3}, Lkx0/e$b;-><init>(Ldt0/c;Lts0/e;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lkx0/d$c;->x:Ljava/lang/Object;

    iput-object v1, p0, Lkx0/d$c;->y:Ljava/lang/Object;

    iput v4, p0, Lkx0/d$c;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    iget-object p1, p0, Lkx0/d$c;->z:Lkx0/d;

    invoke-static {p1}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object p1

    const-string v0, "Error in sensor HPS result flow"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    throw v1
.end method
