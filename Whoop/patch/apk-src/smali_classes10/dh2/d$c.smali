.class final Ldh2/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldh2/d;->m()Lec3/l;
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
        "Ldh2/c;",
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
    c = "com.whoop.stealthmode.interactor.StealthModeInteractor$getStealthMetricsStatus$1"
    f = "StealthModeInteractor.kt"
    l = {
        0x30,
        0x31,
        0x3a,
        0x3d,
        0x41,
        0x43,
        0x46
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldh2/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldh2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldh2/d;",
            "Lq83/d<",
            "-",
            "Ldh2/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldh2/d$c;->E:Ldh2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Ldh2/d$c;

    iget-object v1, p0, Ldh2/d$c;->E:Ldh2/d;

    invoke-direct {v0, v1, p2}, Ldh2/d$c;-><init>(Ldh2/d;Lq83/d;)V

    iput-object p1, v0, Ldh2/d$c;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ldh2/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldh2/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldh2/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldh2/d$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ldh2/d$c;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldh2/d$c;->y:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Ldh2/d$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    :pswitch_1
    iget-object v0, p0, Ldh2/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_5

    :pswitch_2
    iget-object v2, p0, Ldh2/d$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v4, p0, Ldh2/d$c;->w:Ljava/lang/Object;

    check-cast v4, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_3

    :pswitch_3
    iget-object v2, p0, Ldh2/d$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v4, p0, Ldh2/d$c;->w:Ljava/lang/Object;

    check-cast v4, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ldh2/c$d;->a:Ldh2/c$d;

    iput-object v0, p0, Ldh2/d$c;->z:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Ldh2/d$c;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    move-object v9, p0

    goto/16 :goto_4

    :cond_0
    :goto_0
    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Ldh2/d$c;->E:Ldh2/d;

    invoke-static {p1}, Ldh2/d;->e(Ldh2/d;)Ltr2/n;

    move-result-object v5

    new-instance v8, Ldh2/d$c$a;

    iget-object p1, p0, Ldh2/d$c;->E:Ldh2/d;

    invoke-direct {v8, p1, v3}, Ldh2/d$c$a;-><init>(Ldh2/d;Lq83/d;)V

    iput-object v0, p0, Ldh2/d$c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Ldh2/d$c;->y:I

    const/4 v6, 0x0

    const-string v7, "getStealthModeBff"

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    move-object v4, p1

    check-cast v4, Lu02/a;

    instance-of p1, v4, Lu02/a$c;

    if-eqz p1, :cond_5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, v9, Ldh2/d$c;->E:Ldh2/d;

    invoke-static {p1}, Ldh2/d;->d(Ldh2/d;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v5, "body-comp"

    invoke-interface {p1, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v9, Ldh2/d$c;->E:Ldh2/d;

    sget-object v5, Leh2/a;->BODY_COMP:Leh2/a;

    iput-object v0, v9, Ldh2/d$c;->z:Ljava/lang/Object;

    iput-object v4, v9, Ldh2/d$c;->w:Ljava/lang/Object;

    iput-object v2, v9, Ldh2/d$c;->x:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v9, Ldh2/d$c;->y:I

    invoke-static {p1, v2, v5, p0}, Ldh2/d;->a(Ldh2/d;Ljava/util/List;Leh2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_4

    :cond_2
    :goto_2
    iget-object p1, v9, Ldh2/d$c;->E:Ldh2/d;

    invoke-static {p1}, Ldh2/d;->c(Ldh2/d;)Lwe1/a;

    move-result-object p1

    sget-object v5, Lcom/whoop/entitlements/Entitlement;->HEALTHSPAN:Lcom/whoop/entitlements/Entitlement;

    invoke-interface {p1, v5}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v9, Ldh2/d$c;->E:Ldh2/d;

    sget-object v5, Leh2/a;->HEALTHSPAN:Leh2/a;

    iput-object v0, v9, Ldh2/d$c;->z:Ljava/lang/Object;

    iput-object v4, v9, Ldh2/d$c;->w:Ljava/lang/Object;

    iput-object v2, v9, Ldh2/d$c;->x:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v9, Ldh2/d$c;->y:I

    invoke-static {p1, v2, v5, p0}, Ldh2/d;->a(Ldh2/d;Ljava/util/List;Leh2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    move-object p1, v2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Ldh2/c$b;

    check-cast v4, Lu02/a$c;

    invoke-virtual {v4}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-direct {p1, v4, v2}, Ldh2/c$b;-><init>(ZLjava/util/List;)V

    iput-object v3, v9, Ldh2/d$c;->z:Ljava/lang/Object;

    iput-object v3, v9, Ldh2/d$c;->w:Ljava/lang/Object;

    iput-object v3, v9, Ldh2/d$c;->x:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v9, Ldh2/d$c;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_4
    new-instance p1, Ldh2/c$a;

    check-cast v4, Lu02/a$c;

    invoke-virtual {v4}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-direct {p1, v2}, Ldh2/c$a;-><init>(Z)V

    iput-object v3, v9, Ldh2/d$c;->z:Ljava/lang/Object;

    iput-object v3, v9, Ldh2/d$c;->w:Ljava/lang/Object;

    iput-object v3, v9, Ldh2/d$c;->x:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v9, Ldh2/d$c;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_5
    instance-of p1, v4, Lu02/a$b;

    if-eqz p1, :cond_7

    sget-object p1, Ldh2/c$c;->a:Ldh2/c$c;

    iput-object v3, v9, Ldh2/d$c;->z:Ljava/lang/Object;

    iput-object v3, v9, Ldh2/d$c;->w:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v9, Ldh2/d$c;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_4
    return-object v1

    :cond_6
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
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
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
