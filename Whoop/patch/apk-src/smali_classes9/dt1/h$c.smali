.class final Ldt1/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->t(Ljava/time/Instant;)Lec3/l;
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
        "Ldt1/b;",
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
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$deleteRemoteAndLocal$1"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0x119,
        0x11a,
        0x121,
        0x122,
        0x123,
        0x127
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldt1/h;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljava/time/Instant;


# direct methods
.method public constructor <init>(Ljava/time/Instant;Ldt1/h;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/Instant;",
            "Ldt1/h;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ldt1/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$c;->z:Ljava/time/Instant;

    iput-object p2, p0, Ldt1/h$c;->E:Ldt1/h;

    iput-object p3, p0, Ldt1/h$c;->F:Ljava/lang/String;

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

    new-instance v0, Ldt1/h$c;

    iget-object v1, p0, Ldt1/h$c;->z:Ljava/time/Instant;

    iget-object v2, p0, Ldt1/h$c;->E:Ldt1/h;

    iget-object v3, p0, Ldt1/h$c;->F:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Ldt1/h$c;-><init>(Ljava/time/Instant;Ldt1/h;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ldt1/h$c;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ldt1/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/h$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldt1/h$c;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_1
    iget-object v2, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    iget-object v2, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ldt1/b$b;

    iget-object v2, p0, Ldt1/h$c;->z:Ljava/time/Instant;

    invoke-direct {p1, v2}, Ldt1/b$b;-><init>(Ljava/time/Instant;)V

    iput-object v0, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Ldt1/h$c;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_0
    new-instance p1, Ldt1/h$c$a;

    iget-object v2, p0, Ldt1/h$c;->E:Ldt1/h;

    iget-object v4, p0, Ldt1/h$c;->z:Ljava/time/Instant;

    iget-object v5, p0, Ldt1/h$c;->F:Ljava/lang/String;

    invoke-direct {p1, v2, v4, v5, v3}, Ldt1/h$c$a;-><init>(Ldt1/h;Ljava/time/Instant;Ljava/lang/String;Lq83/d;)V

    iput-object v0, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Ldt1/h$c;->x:I

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, p1, p0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_4

    :cond_1
    :goto_1
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_4

    iget-object p1, p0, Ldt1/h$c;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->g(Ldt1/h;)Lxm0/b;

    move-result-object p1

    iput-object v0, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Ldt1/h$c;->x:I

    const-string v2, "labradorrefreshscope"

    invoke-virtual {p1, v2, p0}, Lxm0/b;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_4

    :cond_2
    :goto_2
    iget-object p1, p0, Ldt1/h$c;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object p1

    iget-object v2, p0, Ldt1/h$c;->z:Ljava/time/Instant;

    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    iput-object v0, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, p0, Ldt1/h$c;->x:I

    invoke-interface {p1, v4, v5, p0}, Lqk1/b;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    sget-object p1, Ldt1/b$d;->a:Ldt1/b$d;

    iput-object v3, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, p0, Ldt1/h$c;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_6

    new-instance p1, Ldt1/b$c;

    iget-object v2, p0, Ldt1/h$c;->z:Ljava/time/Instant;

    invoke-direct {p1, v2}, Ldt1/b$c;-><init>(Ljava/time/Instant;)V

    iput-object v3, p0, Ldt1/h$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Ldt1/h$c;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Ldt1/h$c;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_4
    return-object v1

    :cond_5
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
