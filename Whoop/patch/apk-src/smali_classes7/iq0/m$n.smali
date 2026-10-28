.class final Liq0/m$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m;->R0(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendImageToStream$1"
    f = "CommunityChatViewModel.kt"
    l = {
        0x171
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Liq0/m;

.field final synthetic J:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Liq0/m;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Liq0/m;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Liq0/m$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$n;->F:Ljava/util/List;

    iput-object p2, p0, Liq0/m$n;->G:Ljava/lang/String;

    iput-object p3, p0, Liq0/m$n;->H:Ljava/lang/String;

    iput-object p4, p0, Liq0/m$n;->I:Liq0/m;

    iput-object p5, p0, Liq0/m$n;->J:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Liq0/n;Ljava/lang/Object;)Lio/getstream/chat/android/models/Attachment;
    .locals 0

    invoke-static {p0, p1}, Liq0/m$n;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment;
    .locals 0

    invoke-static {p0}, Liq0/m$n;->j(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Liq0/m;Lio/getstream/chat/android/models/Message;Lbc3/c0;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Liq0/m$n;->l(Liq0/m;Lio/getstream/chat/android/models/Message;Lbc3/c0;Ln23/h;)V

    return-void
.end method

.method private static final j(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment;
    .locals 23

    new-instance v0, Lio/getstream/chat/android/models/Attachment;

    const v21, 0xff5ef

    const/16 v22, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const-string v12, "image"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v10, p0

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v22}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/getstream/chat/android/models/Attachment;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/Attachment;

    return-object p0
.end method

.method private static final l(Liq0/m;Lio/getstream/chat/android/models/Message;Lbc3/c0;Ln23/h;)V
    .locals 1

    const-string p2, "image"

    invoke-static {p0, p2, p3, p1}, Liq0/m;->P(Liq0/m;Ljava/lang/String;Ln23/h;Lio/getstream/chat/android/models/Message;)V

    instance-of p2, p3, Ln23/g;

    invoke-static {p0, p2}, Liq0/m;->Q(Liq0/m;Z)V

    invoke-virtual {p3}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    if-nez p2, :cond_0

    invoke-static {p0}, Liq0/m;->M(Liq0/m;)Ltr2/n;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Send image to stream failed."

    invoke-interface {p2, v0, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    invoke-virtual {p0}, Liq0/m;->n0()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Liq0/m;->U(Liq0/m;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

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

    new-instance v0, Liq0/m$n;

    iget-object v1, p0, Liq0/m$n;->F:Ljava/util/List;

    iget-object v2, p0, Liq0/m$n;->G:Ljava/lang/String;

    iget-object v3, p0, Liq0/m$n;->H:Ljava/lang/String;

    iget-object v4, p0, Liq0/m$n;->I:Liq0/m;

    iget-object v5, p0, Liq0/m$n;->J:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Liq0/m$n;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Liq0/m;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Liq0/m$n;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Liq0/m$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/m$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/m$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/m$n;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 57

    move-object/from16 v0, p0

    iget-object v1, v0, Liq0/m$n;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Liq0/m$n;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v2, v0, Liq0/m$n;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Liq0/m$n;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v0, Liq0/m$n;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    move-object v7, v2

    :goto_0
    move-object v12, v3

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Liq0/m$n;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v3

    new-instance v5, Liq0/n;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Liq0/n;-><init>(I)V

    new-instance v6, Liq0/o;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v7}, Liq0/o;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v3, v6}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v3

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v5, v0, Liq0/m$n;->G:Ljava/lang/String;

    iget-object v6, v0, Liq0/m$n;->H:Ljava/lang/String;

    const-string v7, ":"

    invoke-static {v5, v7, v6}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Liq0/m$n;->I:Liq0/m;

    iput-object v1, v0, Liq0/m$n;->E:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v0, Liq0/m$n;->w:Ljava/lang/Object;

    iput-object v3, v0, Liq0/m$n;->x:Ljava/lang/Object;

    iput-object v5, v0, Liq0/m$n;->y:Ljava/lang/Object;

    iput v4, v0, Liq0/m$n;->z:I

    invoke-virtual {v6, v0}, Liq0/m;->A0(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_2

    return-object v2

    :cond_2
    move-object v7, v5

    goto :goto_0

    :goto_1
    move-object/from16 v29, v4

    check-cast v29, Lio/getstream/chat/android/models/User;

    iget-object v2, v0, Liq0/m$n;->I:Liq0/m;

    invoke-virtual {v2}, Liq0/m;->s0()Ljava/lang/String;

    move-result-object v10

    new-instance v5, Lio/getstream/chat/android/models/Message;

    iget-object v8, v0, Liq0/m$n;->J:Ljava/lang/String;

    const v55, 0xffff

    const/16 v56, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

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

    const/16 v28, 0x0

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

    const/16 v53, 0x0

    const v54, -0x800057

    invoke-direct/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, Liq0/m$n;->I:Liq0/m;

    invoke-virtual {v2}, Liq0/m;->m0()Ldq0/b;

    move-result-object v2

    iget-object v3, v0, Liq0/m$n;->G:Ljava/lang/String;

    iget-object v4, v0, Liq0/m$n;->H:Ljava/lang/String;

    invoke-interface {v2, v3, v4, v5}, Ldq0/b;->sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v2

    iget-object v3, v0, Liq0/m$n;->I:Liq0/m;

    new-instance v4, Liq0/j;

    const/4 v6, 0x2

    invoke-direct {v4, v3, v5, v1, v6}, Liq0/j;-><init>(Liq0/m;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v2, v4}, Lo23/d;->enqueue(Lo23/a;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
