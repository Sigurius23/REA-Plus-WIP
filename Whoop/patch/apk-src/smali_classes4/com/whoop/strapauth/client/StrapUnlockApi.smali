.class public interface abstract Lcom/whoop/strapauth/client/StrapUnlockApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/strapauth/client/StrapUnlockApi;",
        "",
        "",
        "strapId",
        "Lcom/whoop/strapauth/client/StrapUnlockRequest;",
        "body",
        "Lcom/whoop/strapauth/client/StrapUnlockResponse;",
        "getUnlockToken",
        "(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;",
        "strap-auth_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getUnlockToken(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/strapauth/client/StrapUnlockRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/strapauth/client/StrapUnlockRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strapauth/client/StrapUnlockResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "firmware-service/v4/strap/unlock-token"
    .end annotation
.end method
