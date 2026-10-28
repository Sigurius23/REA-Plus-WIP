.class public abstract Lsl0/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsl0/u2$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a3\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a;\u0010\u0016\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00112\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00112\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019\u00b2\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "messageId",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "existingFeedback",
        "",
        "fromWrapper",
        "Lkotlin/Function1;",
        "Lnl0/d;",
        "Ll83/a0;",
        "onViewEvent",
        "z",
        "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "feedbackText",
        "enabled",
        "onTextChanged",
        "w",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function0;",
        "onPositiveFeedbackSelected",
        "onNegativeFeedbackSelected",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "selected",
        "r",
        "(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Landroidx/compose/runtime/Composer;II)V",
        "typeSelected",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object p0
.end method

.method private static final B(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {p0, v0}, Lsl0/u2;->I(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {p0, v0}, Lsl0/u2;->I(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lsl0/u2;->K(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(ILz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 21

    and-int/lit8 v0, p6, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p6, 0x1

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static/range {p0 .. p0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    new-instance v5, Lsy0/k$g;

    const/4 v1, 0x0

    const/4 v6, 0x3

    invoke-direct {v5, v1, v1, v6, v1}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {p3 .. p3}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v1

    if-eqz v1, :cond_1

    move v7, v3

    goto :goto_1

    :cond_1
    move v7, v2

    :goto_1
    invoke-virtual/range {p1 .. p2}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v4, v2}, Lp1/q;->e(I)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_3

    :cond_2
    new-instance v3, Lsl0/u;

    const/4 v2, 0x4

    move-object/from16 v8, p2

    move-object/from16 v9, p4

    invoke-direct {v3, v2, v9, v8}, Lsl0/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v16, v3

    check-cast v16, Lkotlin/jvm/functions/Function1;

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    sget v3, Lsy0/k$g;->d:I

    shl-int/2addr v3, v6

    or-int v18, v2, v3

    const/16 v19, 0x0

    const/16 v20, 0x3f0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    move v6, v1

    move-object/from16 v17, v4

    move-object v4, v0

    invoke-static/range {v4 .. v20}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_2

    :cond_4
    move-object/from16 v17, v4

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lz1/p;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 3

    invoke-static {p3}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    if-eqz v0, :cond_4

    if-eqz p0, :cond_4

    invoke-static {p3}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->getValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    invoke-static {p4}, Lsl0/u2;->J(Lp1/c1;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p3}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object p3

    sget-object v1, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-ne p3, v1, :cond_2

    new-instance p3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object p2

    :goto_0
    move-object v1, p2

    check-cast v1, Ln83/b;

    invoke-virtual {v1}, Ln83/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/bot/models/feedback/FeedbackReason;

    invoke-virtual {v1}, Lcom/whoop/bot/models/feedback/FeedbackReason;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_3
    new-instance p2, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-direct {p2, v0, p4, p3}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance p3, Lnl0/d$k;

    invoke-direct {p3, p0, p2}, Lnl0/d$k;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lsl0/u2;->z(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final J(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final K(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final L(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;
    .locals 2

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lsl0/f;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lsl0/f;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lsl0/s2;

    invoke-direct {p1, v0}, Lsl0/s2;-><init>(Lsl0/f;)V

    invoke-interface {p0, p1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final O(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/u2;->I(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    return-void
.end method

.method public static final synthetic Q(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/u2;->K(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lsl0/f;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lsl0/u2;->N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lsl0/u2;->H(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/u2;->s()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;Lc93/a;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsl0/u2;->u(Lc93/a;Lc93/a;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsl0/u2;->E(ILz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lz1/p;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/u2;->G(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lz1/p;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z
    .locals 0

    invoke-static {p0, p1}, Lsl0/u2;->M(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/u2;->x(ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/u2;->F(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/u2;->B(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/u2;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/u2;->L(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsl0/u2;->v(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lsl0/u2;->O(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/u2;->C(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/u2;->D(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsl0/u2;->y(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x11533df0

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_9

    if-nez p2, :cond_7

    const/4 v7, -0x1

    goto :goto_4

    :cond_7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_4
    invoke-virtual {v11, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_5

    :cond_8
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v2, v7

    :cond_9
    :goto_6
    and-int/lit16 v7, v2, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_a

    move v7, v10

    goto :goto_7

    :cond_a
    move v7, v9

    :goto_7
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_b

    new-instance v0, Lsl0/a1;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lc93/a;

    goto :goto_8

    :cond_c
    move-object v0, v1

    :goto_8
    if-eqz v3, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_d

    new-instance v1, Lsl0/a1;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v1, Lc93/a;

    goto :goto_9

    :cond_e
    move-object v1, v5

    :goto_9
    if-eqz v6, :cond_f

    const/4 v3, 0x0

    goto :goto_a

    :cond_f
    move-object/from16 v3, p2

    :goto_a
    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->g:Ll0/h;

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v6, v7, v11, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_11
    invoke-static {v7, v11, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v5, Lwk0/b;->H:I

    invoke-static {v5, v11, v9}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v11, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move v12, v10

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    move/from16 p3, v2

    move/from16 v2, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    sget-object v5, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    sget-object v6, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    filled-new-array {v5, v6}, [Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v6, Lsl0/t2;

    invoke-direct {v6, v0, v1}, Lsl0/t2;-><init>(Lc93/a;Lc93/a;)V

    const v7, -0x1b1f0b8

    invoke-static {v7, v11, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shr-int/lit8 v6, p3, 0x3

    and-int/lit8 v6, v6, 0x70

    const v7, 0x30006

    or-int v12, v6, v7

    const/16 v13, 0x1c

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v3

    invoke-static/range {v5 .. v13}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object v2, v1

    move-object v1, v0

    goto :goto_c

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v2, v5

    :goto_c
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Ls51/b;

    const/16 v6, 0xc

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final s()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lc93/a;Lc93/a;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 26

    move-object/from16 v0, p4

    move/from16 v1, p6

    const-string v2, "$this$RadioGroup"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "item"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "state"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x30

    if-nez v2, :cond_1

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x20

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit16 v4, v1, 0x180

    if-nez v4, :cond_4

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_2

    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_2

    :cond_2
    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_3

    const/16 v1, 0x100

    goto :goto_3

    :cond_3
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v2, v1

    :cond_4
    and-int/lit16 v1, v2, 0x491

    const/16 v4, 0x490

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v1, v4, :cond_5

    move v1, v6

    goto :goto_4

    :cond_5
    move v1, v5

    :goto_4
    and-int/2addr v2, v6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_13

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v0}, Lf31/a;->c()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v7

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v7

    :goto_5
    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v0}, Lf31/a;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v2}, Ly81/i;->w()J

    move-result-wide v9

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v9

    :goto_6
    sget-object v0, Lsl0/u2$c;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v0, v2

    const/4 v4, 0x2

    if-eq v2, v6, :cond_9

    if-ne v2, v4, :cond_8

    move-object/from16 v11, p1

    goto :goto_7

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    move-object/from16 v11, p0

    :goto_7
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v0, v2

    if-eq v2, v6, :cond_b

    if-ne v2, v4, :cond_a

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->j0()I

    move-result v1

    :goto_8
    move v15, v1

    goto :goto_9

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->k0()I

    move-result v1

    goto :goto_8

    :goto_9
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v6, :cond_d

    if-ne v0, v4, :cond_c

    sget v0, Lwk0/b;->B0:I

    goto :goto_a

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    sget v0, Lwk0/b;->C0:I

    :goto_a
    int-to-float v1, v6

    const/4 v2, 0x4

    int-to-float v2, v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2, v3, v7, v8}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_b
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    :cond_f
    invoke-static {v3, v12, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, Lny0/q$b;->f:Lny0/q$b;

    invoke-virtual {v12, v9, v10}, Lp1/q;->f(J)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_11

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_12

    :cond_11
    new-instance v2, Lsl0/u2$a;

    invoke-direct {v2, v9, v10}, Lsl0/u2$a;-><init>(J)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    new-instance v13, Lny0/o;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x3f8

    const/16 v25, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v12, v5}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move-object v7, v13

    sget v13, Lny0/o;->k:I

    const/16 v14, 0xc

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsl0/u2;->r(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v0, p4

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    const v3, 0x964fe1e

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v1, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    goto :goto_4

    :cond_5
    move-object/from16 v6, p2

    :goto_4
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_6

    move v7, v10

    goto :goto_5

    :cond_6
    move v7, v9

    :goto_5
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v1, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_8

    int-to-float v7, v10

    if-eqz v2, :cond_7

    const v8, 0x441e0ea5

    invoke-virtual {v1, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v8, v1, v10, v9}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    goto :goto_6

    :cond_7
    const v8, 0x441e1285

    invoke-virtual {v1, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v8, v1, v10, v9}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    :goto_6
    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v11, v4

    mul-float/2addr v10, v11

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v7, v8, v9, v12}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0x19

    int-to-float v8, v8

    mul-float/2addr v8, v11

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v31

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v32

    sget-object v7, Lg1/i8;->a:Lg1/i8;

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->q()J

    move-result-wide v11

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->V0()J

    move-result-wide v17

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->V0()J

    move-result-wide v19

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->V0()J

    move-result-wide v21

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ly81/i;->V0()J

    move-result-wide v23

    const-wide/16 v27, 0x0

    const v30, 0x1ffe02

    move/from16 v25, v5

    const-wide/16 v5, 0x0

    move-object/from16 v26, v7

    move/from16 v29, v8

    move-wide v7, v11

    move-wide v11, v15

    move-wide/from16 v15, v19

    move-wide/from16 v19, v21

    const-wide/16 v21, 0x0

    move/from16 v33, v4

    move-wide v3, v9

    move-wide v9, v13

    move-wide/from16 v13, v17

    move-wide/from16 v17, v23

    const-wide/16 v23, 0x0

    move/from16 v34, v25

    move-object/from16 v35, v26

    const-wide/16 v25, 0x0

    move/from16 v0, v29

    move-object/from16 v29, v1

    move-object/from16 v1, v35

    invoke-static/range {v3 .. v30}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v15

    move-object/from16 v3, v29

    invoke-static {v1, v3, v0}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v4

    new-instance v0, Lc30/b;

    const/4 v1, 0x4

    invoke-direct {v0, v2, v1}, Lc30/b;-><init>(ZI)V

    const v1, 0x42561f83

    invoke-static {v1, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit8 v0, v34, 0xe

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    shr-int/lit8 v1, v34, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shl-int/lit8 v1, v34, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v17, v0, v1

    const/16 v18, 0x6000

    const v19, 0x3bf50

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v16, v3

    move-object/from16 v14, v32

    move v3, v2

    move-object/from16 v2, v31

    invoke-static/range {v0 .. v19}, Lg1/u8;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v29, v16

    goto :goto_7

    :cond_8
    move-object/from16 v29, v1

    invoke-virtual/range {v29 .. v29}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v29 .. v29}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lsg2/o;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final x(ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lwk0/b;->D:I

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    if-eqz p0, :cond_1

    const v5, 0x54c65aa

    invoke-static {v2, v5, v0, v2, v1}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v0

    :goto_1
    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    move-wide v6, v0

    goto :goto_2

    :cond_1
    const v5, 0x54c698a

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v0

    goto :goto_1

    :goto_2
    sget v0, Lb91/a;->d:I

    shl-int/lit8 v28, v0, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_2
    move-object/from16 v26, v2

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsl0/u2;->w(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final z(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p3

    move/from16 v8, p5

    const-string v0, "onViewEvent"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x7a377b7c

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    const/4 v10, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_4

    move/from16 v4, p2

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit16 v5, v8, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_5

    :cond_7
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :cond_8
    move v13, v0

    and-int/lit16 v0, v13, 0x493

    const/16 v5, 0x492

    const/4 v14, 0x0

    if-eq v0, v5, :cond_9

    const/4 v0, 0x1

    goto :goto_6

    :cond_9
    move v0, v14

    :goto_6
    and-int/lit8 v5, v13, 0x1

    invoke-virtual {v9, v5, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_29

    if-eqz v3, :cond_a

    move/from16 v21, v14

    goto :goto_7

    :cond_a
    move/from16 v21, v4

    :goto_7
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_b

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v0

    check-cast v4, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    const-string v0, ""

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v5, v0

    check-cast v5, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_d

    new-instance v0, Lz1/p;

    invoke-direct {v0}, Lz1/p;-><init>()V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v24, v0

    check-cast v24, Lz1/p;

    and-int/lit8 v0, v13, 0xe

    if-ne v0, v10, :cond_e

    const/4 v6, 0x1

    goto :goto_8

    :cond_e
    move v6, v14

    :goto_8
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v6, v6, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_f

    if-ne v12, v3, :cond_10

    :cond_f
    move v6, v0

    goto :goto_9

    :cond_10
    move-object v10, v12

    move v12, v0

    move-object v0, v10

    move-object v10, v3

    move-object v3, v4

    move-object/from16 v4, v24

    goto :goto_a

    :goto_9
    new-instance v0, Lsl0/u2$b;

    move v12, v6

    const/4 v6, 0x0

    move-object v10, v3

    move-object/from16 v3, v24

    invoke-direct/range {v0 .. v6}, Lsl0/u2$b;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lz1/p;Lp1/c1;Lp1/c1;Lq83/d;)V

    move-object/from16 v29, v4

    move-object v4, v3

    move-object/from16 v3, v29

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v0, Lc93/m;

    invoke-static {v1, v2, v0, v9}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_11

    new-instance v0, Lsl0/f;

    const/4 v6, 0x2

    invoke-direct {v0, v4, v6}, Lsl0/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v27, v0

    check-cast v27, Lkotlin/jvm/functions/Function1;

    xor-int/lit8 v0, v21, 0x1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_12

    new-instance v6, Lsc2/n;

    const/16 v11, 0x1c

    invoke-direct {v6, v11}, Lsc2/n;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v0, v6}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v6, v9, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move-object/from16 v20, v15

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-eqz v2, :cond_13

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v2, La3/k;->g:La3/i;

    move-object/from16 v24, v4

    move-object/from16 v4, v20

    invoke-static {v9, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    move-object/from16 v20, v5

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    :cond_14
    invoke-static {v14, v9, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v7, v0

    const-wide/16 v22, 0x0

    cmpl-double v7, v7, v22

    if-lez v7, :cond_16

    goto :goto_c

    :cond_16
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v7, v0, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v14, 0x0

    invoke-static {v14, v9, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v0

    const/16 v8, 0xe

    invoke-static {v7, v0, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x2

    int-to-float v8, v7

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v8, v14

    const/4 v14, 0x0

    invoke-static {v0, v8, v14, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/4 v14, 0x6

    invoke-static {v7, v6, v9, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move v7, v13

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v28, v7

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_17

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v9, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    :cond_18
    invoke-static {v13, v9, v13, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_1a

    new-instance v0, Lsl0/b1;

    const/4 v1, 0x5

    invoke-direct {v0, v1, v3}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v1, v0

    check-cast v1, Lc93/a;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_1b

    new-instance v0, Lsl0/b1;

    const/4 v2, 0x6

    invoke-direct {v0, v2, v3}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v4, v3

    invoke-static {v4}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v3

    const/16 v5, 0x36

    const/4 v6, 0x0

    move-object/from16 v26, v4

    move-object v4, v9

    move-object/from16 v0, v20

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static/range {v1 .. v6}, Lsl0/u2;->r(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v4

    invoke-static {v0}, Lsl0/u2;->J(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v26 .. v26}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v2

    if-eqz v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_e

    :cond_1c
    const/4 v2, 0x0

    :goto_e
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_1d

    new-instance v3, Lsl0/h;

    const/4 v4, 0x6

    invoke-direct {v3, v4, v0}, Lsl0/h;-><init>(ILp1/c1;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x180

    invoke-static {v1, v2, v3, v6, v4}, Lsl0/u2;->w(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v26 .. v26}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v1

    sget-object v2, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-ne v1, v2, :cond_23

    const v1, -0x64e91901

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/bot/models/feedback/FeedbackReason;->values()[Lcom/whoop/bot/models/feedback/FeedbackReason;

    move-result-object v1

    array-length v2, v1

    const/4 v14, 0x0

    :goto_f
    if-ge v14, v2, :cond_22

    aget-object v25, v1, v14

    sget-object v3, Lsl0/u2$c;->a:[I

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_21

    const/4 v4, 0x2

    if-eq v3, v4, :cond_20

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1f

    const/4 v4, 0x4

    if-ne v3, v4, :cond_1e

    sget v3, Lwk0/b;->C:I

    :goto_10
    move/from16 v23, v3

    goto :goto_11

    :cond_1e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1f
    sget v3, Lwk0/b;->B:I

    goto :goto_10

    :cond_20
    sget v3, Lwk0/b;->I:I

    goto :goto_10

    :cond_21
    sget v3, Lwk0/b;->A:I

    goto :goto_10

    :goto_11
    sget-object v3, Lg1/h3;->a:Lp1/u2;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    new-instance v22, Lr90/b;

    invoke-direct/range {v22 .. v27}, Lr90/b;-><init>(ILz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;Lp1/c1;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v5, v22

    move-object/from16 v4, v26

    const v9, 0x23235f73

    invoke-static {v9, v6, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v9, 0x38

    invoke-static {v3, v5, v6, v9}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_f

    :cond_22
    move-object/from16 v4, v26

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v9, 0x1

    goto :goto_13

    :cond_23
    move-object/from16 v4, v26

    const/4 v14, 0x0

    const v1, -0x64d9558e

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v7, 0x2

    invoke-static {v1, v8, v2, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lny0/v;->TextLarge:Lny0/v;

    sget v1, Lwk0/b;->F:I

    invoke-static {v1, v6, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v4}, Lsl0/u2;->A(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v1

    if-eqz v1, :cond_24

    move v13, v9

    goto :goto_14

    :cond_24
    move v13, v14

    :goto_14
    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v17

    const/4 v1, 0x4

    if-ne v12, v1, :cond_25

    move v1, v9

    goto :goto_15

    :cond_25
    move v1, v14

    :goto_15
    move/from16 v2, v28

    and-int/lit16 v2, v2, 0x1c00

    const/16 v3, 0x800

    if-ne v2, v3, :cond_26

    move v14, v9

    :cond_26
    or-int/2addr v1, v14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_27

    if-ne v2, v10, :cond_28

    :cond_27
    move-object v5, v0

    new-instance v0, Lgh0/d;

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, v24

    invoke-direct/range {v0 .. v5}, Lgh0/d;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lz1/p;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_28
    check-cast v2, Lc93/a;

    const/16 v19, 0x36

    const/16 v20, 0x60

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v10, v8

    move v4, v9

    move v12, v13

    move-wide/from16 v13, v17

    move-object/from16 v17, v2

    move-object/from16 v18, v6

    move-object v9, v7

    invoke-static/range {v9 .. v20}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    move/from16 v3, v21

    goto :goto_16

    :cond_29
    move-object v6, v9

    invoke-virtual {v6}, Lp1/q;->X()V

    move v3, v4

    :goto_16
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2a

    new-instance v0, Lry2/h;

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method
