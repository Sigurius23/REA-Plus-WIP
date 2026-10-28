.class final Lfl0/b$a0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b$a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lfl0/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$uploadImages$1$1"
    f = "AiConversationInteractor.kt"
    l = {
        0x34e,
        0x356,
        0x359,
        0x35f,
        0x365,
        0x3be,
        0x36b,
        0x375
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field J:I

.field K:I

.field L:I

.field private synthetic M:Ljava/lang/Object;

.field final synthetic N:Landroid/net/Uri;

.field final synthetic O:Lfl0/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lfl0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lfl0/b;",
            "Lq83/d<",
            "-",
            "Lfl0/b$a0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    iput-object p2, p0, Lfl0/b$a0$a;->O:Lfl0/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lfl0/b$a0$a;

    iget-object v1, p0, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    iget-object v2, p0, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-direct {v0, v1, v2, p2}, Lfl0/b$a0$a;-><init>(Landroid/net/Uri;Lfl0/b;Lq83/d;)V

    iput-object p1, v0, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lfl0/b$a0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$a0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$a0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$a0$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v5, p0

    iget-object v0, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lfl0/b$a0$a;->L:I

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    check-cast v0, Lfl0/i;

    iget-object v0, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v0, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v0, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    iget-object v0, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iget-object v1, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v1, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v1, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v0

    goto/16 :goto_8

    :pswitch_2
    iget v0, v5, Lfl0/b$a0$a;->J:I

    iget v1, v5, Lfl0/b$a0$a;->I:I

    iget-object v2, v5, Lfl0/b$a0$a;->G:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    iget-object v3, v5, Lfl0/b$a0$a;->F:Ljava/lang/Object;

    check-cast v3, Lfl0/b$a0$a;

    iget-object v3, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    check-cast v3, Lf63/c;

    iget-object v3, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    iget-object v3, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v3, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v3, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move v2, v1

    move v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_5

    :pswitch_3
    iget v0, v5, Lfl0/b$a0$a;->H:I

    iget-object v1, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v2, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    iget-object v3, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v3, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v3, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-object v0, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iget-object v1, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v1, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v1, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v0

    goto/16 :goto_3

    :pswitch_5
    iget-object v0, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v1, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v1, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :pswitch_6
    iget-object v0, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v0, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_1

    :pswitch_7
    iget-object v0, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    check-cast v0, Lfl0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v13, Lfl0/i;

    iget-object v0, v5, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    const/16 v18, 0xa

    const/16 v19, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v13 .. v19}, Lfl0/i;-><init>(ZZLandroid/net/Uri;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->r(Lfl0/b;)Lec3/p1;

    move-result-object v0

    iget-object v1, v5, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    :cond_0
    move-object v2, v0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v6}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v14, Lfl0/c;

    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v16, Lfl0/j;->SUCCESS:Lfl0/j;

    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->r(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v20

    const/16 v21, 0x1c

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v22}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput v10, v5, Lfl0/b$a0$a;->L:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_1

    goto/16 :goto_a

    :cond_1
    :goto_0
    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->q(Lfl0/b;)Lfl0/h;

    move-result-object v0

    iget-object v1, v5, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v5, Lfl0/b$a0$a;->L:I

    invoke-virtual {v0, v1, v5}, Lfl0/h;->d(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_2

    goto/16 :goto_a

    :cond_2
    :goto_1
    check-cast v0, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    iget-object v1, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v13

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v2}, Lfl0/b;->s(Lfl0/b;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lfl0/b$a0$a$a;

    iget-object v3, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-direct {v4, v3, v0, v12}, Lfl0/b$a0$a$a;-><init>(Lfl0/b;Lcom/whoop/bot/models/conversation/ImageUploadRequest;Lq83/d;)V

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    iput-object v13, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, v5, Lfl0/b$a0$a;->L:I

    move-object v0, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    goto/16 :goto_a

    :cond_3
    :goto_2
    iget-object v1, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    iget-object v2, v5, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    check-cast v0, Lu02/a;

    instance-of v3, v0, Lu02/a$b;

    if-eqz v3, :cond_5

    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v3

    check-cast v0, Lu02/a$b;

    const-string v4, "upload_image"

    invoke-virtual {v3, v0, v4}, Lxk0/a;->L(Lu02/a$b;Ljava/lang/String;)V

    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v0

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    iput-object v2, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    iput v11, v5, Lfl0/b$a0$a;->H:I

    const/4 v1, 0x4

    iput v1, v5, Lfl0/b$a0$a;->L:I

    invoke-virtual {v0, v13, v5}, Lxk0/a;->O(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto/16 :goto_a

    :cond_4
    move-object/from16 v16, v2

    :goto_3
    new-instance v13, Lfl0/i;

    const/16 v18, 0x9

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lfl0/i;-><init>(ZZLandroid/net/Uri;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_9

    :cond_5
    instance-of v3, v0, Lu02/a$c;

    if-eqz v3, :cond_f

    move-object v3, v0

    check-cast v3, Lu02/a$c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf63/c;

    invoke-virtual {v3}, Lf63/c;->e()Li63/v;

    move-result-object v3

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v3, Li63/v;->a:I

    const/16 v4, 0xc8

    if-gt v4, v3, :cond_b

    const/16 v4, 0x12c

    if-ge v3, v4, :cond_b

    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v1

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    iput-object v2, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    iput-object v0, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    iput v11, v5, Lfl0/b$a0$a;->H:I

    const/4 v3, 0x5

    iput v3, v5, Lfl0/b$a0$a;->L:I

    invoke-virtual {v1, v13, v5}, Lxk0/a;->Q(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_6

    goto/16 :goto_a

    :cond_6
    move-object v1, v0

    move v0, v11

    :goto_4
    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf63/c;

    invoke-virtual {v1}, Lf63/c;->a()Lw53/b;

    move-result-object v1

    const-class v3, Lcom/whoop/bot/models/conversation/ImageUploadResponse;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v4, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v3

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->F:Ljava/lang/Object;

    iput-object v2, v5, Lfl0/b$a0$a;->G:Ljava/lang/Object;

    iput v0, v5, Lfl0/b$a0$a;->H:I

    iput v11, v5, Lfl0/b$a0$a;->I:I

    iput v11, v5, Lfl0/b$a0$a;->J:I

    iput v11, v5, Lfl0/b$a0$a;->K:I

    const/4 v0, 0x6

    iput v0, v5, Lfl0/b$a0$a;->L:I

    invoke-virtual {v1, v3, v5}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto/16 :goto_a

    :cond_7
    move-object/from16 v16, v2

    move v1, v11

    move v2, v1

    :goto_5
    if-eqz v0, :cond_a

    check-cast v0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->getId()Ljava/lang/String;

    move-result-object v17

    new-instance v13, Lfl0/i;

    if-eqz v1, :cond_8

    move v14, v10

    goto :goto_6

    :cond_8
    move v14, v11

    :goto_6
    if-eqz v2, :cond_9

    move v15, v10

    goto :goto_7

    :cond_9
    move v15, v11

    :goto_7
    const/16 v18, 0x3

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v19}, Lfl0/i;-><init>(ZZLandroid/net/Uri;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.whoop.bot.models.conversation.ImageUploadResponse"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v0

    iput-object v8, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    iput-object v2, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    iput v11, v5, Lfl0/b$a0$a;->H:I

    const/4 v1, 0x7

    iput v1, v5, Lfl0/b$a0$a;->L:I

    invoke-virtual {v0, v13, v5}, Lxk0/a;->O(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    goto/16 :goto_a

    :cond_c
    move-object/from16 v16, v2

    :goto_8
    new-instance v13, Lfl0/i;

    const/16 v18, 0x9

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lfl0/i;-><init>(ZZLandroid/net/Uri;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_9
    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->r(Lfl0/b;)Lec3/p1;

    move-result-object v0

    iget-object v1, v5, Lfl0/b$a0$a;->N:Landroid/net/Uri;

    :cond_d
    move-object v2, v0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v6}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v14, Lfl0/c;

    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v16, Lfl0/j;->SUCCESS:Lfl0/j;

    iget-object v0, v5, Lfl0/b$a0$a;->O:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->r(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v20

    const/16 v21, 0x1c

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v22}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v12, v5, Lfl0/b$a0$a;->M:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->x:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->y:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->z:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->E:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->F:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$a0$a;->G:Ljava/lang/Object;

    const/16 v0, 0x8

    iput v0, v5, Lfl0/b$a0$a;->L:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    :goto_a
    return-object v9

    :cond_e
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
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
