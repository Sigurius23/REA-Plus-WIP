.class public final Llive/hms/video/transport/IsQaLink;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Llive/hms/video/transport/IsQaLink;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/sdk/models/HMSConfig;",
        "hmsConfig",
        "Ll83/a0;",
        "updateIsQaLink",
        "(Llive/hms/video/sdk/models/HMSConfig;)V",
        "",
        "value",
        "isQa",
        "Z",
        "()Z",
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
.field private isQa:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final isQa()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/transport/IsQaLink;->isQa:Z

    return v0
.end method

.method public final updateIsQaLink(Llive/hms/video/sdk/models/HMSConfig;)V
    .locals 2

    const-string v0, "hmsConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSConfig;->getInitEndpoint()Ljava/lang/String;

    move-result-object p1

    const-string v0, "qa-init.100ms.live"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    iput-boolean p1, p0, Llive/hms/video/transport/IsQaLink;->isQa:Z

    return-void
.end method
