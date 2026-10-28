.class final Lpm2/d$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpm2/d;->w0()V
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
    c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToStrapConnectionState$1"
    f = "AdvancedStrapViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lpm2/d;


# direct methods
.method public constructor <init>(Lpm2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm2/d;",
            "Lq83/d<",
            "-",
            "Lpm2/d$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpm2/d$k;->x:Lpm2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lpm2/d;Ltd1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpm2/d$k;->i(Lpm2/d;Ltd1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lpm2/a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lpm2/d$k;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lpm2/d;Ltd1/e;)Ll83/a0;
    .locals 2

    sget-object v0, Ltd1/e;->READY:Ltd1/e;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lpm2/d;->Y()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lpm2/d;->F(Lpm2/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    invoke-static {p0}, Lpm2/d;->G(Lpm2/d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lpm2/d;->P()Lor2/r0;

    move-result-object p0

    invoke-virtual {p0}, Lor2/r0;->e()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lpm2/d$k;

    iget-object v0, p0, Lpm2/d$k;->x:Lpm2/d;

    invoke-direct {p1, v0, p2}, Lpm2/d$k;-><init>(Lpm2/d;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lpm2/d$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpm2/d$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpm2/d$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpm2/d$k;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lpm2/d$k;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpm2/d$k;->x:Lpm2/d;

    invoke-static {p1}, Lpm2/d;->C(Lpm2/d;)Ltd1/b;

    move-result-object p1

    invoke-interface {p1}, Ltd1/b;->i()Lxg3/g;

    move-result-object p1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v0

    invoke-virtual {p1, v0}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    iget-object v0, p0, Lpm2/d$k;->x:Lpm2/d;

    new-instance v1, Lpm2/a;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lpm2/a;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lpm2/e;

    invoke-direct {v0, v1}, Lpm2/e;-><init>(Lpm2/a;)V

    invoke-virtual {p1, v0}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    iget-object v0, p0, Lpm2/d$k;->x:Lpm2/d;

    invoke-static {v0}, Lpm2/d;->D(Lpm2/d;)Lmh3/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lmh3/c;->c(Lxg3/t;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
