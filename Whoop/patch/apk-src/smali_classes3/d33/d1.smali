.class public final Ld33/d1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ld33/h1;


# direct methods
.method public constructor <init>(Ld33/h1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/d1;->x:Ld33/h1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static final f(Ld33/h1;Ljava/util/Set;Ljava/util/Set;)V
    .locals 9

    iget-object v0, p0, Ld33/h1;->b:Lt23/c0;

    iget-object v1, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/q2;

    iget-object v2, p0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/n;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v2, Le33/u;->s:Lec3/h2;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/PeerConnection$IceConnectionState;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iget-object v4, p0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le33/v0;

    if-eqz v4, :cond_1

    iget-object v4, v4, Le33/u;->s:Lec3/h2;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/webrtc/PeerConnection$IceConnectionState;

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v6

    goto :goto_2

    :cond_2
    move v7, v5

    :goto_2
    if-eqz v4, :cond_3

    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v6

    goto :goto_3

    :cond_3
    move p1, v5

    :goto_3
    const-string v8, ", sub="

    if-nez v7, :cond_4

    if-eqz p1, :cond_6

    :cond_4
    instance-of p1, v1, Lt23/h2;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object p0

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    iget-object p2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->E:Lb23/g;

    invoke-interface {p1, v1, p2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v5, "[iceMonitor] ICE degraded (pub="

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") \u2014 marking Reconnecting"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v1, p2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p0, v0, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lt23/o2;->a:Lt23/o2;

    invoke-virtual {p0, v3, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_6
    instance-of p1, v1, Lt23/o2;

    if-eqz p1, :cond_c

    iget-object p1, p0, Ld33/h1;->D:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Li53/a;

    if-eqz p1, :cond_c

    if-eqz v2, :cond_8

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    move p1, v5

    goto :goto_5

    :cond_8
    :goto_4
    move p1, v6

    :goto_5
    if-eqz v4, :cond_9

    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    :cond_9
    move v5, v6

    :cond_a
    if-eqz p1, :cond_c

    if-eqz v5, :cond_c

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object p0

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    iget-object p2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->z:Lb23/g;

    invoke-interface {p1, v1, p2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v5, "[iceMonitor] ICE recovered (pub="

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") \u2014 marking Connected"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v1, p2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    iget-object p0, v0, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lt23/h2;->a:Lt23/h2;

    invoke-virtual {p0, v3, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_c
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Ld33/d1;

    iget-object v1, p0, Ld33/d1;->x:Ld33/h1;

    invoke-direct {v0, v1, p2}, Ld33/d1;-><init>(Ld33/h1;Lq83/d;)V

    iput-object p1, v0, Ld33/d1;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/d1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/d1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/d1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/d1;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    sget-object v0, Lorg/webrtc/PeerConnection$IceConnectionState;->DISCONNECTED:Lorg/webrtc/PeerConnection$IceConnectionState;

    sget-object v1, Lorg/webrtc/PeerConnection$IceConnectionState;->FAILED:Lorg/webrtc/PeerConnection$IceConnectionState;

    filled-new-array {v0, v1}, [Lorg/webrtc/PeerConnection$IceConnectionState;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lorg/webrtc/PeerConnection$IceConnectionState;->CONNECTED:Lorg/webrtc/PeerConnection$IceConnectionState;

    sget-object v2, Lorg/webrtc/PeerConnection$IceConnectionState;->COMPLETED:Lorg/webrtc/PeerConnection$IceConnectionState;

    filled-new-array {v1, v2}, [Lorg/webrtc/PeerConnection$IceConnectionState;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    new-instance v2, Ld33/y0;

    iget-object v3, p0, Ld33/d1;->x:Ld33/h1;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v0, v1, v4}, Ld33/y0;-><init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {p1, v4, v4, v2, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v2, Ld33/c1;

    invoke-direct {v2, v3, v0, v1, v4}, Ld33/c1;-><init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;Lq83/d;)V

    invoke-static {p1, v4, v4, v2, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
