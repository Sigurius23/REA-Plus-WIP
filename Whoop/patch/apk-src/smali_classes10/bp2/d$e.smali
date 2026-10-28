.class final Lbp2/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbp2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lbp2/c;",
        "previousState",
        "Lbp2/e;",
        "action",
        "<anonymous>",
        "(Lbp2/c;Lbp2/e;)Lbp2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$interact$2"
    f = "ReceiptInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lbp2/d;


# direct methods
.method public constructor <init>(Lbp2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbp2/d;",
            "Lq83/d<",
            "-",
            "Lbp2/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbp2/d$e;->z:Lbp2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbp2/c;Lbp2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbp2/c;",
            "Lbp2/e;",
            "Lq83/d<",
            "-",
            "Lbp2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbp2/d$e;

    iget-object v1, p0, Lbp2/d$e;->z:Lbp2/d;

    invoke-direct {v0, v1, p3}, Lbp2/d$e;-><init>(Lbp2/d;Lq83/d;)V

    iput-object p1, v0, Lbp2/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lbp2/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbp2/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbp2/c;

    check-cast p2, Lbp2/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbp2/d$e;->f(Lbp2/c;Lbp2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lbp2/d$e;->x:Ljava/lang/Object;

    check-cast v0, Lbp2/c;

    iget-object v1, p0, Lbp2/d$e;->y:Ljava/lang/Object;

    check-cast v1, Lbp2/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbp2/d$e;->w:I

    if-nez v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lbp2/e$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbp2/d$e;->z:Lbp2/d;

    check-cast v1, Lbp2/e$b;

    invoke-virtual {v1}, Lbp2/e$b;->a()Lbp2/b;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lbp2/d;->d(Lbp2/d;Lbp2/c;Lbp2/b;)Lbp2/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lbp2/e$a;

    if-eqz p1, :cond_4

    check-cast v1, Lbp2/e$a;

    invoke-virtual {v1}, Lbp2/e$a;->a()Lbp2/c;

    move-result-object v2

    invoke-virtual {v1}, Lbp2/e$a;->a()Lbp2/c;

    move-result-object p1

    invoke-virtual {p1}, Lbp2/c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    invoke-virtual {v0}, Lbp2/c;->c()Ljava/lang/String;

    move-result-object p1

    :cond_2
    move-object v7, p1

    invoke-virtual {v0}, Lbp2/c;->f()Z

    move-result v8

    invoke-virtual {v1}, Lbp2/e$a;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lbp2/c;->h()Ljava/lang/String;

    move-result-object p1

    :cond_3
    move-object v9, p1

    const/16 v11, 0x8f

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Lbp2/c;->b(Lbp2/c;Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lbp2/c;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
