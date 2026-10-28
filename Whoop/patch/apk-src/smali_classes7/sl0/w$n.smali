.class final Lsl0/w$n;
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
    c = "com.whoop.bot.view.AiCoachWrapperScreenKt$AiCoachWrapperScreen$8$1"
    f = "AiCoachWrapperScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lnl0/f;

.field final synthetic y:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnl0/f;Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/f;",
            "Lkotlin/jvm/functions/Function3;",
            "Lq83/d<",
            "-",
            "Lsl0/w$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/w$n;->x:Lnl0/f;

    iput-object p2, p0, Lsl0/w$n;->y:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lsl0/w$n;

    iget-object v0, p0, Lsl0/w$n;->x:Lnl0/f;

    iget-object v1, p0, Lsl0/w$n;->y:Lkotlin/jvm/functions/Function3;

    invoke-direct {p1, v0, v1, p2}, Lsl0/w$n;-><init>(Lnl0/f;Lkotlin/jvm/functions/Function3;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/w$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/w$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/w$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/w$n;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsl0/w$n;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/w$n;->x:Lnl0/f;

    invoke-virtual {p1}, Lnl0/f;->h()Z

    move-result v0

    invoke-static {p1, v0}, Lsl0/j;->f(Lnl0/f;Z)Lsl0/w2;

    move-result-object p1

    iget-object v0, p0, Lsl0/w$n;->y:Lkotlin/jvm/functions/Function3;

    invoke-static {p1, v0}, Lsl0/j;->e(Lsl0/w2;Lkotlin/jvm/functions/Function3;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
