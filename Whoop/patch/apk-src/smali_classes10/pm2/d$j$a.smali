.class final Lpm2/d$j$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpm2/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ll83/k;",
        "Ly42/a;",
        "Lc52/b;",
        "<destruct>",
        "Ll83/a0;",
        "<anonymous>",
        "(Ll83/k;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToPuffinConnectionState$1$2"
    f = "AdvancedStrapViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpm2/d;


# direct methods
.method public constructor <init>(Lpm2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm2/d;",
            "Lq83/d<",
            "-",
            "Lpm2/d$j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpm2/d$j$a;->y:Lpm2/d;

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

    new-instance v0, Lpm2/d$j$a;

    iget-object v1, p0, Lpm2/d$j$a;->y:Lpm2/d;

    invoke-direct {v0, v1, p2}, Lpm2/d$j$a;-><init>(Lpm2/d;Lq83/d;)V

    iput-object p1, v0, Lpm2/d$j$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll83/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpm2/d$j$a;->invoke(Ll83/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ll83/k;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lpm2/d$j$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpm2/d$j$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpm2/d$j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpm2/d$j$a;->x:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpm2/d$j$a;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ly42/a;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lc52/b;

    sget-object v1, Lc52/b$f;->a:Lc52/b$f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ly42/a;->O()Lc52/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lc52/d;->a()Loh2/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lpm2/d$j$a;->y:Lpm2/d;

    invoke-virtual {v0}, Lpm2/d;->X()Landroidx/lifecycle/p0;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lpm2/d;->F(Lpm2/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lpm2/d$j$a;->y:Lpm2/d;

    invoke-virtual {p1}, Lpm2/d;->X()Landroidx/lifecycle/p0;

    move-result-object v0

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lpm2/d;->F(Lpm2/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
