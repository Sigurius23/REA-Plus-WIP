.class public final Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;
.super Ljs0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljs0/a<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;",
        "Ljs0/a;",
        "",
        "<init>",
        "()V",
        "core_release"
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
.field public static final INSTANCE:Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;

    invoke-direct {v0}, Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;-><init>()V

    sput-object v0, Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;->INSTANCE:Lcom/whoop/data/repositories/TombstoneStatusPollingCadenceMillis;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-wide/32 v0, 0x927c0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "TOMBSTONE_STATUS_POLLING_CADENCE_MILLIS"

    invoke-direct {p0, v1, v0}, Ljs0/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
