.class public final Lt23/z3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Lt23/b4;

.field public final synthetic y:Lio/getstream/video/android/model/User;


# direct methods
.method public constructor <init>(Lt23/b4;Lio/getstream/video/android/model/User;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lt23/z3;->x:Lt23/b4;

    iput-object p2, p0, Lt23/z3;->y:Lio/getstream/video/android/model/User;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance p1, Lt23/z3;

    iget-object v0, p0, Lt23/z3;->x:Lt23/b4;

    iget-object v1, p0, Lt23/z3;->y:Lio/getstream/video/android/model/User;

    invoke-direct {p1, v0, v1, p2}, Lt23/z3;-><init>(Lt23/b4;Lio/getstream/video/android/model/User;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/z3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/z3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/z3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lt23/z3;->x:Lt23/b4;

    iget-object v2, v1, Lt23/b4;->E:Ly33/c;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lt23/z3;->w:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v6, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v7, Lio/getstream/android/video/generated/models/UserRequest;

    iget-object v4, v0, Lt23/z3;->y:Lio/getstream/video/android/model/User;

    invoke-virtual {v4}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lio/getstream/video/android/model/User;->getImage()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lio/getstream/video/android/model/User;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4}, Lio/getstream/video/android/model/User;->getCustom()Ljava/util/Map;

    move-result-object v13

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v15}, Lio/getstream/android/video/generated/models/UserRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v6, v0, Lt23/z3;->w:I

    new-instance v4, La33/c;

    const/16 v6, 0xb

    invoke-direct {v4, v1, v7, v5, v6}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v1, v4, v0}, Lt23/b4;->m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    return-object v3

    :cond_2
    :goto_0
    check-cast v4, Ln23/h;

    instance-of v3, v4, Ln23/f;

    if-nez v3, :cond_5

    instance-of v6, v4, Ln23/g;

    if-eqz v6, :cond_3

    check-cast v4, Ln23/g;

    iget-object v3, v4, Ln23/g;->a:Ljava/lang/Object;

    check-cast v3, Lio/getstream/android/video/generated/models/CreateGuestResponse;

    iget-object v4, v2, Ly33/c;->e:Ly33/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "jwt"

    iput-object v6, v4, Ly33/a;->y:Ljava/lang/String;

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CreateGuestResponse;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ly33/c;->b(Ljava/lang/String;)V

    iget-object v1, v1, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CreateGuestResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v2

    invoke-static {v2}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v6

    sget-object v9, Lio/getstream/video/android/model/UserType$Guest;->INSTANCE:Lio/getstream/video/android/model/UserType$Guest;

    const/16 v17, 0x3fb

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v6 .. v18}, Lio/getstream/video/android/model/User;->copy$default(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/video/android/model/User;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "user"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Ld33/c;->a:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v5, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Failed to create guest user"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
