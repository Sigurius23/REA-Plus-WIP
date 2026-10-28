.class final synthetic Llive/hms/video/transport/HMSTransport$publish$3$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/transport/HMSTransport;->publish(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "onTrackMuteChange(Llive/hms/video/media/tracks/HMSLocalTrack;)V"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Llive/hms/video/transport/ITransportObserver;

    const-string v5, "onTrackMuteChange"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/media/tracks/HMSLocalTrack;

    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$publish$3$1;->invoke(Llive/hms/video/media/tracks/HMSLocalTrack;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Llive/hms/video/media/tracks/HMSLocalTrack;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/ITransportObserver;

    invoke-interface {v0, p1}, Llive/hms/video/transport/ITransportObserver;->onTrackMuteChange(Llive/hms/video/media/tracks/HMSLocalTrack;)V

    return-void
.end method
