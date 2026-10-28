.class final Lsl0/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/i;->w(ILy81/e;Lcom/whoop/design/util/TextResource;ZZZLn0/u;ZLnl0/m;ZLsl0/n2;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lc93/m;Ljava/util/List;Lg2/v;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V
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
    c = "com.whoop.bot.view.AiChatInputRowKt$AiChatInputRow$9$1"
    f = "AiChatInputRow.kt"
    l = {
        0x74
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg2/s;

.field final synthetic F:Ln0/u;

.field final synthetic G:Z

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lg2/v;

.field final synthetic z:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLg2/v;Lc93/m;Lg2/s;Ln0/u;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lg2/v;",
            "Lc93/m;",
            "Lg2/s;",
            "Ln0/u;",
            "Z",
            "Lq83/d<",
            "-",
            "Lsl0/i$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lsl0/i$b;->x:Z

    iput-object p2, p0, Lsl0/i$b;->y:Lg2/v;

    iput-object p3, p0, Lsl0/i$b;->z:Lc93/m;

    iput-object p4, p0, Lsl0/i$b;->E:Lg2/s;

    iput-object p5, p0, Lsl0/i$b;->F:Ln0/u;

    iput-boolean p6, p0, Lsl0/i$b;->G:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lsl0/i$b;

    iget-boolean v1, p0, Lsl0/i$b;->x:Z

    iget-object v2, p0, Lsl0/i$b;->y:Lg2/v;

    iget-object v3, p0, Lsl0/i$b;->z:Lc93/m;

    iget-object v4, p0, Lsl0/i$b;->E:Lg2/s;

    iget-object v5, p0, Lsl0/i$b;->F:Ln0/u;

    iget-boolean v6, p0, Lsl0/i$b;->G:Z

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lsl0/i$b;-><init>(ZLg2/v;Lc93/m;Lg2/s;Ln0/u;ZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsl0/i$b;->w:I

    const-string v3, "visitChildren called on an unattached node"

    const/16 v4, 0x10

    const-string v5, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v8, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v2, v0, Lsl0/i$b;->x:Z

    if-eqz v2, :cond_32

    iget-object v2, v0, Lsl0/i$b;->y:Lg2/v;

    if-eqz v2, :cond_2

    check-cast v2, Lg2/w;

    invoke-virtual {v2}, Lg2/w;->a()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v0, Lsl0/i$b;->z:Lc93/m;

    sget-object v9, Lxk0/a$a;->OPEN:Lxk0/a$a;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v2, v0, Lsl0/i$b;->E:Lg2/s;

    invoke-static {v2}, Lg2/s;->c(Lg2/s;)V

    iget-object v2, v0, Lsl0/i$b;->E:Lg2/s;

    iget-object v2, v2, Lg2/s;->a:Lr1/c;

    iget v9, v2, Lr1/c;->y:I

    if-nez v9, :cond_3

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-object v2, v2, Lr1/c;->w:[Ljava/lang/Object;

    move v10, v7

    :goto_0
    if-ge v10, v9, :cond_19

    aget-object v11, v2, v10

    check-cast v11, Lg2/t;

    check-cast v11, Lb2/v;

    iget-object v12, v11, Lb2/v;->w:Lb2/v;

    const/4 v13, 0x0

    :goto_1
    if-eqz v12, :cond_b

    instance-of v14, v12, Lg2/x;

    if-eqz v14, :cond_4

    check-cast v12, Lg2/x;

    invoke-static {v12}, Lg2/g;->d(Lg2/x;)Z

    move-result v12

    if-eqz v12, :cond_a

    goto/16 :goto_9

    :cond_4
    iget v14, v12, Lb2/v;->y:I

    and-int/lit16 v14, v14, 0x400

    if-eqz v14, :cond_a

    instance-of v14, v12, La3/o;

    if-eqz v14, :cond_a

    move-object v14, v12

    check-cast v14, La3/o;

    iget-object v14, v14, La3/o;->P:Lb2/v;

    move v15, v7

    :goto_2
    if-eqz v14, :cond_9

    iget v6, v14, Lb2/v;->y:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_8

    add-int/lit8 v15, v15, 0x1

    if-ne v15, v8, :cond_5

    move-object v12, v14

    goto :goto_3

    :cond_5
    if-nez v13, :cond_6

    new-instance v13, Lr1/c;

    new-array v6, v4, [Lb2/v;

    invoke-direct {v13, v6}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v12, :cond_7

    invoke-virtual {v13, v12}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v12, 0x0

    :cond_7
    invoke-virtual {v13, v14}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_3
    iget-object v14, v14, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_9
    if-ne v15, v8, :cond_a

    goto :goto_1

    :cond_a
    invoke-static {v13}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v12

    goto :goto_1

    :cond_b
    iget-object v6, v11, Lb2/v;->w:Lb2/v;

    iget-boolean v6, v6, Lb2/v;->N:Z

    if-nez v6, :cond_c

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_c
    new-instance v6, Lr1/c;

    new-array v12, v4, [Lb2/v;

    invoke-direct {v6, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v11, v11, Lb2/v;->w:Lb2/v;

    iget-object v12, v11, Lb2/v;->F:Lb2/v;

    if-nez v12, :cond_d

    invoke-static {v6, v11}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_4

    :cond_d
    invoke-virtual {v6, v12}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_e
    :goto_4
    iget v11, v6, Lr1/c;->y:I

    if-eqz v11, :cond_18

    add-int/lit8 v11, v11, -0x1

    invoke-virtual {v6, v11}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb2/v;

    iget v12, v11, Lb2/v;->z:I

    and-int/lit16 v12, v12, 0x400

    if-nez v12, :cond_f

    invoke-static {v6, v11}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_4

    :cond_f
    :goto_5
    if-eqz v11, :cond_e

    iget v12, v11, Lb2/v;->y:I

    and-int/lit16 v12, v12, 0x400

    if-eqz v12, :cond_17

    const/4 v12, 0x0

    :goto_6
    if-eqz v11, :cond_e

    instance-of v13, v11, Lg2/x;

    if-eqz v13, :cond_10

    check-cast v11, Lg2/x;

    invoke-static {v11}, Lg2/g;->d(Lg2/x;)Z

    move-result v11

    if-eqz v11, :cond_16

    goto :goto_9

    :cond_10
    iget v13, v11, Lb2/v;->y:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_16

    instance-of v13, v11, La3/o;

    if-eqz v13, :cond_16

    move-object v13, v11

    check-cast v13, La3/o;

    iget-object v13, v13, La3/o;->P:Lb2/v;

    move v14, v7

    :goto_7
    if-eqz v13, :cond_15

    iget v15, v13, Lb2/v;->y:I

    and-int/lit16 v15, v15, 0x400

    if-eqz v15, :cond_14

    add-int/lit8 v14, v14, 0x1

    if-ne v14, v8, :cond_11

    move-object v11, v13

    goto :goto_8

    :cond_11
    if-nez v12, :cond_12

    new-instance v12, Lr1/c;

    new-array v15, v4, [Lb2/v;

    invoke-direct {v12, v15}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_12
    if-eqz v11, :cond_13

    invoke-virtual {v12, v11}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v11, 0x0

    :cond_13
    invoke-virtual {v12, v13}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_14
    :goto_8
    iget-object v13, v13, Lb2/v;->F:Lb2/v;

    goto :goto_7

    :cond_15
    if-ne v14, v8, :cond_16

    goto :goto_6

    :cond_16
    invoke-static {v12}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v11

    goto :goto_6

    :cond_17
    iget-object v11, v11, Lb2/v;->F:Lb2/v;

    goto :goto_5

    :cond_18
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_19
    :goto_9
    iget-object v2, v0, Lsl0/i$b;->F:Ln0/u;

    iget-object v2, v2, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v2}, Lh0/d0;->b()Z

    move-result v2

    if-nez v2, :cond_31

    iget-boolean v2, v0, Lsl0/i$b;->G:Z

    if-eqz v2, :cond_1a

    goto/16 :goto_13

    :cond_1a
    iget-object v1, v0, Lsl0/i$b;->E:Lg2/s;

    iget-object v1, v1, Lg2/s;->a:Lr1/c;

    iget v2, v1, Lr1/c;->y:I

    if-nez v2, :cond_1b

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_1b
    iget-object v1, v1, Lr1/c;->w:[Ljava/lang/Object;

    move v5, v7

    :goto_a
    if-ge v5, v2, :cond_32

    aget-object v6, v1, v5

    check-cast v6, Lg2/t;

    check-cast v6, Lb2/v;

    iget-object v9, v6, Lb2/v;->w:Lb2/v;

    const/4 v10, 0x0

    :goto_b
    if-eqz v9, :cond_23

    instance-of v11, v9, Lg2/x;

    if-eqz v11, :cond_1c

    check-cast v9, Lg2/x;

    invoke-static {v9}, Lg2/g;->n(Lg2/x;)Z

    move-result v9

    if-eqz v9, :cond_22

    goto/16 :goto_14

    :cond_1c
    iget v11, v9, Lb2/v;->y:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_22

    instance-of v11, v9, La3/o;

    if-eqz v11, :cond_22

    move-object v11, v9

    check-cast v11, La3/o;

    iget-object v11, v11, La3/o;->P:Lb2/v;

    move v12, v7

    :goto_c
    if-eqz v11, :cond_21

    iget v13, v11, Lb2/v;->y:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_20

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v8, :cond_1d

    move-object v9, v11

    goto :goto_d

    :cond_1d
    if-nez v10, :cond_1e

    new-instance v10, Lr1/c;

    new-array v13, v4, [Lb2/v;

    invoke-direct {v10, v13}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_1e
    if-eqz v9, :cond_1f

    invoke-virtual {v10, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v9, 0x0

    :cond_1f
    invoke-virtual {v10, v11}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_20
    :goto_d
    iget-object v11, v11, Lb2/v;->F:Lb2/v;

    goto :goto_c

    :cond_21
    if-ne v12, v8, :cond_22

    goto :goto_b

    :cond_22
    invoke-static {v10}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v9

    goto :goto_b

    :cond_23
    iget-object v9, v6, Lb2/v;->w:Lb2/v;

    iget-boolean v9, v9, Lb2/v;->N:Z

    if-nez v9, :cond_24

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_24
    new-instance v9, Lr1/c;

    new-array v10, v4, [Lb2/v;

    invoke-direct {v9, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v6, v6, Lb2/v;->w:Lb2/v;

    iget-object v10, v6, Lb2/v;->F:Lb2/v;

    if-nez v10, :cond_25

    invoke-static {v9, v6}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_e

    :cond_25
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_26
    :goto_e
    iget v6, v9, Lr1/c;->y:I

    if-eqz v6, :cond_30

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v9, v6}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb2/v;

    iget v10, v6, Lb2/v;->z:I

    and-int/lit16 v10, v10, 0x400

    if-nez v10, :cond_27

    invoke-static {v9, v6}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_e

    :cond_27
    :goto_f
    if-eqz v6, :cond_26

    iget v10, v6, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_2f

    const/4 v10, 0x0

    :goto_10
    if-eqz v6, :cond_26

    instance-of v11, v6, Lg2/x;

    if-eqz v11, :cond_28

    check-cast v6, Lg2/x;

    invoke-static {v6}, Lg2/g;->n(Lg2/x;)Z

    move-result v6

    if-eqz v6, :cond_2e

    goto :goto_14

    :cond_28
    iget v11, v6, Lb2/v;->y:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_2e

    instance-of v11, v6, La3/o;

    if-eqz v11, :cond_2e

    move-object v11, v6

    check-cast v11, La3/o;

    iget-object v11, v11, La3/o;->P:Lb2/v;

    move v12, v7

    :goto_11
    if-eqz v11, :cond_2d

    iget v13, v11, Lb2/v;->y:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_2c

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v8, :cond_29

    move-object v6, v11

    goto :goto_12

    :cond_29
    if-nez v10, :cond_2a

    new-instance v10, Lr1/c;

    new-array v13, v4, [Lb2/v;

    invoke-direct {v10, v13}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_2a
    if-eqz v6, :cond_2b

    invoke-virtual {v10, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v6, 0x0

    :cond_2b
    invoke-virtual {v10, v11}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_2c
    :goto_12
    iget-object v11, v11, Lb2/v;->F:Lb2/v;

    goto :goto_11

    :cond_2d
    if-ne v12, v8, :cond_2e

    goto :goto_10

    :cond_2e
    invoke-static {v10}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v6

    goto :goto_10

    :cond_2f
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_f

    :cond_30
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_a

    :cond_31
    :goto_13
    iput v8, v0, Lsl0/i$b;->w:I

    const-wide/16 v9, 0xc8

    invoke-static {v9, v10, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_19

    return-object v1

    :cond_32
    :goto_14
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
