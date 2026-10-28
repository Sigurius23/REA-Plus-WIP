.class final Ly70/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly70/b;-><init>(Lv70/e;Lz70/a;Lv70/g;Lbc3/c0;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ly70/c;",
        "state",
        "",
        "inFlight",
        "<anonymous>",
        "(Ly70/c;Z)Ly70/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$viewState$1"
    f = "OrderConfirmationViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Z

.field final synthetic z:Ly70/b;


# direct methods
.method public constructor <init>(Ly70/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/b;",
            "Lq83/d<",
            "-",
            "Ly70/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly70/b$e;->z:Ly70/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ly70/c;ZLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/c;",
            "Z",
            "Lq83/d<",
            "-",
            "Ly70/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ly70/b$e;

    iget-object v1, p0, Ly70/b$e;->z:Ly70/b;

    invoke-direct {v0, v1, p3}, Ly70/b$e;-><init>(Ly70/b;Lq83/d;)V

    iput-object p1, v0, Ly70/b$e;->x:Ljava/lang/Object;

    iput-boolean p2, v0, Ly70/b$e;->y:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ly70/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly70/c;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ly70/b$e;->f(Ly70/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly70/b$e;->x:Ljava/lang/Object;

    check-cast v0, Ly70/c;

    iget-boolean v1, p0, Ly70/b$e;->y:Z

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ly70/b$e;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ly70/b$e;->z:Ly70/b;

    invoke-static {p1, v0, v1}, Ly70/b;->q(Ly70/b;Ly70/c;Z)Ly70/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
