.class public final Lcom/stripe/android/link/LinkActivityContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityContract;",
        "Lk/b;",
        "Lwz/k;",
        "Lwz/q;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/stripe/android/link/NativeLinkActivityContract;

.field public final b:Lcom/stripe/android/link/WebLinkActivityContract;

.field public final c:Lu00/e;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lu00/e;)V
    .locals 1

    const-string v0, "nativeLinkActivityContract"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webLinkActivityContract"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkGateFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityContract;->a:Lcom/stripe/android/link/NativeLinkActivityContract;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract;->b:Lcom/stripe/android/link/WebLinkActivityContract;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityContract;->c:Lu00/e;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    check-cast p2, Lwz/k;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lwz/k;->a:Lwz/g0;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract;->c:Lu00/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "configuration"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb00/a;

    invoke-direct {v1, v0}, Lb00/a;-><init>(Lwz/g0;)V

    invoke-virtual {v1}, Lb00/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->a:Lcom/stripe/android/link/NativeLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/NativeLinkActivityContract;->a(Landroid/content/Context;Lwz/k;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->b:Lcom/stripe/android/link/WebLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->a(Landroid/content/Context;Lwz/k;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    const v0, 0x11f5b

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->a:Lcom/stripe/android/link/NativeLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/NativeLinkActivityContract;->b(ILandroid/content/Intent;)Lwz/q;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->b:Lcom/stripe/android/link/WebLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->b(ILandroid/content/Intent;)Lwz/q;

    move-result-object p1

    return-object p1
.end method
