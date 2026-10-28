.class public final enum Ly00/s1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/s1;

.field public static final enum F:Ly00/s1;

.field public static final enum G:Ly00/s1;

.field public static final enum H:Ly00/s1;

.field public static final enum I:Ly00/s1;

.field public static final synthetic J:[Ly00/s1;

.field public static final synthetic K:Lt83/b;

.field public static final enum x:Ly00/s1;

.field public static final enum y:Ly00/s1;

.field public static final enum z:Ly00/s1;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ly00/s1;

    const/4 v1, 0x0

    const-string v2, "elements_disable_fc_lite"

    const-string v3, "ELEMENTS_DISABLE_FC_LITE"

    invoke-direct {v0, v3, v1, v2}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/s1;->x:Ly00/s1;

    new-instance v1, Ly00/s1;

    const/4 v2, 0x1

    const-string v3, "elements_prefer_fc_lite"

    const-string v4, "ELEMENTS_PREFER_FC_LITE"

    invoke-direct {v1, v4, v2, v3}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/s1;->y:Ly00/s1;

    new-instance v2, Ly00/s1;

    const/4 v3, 0x2

    const-string v4, "elements_disable_link_global_holdback_lookup"

    const-string v5, "ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP"

    invoke-direct {v2, v5, v3, v4}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/s1;->z:Ly00/s1;

    new-instance v3, Ly00/s1;

    const/4 v4, 0x3

    const-string v5, "elements_enable_link_spm"

    const-string v6, "ELEMENTS_ENABLE_LINK_SPM"

    invoke-direct {v3, v6, v4, v5}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly00/s1;->E:Ly00/s1;

    new-instance v4, Ly00/s1;

    const/4 v5, 0x4

    const-string v6, "elements_enable_passive_captcha"

    const-string v7, "ELEMENTS_ENABLE_PASSIVE_CAPTCHA"

    invoke-direct {v4, v7, v5, v6}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Ly00/s1;->F:Ly00/s1;

    new-instance v5, Ly00/s1;

    const/4 v6, 0x5

    const-string v7, "elements_mobile_force_setup_future_use_behavior_and_new_mandate_text"

    const-string v8, "ELEMENTS_MOBILE_FORCE_SETUP_FUTURE_USE_BEHAVIOR_AND_NEW_MANDATE_TEXT"

    invoke-direct {v5, v8, v6, v7}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Ly00/s1;->G:Ly00/s1;

    new-instance v6, Ly00/s1;

    const/4 v7, 0x6

    const-string v8, "elements_mobile_attest_on_intent_confirmation"

    const-string v9, "ELEMENTS_MOBILE_ATTEST_ON_INTENT_CONFIRMATION"

    invoke-direct {v6, v9, v7, v8}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Ly00/s1;->H:Ly00/s1;

    new-instance v7, Ly00/s1;

    const/4 v8, 0x7

    const-string v9, "elements_mobile_card_funding_filtering"

    const-string v10, "ELEMENTS_MOBILE_CARD_FUND_FILTERING"

    invoke-direct {v7, v10, v8, v9}, Ly00/s1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Ly00/s1;->I:Ly00/s1;

    filled-new-array/range {v0 .. v7}, [Ly00/s1;

    move-result-object v0

    sput-object v0, Ly00/s1;->J:[Ly00/s1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/s1;->K:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/s1;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/s1;
    .locals 1

    const-class v0, Ly00/s1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/s1;

    return-object p0
.end method

.method public static values()[Ly00/s1;
    .locals 1

    sget-object v0, Ly00/s1;->J:[Ly00/s1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/s1;

    return-object v0
.end method
