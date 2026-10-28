.class public abstract Lgh0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh0/e$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a3\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f\u00b2\u0006\u000e\u0010\u001e\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "turnId",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "initialFeedbackType",
        "Lkotlin/Function1;",
        "Lcom/whoop/ai/chat/models/TurnFeedback;",
        "Ll83/a0;",
        "onSubmit",
        "t",
        "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "selected",
        "Lkotlin/Function0;",
        "onPositiveSelected",
        "onNegativeSelected",
        "r",
        "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "feedbackType",
        "",
        "isSelected",
        "onClick",
        "p",
        "(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/bot/models/feedback/FeedbackReason;",
        "",
        "I",
        "(Lcom/whoop/bot/models/feedback/FeedbackReason;)I",
        "feedbackText",
        "onTextChanged",
        "n",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method private static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final B(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {p0, v0}, Lgh0/e;->v(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {p0, v0}, Lgh0/e;->v(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lgh0/e;->x(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/bot/models/feedback/FeedbackReason;Lz1/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    and-int/lit8 v2, p4, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p4, 0x1

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Lgh0/e;->I(Lcom/whoop/bot/models/feedback/FeedbackReason;)I

    move-result v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    new-instance v5, Lsy0/k$g;

    const/4 v3, 0x0

    const/4 v6, 0x3

    invoke-direct {v5, v3, v3, v6, v3}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, p1

    invoke-virtual {v3, v0}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v4, v8}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_2

    :cond_1
    new-instance v8, Lfd3/a;

    const/16 v7, 0x15

    invoke-direct {v8, v7, v1, v0}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v16, v8

    check-cast v16, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    or-int/lit16 v0, v0, 0xc00

    sget v1, Lsy0/k$g;->d:I

    shl-int/2addr v1, v6

    or-int v18, v0, v1

    const/16 v19, 0x0

    const/16 v20, 0x3f0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    move v6, v3

    move-object/from16 v17, v4

    move-object v4, v2

    invoke-static/range {v4 .. v20}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_3
    move-object/from16 v17, v4

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lz1/p;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 3

    invoke-static {p3}, Lgh0/e;->u(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    invoke-static {p3}, Lgh0/e;->u(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lgh0/e;->w(Lp1/c1;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p4, ""

    :cond_0
    invoke-static {p3}, Lgh0/e;->u(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object p3

    sget-object v2, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-ne p3, v2, :cond_1

    new-instance p3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/bot/models/feedback/FeedbackReason;

    invoke-virtual {v2}, Lcom/whoop/bot/models/feedback/FeedbackReason;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    new-instance p2, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-direct {p2, v1, p4, p3}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance p3, Lcom/whoop/ai/chat/models/TurnFeedback;

    invoke-direct {p3, p1, v0, p2}, Lcom/whoop/ai/chat/models/TurnFeedback;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lgh0/e;->t(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lcom/whoop/bot/models/feedback/FeedbackReason;)I
    .locals 1

    sget-object v0, Lgh0/e$b;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget p0, Lwk0/b;->C:I

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget p0, Lwk0/b;->B:I

    return p0

    :cond_2
    sget p0, Lwk0/b;->I:I

    return p0

    :cond_3
    sget p0, Lwk0/b;->A:I

    return p0
.end method

.method public static synthetic a(Leg/j;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lgh0/e;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/whoop/bot/models/feedback/FeedbackReason;Lz1/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgh0/e;->E(Lcom/whoop/bot/models/feedback/FeedbackReason;Lz1/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z
    .locals 0

    invoke-static {p0, p1}, Lgh0/e;->z(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgh0/e;->o(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgh0/e;->y(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgh0/e;->s(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgh0/e;->F(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgh0/e;->H(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgh0/e;->B(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgh0/e;->C(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgh0/e;->q(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgh0/e;->D(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lz1/p;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Lgh0/e;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lz1/p;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, -0x4ae2e74a

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    move/from16 v30, v3

    and-int/lit8 v3, v30, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_4

    move v3, v7

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/lit8 v5, v30, 0x1

    invoke-virtual {v2, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_5

    int-to-float v3, v7

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v8

    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v4, v4

    mul-float/2addr v10, v4

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v3, v8, v9, v11}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v8, 0x19

    int-to-float v8, v8

    mul-float/2addr v8, v4

    invoke-static {v8, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v31

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v32

    sget-object v3, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->q()J

    move-result-wide v8

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->V0()J

    move-result-wide v14

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->V0()J

    move-result-wide v16

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->V0()J

    move-result-wide v18

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->V0()J

    move-result-wide v20

    const-wide/16 v26, 0x0

    const v29, 0x1ffe02

    move-wide/from16 v22, v3

    move-object v3, v5

    const-wide/16 v4, 0x0

    move/from16 v25, v6

    move/from16 v24, v7

    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    move-wide v12, v14

    move-wide/from16 v14, v16

    move-wide/from16 v16, v20

    const-wide/16 v20, 0x0

    move-object/from16 v28, v2

    move-object/from16 v33, v3

    move-wide/from16 v2, v22

    const-wide/16 v22, 0x0

    move/from16 v34, v24

    move/from16 v35, v25

    const-wide/16 v24, 0x0

    move-object/from16 v0, v33

    move/from16 v1, v34

    invoke-static/range {v2 .. v29}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v15

    move-object/from16 v2, v28

    invoke-static {v0, v2, v1}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v4

    sget-object v0, Lgh0/a;->a:Lgh0/a;

    invoke-virtual {v0}, Lgh0/a;->b()Lc93/m;

    move-result-object v6

    and-int/lit8 v0, v30, 0xe

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    and-int/lit8 v1, v30, 0x70

    or-int v17, v0, v1

    const/16 v18, 0x6000

    const v19, 0x3bf58

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v16, v2

    move-object/from16 v2, v31

    move-object/from16 v14, v32

    invoke-static/range {v0 .. v19}, Lg1/u8;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v28, v16

    goto :goto_4

    :cond_5
    move-object/from16 v28, v2

    invoke-virtual/range {v28 .. v28}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v28 .. v28}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Lgh0/c;

    move/from16 v4, p3

    const/4 v5, 0x0

    invoke-direct {v3, v0, v4, v5, v1}, Lgh0/c;-><init>(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final o(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lgh0/e;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x75ea11d2

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v1, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v10, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    move-object/from16 v9, p2

    if-nez v5, :cond_5

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v13, 0x1

    const/4 v7, 0x0

    if-eq v5, v6, :cond_6

    move v5, v13

    goto :goto_4

    :cond_6
    move v5, v7

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v10, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    if-eqz v2, :cond_7

    const v5, -0x5c530544

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v5, v10, v6, v7}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    goto :goto_5

    :cond_7
    const v5, -0x5c530107

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v5, v10, v6, v7}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    :goto_5
    if-eqz v2, :cond_8

    const v8, -0x5c52f944

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v8, v10, v11, v7}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_6

    :cond_8
    const v8, -0x5c52f504

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v8, v10, v11, v7}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_6
    sget-object v8, Lgh0/e$b;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v14, v8, v14

    if-eq v14, v13, :cond_a

    if-ne v14, v3, :cond_9

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/k0;->j0()I

    move-result v14

    :goto_7
    move/from16 v17, v14

    goto :goto_8

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v14

    invoke-virtual {v14}, Lgz0/k0;->k0()I

    move-result v14

    goto :goto_7

    :goto_8
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v8, v8, v14

    if-eq v8, v13, :cond_c

    if-ne v8, v3, :cond_b

    sget v3, Lwk0/b;->B0:I

    goto :goto_9

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    sget v3, Lwk0/b;->C0:I

    :goto_9
    int-to-float v8, v13

    int-to-float v1, v1

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v1, v14, v5, v6}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v8, v5

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v16, Lny0/q$b;->f:Lny0/q$b;

    invoke-virtual {v10, v11, v12}, Lp1/q;->f(J)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_10

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v5, v1, :cond_11

    :cond_10
    new-instance v5, Lgh0/e$a;

    invoke-direct {v5, v11, v12}, Lgh0/e$a;-><init>(J)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    new-instance v15, Lny0/o;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x3f8

    const/16 v27, 0x0

    invoke-direct/range {v15 .. v27}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v10, v7}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget v1, Lny0/o;->k:I

    const v3, 0xe000

    shl-int/lit8 v0, v0, 0x6

    and-int/2addr v0, v3

    or-int v11, v1, v0

    const/16 v12, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v15

    invoke-static/range {v5 .. v12}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lar2/f;

    const/16 v5, 0x10

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final q(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lgh0/e;->p(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x141c344b

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v0, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    if-eq v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    invoke-static {v10, v11, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v0, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v13, v0, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v0, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lwk0/b;->H:I

    const/4 v12, 0x0

    invoke-static {v6, v0, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v13, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v13, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    sget v18, Lb91/a;->d:I

    shl-int/lit8 v29, v18, 0x12

    const v30, 0x2fffa

    move/from16 v18, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v7

    move-wide/from16 v47, v12

    move-object v13, v8

    move-wide/from16 v7, v47

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v26, v14

    move-object/from16 v24, v15

    const-wide/16 v14, 0x0

    const/16 v27, 0x6

    const/16 v16, 0x0

    const/16 v28, 0x0

    const/16 v17, 0x0

    move/from16 v31, v18

    move-object/from16 v32, v19

    const-wide/16 v18, 0x0

    move-object/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v35, v22

    const/16 v22, 0x0

    move-object/from16 v36, v23

    const/16 v23, 0x0

    move-object/from16 v37, v24

    const/16 v24, 0x0

    move-object/from16 v38, v26

    const/16 v26, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    move/from16 v40, v31

    move-object/from16 v42, v32

    move-object/from16 v43, v33

    move-object/from16 v4, v34

    move-object/from16 v46, v35

    move-object/from16 v45, v36

    move-object/from16 v41, v37

    move-object/from16 v44, v38

    move/from16 v31, v27

    move-object/from16 v27, v0

    move/from16 v0, v39

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    sget-object v6, Ll0/m;->a:Ll0/e;

    invoke-static {v6, v4, v5, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    move-object/from16 v8, v46

    invoke-static {v5, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    move-object/from16 v9, v41

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v9, v42

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v5, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v43

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    move-object/from16 v4, v44

    goto :goto_9

    :cond_c
    :goto_8
    move-object/from16 v13, v45

    goto :goto_a

    :goto_9
    invoke-static {v6, v5, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v5, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-ne v1, v4, :cond_d

    const/4 v8, 0x1

    goto :goto_b

    :cond_d
    move v8, v0

    :goto_b
    move/from16 v6, v40

    shl-int/lit8 v7, v6, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int/lit8 v7, v7, 0x6

    invoke-static {v4, v8, v2, v5, v7}, Lgh0/e;->p(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object v4, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-ne v1, v4, :cond_e

    const/4 v8, 0x1

    goto :goto_c

    :cond_e
    move v8, v0

    :goto_c
    and-int/lit16 v0, v6, 0x380

    or-int/lit8 v0, v0, 0x6

    invoke-static {v4, v8, v3, v5, v0}, Lgh0/e;->p(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_f
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lcy1/b;

    const/16 v5, 0x17

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final s(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lgh0/e;->r(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p0

    move-object/from16 v1, p2

    move/from16 v6, p4

    const-string v0, "turnId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialFeedbackType"

    move-object/from16 v7, p1

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSubmit"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x6cea24cb

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    const/16 v9, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v8, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v9

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    if-eq v5, v11, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    move v5, v13

    :goto_4
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v8, v11, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_26

    and-int/lit8 v5, v0, 0xe

    if-ne v5, v3, :cond_7

    const/4 v11, 0x1

    goto :goto_5

    :cond_7
    move v11, v13

    :goto_5
    and-int/lit8 v14, v0, 0x70

    if-ne v14, v9, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v13

    :goto_6
    or-int/2addr v9, v11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_9

    if-ne v11, v14, :cond_a

    :cond_9
    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lp1/c1;

    if-ne v5, v3, :cond_b

    const/4 v9, 0x1

    goto :goto_7

    :cond_b
    move v9, v13

    :goto_7
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v9, :cond_c

    if-ne v15, v14, :cond_d

    :cond_c
    const-string v9, ""

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v15

    invoke-virtual {v8, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v15, Lp1/c1;

    if-ne v5, v3, :cond_e

    const/4 v9, 0x1

    goto :goto_8

    :cond_e
    move v9, v13

    :goto_8
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v9, :cond_f

    if-ne v3, v14, :cond_10

    :cond_f
    new-instance v3, Lz1/p;

    invoke-direct {v3}, Lz1/p;-><init>()V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lz1/p;

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_11

    if-ne v10, v14, :cond_12

    :cond_11
    new-instance v10, Lep1/f;

    const/4 v9, 0x1

    invoke-direct {v10, v3, v9}, Lep1/f;-><init>(Lz1/p;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v1, v8, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v21, v14

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v8, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_13

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_13
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move/from16 v22, v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_a

    :cond_14
    move/from16 v22, v5

    :goto_a
    invoke-static {v13, v8, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v12, v7

    const-wide/16 v23, 0x0

    cmpl-double v12, v12, v23

    if-lez v12, :cond_16

    goto :goto_b

    :cond_16
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v12, v7, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move/from16 v19, v0

    const/4 v7, 0x0

    invoke-static {v7, v8, v13}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v0

    const/16 v7, 0xe

    invoke-static {v12, v0, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x2

    int-to-float v12, v7

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v12, v13

    const/4 v13, 0x0

    invoke-static {v0, v12, v13, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/4 v13, 0x6

    invoke-static {v7, v1, v8, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move v7, v12

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v24, v7

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_17

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_17
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v8, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_18

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    :cond_18
    invoke-static {v12, v8, v12, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v8, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11}, Lgh0/e;->u(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1a

    move-object/from16 v1, v21

    if-ne v2, v1, :cond_1b

    goto :goto_d

    :cond_1a
    move-object/from16 v1, v21

    :goto_d
    new-instance v2, Lg11/b;

    const/4 v5, 0x6

    invoke-direct {v2, v5, v11}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v2, Lc93/a;

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1c

    if-ne v6, v1, :cond_1d

    :cond_1c
    new-instance v6, Lg11/b;

    const/4 v5, 0x7

    invoke-direct {v6, v5, v11}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Lc93/a;

    const/4 v7, 0x0

    invoke-static {v0, v2, v6, v8, v7}, Lgh0/e;->r(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v15}, Lgh0/e;->w(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_1e

    if-ne v5, v1, :cond_1f

    :cond_1e
    new-instance v5, Lf1/a0;

    const/16 v2, 0xb

    invoke-direct {v5, v2, v15}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-static {v0, v5, v8, v7}, Lgh0/e;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v11}, Lgh0/e;->u(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    sget-object v2, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-ne v0, v2, :cond_21

    const v0, 0xc660d3f

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/bot/models/feedback/FeedbackReason;->getEntries()Lt83/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/bot/models/feedback/FeedbackReason;

    sget-object v5, Lg1/h3;->a:Lp1/u2;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    new-instance v6, La01/d;

    const/16 v7, 0x10

    invoke-direct {v6, v2, v3, v10, v7}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0x304ad944

    invoke-static {v2, v8, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v6, 0x38

    invoke-static {v5, v2, v8, v6}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_e

    :cond_20
    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v13, 0x1

    goto :goto_10

    :cond_21
    const/4 v7, 0x0

    const v0, 0xc6f7ec3

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    move/from16 v12, v24

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {v4, v12, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v0, Lwk0/b;->F:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v14

    move/from16 v0, v19

    and-int/lit16 v0, v0, 0x380

    const/16 v2, 0x100

    if-ne v0, v2, :cond_22

    move v0, v13

    :goto_11
    move/from16 v2, v22

    const/4 v4, 0x4

    goto :goto_12

    :cond_22
    move v0, v7

    goto :goto_11

    :goto_12
    if-ne v2, v4, :cond_23

    move v7, v13

    :cond_23
    or-int/2addr v0, v7

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_24

    if-ne v2, v1, :cond_25

    :cond_24
    new-instance v0, Lgh0/d;

    move-object/from16 v2, p0

    move-object/from16 v1, p2

    move-object v4, v11

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lgh0/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lz1/p;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_25
    move-object/from16 v21, v2

    check-cast v21, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit16 v0, v0, 0x1b6

    const/16 v24, 0x0

    const/16 v25, 0x1fb8

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v1, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v23, v0

    move-object/from16 v22, v8

    move-object v8, v6

    invoke-static/range {v8 .. v25}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_26
    move-object v0, v8

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_27

    new-instance v0, Lcy1/b;

    const/16 v2, 0x18

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final u(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiFeedbackType;
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

.method private static final v(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V
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

.method private static final w(Lp1/c1;)Ljava/lang/String;
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

.method private static final x(Lp1/c1;Ljava/lang/String;)V
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

.method private static final y(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;
    .locals 2

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Leg/j;

    const/16 v1, 0x19

    invoke-direct {v0, p1, v1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Laq0/i;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Laq0/i;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p0, p1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z
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
