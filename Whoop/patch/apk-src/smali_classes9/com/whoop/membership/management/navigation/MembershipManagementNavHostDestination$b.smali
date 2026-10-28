.class public final Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;
.super Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;",
        "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;",
        "<init>",
        "()V",
        "",
        "payload",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
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
.field public static final a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;

    invoke-direct {v0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;-><init>()V

    sput-object v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Lix1/c;->Payload:Lix1/c;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "MembershipAdjustmentCheckoutScreen"

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-static {v0, v1, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
