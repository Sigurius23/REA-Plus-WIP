.class final Lu22/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu22/e;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "Lu22/g;",
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
    c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$callSetDefaultPaymentMethod$1"
    f = "PaymentMethodManagementInteractor.kt"
    l = {
        0x97,
        0x98,
        0x9b,
        0xa7,
        0xaa,
        0xab,
        0xae,
        0xb1,
        0xb2,
        0xb5,
        0xb8,
        0xb9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lu22/e;


# direct methods
.method public constructor <init>(Lu22/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu22/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu22/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu22/e$a;->z:Lu22/e;

    iput-object p2, p0, Lu22/e$a;->E:Ljava/lang/String;

    iput-object p3, p0, Lu22/e$a;->F:Ljava/lang/String;

    iput-object p4, p0, Lu22/e$a;->G:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lu22/e$a;

    iget-object v1, p0, Lu22/e$a;->z:Lu22/e;

    iget-object v2, p0, Lu22/e$a;->E:Ljava/lang/String;

    iget-object v3, p0, Lu22/e$a;->F:Ljava/lang/String;

    iget-object v4, p0, Lu22/e$a;->G:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lu22/e$a;-><init>(Lu22/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lu22/e$a;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lu22/e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu22/e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu22/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lu22/e$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lu22/e$a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lu22/e$a;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v2, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_9

    :pswitch_1
    iget-object v2, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_8

    :pswitch_2
    iget-object v2, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_7

    :pswitch_3
    iget-object v2, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_6

    :pswitch_4
    iget-object v0, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_b

    :pswitch_5
    iget-object v2, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_5

    :pswitch_6
    iget-object v2, p0, Lu22/e$a;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_4

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_3

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->d(Lu22/e;)La32/a;

    move-result-object p1

    invoke-virtual {p1}, La32/a;->a()V

    new-instance p1, Lu22/g$d;

    sget-object v2, Lu22/b$h;->a:Lu22/b$h;

    invoke-direct {p1, v2}, Lu22/g$d;-><init>(Lu22/b;)V

    iput-object v0, p0, Lu22/e$a;->y:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lu22/e$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_0
    move-object v9, p0

    goto/16 :goto_a

    :cond_0
    :goto_1
    iget-object p1, p0, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object p1

    sget-object v2, La32/c;->a:La32/c;

    iget-object v4, p0, Lu22/e$a;->E:Ljava/lang/String;

    invoke-virtual {v2, v4}, La32/c;->g(Ljava/lang/String;)Ljy1/a;

    move-result-object v2

    iput-object v0, p0, Lu22/e$a;->y:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Lu22/e$a;->x:I

    invoke-interface {p1, v2, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_2
    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->g(Lu22/e;)Ltr2/n;

    move-result-object v5

    new-instance v6, Lu22/e$a$a;

    iget-object v7, p0, Lu22/e$a;->z:Lu22/e;

    iget-object v8, p0, Lu22/e$a;->F:Ljava/lang/String;

    iget-object v9, p0, Lu22/e$a;->G:Ljava/lang/String;

    iget-object v10, p0, Lu22/e$a;->E:Ljava/lang/String;

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Lu22/e$a$a;-><init>(Lu22/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object v0, p0, Lu22/e$a;->y:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lu22/e$a;->x:I

    move-object v8, v6

    const/4 v6, 0x0

    const-string v7, "updateDefaultPaymentMethod failed"

    const/4 v10, 0x2

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_a

    :cond_2
    :goto_3
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    const-string v4, "set_default"

    if-eqz v2, :cond_5

    iget-object p1, v9, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->d(Lu22/e;)La32/a;

    move-result-object p1

    invoke-virtual {p1}, La32/a;->e()V

    iget-object p1, v9, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object p1

    sget-object v2, La32/c;->a:La32/c;

    iget-object v5, v9, Lu22/e$a;->E:Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, La32/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object v2

    iput-object v0, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v9, Lu22/e$a;->x:I

    invoke-interface {p1, v2, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_a

    :cond_3
    :goto_4
    iget-object p1, v9, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->i(Lu22/e;)Lu22/a;

    move-result-object p1

    iput-object v0, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v9, Lu22/e$a;->x:I

    invoke-interface {p1, p0}, Lu22/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_a

    :cond_4
    :goto_5
    new-instance p1, Lu22/g$d;

    sget-object v2, Lu22/b$i;->a:Lu22/b$i;

    invoke-direct {p1, v2}, Lu22/g$d;-><init>(Lu22/b;)V

    iput-object v3, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v9, Lu22/e$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto/16 :goto_a

    :cond_5
    instance-of v2, p1, Lu02/a$b$b;

    if-eqz v2, :cond_8

    iget-object p1, v9, Lu22/e$a;->z:Lu22/e;

    invoke-static {p1}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object p1

    sget-object v2, La32/c;->a:La32/c;

    iget-object v5, v9, Lu22/e$a;->E:Ljava/lang/String;

    const-string v6, "network"

    invoke-virtual {v2, v5, v4, v6, v3}, La32/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;

    move-result-object v2

    iput-object v0, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/4 v4, 0x7

    iput v4, v9, Lu22/e$a;->x:I

    invoke-interface {p1, v2, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_a

    :cond_6
    :goto_6
    sget-object p1, Lu22/g$c;->a:Lu22/g$c;

    iput-object v0, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, v9, Lu22/e$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_a

    :cond_7
    :goto_7
    new-instance p1, Lu22/g$d;

    sget-object v2, Lu22/b$g;->a:Lu22/b$g;

    invoke-direct {p1, v2}, Lu22/g$d;-><init>(Lu22/b;)V

    iput-object v3, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/16 v2, 0x9

    iput v2, v9, Lu22/e$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_a

    :cond_8
    instance-of v2, p1, Lu02/a$b$a;

    if-eqz v2, :cond_c

    iget-object v2, v9, Lu22/e$a;->z:Lu22/e;

    invoke-static {v2}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object v2

    sget-object v5, La32/c;->a:La32/c;

    iget-object v6, v9, Lu22/e$a;->E:Ljava/lang/String;

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, p1}, Ljava/lang/Integer;-><init>(I)V

    const-string p1, "http"

    invoke-virtual {v5, v6, v4, p1, v7}, La32/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;

    move-result-object p1

    iput-object v0, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/16 v4, 0xa

    iput v4, v9, Lu22/e$a;->x:I

    invoke-interface {v2, p1, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_a

    :cond_9
    :goto_8
    sget-object p1, Lu22/g$c;->a:Lu22/g$c;

    iput-object v0, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/16 v2, 0xb

    iput v2, v9, Lu22/e$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_a

    :cond_a
    :goto_9
    new-instance p1, Lu22/g$d;

    sget-object v2, Lu22/b$g;->a:Lu22/b$g;

    invoke-direct {p1, v2}, Lu22/g$d;-><init>(Lu22/b;)V

    iput-object v3, v9, Lu22/e$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lu22/e$a;->w:Ljava/lang/Object;

    const/16 v2, 0xc

    iput v2, v9, Lu22/e$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_a
    return-object v1

    :cond_b
    :goto_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
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
