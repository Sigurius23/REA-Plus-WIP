.class final Lqw1/d$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw1/d;->l(Ljava/lang/String;)Lec3/l;
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
        "Lqw1/e;",
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
    c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$submitEmailInvite$1"
    f = "InviteFamilyMemberInteractor.kt"
    l = {
        0x54,
        0x58,
        0x5a,
        0x5e,
        0x61,
        0x66,
        0x69
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lqw1/d;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lqw1/d;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw1/d;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lqw1/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw1/d$i;->F:Lqw1/d;

    iput-object p2, p0, Lqw1/d$i;->G:Ljava/lang/String;

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

    new-instance v0, Lqw1/d$i;

    iget-object v1, p0, Lqw1/d$i;->F:Lqw1/d;

    iget-object v2, p0, Lqw1/d$i;->G:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lqw1/d$i;-><init>(Lqw1/d;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lqw1/d$i;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lqw1/d$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqw1/d$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqw1/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqw1/d$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lqw1/d$i;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqw1/d$i;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    :pswitch_0
    iget-object v0, p0, Lqw1/d$i;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_1
    iget-object v0, p0, Lqw1/d$i;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/familyPlan/domain/model/InviteMemberErrorResponse;

    iget-object v0, p0, Lqw1/d$i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :pswitch_2
    iget-object v2, p0, Lqw1/d$i;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Exception;

    iget-object v2, p0, Lqw1/d$i;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_4

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_3

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqw1/d$i;->F:Lqw1/d;

    iget-object v2, p0, Lqw1/d$i;->G:Ljava/lang/String;

    invoke-static {p1, v2}, Lqw1/d;->i(Lqw1/d;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lqw1/e$d;

    sget v2, Lpv1/b;->c:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-direct {p1, v2}, Lqw1/e$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    iput-object v4, p0, Lqw1/d$i;->E:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lqw1/d$i;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_1
    move-object v10, p0

    goto/16 :goto_6

    :cond_0
    move-object v10, p0

    goto/16 :goto_7

    :cond_1
    sget-object p1, Lqw1/e$e;->a:Lqw1/e$e;

    iput-object v0, p0, Lqw1/d$i;->E:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lqw1/d$i;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lqw1/d$i;->F:Lqw1/d;

    invoke-static {p1}, Lqw1/d;->d(Lqw1/d;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lqw1/d$i$a;

    iget-object p1, p0, Lqw1/d$i;->F:Lqw1/d;

    iget-object v2, p0, Lqw1/d$i;->G:Ljava/lang/String;

    invoke-direct {v9, p1, v2, v4}, Lqw1/d$i$a;-><init>(Lqw1/d;Ljava/lang/String;Lq83/d;)V

    iput-object v0, p0, Lqw1/d$i;->E:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lqw1/d$i;->z:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_3
    move-object v2, p1

    check-cast v2, Lu02/a;

    instance-of p1, v2, Lu02/a$c;

    if-eqz p1, :cond_4

    new-instance p1, Lqw1/e$f;

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-direct {p1, v2}, Lqw1/e$f;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;)V

    iput-object v4, v10, Lqw1/d$i;->E:Ljava/lang/Object;

    iput-object v4, v10, Lqw1/d$i;->w:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v10, Lqw1/d$i;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto/16 :goto_6

    :cond_4
    instance-of p1, v2, Lu02/a$b$a;

    if-eqz p1, :cond_a

    move-object p1, v2

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->b()Ljava/lang/Exception;

    move-result-object p1

    instance-of v5, p1, Lio/ktor/client/plugins/ResponseException;

    if-eqz v5, :cond_6

    check-cast p1, Lio/ktor/client/plugins/ResponseException;

    iget-object p1, p1, Lio/ktor/client/plugins/ResponseException;->w:Lf63/c;

    iput-object v0, v10, Lqw1/d$i;->E:Ljava/lang/Object;

    iput-object v2, v10, Lqw1/d$i;->w:Ljava/lang/Object;

    iput-object v4, v10, Lqw1/d$i;->x:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v10, Lqw1/d$i;->z:I

    sget-object v5, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-static {p1, v5, p0}, Lj93/l0;->k(Lf63/c;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_6

    :cond_5
    :goto_4
    check-cast p1, Ljava/lang/String;

    goto :goto_5

    :cond_6
    instance-of v5, p1, Lretrofit2/HttpException;

    if-eqz v5, :cond_7

    check-cast p1, Lretrofit2/HttpException;

    iget-object p1, p1, Lretrofit2/HttpException;->y:Lpg3/v0;

    if-eqz p1, :cond_7

    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_7
    move-object p1, v4

    :goto_5
    iget-object v5, v10, Lqw1/d$i;->F:Lqw1/d;

    invoke-static {v5}, Lqw1/d;->e(Lqw1/d;)Lqw1/f;

    move-result-object v5

    invoke-virtual {v5, p1}, Lqw1/f;->a(Ljava/lang/String;)Lcom/whoop/membership/familyPlan/domain/model/InviteMemberErrorResponse;

    move-result-object p1

    new-instance v5, Lqw1/e$d;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/membership/familyPlan/domain/model/InviteMemberErrorResponse;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    :cond_8
    check-cast v2, Lu02/a$b$a;

    invoke-virtual {v2}, Lu02/a$b$a;->a()Ljava/lang/String;

    move-result-object p1

    :cond_9
    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v5, p1}, Lqw1/e$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    iput-object v4, v10, Lqw1/d$i;->E:Ljava/lang/Object;

    iput-object v4, v10, Lqw1/d$i;->w:Ljava/lang/Object;

    iput-object v4, v10, Lqw1/d$i;->x:Ljava/lang/Object;

    iput-object v4, v10, Lqw1/d$i;->y:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, v10, Lqw1/d$i;->z:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_6

    :cond_a
    instance-of p1, v2, Lu02/a$b$b;

    if-eqz p1, :cond_c

    sget-object p1, Lqw1/e$g;->a:Lqw1/e$g;

    iput-object v4, v10, Lqw1/d$i;->E:Ljava/lang/Object;

    iput-object v4, v10, Lqw1/d$i;->w:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v10, Lqw1/d$i;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_6
    return-object v1

    :cond_b
    :goto_7
    return-object v3

    :cond_c
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
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
