.class final Lv70/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv70/e;->interact(Lec3/l;)Lec3/l;
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
        "Lv70/d;",
        "previousState",
        "Lv70/f;",
        "action",
        "<anonymous>",
        "(Lv70/d;Lv70/f;)Lv70/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.feature.orderconfirmation.domain.OrderConfirmationInteractor$interact$2"
    f = "OrderConfirmationInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lv70/e;


# direct methods
.method public constructor <init>(Lv70/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv70/e;",
            "Lq83/d<",
            "-",
            "Lv70/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv70/e$b;->z:Lv70/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lv70/d;Lv70/f;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv70/d;",
            "Lv70/f;",
            "Lq83/d<",
            "-",
            "Lv70/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lv70/e$b;

    iget-object v1, p0, Lv70/e$b;->z:Lv70/e;

    invoke-direct {v0, v1, p3}, Lv70/e$b;-><init>(Lv70/e;Lq83/d;)V

    iput-object p1, v0, Lv70/e$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lv70/e$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lv70/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv70/d;

    check-cast p2, Lv70/f;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lv70/e$b;->f(Lv70/d;Lv70/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv70/e$b;->x:Ljava/lang/Object;

    check-cast v0, Lv70/d;

    iget-object v1, p0, Lv70/e$b;->y:Ljava/lang/Object;

    check-cast v1, Lv70/f;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lv70/e$b;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lv70/f$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv70/e$b;->z:Lv70/e;

    check-cast v1, Lv70/f$b;

    invoke-virtual {v1}, Lv70/f$b;->a()Lv70/c;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lv70/e;->c(Lv70/e;Lv70/d;Lv70/c;)Lv70/d;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lv70/f$a;

    if-eqz p1, :cond_1

    check-cast v1, Lv70/f$a;

    invoke-virtual {v1}, Lv70/f$a;->a()Lv70/d;

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
