.class final Lvg0/p$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/p;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lvg0/q;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.CreateMxmSupportTicketInteractor$interact$1$1"
    f = "CreateMxmSupportTicketInteractor.kt"
    l = {
        0x2e,
        0x32,
        0x36,
        0x3a,
        0x3c,
        0x41,
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/p;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvg0/o;


# direct methods
.method public constructor <init>(Lvg0/o;Lvg0/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/o;",
            "Lvg0/p;",
            "Lq83/d<",
            "-",
            "Lvg0/p$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/p$b;->z:Lvg0/o;

    iput-object p2, p0, Lvg0/p$b;->E:Lvg0/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lvg0/p$b;

    iget-object v1, p0, Lvg0/p$b;->z:Lvg0/o;

    iget-object v2, p0, Lvg0/p$b;->E:Lvg0/p;

    invoke-direct {v0, v1, v2, p2}, Lvg0/p$b;-><init>(Lvg0/o;Lvg0/p;Lq83/d;)V

    iput-object p1, v0, Lvg0/p$b;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvg0/p$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/p$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/p$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/p$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lvg0/p$b;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvg0/p$b;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lvg0/p$b;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_7

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_5

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvg0/p$b;->z:Lvg0/o;

    invoke-virtual {p1}, Lvg0/o;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lvg0/q$a;

    const-string v2, "Conversation fingerprint is missing"

    invoke-direct {p1, v2}, Lvg0/q$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/p$b;->y:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lvg0/p$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_0
    move-object v10, p0

    goto/16 :goto_6

    :cond_0
    :goto_1
    return-object v3

    :cond_1
    iget-object p1, p0, Lvg0/p$b;->z:Lvg0/o;

    invoke-virtual {p1}, Lvg0/o;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lvg0/q$a;

    const-string v2, "Turn ID is missing"

    invoke-direct {p1, v2}, Lvg0/q$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/p$b;->y:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lvg0/p$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    return-object v3

    :cond_3
    iget-object p1, p0, Lvg0/p$b;->z:Lvg0/o;

    invoke-virtual {p1}, Lvg0/o;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Lvg0/q$a;

    const-string v2, "Action ID is missing"

    invoke-direct {p1, v2}, Lvg0/q$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/p$b;->y:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lvg0/p$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_0

    :cond_4
    :goto_3
    return-object v3

    :cond_5
    sget-object p1, Lvg0/q$b;->a:Lvg0/q$b;

    iput-object v0, p0, Lvg0/p$b;->y:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, p0, Lvg0/p$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_0

    :cond_6
    :goto_4
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lvg0/p$b;->E:Lvg0/p;

    invoke-static {p1}, Lvg0/p;->d(Lvg0/p;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lvg0/p$b$a;

    iget-object p1, p0, Lvg0/p$b;->E:Lvg0/p;

    iget-object v2, p0, Lvg0/p$b;->z:Lvg0/o;

    invoke-direct {v9, p1, v2, v4}, Lvg0/p$b$a;-><init>(Lvg0/p;Lvg0/o;Lq83/d;)V

    iput-object v0, p0, Lvg0/p$b;->y:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lvg0/p$b;->x:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_8

    sget-object p1, Lvg0/q$c;->a:Lvg0/q$c;

    iput-object v4, v10, Lvg0/p$b;->y:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/p$b;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v10, Lvg0/p$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_6

    :cond_8
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_a

    new-instance v2, Lvg0/q$a;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lvg0/q$a;-><init>(Ljava/lang/String;)V

    iput-object v4, v10, Lvg0/p$b;->y:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/p$b;->w:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, v10, Lvg0/p$b;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_6
    return-object v1

    :cond_9
    :goto_7
    return-object v3

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
