.class public final Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;
.super Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;",
        "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;",
        "<init>",
        "()V",
        "membership_release"
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
.field public static final a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;

    invoke-direct {v0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;-><init>()V

    sput-object v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "MembershipManagementScreen"

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
