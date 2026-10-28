.class final La70/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La70/b;-><init>(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;)V
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
        "La70/a;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(La70/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.dayzero.presentation.DayZeroSplashViewModel$viewState$1"
    f = "DayZeroSplashViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:La70/b;


# direct methods
.method public constructor <init>(La70/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La70/b;",
            "Lq83/d<",
            "-",
            "La70/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La70/b$d;->y:La70/b;

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

    new-instance v0, La70/b$d;

    iget-object v1, p0, La70/b$d;->y:La70/b;

    invoke-direct {v0, v1, p2}, La70/b$d;-><init>(La70/b;Lq83/d;)V

    iput-object p1, v0, La70/b$d;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(La70/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La70/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, La70/b$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La70/b$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La70/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La70/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La70/b$d;->f(La70/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La70/b$d;->x:Ljava/lang/Object;

    check-cast v0, La70/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, La70/b$d;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, La70/a$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, La70/b$d;->y:La70/b;

    invoke-static {p1}, La70/b;->j(La70/b;)Lfi0/a;

    move-result-object p1

    check-cast v0, La70/a$b;

    invoke-virtual {v0}, La70/a$b;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    invoke-static {p1, v0}, Lfi0/b;->a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
