.class final Llf2/i$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf2/i;->F(Lpf2/c;)V
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
    c = "com.whoop.sleep.coach.presentation.selectSchedule.SleepWakeTimeSchedulingViewModel$sendViewEvent$1"
    f = "SleepWakeTimeSchedulingViewModel.kt"
    l = {
        0x34,
        0x35,
        0x37,
        0x3a,
        0x3b,
        0x3e,
        0x3f,
        0x40,
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field w:I

.field final synthetic x:Lpf2/c;

.field final synthetic y:Llf2/i;

.field final synthetic z:J


# direct methods
.method public constructor <init>(Lpf2/c;Llf2/i;JJLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpf2/c;",
            "Llf2/i;",
            "JJ",
            "Lq83/d<",
            "-",
            "Llf2/i$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llf2/i$a;->x:Lpf2/c;

    iput-object p2, p0, Llf2/i$a;->y:Llf2/i;

    iput-wide p3, p0, Llf2/i$a;->z:J

    iput-wide p5, p0, Llf2/i$a;->E:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Llf2/i$a;

    iget-object v1, p0, Llf2/i$a;->x:Lpf2/c;

    iget-object v2, p0, Llf2/i$a;->y:Llf2/i;

    iget-wide v3, p0, Llf2/i$a;->z:J

    iget-wide v5, p0, Llf2/i$a;->E:J

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Llf2/i$a;-><init>(Lpf2/c;Llf2/i;JJLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llf2/i$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llf2/i$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llf2/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llf2/i$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llf2/i$a;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llf2/i$a;->x:Lpf2/c;

    instance-of v1, p1, Lpf2/c$m;

    if-eqz v1, :cond_2

    check-cast p1, Lpf2/c$m;

    invoke-virtual {p1}, Lpf2/c$m;->a()Lpf2/d;

    move-result-object p1

    instance-of p1, p1, Lpf2/d$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Llf2/i$a;->y:Llf2/i;

    invoke-static {p1}, Llf2/i;->w(Llf2/i;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lpf2/c$j;->a:Lpf2/c$j;

    const/4 v2, 0x1

    iput v2, p0, Llf2/i$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_0
    iget-wide v1, p0, Llf2/i$a;->z:J

    const/4 p1, 0x2

    iput p1, p0, Llf2/i$a;->w:I

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_1
    iget-object p1, p0, Llf2/i$a;->y:Llf2/i;

    invoke-static {p1}, Llf2/i;->w(Llf2/i;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Llf2/i$a;->x:Lpf2/c;

    const/4 v2, 0x3

    iput v2, p0, Llf2/i$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto/16 :goto_5

    :cond_2
    instance-of v1, p1, Lpf2/c$i;

    if-eqz v1, :cond_4

    iget-wide v1, p0, Llf2/i$a;->E:J

    const/4 p1, 0x4

    iput p1, p0, Llf2/i$a;->w:I

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_5

    :cond_3
    :goto_2
    iget-object p1, p0, Llf2/i$a;->y:Llf2/i;

    invoke-static {p1}, Llf2/i;->w(Llf2/i;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Llf2/i$a;->x:Lpf2/c;

    const/4 v2, 0x5

    iput v2, p0, Llf2/i$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_4
    sget-object v1, Lpf2/c$f;->a:Lpf2/c$f;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Llf2/i$a;->y:Llf2/i;

    invoke-static {p1}, Llf2/i;->w(Llf2/i;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lpf2/c$j;->a:Lpf2/c$j;

    const/4 v2, 0x6

    iput v2, p0, Llf2/i$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_5

    :cond_5
    :goto_3
    iget-wide v1, p0, Llf2/i$a;->z:J

    const/4 p1, 0x7

    iput p1, p0, Llf2/i$a;->w:I

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    iget-object p1, p0, Llf2/i$a;->y:Llf2/i;

    invoke-static {p1}, Llf2/i;->w(Llf2/i;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Llf2/i$a;->x:Lpf2/c;

    const/16 v2, 0x8

    iput v2, p0, Llf2/i$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_7
    iget-object p1, p0, Llf2/i$a;->y:Llf2/i;

    invoke-static {p1}, Llf2/i;->w(Llf2/i;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Llf2/i$a;->x:Lpf2/c;

    const/16 v2, 0x9

    iput v2, p0, Llf2/i$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_5
    return-object v0

    :cond_8
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method
