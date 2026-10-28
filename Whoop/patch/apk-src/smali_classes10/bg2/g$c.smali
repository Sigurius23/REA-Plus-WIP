.class final Lbg2/g$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg2/g;->k()Lec3/l;
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
        "Lbg2/d;",
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
    c = "com.whoop.sms.setup.domain.SmsSetupInteractor$saveWhoopContact$1"
    f = "SmsSetupInteractor.kt"
    l = {
        0x64,
        0x65,
        0x6b,
        0x74,
        0x77
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lbg2/g;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lbg2/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbg2/g;",
            "Lq83/d<",
            "-",
            "Lbg2/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbg2/g$c;->F:Lbg2/g;

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

    new-instance v0, Lbg2/g$c;

    iget-object v1, p0, Lbg2/g$c;->F:Lbg2/g;

    invoke-direct {v0, v1, p2}, Lbg2/g$c;-><init>(Lbg2/g;Lq83/d;)V

    iput-object p1, v0, Lbg2/g$c;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lbg2/g$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbg2/g$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbg2/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbg2/g$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v5, p0

    iget-object v0, v5, Lbg2/g$c;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lbg2/g$c;->z:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lbg2/g$c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lbg2/g$c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;

    :goto_0
    iget-object v0, v5, Lbg2/g$c;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lbg2/g$c;->F:Lbg2/g;

    invoke-static {v0}, Lbg2/g;->a(Lbg2/g;)Lwf2/a;

    move-result-object v0

    invoke-virtual {v0}, Lwf2/a;->d()V

    new-instance v14, Lbg2/d;

    const/16 v31, 0x7fff

    const/16 v32, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x1

    invoke-direct/range {v14 .. v32}, Lbg2/d;-><init>(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v5, Lbg2/g$c;->E:Ljava/lang/Object;

    iput v2, v5, Lbg2/g$c;->z:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_1
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lbg2/g$c;->F:Lbg2/g;

    invoke-static {v2}, Lbg2/g;->c(Lbg2/g;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lbg2/g$c$a;

    iget-object v3, v5, Lbg2/g$c;->F:Lbg2/g;

    invoke-direct {v4, v3, v13}, Lbg2/g$c$a;-><init>(Lbg2/g;Lq83/d;)V

    iput-object v8, v5, Lbg2/g$c;->E:Ljava/lang/Object;

    iput v1, v5, Lbg2/g$c;->z:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_5

    :cond_6
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_d

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;->getDestinationPhoneNumber()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_7
    move-object v1, v13

    :goto_3
    if-nez v1, :cond_8

    const-string v1, ""

    :cond_8
    move-object/from16 v26, v1

    invoke-interface/range {v26 .. v26}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_c

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;->getContactPhoneNumbers()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/sms/common/data/SmsContactPhoneNumberResponse;

    invoke-static {v2}, Lbg2/b;->a(Lcom/whoop/sms/common/data/SmsContactPhoneNumberResponse;)Lbg2/a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    move-object v1, v13

    :cond_a
    if-nez v1, :cond_b

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_b
    move-object/from16 v27, v1

    new-instance v14, Lbg2/d;

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const v31, 0xe7ff

    const/16 v32, 0x0

    invoke-direct/range {v14 .. v32}, Lbg2/d;-><init>(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lbg2/g$c;->E:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->w:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->x:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->y:Ljava/lang/Object;

    iput v12, v5, Lbg2/g$c;->z:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    goto :goto_5

    :cond_c
    new-instance v14, Lbg2/d;

    const v31, 0xbfff

    const/16 v32, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    invoke-direct/range {v14 .. v32}, Lbg2/d;-><init>(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lbg2/g$c;->E:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->w:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->x:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->y:Ljava/lang/Object;

    iput v11, v5, Lbg2/g$c;->z:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    goto :goto_5

    :cond_d
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_f

    new-instance v14, Lbg2/d;

    const v31, 0xbfff

    const/16 v32, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    invoke-direct/range {v14 .. v32}, Lbg2/d;-><init>(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lbg2/g$c;->E:Ljava/lang/Object;

    iput-object v13, v5, Lbg2/g$c;->w:Ljava/lang/Object;

    iput v10, v5, Lbg2/g$c;->z:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    :goto_5
    return-object v9

    :cond_e
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
