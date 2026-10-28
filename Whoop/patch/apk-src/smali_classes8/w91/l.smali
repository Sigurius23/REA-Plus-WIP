.class public final synthetic Lw91/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lw91/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lw91/l;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lwh2/a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lwh2/a;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempting to load credentials from system properties "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lwc/l1;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lwc/l1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lwc/l1;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_6
    const-string v0, "sts refused to grant assumed role credentials from web identity"

    return-object v0

    :pswitch_7
    const-string v0, "retrieving assumed credentials via web identity"

    return-object v0

    :pswitch_8
    const-string v0, "sts refused to grant assumed role credentials"

    return-object v0

    :pswitch_9
    const-string v0, "retrieving assumed credentials"

    return-object v0

    :pswitch_a
    const-string v0, "Attempting to load token from file using legacy format"

    return-object v0

    :pswitch_b
    const-string v0, "token refresh failed"

    return-object v0

    :pswitch_c
    const-string v0, "Received 404 from IMDS when loading profile information. Hint: This instance may not have an IAM role associated."

    return-object v0

    :pswitch_d
    const-string v0, "Attempting credential expiration extension due to a credential service availability issue. A refresh of these credentials will be attempted again in 15 minutes."

    return-object v0

    :pswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempting to load credentials from env vars "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lwc/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lwc/m;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lwc/m;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_f
    const-string v0, "failed to obtain credentials from container metadata service"

    return-object v0

    :pswitch_10
    const-string v0, "retrieving container credentials"

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/design/models/items/ZoneBarZone;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/design/models/items/ZoneBarModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/design/models/items/WheelContent;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/design/models/items/WheelContent;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/design/models/items/VowCtaText;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/design/models/items/VowCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/design/models/items/UpsellCardSmallModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
