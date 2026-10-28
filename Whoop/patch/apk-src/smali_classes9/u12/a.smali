.class public abstract Lu12/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "",
        "Lj93/d;",
        "a",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "dayZeroHeaderModels",
        "onboarding-personalization_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/onboardingpersonalization/dayzero/header/models/DayZeroHeaderWidgetsModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "DAY_ZERO_HEADER_WIDGETS"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v3, "CONVERSATION_PROGRESS_BAR"

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lu12/a;->a:Ljava/util/Map;

    return-void
.end method

.method public static final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lu12/a;->a:Ljava/util/Map;

    return-object v0
.end method
