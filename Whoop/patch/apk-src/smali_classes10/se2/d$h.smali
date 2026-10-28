.class final Lse2/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lse2/c;",
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
    c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$2$2"
    f = "TurnoffAlarmWarningInteractor.kt"
    l = {
        0x39,
        0x3b,
        0x42,
        0x44,
        0x47,
        0x48,
        0x4c,
        0x50
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lse2/a;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lse2/d;


# direct methods
.method public constructor <init>(Lse2/d;Lse2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lse2/d;",
            "Lse2/a;",
            "Lq83/d<",
            "-",
            "Lse2/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lse2/d$h;->z:Lse2/d;

    iput-object p2, p0, Lse2/d$h;->E:Lse2/a;

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

    new-instance v0, Lse2/d$h;

    iget-object v1, p0, Lse2/d$h;->z:Lse2/d;

    iget-object v2, p0, Lse2/d$h;->E:Lse2/a;

    invoke-direct {v0, v1, v2, p2}, Lse2/d$h;-><init>(Lse2/d;Lse2/a;Lq83/d;)V

    iput-object p1, v0, Lse2/d$h;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lse2/d$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lse2/d$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lse2/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lse2/d$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lse2/d$h;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lse2/d$h;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lse2/d$h;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lse2/d$h;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    :goto_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v9, p0

    goto/16 :goto_6

    :pswitch_2
    iget-object v2, p0, Lse2/d$h;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    goto :goto_0

    :pswitch_3
    iget-object v2, p0, Lse2/d$h;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v9, p0

    goto/16 :goto_5

    :pswitch_4
    iget-object v2, p0, Lse2/d$h;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    goto :goto_0

    :pswitch_5
    iget-object v2, p0, Lse2/d$h;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    goto :goto_0

    :goto_1
    move-object v9, p0

    goto/16 :goto_8

    :pswitch_6
    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v9, p0

    goto :goto_3

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lse2/c$g;->a:Lse2/c$g;

    iput-object v0, p0, Lse2/d$h;->y:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lse2/d$h;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    move-object v9, p0

    goto/16 :goto_7

    :cond_0
    :goto_2
    :try_start_3
    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lse2/d$h;->z:Lse2/d;

    invoke-static {p1}, Lse2/d;->g(Lse2/d;)Ltr2/n;

    move-result-object v5

    new-instance v8, Lse2/d$h$a;

    iget-object p1, p0, Lse2/d$h;->E:Lse2/a;

    iget-object v2, p0, Lse2/d$h;->z:Lse2/d;

    invoke-direct {v8, p1, v2, v3}, Lse2/d$h$a;-><init>(Lse2/a;Lse2/d;Lq83/d;)V

    iput-object v0, p0, Lse2/d$h;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lse2/d$h;->x:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    move-object v9, p0

    :try_start_4
    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_7

    :cond_1
    :goto_3
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_6

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;->isEligible()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, v9, Lse2/d$h;->z:Lse2/d;

    invoke-static {p1}, Lse2/d;->j(Lse2/d;)Lci2/b;

    move-result-object p1

    invoke-interface {p1}, Lci2/b;->b()Lec3/t1;

    move-result-object p1

    invoke-interface {p1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljk0/d;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lst0/l;->getConnectionState()Lst0/f;

    move-result-object p1

    goto :goto_4

    :cond_2
    move-object p1, v3

    :goto_4
    sget-object v2, Lst0/n;->a:Lst0/n;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v9, Lse2/d$h;->z:Lse2/d;

    iput-object v0, v9, Lse2/d$h;->y:Ljava/lang/Object;

    iput-object v3, v9, Lse2/d$h;->w:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v9, Lse2/d$h;->x:I

    invoke-static {p1, v0, p0}, Lse2/d;->c(Lse2/d;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_3
    sget-object p1, Lse2/c$e;->a:Lse2/c$e;

    iput-object v0, v9, Lse2/d$h;->y:Ljava/lang/Object;

    iput-object v3, v9, Lse2/d$h;->w:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v9, Lse2/d$h;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_4
    iget-object p1, v9, Lse2/d$h;->z:Lse2/d;

    invoke-static {p1}, Lse2/d;->h(Lse2/d;)Lwm0/a;

    move-result-object p1

    const-string v2, "notifications"

    iput-object v0, v9, Lse2/d$h;->y:Ljava/lang/Object;

    iput-object v3, v9, Lse2/d$h;->w:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v9, Lse2/d$h;->x:I

    invoke-virtual {p1, v2, p0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_7

    :cond_5
    :goto_5
    sget-object p1, Lse2/c$f;->a:Lse2/c$f;

    iput-object v0, v9, Lse2/d$h;->y:Ljava/lang/Object;

    iput-object v3, v9, Lse2/d$h;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v9, Lse2/d$h;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_6
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_7

    sget-object p1, Lse2/c$b;->a:Lse2/c$b;

    iput-object v0, v9, Lse2/d$h;->y:Ljava/lang/Object;

    iput-object v3, v9, Lse2/d$h;->w:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v9, Lse2/d$h;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    :goto_6
    sget-object p1, Lse2/c$b;->a:Lse2/c$b;

    iput-object v3, v9, Lse2/d$h;->y:Ljava/lang/Object;

    iput-object v3, v9, Lse2/d$h;->w:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, v9, Lse2/d$h;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_7
    return-object v1

    :cond_8
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
