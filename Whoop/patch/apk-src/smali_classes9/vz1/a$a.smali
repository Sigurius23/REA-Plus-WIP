.class final Lvz1/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ltz1/d$m;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Ltz1/d$m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$reducedViewStateFlow$2"
    f = "NativeStoreViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lvz1/a;


# direct methods
.method public constructor <init>(Lvz1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvz1/a;",
            "Lq83/d<",
            "-",
            "Lvz1/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvz1/a$a;->y:Lvz1/a;

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

    new-instance v0, Lvz1/a$a;

    iget-object v1, p0, Lvz1/a$a;->y:Lvz1/a;

    invoke-direct {v0, v1, p2}, Lvz1/a$a;-><init>(Lvz1/a;Lq83/d;)V

    iput-object p1, v0, Lvz1/a$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ltz1/d$m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltz1/d$m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lvz1/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvz1/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvz1/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltz1/d$m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvz1/a$a;->f(Ltz1/d$m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvz1/a$a;->x:Ljava/lang/Object;

    check-cast v0, Ltz1/d$m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvz1/a$a;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Ltz1/d$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvz1/a$a;->y:Lvz1/a;

    invoke-static {p1}, Lvz1/a;->g(Lvz1/a;)Loz1/a;

    move-result-object p1

    check-cast v0, Ltz1/d$a;

    iget-object v1, p0, Lvz1/a$a;->y:Lvz1/a;

    invoke-static {v1}, Lvz1/a;->j(Lvz1/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Loz1/a;->k(Ltz1/d$a;Ljava/lang/String;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
