.class final Lsl0/w$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/w;->r(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.AiCoachWrapperScreenKt$AiCoachWrapperScreen$4$1"
    f = "AiCoachWrapperScreen.kt"
    l = {
        0x7e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lsl0/q;

.field final synthetic z:Lsl0/n0;


# direct methods
.method public constructor <init>(Lsl0/q;Lsl0/n0;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/q;",
            "Lsl0/n0;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/w$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/w$j;->y:Lsl0/q;

    iput-object p2, p0, Lsl0/w$j;->z:Lsl0/n0;

    iput-object p3, p0, Lsl0/w$j;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lsl0/q;Lnl0/d$h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w$j;->h(Lsl0/q;Lnl0/d$h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lsl0/q;Lnl0/d$h;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lsl0/q;->c()Lld1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lsl0/w$j;

    iget-object v0, p0, Lsl0/w$j;->y:Lsl0/q;

    iget-object v1, p0, Lsl0/w$j;->z:Lsl0/n0;

    iget-object v2, p0, Lsl0/w$j;->E:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lsl0/w$j;-><init>(Lsl0/q;Lsl0/n0;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/w$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/w$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/w$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/w$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/w$j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lsl0/w$j;->w:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/w$j;->E:Lp1/c1;

    iget-object v1, p0, Lsl0/w$j;->y:Lsl0/q;

    iput-object p1, p0, Lsl0/w$j;->w:Ljava/lang/Object;

    iput v2, p0, Lsl0/w$j;->x:I

    invoke-virtual {v1, p0}, Lsl0/q;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lsl0/w;->a0(Lp1/c1;Ljava/lang/Boolean;)V

    iget-object p1, p0, Lsl0/w$j;->y:Lsl0/q;

    invoke-virtual {p1}, Lsl0/q;->j()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lsl0/w$j;->y:Lsl0/q;

    new-instance v0, Lsl0/x;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lsl0/x;-><init>(Lsl0/q;I)V

    iget-object v1, p0, Lsl0/w$j;->z:Lsl0/n0;

    invoke-virtual {p1, v0, v1}, Lsl0/q;->g(Lkotlin/jvm/functions/Function1;Lsl0/n0;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
