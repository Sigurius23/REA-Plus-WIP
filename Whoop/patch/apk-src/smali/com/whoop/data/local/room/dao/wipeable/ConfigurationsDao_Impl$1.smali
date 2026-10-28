.class Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;-><init>(Landroidx/room/z0;)V
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
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/ConfigurationDto;)V
    .locals 2

    .line 2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/ConfigurationDto;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/ConfigurationDto;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/ConfigurationDto;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    .line 6
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/ConfigurationDto;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/ConfigurationDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/ConfigurationDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_configurations` (`configuration_key`,`configuration_value`) VALUES (?,?)"

    return-object v0
.end method
