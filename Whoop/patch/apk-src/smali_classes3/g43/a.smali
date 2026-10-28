.class public abstract Lg43/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Landroidx/core/app/NotificationChannelCompat$Builder;

    iget-object v1, p0, Lg43/m;->a:Ljava/lang/String;

    iget v2, p0, Lg43/m;->d:I

    invoke-direct {v0, v1, v2}, Landroidx/core/app/NotificationChannelCompat$Builder;-><init>(Ljava/lang/String;I)V

    iget-object v1, p0, Lg43/m;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationChannelCompat$Builder;->setName(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationChannelCompat$Builder;

    move-result-object v0

    iget-object p0, p0, Lg43/m;->c:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroidx/core/app/NotificationChannelCompat$Builder;->setDescription(Ljava/lang/String;)Landroidx/core/app/NotificationChannelCompat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/core/app/NotificationChannelCompat$Builder;->build()Landroidx/core/app/NotificationChannelCompat;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/core/app/NotificationManagerCompat;->createNotificationChannel(Landroidx/core/app/NotificationChannelCompat;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "SafeCall"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Exception occurred: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static final b(Landroid/content/Context;IIII)Lg43/m;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lg43/m;

    invoke-direct {p3, p4, p1, p2, p0}, Lg43/m;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method
