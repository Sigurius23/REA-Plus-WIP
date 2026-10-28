.class public Ls8/e;
.super Landroidx/core/app/NotificationCompat$Style;
.source "SourceFile"


# instance fields
.field public a:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# virtual methods
.method public apply(Landroidx/core/app/NotificationBuilderWithBuilderAccessor;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    invoke-interface {p1}, Landroidx/core/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {}, Ls8/a;->a()Landroid/app/Notification$MediaStyle;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v2, v1, v2, v3}, Ls8/c;->a(Landroid/app/Notification$MediaStyle;Ljava/lang/CharSequence;ILandroid/app/PendingIntent;Ljava/lang/Boolean;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    iget-object v1, p0, Ls8/e;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-static {v0, v2, v1}, Ls8/a;->b(Landroid/app/Notification$MediaStyle;[ILandroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    invoke-static {p1, v0}, Ls8/a;->d(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    return-void

    :cond_0
    invoke-interface {p1}, Landroidx/core/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {}, Ls8/a;->a()Landroid/app/Notification$MediaStyle;

    move-result-object v0

    iget-object v1, p0, Ls8/e;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-static {v0, v2, v1}, Ls8/a;->b(Landroid/app/Notification$MediaStyle;[ILandroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    invoke-static {p1, v0}, Ls8/a;->d(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    return-void
.end method

.method public makeBigContentView(Landroidx/core/app/NotificationBuilderWithBuilderAccessor;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public makeContentView(Landroidx/core/app/NotificationBuilderWithBuilderAccessor;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
