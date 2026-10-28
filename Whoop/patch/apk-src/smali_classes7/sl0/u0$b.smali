.class final Lsl0/u0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u0;->V(Lnl0/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;ZLkotlin/jvm/functions/Function3;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V
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
    c = "com.whoop.bot.view.AiConversationScreenKt$AiChatContent$5$1"
    f = "AiConversationScreen.kt"
    l = {
        0xc2
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

.field w:I

.field final synthetic x:Lg1/y3;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lnl0/f;


# direct methods
.method public constructor <init>(Lg1/y3;Lkotlin/jvm/functions/Function1;Lnl0/f;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/y3;",
            "Lkotlin/jvm/functions/Function1;",
            "Lnl0/f;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/u0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/u0$b;->x:Lg1/y3;

    iput-object p2, p0, Lsl0/u0$b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsl0/u0$b;->z:Lnl0/f;

    iput-object p4, p0, Lsl0/u0$b;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lg1/y3;)Lg1/z3;
    .locals 0

    invoke-static {p0}, Lsl0/u0$b;->h(Lg1/y3;)Lg1/z3;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lg1/y3;)Lg1/z3;
    .locals 0

    invoke-virtual {p0}, Lg1/y3;->c()Lg1/z3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lsl0/u0$b;

    iget-object v1, p0, Lsl0/u0$b;->x:Lg1/y3;

    iget-object v2, p0, Lsl0/u0$b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lsl0/u0$b;->z:Lnl0/f;

    iget-object v4, p0, Lsl0/u0$b;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsl0/u0$b;-><init>(Lg1/y3;Lkotlin/jvm/functions/Function1;Lnl0/f;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/u0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/u0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/u0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/u0$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/u0$b;->w:I

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

    iget-object p1, p0, Lsl0/u0$b;->x:Lg1/y3;

    new-instance v1, Lsl0/v0;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lsl0/v0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lsl0/u0$b$a;

    iget-object v3, p0, Lsl0/u0$b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lsl0/u0$b;->z:Lnl0/f;

    iget-object v5, p0, Lsl0/u0$b;->E:Lp1/c1;

    invoke-direct {v1, v3, v4, v5}, Lsl0/u0$b$a;-><init>(Lkotlin/jvm/functions/Function1;Lnl0/f;Lp1/c1;)V

    iput v2, p0, Lsl0/u0$b;->w:I

    invoke-virtual {p1, v1, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
