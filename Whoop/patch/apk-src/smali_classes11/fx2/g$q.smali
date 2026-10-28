.class Lfx2/g$q;
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

    iput-object p1, p0, Lfx2/g$q;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;)V
    .locals 3

    iget-object v0, p0, Lfx2/g$q;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getTimestamp()Lorg/joda/time/LocalDateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->localDateTimeToString(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getNote()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getId()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x4

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;

    invoke-virtual {p0, p1, p2}, Lfx2/g$q;->a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `whoop_labs_study_tag` (`timestamp`,`note`,`campaign_id`,`tag_id`) VALUES (?,?,?,nullif(?, 0))"

    return-object v0
.end method
