.class public final Lj02/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008JW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lj02/i0;",
        "",
        "<init>",
        "()V",
        "",
        "uriString",
        "Leb/k0;",
        "a",
        "(Ljava/lang/String;)Leb/k0;",
        "Landroid/content/Context;",
        "context",
        "",
        "navGraph",
        "deeplinkDestination",
        "targetUserId",
        "",
        "showDialogView",
        "fromButton",
        "achievementId",
        "navigateToMemberLevels",
        "fromCommunity",
        "Landroid/app/PendingIntent;",
        "b",
        "(Landroid/content/Context;IIIZZLjava/lang/String;ZZ)Landroid/app/PendingIntent;",
        "navigation_release"
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
.field public static final a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Leb/k0;
    .locals 2

    const-string v0, "uriString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/k0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Leb/k0;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Landroid/content/Context;IIIZZLjava/lang/String;ZZ)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "targetUserId"

    invoke-virtual {v0, v1, p4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p4, "showDialogView"

    invoke-virtual {v0, p4, p5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "fromButton"

    invoke-virtual {v0, p4, p6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "achievementId"

    invoke-virtual {v0, p4, p7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "navigateToMemberLevels"

    invoke-virtual {v0, p4, p8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "fromCommunity"

    invoke-virtual {v0, p4, p9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    new-instance p4, Leb/j0;

    invoke-direct {p4, p1}, Leb/j0;-><init>(Landroid/content/Context;)V

    invoke-virtual {p4, p2}, Leb/j0;->g(I)V

    invoke-static {p4, p3}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p4, v0}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {p4}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method
