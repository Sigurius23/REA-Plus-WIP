.class public final synthetic Ltb0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ltb0/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ltb0/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lty1/i;->r()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/aiinsights/domain/models/SecondaryButton;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/aiinsights/domain/models/PrimaryButton;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/aiinsights/domain/models/AiInsightsContentItemModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    sget-object v0, Lne3/p;->w:Lne3/a0;

    sget-object v1, Lne3/p;->x:Lne3/e0;

    const-string v2, "coil3_disk_cache"

    invoke-virtual {v1, v2}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v1

    const-wide/32 v4, 0xa00000

    :try_start_0
    invoke-virtual {v1}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/StatFs;

    invoke-direct {v3, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v6

    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v2

    mul-long/2addr v2, v6

    long-to-double v2, v2

    const-wide v6, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v6, v2

    double-to-long v2, v6

    const-wide/32 v6, 0xfa00000

    invoke-static/range {v2 .. v7}, Le93/b;->p(JJJ)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v2, Lth/h;

    invoke-direct {v2, v4, v5, v0, v1}, Lth/h;-><init>(JLne3/p;Lne3/e0;)V

    return-object v2

    :pswitch_f
    invoke-static {}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Ltg2/d;->f()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_11
    const-string v0, "request failed with non-retryable error"

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/WhatsIncludedCardModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;->a()Lwc3/c;

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
