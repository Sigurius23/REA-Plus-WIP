.class public interface abstract Lcom/whoop/archv2/model/template/ScreenTemplate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/model/template/ScreenTemplate$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00078VX\u0097\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "",
        "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "screenAnalytics",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "failureAnalyticEvent",
        "(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;",
        "Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "getLifecycleInteractions",
        "()Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "getLifecycleInteractions$annotations",
        "()V",
        "lifecycleInteractions",
        "Companion",
        "a",
        "Lcom/whoop/archv2/model/template/FlowTemplate;",
        "Lcom/whoop/archv2/model/template/ListTemplate;",
        "Lcom/whoop/archv2/model/template/NavigationTemplate;",
        "Lcom/whoop/archv2/model/template/SingleItemTemplate;",
        "Lcom/whoop/archv2/model/template/UnknownTemplate;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/archv2/model/template/ScreenTemplate$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/ScreenTemplate$a;->a:Lcom/whoop/archv2/model/template/ScreenTemplate$a;

    sput-object v0, Lcom/whoop/archv2/model/template/ScreenTemplate;->Companion:Lcom/whoop/archv2/model/template/ScreenTemplate$a;

    return-void
.end method

.method public static synthetic access$failureAnalyticEvent$jd(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/archv2/model/template/ScreenTemplate;->failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getLifecycleInteractions$jd(Lcom/whoop/archv2/model/template/ScreenTemplate;)Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 0

    invoke-super {p0}, Lcom/whoop/archv2/model/template/ScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    const-string v0, "screenAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/analytics/ScreenAnalyticEventModel;->getScreenFailed()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    return-object p1
.end method

.method public getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
