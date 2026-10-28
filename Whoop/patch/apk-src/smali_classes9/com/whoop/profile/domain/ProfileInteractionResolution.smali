.class public abstract Lcom/whoop/profile/domain/ProfileInteractionResolution;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;,
        Lcom/whoop/profile/domain/ProfileInteractionResolution$None;,
        Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;,
        Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0004\u0008\t\n\u000bB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileInteractionResolution;",
        "",
        "<init>",
        "()V",
        "analyticEvent",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "PresentModal",
        "PerformAction",
        "Navigate",
        "None",
        "Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;",
        "Lcom/whoop/profile/domain/ProfileInteractionResolution$None;",
        "Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;",
        "Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;",
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
.field public static final $stable:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/profile/domain/ProfileInteractionResolution;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
.end method
