.class public abstract Lio/sentry/util/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lae3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lae3/d;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lae3/d;-><init>(I)V

    sput-object v0, Lio/sentry/util/k;->a:Lae3/d;

    return-void
.end method

.method public static a()Lio/sentry/util/j;
    .locals 1

    sget-object v0, Lio/sentry/util/k;->a:Lae3/d;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/util/j;

    return-object v0
.end method
