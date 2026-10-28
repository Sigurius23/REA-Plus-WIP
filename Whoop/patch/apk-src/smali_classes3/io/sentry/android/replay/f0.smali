.class public abstract Lio/sentry/android/replay/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ll83/i;->y:Ll83/i;

    sget-object v1, Lio/sentry/android/replay/z;->E:Lio/sentry/android/replay/z;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    sput-object v1, Lio/sentry/android/replay/f0;->a:Ljava/lang/Object;

    sget-object v1, Lio/sentry/android/replay/z;->F:Lio/sentry/android/replay/z;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/f0;->b:Ljava/lang/Object;

    return-void
.end method
