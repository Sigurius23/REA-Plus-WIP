.class final Lsp2/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsp2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lsp2/c;",
        "previousState",
        "Lsp2/e;",
        "action",
        "<anonymous>",
        "(Lsp2/c;Lsp2/e;)Lsp2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$interact$2"
    f = "ShippingMethodInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsp2/d;


# direct methods
.method public constructor <init>(Lsp2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsp2/d;",
            "Lq83/d<",
            "-",
            "Lsp2/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsp2/d$b;->z:Lsp2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lsp2/c;Lsp2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsp2/c;",
            "Lsp2/e;",
            "Lq83/d<",
            "-",
            "Lsp2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lsp2/d$b;

    iget-object v1, p0, Lsp2/d$b;->z:Lsp2/d;

    invoke-direct {v0, v1, p3}, Lsp2/d$b;-><init>(Lsp2/d;Lq83/d;)V

    iput-object p1, v0, Lsp2/d$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lsp2/d$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsp2/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsp2/c;

    check-cast p2, Lsp2/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsp2/d$b;->f(Lsp2/c;Lsp2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lsp2/d$b;->x:Ljava/lang/Object;

    check-cast v0, Lsp2/c;

    iget-object v1, p0, Lsp2/d$b;->y:Ljava/lang/Object;

    check-cast v1, Lsp2/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lsp2/d$b;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lsp2/e$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsp2/d$b;->z:Lsp2/d;

    check-cast v1, Lsp2/e$b;

    invoke-virtual {v1}, Lsp2/e$b;->a()Lsp2/b;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lsp2/d;->d(Lsp2/d;Lsp2/c;Lsp2/b;)Lsp2/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lsp2/e$a;

    if-eqz p1, :cond_2

    check-cast v1, Lsp2/e$a;

    invoke-virtual {v1}, Lsp2/e$a;->a()Lsp2/c;

    move-result-object v2

    invoke-virtual {v1}, Lsp2/e$a;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lsp2/c;->i()Ljava/lang/String;

    move-result-object p1

    :cond_1
    move-object v10, p1

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v12}, Lsp2/c;->b(Lsp2/c;Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;ILjava/lang/Object;)Lsp2/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
