.class Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$2;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/i;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$2;->this$0:Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Ldu0/a;)V
    .locals 3

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Ldu0/a;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldu0/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$2;->bind(Ltb/c;Ldu0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `table_raw_data` WHERE `id` = ?"

    return-object v0
.end method
