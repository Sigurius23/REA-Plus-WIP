.class final Lcp0/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/f;->d(Lcp0/g1;FZZLd0/l;ZLc93/m;Landroidx/compose/runtime/Composer;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coacheverywhere.view.composables.AiCoachOnboardingHighlightKt$AiCoachOnboardingHighlight$1$1"
    f = "AiCoachOnboardingHighlight.kt"
    l = {
        0x52,
        0x53,
        0x54,
        0x55,
        0x56,
        0x57,
        0x5a,
        0x5e,
        0x5f,
        0x61,
        0x67
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic F:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic G:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic H:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic I:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic J:Z

.field final synthetic K:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic L:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic M:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic z:Lcp0/g1;


# direct methods
.method public constructor <init>(ZLd0/e;Lcp0/g1;Ld0/e;Ld0/e;Ld0/e;Ld0/e;Ld0/e;ZLd0/e;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ld0/e;",
            "Lcp0/g1;",
            "Ld0/e;",
            "Ld0/e;",
            "Ld0/e;",
            "Ld0/e;",
            "Ld0/e;",
            "Z",
            "Ld0/e;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lcp0/f$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcp0/f$a;->x:Z

    iput-object p2, p0, Lcp0/f$a;->y:Ld0/e;

    iput-object p3, p0, Lcp0/f$a;->z:Lcp0/g1;

    iput-object p4, p0, Lcp0/f$a;->E:Ld0/e;

    iput-object p5, p0, Lcp0/f$a;->F:Ld0/e;

    iput-object p6, p0, Lcp0/f$a;->G:Ld0/e;

    iput-object p7, p0, Lcp0/f$a;->H:Ld0/e;

    iput-object p8, p0, Lcp0/f$a;->I:Ld0/e;

    iput-boolean p9, p0, Lcp0/f$a;->J:Z

    iput-object p10, p0, Lcp0/f$a;->K:Ld0/e;

    iput-object p11, p0, Lcp0/f$a;->L:Lp1/c1;

    iput-object p12, p0, Lcp0/f$a;->M:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p13}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 14
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

    new-instance v0, Lcp0/f$a;

    iget-boolean v1, p0, Lcp0/f$a;->x:Z

    iget-object v2, p0, Lcp0/f$a;->y:Ld0/e;

    iget-object v3, p0, Lcp0/f$a;->z:Lcp0/g1;

    iget-object v4, p0, Lcp0/f$a;->E:Ld0/e;

    iget-object v5, p0, Lcp0/f$a;->F:Ld0/e;

    iget-object v6, p0, Lcp0/f$a;->G:Ld0/e;

    iget-object v7, p0, Lcp0/f$a;->H:Ld0/e;

    iget-object v8, p0, Lcp0/f$a;->I:Ld0/e;

    iget-boolean v9, p0, Lcp0/f$a;->J:Z

    iget-object v10, p0, Lcp0/f$a;->K:Ld0/e;

    iget-object v11, p0, Lcp0/f$a;->L:Lp1/c1;

    iget-object v12, p0, Lcp0/f$a;->M:Lp1/c1;

    move-object/from16 v13, p2

    invoke-direct/range {v0 .. v13}, Lcp0/f$a;-><init>(ZLd0/e;Lcp0/g1;Ld0/e;Ld0/e;Ld0/e;Ld0/e;Ld0/e;ZLd0/e;Lp1/c1;Lp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcp0/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcp0/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcp0/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcp0/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcp0/f$a;->w:I

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_b

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcp0/f$a;->x:Z

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcp0/f$a;->y:Ld0/e;

    iget-object v1, p0, Lcp0/f$a;->z:Lcp0/g1;

    invoke-virtual {v1}, Lcp0/g1;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->a:F

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    iput v6, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v7, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    :goto_0
    move-object v11, p0

    goto/16 :goto_c

    :cond_0
    :goto_1
    iget-object p1, p0, Lcp0/f$a;->E:Ld0/e;

    iget-object v1, p0, Lcp0/f$a;->z:Lcp0/g1;

    invoke-virtual {v1}, Lcp0/g1;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->b:F

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    const/4 v1, 0x2

    iput v1, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v7, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_2
    iget-object p1, p0, Lcp0/f$a;->F:Ld0/e;

    iget-object v1, p0, Lcp0/f$a;->z:Lcp0/g1;

    invoke-virtual {v1}, Lcp0/g1;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->c:F

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    const/4 v1, 0x3

    iput v1, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v7, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_3
    iget-object p1, p0, Lcp0/f$a;->G:Ld0/e;

    iget-object v1, p0, Lcp0/f$a;->z:Lcp0/g1;

    invoke-virtual {v1}, Lcp0/g1;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->d:F

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    const/4 v1, 0x4

    iput v1, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v7, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    :goto_4
    iget-object p1, p0, Lcp0/f$a;->H:Ld0/e;

    iget-object v1, p0, Lcp0/f$a;->z:Lcp0/g1;

    invoke-virtual {v1}, Lcp0/g1;->a()F

    move-result v1

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    const/4 v1, 0x5

    iput v1, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v7, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    :goto_5
    iget-object p1, p0, Lcp0/f$a;->I:Ld0/e;

    iget-object v1, p0, Lcp0/f$a;->z:Lcp0/g1;

    invoke-virtual {v1}, Lcp0/g1;->b()F

    move-result v1

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    iput v4, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v7, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_5
    :goto_6
    iget-boolean p1, p0, Lcp0/f$a;->J:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcp0/f$a;->K:Ld0/e;

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    const/4 v2, 0x7

    iput v2, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v1, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_0

    :cond_6
    :goto_7
    iget-object p1, p0, Lcp0/f$a;->L:Lp1/c1;

    invoke-static {p1, v6}, Lcp0/f;->n(Lp1/c1;Z)V

    iget-object p1, p0, Lcp0/f$a;->M:Lp1/c1;

    invoke-static {p1, v6}, Lcp0/f;->l(Lp1/c1;Z)V

    :goto_8
    move-object v11, p0

    goto :goto_d

    :cond_7
    iget-object p1, p0, Lcp0/f$a;->K:Ld0/e;

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    const/16 v2, 0x8

    iput v2, p0, Lcp0/f$a;->w:I

    invoke-virtual {p1, v1, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto/16 :goto_0

    :cond_8
    :goto_9
    const/16 p1, 0x9

    iput p1, p0, Lcp0/f$a;->w:I

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_0

    :cond_9
    :goto_a
    iget-object p1, p0, Lcp0/f$a;->L:Lp1/c1;

    invoke-static {p1, v6}, Lcp0/f;->n(Lp1/c1;Z)V

    iget-object v7, p0, Lcp0/f$a;->K:Ld0/e;

    new-instance v8, Ljava/lang/Float;

    invoke-direct {v8, v3}, Ljava/lang/Float;-><init>(F)V

    const/16 p1, 0x12c

    const/4 v1, 0x0

    invoke-static {p1, v5, v1, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    const/16 p1, 0xa

    iput p1, p0, Lcp0/f$a;->w:I

    const/4 v10, 0x0

    const/16 v12, 0xc

    move-object v11, p0

    invoke-static/range {v7 .. v12}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_c

    :cond_a
    :goto_b
    iget-object p1, v11, Lcp0/f$a;->M:Lp1/c1;

    invoke-static {p1, v6}, Lcp0/f;->l(Lp1/c1;Z)V

    goto :goto_d

    :cond_b
    move-object v11, p0

    iget-object p1, v11, Lcp0/f$a;->L:Lp1/c1;

    invoke-static {p1, v5}, Lcp0/f;->n(Lp1/c1;Z)V

    iget-object p1, v11, Lcp0/f$a;->M:Lp1/c1;

    invoke-static {p1, v5}, Lcp0/f;->l(Lp1/c1;Z)V

    iget-object p1, v11, Lcp0/f$a;->K:Ld0/e;

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    const/16 v2, 0xb

    iput v2, v11, Lcp0/f$a;->w:I

    invoke-virtual {p1, v1, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_c
    return-object v0

    :cond_c
    :goto_d
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
