.class public final Lcom/whoop/profile/presentation/ProfileEvent$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/ProfileEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileEvent$Companion;",
        "",
        "<init>",
        "()V",
        "screenViewedAnalyticEvent",
        "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;",
        "source",
        "",
        "isSelfProfile",
        "",
        "membershipAnalytics",
        "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;",
        "profile_release"
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
.field static final synthetic $$INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$Companion;

    invoke-direct {v0}, Lcom/whoop/profile/presentation/ProfileEvent$Companion;-><init>()V

    sput-object v0, Lcom/whoop/profile/presentation/ProfileEvent$Companion;->$$INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic screenViewedAnalyticEvent$default(Lcom/whoop/profile/presentation/ProfileEvent$Companion;Ljava/lang/String;ZLcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileEvent$Companion;->screenViewedAnalyticEvent(Ljava/lang/String;ZLcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final screenViewedAnalyticEvent(Ljava/lang/String;ZLcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance p2, Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;

    invoke-direct {p2, p1, p3}, Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;-><init>(Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V

    return-object p2

    :cond_0
    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;

    invoke-direct {p1, p3}, Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;-><init>(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V

    return-object p1
.end method
