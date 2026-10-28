.class final Liq0/m$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m;->S0(Ljava/lang/String;)V
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendMessage$1"
    f = "CommunityChatViewModel.kt"
    l = {
        0x79
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Liq0/m;


# direct methods
.method public constructor <init>(Liq0/m;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq0/m;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Liq0/m$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$o;->z:Liq0/m;

    iput-object p2, p0, Liq0/m$o;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Liq0/m;Lio/getstream/chat/android/models/Message;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Liq0/m$o;->h(Liq0/m;Lio/getstream/chat/android/models/Message;Ln23/h;)V

    return-void
.end method

.method private static final h(Liq0/m;Lio/getstream/chat/android/models/Message;Ln23/h;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p0, v0, p2, p1}, Liq0/m;->P(Liq0/m;Ljava/lang/String;Ln23/h;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p2}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of p2, p2, Ln23/g;

    invoke-static {p0, p2}, Liq0/m;->R(Liq0/m;Z)V

    invoke-virtual {p0}, Liq0/m;->n0()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Liq0/m;->U(Liq0/m;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Liq0/m$o;

    iget-object v0, p0, Liq0/m$o;->z:Liq0/m;

    iget-object v1, p0, Liq0/m$o;->E:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Liq0/m$o;-><init>(Liq0/m;Ljava/lang/String;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Liq0/m$o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/m$o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/m$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/m$o;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 56

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Liq0/m$o;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Liq0/m$o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Liq0/m$o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move-object v6, v1

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v2}, Liq0/m;->o0()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "toString(...)"

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v4}, Liq0/m;->l0()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v5}, Liq0/m;->k0()Ljava/lang/String;

    move-result-object v5

    const-string v6, ":"

    invoke-static {v4, v6, v5}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Liq0/m$o;->z:Liq0/m;

    iput-object v2, v0, Liq0/m$o;->w:Ljava/lang/Object;

    iput-object v4, v0, Liq0/m$o;->x:Ljava/lang/Object;

    iput v3, v0, Liq0/m$o;->y:I

    invoke-virtual {v5, v0}, Liq0/m;->A0(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    move-object v6, v4

    goto :goto_0

    :goto_1
    move-object/from16 v28, v3

    check-cast v28, Lio/getstream/chat/android/models/User;

    iget-object v1, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v1}, Liq0/m;->s0()Ljava/lang/String;

    move-result-object v9

    new-instance v4, Lio/getstream/chat/android/models/Message;

    iget-object v7, v0, Liq0/m$o;->E:Ljava/lang/String;

    const v54, 0xffff

    const/16 v55, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

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

    const v53, -0x800018

    invoke-direct/range {v4 .. v55}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v1}, Liq0/m;->m0()Ldq0/b;

    move-result-object v1

    iget-object v2, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v2}, Liq0/m;->l0()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Liq0/m$o;->z:Liq0/m;

    invoke-virtual {v3}, Liq0/m;->k0()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v4}, Ldq0/b;->sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v1

    iget-object v2, v0, Liq0/m$o;->z:Liq0/m;

    new-instance v3, Liq0/p;

    const/4 v5, 0x0

    invoke-direct {v3, v2, v4, v5}, Liq0/p;-><init>(Liq0/m;Lio/getstream/chat/android/models/Message;I)V

    invoke-interface {v1, v3}, Lo23/d;->enqueue(Lo23/a;)V

    goto :goto_2

    :cond_3
    iget-object v1, v0, Liq0/m$o;->z:Liq0/m;

    iget-object v2, v0, Liq0/m$o;->E:Ljava/lang/String;

    invoke-static {v1, v2}, Liq0/m;->X(Liq0/m;Ljava/lang/String;)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
