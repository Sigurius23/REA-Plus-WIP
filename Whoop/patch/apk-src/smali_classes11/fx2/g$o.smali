.class Lfx2/g$o;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx2/g;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lfx2/g;


# direct methods
.method public constructor <init>(Lfx2/g;)V
    .locals 0

    iput-object p1, p0, Lfx2/g$o;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/domain/LabsSession;)V
    .locals 2

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsSession;->getCampaignSessionId()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x1

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/domain/LabsSession;

    invoke-virtual {p0, p1, p2}, Lfx2/g$o;->a(Ltb/c;Lcom/whoop/whooplabs/data/domain/LabsSession;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `whoop_labs_session` (`campaign_session_id`) VALUES (?)"

    return-object v0
.end method
