.class final Lmx2/h$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmx2/h;->m(Lmx2/b;)Lec3/l;
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
        "Lmx2/h$b;",
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
    c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$handleConfirmAction$1"
    f = "CampaignDetailsInteractor.kt"
    l = {
        0x48,
        0x4c,
        0x4e,
        0x50,
        0x55,
        0x5d,
        0x61
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lmx2/b;

.field final synthetic H:Lmx2/h;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmx2/b;Lmx2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx2/b;",
            "Lmx2/h;",
            "Lq83/d<",
            "-",
            "Lmx2/h$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmx2/h$e;->G:Lmx2/b;

    iput-object p2, p0, Lmx2/h$e;->H:Lmx2/h;

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

    new-instance v0, Lmx2/h$e;

    iget-object v1, p0, Lmx2/h$e;->G:Lmx2/b;

    iget-object v2, p0, Lmx2/h$e;->H:Lmx2/h;

    invoke-direct {v0, v1, v2, p2}, Lmx2/h$e;-><init>(Lmx2/b;Lmx2/h;Lq83/d;)V

    iput-object p1, v0, Lmx2/h$e;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lmx2/h$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmx2/h$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmx2/h$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmx2/h$e;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmx2/h$e;->E:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lmx2/h$e;->z:Ljava/lang/Object;

    check-cast v0, Lmx2/m;

    :pswitch_1
    iget-object v0, p0, Lmx2/h$e;->y:Ljava/lang/Object;

    check-cast v0, Lax2/b;

    iget-object v0, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    check-cast v0, Lmx2/m;

    goto :goto_0

    :pswitch_2
    iget-object v2, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    check-cast v2, Lmx2/m;

    iget-object v2, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    check-cast v2, Lmx2/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_3
    iget-object v2, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    check-cast v2, Lmx2/m;

    iget-object v2, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    check-cast v2, Lmx2/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :goto_0
    :pswitch_4
    iget-object v0, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    check-cast v0, Lmx2/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-interface {p1}, Lmx2/b;->e()Lmx2/i;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v2, Lmx2/h$b$m;

    iget-object v4, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-static {v4}, Lmx2/g;->h(Lmx2/b;)Lmx2/b;

    move-result-object v4

    invoke-direct {v2, v4, p1}, Lmx2/h$b$m;-><init>(Lmx2/b;Lmx2/i;)V

    iput-object v3, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lmx2/h$e;->E:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-interface {p1}, Lmx2/b;->a()Lmx2/m;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v2, Lmx2/h$b$n;

    invoke-virtual {p1}, Lmx2/m;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lmx2/m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v4, p1}, Lmx2/h$b$n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lmx2/h$e;->E:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_3

    :cond_1
    sget-object p1, Lmx2/h$b$i;->a:Lmx2/h$b$i;

    iput-object v0, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lmx2/h$e;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_3

    :cond_2
    :goto_1
    iget-object p1, p0, Lmx2/h$e;->H:Lmx2/h;

    invoke-static {p1}, Lmx2/h;->g(Lmx2/h;)Lkx2/b;

    move-result-object p1

    iget-object v2, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-virtual {p1, v2}, Lkx2/b;->c(Lmx2/b;)Lax2/a;

    move-result-object p1

    iput-object v0, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, p0, Lmx2/h$e;->E:I

    invoke-interface {p1, p0}, Lax2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    check-cast p1, Lax2/b;

    instance-of v2, p1, Lax2/b$b;

    if-eqz v2, :cond_5

    iget-object p1, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-interface {p1}, Lmx2/b;->c()Lmx2/m;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v2, Lmx2/h$b$b;

    iget-object v4, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-interface {v4}, Lmx2/b;->b()I

    move-result v4

    invoke-virtual {p1}, Lmx2/m;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lmx2/m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v4, v5, p1}, Lmx2/h$b$b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    iput-object v3, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->z:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lmx2/h$e;->E:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_4
    sget-object p1, Lmx2/h$b$a;->a:Lmx2/h$b$a;

    iput-object v3, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->z:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Lmx2/h$e;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_5
    sget-object v2, Lax2/b$a;->a:Lax2/b$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lmx2/h$b$l;

    iget-object v2, p0, Lmx2/h$e;->G:Lmx2/b;

    invoke-direct {p1, v2}, Lmx2/h$b$l;-><init>(Lmx2/b;)V

    iput-object v3, p0, Lmx2/h$e;->F:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lmx2/h$e;->y:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Lmx2/h$e;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
