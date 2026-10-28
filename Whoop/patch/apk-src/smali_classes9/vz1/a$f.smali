.class final Lvz1/a$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvz1/a;-><init>(Lpz1/d;Ltz1/g;Loz1/a;Lao2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V
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
        "Ltz1/f;",
        "viewState",
        "Lao2/b;",
        "cartIndicator",
        "<anonymous>",
        "(Ltz1/f;Lao2/b;)Ltz1/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$viewState$1"
    f = "NativeStoreViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvz1/a;


# direct methods
.method public constructor <init>(Lvz1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvz1/a;",
            "Lq83/d<",
            "-",
            "Lvz1/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvz1/a$f;->z:Lvz1/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ltz1/f;Lao2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltz1/f;",
            "Lao2/b;",
            "Lq83/d<",
            "-",
            "Ltz1/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvz1/a$f;

    iget-object v1, p0, Lvz1/a$f;->z:Lvz1/a;

    invoke-direct {v0, v1, p3}, Lvz1/a$f;-><init>(Lvz1/a;Lq83/d;)V

    iput-object p1, v0, Lvz1/a$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvz1/a$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvz1/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltz1/f;

    check-cast p2, Lao2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvz1/a$f;->f(Ltz1/f;Lao2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lvz1/a$f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltz1/f;

    iget-object v0, p0, Lvz1/a$f;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lao2/b;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvz1/a$f;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvz1/a$f;->z:Lvz1/a;

    invoke-static {p1}, Lvz1/a;->j(Lvz1/a;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lvz1/a$f;->z:Lvz1/a;

    invoke-static {v0}, Lvz1/a;->n(Lvz1/a;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    invoke-static {p1, v0}, Lmz1/d;->c(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v8}, Ltz1/f;->b(Ltz1/f;ZZLtz1/b;Lao2/b;ZILjava/lang/Object;)Ltz1/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
