.class final Lsl0/u1$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u1;->d(Lsl0/v1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.HorizontalBubbleSuggestionsViewKt$HorizontalBubbleSuggestionsView$3$1"
    f = "HorizontalBubbleSuggestionsView.kt"
    l = {}
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

.field final synthetic x:Ln0/u;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lsl0/v1;


# direct methods
.method public constructor <init>(Ln0/u;Lkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lsl0/v1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/u1$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/u1$b;->x:Ln0/u;

    iput-object p2, p0, Lsl0/u1$b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsl0/u1$b;->z:Lsl0/v1;

    iput-object p4, p0, Lsl0/u1$b;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lsl0/u1$b;

    iget-object v1, p0, Lsl0/u1$b;->x:Ln0/u;

    iget-object v2, p0, Lsl0/u1$b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lsl0/u1$b;->z:Lsl0/v1;

    iget-object v4, p0, Lsl0/u1$b;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsl0/u1$b;-><init>(Ln0/u;Lkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/u1$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/u1$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/u1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/u1$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsl0/u1$b;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/u1$b;->x:Ln0/u;

    iget-object p1, p1, Ln0/u;->e:Ll2/a;

    iget-object p1, p1, Ll2/a;->b:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    if-gtz p1, :cond_0

    iget-object p1, p0, Lsl0/u1$b;->x:Ln0/u;

    iget-object p1, p1, Ln0/u;->e:Ll2/a;

    iget-object p1, p1, Ll2/a;->c:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    if-lez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lsl0/u1$b;->E:Lp1/c1;

    invoke-static {p1}, Lsl0/u1;->p(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lsl0/u1$b;->E:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lsl0/u1;->q(Lp1/c1;Z)V

    iget-object p1, p0, Lsl0/u1$b;->y:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lnl0/d$o;

    iget-object v1, p0, Lsl0/u1$b;->z:Lsl0/v1;

    invoke-virtual {v1}, Lsl0/v1;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "wce-android-horizontal-scrolling"

    invoke-direct {v0, v1, v2}, Lnl0/d$o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
