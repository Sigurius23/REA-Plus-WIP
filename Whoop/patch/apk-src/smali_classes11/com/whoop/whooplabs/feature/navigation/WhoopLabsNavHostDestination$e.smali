.class public final Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;
.super Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;",
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;",
        "<init>",
        "()V",
        "",
        "campaignId",
        "sessionId",
        "",
        "a",
        "(ILjava/lang/Integer;)Ljava/lang/String;",
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
.field public static final a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;

    invoke-direct {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Ljz2/a;->CampaignId:Ljz2/a;

    sget-object v1, Ljz2/a;->SessionId:Ljz2/a;

    filled-new-array {v0, v1}, [Ljz2/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "CampaignSteps"

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Integer;)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "?sessionId="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v0}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
