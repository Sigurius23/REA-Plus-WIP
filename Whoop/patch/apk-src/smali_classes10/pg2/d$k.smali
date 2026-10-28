.class final Lpg2/d$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg2/d;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg2/b;",
        "it",
        "<anonymous>",
        "(Lpg2/b;)Lpg2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$interact$userActions$1"
    f = "PreSessionWidgetInteractor.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpg2/d;


# direct methods
.method public constructor <init>(Lpg2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg2/d;",
            "Lq83/d<",
            "-",
            "Lpg2/d$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpg2/d$k;->y:Lpg2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lpg2/d$k;

    iget-object v1, p0, Lpg2/d$k;->y:Lpg2/d;

    invoke-direct {v0, v1, p2}, Lpg2/d$k;-><init>(Lpg2/d;Lq83/d;)V

    iput-object p1, v0, Lpg2/d$k;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lpg2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg2/b;",
            "Lq83/d<",
            "-",
            "Lpg2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpg2/d$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpg2/d$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpg2/d$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpg2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpg2/d$k;->f(Lpg2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpg2/d$k;->x:Ljava/lang/Object;

    check-cast v0, Lpg2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lpg2/d$k;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpg2/d$k;->y:Lpg2/d;

    const/4 v2, 0x0

    iput-object v2, p0, Lpg2/d$k;->x:Ljava/lang/Object;

    iput v3, p0, Lpg2/d$k;->w:I

    invoke-static {p1, v0, p0}, Lpg2/d;->c(Lpg2/d;Lpg2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    return-object p1
.end method
