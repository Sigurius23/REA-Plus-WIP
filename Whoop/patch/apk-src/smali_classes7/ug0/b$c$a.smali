.class final Lug0/b$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$buildConversationPipeline$1$1"
    f = "AiChatConversationCombiner.kt"
    l = {
        0xcf,
        0xd0,
        0xd1,
        0xd5,
        0xd7,
        0xe3,
        0xfa,
        0xfb,
        0xfc,
        0xfe
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:I

.field private synthetic N:Ljava/lang/Object;

.field final synthetic O:Ltg0/a;

.field final synthetic P:Lug0/b;

.field final synthetic Q:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic R:Ltg0/b;

.field final synthetic S:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltg0/a;Lug0/b;Lec3/m;Ltg0/b;Lec3/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg0/a;",
            "Lug0/b;",
            "Lec3/m;",
            "Ltg0/b;",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Lug0/b$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$c$a;->O:Ltg0/a;

    iput-object p2, p0, Lug0/b$c$a;->P:Lug0/b;

    iput-object p3, p0, Lug0/b$c$a;->Q:Lec3/m;

    iput-object p4, p0, Lug0/b$c$a;->R:Ltg0/b;

    iput-object p5, p0, Lug0/b$c$a;->S:Lec3/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lug0/b$c$a;

    iget-object v1, p0, Lug0/b$c$a;->O:Ltg0/a;

    iget-object v2, p0, Lug0/b$c$a;->P:Lug0/b;

    iget-object v3, p0, Lug0/b$c$a;->Q:Lec3/m;

    iget-object v4, p0, Lug0/b$c$a;->R:Ltg0/b;

    iget-object v5, p0, Lug0/b$c$a;->S:Lec3/l;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lug0/b$c$a;-><init>(Ltg0/a;Lug0/b;Lec3/m;Ltg0/b;Lec3/l;Lq83/d;)V

    iput-object p1, v0, Lug0/b$c$a;->N:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lug0/b$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug0/b$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug0/b$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug0/b$c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    iget-object v0, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lug0/b$c$a;->M:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x6

    const/4 v9, 0x1

    const/4 v10, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Lug0/b$c$a;->L:Ljava/lang/Object;

    check-cast v0, Ltg0/b;

    iget-object v0, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    check-cast v0, Ltg0/a;

    iget-object v0, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    check-cast v0, Ltg0/a;

    iget-object v0, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    iget-object v1, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    check-cast v1, Ltg0/b;

    iget-object v3, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v11, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    check-cast v11, Ltg0/b;

    iget-object v11, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    check-cast v11, Ltg0/b;

    iget-object v11, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v11, Lbc3/k1;

    iget-object v12, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v12, Lbc3/k1;

    iget-object v12, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v12, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v12

    move-object v12, v0

    move-object v0, v1

    move-object v1, v11

    :goto_0
    move-object v11, v3

    move-object/from16 v3, v16

    goto/16 :goto_13

    :pswitch_1
    iget-object v0, v5, Lug0/b$c$a;->L:Ljava/lang/Object;

    check-cast v0, Ltg0/b;

    iget-object v1, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    check-cast v1, Ltg0/a;

    iget-object v1, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    check-cast v1, Ltg0/a;

    iget-object v1, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    check-cast v1, Ldc3/c;

    iget-object v3, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    iget-object v3, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v11, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    check-cast v11, Ltg0/b;

    iget-object v11, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    check-cast v11, Ltg0/b;

    iget-object v11, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v11, Lbc3/k1;

    iget-object v11, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v11, Lbc3/k1;

    iget-object v11, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v11, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v1

    move-object v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_11

    :pswitch_2
    iget-object v0, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    check-cast v0, Ltg0/a;

    iget-object v0, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    check-cast v0, Ltg0/a;

    iget-object v0, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    iget-object v1, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    check-cast v1, Ltg0/b;

    iget-object v1, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    check-cast v4, Ltg0/b;

    iget-object v4, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    check-cast v4, Ltg0/b;

    iget-object v4, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v4, Lbc3/k1;

    iget-object v11, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v11, Lbc3/k1;

    iget-object v11, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v11, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v0

    move-object v13, v3

    move-object v3, v11

    move-object/from16 v0, p1

    move-object v11, v1

    goto/16 :goto_10

    :pswitch_3
    iget-object v0, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    check-cast v0, Ltg0/a;

    iget-object v1, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    check-cast v1, Ltg0/a;

    iget-object v1, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    check-cast v1, Ldc3/c;

    iget-object v3, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    iget-object v4, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v11, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    check-cast v12, Ltg0/b;

    iget-object v12, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    check-cast v12, Ltg0/b;

    iget-object v12, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v12, Lbc3/k1;

    iget-object v13, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v13, Lbc3/k1;

    iget-object v13, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v13, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_4
    iget-object v0, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    iget-object v1, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    check-cast v1, Ltg0/b;

    iget-object v3, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v11, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    check-cast v11, Ltg0/b;

    iget-object v11, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    check-cast v11, Ltg0/b;

    iget-object v11, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v11, Lbc3/k1;

    iget-object v12, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v12, Lbc3/k1;

    iget-object v12, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v12, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v12

    move-object v12, v0

    move-object v0, v1

    move-object v1, v11

    move-object v11, v3

    move-object v3, v13

    move-object/from16 v13, p1

    goto/16 :goto_b

    :pswitch_5
    iget-object v0, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    check-cast v0, Ltg0/b;

    iget-object v1, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    check-cast v1, Ltg0/b;

    iget-object v1, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    iget-object v3, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/k1;

    iget-object v3, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v3, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_6
    iget-object v0, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    check-cast v0, Ltg0/b;

    iget-object v1, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    iget-object v1, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v1, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v1

    move-object v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_6

    :pswitch_7
    iget-object v0, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v0, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_4

    :pswitch_8
    iget-object v0, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v0, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_3

    :pswitch_9
    iget-object v0, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v0, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_1

    :pswitch_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const v0, 0x7fffffff

    invoke-static {v0, v8, v10}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, Lug0/b$c$a$a;

    iget-object v4, v5, Lug0/b$c$a;->S:Lec3/l;

    invoke-direct {v3, v4, v0, v10}, Lug0/b$c$a$a;-><init>(Lec3/l;Ldc3/l;Lq83/d;)V

    invoke-static {v2, v10, v1, v3, v9}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iget-object v3, v5, Lug0/b$c$a;->O:Ltg0/a;

    instance-of v4, v3, Ltg0/d;

    if-nez v4, :cond_0

    invoke-virtual {v1, v10}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-object v7

    :cond_0
    instance-of v1, v3, Ltg0/a$b;

    if-eqz v1, :cond_2

    iget-object v1, v5, Lug0/b$c$a;->P:Lug0/b;

    iget-object v4, v5, Lug0/b$c$a;->Q:Lec3/m;

    check-cast v3, Ltg0/a$b;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput v9, v5, Lug0/b$c$a;->M:I

    invoke-static {v1, v4, v3, v5}, Lug0/b;->o(Lug0/b;Lec3/m;Ltg0/a$b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_1

    goto/16 :goto_12

    :cond_1
    :goto_1
    check-cast v1, Ltg0/b;

    :goto_2
    move-object v3, v0

    goto :goto_5

    :cond_2
    instance-of v1, v3, Ltg0/a$n;

    if-eqz v1, :cond_4

    iget-object v1, v5, Lug0/b$c$a;->P:Lug0/b;

    iget-object v3, v5, Lug0/b$c$a;->Q:Lec3/m;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v5, Lug0/b$c$a;->M:I

    invoke-static {v1, v3, v5}, Lug0/b;->v(Lug0/b;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_3

    goto/16 :goto_12

    :cond_3
    :goto_3
    check-cast v1, Ltg0/b;

    goto :goto_2

    :cond_4
    instance-of v1, v3, Ltg0/a$o;

    if-eqz v1, :cond_6

    iget-object v1, v5, Lug0/b$c$a;->P:Lug0/b;

    iget-object v3, v5, Lug0/b$c$a;->Q:Lec3/m;

    iget-object v4, v5, Lug0/b$c$a;->R:Ltg0/b;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    const/4 v11, 0x3

    iput v11, v5, Lug0/b$c$a;->M:I

    invoke-static {v1, v3, v4, v5}, Lug0/b;->y(Lug0/b;Lec3/m;Ltg0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_5

    goto/16 :goto_12

    :cond_5
    :goto_4
    check-cast v1, Ltg0/b;

    goto :goto_2

    :cond_6
    instance-of v1, v3, Ltg0/a$e;

    if-eqz v1, :cond_1a

    iget-object v1, v5, Lug0/b$c$a;->R:Ltg0/b;

    goto :goto_2

    :goto_5
    iget-object v0, v5, Lug0/b$c$a;->P:Lug0/b;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v3, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v1, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v5, Lug0/b$c$a;->M:I

    const/4 v4, 0x0

    invoke-static/range {v0 .. v5}, Lug0/b;->A(Lug0/b;Ltg0/b;Lbc3/c0;Ldc3/x;Lbc3/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_7

    goto/16 :goto_12

    :cond_7
    :goto_6
    check-cast v0, Lbc3/k1;

    iget-object v4, v5, Lug0/b$c$a;->P:Lug0/b;

    invoke-static {v4, v1}, Lug0/b;->H(Lug0/b;Ltg0/b;)Ltg0/b;

    move-result-object v1

    iget-object v4, v5, Lug0/b$c$a;->Q:Lec3/m;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v3, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    iput-object v1, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    const/4 v11, 0x5

    iput v11, v5, Lug0/b$c$a;->M:I

    invoke-interface {v4, v1, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_8

    goto/16 :goto_12

    :cond_8
    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    :goto_7
    iget-object v4, v5, Lug0/b$c$a;->O:Ltg0/a;

    instance-of v11, v4, Ltg0/a$b;

    if-eqz v11, :cond_9

    check-cast v4, Ltg0/a$b;

    invoke-virtual {v4}, Ltg0/a$b;->c()Ljava/lang/String;

    move-result-object v4

    goto :goto_8

    :cond_9
    invoke-virtual {v0}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v4

    goto :goto_8

    :cond_a
    move-object v4, v10

    :goto_8
    invoke-virtual {v0}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v11

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v11

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v11

    goto :goto_9

    :cond_b
    move-object v11, v10

    :goto_9
    invoke-interface {v3}, Ldc3/w;->iterator()Ldc3/c;

    move-result-object v12

    :cond_c
    :goto_a
    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v3, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v1, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    iput-object v4, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    iput-object v11, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    iput-object v12, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->L:Ljava/lang/Object;

    iput v8, v5, Lug0/b$c$a;->M:I

    invoke-virtual {v12, v5}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_d

    goto/16 :goto_12

    :cond_d
    :goto_b
    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-virtual {v12}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ltg0/a;

    instance-of v14, v13, Ltg0/a$l;

    if-eqz v14, :cond_13

    invoke-virtual {v0}, Ltg0/b;->l()Ltg0/h;

    move-result-object v13

    if-eqz v13, :cond_c

    invoke-virtual {v13}, Ltg0/h;->a()Ltg0/a;

    move-result-object v13

    if-nez v13, :cond_e

    goto :goto_a

    :cond_e
    instance-of v14, v13, Ltg0/a$b;

    if-eqz v14, :cond_f

    move-object v15, v13

    check-cast v15, Ltg0/a$b;

    invoke-virtual {v15}, Ltg0/a$b;->c()Ljava/lang/String;

    move-result-object v15

    goto :goto_c

    :cond_f
    invoke-virtual {v0}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v15

    if-eqz v15, :cond_10

    invoke-virtual {v15}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v15

    if-eqz v15, :cond_10

    invoke-virtual {v15}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v15

    goto :goto_c

    :cond_10
    move-object v15, v10

    :goto_c
    if-eqz v14, :cond_11

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    goto :goto_d

    :cond_11
    if-eqz v11, :cond_12

    invoke-static {v15, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    move v14, v9

    goto :goto_d

    :cond_12
    const/4 v14, 0x0

    :goto_d
    if-nez v14, :cond_13

    goto :goto_a

    :cond_13
    iget-object v14, v5, Lug0/b$c$a;->P:Lug0/b;

    invoke-static {v14, v13}, Lug0/b;->e(Lug0/b;Ltg0/a;)Z

    move-result v14

    if-eqz v14, :cond_15

    if-eqz v1, :cond_15

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v3, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v1, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    iput-object v4, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    iput-object v11, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    iput-object v12, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    iput-object v13, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    const/4 v14, 0x7

    iput v14, v5, Lug0/b$c$a;->M:I

    invoke-static {v1, v5}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v6, :cond_14

    goto/16 :goto_12

    :cond_14
    move-object/from16 v16, v3

    move-object v3, v0

    move-object v0, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v12

    move-object v12, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v11

    move-object v11, v4

    move-object/from16 v4, v16

    :goto_e
    move-object v14, v12

    move-object v15, v13

    move-object v12, v1

    move-object v13, v11

    move-object v11, v4

    goto :goto_f

    :cond_15
    move-object v14, v1

    move-object v15, v3

    move-object v3, v0

    move-object v0, v13

    move-object v13, v4

    :goto_f
    iget-object v1, v5, Lug0/b$c$a;->P:Lug0/b;

    move-object v4, v0

    move-object v0, v1

    iget-object v1, v5, Lug0/b$c$a;->Q:Lec3/m;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v15, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v14, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    iput-object v13, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    iput-object v11, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    iput-object v12, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    const/16 v8, 0x8

    iput v8, v5, Lug0/b$c$a;->M:I

    move-object/from16 v16, v4

    move-object v4, v2

    move-object/from16 v2, v16

    invoke-static/range {v0 .. v5}, Lug0/b;->D(Lug0/b;Lec3/m;Ltg0/a;Ltg0/b;Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v4

    if-ne v0, v6, :cond_16

    goto :goto_12

    :cond_16
    move-object v4, v14

    move-object v3, v15

    :goto_10
    move-object v1, v0

    check-cast v1, Ltg0/b;

    iget-object v0, v5, Lug0/b$c$a;->P:Lug0/b;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v3, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    iput-object v13, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    iput-object v11, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    iput-object v12, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    iput-object v1, v5, Lug0/b$c$a;->L:Ljava/lang/Object;

    const/16 v8, 0x9

    iput v8, v5, Lug0/b$c$a;->M:I

    invoke-static/range {v0 .. v5}, Lug0/b;->A(Lug0/b;Ltg0/b;Lbc3/c0;Ldc3/x;Lbc3/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_17

    goto :goto_12

    :cond_17
    move-object v4, v11

    move-object v11, v3

    move-object v3, v4

    move-object v4, v13

    :goto_11
    check-cast v0, Lbc3/k1;

    iget-object v8, v5, Lug0/b$c$a;->P:Lug0/b;

    invoke-static {v8, v1}, Lug0/b;->H(Lug0/b;Ltg0/b;)Ltg0/b;

    move-result-object v1

    iget-object v8, v5, Lug0/b$c$a;->Q:Lec3/m;

    iput-object v2, v5, Lug0/b$c$a;->N:Ljava/lang/Object;

    iput-object v11, v5, Lug0/b$c$a;->w:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->x:Ljava/lang/Object;

    iput-object v0, v5, Lug0/b$c$a;->y:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->z:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->E:Ljava/lang/Object;

    iput-object v4, v5, Lug0/b$c$a;->F:Ljava/lang/Object;

    iput-object v3, v5, Lug0/b$c$a;->G:Ljava/lang/Object;

    iput-object v1, v5, Lug0/b$c$a;->H:Ljava/lang/Object;

    iput-object v12, v5, Lug0/b$c$a;->I:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->J:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->K:Ljava/lang/Object;

    iput-object v10, v5, Lug0/b$c$a;->L:Ljava/lang/Object;

    const/16 v13, 0xa

    iput v13, v5, Lug0/b$c$a;->M:I

    invoke-interface {v8, v1, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_18

    :goto_12
    return-object v6

    :cond_18
    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v11

    goto/16 :goto_0

    :goto_13
    const/4 v8, 0x6

    goto/16 :goto_a

    :cond_19
    return-object v7

    :cond_1a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
