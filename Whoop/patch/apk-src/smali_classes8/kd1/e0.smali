.class public abstract Lkd1/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroid/view/Window;",
        "Li2/x;",
        "statusBarColor",
        "navigationBarColor",
        "Ll83/a0;",
        "a",
        "(Landroid/view/Window;JJ)V",
        "design_release"
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
.method public static final a(Landroid/view/Window;JJ)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-static {p3, p4}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method
