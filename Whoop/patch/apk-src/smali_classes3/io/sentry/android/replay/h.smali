.class public final synthetic Lio/sentry/android/replay/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/k;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/h;->a:Lio/sentry/android/replay/k;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 4

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v0, ".jpg"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Lx83/j;->n(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iget-object v2, p0, Lio/sentry/android/replay/h;->a:Lio/sentry/android/replay/k;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, p1, p2, v3}, Lio/sentry/android/replay/k;->b(Ljava/io/File;JLjava/lang/String;)V

    :cond_0
    return v1
.end method
