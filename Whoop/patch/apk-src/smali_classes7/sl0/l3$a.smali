.class final Lsl0/l3$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/l3;->c(Landroidx/compose/ui/Modifier;ZFJLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.VoiceRecordingAnimationKt$VoiceRecordingAnimation$1$1"
    f = "VoiceRecordingAnimation.kt"
    l = {
        0x43,
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:F

.field final synthetic G:F

.field final synthetic H:F

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic J:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic K:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
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

.field w:F

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(ZFFFLp1/c1;Lp1/c1;Lp1/t2;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZFFF",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/t2;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/l3$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lsl0/l3$a;->E:Z

    iput p2, p0, Lsl0/l3$a;->F:F

    iput p3, p0, Lsl0/l3$a;->G:F

    iput p4, p0, Lsl0/l3$a;->H:F

    iput-object p5, p0, Lsl0/l3$a;->I:Lp1/c1;

    iput-object p6, p0, Lsl0/l3$a;->J:Lp1/c1;

    iput-object p7, p0, Lsl0/l3$a;->K:Lp1/t2;

    iput-object p8, p0, Lsl0/l3$a;->L:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Lsl0/l3$a;

    iget-boolean v1, p0, Lsl0/l3$a;->E:Z

    iget v2, p0, Lsl0/l3$a;->F:F

    iget v3, p0, Lsl0/l3$a;->G:F

    iget v4, p0, Lsl0/l3$a;->H:F

    iget-object v5, p0, Lsl0/l3$a;->I:Lp1/c1;

    iget-object v6, p0, Lsl0/l3$a;->J:Lp1/c1;

    iget-object v7, p0, Lsl0/l3$a;->K:Lp1/t2;

    iget-object v8, p0, Lsl0/l3$a;->L:Lp1/c1;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lsl0/l3$a;-><init>(ZFFFLp1/c1;Lp1/c1;Lp1/t2;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/l3$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/l3$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/l3$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/l3$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/l3$a;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lsl0/l3$a;->x:Ljava/lang/Object;

    check-cast v1, Ld0/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lsl0/l3$a;->w:F

    iget-object v6, p0, Lsl0/l3$a;->x:Ljava/lang/Object;

    check-cast v6, Ld0/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lsl0/l3$a;->E:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Lsl0/l3$a;->I:Lp1/c1;

    invoke-static {p1}, Lsl0/l3;->m(Lp1/c1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lsl0/l3$a;->J:Lp1/c1;

    invoke-static {p1}, Lsl0/l3;->p(Lp1/c1;)I

    move-result p1

    const/16 v1, 0xa

    if-ge p1, v1, :cond_3

    move p1, v1

    :cond_3
    iget-object v6, p0, Lsl0/l3$a;->I:Lp1/c1;

    new-instance v7, Li93/j;

    invoke-direct {v7, v5, p1, v5}, Li93/h;-><init>(III)V

    iget p1, p0, Lsl0/l3$a;->F:F

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v7, v1

    check-cast v7, Li93/i;

    iget-boolean v7, v7, Li93/i;->y:Z

    if-eqz v7, :cond_4

    move-object v7, v1

    check-cast v7, Lm83/e0;

    invoke-virtual {v7}, Lm83/e0;->nextInt()I

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, p1}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v6, v8}, Lsl0/l3;->n(Lp1/c1;Ljava/util/List;)V

    :cond_5
    :goto_1
    iget-object p1, p0, Lsl0/l3$a;->K:Lp1/t2;

    invoke-static {p1}, Lsl0/l3;->q(Lp1/t2;)F

    move-result p1

    cmpl-float p1, p1, v4

    if-lez p1, :cond_6

    iget p1, p0, Lsl0/l3$a;->F:F

    iget-object v1, p0, Lsl0/l3$a;->K:Lp1/t2;

    invoke-static {v1}, Lsl0/l3;->q(Lp1/t2;)F

    move-result v1

    iget v6, p0, Lsl0/l3$a;->G:F

    iget v7, p0, Lsl0/l3$a;->F:F

    invoke-static {v6, v7, v1, p1}, Lb9/y;->a(FFFF)F

    move-result p1

    :goto_2
    move v1, p1

    goto :goto_3

    :cond_6
    iget p1, p0, Lsl0/l3$a;->F:F

    goto :goto_2

    :goto_3
    iget-object p1, p0, Lsl0/l3$a;->I:Lp1/c1;

    invoke-static {p1}, Lsl0/l3;->m(Lp1/c1;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    invoke-static {v7, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-static {p1, v6}, Lsl0/l3;->n(Lp1/c1;Ljava/util/List;)V

    invoke-static {v4}, Ld0/f;->a(F)Ld0/e;

    move-result-object v7

    iget p1, p0, Lsl0/l3$a;->H:F

    neg-float p1, p1

    new-instance v8, Ljava/lang/Float;

    invoke-direct {v8, p1}, Ljava/lang/Float;-><init>(F)V

    const/4 p1, 0x0

    const/4 v6, 0x6

    const/16 v9, 0x32

    invoke-static {v9, p1, v3, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    iput-object v7, p0, Lsl0/l3$a;->x:Ljava/lang/Object;

    iput v1, p0, Lsl0/l3$a;->w:F

    iput v5, p0, Lsl0/l3$a;->z:I

    const/4 v10, 0x0

    const/16 v12, 0xc

    move-object v11, p0

    invoke-static/range {v7 .. v12}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v6, v7

    :goto_4
    iget-object p1, v11, Lsl0/l3$a;->L:Lp1/c1;

    invoke-virtual {v6}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {p1, v6}, Lsl0/l3;->o(Lp1/c1;F)V

    iget-object p1, v11, Lsl0/l3$a;->J:Lp1/c1;

    invoke-static {p1}, Lsl0/l3;->p(Lp1/c1;)I

    move-result p1

    add-int/lit8 p1, p1, 0x5

    iget-object v6, v11, Lsl0/l3$a;->I:Lp1/c1;

    invoke-static {v6}, Lsl0/l3;->m(Lp1/c1;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, p1, :cond_8

    iget-object v6, v11, Lsl0/l3$a;->I:Lp1/c1;

    invoke-static {v6}, Lsl0/l3;->m(Lp1/c1;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7, v5}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v7

    invoke-static {v6, v7}, Lsl0/l3;->n(Lp1/c1;Ljava/util/List;)V

    :cond_8
    iput-object v3, v11, Lsl0/l3$a;->x:Ljava/lang/Object;

    iput v1, v11, Lsl0/l3$a;->w:F

    iput p1, v11, Lsl0/l3$a;->y:I

    iput v2, v11, Lsl0/l3$a;->z:I

    const-wide/16 v6, 0x32

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_5
    return-object v0

    :cond_9
    move-object v11, p0

    iget-object p1, v11, Lsl0/l3$a;->I:Lp1/c1;

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {p1, v0}, Lsl0/l3;->n(Lp1/c1;Ljava/util/List;)V

    iget-object p1, v11, Lsl0/l3$a;->L:Lp1/c1;

    invoke-static {p1, v4}, Lsl0/l3;->o(Lp1/c1;F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
