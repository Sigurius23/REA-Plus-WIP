.class public abstract Lio/sentry/android/core/o0;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# instance fields
.field public final w:Lad3/z;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    new-instance v0, Lad3/z;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    iput-object v0, p0, Lio/sentry/android/core/o0;->w:Lad3/z;

    return-void
.end method


# virtual methods
.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/o0;->w:Lad3/z;

    invoke-virtual {p1, p0}, Lad3/z;->h(Lio/sentry/android/core/o0;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/o0;->w:Lad3/z;

    invoke-virtual {p1, p0}, Lad3/z;->h(Lio/sentry/android/core/o0;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/o0;->w:Lad3/z;

    invoke-virtual {p1, p0}, Lad3/z;->h(Lio/sentry/android/core/o0;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/o0;->w:Lad3/z;

    invoke-virtual {p1, p0}, Lad3/z;->h(Lio/sentry/android/core/o0;)V

    const/4 p1, 0x0

    return p1
.end method
