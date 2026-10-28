.class public final Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;
.super Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;",
        "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;",
        "<init>",
        "()V",
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
.field public static final a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;

    invoke-direct {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Home"

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
