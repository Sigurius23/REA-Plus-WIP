.class public final Lt23/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Lt23/c0;


# direct methods
.method public constructor <init>(Lt23/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/t;->w:Lt23/c0;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Ll83/k;

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Le33/n;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Lorg/webrtc/PeerConnection$IceConnectionState;

    if-nez p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lt23/s;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object p2, p0, Lt23/t;->w:Lt23/c0;

    invoke-virtual {p2}, Lt23/c0;->g()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "[monitorPubConnectionState] Ice connection state is "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, v2, v1, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object p1

    invoke-virtual {p1}, Lorg/webrtc/PeerConnection;->restartIce()V

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
