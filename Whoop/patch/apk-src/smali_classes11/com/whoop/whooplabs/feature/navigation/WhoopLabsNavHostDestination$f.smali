.class public final Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;
.super Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;",
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;",
        "<init>",
        "()V",
        "",
        "campaignFilter",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "whooplabs_release"
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
.field public static final a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;

    invoke-direct {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Ljz2/a;->CampaignFilter:Ljz2/a;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "CompletedCampaigns"

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "campaignFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "/"

    invoke-static {v0, v1, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
