.class public final Ljr0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljr0/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lgr0/b;",
        "domainState",
        "Lw01/c;",
        "a",
        "(Lgr0/b;)Lw01/c;",
        "Ljb1/a;",
        "community-follower-lookup-arch-mini_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Ljr0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljr0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-static {p1, p3, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ljr0/a;-><init>(Ljb1/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lgr0/b;)Lw01/c;
    .locals 20

    const-string v0, "domainState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lgr0/b;->f()Lgr0/g;

    move-result-object v0

    instance-of v2, v0, Lgr0/g$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v0, Lgr0/g$a;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    invoke-virtual {v1}, Lgr0/b;->g()Lgr0/h;

    move-result-object v2

    instance-of v4, v2, Lgr0/h$a;

    if-eqz v4, :cond_1

    check-cast v2, Lgr0/h$a;

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {v1}, Lgr0/b;->f()Lgr0/g;

    move-result-object v4

    instance-of v5, v4, Lgr0/g$b;

    if-eqz v5, :cond_2

    check-cast v4, Lgr0/g$b;

    goto :goto_2

    :cond_2
    move-object v4, v3

    :goto_2
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lgr0/g$b;->a()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_3
    move-object v5, v3

    :goto_3
    invoke-virtual {v1}, Lgr0/b;->j()Z

    move-result v7

    invoke-virtual {v1}, Lgr0/b;->i()Z

    move-result v8

    invoke-virtual {v1}, Lgr0/b;->c()Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    move-result-object v6

    const/4 v9, 0x0

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->getTotalRequest()I

    move-result v6

    move v15, v6

    goto :goto_4

    :cond_4
    move v15, v9

    :goto_4
    invoke-virtual {v1}, Lgr0/b;->c()Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->getTitle()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v16, v6

    goto :goto_5

    :cond_5
    move-object/from16 v16, v3

    :goto_5
    invoke-virtual {v1}, Lgr0/b;->c()Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v6

    move-object/from16 v17, v6

    goto :goto_6

    :cond_6
    move-object/from16 v17, v3

    :goto_6
    invoke-virtual {v1}, Lgr0/b;->c()Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-virtual {v6}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->getItems()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v6, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1}, Lgr0/b;->d()Ljava/util/Map;

    move-result-object v12

    invoke-static {v11, v12}, Ljr0/b;->b(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    move-object/from16 v11, p0

    iget-object v6, v11, Ljr0/a;->a:Ljb1/a;

    sget-object v12, Lm83/z;->w:Lm83/z;

    invoke-virtual {v6, v10, v12}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v6

    if-eqz v5, :cond_8

    invoke-static {v6, v5}, Ljr0/b;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    :cond_8
    if-nez v6, :cond_9

    goto :goto_9

    :cond_9
    :goto_8
    move-object/from16 v18, v6

    goto :goto_a

    :cond_a
    move-object/from16 v11, p0

    :goto_9
    sget-object v6, Lm83/y;->w:Lm83/y;

    goto :goto_8

    :goto_a
    invoke-virtual {v1}, Lgr0/b;->g()Lgr0/h;

    move-result-object v5

    instance-of v5, v5, Lgr0/h$b;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lgr0/h$a;->b()Ljava/lang/String;

    move-result-object v6

    move-object v10, v6

    goto :goto_b

    :cond_b
    move-object v10, v3

    :goto_b
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lgr0/h$a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    goto :goto_c

    :cond_c
    move-object v2, v3

    :goto_c
    if-eqz v4, :cond_d

    const/4 v9, 0x1

    :cond_d
    move v12, v9

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lgr0/g$a;->b()Ljava/lang/String;

    move-result-object v4

    move-object v13, v4

    goto :goto_d

    :cond_e
    move-object v13, v3

    :goto_d
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lgr0/g$a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v3

    :cond_f
    move-object v14, v3

    invoke-virtual {v1}, Lgr0/b;->h()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v19

    new-instance v6, Lw01/c;

    move-object v11, v2

    move v9, v5

    invoke-direct/range {v6 .. v19}, Lw01/c;-><init>(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v6
.end method
