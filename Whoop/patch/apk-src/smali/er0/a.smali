.class public final Ler0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ler0/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lbr0/b;",
        "domainState",
        "Lv01/g;",
        "a",
        "(Lbr0/b;)Lv01/g;",
        "Ljb1/a;",
        "community-follower-container-arch-mini_release"
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

    sput v0, Ler0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ler0/a;->a:Ljb1/a;

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
    invoke-direct {p0, p1}, Ler0/a;-><init>(Ljb1/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lbr0/b;)Lv01/g;
    .locals 14

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lbr0/b;->e()Lbr0/d;

    move-result-object v0

    instance-of v1, v0, Lbr0/d$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lbr0/d$a;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {p1}, Lbr0/b;->c()Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;

    move-result-object v1

    invoke-virtual {p1}, Lbr0/b;->h()Z

    move-result v4

    invoke-virtual {p1}, Lbr0/b;->f()Z

    move-result v5

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;->getHeader()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v6, p0, Ler0/a;->a:Ljb1/a;

    invoke-virtual {v6, v3}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object v3

    move-object v10, v3

    goto :goto_1

    :cond_1
    move-object v10, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v3

    move-object v9, v3

    goto :goto_2

    :cond_2
    move-object v9, v2

    :goto_2
    if-eqz v1, :cond_4

    iget-object v3, p0, Ler0/a;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;->getItems()Ljava/util/List;

    move-result-object v6

    sget-object v7, Lm83/z;->w:Lm83/z;

    invoke-virtual {v3, v6, v7}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    move-object v11, v3

    goto :goto_5

    :cond_4
    :goto_4
    sget-object v3, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :goto_5
    invoke-virtual {p1}, Lbr0/b;->e()Lbr0/d;

    move-result-object v3

    instance-of v6, v3, Lbr0/d$b;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lbr0/d$a;->b()Ljava/lang/String;

    move-result-object v3

    move-object v7, v3

    goto :goto_6

    :cond_5
    move-object v7, v2

    :goto_6
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lbr0/d$a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    move-object v8, v0

    goto :goto_7

    :cond_6
    move-object v8, v2

    :goto_7
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;->getFilterBottomSheet()Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, Ler0/a;->a:Ljb1/a;

    invoke-static {v0, v1}, Ler0/b;->a(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Ljb1/a;)Lv01/a;

    move-result-object v2

    :cond_7
    move-object v12, v2

    invoke-virtual {p1}, Lbr0/b;->g()Z

    move-result v13

    new-instance v3, Lv01/g;

    invoke-direct/range {v3 .. v13}, Lv01/g;-><init>(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lm91/o;Ljava/util/List;Lv01/a;Z)V

    return-object v3
.end method
