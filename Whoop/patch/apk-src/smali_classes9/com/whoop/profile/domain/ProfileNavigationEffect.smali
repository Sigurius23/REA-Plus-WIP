.class public interface abstract Lcom/whoop/profile/domain/ProfileNavigationEffect;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;,
        Lcom/whoop/profile/domain/ProfileNavigationEffect$Companion;,
        Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileNavigationEffect;",
        "",
        "BackendDriven",
        "PerformDismiss",
        "Companion",
        "Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;",
        "Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;",
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
.field public static final Companion:Lcom/whoop/profile/domain/ProfileNavigationEffect$Companion;

.field public static final PROFILE_NAVIGATION_SOURCE:Ljava/lang/String; = "profile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/ProfileNavigationEffect$Companion;->$$INSTANCE:Lcom/whoop/profile/domain/ProfileNavigationEffect$Companion;

    sput-object v0, Lcom/whoop/profile/domain/ProfileNavigationEffect;->Companion:Lcom/whoop/profile/domain/ProfileNavigationEffect$Companion;

    return-void
.end method
