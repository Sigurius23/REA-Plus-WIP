.class public abstract Lio/sentry/android/replay/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li3/y;

    const-string v1, "SentryPrivacy"

    sget-object v2, Lio/sentry/android/replay/x;->w:Lio/sentry/android/replay/x;

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Lio/sentry/android/replay/y;->a:Li3/y;

    return-void
.end method
