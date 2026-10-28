.class public abstract Lbd2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "message",
        "",
        "duration",
        "Landroid/widget/Toast;",
        "d",
        "(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/Toast;",
        "c",
        "(Landroid/content/Context;)Ljava/lang/String;",
        "share_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lbd2/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/Toast;
    .locals 0

    invoke-static {p0, p1, p2}, Lbd2/b;->d(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/Toast;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    :try_start_0
    invoke-static {p0}, Landroid/provider/Telephony$Sms;->getDefaultSmsPackage(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/Toast;
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    const-string p1, "makeText(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
