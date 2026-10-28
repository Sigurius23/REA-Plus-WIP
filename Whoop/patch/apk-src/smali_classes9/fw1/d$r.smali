.class final Lfw1/d$r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->v(Lec3/l;)Lec3/l;
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
        "Lfw1/c;",
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$11"
    f = "ExtensionsInteractor.kt"
    l = {
        0xc0
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfw1/d;

.field final synthetic F:Lfw1/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfw1/d;Lfw1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/d;",
            "Lfw1/b;",
            "Lq83/d<",
            "-",
            "Lfw1/d$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$r;->E:Lfw1/d;

    iput-object p2, p0, Lfw1/d$r;->F:Lfw1/b;

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

    new-instance v0, Lfw1/d$r;

    iget-object v1, p0, Lfw1/d$r;->E:Lfw1/d;

    iget-object v2, p0, Lfw1/d$r;->F:Lfw1/b;

    invoke-direct {v0, v1, v2, p2}, Lfw1/d$r;-><init>(Lfw1/d;Lfw1/b;Lq83/d;)V

    iput-object p1, v0, Lfw1/d$r;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfw1/d$r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfw1/d$r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfw1/d$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfw1/d$r;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v0, p0

    iget-object v1, v0, Lfw1/d$r;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfw1/d$r;->y:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lfw1/d$r;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    iget-object v1, v0, Lfw1/d$r;->w:Ljava/lang/Object;

    check-cast v1, Lfw1/g;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lfw1/d$r;->E:Lfw1/d;

    invoke-static {v3}, Lfw1/d;->i(Lfw1/d;)Lec3/p1;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lfw1/g;

    if-eqz v5, :cond_2

    check-cast v3, Lfw1/g;

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v7

    if-eqz v7, :cond_9

    iget-object v5, v0, Lfw1/d$r;->F:Lfw1/b;

    invoke-virtual {v7}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->getSegments()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v8, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v12, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v10, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v13, v10, 0x1

    if-ltz v10, :cond_7

    check-cast v11, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;

    invoke-virtual {v3}, Lfw1/g;->e()I

    move-result v14

    if-eq v10, v14, :cond_3

    move-object/from16 v16, v3

    const/4 v4, 0x0

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v11}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;->getSections()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v10, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/membership/extensions/domain/models/SectionItems;

    invoke-virtual {v15}, Lcom/whoop/membership/extensions/domain/models/SectionItems;->getItems()Ljava/util/List;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    move-object/from16 v16, v3

    invoke-static {v4, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v9, v4, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    if-eqz v9, :cond_4

    move-object/from16 v17, v4

    check-cast v17, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    invoke-virtual/range {v17 .. v17}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->getTrackingLabel()Ljava/lang/String;

    move-result-object v4

    move-object v9, v5

    check-cast v9, Lfw1/b$h;

    invoke-virtual {v9}, Lfw1/b$h;->a()Ljx1/v;

    move-result-object v9

    invoke-virtual {v9}, Ljx1/v;->j()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22

    const/16 v29, 0x7ef

    const/16 v30, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v17 .. v30}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->copy$default(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ILjava/lang/Object;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    move-result-object v4

    :cond_4
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v9, 0xa

    goto :goto_3

    :cond_5
    invoke-virtual {v15, v6}, Lcom/whoop/membership/extensions/domain/models/SectionItems;->copy(Ljava/util/List;)Lcom/whoop/membership/extensions/domain/models/SectionItems;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v16

    const/4 v4, 0x1

    const/16 v9, 0xa

    goto :goto_2

    :cond_6
    move-object/from16 v16, v3

    move v3, v4

    const/4 v4, 0x0

    invoke-static {v11, v4, v14, v3, v4}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;->copy$default(Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;

    move-result-object v11

    :goto_4
    invoke-interface {v12, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v10, v13

    move-object/from16 v3, v16

    const/4 v4, 0x1

    const/16 v9, 0xa

    goto/16 :goto_1

    :cond_7
    const/4 v4, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_8
    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->copy$default(Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v4

    move-object v8, v4

    goto :goto_5

    :cond_9
    const/4 v8, 0x0

    :goto_5
    iget-object v3, v0, Lfw1/d$r;->E:Lfw1/d;

    invoke-static {v3}, Lfw1/d;->i(Lfw1/d;)Lec3/p1;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lfw1/g;

    if-eqz v4, :cond_a

    move-object v4, v3

    check-cast v4, Lfw1/g;

    move-object v5, v4

    goto :goto_6

    :cond_a
    const/4 v5, 0x0

    :goto_6
    if-eqz v5, :cond_b

    iget-object v3, v0, Lfw1/d$r;->E:Lfw1/d;

    invoke-static {v3}, Lfw1/d;->i(Lfw1/d;)Lec3/p1;

    move-result-object v3

    const/16 v13, 0x7b

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v14}, Lfw1/g;->d(Lfw1/g;ZZLcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Ljava/lang/String;Ljava/lang/Boolean;ILcom/whoop/navigation/e;ILjava/lang/Object;)Lfw1/g;

    move-result-object v4

    check-cast v3, Lec3/h2;

    invoke-virtual {v3, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_b
    iget-object v3, v0, Lfw1/d$r;->E:Lfw1/d;

    invoke-static {v3}, Lfw1/d;->i(Lfw1/d;)Lec3/p1;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    iput-object v4, v0, Lfw1/d$r;->z:Ljava/lang/Object;

    iput-object v4, v0, Lfw1/d$r;->w:Ljava/lang/Object;

    iput-object v4, v0, Lfw1/d$r;->x:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lfw1/d$r;->y:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_c

    return-object v2

    :cond_c
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
