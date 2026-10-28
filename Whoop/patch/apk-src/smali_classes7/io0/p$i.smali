.class final Lio0/p$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/p;->H(Lio0/u;Ljava/lang/String;)Lec3/l;
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
        "Lio0/p$a;",
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
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$savePersonalIntake$1"
    f = "ClinicianVideoSchedulingIntakeInteractor.kt"
    l = {
        0x22b,
        0x22e,
        0x231,
        0x235,
        0x236,
        0x236
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lio0/p;

.field final synthetic H:Lio0/u;

.field final synthetic I:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lio0/p;Lio0/u;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio0/p;",
            "Lio0/u;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio0/p$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio0/p$i;->G:Lio0/p;

    iput-object p2, p0, Lio0/p$i;->H:Lio0/u;

    iput-object p3, p0, Lio0/p$i;->I:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio0/p$i;

    iget-object v1, p0, Lio0/p$i;->G:Lio0/p;

    iget-object v2, p0, Lio0/p$i;->H:Lio0/u;

    iget-object v3, p0, Lio0/p$i;->I:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lio0/p$i;-><init>(Lio0/p;Lio0/u;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio0/p$i;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio0/p$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio0/p$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio0/p$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio0/p$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lio0/p$i;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio0/p$i;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lio0/p$i;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v2, p0, Lio0/p$i;->x:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, p0, Lio0/p$i;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_4

    :pswitch_1
    iget-object v0, p0, Lio0/p$i;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lio0/p$i;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_6

    :pswitch_2
    iget-object v2, p0, Lio0/p$i;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_3

    :pswitch_3
    iget-object v0, p0, Lio0/p$i;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lio0/p$a$h;->a:Lio0/p$a$h;

    iput-object v0, p0, Lio0/p$i;->F:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lio0/p$i;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_0
    move-object v10, p0

    goto/16 :goto_5

    :cond_0
    :goto_1
    iget-object p1, p0, Lio0/p$i;->G:Lio0/p;

    iget-object v2, p0, Lio0/p$i;->H:Lio0/u;

    invoke-static {p1, v2}, Lio0/p;->n(Lio0/p;Lio0/u;)Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lio0/p$i;->G:Lio0/p;

    invoke-static {p1}, Lio0/p;->h(Lio0/p;)Ltr2/n;

    move-result-object p1

    const-string v2, "savePersonalIntake: required fields missing, cannot build request"

    const/4 v5, 0x0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {p1, v2, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lio0/p$a$e;->a:Lio0/p$a$e;

    iput-object v4, p0, Lio0/p$i;->F:Ljava/lang/Object;

    iput-object v4, p0, Lio0/p$i;->w:Ljava/lang/Object;

    iput v5, p0, Lio0/p$i;->z:I

    const/4 v2, 0x2

    iput v2, p0, Lio0/p$i;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_2
    return-object v3

    :cond_2
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lio0/p$i;->G:Lio0/p;

    invoke-static {v2}, Lio0/p;->h(Lio0/p;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lio0/p$i$a;

    iget-object v2, p0, Lio0/p$i;->G:Lio0/p;

    iget-object v7, p0, Lio0/p$i;->I:Ljava/lang/String;

    invoke-direct {v9, v2, v7, p1, v4}, Lio0/p$i$a;-><init>(Lio0/p;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;Lq83/d;)V

    iput-object v0, p0, Lio0/p$i;->F:Ljava/lang/Object;

    iput-object v4, p0, Lio0/p$i;->w:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lio0/p$i;->E:I

    const/4 v7, 0x0

    const-string v8, "Failed to save personal intake"

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_3
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_4

    new-instance p1, Lio0/p$a$c;

    sget-object v2, Lio0/o$i;->a:Lio0/o$i;

    invoke-direct {p1, v2}, Lio0/p$a$c;-><init>(Lio0/o;)V

    iput-object v4, v10, Lio0/p$i;->F:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->w:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->x:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v10, Lio0/p$i;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_4
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_7

    iget-object v2, v10, Lio0/p$i;->G:Lio0/p;

    check-cast p1, Lu02/a$b;

    iput-object v4, v10, Lio0/p$i;->F:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->w:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->x:Ljava/lang/Object;

    iput-object v0, v10, Lio0/p$i;->y:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v10, Lio0/p$i;->E:I

    invoke-static {v2, p1, p0}, Lio0/p;->m(Lio0/p;Lu02/a$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    iput-object v4, v10, Lio0/p$i;->F:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->w:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->x:Ljava/lang/Object;

    iput-object v4, v10, Lio0/p$i;->y:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v10, Lio0/p$i;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_5
    return-object v1

    :cond_6
    :goto_6
    return-object v3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
