.class public final Landroid/support/v4/media/session/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:I


# instance fields
.field public final a:Landroid/support/v4/media/session/l;

.field public final b:Lro/i;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;)V
    .locals 7

    const-string v0, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_9

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    sget v1, Lt8/a;->a:I

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    new-instance v2, Landroid/content/ComponentName;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v2, v6, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v5, :cond_1

    const-string v1, "MediaButtonReceiver"

    const-string v2, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move-object v2, v4

    :goto_0
    if-nez v2, :cond_2

    const-string v1, "MediaSessionCompat"

    const-string v6, "Couldn\'t find a unique registered media button receiver in the given context."

    invoke-static {v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v2, :cond_4

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_3

    const/high16 v0, 0x2000000

    goto :goto_1

    :cond_3
    move v0, v3

    :goto_1
    invoke-static {p1, v3, v1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_5

    new-instance v0, Landroid/support/v4/media/session/n;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    goto :goto_2

    :cond_5
    new-instance v0, Landroid/support/v4/media/session/l;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    :goto_2
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_3

    :cond_6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_3
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, La00/g;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, La00/g;-><init>(I)V

    iget-object v1, p0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    iget-object v2, v1, Landroid/support/v4/media/session/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iput-object v0, v1, Landroid/support/v4/media/session/l;->g:La00/g;

    iget-object v3, v1, Landroid/support/v4/media/session/l;->a:Landroid/media/session/MediaSession;

    iget-object v6, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v6, Landroid/support/v4/media/session/i;

    invoke-virtual {v3, v6, p2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V

    invoke-virtual {v0, v1, p2}, La00/g;->L(Landroid/support/v4/media/session/j;Landroid/os/Handler;)V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    iget-object p2, p2, Landroid/support/v4/media/session/l;->a:Landroid/media/session/MediaSession;

    invoke-virtual {p2, v4}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    new-instance p2, Lro/i;

    invoke-direct {p2, p1, p0}, Lro/i;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/p;)V

    iput-object p2, p0, Landroid/support/v4/media/session/p;->b:Lro/i;

    sget p2, Landroid/support/v4/media/session/p;->c:I

    if-nez p2, :cond_7

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 p2, 0x43a00000    # 320.0f

    invoke-static {v5, p2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    sput p1, Landroid/support/v4/media/session/p;->c:I

    :cond_7
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "tag must not be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "context must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p0, :cond_0

    const-class v0, Landroid/support/v4/media/session/p;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    return-void
.end method

.method public static d(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Landroid/support/v4/media/session/p;->a(Landroid/os/Bundle;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "MediaSessionCompat"

    const-string v1, "Could not unparcel the data."

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    iput-object p1, v0, Landroid/support/v4/media/session/l;->f:Landroid/support/v4/media/MediaMetadataCompat;

    iget-object v0, v0, Landroid/support/v4/media/session/l;->a:Landroid/media/session/MediaSession;

    iget-object v1, p1, Landroid/support/v4/media/MediaMetadataCompat;->x:Landroid/media/MediaMetadata;

    if-nez v1, :cond_0

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v2, Landroid/media/MediaMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaMetadata;

    iput-object v2, p1, Landroid/support/v4/media/MediaMetadataCompat;->x:Landroid/media/MediaMetadata;

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    :cond_0
    iget-object p1, p1, Landroid/support/v4/media/MediaMetadataCompat;->x:Landroid/media/MediaMetadata;

    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    return-void
.end method

.method public final c(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 9

    iget-object v0, p0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    iput-object p1, v0, Landroid/support/v4/media/session/l;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    iget-object v1, v0, Landroid/support/v4/media/session/l;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Landroid/support/v4/media/session/l;->d:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    iget-object v3, v0, Landroid/support/v4/media/session/l;->d:Landroid/os/RemoteCallbackList;

    invoke-virtual {v3, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v3

    check-cast v3, Landroid/support/v4/media/session/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v3, p1}, Landroid/support/v4/media/session/b;->h0(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :catch_0
    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v2, v0, Landroid/support/v4/media/session/l;->d:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v0, Landroid/support/v4/media/session/l;->a:Landroid/media/session/MediaSession;

    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->L:Landroid/media/session/PlaybackState;

    if-nez v1, :cond_2

    invoke-static {}, Landroid/support/v4/media/session/q;->d()Landroid/media/session/PlaybackState$Builder;

    move-result-object v2

    iget v3, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->w:I

    iget-wide v4, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->x:J

    iget v6, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->z:F

    iget-wide v7, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->H:J

    invoke-static/range {v2 .. v8}, Landroid/support/v4/media/session/q;->x(Landroid/media/session/PlaybackState$Builder;IJFJ)V

    iget-wide v3, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->y:J

    invoke-static {v2, v3, v4}, Landroid/support/v4/media/session/q;->u(Landroid/media/session/PlaybackState$Builder;J)V

    iget-wide v3, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->E:J

    invoke-static {v2, v3, v4}, Landroid/support/v4/media/session/q;->s(Landroid/media/session/PlaybackState$Builder;J)V

    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->G:Ljava/lang/CharSequence;

    invoke-static {v2, v1}, Landroid/support/v4/media/session/q;->v(Landroid/media/session/PlaybackState$Builder;Ljava/lang/CharSequence;)V

    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->I:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    iget-object v4, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->w:Ljava/lang/String;

    iget-object v5, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->x:Ljava/lang/CharSequence;

    iget v6, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->y:I

    invoke-static {v4, v5, v6}, Landroid/support/v4/media/session/q;->e(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/media/session/PlaybackState$CustomAction$Builder;

    move-result-object v4

    iget-object v3, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->z:Landroid/os/Bundle;

    invoke-static {v4, v3}, Landroid/support/v4/media/session/q;->w(Landroid/media/session/PlaybackState$CustomAction$Builder;Landroid/os/Bundle;)V

    invoke-static {v4}, Landroid/support/v4/media/session/q;->b(Landroid/media/session/PlaybackState$CustomAction$Builder;)Landroid/media/session/PlaybackState$CustomAction;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/support/v4/media/session/q;->a(Landroid/media/session/PlaybackState$Builder;Landroid/media/session/PlaybackState$CustomAction;)V

    goto :goto_2

    :cond_1
    iget-wide v3, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->J:J

    invoke-static {v2, v3, v4}, Landroid/support/v4/media/session/q;->t(Landroid/media/session/PlaybackState$Builder;J)V

    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->K:Landroid/os/Bundle;

    invoke-static {v2, v1}, Landroid/support/v4/media/session/r;->b(Landroid/media/session/PlaybackState$Builder;Landroid/os/Bundle;)V

    invoke-static {v2}, Landroid/support/v4/media/session/q;->c(Landroid/media/session/PlaybackState$Builder;)Landroid/media/session/PlaybackState;

    move-result-object v1

    iput-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->L:Landroid/media/session/PlaybackState;

    :cond_2
    iget-object p1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->L:Landroid/media/session/PlaybackState;

    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    return-void

    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
