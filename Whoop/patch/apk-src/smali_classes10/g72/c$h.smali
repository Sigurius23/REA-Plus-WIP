.class final Lg72/c$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg72/c;->m(Lg72/b$e;)Lec3/l;
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
        "Lg72/b;",
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
    c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$performSave$1"
    f = "SageOnboardingInteractor.kt"
    l = {
        0x80,
        0x88,
        0x93,
        0xac,
        0xb4,
        0xba
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lg72/b$e;

.field final synthetic G:Lg72/c;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lg72/b$e;Lg72/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg72/b$e;",
            "Lg72/c;",
            "Lq83/d<",
            "-",
            "Lg72/c$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg72/c$h;->F:Lg72/b$e;

    iput-object p2, p0, Lg72/c$h;->G:Lg72/c;

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

    new-instance v0, Lg72/c$h;

    iget-object v1, p0, Lg72/c$h;->F:Lg72/b$e;

    iget-object v2, p0, Lg72/c$h;->G:Lg72/c;

    invoke-direct {v0, v1, v2, p2}, Lg72/c$h;-><init>(Lg72/b$e;Lg72/c;Lq83/d;)V

    iput-object p1, v0, Lg72/c$h;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lg72/c$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg72/c$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg72/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg72/c$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lg72/c$h;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lg72/c$h;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    :pswitch_0
    iget-object v0, p0, Lg72/c$h;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_1
    iget-object v0, p0, Lg72/c$h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;

    goto :goto_0

    :pswitch_2
    iget v2, p0, Lg72/c$h;->y:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lg72/b$e;

    iget-object v2, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v2}, Lg72/b$e;->a()Lg72/e;

    move-result-object v2

    iget-object v6, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v6}, Lg72/b$e;->b()Lg72/f;

    move-result-object v6

    invoke-direct {p1, v2, v6}, Lg72/b$e;-><init>(Lg72/e;Lg72/f;)V

    iput-object v0, p0, Lg72/c$h;->E:Ljava/lang/Object;

    iput v4, p0, Lg72/c$h;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_1
    move-object v11, p0

    goto/16 :goto_4

    :cond_0
    :goto_2
    iget-object p1, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {p1}, Lg72/b$e;->b()Lg72/f;

    move-result-object p1

    invoke-virtual {p1}, Lg72/f;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {p1}, Lg72/b$e;->b()Lg72/f;

    move-result-object p1

    invoke-virtual {p1}, Lg72/f;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lg72/b$c;

    iget-object v2, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v2}, Lg72/b$e;->a()Lg72/e;

    move-result-object v2

    iget-object v4, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v4}, Lg72/b$e;->b()Lg72/f;

    move-result-object v4

    invoke-direct {p1, v2, v4}, Lg72/b$c;-><init>(Lg72/e;Lg72/f;)V

    iput-object v5, p0, Lg72/c$h;->E:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lg72/c$h;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v11, p0

    goto/16 :goto_5

    :cond_2
    iget-object p1, p0, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {p1}, Lg72/b$e;->b()Lg72/f;

    move-result-object p1

    invoke-virtual {p1}, Lg72/f;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 v2, p1, 0x1

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lg72/c$h;->G:Lg72/c;

    invoke-static {p1}, Lg72/c;->e(Lg72/c;)Ltr2/n;

    move-result-object v7

    new-instance v10, Lg72/c$h$a;

    iget-object p1, p0, Lg72/c$h;->F:Lg72/b$e;

    iget-object v8, p0, Lg72/c$h;->G:Lg72/c;

    invoke-direct {v10, v2, p1, v8, v5}, Lg72/c$h$a;-><init>(ZLg72/b$e;Lg72/c;Lq83/d;)V

    iput-object v0, p0, Lg72/c$h;->E:Ljava/lang/Object;

    iput v2, p0, Lg72/c$h;->y:I

    const/4 p1, 0x3

    iput p1, p0, Lg72/c$h;->z:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_4

    :cond_3
    :goto_3
    check-cast p1, Lu02/a;

    instance-of v6, p1, Lu02/a$c;

    if-eqz v6, :cond_5

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;->getDoReadingsHaveHighVariance()Z

    move-result v6

    if-ne v6, v4, :cond_4

    invoke-virtual {p1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;->getVarianceDialog()Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;

    move-result-object v4

    if-eqz v4, :cond_4

    new-instance v4, Lg72/b$f;

    iget-object v6, v11, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v6}, Lg72/b$e;->a()Lg72/e;

    move-result-object v6

    iget-object v7, v11, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v7}, Lg72/b$e;->b()Lg72/f;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;->getVarianceDialog()Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;

    move-result-object p1

    invoke-direct {v4, v6, v7, p1}, Lg72/b$f;-><init>(Lg72/e;Lg72/f;Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;)V

    iput-object v5, v11, Lg72/c$h;->E:Ljava/lang/Object;

    iput-object v5, v11, Lg72/c$h;->w:Ljava/lang/Object;

    iput-object v5, v11, Lg72/c$h;->x:Ljava/lang/Object;

    iput v2, v11, Lg72/c$h;->y:I

    const/4 p1, 0x4

    iput p1, v11, Lg72/c$h;->z:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_4
    sget-object p1, Lg72/b$d;->a:Lg72/b$d;

    iput-object v5, v11, Lg72/c$h;->E:Ljava/lang/Object;

    iput-object v5, v11, Lg72/c$h;->w:Ljava/lang/Object;

    iput-object v5, v11, Lg72/c$h;->x:Ljava/lang/Object;

    iput v2, v11, Lg72/c$h;->y:I

    const/4 v2, 0x5

    iput v2, v11, Lg72/c$h;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_5
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_7

    new-instance p1, Lg72/b$c;

    iget-object v4, v11, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v4}, Lg72/b$e;->a()Lg72/e;

    move-result-object v4

    iget-object v6, v11, Lg72/c$h;->F:Lg72/b$e;

    invoke-virtual {v6}, Lg72/b$e;->b()Lg72/f;

    move-result-object v6

    invoke-direct {p1, v4, v6}, Lg72/b$c;-><init>(Lg72/e;Lg72/f;)V

    iput-object v5, v11, Lg72/c$h;->E:Ljava/lang/Object;

    iput-object v5, v11, Lg72/c$h;->w:Ljava/lang/Object;

    iput v2, v11, Lg72/c$h;->y:I

    const/4 v2, 0x6

    iput v2, v11, Lg72/c$h;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_4
    return-object v1

    :cond_6
    :goto_5
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
