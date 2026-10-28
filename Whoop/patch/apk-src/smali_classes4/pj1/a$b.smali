.class final Lpj1/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpj1/a;->c()V
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
    c = "com.whoop.healthconnect.repository.HealthConnectChecker$readRecords$1"
    f = "HealthConnectChecker.kt"
    l = {
        0x15,
        0x16,
        0x17,
        0x18,
        0x19,
        0x1a,
        0x1b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lpj1/a;


# direct methods
.method public constructor <init>(Lpj1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj1/a;",
            "Lq83/d<",
            "-",
            "Lpj1/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpj1/a$b;->z:Lpj1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lpj1/a$b;

    iget-object v0, p0, Lpj1/a$b;->z:Lpj1/a;

    invoke-direct {p1, v0, p2}, Lpj1/a$b;-><init>(Lpj1/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lpj1/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpj1/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpj1/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpj1/a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpj1/a$b;->y:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v0, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget v1, p0, Lpj1/a$b;->x:I

    iget-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget v1, p0, Lpj1/a$b;->x:I

    iget-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget v1, p0, Lpj1/a$b;->x:I

    iget-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    iget v1, p0, Lpj1/a$b;->x:I

    iget-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    iget v1, p0, Lpj1/a$b;->x:I

    iget-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    iget v1, p0, Lpj1/a$b;->x:I

    iget-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpj1/a$b;->z:Lpj1/a;

    invoke-static {p1}, Lpj1/a;->a(Lpj1/a;)Lpj1/b;

    move-result-object p1

    iput-object p1, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 v2, 0x1

    iput v2, p0, Lpj1/a$b;->y:I

    invoke-virtual {p1, p0}, Lpj1/b;->k(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    goto :goto_6

    :cond_0
    move-object v2, p1

    :goto_0
    iput-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 p1, 0x2

    iput p1, p0, Lpj1/a$b;->y:I

    invoke-virtual {v2, p0}, Lpj1/b;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto :goto_6

    :cond_1
    :goto_1
    iput-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 p1, 0x3

    iput p1, p0, Lpj1/a$b;->y:I

    invoke-virtual {v2, p0}, Lpj1/b;->q(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_6

    :cond_2
    :goto_2
    iput-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 p1, 0x4

    iput p1, p0, Lpj1/a$b;->y:I

    invoke-virtual {v2, p0}, Lpj1/b;->o(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_6

    :cond_3
    :goto_3
    iput-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 p1, 0x5

    iput p1, p0, Lpj1/a$b;->y:I

    invoke-virtual {v2, p0}, Lpj1/b;->n(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_6

    :cond_4
    :goto_4
    iput-object v2, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 p1, 0x6

    iput p1, p0, Lpj1/a$b;->y:I

    invoke-virtual {v2, p0}, Lpj1/b;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    const/4 p1, 0x0

    iput-object p1, p0, Lpj1/a$b;->w:Ljava/lang/Object;

    iput v1, p0, Lpj1/a$b;->x:I

    const/4 p1, 0x7

    iput p1, p0, Lpj1/a$b;->y:I

    invoke-virtual {v2, p0}, Lpj1/b;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_6
    return-object v0

    :cond_6
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
