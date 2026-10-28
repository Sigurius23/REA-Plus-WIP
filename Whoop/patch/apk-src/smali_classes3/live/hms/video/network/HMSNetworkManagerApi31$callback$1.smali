.class public final Llive/hms/video/network/HMSNetworkManagerApi31$callback$1;
.super Landroid/telephony/TelephonyCallback;
.source "SourceFile"

# interfaces
.implements Landroid/telephony/TelephonyCallback$DisplayInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/network/HMSNetworkManagerApi31;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\u000b\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "live/hms/video/network/HMSNetworkManagerApi31$callback$1",
        "Landroid/telephony/TelephonyCallback;",
        "Landroid/telephony/TelephonyCallback$DisplayInfoListener;",
        "Landroid/telephony/TelephonyDisplayInfo;",
        "telephonyDisplayInfo",
        "Ll83/a0;",
        "onDisplayInfoChanged",
        "(Landroid/telephony/TelephonyDisplayInfo;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/network/HMSNetworkManagerApi31;


# direct methods
.method public constructor <init>(Llive/hms/video/network/HMSNetworkManagerApi31;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/network/HMSNetworkManagerApi31$callback$1;->this$0:Llive/hms/video/network/HMSNetworkManagerApi31;

    invoke-direct {p0}, Landroid/telephony/TelephonyCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisplayInfoChanged(Landroid/telephony/TelephonyDisplayInfo;)V
    .locals 2

    const-string v0, "telephonyDisplayInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "telephonyDisplayInfo :: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSNetworkManager"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31$callback$1;->this$0:Llive/hms/video/network/HMSNetworkManagerApi31;

    invoke-virtual {p1}, Landroid/telephony/TelephonyDisplayInfo;->getNetworkType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/network/HMSNetworkManagerApi31;->setNetworkType(Ljava/lang/Integer;)V

    return-void
.end method
