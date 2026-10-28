.class public final Lfq2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lfq2/f;",
        "",
        "Lfq2/e;",
        "stepReducer",
        "<init>",
        "(Lfq2/e;)V",
        "Lzp2/c;",
        "result",
        "Leq2/e;",
        "a",
        "(Lzp2/c;)Leq2/e;",
        "Lfq2/e;",
        "",
        "b",
        "Ljava/lang/Integer;",
        "previousStepIndex",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lfq2/e;

.field private b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lfq2/e;)V
    .locals 1

    const-string v0, "stepReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq2/f;->a:Lfq2/e;

    return-void
.end method


# virtual methods
.method public final a(Lzp2/c;)Leq2/e;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "result"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lzp2/c$b;->a:Lzp2/c$b;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v3, Leq2/e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Leq2/e;-><init>(ZZLeq2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    instance-of v2, v1, Lzp2/c$c;

    if-eqz v2, :cond_b

    check-cast v1, Lzp2/c$c;

    invoke-virtual {v1}, Lzp2/c$c;->a()Lzp2/g;

    move-result-object v2

    instance-of v3, v2, Lzp2/g$a;

    if-eqz v3, :cond_1

    check-cast v2, Lzp2/g$a;

    invoke-virtual {v2}, Lzp2/g$a;->a()Lzp2/k;

    move-result-object v2

    invoke-virtual {v2}, Lzp2/k;->a()I

    move-result v2

    :goto_0
    move v5, v2

    goto :goto_1

    :cond_1
    instance-of v3, v2, Lzp2/g$b;

    if-eqz v3, :cond_a

    check-cast v2, Lzp2/g$b;

    invoke-virtual {v2}, Lzp2/g$b;->a()Lzp2/k;

    move-result-object v2

    invoke-virtual {v2}, Lzp2/k;->a()I

    move-result v2

    goto :goto_0

    :goto_1
    iget-object v10, v0, Lfq2/f;->b:Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lfq2/f;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Lzp2/c$c;->a()Lzp2/g;

    move-result-object v1

    instance-of v2, v1, Lzp2/g$a;

    const/16 v3, 0xa

    const/4 v14, 0x0

    if-eqz v2, :cond_6

    check-cast v1, Lzp2/g$a;

    invoke-virtual {v1}, Lzp2/g$a;->b()Lcom/whoop/user/journey/model/UserJourneyContentModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModel;->getSteps()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Lcom/whoop/user/journey/model/UserJourneyStep;

    iget-object v15, v0, Lfq2/f;->a:Lfq2/e;

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v21}, Lfq2/e;->f(Lfq2/e;Lcom/whoop/user/journey/model/UserJourneyStep;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Llr2/d;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lzp2/g$a;->a()Lzp2/k;

    move-result-object v2

    invoke-virtual {v2}, Lzp2/k;->c()I

    move-result v6

    invoke-virtual {v1}, Lzp2/g$a;->b()Lcom/whoop/user/journey/model/UserJourneyContentModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModel;->getHeader()Lcom/whoop/user/journey/model/HeaderContentModel;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/HeaderContentModel;->getAvatarUrl()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_3

    new-instance v15, Lkd1/o$c;

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    new-instance v15, Lkd1/o$a;

    sget v2, Lyp2/a;->c:I

    invoke-direct {v15, v2}, Lkd1/o$a;-><init>(I)V

    :goto_3
    invoke-virtual {v1}, Lzp2/g$a;->b()Lcom/whoop/user/journey/model/UserJourneyContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/UserJourneyContentModel;->getHeader()Lcom/whoop/user/journey/model/HeaderContentModel;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/HeaderContentModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_5

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_5
    sget-object v2, Lcom/whoop/user/journey/model/HeaderStyle;->FULL:Lcom/whoop/user/journey/model/HeaderStyle;

    new-instance v7, Leq2/a;

    invoke-direct {v7, v15, v1, v2}, Leq2/a;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/user/journey/model/HeaderStyle;)V

    new-instance v3, Leq2/b;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x90

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v13}, Leq2/b;-><init>(Ljava/util/List;IILeq2/a;Llr2/c;Lzp2/a;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Leq2/e;

    invoke-direct {v1, v14, v14, v3}, Leq2/e;-><init>(ZZLeq2/b;)V

    return-object v1

    :cond_6
    instance-of v2, v1, Lzp2/g$b;

    if-eqz v2, :cond_9

    new-instance v4, Llr2/c;

    check-cast v1, Lzp2/g$b;

    invoke-virtual {v1}, Lzp2/g$b;->d()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->getLanding()Lcom/whoop/user/journey/model/LandingContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/LandingContent;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lzp2/g$b;->d()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->getLanding()Lcom/whoop/user/journey/model/LandingContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/LandingContent;->getSubtext()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lzp2/g$b;->d()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->getLanding()Lcom/whoop/user/journey/model/LandingContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/LandingContent;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lzp2/g$b;->d()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->getLanding()Lcom/whoop/user/journey/model/LandingContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/LandingContent;->getButtonText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Lkr2/d$o;

    sget-object v2, Llq2/f;->PRIMARY:Llq2/f;

    invoke-direct {v9, v2}, Lkr2/d$o;-><init>(Llq2/f;)V

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Llr2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Llq2/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lzp2/g$b;->d()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/user/journey/model/UserJourneySection;

    invoke-virtual {v6}, Lcom/whoop/user/journey/model/UserJourneySection;->getSteps()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/user/journey/model/UserJourneyStep;

    iget-object v10, v0, Lfq2/f;->a:Lfq2/e;

    invoke-virtual {v1}, Lzp2/g$b;->e()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Lcom/whoop/user/journey/model/UserJourneySection;->getSectionId()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    invoke-virtual {v10, v9, v11, v12, v13}, Lfq2/e;->e(Lcom/whoop/user/journey/model/UserJourneyStep;Ljava/lang/String;Ljava/lang/String;Z)Llr2/d;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    invoke-static {v5, v8}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v1}, Lzp2/g$b;->a()Lzp2/k;

    move-result-object v2

    invoke-virtual {v2}, Lzp2/k;->a()I

    move-result v17

    invoke-virtual {v1}, Lzp2/g$b;->a()Lzp2/k;

    move-result-object v2

    invoke-virtual {v2}, Lzp2/k;->c()I

    move-result v18

    new-instance v2, Leq2/a;

    new-instance v3, Lkd1/o$a;

    sget v6, Lyp2/a;->d:I

    invoke-direct {v3, v6}, Lkd1/o$a;-><init>(I)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v7, Lcom/whoop/user/journey/model/HeaderStyle;->SIMPLE:Lcom/whoop/user/journey/model/HeaderStyle;

    invoke-direct {v2, v3, v6, v7}, Leq2/a;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/user/journey/model/HeaderStyle;)V

    invoke-virtual {v1}, Lzp2/g$b;->a()Lzp2/k;

    move-result-object v3

    invoke-virtual {v3}, Lzp2/k;->b()Lzp2/a;

    move-result-object v21

    invoke-virtual {v1}, Lzp2/g$b;->e()Ljava/lang/String;

    move-result-object v23

    new-instance v15, Leq2/b;

    const/16 v22, 0x0

    const/16 v24, 0x40

    const/16 v25, 0x0

    move-object/from16 v19, v2

    move-object/from16 v20, v4

    move-object/from16 v16, v5

    invoke-direct/range {v15 .. v25}, Leq2/b;-><init>(Ljava/util/List;IILeq2/a;Llr2/c;Lzp2/a;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Leq2/e;

    invoke-direct {v1, v14, v14, v15}, Leq2/e;-><init>(ZZLeq2/b;)V

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_b
    instance-of v1, v1, Lzp2/c$a;

    if-eqz v1, :cond_c

    new-instance v2, Leq2/e;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Leq2/e;-><init>(ZZLeq2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
