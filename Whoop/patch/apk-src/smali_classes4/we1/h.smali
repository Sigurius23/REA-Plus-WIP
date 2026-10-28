.class public final synthetic Lwe1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwe1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwe1/h;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/home/domain/models/StreakMetadata;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/home/domain/models/Pillars;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/home/domain/models/NotificationsCenterModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/home/domain/models/JournalHomeTileWrapperModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/home/domain/models/JournalHomeTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/home/domain/models/ComponentItems;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/home/domain/models/ComponentItems;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/home/domain/models/CalendarResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/home/domain/models/CalendarResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/home/domain/models/AutopopMetadata;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    sget-object v0, Ly1/h;->a:Lp1/u2;

    const/4 v0, 0x0

    return-object v0

    :pswitch_13
    new-instance v0, Ly1/d;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v0, v1}, Ly1/d;-><init>(Ljava/util/Map;)V

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lx81/e;->b()La91/b;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lx81/e;->f()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lx81/e;->c()Lz81/e;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lx81/e;->d()Lb91/d;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lx81/e;->g()Lz81/b;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lx81/e;->e()Ly81/i;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lx81/c;->a()Ly81/a;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/entitlements/EntitlementsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

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
