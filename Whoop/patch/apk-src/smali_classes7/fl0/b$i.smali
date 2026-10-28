.class public final Lfl0/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$interact$$inlined$flatMapLatest$1"
    f = "AiConversationInteractor.kt"
    l = {
        0xc2,
        0xcb,
        0xcc,
        0xcd,
        0xe3,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfl0/b;


# direct methods
.method public constructor <init>(Lq83/d;Lfl0/b;)V
    .locals 0

    iput-object p2, p0, Lfl0/b$i;->z:Lfl0/b;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lfl0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lfl0/b$i;

    iget-object v1, p0, Lfl0/b$i;->z:Lfl0/b;

    invoke-direct {v0, p3, v1}, Lfl0/b$i;-><init>(Lq83/d;Lfl0/b;)V

    iput-object p1, v0, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfl0/b$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfl0/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfl0/b$i;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v10, p0

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v10, Lfl0/b$i;->w:I

    const/4 v12, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1
    iget-object v0, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    check-cast v0, Lfl0/a;

    iget-object v0, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Lec3/m;

    iget-object v0, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    check-cast v0, Lfl0/a;

    instance-of v1, v0, Lfl0/a$i;

    if-eqz v1, :cond_0

    iget-object v14, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v0, Lfl0/a$i;

    invoke-virtual {v0}, Lfl0/a$i;->c()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lfl0/a$i;->d()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lfl0/a$i;->b()Ljava/util/List;

    move-result-object v18

    invoke-virtual {v0}, Lfl0/a$i;->a()Ljava/util/List;

    move-result-object v19

    invoke-virtual {v0}, Lfl0/a$i;->f()Ljava/lang/Long;

    move-result-object v20

    invoke-virtual {v0}, Lfl0/a$i;->g()Z

    move-result v21

    invoke-virtual {v0}, Lfl0/a$i;->e()Lfl0/l;

    move-result-object v22

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/16 v16, 0x0

    invoke-static/range {v14 .. v24}, Lfl0/b;->Q(Lfl0/b;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZLfl0/l;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    instance-of v1, v0, Lfl0/a$j;

    if-eqz v1, :cond_1

    iget-object v14, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v0, Lfl0/a$j;

    invoke-virtual {v0}, Lfl0/a$j;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lfl0/a$j;->b()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lfl0/a$j;->c()Lfl0/l;

    move-result-object v22

    const/16 v23, 0x78

    const/16 v24, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v14 .. v24}, Lfl0/b;->Q(Lfl0/b;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZLfl0/l;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    instance-of v1, v0, Lfl0/a$l;

    if-eqz v1, :cond_2

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->y(Lfl0/b;)Lec3/l;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    instance-of v1, v0, Lfl0/a$k;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v1, v0

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v1, Lfl0/a$k;

    move-object v3, v1

    invoke-virtual {v3}, Lfl0/a$k;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lfl0/a$k;->b()Ljava/lang/String;

    move-result-object v4

    move-object v5, v3

    invoke-virtual {v5}, Lfl0/a$k;->f()Ljava/lang/String;

    move-result-object v3

    move-object v6, v4

    invoke-virtual {v5}, Lfl0/a$k;->e()Ljava/lang/String;

    move-result-object v4

    move-object v7, v5

    invoke-virtual {v7}, Lfl0/a$k;->d()Z

    move-result v5

    move-object v8, v6

    invoke-virtual {v7}, Lfl0/a$k;->c()Z

    move-result v6

    move-object v9, v7

    invoke-virtual {v9}, Lfl0/a$k;->g()Ljava/lang/String;

    move-result-object v7

    move-object v14, v8

    invoke-virtual {v9}, Lfl0/a$k;->a()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v9}, Lfl0/a$k;->i()Ljava/lang/Long;

    move-result-object v9

    iput-object v12, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    iput v2, v10, Lfl0/b$i;->H:I

    const/4 v2, 0x1

    iput v2, v10, Lfl0/b$i;->w:I

    move-object v2, v14

    invoke-static/range {v0 .. v10}, Lfl0/b;->x(Lfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_c

    goto/16 :goto_1

    :cond_3
    move-object v1, v0

    sget-object v0, Lfl0/a$e;->a:Lfl0/a$e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v14, Lfl0/c;

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v16, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v21, 0x3c

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, v14, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_4
    instance-of v0, v1, Lfl0/a$f;

    if-eqz v0, :cond_5

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v1, Lfl0/a$f;

    invoke-virtual {v1}, Lfl0/a$f;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    iput v2, v10, Lfl0/b$i;->H:I

    const/4 v2, 0x2

    iput v2, v10, Lfl0/b$i;->w:I

    invoke-static {v0, v1, v10}, Lfl0/b;->i(Lfl0/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_c

    goto/16 :goto_1

    :cond_5
    instance-of v0, v1, Lfl0/a$c;

    if-eqz v0, :cond_6

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v1, Lfl0/a$c;

    invoke-virtual {v1}, Lfl0/a$c;->a()Ljava/util/UUID;

    move-result-object v1

    iput-object v12, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    iput v2, v10, Lfl0/b$i;->H:I

    const/4 v2, 0x3

    iput v2, v10, Lfl0/b$i;->w:I

    invoke-static {v0, v1, v10}, Lfl0/b;->g(Lfl0/b;Ljava/util/UUID;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_c

    goto/16 :goto_1

    :cond_6
    instance-of v0, v1, Lfl0/a$d;

    if-eqz v0, :cond_7

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v1, Lfl0/a$d;

    invoke-virtual {v1}, Lfl0/a$d;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    iput v2, v10, Lfl0/b$i;->H:I

    const/4 v2, 0x4

    iput v2, v10, Lfl0/b$i;->w:I

    invoke-static {v0, v1, v10}, Lfl0/b;->h(Lfl0/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_c

    goto/16 :goto_1

    :cond_7
    instance-of v0, v1, Lfl0/a$g;

    if-eqz v0, :cond_8

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->j(Lfl0/b;)Lec3/l;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    instance-of v0, v1, Lfl0/a$b;

    if-eqz v0, :cond_9

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v0

    iget-object v1, v10, Lfl0/b$i;->z:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxk0/a;->d(Ljava/lang/String;)V

    new-instance v14, Lfl0/c;

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v16, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v21, 0x3c

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, v14, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_9
    instance-of v0, v1, Lfl0/a$a;

    if-eqz v0, :cond_a

    iget-object v3, v10, Lfl0/b$i;->z:Lfl0/b;

    move-object v0, v1

    check-cast v0, Lfl0/a$a;

    invoke-virtual {v0}, Lfl0/a$a;->b()Z

    move-result v4

    invoke-virtual {v0}, Lfl0/a$a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lfl0/a$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lfl0/a$a;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lfl0/a$a;->c()Z

    move-result v8

    invoke-static/range {v3 .. v8}, Lfl0/b;->f(Lfl0/b;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object v0

    goto :goto_0

    :cond_a
    instance-of v0, v1, Lfl0/a$m;

    if-eqz v0, :cond_b

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v1, Lfl0/a$m;

    invoke-virtual {v1}, Lfl0/a$m;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lfl0/b;->z(Lfl0/b;Ljava/util/List;)Lec3/l;

    move-result-object v0

    goto :goto_0

    :cond_b
    instance-of v0, v1, Lfl0/a$h;

    if-eqz v0, :cond_e

    iget-object v0, v10, Lfl0/b$i;->z:Lfl0/b;

    check-cast v1, Lfl0/a$h;

    invoke-virtual {v1}, Lfl0/a$h;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lfl0/a$h;->b()Landroid/net/Uri;

    move-result-object v1

    iput-object v12, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    iput v2, v10, Lfl0/b$i;->H:I

    const/4 v2, 0x5

    iput v2, v10, Lfl0/b$i;->w:I

    invoke-static {v0, v3, v1, v10}, Lfl0/b;->v(Lfl0/b;Ljava/lang/String;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_c

    goto :goto_1

    :cond_c
    :goto_0
    check-cast v0, Lec3/l;

    iput-object v12, v10, Lfl0/b$i;->x:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->y:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->E:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->F:Ljava/lang/Object;

    iput-object v12, v10, Lfl0/b$i;->G:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, v10, Lfl0/b$i;->w:I

    invoke-static {v13, v0, v10}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_d

    :goto_1
    return-object v11

    :cond_d
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
