.class final Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/module/cronet/UrlCallback;->onFailed(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $error:Lcom/mapbox/common/HttpRequestError;

.field final synthetic this$0:Lcom/mapbox/common/module/cronet/UrlCallback;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/module/cronet/UrlCallback;Lcom/mapbox/common/HttpRequestError;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->this$0:Lcom/mapbox/common/module/cronet/UrlCallback;

    iput-object p2, p0, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->$error:Lcom/mapbox/common/HttpRequestError;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->this$0:Lcom/mapbox/common/module/cronet/UrlCallback;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/mapbox/common/module/cronet/UrlCallback;->access$setFailed$p(Lcom/mapbox/common/module/cronet/UrlCallback;Z)V

    .line 3
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->this$0:Lcom/mapbox/common/module/cronet/UrlCallback;

    invoke-static {v0}, Lcom/mapbox/common/module/cronet/UrlCallback;->access$getObserver$p(Lcom/mapbox/common/module/cronet/UrlCallback;)Lcom/mapbox/common/http_backend/RequestObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->this$0:Lcom/mapbox/common/module/cronet/UrlCallback;

    invoke-static {v1}, Lcom/mapbox/common/module/cronet/UrlCallback;->access$getId$p(Lcom/mapbox/common/module/cronet/UrlCallback;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;->$error:Lcom/mapbox/common/HttpRequestError;

    invoke-interface {v0, v1, v2, v3}, Lcom/mapbox/common/http_backend/RequestObserver;->onFailed(JLcom/mapbox/common/HttpRequestError;)V

    return-void
.end method
