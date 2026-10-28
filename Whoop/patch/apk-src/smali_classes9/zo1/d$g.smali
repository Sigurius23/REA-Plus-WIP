.class final Lzo1/d$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo1/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lzo1/c;",
        "previousState",
        "Lzo1/a;",
        "action",
        "<anonymous>",
        "(Lzo1/c;Lzo1/a;)Lzo1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$interact$2"
    f = "MciOnboardingInteractor.kt"
    l = {
        0x22,
        0x23,
        0x26,
        0x28,
        0x29,
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzo1/d;


# direct methods
.method public constructor <init>(Lzo1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo1/d;",
            "Lq83/d<",
            "-",
            "Lzo1/d$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lzo1/c;Lzo1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo1/c;",
            "Lzo1/a;",
            "Lq83/d<",
            "-",
            "Lzo1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzo1/d$g;

    iget-object v1, p0, Lzo1/d$g;->z:Lzo1/d;

    invoke-direct {v0, v1, p3}, Lzo1/d$g;-><init>(Lzo1/d;Lq83/d;)V

    iput-object p1, v0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzo1/d$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzo1/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzo1/c;

    check-cast p2, Lzo1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzo1/d$g;->f(Lzo1/c;Lzo1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    check-cast v0, Lzo1/c;

    iget-object v1, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    check-cast v1, Lzo1/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lzo1/d$g;->w:I

    packed-switch v3, :pswitch_data_0

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

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lzo1/a$d;

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    check-cast v1, Lzo1/a$d;

    invoke-virtual {v1}, Lzo1/a$d;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Lzo1/d$g;->w:I

    invoke-static {p1, v1, v0, p0}, Lzo1/d;->d(Lzo1/d;Ljava/lang/String;Lzo1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_0
    check-cast p1, Lzo1/c;

    return-object p1

    :cond_1
    instance-of p1, v1, Lzo1/a$c;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    check-cast v1, Lzo1/a$c;

    iput-object v3, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, p0, Lzo1/d$g;->w:I

    invoke-static {p1, v1, v0, p0}, Lzo1/d;->g(Lzo1/d;Lzo1/a$c;Lzo1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    goto/16 :goto_5

    :cond_2
    :goto_1
    check-cast p1, Lzo1/c;

    return-object p1

    :cond_3
    instance-of p1, v1, Lzo1/a$h;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    check-cast v1, Lzo1/a$h;

    invoke-static {p1, v1, v0}, Lzo1/d;->l(Lzo1/d;Lzo1/a$h;Lzo1/c;)Lzo1/c;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Lzo1/a$a;->a:Lzo1/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    invoke-static {p1, v0}, Lzo1/d;->f(Lzo1/d;Lzo1/c;)Lzo1/c;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Lzo1/a$f;->a:Lzo1/a$f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    iput-object v3, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, p0, Lzo1/d$g;->w:I

    invoke-static {p1, v0, p0}, Lzo1/d;->j(Lzo1/d;Lzo1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    check-cast p1, Lzo1/c;

    return-object p1

    :cond_7
    sget-object p1, Lzo1/a$g;->a:Lzo1/a$g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    invoke-static {p1, v0}, Lzo1/d;->k(Lzo1/d;Lzo1/c;)Lzo1/c;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v1, Lzo1/a$i;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    check-cast v1, Lzo1/a$i;

    invoke-virtual {v1}, Lzo1/a$i;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, p0, Lzo1/d$g;->w:I

    invoke-static {p1, v0, p0}, Lzo1/d;->m(Lzo1/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    goto :goto_5

    :cond_9
    :goto_3
    check-cast p1, Lzo1/c;

    return-object p1

    :cond_a
    instance-of p1, v1, Lzo1/a$e;

    if-eqz p1, :cond_c

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    check-cast v1, Lzo1/a$e;

    invoke-virtual {v1}, Lzo1/a$e;->a()Z

    move-result v0

    iput-object v3, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, p0, Lzo1/d$g;->w:I

    invoke-static {p1, v0, p0}, Lzo1/d;->h(Lzo1/d;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_b

    goto :goto_5

    :cond_b
    :goto_4
    check-cast p1, Lzo1/c;

    return-object p1

    :cond_c
    sget-object p1, Lzo1/a$b;->a:Lzo1/a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lzo1/d$g;->z:Lzo1/d;

    iput-object v3, p0, Lzo1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzo1/d$g;->y:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, p0, Lzo1/d$g;->w:I

    invoke-static {p1, p0}, Lzo1/d;->c(Lzo1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_d

    :goto_5
    return-object v2

    :cond_d
    :goto_6
    check-cast p1, Lzo1/c;

    return-object p1

    :cond_e
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
