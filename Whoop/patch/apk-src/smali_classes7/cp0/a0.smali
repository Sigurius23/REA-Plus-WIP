.class public abstract Lcp0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a}\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u00062\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001e\u00b2\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\n8\nX\u008a\u0084\u0002\u00b2\u0006\u0018\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u00068\nX\u008a\u0084\u0002\u00b2\u0006\u0012\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\nX\u008a\u0084\u0002\u00b2\u0006\u0018\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "conversationKey",
        "Lql0/c;",
        "speechRecognitionManager",
        "Lcp0/w;",
        "voiceLaunchRequest",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onVoiceLaunchConsumed",
        "Lq3/y;",
        "draftInput",
        "onDraftInputChanged",
        "Lkotlin/Function0;",
        "",
        "canSendVoiceResult",
        "sendVoiceResult",
        "Lcp0/x;",
        "l",
        "(Ljava/lang/String;Lql0/c;Lcp0/w;Lkotlin/jvm/functions/Function1;Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcp0/x;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "coachDrawerVoiceLogger",
        "ownedSpeechRecognitionManager",
        "autoSendAfterPermission",
        "currentDraftInput",
        "currentOnDraftInputChanged",
        "currentCanSendVoiceResult",
        "currentSendVoiceResult",
        "coach-everywhere_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "CoachDrawerVoice"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lcp0/a0;->a:Ltr2/n;

    return-void
.end method

.method private static final A(Lp1/c1;ZLp1/t2;Lp1/t2;Lp1/t2;Lq3/y;)Ll83/a0;
    .locals 2

    const-string v0, "result"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p5, Lq3/y;->a:Ll3/g;

    invoke-static {p2}, Lcp0/a0;->p(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, p5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p5}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    iget-object p0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p3}, Lcp0/a0;->q(Lp1/t2;)Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p4}, Lcp0/a0;->r(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    iget-object p1, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcp0/a0;->p(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p1, Lq3/y;

    const-wide/16 p2, 0x0

    const/4 p4, 0x7

    const/4 p5, 0x0

    invoke-direct {p1, p4, p5, p2, p3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/t2;Lq3/y;)Ll83/a0;
    .locals 1

    const-string v0, "partial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcp0/a0;->p(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;Lql0/b;)Ll83/a0;
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcp0/a0;->a:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Speech recognition error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/z0;F)Ll83/a0;
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lql0/c;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcp0/a0;->v(Lql0/c;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/t2;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lql0/c;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/a0;->u(Lql0/c;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;ZLp1/t2;Lp1/t2;Lp1/t2;Lq3/y;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcp0/a0;->A(Lp1/c1;ZLp1/t2;Lp1/t2;Lp1/t2;Lq3/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/t2;Lq3/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/a0;->B(Lp1/t2;Lq3/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/a0;->D(Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lbc3/c0;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/z0;Z)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lcp0/a0;->s(Lp1/c1;Lbc3/c0;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Lql0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/a0;->C(Lp1/c1;Lql0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lp1/c1;Lh/i;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p11}, Lcp0/a0;->m(Lp1/c1;Lh/i;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lql0/c;Landroid/content/Context;Lp1/c1;)Lql0/c;
    .locals 0

    invoke-static {p0, p1, p2}, Lcp0/a0;->n(Lql0/c;Landroid/content/Context;Lp1/c1;)Lql0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lcp0/a0;->w(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic k(Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Lql0/c;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcp0/a0;->z(Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Lql0/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/lang/String;Lql0/c;Lcp0/w;Lkotlin/jvm/functions/Function1;Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcp0/x;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lql0/c;",
            "Lcp0/w;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq3/y;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lcp0/x;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v13, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move/from16 v15, p9

    const-string v5, "conversationKey"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onVoiceLaunchConsumed"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "draftInput"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onDraftInputChanged"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "canSendVoiceResult"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sendVoiceResult"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    move-object/from16 v14, p8

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v5, v8, :cond_0

    invoke-static {v14}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v5, Lbc3/c0;

    and-int/lit8 v9, v15, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/16 v16, 0x1

    const/4 v10, 0x4

    if-le v9, v10, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_2

    :cond_1
    and-int/lit8 v11, v15, 0x6

    if-ne v11, v10, :cond_3

    :cond_2
    move/from16 v11, v16

    goto :goto_0

    :cond_3
    const/4 v11, 0x0

    :goto_0
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/16 v18, 0x0

    if-nez v11, :cond_4

    if-ne v10, v8, :cond_5

    :cond_4
    invoke-static/range {v18 .. v18}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v10, Lp1/c1;

    if-nez v6, :cond_6

    invoke-static {v10}, Lcp0/a0;->o(Lp1/c1;)Lql0/c;

    move-result-object v11

    move-object/from16 v19, v11

    goto :goto_1

    :cond_6
    move-object/from16 v19, v6

    :goto_1
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v8, :cond_7

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v11

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lec3/p1;

    if-eqz v19, :cond_9

    invoke-interface/range {v19 .. v19}, Lql0/c;->b()Lec3/f2;

    move-result-object v20

    if-nez v20, :cond_8

    goto :goto_2

    :cond_8
    move-object/from16 v11, v20

    :cond_9
    :goto_2
    const/4 v13, 0x0

    invoke-static {v11, v14, v13}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v11

    const/4 v13, 0x4

    if-le v9, v13, :cond_b

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_a

    goto :goto_3

    :cond_a
    move-object/from16 v20, v11

    goto :goto_4

    :cond_b
    :goto_3
    move-object/from16 v20, v11

    and-int/lit8 v11, v15, 0x6

    if-ne v11, v13, :cond_c

    :goto_4
    move/from16 v11, v16

    goto :goto_5

    :cond_c
    const/4 v11, 0x0

    :goto_5
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_d

    if-ne v13, v8, :cond_e

    :cond_d
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v14, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v13, Lp1/c1;

    const/4 v11, 0x4

    if-le v9, v11, :cond_f

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_10

    :cond_f
    and-int/lit8 v12, v15, 0x6

    if-ne v12, v11, :cond_11

    :cond_10
    move/from16 v11, v16

    goto :goto_6

    :cond_11
    const/4 v11, 0x0

    :goto_6
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_12

    if-ne v12, v8, :cond_13

    :cond_12
    const/4 v11, 0x0

    invoke-static {v11, v14}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v12

    :cond_13
    move-object v11, v12

    check-cast v11, Lp1/z0;

    const/4 v12, 0x4

    if-le v9, v12, :cond_15

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_14

    goto :goto_7

    :cond_14
    move/from16 v17, v9

    goto :goto_8

    :cond_15
    :goto_7
    move/from16 v17, v9

    and-int/lit8 v9, v15, 0x6

    if-ne v9, v12, :cond_16

    :goto_8
    move/from16 v9, v16

    goto :goto_9

    :cond_16
    const/4 v9, 0x0

    :goto_9
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_17

    if-ne v12, v8, :cond_18

    :cond_17
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v9, v12

    check-cast v9, Lp1/c1;

    invoke-static {v1, v14}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v21

    invoke-static {v2, v14}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v1

    invoke-static {v3, v14}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    invoke-static {v4, v14}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v12

    invoke-static {v14}, Lh/g;->a(Landroidx/compose/runtime/Composer;)Lj/k;

    move-result-object v3

    if-eqz v3, :cond_1b

    const v3, 0x56bb9470

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    new-instance v3, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v3}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    or-int v4, v4, v22

    move-object/from16 p4, v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_1a

    if-ne v1, v8, :cond_19

    goto :goto_a

    :cond_19
    move-object v0, v3

    move-object/from16 v24, v8

    move-object v8, v10

    move-object v4, v12

    move-object/from16 v23, v20

    const/4 v12, 0x0

    move-object/from16 v10, p4

    move-object v3, v2

    move-object v2, v13

    move-object/from16 v13, v19

    goto :goto_b

    :cond_1a
    :goto_a
    new-instance v1, Lcp0/y;

    move-object v0, v3

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object/from16 v24, v8

    move-object v7, v9

    move-object v6, v10

    move-object v10, v12

    move-object/from16 v23, v20

    const/4 v12, 0x0

    move-object/from16 v8, p4

    move-object v9, v2

    move-object v2, v13

    move-object/from16 v13, v19

    invoke-direct/range {v1 .. v11}, Lcp0/y;-><init>(Lp1/c1;Lbc3/c0;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/z0;)V

    move-object v3, v6

    move-object v6, v4

    move-object v4, v10

    move-object v10, v8

    move-object v8, v3

    move-object v3, v9

    move-object v9, v7

    move-object v7, v5

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v14, v12}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v0

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move-object v5, v0

    goto :goto_c

    :cond_1b
    move-object v3, v2

    move-object/from16 v24, v8

    move-object v8, v10

    move-object v4, v12

    move-object v2, v13

    move-object/from16 v13, v19

    move-object/from16 v23, v20

    const/4 v12, 0x0

    move-object v10, v1

    const v0, 0x56c2b07a

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move-object/from16 v5, v18

    :goto_c
    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1c

    move-object/from16 v0, v24

    if-ne v1, v0, :cond_1d

    goto :goto_d

    :cond_1c
    move-object/from16 v0, v24

    :goto_d
    new-instance v1, Lcp0/w0;

    const/4 v12, 0x2

    invoke-direct {v1, v13, v12}, Lcp0/w0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v1, v14}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    if-eqz p2, :cond_1e

    invoke-virtual/range {p2 .. p2}, Lcp0/w;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    :cond_1e
    and-int/lit16 v1, v15, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v12, 0x100

    if-le v1, v12, :cond_1f

    move-object/from16 v1, p2

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_20

    goto :goto_e

    :cond_1f
    move-object/from16 v1, p2

    :goto_e
    and-int/lit16 v1, v15, 0x180

    if-ne v1, v12, :cond_21

    :cond_20
    move/from16 v1, v16

    goto :goto_f

    :cond_21
    const/4 v1, 0x0

    :goto_f
    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    and-int/lit16 v12, v15, 0x1c00

    xor-int/lit16 v12, v12, 0xc00

    move/from16 p4, v1

    const/16 v1, 0x800

    if-le v12, v1, :cond_23

    move-object/from16 v12, p3

    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_22

    goto :goto_10

    :cond_22
    move-object/from16 v19, v2

    goto :goto_11

    :cond_23
    move-object/from16 v12, p3

    :goto_10
    move-object/from16 v19, v2

    and-int/lit16 v2, v15, 0xc00

    if-ne v2, v1, :cond_24

    :goto_11
    move/from16 v1, v16

    goto :goto_12

    :cond_24
    const/4 v1, 0x0

    :goto_12
    or-int v1, p4, v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_26

    if-ne v2, v0, :cond_25

    goto :goto_13

    :cond_25
    move-object/from16 v24, v0

    move-object v1, v2

    move-object v9, v3

    move-object v12, v4

    move-object/from16 v25, v13

    move-object v15, v14

    move-object/from16 v0, v18

    move-object/from16 v2, v19

    const/16 v18, 0x0

    goto :goto_14

    :cond_26
    :goto_13
    new-instance v1, Lcp0/a0$a;

    move-object v2, v14

    const/4 v14, 0x0

    move-object/from16 v24, v0

    move-object v15, v2

    move-object/from16 v25, v13

    move-object/from16 v0, v18

    const/16 v18, 0x0

    move-object/from16 v2, p2

    move-object v13, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v4

    move-object/from16 v4, v19

    invoke-direct/range {v1 .. v14}, Lcp0/a0$a;-><init>(Lcp0/w;Lkotlin/jvm/functions/Function1;Lp1/c1;Lh/i;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Lq83/d;)V

    move-object v2, v4

    move-object v9, v11

    move-object v11, v13

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v1, Lc93/m;

    invoke-static {v15, v1, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v0, v17

    const/4 v13, 0x4

    if-le v0, v13, :cond_27

    move-object/from16 v0, p0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    :cond_27
    and-int/lit8 v0, p9, 0x6

    if-ne v0, v13, :cond_29

    :cond_28
    :goto_15
    move-object/from16 v13, v25

    goto :goto_16

    :cond_29
    move/from16 v16, v18

    goto :goto_15

    :goto_16
    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int v0, v16, v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2a

    move-object/from16 v0, v24

    if-ne v1, v0, :cond_2b

    :cond_2a
    new-instance v1, Lcp0/x;

    new-instance v0, Lam2/b;

    const/4 v3, 0x3

    move-object/from16 p0, v0

    move-object/from16 p2, v2

    move/from16 p7, v3

    move-object/from16 p4, v9

    move-object/from16 p6, v10

    move-object/from16 p5, v12

    move-object/from16 p1, v13

    move-object/from16 p3, v21

    invoke-direct/range {p0 .. p7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v3, p0

    move-object/from16 v0, v23

    invoke-direct {v1, v2, v0, v11, v3}, Lcp0/x;-><init>(Lp1/t2;Lp1/t2;Lp1/t2;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v1, Lcp0/x;

    return-object v1
.end method

.method private static final m(Lp1/c1;Lh/i;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;ZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lh/i;",
            "Lql0/c;",
            "Landroid/content/Context;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/z0;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p2, p3, p4}, Lcp0/a0;->n(Lql0/c;Landroid/content/Context;Lp1/c1;)Lql0/c;

    move-result-object p2

    invoke-interface {p2}, Lql0/c;->isAvailable()Z

    move-result p3

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p3, :cond_0

    sget-object p1, Lcp0/a0;->a:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string p3, "Speech recognition not available"

    invoke-interface {p1, p3, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    invoke-interface {p2}, Lql0/c;->c()Z

    move-result p3

    if-nez p3, :cond_2

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-static {p5, p10}, Lcp0/a0;->x(Lp1/c1;Z)V

    if-eqz p1, :cond_1

    const-string p0, "android.permission.RECORD_AUDIO"

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p2}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_2
    move-object p5, p2

    move-object p1, p6

    move-object p2, p7

    move-object p3, p8

    move-object p4, p9

    move p6, p10

    move-object p7, p11

    invoke-static/range {p0 .. p7}, Lcp0/a0;->z(Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Lql0/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    return-object v0
.end method

.method private static final n(Lql0/c;Landroid/content/Context;Lp1/c1;)Lql0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lql0/c;",
            "Landroid/content/Context;",
            "Lp1/c1;",
            ")",
            "Lql0/c;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {p2}, Lcp0/a0;->o(Lp1/c1;)Lql0/c;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lql0/d;->w:Lql0/d;

    invoke-virtual {p0, p1}, Lql0/d;->a(Landroid/content/Context;)Lql0/c;

    move-result-object p0

    invoke-static {p2, p0}, Lcp0/a0;->t(Lp1/c1;Lql0/c;)V

    :cond_0
    return-object p0
.end method

.method private static final o(Lp1/c1;)Lql0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lql0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lql0/c;

    return-object p0
.end method

.method private static final p(Lp1/t2;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method private static final q(Lp1/t2;)Lc93/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc93/a;

    return-object p0
.end method

.method private static final r(Lp1/t2;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method private static final s(Lp1/c1;Lbc3/c0;Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Z)Ll83/a0;
    .locals 12

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-eqz p10, :cond_0

    new-instance v1, Lcp0/a0$c;

    const/4 v11, 0x0

    move-object v6, p0

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcp0/a0$c;-><init>(Lql0/c;Landroid/content/Context;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Lq83/d;)V

    const/4 p0, 0x3

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;Lql0/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lql0/c;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u(Lql0/c;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcp0/a0$b;

    invoke-direct {p1, p0}, Lcp0/a0$b;-><init>(Lql0/c;)V

    return-object p1
.end method

.method private static final v(Lql0/c;Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/t2;Z)Ll83/a0;
    .locals 2

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lql0/c;->stopListening()V

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-eqz p6, :cond_1

    invoke-static {p2}, Lcp0/a0;->y(Lp1/t2;)Lq3/y;

    move-result-object p0

    iget-object p0, p0, Lq3/y;->a:Ll3/g;

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    const/4 p1, 0x7

    const-wide/16 v0, 0x0

    const/4 p6, 0x0

    if-eqz p0, :cond_2

    invoke-static {p3}, Lcp0/a0;->q(Lp1/t2;)Lc93/a;

    move-result-object p3

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p4}, Lcp0/a0;->r(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p2}, Lcp0/a0;->y(Lp1/t2;)Lq3/y;

    move-result-object p2

    iget-object p2, p2, Lq3/y;->a:Ll3/g;

    iget-object p2, p2, Ll3/g;->x:Ljava/lang/String;

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcp0/a0;->p(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p2, Lq3/y;

    invoke-direct {p2, p1, p6, v0, v1}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    if-nez p0, :cond_3

    invoke-static {p5}, Lcp0/a0;->p(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p2, Lq3/y;

    invoke-direct {p2, p1, p6, v0, v1}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp1/c1;)Z
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

.method private static final x(Lp1/c1;Z)V
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

.method private static final y(Lp1/t2;)Lq3/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lq3/y;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq3/y;

    return-object p0
.end method

.method private static final z(Lp1/c1;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/z0;Lql0/c;ZLq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/z0;",
            "Lql0/c;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p7

    instance-of v1, v0, Lcp0/a0$d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcp0/a0$d;

    iget v3, v1, Lcp0/a0$d;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v1, Lcp0/a0$d;->I:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lcp0/a0$d;

    invoke-direct {v1, v0}, Lcp0/a0$d;-><init>(Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lcp0/a0$d;->H:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lcp0/a0$d;->I:I

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v10, :cond_1

    iget-object v1, v7, Lcp0/a0$d;->F:Ljava/lang/Object;

    check-cast v1, Lql0/c;

    iget-object v1, v7, Lcp0/a0$d;->E:Ljava/lang/Object;

    check-cast v1, Lp1/z0;

    iget-object v1, v7, Lcp0/a0$d;->z:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v1, v7, Lcp0/a0$d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v1, v7, Lcp0/a0$d;->x:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v1, v7, Lcp0/a0$d;->w:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface/range {p5 .. p5}, Lql0/c;->b()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :try_start_1
    new-instance v0, Lcp0/z;

    const/4 v1, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcp0/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    new-instance v4, Lcp0/w0;

    const/4 v2, 0x3

    invoke-direct {v4, p1, v2}, Lcp0/w0;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lcp0/k0;

    const/4 v2, 0x1

    invoke-direct {v5, v2, p0}, Lcp0/k0;-><init>(ILp1/c1;)V

    new-instance v6, Lcp0/l0;

    const/4 v2, 0x2

    invoke-direct {v6, p4, v2}, Lcp0/l0;-><init>(Lp1/z0;I)V

    iput-object p0, v7, Lcp0/a0$d;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v7, Lcp0/a0$d;->x:Ljava/lang/Object;

    iput-object v2, v7, Lcp0/a0$d;->y:Ljava/lang/Object;

    iput-object v2, v7, Lcp0/a0$d;->z:Ljava/lang/Object;

    iput-object v2, v7, Lcp0/a0$d;->E:Ljava/lang/Object;

    iput-object v2, v7, Lcp0/a0$d;->F:Ljava/lang/Object;

    move/from16 v2, p6

    iput-boolean v2, v7, Lcp0/a0$d;->G:Z

    iput v10, v7, Lcp0/a0$d;->I:I

    move-object/from16 v2, p5

    move-object v3, v0

    invoke-interface/range {v2 .. v7}, Lql0/c;->d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v8, :cond_4

    return-object v8

    :catch_1
    move-exception v0

    move-object v1, p0

    :goto_2
    sget-object v2, Lcp0/a0;->a:Ltr2/n;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Unable to start speech recognition: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    return-object v9
.end method
