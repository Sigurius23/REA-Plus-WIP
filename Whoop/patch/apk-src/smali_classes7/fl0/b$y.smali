.class public final Lfl0/b$y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$startConversationFlow$$inlined$flatMapLatest$1"
    f = "AiConversationInteractor.kt"
    l = {
        0xc1,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfl0/b;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Z

.field final synthetic K:Z

.field final synthetic L:Ljava/lang/String;

.field final synthetic M:Ljava/util/Map;

.field final synthetic N:Ljava/lang/Long;

.field final synthetic O:Z

.field P:Ljava/lang/Object;

.field Q:Ljava/lang/Object;

.field R:Ljava/lang/Object;

.field S:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lq83/d;ZLfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Z)V
    .locals 0

    iput-boolean p2, p0, Lfl0/b$y;->z:Z

    iput-object p3, p0, Lfl0/b$y;->E:Lfl0/b;

    iput-object p4, p0, Lfl0/b$y;->F:Ljava/lang/String;

    iput-object p5, p0, Lfl0/b$y;->G:Ljava/lang/String;

    iput-object p6, p0, Lfl0/b$y;->H:Ljava/lang/String;

    iput-object p7, p0, Lfl0/b$y;->I:Ljava/lang/String;

    iput-boolean p8, p0, Lfl0/b$y;->J:Z

    iput-boolean p9, p0, Lfl0/b$y;->K:Z

    iput-object p10, p0, Lfl0/b$y;->L:Ljava/lang/String;

    iput-object p11, p0, Lfl0/b$y;->M:Ljava/util/Map;

    iput-object p12, p0, Lfl0/b$y;->N:Ljava/lang/Long;

    iput-boolean p13, p0, Lfl0/b$y;->O:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lpm0/a<",
            "Lcom/whoop/bot/models/conversation/AiChatConversation;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lfl0/b$y;

    iget-boolean v2, p0, Lfl0/b$y;->z:Z

    iget-object v3, p0, Lfl0/b$y;->E:Lfl0/b;

    iget-object v4, p0, Lfl0/b$y;->F:Ljava/lang/String;

    iget-object v5, p0, Lfl0/b$y;->G:Ljava/lang/String;

    iget-object v6, p0, Lfl0/b$y;->H:Ljava/lang/String;

    iget-object v7, p0, Lfl0/b$y;->I:Ljava/lang/String;

    iget-boolean v8, p0, Lfl0/b$y;->J:Z

    iget-boolean v9, p0, Lfl0/b$y;->K:Z

    iget-object v10, p0, Lfl0/b$y;->L:Ljava/lang/String;

    iget-object v11, p0, Lfl0/b$y;->M:Ljava/util/Map;

    iget-object v12, p0, Lfl0/b$y;->N:Ljava/lang/Long;

    iget-boolean v13, p0, Lfl0/b$y;->O:Z

    move-object/from16 v1, p3

    invoke-direct/range {v0 .. v13}, Lfl0/b$y;-><init>(Lq83/d;ZLfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Z)V

    iput-object p1, v0, Lfl0/b$y;->x:Ljava/lang/Object;

    move-object/from16 p1, p2

    iput-object p1, v0, Lfl0/b$y;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfl0/b$y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfl0/b$y;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v10, p0

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v10, Lfl0/b$y;->w:I

    const/4 v12, 0x2

    const/4 v1, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v12, :cond_0

    iget-object v0, v10, Lfl0/b$y;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v10, Lfl0/b$y;->R:Ljava/lang/Object;

    check-cast v0, Lpm0/a;

    iget-object v0, v10, Lfl0/b$y;->Q:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, v10, Lfl0/b$y;->P:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, v10, Lfl0/b$y;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v10, Lfl0/b$y;->x:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lec3/m;

    iget-object v0, v10, Lfl0/b$y;->y:Ljava/lang/Object;

    check-cast v0, Lpm0/a;

    instance-of v2, v0, Lpm0/a$b;

    if-eqz v2, :cond_5

    move-object v3, v0

    check-cast v3, Lpm0/a$b;

    invoke-virtual {v3}, Lpm0/a$b;->b()I

    move-result v4

    const/16 v5, 0x194

    if-eq v4, v5, :cond_3

    iget-boolean v4, v10, Lfl0/b$y;->z:Z

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Lpm0/a$b;->b()I

    move-result v3

    const/16 v4, 0x1f4

    if-ne v3, v4, :cond_5

    :cond_3
    iget-boolean v0, v10, Lfl0/b$y;->z:Z

    if-eqz v0, :cond_4

    iget-object v0, v10, Lfl0/b$y;->E:Lfl0/b;

    iget-object v2, v10, Lfl0/b$y;->F:Ljava/lang/String;

    move-object v3, v2

    iget-object v2, v10, Lfl0/b$y;->G:Ljava/lang/String;

    move-object v4, v3

    iget-object v3, v10, Lfl0/b$y;->H:Ljava/lang/String;

    move-object v5, v4

    iget-object v4, v10, Lfl0/b$y;->I:Ljava/lang/String;

    move-object v6, v5

    iget-boolean v5, v10, Lfl0/b$y;->J:Z

    move-object v7, v6

    iget-boolean v6, v10, Lfl0/b$y;->K:Z

    move-object v8, v7

    iget-object v7, v10, Lfl0/b$y;->L:Ljava/lang/String;

    move-object v9, v8

    iget-object v8, v10, Lfl0/b$y;->M:Ljava/util/Map;

    move-object v15, v9

    iget-object v9, v10, Lfl0/b$y;->N:Ljava/lang/Long;

    iput-object v13, v10, Lfl0/b$y;->x:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->y:Ljava/lang/Object;

    iput-object v14, v10, Lfl0/b$y;->P:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->Q:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->R:Ljava/lang/Object;

    const/4 v12, 0x0

    iput v12, v10, Lfl0/b$y;->S:I

    iput v1, v10, Lfl0/b$y;->w:I

    move-object v1, v15

    invoke-static/range {v0 .. v10}, Lfl0/b;->u(Lfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_8

    goto/16 :goto_1

    :cond_4
    iget-object v0, v10, Lfl0/b$y;->E:Lfl0/b;

    iget-object v1, v10, Lfl0/b$y;->F:Ljava/lang/String;

    iget-object v2, v10, Lfl0/b$y;->G:Ljava/lang/String;

    iget-object v3, v10, Lfl0/b$y;->I:Ljava/lang/String;

    iget-boolean v4, v10, Lfl0/b$y;->K:Z

    invoke-static {v0, v1, v2, v3, v4}, Lfl0/b;->t(Lfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    if-eqz v2, :cond_6

    iget-object v1, v10, Lfl0/b$y;->E:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v1

    check-cast v0, Lpm0/a$b;

    const-string v2, "get_conversation"

    invoke-virtual {v1, v0, v2}, Lxk0/a;->K(Lpm0/a$b;Ljava/lang/String;)V

    iget-object v0, v10, Lfl0/b$y;->E:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v3, Lfl0/j;->ERROR:Lfl0/j;

    new-instance v16, Lfl0/k$b;

    iget-object v0, v10, Lfl0/b$y;->F:Ljava/lang/String;

    iget-object v1, v10, Lfl0/b$y;->G:Ljava/lang/String;

    iget-object v4, v10, Lfl0/b$y;->H:Ljava/lang/String;

    iget-object v5, v10, Lfl0/b$y;->I:Ljava/lang/String;

    iget-boolean v6, v10, Lfl0/b$y;->J:Z

    iget-boolean v7, v10, Lfl0/b$y;->K:Z

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move/from16 v21, v6

    move/from16 v22, v7

    invoke-direct/range {v16 .. v22}, Lfl0/k$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    new-instance v1, Lfl0/c;

    iget-boolean v6, v10, Lfl0/b$y;->O:Z

    const/16 v8, 0x24

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v5, v16

    invoke-direct/range {v1 .. v9}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La6/u;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_6
    iget-object v1, v10, Lfl0/b$y;->E:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->p(Lfl0/b;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v2, "whoop-coach-fetch-suggestions-on-load"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v10, Lfl0/b$y;->E:Lfl0/b;

    iget-boolean v2, v10, Lfl0/b$y;->O:Z

    invoke-static {v1, v0, v2}, Lfl0/b;->w(Lfl0/b;Lpm0/a;Z)Lfl0/c;

    iget-object v0, v10, Lfl0/b$y;->E:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->j(Lfl0/b;)Lec3/l;

    move-result-object v0

    goto :goto_0

    :cond_7
    iget-object v1, v10, Lfl0/b$y;->E:Lfl0/b;

    iget-boolean v2, v10, Lfl0/b$y;->O:Z

    invoke-static {v1, v0, v2}, Lfl0/b;->w(Lfl0/b;Lpm0/a;Z)Lfl0/c;

    move-result-object v0

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object v0, v1

    :cond_8
    :goto_0
    check-cast v0, Lec3/l;

    iput-object v13, v10, Lfl0/b$y;->x:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->y:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->P:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->Q:Ljava/lang/Object;

    iput-object v13, v10, Lfl0/b$y;->R:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v10, Lfl0/b$y;->w:I

    invoke-static {v14, v0, v10}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_9

    :goto_1
    return-object v11

    :cond_9
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
