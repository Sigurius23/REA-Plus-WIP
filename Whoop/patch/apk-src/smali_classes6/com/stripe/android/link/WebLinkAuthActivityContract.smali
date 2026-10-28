.class public final Lcom/stripe/android/link/WebLinkAuthActivityContract;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/link/WebLinkAuthActivityContract;",
        "Lk/b;",
        "",
        "Lwz/w1;",
        "<init>",
        "()V",
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


# static fields
.field public static final a:Lcom/stripe/android/link/WebLinkAuthActivityContract;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/WebLinkAuthActivityContract;

    invoke-direct {v0}, Lcom/stripe/android/link/WebLinkAuthActivityContract;-><init>()V

    sput-object v0, Lcom/stripe/android/link/WebLinkAuthActivityContract;->a:Lcom/stripe/android/link/WebLinkAuthActivityContract;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    check-cast p2, Ljava/lang/String;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/link/LinkForegroundActivity;->x:I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/link/LinkForegroundActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "LinkPopupUrl"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 2

    if-eqz p1, :cond_7

    const v0, 0xc2cf

    if-eq p1, v0, :cond_4

    const v0, 0x164e7

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    invoke-static {p2}, Lb5/c;->c(Landroid/os/Bundle;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string v0, "LinkFailure"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    const-class v0, Ljava/lang/Exception;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object p1, p2

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Exception;

    :cond_3
    if-eqz p1, :cond_7

    new-instance p2, Lwz/v1;

    invoke-direct {p2, p1}, Lwz/v1;-><init>(Ljava/lang/Exception;)V

    return-object p2

    :cond_4
    if-eqz p2, :cond_7

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    const-string p2, "link_status"

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x23bacec7

    if-eq p2, v0, :cond_6

    goto :goto_1

    :cond_6
    const-string p2, "complete"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lwz/u1;->a:Lwz/u1;

    return-object p1

    :cond_7
    :goto_1
    sget-object p1, Lwz/t1;->a:Lwz/t1;

    return-object p1
.end method
