.class final Lbk2/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbk2/e;-><init>(Lwj2/c;Lxj2/e;Lyj2/b;Lck2/a;Lbc3/c0;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lwj2/a$a;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lwj2/a$a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$domainState$2"
    f = "TiltGraphViewModel.kt"
    l = {
        0x24
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lbk2/e;


# direct methods
.method public constructor <init>(Lbk2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk2/e;",
            "Lq83/d<",
            "-",
            "Lbk2/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbk2/e$a;->y:Lbk2/e;

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

    new-instance v0, Lbk2/e$a;

    iget-object v1, p0, Lbk2/e$a;->y:Lbk2/e;

    invoke-direct {v0, v1, p2}, Lbk2/e$a;-><init>(Lbk2/e;Lq83/d;)V

    iput-object p1, v0, Lbk2/e$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lwj2/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj2/a$a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lbk2/e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbk2/e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbk2/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwj2/a$a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbk2/e$a;->f(Lwj2/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lbk2/e$a;->x:Ljava/lang/Object;

    check-cast v0, Lwj2/a$a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbk2/e$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbk2/e$a;->y:Lbk2/e;

    invoke-static {p1}, Lbk2/e;->g(Lbk2/e;)Lec3/o1;

    move-result-object p1

    new-instance v2, Lbk2/a$b;

    invoke-virtual {v0}, Lwj2/a$a;->a()Ljava/time/LocalDate;

    move-result-object v0

    invoke-direct {v2, v0}, Lbk2/a$b;-><init>(Ljava/time/LocalDate;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbk2/e$a;->x:Ljava/lang/Object;

    iput v3, p0, Lbk2/e$a;->w:I

    invoke-interface {p1, v2, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
