.class public final Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;
.super Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;",
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;",
        "<init>",
        "()V",
        "",
        "campaignId",
        "",
        "a",
        "(I)Ljava/lang/String;",
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
.field public static final a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;

    invoke-direct {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Ljz2/a;->CampaignId:Ljz2/a;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "CampaignExtendedDetails"

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-static {p1, v0, v1}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
