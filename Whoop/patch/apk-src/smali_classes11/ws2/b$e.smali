.class final Lws2/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lws2/b;->interact(Lec3/l;)Lec3/l;
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
        "Lws2/e;",
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
    c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$interact$1$1"
    f = "CustomizePlanApiInteractor.kt"
    l = {
        0x23,
        0x23,
        0x26,
        0x27,
        0x27,
        0x2b,
        0x2c,
        0x2c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lws2/b;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lws2/a;


# direct methods
.method public constructor <init>(Lws2/a;Lws2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lws2/a;",
            "Lws2/b;",
            "Lq83/d<",
            "-",
            "Lws2/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lws2/b$e;->z:Lws2/a;

    iput-object p2, p0, Lws2/b$e;->E:Lws2/b;

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

    new-instance v0, Lws2/b$e;

    iget-object v1, p0, Lws2/b$e;->z:Lws2/a;

    iget-object v2, p0, Lws2/b$e;->E:Lws2/b;

    invoke-direct {v0, v1, v2, p2}, Lws2/b$e;-><init>(Lws2/a;Lws2/b;Lq83/d;)V

    iput-object p1, v0, Lws2/b$e;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lws2/b$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lws2/b$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lws2/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lws2/b$e;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lws2/b$e;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lws2/b$e;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lws2/b$e;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    iget-object v0, p0, Lws2/b$e;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    iget-object v0, p0, Lws2/b$e;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lws2/b$e;->z:Lws2/a;

    instance-of v2, p1, Lws2/a$b;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lws2/b$e;->E:Lws2/b;

    check-cast p1, Lws2/a$b;

    invoke-virtual {p1}, Lws2/a$b;->a()Ljava/util/List;

    move-result-object p1

    iput-object v3, p0, Lws2/b$e;->y:Ljava/lang/Object;

    iput-object v0, p0, Lws2/b$e;->w:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lws2/b$e;->x:I

    invoke-static {v2, p1, p0}, Lws2/b;->f(Lws2/b;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_0
    iput-object v3, p0, Lws2/b$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Lws2/b$e;->w:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lws2/b$e;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_5

    :cond_1
    instance-of v2, p1, Lws2/a$c;

    if-eqz v2, :cond_4

    sget-object p1, Lws2/e$l;->a:Lws2/e$l;

    iput-object v0, p0, Lws2/b$e;->y:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lws2/b$e;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_5

    :cond_2
    :goto_1
    iget-object p1, p0, Lws2/b$e;->E:Lws2/b;

    iget-object v2, p0, Lws2/b$e;->z:Lws2/a;

    check-cast v2, Lws2/a$c;

    invoke-virtual {v2}, Lws2/a$c;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lws2/b$e;->z:Lws2/a;

    check-cast v4, Lws2/a$c;

    invoke-virtual {v4}, Lws2/a$c;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    move-result-object v4

    iget-object v5, p0, Lws2/b$e;->z:Lws2/a;

    check-cast v5, Lws2/a$c;

    invoke-virtual {v5}, Lws2/a$c;->c()Ljava/lang/String;

    move-result-object v5

    iput-object v3, p0, Lws2/b$e;->y:Ljava/lang/Object;

    iput-object v0, p0, Lws2/b$e;->w:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, p0, Lws2/b$e;->x:I

    invoke-static {p1, v2, v4, v5, p0}, Lws2/b;->i(Lws2/b;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_2
    iput-object v3, p0, Lws2/b$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Lws2/b$e;->w:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, p0, Lws2/b$e;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_4
    instance-of p1, p1, Lws2/a$a;

    if-eqz p1, :cond_8

    sget-object p1, Lws2/e$h;->a:Lws2/e$h;

    iput-object v0, p0, Lws2/b$e;->y:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Lws2/b$e;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_3
    iget-object p1, p0, Lws2/b$e;->E:Lws2/b;

    iget-object v2, p0, Lws2/b$e;->z:Lws2/a;

    check-cast v2, Lws2/a$a;

    invoke-virtual {v2}, Lws2/a$a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lws2/b$e;->z:Lws2/a;

    check-cast v4, Lws2/a$a;

    invoke-virtual {v4}, Lws2/a$a;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v4

    iget-object v5, p0, Lws2/b$e;->z:Lws2/a;

    check-cast v5, Lws2/a$a;

    invoke-virtual {v5}, Lws2/a$a;->b()Ljava/lang/String;

    move-result-object v5

    iput-object v3, p0, Lws2/b$e;->y:Ljava/lang/Object;

    iput-object v0, p0, Lws2/b$e;->w:Ljava/lang/Object;

    const/4 v6, 0x7

    iput v6, p0, Lws2/b$e;->x:I

    invoke-static {p1, v2, v4, v5, p0}, Lws2/b;->c(Lws2/b;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    iput-object v3, p0, Lws2/b$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Lws2/b$e;->w:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, p0, Lws2/b$e;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_5
    return-object v1

    :cond_7
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method
