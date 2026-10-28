.class final Lch0/q0$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/q0;->s(Lzg0/i;ZLkotlin/jvm/functions/Function1;Lf0/r1;ZZZLandroidx/compose/runtime/Composer;II)Lch0/o0;
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
    c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$3$1"
    f = "AiChatScrollBehavior.kt"
    l = {
        0x1bd,
        0x1c2,
        0x1c4,
        0x1c5,
        0x1c6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lzg0/i;

.field final synthetic F:Lch0/o0;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:I

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLzg0/i;Lch0/o0;ZZLjava/lang/String;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lzg0/i;",
            "Lch0/o0;",
            "ZZ",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lch0/q0$d;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch0/q0$d;->z:Z

    iput-object p2, p0, Lch0/q0$d;->E:Lzg0/i;

    iput-object p3, p0, Lch0/q0$d;->F:Lch0/o0;

    iput-boolean p4, p0, Lch0/q0$d;->G:Z

    iput-boolean p5, p0, Lch0/q0$d;->H:Z

    iput-object p6, p0, Lch0/q0$d;->I:Ljava/lang/String;

    iput p7, p0, Lch0/q0$d;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lch0/q0$d;

    iget-boolean v1, p0, Lch0/q0$d;->z:Z

    iget-object v2, p0, Lch0/q0$d;->E:Lzg0/i;

    iget-object v3, p0, Lch0/q0$d;->F:Lch0/o0;

    iget-boolean v4, p0, Lch0/q0$d;->G:Z

    iget-boolean v5, p0, Lch0/q0$d;->H:Z

    iget-object v6, p0, Lch0/q0$d;->I:Ljava/lang/String;

    iget v7, p0, Lch0/q0$d;->J:I

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lch0/q0$d;-><init>(ZLzg0/i;Lch0/o0;ZZLjava/lang/String;ILq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/q0$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/q0$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/q0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/q0$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lch0/q0$d;->y:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v7, :cond_2

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lch0/q0$d;->z:Z

    if-nez p1, :cond_f

    iget-object p1, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object p1

    invoke-virtual {p1}, Lzg0/f;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto/16 :goto_4

    :cond_4
    iget-object p1, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->w()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {p1, v1}, Lch0/o0;->O(Z)V

    return-object v6

    :cond_5
    iget-object p1, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->q()Ljava/lang/String;

    move-result-object p1

    iget-boolean v8, p0, Lch0/q0$d;->G:Z

    if-eqz v8, :cond_6

    if-eqz p1, :cond_6

    iget-object v8, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {v8}, Lch0/o0;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    move v1, v7

    :cond_6
    iget-boolean v8, p0, Lch0/q0$d;->H:Z

    if-eqz v8, :cond_7

    iget-object v0, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {v0, p1}, Lch0/o0;->N(Ljava/lang/String;)V

    iget-object p1, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {p1, v7}, Lch0/o0;->O(Z)V

    return-object v6

    :cond_7
    iget-object v8, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {v8}, Lzg0/i;->i()Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object p1, p0, Lch0/q0$d;->F:Lch0/o0;

    const/4 v2, 0x0

    iput-object v2, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    iput v1, p0, Lch0/q0$d;->x:I

    iput v7, p0, Lch0/q0$d;->y:I

    invoke-virtual {p1, p0}, Lch0/o0;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    goto/16 :goto_2

    :cond_8
    iget-object v8, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {v8}, Lch0/o0;->n()Z

    move-result v8

    if-eqz v8, :cond_9

    if-eqz v1, :cond_f

    :cond_9
    if-eqz p1, :cond_b

    iget-object v2, p0, Lch0/q0$d;->F:Lch0/o0;

    iget-object v3, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {v3}, Lzg0/i;->f()Lzg0/f;

    move-result-object v3

    invoke-virtual {v3}, Lzg0/f;->e()Ljava/util/List;

    move-result-object v3

    iput-object p1, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    iput v1, p0, Lch0/q0$d;->x:I

    iput v5, p0, Lch0/q0$d;->y:I

    invoke-virtual {v2, p1, v3, p0}, Lch0/o0;->J(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    goto :goto_2

    :cond_a
    move-object v0, p1

    goto :goto_3

    :cond_b
    iget-object v5, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {v5}, Lzg0/i;->o()Z

    move-result v5

    if-nez v5, :cond_e

    iget-object v5, p0, Lch0/q0$d;->E:Lzg0/i;

    invoke-virtual {v5}, Lzg0/i;->r()I

    move-result v5

    if-le v5, v7, :cond_c

    goto :goto_1

    :cond_c
    iget-object v4, p0, Lch0/q0$d;->I:Ljava/lang/String;

    if-eqz v4, :cond_d

    iget-object v2, p0, Lch0/q0$d;->F:Lch0/o0;

    iput-object p1, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    iput v1, p0, Lch0/q0$d;->x:I

    iput v3, p0, Lch0/q0$d;->y:I

    invoke-virtual {v2, p0}, Lch0/o0;->H(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    goto :goto_2

    :cond_d
    iget-object v3, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {v3}, Lch0/o0;->m()Lr0/a;

    move-result-object v3

    iput-object p1, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    iput v1, p0, Lch0/q0$d;->x:I

    iput v2, p0, Lch0/q0$d;->y:I

    invoke-static {v3, p0}, Lr0/a;->a(Lr0/a;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    goto :goto_2

    :cond_e
    :goto_1
    iget-object v2, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {v2}, Lch0/o0;->t()Lf0/r1;

    move-result-object v2

    iget-object v3, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {v3}, Lch0/o0;->t()Lf0/r1;

    move-result-object v3

    iget-object v3, v3, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v3}, Lp1/h1;->x()I

    move-result v3

    iput-object p1, p0, Lch0/q0$d;->w:Ljava/lang/Object;

    iput v1, p0, Lch0/q0$d;->x:I

    iput v4, p0, Lch0/q0$d;->y:I

    invoke-virtual {v2, v3, p0}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    :goto_2
    return-object v0

    :goto_3
    iget-object p1, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {p1, v0}, Lch0/o0;->N(Ljava/lang/String;)V

    iget-object p1, p0, Lch0/q0$d;->F:Lch0/o0;

    invoke-virtual {p1, v7}, Lch0/o0;->O(Z)V

    iget-object p1, p0, Lch0/q0$d;->F:Lch0/o0;

    iget v0, p0, Lch0/q0$d;->J:I

    invoke-virtual {p1, v0}, Lch0/o0;->Q(I)V

    :cond_f
    :goto_4
    return-object v6
.end method
