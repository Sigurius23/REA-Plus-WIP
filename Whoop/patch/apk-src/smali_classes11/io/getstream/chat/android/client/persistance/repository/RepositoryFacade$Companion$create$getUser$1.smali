.class final Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;->create(Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;Lbc3/c0;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
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
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/models/User;",
        "userId",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade$Companion$create$getUser$1"
    f = "RepositoryFacade.kt"
    l = {
        0xf8
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->$userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->$userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->invoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->L$0:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->label:I

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->$userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;->label:I

    invoke-interface {v2, v3, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->selectUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, Lio/getstream/chat/android/models/User;

    if-nez v2, :cond_3

    new-instance v2, Lio/getstream/chat/android/models/User;

    const v28, 0x1fffffe

    const/16 v29, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v2 .. v29}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    return-object v2
.end method
