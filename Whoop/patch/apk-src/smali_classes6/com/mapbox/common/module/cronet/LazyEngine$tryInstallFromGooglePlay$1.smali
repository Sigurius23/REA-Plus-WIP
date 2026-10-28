.class final Lcom/mapbox/common/module/cronet/LazyEngine$tryInstallFromGooglePlay$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/module/cronet/LazyEngine;->tryInstallFromGooglePlay()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ljava/lang/Void;",
        "kotlin.jvm.PlatformType",
        "it",
        "Ll83/a0;",
        "invoke",
        "(Ljava/lang/Void;)V",
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
.field final synthetic this$0:Lcom/mapbox/common/module/cronet/LazyEngine;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/module/cronet/LazyEngine;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/LazyEngine$tryInstallFromGooglePlay$1;->this$0:Lcom/mapbox/common/module/cronet/LazyEngine;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/mapbox/common/module/cronet/LazyEngine$tryInstallFromGooglePlay$1;->invoke(Ljava/lang/Void;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Void;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/mapbox/common/module/cronet/LazyEngine$tryInstallFromGooglePlay$1;->this$0:Lcom/mapbox/common/module/cronet/LazyEngine;

    invoke-static {p1}, Lcom/mapbox/common/module/cronet/LazyEngine;->access$getContext$p(Lcom/mapbox/common/module/cronet/LazyEngine;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mapbox/common/module/cronet/LazyEngineKt;->findCronetProvider(Landroid/content/Context;)Lorg/chromium/net/CronetProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mapbox/common/module/cronet/LazyEngine;->access$setCronetProvider$p(Lcom/mapbox/common/module/cronet/LazyEngine;Lorg/chromium/net/CronetProvider;)V

    return-void
.end method
