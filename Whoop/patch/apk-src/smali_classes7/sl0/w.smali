.class public abstract Lsl0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u00c5\u0001\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022@\u0008\u0002\u0010\u0008\u001a:\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\"\u0008\u0002\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001d\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lsl0/n0;",
        "screenArgs",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackPressed",
        "Lkotlin/Function5;",
        "",
        "",
        "onProvideWrapperCallbacks",
        "onNavigationEvent",
        "isWceLoading",
        "isVisible",
        "Lkotlin/Function3;",
        "onContentLoaded",
        "halfDrawerReadOnly",
        "Lsl0/q;",
        "coordinator",
        "r",
        "(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;Landroidx/compose/runtime/Composer;II)V",
        "Lnl0/f;",
        "baseViewState",
        "showPermissionsDisclaimerModal",
        "Lg2/v;",
        "focusState",
        "showFeedbackModal",
        "showFeedbackForm",
        "feedbackMessageId",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "existingFeedback",
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
.method private static final A(Lp1/c1;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final B(Lsl0/q;Lbc3/c0;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lsl0/q;->k(Lbc3/c0;)V

    new-instance p1, Lsl0/w$o;

    invoke-direct {p1, p0}, Lsl0/w$o;-><init>(Lsl0/q;)V

    return-object p1
.end method

.method private static final C(Lsl0/q;Lnl0/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsl0/q;->c()Lld1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final E(Lsl0/q;Lc93/a;Lml0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lsl0/q;->d(Lml0/a;Lc93/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lbc3/c0;Lg1/y3;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 2

    new-instance v0, Lsl0/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lsl0/w$a;-><init>(Lg1/y3;Lc93/a;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->U(Lp1/c1;Lg2/v;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;
    .locals 2

    new-instance v0, Lsl0/w$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lsl0/w$b;-><init>(Lsl0/q;Lsl0/n0;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;
    .locals 2

    new-instance v0, Lsl0/w$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lsl0/w$c;-><init>(Lsl0/q;Lsl0/n0;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Ll83/a0;
    .locals 9

    if-eqz p6, :cond_0

    new-instance v0, Lsl0/w$d;

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    invoke-direct/range {v0 .. v8}, Lsl0/w$d;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lsl0/q;Lnl0/d$r;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsl0/q;->c()Lld1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lsl0/q;Lnl0/d$j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsl0/q;->c()Lld1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lsl0/q;Lnl0/f;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsl0/q;->l(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lbc3/c0;Lg1/y3;Lc93/a;Lsl0/q;)Ll83/a0;
    .locals 2

    new-instance v0, Lsl0/w$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lsl0/w$e;-><init>(Lg1/y3;Lc93/a;Lsl0/q;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/f;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$BottomSheet"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p7, p9, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p7, v0, :cond_0

    move p7, v1

    goto :goto_0

    :cond_0
    move p7, v2

    :goto_0
    and-int/2addr p9, v1

    check-cast p8, Lp1/q;

    invoke-virtual {p8, p9, p7}, Lp1/q;->U(IZ)Z

    move-result p7

    if-eqz p7, :cond_9

    sget-object p7, Lb2/e;->w:Lb2/m;

    invoke-static {p7, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p7

    iget-wide v3, p8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result p9

    invoke-virtual {p8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {p8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p8}, Lp1/q;->i0()V

    iget-boolean v5, p8, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {p8, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p8}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p8, v4, p7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p7, La3/k;->f:La3/i;

    invoke-static {p8, p7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p7, La3/k;->j:La3/i;

    iget-boolean v0, p8, Lp1/q;->S:Z

    if-nez v0, :cond_2

    invoke-virtual {p8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p9, p8, p9, p7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p7, La3/k;->d:La3/i;

    invoke-static {p8, p7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p4}, Lsl0/w;->u(Lp1/c1;)Z

    move-result p4

    sget-object p7, Lp1/l;->a:Lp1/v0;

    if-eqz p4, :cond_6

    const p3, 0xd12a1e8

    invoke-virtual {p8, p3}, Lp1/q;->e0(I)V

    invoke-static {p5}, Lsl0/w;->w(Lp1/c1;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p6}, Lsl0/w;->y(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object p4

    invoke-virtual {p8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    invoke-virtual {p8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p6

    or-int/2addr p5, p6

    invoke-virtual {p8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p6

    or-int/2addr p5, p6

    invoke-virtual {p8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p5, :cond_4

    if-ne p6, p7, :cond_5

    :cond_4
    new-instance p6, Lsl0/t;

    const/4 p5, 0x0

    invoke-direct {p6, p0, p1, p2, p5}, Lsl0/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p8, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p6, Lkotlin/jvm/functions/Function1;

    const/16 p5, 0x180

    move-object p0, p3

    move-object p3, p6

    const/4 p6, 0x0

    const/4 p2, 0x1

    move-object p1, p4

    move-object p4, p8

    invoke-static/range {p0 .. p6}, Lsl0/u2;->z(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    move-object p4, p8

    const p5, 0xd1b590f

    invoke-virtual {p4, p5}, Lp1/q;->e0(I)V

    invoke-virtual {p3}, Lnl0/f;->d()Lnl0/i;

    move-result-object p3

    invoke-virtual {p4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    invoke-virtual {p4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p6

    or-int/2addr p5, p6

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p6

    or-int/2addr p5, p6

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p5, :cond_7

    if-ne p6, p7, :cond_8

    :cond_7
    new-instance p6, Lsl0/t;

    invoke-direct {p6, p0, p2, p1}, Lsl0/t;-><init>(Lbc3/c0;Lsl0/q;Lg1/y3;)V

    invoke-virtual {p4, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast p6, Lkotlin/jvm/functions/Function1;

    invoke-static {p3, p6, p4, v2, v2}, Lsl0/p1;->x(Lnl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    move-object p4, p8

    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/d;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsl0/w$g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lsl0/w$g;-><init>(Lg1/y3;Lsl0/q;Lnl0/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lbc3/c0;Lsl0/q;Lg1/y3;Lnl0/d;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsl0/w$h;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lsl0/w$h;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p0, v1, v1, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p1}, Lsl0/q;->c()Lld1/c;

    move-result-object p0

    invoke-virtual {p0, p3}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lsl0/w;->r(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lsl0/q;Ljava/util/List;Lsl0/q2;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lsl0/q;->c()Lld1/c;

    move-result-object p0

    new-instance p2, Lnl0/d$r;

    invoke-direct {p2, p1}, Lnl0/d$r;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lp1/c1;)Lg2/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lg2/v;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg2/v;

    return-object p0
.end method

.method private static final U(Lp1/c1;Lg2/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lg2/v;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic V(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->t(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic W(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->v(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic X(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->x(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic Y(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lsl0/w;->z(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Z(Lp1/c1;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->A(Lp1/c1;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V

    return-void
.end method

.method public static synthetic a(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/f;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lsl0/w;->O(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/f;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic a0(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->D(Lp1/c1;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic b(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/w;->P(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsl0/q;Lnl0/d$j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->L(Lsl0/q;Lnl0/d$j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lsl0/q;Lnl0/d$r;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->K(Lsl0/q;Lnl0/d$r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/w;->H(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lsl0/w;->R(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lsl0/q;Lbc3/c0;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/w;->B(Lsl0/q;Lbc3/c0;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lbc3/c0;Lg1/y3;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/w;->F(Lbc3/c0;Lg1/y3;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lbc3/c0;Lg1/y3;Lc93/a;Lsl0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/w;->N(Lbc3/c0;Lg1/y3;Lc93/a;Lsl0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lsl0/q;Ljava/util/List;Lsl0/q2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/w;->S(Lsl0/q;Ljava/util/List;Lsl0/q2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lsl0/q;Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->C(Lsl0/q;Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lsl0/q;Lnl0/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->M(Lsl0/q;Lnl0/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsl0/w;->J(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/w;->G(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/w;->I(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p2, p1, p3}, Lsl0/w;->Q(Lbc3/c0;Lsl0/q;Lg1/y3;Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lsl0/q;Lc93/a;Lml0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/w;->E(Lsl0/q;Lc93/a;Lml0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;Landroidx/compose/runtime/Composer;II)V
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/n0;",
            "Lc93/a;",
            "Lc93/o;",
            "Lc93/a;",
            "ZZ",
            "Lkotlin/jvm/functions/Function3;",
            "Z",
            "Lsl0/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    const-string v0, "screenArgs"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v3, 0x98e0cb9

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_1
    move v3, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v10, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v3, v9

    :goto_4
    and-int/lit8 v9, v11, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v13, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v13, v10, 0xc00

    if-nez v13, :cond_7

    move-object/from16 v13, p3

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    const/16 v14, 0x800

    goto :goto_5

    :cond_9
    const/16 v14, 0x400

    :goto_5
    or-int/2addr v3, v14

    :goto_6
    and-int/lit8 v14, v11, 0x10

    if-eqz v14, :cond_b

    or-int/lit16 v3, v3, 0x6000

    :cond_a
    move/from16 v15, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v15, v10, 0x6000

    if-nez v15, :cond_a

    move/from16 v15, p4

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_c

    const/16 v16, 0x4000

    goto :goto_7

    :cond_c
    const/16 v16, 0x2000

    :goto_7
    or-int v3, v3, v16

    :goto_8
    and-int/lit8 v16, v11, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_d

    or-int v3, v3, v17

    move/from16 v6, p5

    goto :goto_a

    :cond_d
    and-int v17, v10, v17

    move/from16 v6, p5

    if-nez v17, :cond_f

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_e

    const/high16 v18, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v18, 0x10000

    :goto_9
    or-int v3, v3, v18

    :cond_f
    :goto_a
    and-int/lit8 v18, v11, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_10

    or-int v3, v3, v19

    move-object/from16 v12, p6

    goto :goto_c

    :cond_10
    and-int v19, v10, v19

    move-object/from16 v12, p6

    if-nez v19, :cond_12

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_11

    const/high16 v21, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v21, 0x80000

    :goto_b
    or-int v3, v3, v21

    :cond_12
    :goto_c
    and-int/lit16 v7, v11, 0x80

    const/high16 v22, 0xc00000

    if-eqz v7, :cond_13

    or-int v3, v3, v22

    move/from16 v4, p7

    goto :goto_e

    :cond_13
    and-int v22, v10, v22

    move/from16 v4, p7

    if-nez v22, :cond_15

    invoke-virtual {v0, v4}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_14

    const/high16 v23, 0x800000

    goto :goto_d

    :cond_14
    const/high16 v23, 0x400000

    :goto_d
    or-int v3, v3, v23

    :cond_15
    :goto_e
    const/high16 v23, 0x6000000

    and-int v24, v10, v23

    if-nez v24, :cond_18

    and-int/lit16 v2, v11, 0x100

    if-nez v2, :cond_16

    move-object/from16 v2, p8

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_17

    const/high16 v24, 0x4000000

    goto :goto_f

    :cond_16
    move-object/from16 v2, p8

    :cond_17
    const/high16 v24, 0x2000000

    :goto_f
    or-int v3, v3, v24

    goto :goto_10

    :cond_18
    move-object/from16 v2, p8

    :goto_10
    const v24, 0x2492493

    and-int v2, v3, v24

    move/from16 v24, v3

    const v3, 0x2492492

    const/16 v34, 0x1

    if-eq v2, v3, :cond_19

    move/from16 v2, v34

    goto :goto_11

    :cond_19
    const/4 v2, 0x0

    :goto_11
    and-int/lit8 v3, v24, 0x1

    invoke-virtual {v0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_61

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, v10, 0x1

    const v25, -0xe000001

    const/4 v3, 0x0

    if-eqz v2, :cond_1c

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_14

    :cond_1a
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit16 v2, v11, 0x100

    if-eqz v2, :cond_1b

    and-int v2, v24, v25

    move/from16 v29, p7

    move-object/from16 v5, p8

    move v7, v2

    :goto_12
    move-object/from16 v36, v8

    move-object v2, v12

    move-object/from16 v39, v13

    move/from16 v57, v15

    goto :goto_16

    :cond_1b
    move/from16 v29, p7

    move-object/from16 v5, p8

    :goto_13
    move-object/from16 v36, v8

    move-object v2, v12

    move-object/from16 v39, v13

    move/from16 v57, v15

    move/from16 v7, v24

    goto :goto_16

    :cond_1c
    :goto_14
    if-eqz v5, :cond_1d

    move-object v8, v3

    :cond_1d
    if-eqz v9, :cond_1e

    move-object v13, v3

    :cond_1e
    if-eqz v14, :cond_1f

    const/4 v15, 0x0

    :cond_1f
    if-eqz v16, :cond_20

    move/from16 v6, v34

    :cond_20
    if-eqz v18, :cond_21

    move-object v12, v3

    :cond_21
    if-eqz v7, :cond_22

    const/4 v2, 0x0

    goto :goto_15

    :cond_22
    move/from16 v2, p7

    :goto_15
    and-int/lit16 v5, v11, 0x100

    if-eqz v5, :cond_23

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v7

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    shl-int/lit8 v9, v24, 0x6

    and-int/lit16 v9, v9, 0x380

    invoke-static {v5, v7, v1, v0, v9}, Lsl0/s;->e(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lsl0/q;

    move-result-object v5

    and-int v7, v24, v25

    move/from16 v29, v2

    goto :goto_12

    :cond_23
    move-object/from16 v5, p8

    move/from16 v29, v2

    goto :goto_13

    :goto_16
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v8, Lg1/z3;->w:Lg1/z3;

    const/16 v9, 0xc06

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 p6, v0

    move-object/from16 p2, v8

    move/from16 p7, v9

    move/from16 p8, v12

    move-object/from16 p3, v13

    move-object/from16 p4, v14

    move/from16 p5, v15

    invoke-static/range {p2 .. p8}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v0

    move-object/from16 v27, p6

    invoke-virtual {v5}, Lsl0/q;->c()Lld1/c;

    move-result-object v8

    invoke-virtual {v8}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v8

    new-instance v58, Lnl0/f;

    const v79, 0xfffff

    const/16 v80, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    invoke-direct/range {v58 .. v80}, Lnl0/f;-><init>(ILy81/e;ZZLnl0/a;Lnl0/m;Lcom/whoop/design/util/TextResource;Lnl0/i;Lfl0/k;ZLnl0/k;Lnl0/j;ZZLjava/lang/Boolean;Ljava/util/List;ZZLiz0/m;Lzk0/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v12, 0x2

    move-object/from16 p2, v8

    move/from16 p6, v9

    move/from16 p7, v12

    move-object/from16 p4, v13

    move-object/from16 p5, v27

    move-object/from16 p3, v58

    invoke-static/range {p2 .. p7}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v8

    move-object/from16 v9, p5

    invoke-static {v8}, Lsl0/w;->s(Lp1/t2;)Lnl0/f;

    move-result-object v40

    const v61, 0xeffff

    const/16 v62, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    invoke-static/range {v40 .. v62}, Lnl0/f;->b(Lnl0/f;ILy81/e;ZZLnl0/a;Lnl0/m;Lcom/whoop/design/util/TextResource;Lnl0/i;Lfl0/k;ZLnl0/k;Lnl0/j;ZZLjava/lang/Boolean;Ljava/util/List;ZZLiz0/m;Lzk0/i0;ILjava/lang/Object;)Lnl0/f;

    move-result-object v12

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v8

    invoke-virtual {v9, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v13, v14, :cond_24

    invoke-static {v9}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v13

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v13, Lbc3/c0;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v14, :cond_25

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v15

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v15, Lp1/c1;

    move-object/from16 v48, v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_26

    invoke-virtual {v1}, Lsl0/n0;->e()Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v3, Lcom/whoop/navigation/ChatEntrypointExperience;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v16, :cond_27

    if-ne v4, v14, :cond_28

    :cond_27
    new-instance v4, Lsl0/g;

    const/4 v10, 0x1

    invoke-direct {v4, v5, v10}, Lsl0/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v4, Lc93/m;

    const/4 v10, 0x0

    invoke-static {v4, v9, v10}, Lsl0/p2;->h(Lc93/m;Landroidx/compose/runtime/Composer;I)Lsl0/n2;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v14, :cond_29

    invoke-static/range {v48 .. v48}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v10, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v14, :cond_2a

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object/from16 v46, v11

    check-cast v46, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v14, :cond_2b

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    move-object/from16 v43, v11

    check-cast v43, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v14, :cond_2c

    invoke-static/range {v48 .. v48}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object/from16 v44, v11

    check-cast v44, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v14, :cond_2d

    invoke-static/range {v48 .. v48}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    move-object/from16 v45, v11

    check-cast v45, Lp1/c1;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v11, v11, v16

    move/from16 p2, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez p2, :cond_2f

    if-ne v11, v14, :cond_2e

    goto :goto_17

    :cond_2e
    move-object/from16 p8, v10

    goto :goto_18

    :cond_2f
    :goto_17
    new-instance v11, Lsl0/u;

    move-object/from16 p8, v10

    const/4 v10, 0x1

    invoke-direct {v11, v10, v5, v13}, Lsl0/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_18
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v11, v9}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_30

    if-ne v11, v14, :cond_31

    :cond_30
    new-instance v11, Lsl0/w$f;

    move-object/from16 v10, v48

    invoke-direct {v11, v3, v4, v10}, Lsl0/w$f;-><init>(Lcom/whoop/navigation/ChatEntrypointExperience;Lsl0/n2;Lq83/d;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v11, Lc93/m;

    invoke-static {v9, v11, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/high16 v11, 0x70000

    and-int/2addr v11, v7

    move-object/from16 v16, v4

    const/high16 v4, 0x20000

    if-ne v11, v4, :cond_32

    move/from16 v4, v34

    goto :goto_19

    :cond_32
    const/4 v4, 0x0

    :goto_19
    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v4, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v4, :cond_33

    if-ne v11, v14, :cond_34

    :cond_33
    new-instance v11, Lsl0/w$i;

    const/4 v4, 0x0

    invoke-direct {v11, v6, v5, v4}, Lsl0/w$i;-><init>(ZLsl0/q;Lq83/d;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v11, Lc93/m;

    invoke-static {v9, v11, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_35

    if-ne v10, v14, :cond_36

    :cond_35
    new-instance v10, Lsl0/w$j;

    const/4 v4, 0x0

    invoke-direct {v10, v5, v1, v15, v4}, Lsl0/w$j;-><init>(Lsl0/q;Lsl0/n0;Lp1/c1;Lq83/d;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v10, Lc93/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v10, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15}, Lsl0/w;->z(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_37

    if-ne v11, v14, :cond_38

    :cond_37
    new-instance v11, Lsl0/w$k;

    const/4 v10, 0x0

    invoke-direct {v11, v5, v1, v15, v10}, Lsl0/w$k;-><init>(Lsl0/q;Lsl0/n0;Lp1/c1;Lq83/d;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v11, Lc93/m;

    invoke-static {v9, v11, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lnl0/f;->c()Lnl0/a;

    move-result-object v4

    invoke-virtual {v4}, Lnl0/a;->b()Lnl0/g;

    move-result-object v4

    invoke-virtual {v4}, Lnl0/g;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v9, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Lnl0/f;->c()Lnl0/a;

    move-result-object v11

    invoke-virtual {v11}, Lnl0/a;->b()Lnl0/g;

    move-result-object v11

    move/from16 v50, v6

    and-int/lit16 v6, v7, 0x380

    move/from16 v18, v10

    const/16 v10, 0x100

    if-ne v6, v10, :cond_39

    move/from16 v6, v34

    goto :goto_1a

    :cond_39
    const/4 v6, 0x0

    :goto_1a
    and-int/lit16 v10, v7, 0x1c00

    move/from16 p2, v6

    const/16 v6, 0x800

    if-ne v10, v6, :cond_3a

    move/from16 v6, v34

    goto :goto_1b

    :cond_3a
    const/4 v6, 0x0

    :goto_1b
    or-int v6, p2, v6

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v6, v6, v21

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v6, v6, v21

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v6, v6, v21

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v6, v6, v21

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    or-int v6, v6, v21

    move-object/from16 v42, v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v6, :cond_3c

    if-ne v0, v14, :cond_3b

    goto :goto_1c

    :cond_3b
    move-object/from16 v4, v39

    move-object/from16 v6, v42

    goto :goto_1d

    :cond_3c
    :goto_1c
    new-instance v35, Lsl0/w$l;

    const/16 v47, 0x0

    move-object/from16 v37, v4

    move-object/from16 v40, v5

    move-object/from16 v38, v12

    move-object/from16 v41, v13

    invoke-direct/range {v35 .. v47}, Lsl0/w$l;-><init>(Lc93/o;Ljava/lang/String;Lnl0/f;Lc93/a;Lsl0/q;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    move-object/from16 v0, v35

    move-object/from16 v4, v39

    move-object/from16 v6, v42

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    check-cast v0, Lc93/m;

    invoke-static {v9, v0, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "wce-polling-preview-update"

    invoke-interface {v8, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    const/high16 v11, 0x380000

    if-eqz v0, :cond_40

    const v0, -0x16333522

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lnl0/f;->h()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    and-int/2addr v11, v7

    move/from16 v22, v7

    const/high16 v7, 0x100000

    if-ne v11, v7, :cond_3d

    move/from16 v7, v34

    goto :goto_1e

    :cond_3d
    const/4 v7, 0x0

    :goto_1e
    or-int v7, v21, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_3e

    if-ne v11, v14, :cond_3f

    :cond_3e
    new-instance v11, Lsl0/w$m;

    const/4 v7, 0x0

    invoke-direct {v11, v12, v2, v7}, Lsl0/w$m;-><init>(Lnl0/f;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3f
    check-cast v11, Lc93/m;

    invoke-static {v9, v11, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    goto :goto_22

    :cond_40
    move/from16 v22, v7

    const v0, -0x16300781

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lnl0/f;->h()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    and-int v11, v22, v11

    move/from16 p2, v7

    const/high16 v7, 0x100000

    if-ne v11, v7, :cond_41

    move/from16 v7, v34

    goto :goto_1f

    :cond_41
    const/4 v7, 0x0

    :goto_1f
    or-int v7, p2, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_43

    if-ne v11, v14, :cond_42

    goto :goto_20

    :cond_42
    const/4 v7, 0x0

    goto :goto_21

    :cond_43
    :goto_20
    new-instance v11, Lsl0/w$n;

    const/4 v7, 0x0

    invoke-direct {v11, v12, v2, v7}, Lsl0/w$n;-><init>(Lnl0/f;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    check-cast v11, Lc93/m;

    invoke-static {v9, v11, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_22
    invoke-virtual {v1}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lsl0/n0;->g()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {v15}, Lsl0/w;->z(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v7

    move-object/from16 v19, v0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    move/from16 v7, v23

    move-object/from16 v23, v16

    invoke-static/range {p8 .. p8}, Lsl0/w;->T(Lp1/c1;)Lg2/v;

    move-result-object v16

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    move/from16 v24, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v21, :cond_45

    if-ne v7, v14, :cond_44

    goto :goto_23

    :cond_44
    move/from16 v21, v0

    goto :goto_24

    :cond_45
    :goto_23
    new-instance v7, Lsl0/x;

    move/from16 v21, v0

    const/4 v0, 0x6

    invoke-direct {v7, v5, v0}, Lsl0/x;-><init>(Lsl0/q;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move/from16 p2, v0

    const/16 v0, 0x800

    if-ne v10, v0, :cond_46

    move/from16 v20, v34

    goto :goto_25

    :cond_46
    const/16 v20, 0x0

    :goto_25
    or-int v20, p2, v20

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v20, :cond_48

    if-ne v0, v14, :cond_47

    goto :goto_26

    :cond_47
    move-object/from16 v35, v2

    goto :goto_27

    :cond_48
    :goto_26
    new-instance v0, Lsl0/u;

    move-object/from16 v35, v2

    const/4 v2, 0x0

    invoke-direct {v0, v2, v5, v4}, Lsl0/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_27
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v2, v2, v20

    move-object/from16 v20, v0

    and-int/lit8 v0, v22, 0x70

    move/from16 p2, v2

    const/16 v2, 0x20

    if-ne v0, v2, :cond_49

    move/from16 v0, v34

    goto :goto_28

    :cond_49
    const/4 v0, 0x0

    :goto_28
    or-int v0, p2, v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4a

    if-ne v2, v14, :cond_4b

    :cond_4a
    new-instance v0, Lnw0/e;

    const/16 v2, 0xd

    move-object/from16 p5, p1

    move-object/from16 p2, v0

    move/from16 p7, v2

    move-object/from16 p4, v6

    move-object/from16 p3, v13

    move-object/from16 p6, v46

    invoke-direct/range {p2 .. p7}, Lnw0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v2, p2

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4b
    check-cast v2, Lc93/a;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_4c

    new-instance v0, Lsl0/h;

    move-object/from16 v17, v2

    const/4 v2, 0x1

    move-object/from16 v39, v4

    move-object/from16 v4, p8

    invoke-direct {v0, v2, v4}, Lsl0/h;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_29

    :cond_4c
    move-object/from16 v17, v2

    move-object/from16 v39, v4

    :goto_29
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_4d

    if-ne v4, v14, :cond_4e

    :cond_4d
    new-instance v2, Lsl0/v;

    const/4 v4, 0x0

    move-object/from16 p5, v1

    move-object/from16 p2, v2

    move/from16 p7, v4

    move-object/from16 p4, v5

    move-object/from16 p3, v13

    move-object/from16 p6, v15

    invoke-direct/range {p2 .. p7}, Lsl0/v;-><init>(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;I)V

    move-object/from16 v4, p2

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4e
    check-cast v4, Lc93/a;

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    or-int v2, v2, v26

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    or-int v2, v2, v26

    move-object/from16 v26, v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_4f

    if-ne v0, v14, :cond_50

    :cond_4f
    new-instance v0, Lsl0/v;

    const/4 v2, 0x1

    move-object/from16 p2, v0

    move-object/from16 p5, v1

    move/from16 p7, v2

    move-object/from16 p4, v5

    move-object/from16 p3, v13

    move-object/from16 p6, v15

    invoke-direct/range {p2 .. p7}, Lsl0/v;-><init>(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_50
    check-cast v0, Lc93/a;

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_52

    if-ne v2, v14, :cond_51

    goto :goto_2a

    :cond_51
    move-object v1, v13

    goto :goto_2b

    :cond_52
    :goto_2a
    new-instance v1, Lat2/y;

    move-object/from16 p2, v1

    move-object/from16 p4, v6

    move-object/from16 p3, v13

    move-object/from16 p5, v43

    move-object/from16 p6, v44

    move-object/from16 p7, v45

    move-object/from16 p8, v46

    invoke-direct/range {p2 .. p8}, Lat2/y;-><init>(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    move-object/from16 v2, p2

    move-object/from16 v1, p3

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2b
    check-cast v2, Lkotlin/jvm/functions/Function3;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_53

    if-ne v15, v14, :cond_54

    :cond_53
    new-instance v15, Lsl0/x;

    const/4 v13, 0x4

    invoke-direct {v15, v5, v13}, Lsl0/x;-><init>(Lsl0/q;I)V

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_54
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    move-object/from16 p2, v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_55

    if-ne v0, v14, :cond_56

    :cond_55
    new-instance v0, Lsl0/x;

    const/4 v13, 0x5

    invoke-direct {v0, v5, v13}, Lsl0/x;-><init>(Lsl0/q;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_56
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v27

    or-int v13, v13, v27

    move-object/from16 p3, v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_58

    if-ne v0, v14, :cond_57

    goto :goto_2c

    :cond_57
    move-object/from16 p4, v2

    goto :goto_2d

    :cond_58
    :goto_2c
    new-instance v0, Lsl0/a0;

    const/4 v13, 0x4

    move-object/from16 p4, v2

    const/4 v2, 0x0

    invoke-direct {v0, v5, v12, v2, v13}, Lsl0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2d
    move-object/from16 v27, v0

    check-cast v27, Lc93/a;

    if-eqz v29, :cond_59

    sget-object v0, Lsl0/x1;->NONE:Lsl0/x1;

    :goto_2e
    move-object/from16 v28, v0

    goto :goto_2f

    :cond_59
    sget-object v0, Lsl0/x1;->Companion:Lsl0/x1$a;

    invoke-virtual {v0, v3}, Lsl0/x1$a;->a(Lcom/whoop/navigation/ChatEntrypointExperience;)Lsl0/x1;

    move-result-object v0

    goto :goto_2e

    :goto_2f
    shl-int/lit8 v0, v18, 0x6

    or-int v31, v0, v24

    const/high16 v0, 0x1c00000

    and-int v32, v22, v0

    const/16 v33, 0x0

    move-object/from16 v22, p2

    move-object/from16 v24, p4

    move-object/from16 v30, v9

    move-object v2, v14

    move-object/from16 v25, v15

    move-object/from16 v13, v19

    move-object/from16 v18, v20

    move/from16 v15, v21

    move-object/from16 v20, v26

    const/16 v0, 0x800

    move-object/from16 v26, p3

    move-object/from16 v21, v4

    move-object v14, v11

    move-object/from16 v19, v17

    move-object/from16 v17, v7

    invoke-static/range {v12 .. v33}, Lsl0/p;->j(Lnl0/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLg2/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lsl0/n2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lsl0/x1;ZLandroidx/compose/runtime/Composer;III)V

    move/from16 v3, v29

    invoke-virtual {v6}, Lg1/y3;->e()Z

    move-result v4

    if-eqz v4, :cond_60

    const v4, -0x16069355

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v7, 0xe

    int-to-float v7, v7

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v7, v11

    const/4 v11, 0x0

    const/16 v13, 0xd

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p2, v4

    move/from16 p4, v7

    move/from16 p6, v11

    move/from16 p7, v13

    move/from16 p3, v14

    move/from16 p5, v15

    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Ly81/f;->TRANSPARENT:Ly81/f;

    new-instance v13, Lv41/g;

    invoke-static/range {v43 .. v43}, Lsl0/w;->u(Lp1/c1;)Z

    move-result v7

    if-eqz v7, :cond_5a

    sget v7, Lwk0/b;->E:I

    goto :goto_30

    :cond_5a
    sget v7, Lwk0/b;->M:I

    :goto_30
    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v17

    invoke-static/range {v43 .. v43}, Lsl0/w;->u(Lp1/c1;)Z

    move-result v7

    if-nez v7, :cond_5c

    const-string v7, "context-hub-profile"

    invoke-interface {v8, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5b

    goto :goto_31

    :cond_5b
    new-instance v7, Ly71/g;

    sget v8, Lgy0/a;->j:I

    sget v11, Lwk0/b;->j:I

    invoke-static {v11}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    invoke-direct {v7, v8, v11}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    move-object/from16 v19, v7

    goto :goto_32

    :cond_5c
    :goto_31
    const/16 v19, 0x0

    :goto_32
    const/16 v24, 0x7a

    const/16 v25, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v13

    invoke-direct/range {v16 .. v25}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lv41/f$a;

    invoke-direct {v14, v6}, Lv41/f$a;-><init>(Lg1/y3;)V

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    if-ne v10, v0, :cond_5d

    goto :goto_33

    :cond_5d
    const/16 v34, 0x0

    :goto_33
    or-int v0, v7, v34

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_5f

    if-ne v7, v2, :cond_5e

    goto :goto_34

    :cond_5e
    move-object/from16 v41, v1

    goto :goto_35

    :cond_5f
    :goto_34
    new-instance v0, Lnw0/e;

    const/16 v2, 0xe

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move/from16 p7, v2

    move-object/from16 p6, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v39

    invoke-direct/range {p2 .. p7}, Lnw0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v7, p2

    move-object/from16 v41, p3

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_35
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    new-instance v40, Lcu2/s;

    const/16 v48, 0x5

    move-object/from16 v42, v6

    move-object/from16 v46, v44

    move-object/from16 v47, v45

    move-object/from16 v44, v12

    move-object/from16 v45, v43

    move-object/from16 v43, v5

    invoke-direct/range {v40 .. v48}, Lcu2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v0, v40

    const v1, 0x3c6dcfd5

    invoke-static {v1, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    sget-object v0, Lsl0/k1;->a:Lsl0/k1;

    invoke-virtual {v0}, Lsl0/k1;->b()Lc93/m;

    move-result-object v26

    sget v0, Lv41/g;->h:I

    shl-int/lit8 v0, v0, 0x3

    const v1, 0xc00c06

    or-int/2addr v0, v1

    sget v1, Lv41/f$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int v28, v0, v1

    const/16 v29, 0x6000

    const/16 v30, 0x3f50

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v12, v4

    move-object/from16 v27, v9

    invoke-static/range {v12 .. v30}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_36

    :cond_60
    const/4 v0, 0x0

    const v1, -0x15e171b7

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_36
    move v8, v3

    move-object/from16 v27, v9

    move-object/from16 v7, v35

    move-object/from16 v3, v36

    move-object/from16 v4, v39

    move/from16 v6, v50

    move-object v9, v5

    move/from16 v5, v57

    goto :goto_37

    :cond_61
    move-object v9, v0

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v8

    move-object/from16 v27, v9

    move-object v7, v12

    move-object v4, v13

    move v5, v15

    move/from16 v8, p7

    move-object/from16 v9, p8

    :goto_37
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_62

    new-instance v0, Ld42/g;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ld42/g;-><init>(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_62
    return-void
.end method

.method private static final s(Lp1/t2;)Lnl0/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lnl0/f;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnl0/f;

    return-object p0
.end method

.method private static final t(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final v(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

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

.method private static final y(Lp1/c1;)Lcom/whoop/bot/models/feedback/AiMessageFeedback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/bot/models/feedback/AiMessageFeedback;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    return-object p0
.end method

.method private static final z(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method
