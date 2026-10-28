.class public abstract Lnz2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ao\u0010\t\u001a\u001c\u0012\u0012\u0012\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\u0003\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00002 \u0010\u0006\u001a\u001c\u0012\u0012\u0012\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroid/webkit/ValueCallback;",
        "",
        "Landroid/net/Uri;",
        "currentCallback",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "setCallback",
        "Lkotlin/Function0;",
        "launchFileChooser",
        "b",
        "(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;)Lkotlin/jvm/functions/Function1;",
        "whooplabs_release"
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
.method public static synthetic a(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/webkit/ValueCallback;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnz2/d;->c(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/webkit/ValueCallback;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "setCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchFileChooser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lno0/j0;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p2, v1}, Lno0/j0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static final c(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/webkit/ValueCallback;)Ll83/a0;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_0
    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
