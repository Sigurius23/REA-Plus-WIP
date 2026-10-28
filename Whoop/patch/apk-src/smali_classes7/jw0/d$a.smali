.class final Ljw0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljw0/d;->f(Ljava/lang/String;)Lec3/l;
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
    c = "com.whoop.core.details.sleep.domain.SleepDetailsDialogInteractor$deleteSleep$1"
    f = "SleepDetailsDialogInteractor.kt"
    l = {
        0x1e,
        0x1f,
        0x20,
        0x21,
        0x22,
        0x23,
        0x25
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljw0/d;

.field final synthetic z:Ljava/lang/String;


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
            "Ljw0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljw0/d$a;->y:Ljw0/d;

    iput-object p2, p0, Ljw0/d$a;->z:Ljava/lang/String;

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

    new-instance v0, Ljw0/d$a;

    iget-object v1, p0, Ljw0/d$a;->y:Ljw0/d;

    iget-object v2, p0, Ljw0/d$a;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Ljw0/d$a;-><init>(Ljw0/d;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ljw0/d$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ljw0/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljw0/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljw0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljw0/d$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ljw0/d$a;->w:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ljw0/c$d;->a:Ljw0/c$d;

    iput-object v0, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    iput v3, p0, Ljw0/d$a;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_0
    iget-object p1, p0, Ljw0/d$a;->y:Ljw0/d;

    invoke-static {p1}, Ljw0/d;->c(Ljw0/d;)Llw0/a;

    move-result-object p1

    iget-object v2, p0, Ljw0/d$a;->z:Ljava/lang/String;

    iput-object v0, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    iput v4, p0, Ljw0/d$a;->w:I

    invoke-virtual {p1, v2, p0}, Llw0/a;->h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_5

    :cond_1
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Ljw0/d$a;->y:Ljw0/d;

    invoke-static {p1}, Ljw0/d;->b(Ljw0/d;)Lwm0/a;

    move-result-object p1

    iput-object v0, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Ljw0/d$a;->w:I

    invoke-static {p1, v5, p0, v3, v5}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_5

    :cond_2
    :goto_2
    sget-object p1, Ljw0/c$b;->a:Ljw0/c$b;

    iput-object v0, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, p0, Ljw0/d$a;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_3
    iget-object p1, p0, Ljw0/d$a;->y:Ljw0/d;

    invoke-static {p1}, Ljw0/d;->d(Ljw0/d;)J

    move-result-wide v2

    iput-object v0, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Ljw0/d$a;->w:I

    invoke-static {v2, v3, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    sget-object p1, Ljw0/c$c;->a:Ljw0/c$c;

    iput-object v5, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Ljw0/d$a;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_5
    new-instance p1, Ljw0/c$a;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lvv0/b;->w:I

    invoke-direct {v2, v3, v5, v4, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lvv0/b;->B:I

    invoke-direct {v3, v6, v5, v4, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v2, v3}, Ljw0/c$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    iput-object v5, p0, Ljw0/d$a;->x:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Ljw0/d$a;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_5
    return-object v1

    :cond_6
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

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
