.class final Lsl0/w$l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/w$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.bot.view.AiCoachWrapperScreenKt$AiCoachWrapperScreen$6$1$2$1"
    f = "AiCoachWrapperScreen.kt"
    l = {
        0xab
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

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lsl0/q;

.field final synthetic y:Lnl0/f;

.field final synthetic z:Lg1/y3;


# direct methods
.method public constructor <init>(Lsl0/q;Lnl0/f;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/q;",
            "Lnl0/f;",
            "Lg1/y3;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/w$l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/w$l$a;->x:Lsl0/q;

    iput-object p2, p0, Lsl0/w$l$a;->y:Lnl0/f;

    iput-object p3, p0, Lsl0/w$l$a;->z:Lg1/y3;

    iput-object p4, p0, Lsl0/w$l$a;->E:Lp1/c1;

    iput-object p5, p0, Lsl0/w$l$a;->F:Lp1/c1;

    iput-object p6, p0, Lsl0/w$l$a;->G:Lp1/c1;

    iput-object p7, p0, Lsl0/w$l$a;->H:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lsl0/w$l$a;

    iget-object v1, p0, Lsl0/w$l$a;->x:Lsl0/q;

    iget-object v2, p0, Lsl0/w$l$a;->y:Lnl0/f;

    iget-object v3, p0, Lsl0/w$l$a;->z:Lg1/y3;

    iget-object v4, p0, Lsl0/w$l$a;->E:Lp1/c1;

    iget-object v5, p0, Lsl0/w$l$a;->F:Lp1/c1;

    iget-object v6, p0, Lsl0/w$l$a;->G:Lp1/c1;

    iget-object v7, p0, Lsl0/w$l$a;->H:Lp1/c1;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lsl0/w$l$a;-><init>(Lsl0/q;Lnl0/f;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lsl0/w$l$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/w$l$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/w$l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/w$l$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/w$l$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/w$l$a;->E:Lp1/c1;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lsl0/w;->W(Lp1/c1;Z)V

    iget-object p1, p0, Lsl0/w$l$a;->F:Lp1/c1;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lsl0/w;->X(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lsl0/w$l$a;->G:Lp1/c1;

    invoke-static {p1, v1}, Lsl0/w;->Z(Lp1/c1;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V

    iget-object p1, p0, Lsl0/w$l$a;->x:Lsl0/q;

    invoke-virtual {p1}, Lsl0/q;->c()Lld1/c;

    move-result-object p1

    new-instance v1, Lnl0/d$f;

    iget-object v3, p0, Lsl0/w$l$a;->y:Lnl0/f;

    invoke-virtual {v3}, Lnl0/f;->c()Lnl0/a;

    move-result-object v3

    invoke-virtual {v3}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lnl0/d$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lld1/c;->g(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/w$l$a;->H:Lp1/c1;

    invoke-static {p1, v2}, Lsl0/w;->V(Lp1/c1;Z)V

    iget-object p1, p0, Lsl0/w$l$a;->z:Lg1/y3;

    iput v2, p0, Lsl0/w$l$a;->w:I

    invoke-virtual {p1, p0}, Lg1/y3;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
