.class public interface abstract Lcom/whoop/profile/presentation/ProfileEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;,
        Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;,
        Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$Companion;,
        Lcom/whoop/profile/presentation/ProfileEvent$ConsumeSideEffects;,
        Lcom/whoop/profile/presentation/ProfileEvent$DismissDesignModal;,
        Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;,
        Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;,
        Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$GoBack;,
        Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;,
        Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;,
        Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;,
        Lcom/whoop/profile/presentation/ProfileEvent$ProfileSaveTappedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$Refresh;,
        Lcom/whoop/profile/presentation/ProfileEvent$Report;,
        Lcom/whoop/profile/presentation/ProfileEvent$ScrolledToBottomAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;,
        Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$UsernameFieldTappedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$UsernameSaveAttemptedAnalyticEvent;,
        Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u001e2\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u0004\u001f !\"\u00a8\u0006#\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "",
        "ViewEvent",
        "Refresh",
        "Report",
        "DismissReportDialog",
        "NavigationEvent",
        "GoBack",
        "AppDrivenNavigation",
        "BackendDrivenNavigation",
        "PerformDismissNavigation",
        "ActionEvent",
        "ItemClicked",
        "SegmentSelected",
        "ExpandableStatisticListEvent",
        "AnalyticEvent",
        "ProfileScreenViewedAnalyticEvent",
        "ScrolledToBottomAnalyticEvent",
        "ProfileSaveTappedAnalyticEvent",
        "UsernameFieldTappedAnalyticEvent",
        "UsernameSaveAttemptedAnalyticEvent",
        "HealthspanTappedAnalyticEvent",
        "StreaksTappedAnalyticEvent",
        "LevelsTappedAnalyticEvent",
        "OtherProfileOpenedAnalyticEvent",
        "BffAnalyticEvent",
        "PresentDesignModal",
        "DismissDesignModal",
        "ExecuteWhoopAction",
        "ConsumeSideEffects",
        "Companion",
        "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;",
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
.field public static final Companion:Lcom/whoop/profile/presentation/ProfileEvent$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$Companion;->$$INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Companion;

    sput-object v0, Lcom/whoop/profile/presentation/ProfileEvent;->Companion:Lcom/whoop/profile/presentation/ProfileEvent$Companion;

    return-void
.end method
