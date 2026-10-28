.class public final Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0015\u0010\u0008\u001a\u00020\t*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;",
        "",
        "<init>",
        "()V",
        "valueOfOrDefault",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "value",
        "",
        "isProcessNow",
        "",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)Z",
        "connectivity-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


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
    invoke-direct {p0}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final isProcessNow(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->SLEEP_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->ACTIVITY_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final valueOfOrDefault(Ljava/lang/String;)Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
    .locals 5

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->values()[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    return-object v3

    :cond_3
    :goto_2
    sget-object p1, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->NONE:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    return-object p1
.end method
