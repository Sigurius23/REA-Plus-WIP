.class public final enum Lmn2/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmn2/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmn2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\n\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000bj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lmn2/b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "",
        "isInAppJoinFlow",
        "()Z",
        "getAutoExpandsOrderDetails",
        "autoExpandsOrderDetails",
        "Companion",
        "a",
        "JOIN",
        "GIFTING",
        "SHOP",
        "CART_SCREEN",
        "DEVICE_UPSELL",
        "IAJF_PREPAIDS",
        "IAJF_TRIALS_AA_UPSELL",
        "TRIAL_OFFER_ACTIVATION",
        "PLAN_PICKER_ACTIVATION",
        "BUY_NOW_WITH_CART",
        "UNKNOWN",
        "universal-checkout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lmn2/b;

.field public static final enum BUY_NOW_WITH_CART:Lmn2/b;

.field public static final enum CART_SCREEN:Lmn2/b;

.field public static final Companion:Lmn2/b$a;

.field public static final enum DEVICE_UPSELL:Lmn2/b;

.field public static final enum GIFTING:Lmn2/b;

.field public static final enum IAJF_PREPAIDS:Lmn2/b;

.field public static final enum IAJF_TRIALS_AA_UPSELL:Lmn2/b;

.field public static final enum JOIN:Lmn2/b;

.field public static final enum PLAN_PICKER_ACTIVATION:Lmn2/b;

.field public static final enum SHOP:Lmn2/b;

.field public static final enum TRIAL_OFFER_ACTIVATION:Lmn2/b;

.field public static final enum UNKNOWN:Lmn2/b;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lmn2/b;
    .locals 11

    sget-object v0, Lmn2/b;->JOIN:Lmn2/b;

    sget-object v1, Lmn2/b;->GIFTING:Lmn2/b;

    sget-object v2, Lmn2/b;->SHOP:Lmn2/b;

    sget-object v3, Lmn2/b;->CART_SCREEN:Lmn2/b;

    sget-object v4, Lmn2/b;->DEVICE_UPSELL:Lmn2/b;

    sget-object v5, Lmn2/b;->IAJF_PREPAIDS:Lmn2/b;

    sget-object v6, Lmn2/b;->IAJF_TRIALS_AA_UPSELL:Lmn2/b;

    sget-object v7, Lmn2/b;->TRIAL_OFFER_ACTIVATION:Lmn2/b;

    sget-object v8, Lmn2/b;->PLAN_PICKER_ACTIVATION:Lmn2/b;

    sget-object v9, Lmn2/b;->BUY_NOW_WITH_CART:Lmn2/b;

    sget-object v10, Lmn2/b;->UNKNOWN:Lmn2/b;

    filled-new-array/range {v0 .. v10}, [Lmn2/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmn2/b;

    const/4 v1, 0x0

    const-string v2, "join"

    const-string v3, "JOIN"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->JOIN:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x1

    const-string v2, "gifting"

    const-string v3, "GIFTING"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->GIFTING:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x2

    const-string v2, "shop"

    const-string v3, "SHOP"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->SHOP:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x3

    const-string v2, "cart_screen"

    const-string v3, "CART_SCREEN"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->CART_SCREEN:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x4

    const-string v2, "device_upsell"

    const-string v3, "DEVICE_UPSELL"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->DEVICE_UPSELL:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x5

    const-string v2, "iajf_prepaids"

    const-string v3, "IAJF_PREPAIDS"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->IAJF_PREPAIDS:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x6

    const-string v2, "iajf-trials-aa-upsell"

    const-string v3, "IAJF_TRIALS_AA_UPSELL"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->IAJF_TRIALS_AA_UPSELL:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/4 v1, 0x7

    const-string v2, "lto"

    const-string v3, "TRIAL_OFFER_ACTIVATION"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->TRIAL_OFFER_ACTIVATION:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/16 v1, 0x8

    const-string v2, "plan_picker_activation"

    const-string v3, "PLAN_PICKER_ACTIVATION"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->PLAN_PICKER_ACTIVATION:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/16 v1, 0x9

    const-string v2, "buy_now_with_cart"

    const-string v3, "BUY_NOW_WITH_CART"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->BUY_NOW_WITH_CART:Lmn2/b;

    new-instance v0, Lmn2/b;

    const/16 v1, 0xa

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lmn2/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmn2/b;->UNKNOWN:Lmn2/b;

    invoke-static {}, Lmn2/b;->$values()[Lmn2/b;

    move-result-object v0

    sput-object v0, Lmn2/b;->$VALUES:[Lmn2/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmn2/b;->$ENTRIES:Lt83/a;

    new-instance v0, Lmn2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmn2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmn2/b;->Companion:Lmn2/b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lmn2/b;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lmn2/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmn2/b;
    .locals 1

    const-class v0, Lmn2/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmn2/b;

    return-object p0
.end method

.method public static values()[Lmn2/b;
    .locals 1

    sget-object v0, Lmn2/b;->$VALUES:[Lmn2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmn2/b;

    return-object v0
.end method


# virtual methods
.method public final getAutoExpandsOrderDetails()Z
    .locals 1

    invoke-virtual {p0}, Lmn2/b;->isInAppJoinFlow()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lmn2/b;->DEVICE_UPSELL:Lmn2/b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lmn2/b;->BUY_NOW_WITH_CART:Lmn2/b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmn2/b;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final isInAppJoinFlow()Z
    .locals 1

    sget-object v0, Lmn2/b;->JOIN:Lmn2/b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lmn2/b;->IAJF_PREPAIDS:Lmn2/b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lmn2/b;->IAJF_TRIALS_AA_UPSELL:Lmn2/b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
