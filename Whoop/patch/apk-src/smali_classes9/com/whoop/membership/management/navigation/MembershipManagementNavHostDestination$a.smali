.class public final Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;
.super Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;",
        "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;",
        "<init>",
        "()V",
        "",
        "path",
        "payload",
        "Lcom/whoop/payments/domain/models/Card;",
        "card",
        "",
        "isIndependentCheckout",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Z)Ljava/lang/String;",
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
.field public static final a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;

    invoke-direct {v0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;-><init>()V

    sput-object v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    sget-object v0, Lix1/c;->Path:Lix1/c;

    sget-object v1, Lix1/c;->Payload:Lix1/c;

    sget-object v2, Lix1/c;->Card:Lix1/c;

    sget-object v3, Lix1/c;->IsIndependentCheckout:Lix1/c;

    filled-new-array {v0, v1, v2, v3}, [Lix1/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "CheckoutScreen"

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Z)Ljava/lang/String;
    .locals 3

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/payments/domain/models/Card;->Companion:Lcom/whoop/payments/domain/models/Card$a;

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p3}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-string v0, "/"

    if-eqz p3, :cond_2

    sget-object v1, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;

    invoke-virtual {v1}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "?card="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    return-object p3

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
