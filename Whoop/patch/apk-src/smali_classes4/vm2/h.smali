.class public final Lvm2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lvm2/h;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Intent;",
        "intent",
        "Lvm2/i;",
        "a",
        "(Landroid/content/Intent;)Lvm2/i;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lvm2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvm2/h;

    invoke-direct {v0}, Lvm2/h;-><init>()V

    sput-object v0, Lvm2/h;->a:Lvm2/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Lvm2/i;
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lvm2/i;->NAV_DEEPLINK:Lvm2/i;

    return-object p1

    :cond_0
    const-string v0, "iterableNavType"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lvm2/i;->ITERABLE:Lvm2/i;

    return-object p1

    :cond_1
    const-string v0, "pairing_completion_destination"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lvm2/i;->PAIRING:Lvm2/i;

    return-object p1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v0, "amp-"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    sget-object p1, Lvm2/i;->AMP_PREVIEW:Lvm2/i;

    return-object p1

    :cond_4
    sget-object p1, Lvm2/i;->URI_DEEPLINK:Lvm2/i;

    return-object p1
.end method
