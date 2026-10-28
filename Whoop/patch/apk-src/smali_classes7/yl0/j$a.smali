.class final Lyl0/j$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl0/j;->o(Lyl0/k;)V
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
    c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetMiniArchViewModel$sendViewEvent$1"
    f = "JournalEntryWidgetMiniArchViewModel.kt"
    l = {
        0x20,
        0x22,
        0x24,
        0x26,
        0x28,
        0x2a,
        0x2c,
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lyl0/k;

.field final synthetic y:Lyl0/j;


# direct methods
.method public constructor <init>(Lyl0/k;Lyl0/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/k;",
            "Lyl0/j;",
            "Lq83/d<",
            "-",
            "Lyl0/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyl0/j$a;->x:Lyl0/k;

    iput-object p2, p0, Lyl0/j$a;->y:Lyl0/j;

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

    new-instance p1, Lyl0/j$a;

    iget-object v0, p0, Lyl0/j$a;->x:Lyl0/k;

    iget-object v1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-direct {p1, v0, v1, p2}, Lyl0/j$a;-><init>(Lyl0/k;Lyl0/j;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lyl0/j$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyl0/j$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyl0/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyl0/j$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyl0/j$a;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyl0/j$a;->x:Lyl0/k;

    instance-of v1, p1, Lyl0/k$d;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lyl0/f$e;

    iget-object v2, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v2, Lyl0/k$d;

    invoke-virtual {v2}, Lyl0/k$d;->a()Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v1, v2}, Lyl0/f$e;-><init>(Ljava/lang/Boolean;)V

    const/4 v2, 0x1

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_0
    instance-of v1, p1, Lyl0/k$e;

    if-eqz v1, :cond_1

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lyl0/f$f;

    iget-object v2, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v2, Lyl0/k$e;

    invoke-virtual {v2}, Lyl0/k$e;->a()D

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lyl0/f$f;-><init>(D)V

    const/4 v2, 0x2

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_1
    instance-of v1, p1, Lyl0/k$f;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lyl0/f$g;

    iget-object v2, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v2, Lyl0/k$f;

    invoke-virtual {v2}, Lyl0/k$f;->a()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lyl0/f$g;-><init>(J)V

    const/4 v2, 0x3

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_2
    instance-of v1, p1, Lyl0/k$g;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyl0/f$h;->a:Lyl0/f$h;

    const/4 v2, 0x4

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_3
    instance-of v1, p1, Lyl0/k$c;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyl0/f$d;->a:Lyl0/f$d;

    const/4 v2, 0x5

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_4
    instance-of v1, p1, Lyl0/k$b;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyl0/f$c;->a:Lyl0/f$c;

    const/4 v2, 0x6

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_5
    instance-of v1, p1, Lyl0/k$a;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyl0/f$b;->a:Lyl0/f$b;

    const/4 v2, 0x7

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_0

    :cond_6
    instance-of v1, p1, Lyl0/k$j;

    if-eqz v1, :cond_7

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->l(Lyl0/j;)Lrg0/e;

    move-result-object p1

    iget-object v0, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v0, Lyl0/k$j;

    invoke-virtual {v0}, Lyl0/k$j;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v1, Lyl0/k$j;

    invoke-virtual {v1}, Lyl0/k$j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lrg0/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    instance-of v1, p1, Lyl0/k$i;

    if-eqz v1, :cond_8

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->l(Lyl0/j;)Lrg0/e;

    move-result-object p1

    iget-object v0, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v0, Lyl0/k$i;

    invoke-virtual {v0}, Lyl0/k$i;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v1, Lyl0/k$i;

    invoke-virtual {v1}, Lyl0/k$i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lrg0/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    instance-of p1, p1, Lyl0/k$h;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->l(Lyl0/j;)Lrg0/e;

    move-result-object p1

    iget-object v1, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v1, Lyl0/k$h;

    invoke-virtual {v1}, Lyl0/k$h;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lyl0/j$a;->x:Lyl0/k;

    check-cast v2, Lyl0/k$h;

    invoke-virtual {v2}, Lyl0/k$h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lrg0/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lyl0/j$a;->y:Lyl0/j;

    invoke-static {p1}, Lyl0/j;->j(Lyl0/j;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyl0/f$a;->a:Lyl0/f$a;

    const/16 v2, 0x8

    iput v2, p0, Lyl0/j$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    :goto_0
    return-object v0

    :cond_9
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
