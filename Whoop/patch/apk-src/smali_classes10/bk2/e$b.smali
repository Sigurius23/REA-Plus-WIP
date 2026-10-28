.class final Lbk2/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbk2/e;->p(Lbk2/b;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$sendViewEvent$1"
    f = "TiltGraphViewModel.kt"
    l = {
        0x34,
        0x35
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lbk2/b;

.field final synthetic y:Lbk2/e;


# direct methods
.method public constructor <init>(Lbk2/b;Lbk2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk2/b;",
            "Lbk2/e;",
            "Lq83/d<",
            "-",
            "Lbk2/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbk2/e$b;->x:Lbk2/b;

    iput-object p2, p0, Lbk2/e$b;->y:Lbk2/e;

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

    new-instance p1, Lbk2/e$b;

    iget-object v0, p0, Lbk2/e$b;->x:Lbk2/b;

    iget-object v1, p0, Lbk2/e$b;->y:Lbk2/e;

    invoke-direct {p1, v0, v1, p2}, Lbk2/e$b;-><init>(Lbk2/b;Lbk2/e;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lbk2/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbk2/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbk2/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbk2/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbk2/e$b;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbk2/e$b;->x:Lbk2/b;

    instance-of v1, p1, Lbk2/d;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lbk2/e$b;->y:Lbk2/e;

    invoke-static {p1}, Lbk2/e;->j(Lbk2/e;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lbk2/e$b;->x:Lbk2/b;

    iput v3, p0, Lbk2/e$b;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_3
    instance-of p1, p1, Lbk2/a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lbk2/e$b;->y:Lbk2/e;

    invoke-static {p1}, Lbk2/e;->g(Lbk2/e;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lbk2/e$b;->x:Lbk2/b;

    iput v2, p0, Lbk2/e$b;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
