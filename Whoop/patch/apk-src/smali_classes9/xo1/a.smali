.class public final synthetic Lxo1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxo1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly40/a;)V
    .locals 0

    .line 2
    const/16 p1, 0x14

    iput p1, p0, Lxo1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxo1/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lyc2/c;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lyb0/k;->o()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lyb0/g;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lyb0/g;->p()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Ly71/n;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    :try_start_0
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v0, v0}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v0

    invoke-static {}, Ly40/a;->b()Ljava/util/HashMap;

    move-result-object v1

    sget-object v2, Lw40/b;->a:Lad3/r;

    sget-object v2, Lw40/b;->a:Lad3/r;

    invoke-virtual {v2, v0, v1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "JSDI"

    const-string v1, "Cannot build sysDebug"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "{}"

    :goto_0
    return-object v0

    :pswitch_9
    invoke-static {}, Ly31/d;->k()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Ly21/i;->k()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lxw1/f;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lxq2/e0;->b()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lxq2/e0;->a()Lxq2/d0;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lxp2/b;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lxo1/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lxo1/b;->l()Ll83/a0;

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
