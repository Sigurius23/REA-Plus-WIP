.class final Ljw0/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljw0/d;->g(Lmw0/b;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lec3/l;",
        "Ljw0/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.core.details.sleep.domain.SleepDetailsDialogInteractor$interact$2"
    f = "SleepDetailsDialogInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lmw0/b;

.field final synthetic y:Ljw0/d;


# direct methods
.method public constructor <init>(Lmw0/b;Ljw0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmw0/b;",
            "Ljw0/d;",
            "Lq83/d<",
            "-",
            "Ljw0/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljw0/d$b;->x:Lmw0/b;

    iput-object p2, p0, Ljw0/d$b;->y:Ljw0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Ljw0/d$b;

    iget-object v0, p0, Ljw0/d$b;->x:Lmw0/b;

    iget-object v1, p0, Ljw0/d$b;->y:Ljw0/d;

    invoke-direct {p1, v0, v1, p2}, Ljw0/d$b;-><init>(Lmw0/b;Ljw0/d;Lq83/d;)V

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
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ljw0/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljw0/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljw0/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljw0/d$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ljw0/d$b;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ljw0/d$b;->x:Lmw0/b;

    instance-of v0, p1, Lmw0/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljw0/d$b;->y:Ljw0/d;

    check-cast p1, Lmw0/b$a;

    invoke-virtual {p1}, Lmw0/b$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ljw0/d;->a(Ljw0/d;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lmw0/b$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljw0/d$b;->y:Ljw0/d;

    check-cast p1, Lmw0/b$b;

    invoke-virtual {p1}, Lmw0/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ljw0/d;->e(Ljw0/d;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
