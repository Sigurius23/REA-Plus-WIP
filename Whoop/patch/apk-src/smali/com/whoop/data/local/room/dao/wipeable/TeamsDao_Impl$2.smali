.class Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/service/network/model/DefaultImages;)V
    .locals 3

    .line 2
    invoke-virtual {p2}, Lcom/whoop/service/network/model/DefaultImages;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 3
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->j(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/service/network/model/DefaultImages;->getBanners()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;->listToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->i(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/service/network/model/DefaultImages;->getAvatars()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;->listToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x3

    if-nez p2, :cond_1

    .line 7
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 8
    :cond_1
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/service/network/model/DefaultImages;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;->bind(Ltb/c;Lcom/whoop/service/network/model/DefaultImages;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_default_images` (`id`,`banners`,`avatars`) VALUES (?,?,?)"

    return-object v0
.end method
