.class public abstract Lm92/a;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lm92/a;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "<init>",
        "(Lo92/s;)V",
        "Landroid/content/Context;",
        "context",
        "",
        "activityV2Id",
        "Landroid/app/PendingIntent;",
        "z",
        "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;",
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


# direct methods
.method public constructor <init>(Lo92/s;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    return-void
.end method


# virtual methods
.method public final z(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityV2Id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "entryPoint"

    const-string v2, "Push Notification"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "activityType"

    const-string v3, "Cardio"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "activityIdV2"

    invoke-direct {v2, v3, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0, p1}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget v0, Lvv0/a;->a:I

    invoke-static {p1, v0}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1, p2}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method
