.class public final Llive/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/audio/manager/HMSAudioManagerApi31;->initTelephony(Llive/hms/video/sdk/IErrorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "live/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1",
        "Landroid/telephony/PhoneStateListener;",
        "",
        "state",
        "",
        "phoneNumber",
        "Ll83/a0;",
        "onCallStateChanged",
        "(ILjava/lang/String;)V",
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
.field final synthetic this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;


# direct methods
.method public constructor <init>(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 1

    const-string v0, "phoneNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->access$getTAG$p(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "onCallStateChanged: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/audio/AudioChangeEvent;->PHONE_RINGING:Llive/hms/video/audio/AudioChangeEvent;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {p1, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->access$sendAudioChangeEvent(Llive/hms/video/audio/manager/HMSAudioManagerApi31;Llive/hms/video/audio/AudioChangeEvent;)V

    :cond_0
    return-void
.end method
