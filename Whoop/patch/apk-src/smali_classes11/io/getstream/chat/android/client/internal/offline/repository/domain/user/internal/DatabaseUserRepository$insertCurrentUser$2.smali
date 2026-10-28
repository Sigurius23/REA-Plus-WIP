.class final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository$insertCurrentUser$2"
    f = "DatabaseUserRepository.kt"
    l = {
        0x5b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $user:Lio/getstream/chat/android/models/User;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lio/getstream/chat/android/models/User;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->$user:Lio/getstream/chat/android/models/User;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->$user:Lio/getstream/chat/android/models/User;

    invoke-direct {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lio/getstream/chat/android/models/User;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->$user:Lio/getstream/chat/android/models/User;

    invoke-static {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->access$toEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object v5

    const v23, 0x1fffe

    const/16 v24, 0x0

    const-string v6, "me"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    invoke-static/range {v5 .. v24}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object v2

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    invoke-static {v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->access$getUserDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;->label:I

    invoke-interface {v4, v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;->insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
