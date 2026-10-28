.class public abstract Lcom/whoop/profile/domain/ProfileDomainAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/ProfileDomainAction$ConsumeSideEffects;,
        Lcom/whoop/profile/domain/ProfileDomainAction$DismissModal;,
        Lcom/whoop/profile/domain/ProfileDomainAction$DismissReportDialog;,
        Lcom/whoop/profile/domain/ProfileDomainAction$PerformAction;,
        Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;,
        Lcom/whoop/profile/domain/ProfileDomainAction$Refresh;,
        Lcom/whoop/profile/domain/ProfileDomainAction$Report;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0007\u000b\u000c\r\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileDomainAction;",
        "",
        "<init>",
        "()V",
        "Refresh",
        "Report",
        "DismissReportDialog",
        "PerformAction",
        "PresentModal",
        "DismissModal",
        "ConsumeSideEffects",
        "Lcom/whoop/profile/domain/ProfileDomainAction$ConsumeSideEffects;",
        "Lcom/whoop/profile/domain/ProfileDomainAction$DismissModal;",
        "Lcom/whoop/profile/domain/ProfileDomainAction$DismissReportDialog;",
        "Lcom/whoop/profile/domain/ProfileDomainAction$PerformAction;",
        "Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;",
        "Lcom/whoop/profile/domain/ProfileDomainAction$Refresh;",
        "Lcom/whoop/profile/domain/ProfileDomainAction$Report;",
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
    invoke-direct {p0}, Lcom/whoop/profile/domain/ProfileDomainAction;-><init>()V

    return-void
.end method
