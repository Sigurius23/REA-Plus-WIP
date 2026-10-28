.class final synthetic Llive/hms/video/factories/HappyEyeballsDns$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/factories/HappyEyeballsDns;-><init>(Lud3/v;Lkotlin/jvm/functions/Function3;Lc93/a;Ljava/util/concurrent/ScheduledExecutorService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function3;"
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

    const-string v6, "tcpHandshakeSucceeds(Ljava/net/InetAddress;II)Z"

    const/4 v2, 0x0

    const/4 v1, 0x3

    const-class v3, Llive/hms/video/factories/HappyEyeballsDns$Companion;

    const-string v5, "tcpHandshakeSucceeds"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/net/InetAddress;II)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/factories/HappyEyeballsDns$Companion;

    invoke-static {v0, p1, p2, p3}, Llive/hms/video/factories/HappyEyeballsDns$Companion;->access$tcpHandshakeSucceeds(Llive/hms/video/factories/HappyEyeballsDns$Companion;Ljava/net/InetAddress;II)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/net/InetAddress;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/factories/HappyEyeballsDns$1;->invoke(Ljava/net/InetAddress;II)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
