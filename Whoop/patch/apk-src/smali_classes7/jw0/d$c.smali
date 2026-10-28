.class final Ljw0/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljw0/d;->h(Ljava/lang/String;)Lec3/l;
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
        "Ljw0/c;",
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
    c = "com.whoop.core.details.sleep.domain.SleepDetailsDialogInteractor$napToSleep$1"
    f = "SleepDetailsDialogInteractor.kt"
    l = {
        0x2f,
        0x30,
        0x31,
        0x38,
        0x39,
        0x3a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Ljw0/d;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ljw0/d;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljw0/d;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljw0/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljw0/d$c;->F:Ljw0/d;

    iput-object p2, p0, Ljw0/d$c;->G:Ljava/lang/String;

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

    new-instance v0, Ljw0/d$c;

    iget-object v1, p0, Ljw0/d$c;->F:Ljw0/d;

    iget-object v2, p0, Ljw0/d$c;->G:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Ljw0/d$c;-><init>(Ljw0/d;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ljw0/d$c;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ljw0/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljw0/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljw0/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljw0/d$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ljw0/d$c;->z:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    goto :goto_0

    :pswitch_1
    iget v0, p0, Ljw0/d$c;->y:I

    iget-object v2, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    iget v0, p0, Ljw0/d$c;->y:I

    iget-object v2, p0, Ljw0/d$c;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    check-cast v4, Ljw0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v2

    move v2, v0

    move-object v0, v6

    goto/16 :goto_3

    :pswitch_3
    iget-object v0, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ljw0/c$e;->a:Ljw0/c$e;

    iput-object v0, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Ljw0/d$c;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    iget-object p1, p0, Ljw0/d$c;->F:Ljw0/d;

    invoke-static {p1}, Ljw0/d;->c(Ljw0/d;)Llw0/a;

    move-result-object p1

    iget-object v2, p0, Ljw0/d$c;->G:Ljava/lang/String;

    iput-object v0, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Ljw0/d$c;->z:I

    invoke-virtual {p1, v2, p0}, Llw0/a;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_5

    :cond_1
    :goto_2
    check-cast p1, Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    new-instance v4, Ljw0/c$f;

    invoke-virtual {p1}, Lcom/whoop/core/details/network/model/sleep/ErrorMessage;->getErrorTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/core/details/network/model/sleep/ErrorMessage;->getMessage()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v4, v5, p1}, Ljw0/c$f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    iput-object v0, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    iput-object v3, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    iput v2, p0, Ljw0/d$c;->y:I

    const/4 p1, 0x3

    iput p1, p0, Ljw0/d$c;->z:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_2
    iget-object v4, p0, Ljw0/d$c;->F:Ljw0/d;

    sget-object p1, Ljw0/c$g;->a:Ljw0/c$g;

    iput-object v3, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    iput-object v4, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    iput-object v0, p0, Ljw0/d$c;->x:Ljava/lang/Object;

    iput v2, p0, Ljw0/d$c;->y:I

    const/4 v5, 0x4

    iput v5, p0, Ljw0/d$c;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_3
    invoke-static {v4}, Ljw0/d;->d(Ljw0/d;)J

    move-result-wide v4

    iput-object v3, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    iput-object v0, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    iput-object v3, p0, Ljw0/d$c;->x:Ljava/lang/Object;

    iput v2, p0, Ljw0/d$c;->y:I

    const/4 p1, 0x5

    iput p1, p0, Ljw0/d$c;->z:I

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_5

    :cond_4
    move v6, v2

    move-object v2, v0

    move v0, v6

    :goto_4
    sget-object p1, Ljw0/c$c;->a:Ljw0/c$c;

    iput-object v3, p0, Ljw0/d$c;->E:Ljava/lang/Object;

    iput-object v3, p0, Ljw0/d$c;->w:Ljava/lang/Object;

    iput v0, p0, Ljw0/d$c;->y:I

    const/4 v0, 0x6

    iput v0, p0, Ljw0/d$c;->z:I

    invoke-interface {v2, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_5
    return-object v1

    :cond_5
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
