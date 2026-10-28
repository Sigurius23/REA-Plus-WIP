.class public final Landroidx/core/app/RemoteActionCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldc/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/RemoteActionCompat$Api26Impl;,
        Landroidx/core/app/RemoteActionCompat$Api28Impl;
    }
.end annotation


# instance fields
.field public mActionIntent:Landroid/app/PendingIntent;

.field public mContentDescription:Ljava/lang/CharSequence;

.field public mEnabled:Z

.field public mIcon:Landroidx/core/graphics/drawable/IconCompat;

.field public mShouldShowIcon:Z

.field public mTitle:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/core/app/RemoteActionCompat;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    iget-object v0, p1, Landroidx/core/app/RemoteActionCompat;->mIcon:Landroidx/core/graphics/drawable/IconCompat;

    iput-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mIcon:Landroidx/core/graphics/drawable/IconCompat;

    .line 16
    iget-object v0, p1, Landroidx/core/app/RemoteActionCompat;->mTitle:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mTitle:Ljava/lang/CharSequence;

    .line 17
    iget-object v0, p1, Landroidx/core/app/RemoteActionCompat;->mContentDescription:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mContentDescription:Ljava/lang/CharSequence;

    .line 18
    iget-object v0, p1, Landroidx/core/app/RemoteActionCompat;->mActionIntent:Landroid/app/PendingIntent;

    iput-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mActionIntent:Landroid/app/PendingIntent;

    .line 19
    iget-boolean v0, p1, Landroidx/core/app/RemoteActionCompat;->mEnabled:Z

    iput-boolean v0, p0, Landroidx/core/app/RemoteActionCompat;->mEnabled:Z

    .line 20
    iget-boolean p1, p1, Landroidx/core/app/RemoteActionCompat;->mShouldShowIcon:Z

    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->mShouldShowIcon:Z

    return-void
.end method

.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Landroidx/core/app/RemoteActionCompat;->mIcon:Landroidx/core/graphics/drawable/IconCompat;

    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object p2, p0, Landroidx/core/app/RemoteActionCompat;->mTitle:Ljava/lang/CharSequence;

    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    iput-object p3, p0, Landroidx/core/app/RemoteActionCompat;->mContentDescription:Ljava/lang/CharSequence;

    .line 8
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    iput-object p4, p0, Landroidx/core/app/RemoteActionCompat;->mActionIntent:Landroid/app/PendingIntent;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->mEnabled:Z

    .line 11
    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->mShouldShowIcon:Z

    return-void
.end method

.method public static createFromRemoteAction(Landroid/app/RemoteAction;)Landroidx/core/app/RemoteActionCompat;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/core/app/RemoteActionCompat;

    invoke-static {p0}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->getIcon(Landroid/app/RemoteAction;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    sget-object v2, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1}, Ls4/g;->f(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    invoke-static {p0}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->getTitle(Landroid/app/RemoteAction;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {p0}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->getContentDescription(Landroid/app/RemoteAction;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {p0}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->getActionIntent(Landroid/app/RemoteAction;)Landroid/app/PendingIntent;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/core/app/RemoteActionCompat;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-static {p0}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->isEnabled(Landroid/app/RemoteAction;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/RemoteActionCompat;->setEnabled(Z)V

    invoke-static {p0}, Landroidx/core/app/RemoteActionCompat$Api28Impl;->shouldShowIcon(Landroid/app/RemoteAction;)Z

    move-result p0

    invoke-virtual {v0, p0}, Landroidx/core/app/RemoteActionCompat;->setShouldShowIcon(Z)V

    return-object v0
.end method


# virtual methods
.method public getActionIntent()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mActionIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mContentDescription:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getIcon()Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mIcon:Landroidx/core/graphics/drawable/IconCompat;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mTitle:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/core/app/RemoteActionCompat;->mEnabled:Z

    return v0
.end method

.method public setEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->mEnabled:Z

    return-void
.end method

.method public setShouldShowIcon(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->mShouldShowIcon:Z

    return-void
.end method

.method public shouldShowIcon()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/core/app/RemoteActionCompat;->mShouldShowIcon:Z

    return v0
.end method

.method public toRemoteAction()Landroid/app/RemoteAction;
    .locals 4

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->mIcon:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->k(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    iget-object v1, p0, Landroidx/core/app/RemoteActionCompat;->mTitle:Ljava/lang/CharSequence;

    iget-object v2, p0, Landroidx/core/app/RemoteActionCompat;->mContentDescription:Ljava/lang/CharSequence;

    iget-object v3, p0, Landroidx/core/app/RemoteActionCompat;->mActionIntent:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2, v3}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->createRemoteAction(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/RemoteAction;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/app/RemoteActionCompat;->isEnabled()Z

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/app/RemoteActionCompat$Api26Impl;->setEnabled(Landroid/app/RemoteAction;Z)V

    invoke-virtual {p0}, Landroidx/core/app/RemoteActionCompat;->shouldShowIcon()Z

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/app/RemoteActionCompat$Api28Impl;->setShouldShowIcon(Landroid/app/RemoteAction;Z)V

    return-object v0
.end method
