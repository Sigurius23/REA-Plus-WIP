.class public final synthetic Lio/sentry/android/core/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

.field public final synthetic x:J

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/a0;->w:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    iput-wide p2, p0, Lio/sentry/android/core/a0;->x:J

    iput p4, p0, Lio/sentry/android/core/a0;->y:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/a0;->w:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    iget-object v1, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->x:Lio/sentry/i4;

    if-eqz v1, :cond_0

    new-instance v1, Lio/sentry/e;

    iget-wide v2, p0, Lio/sentry/android/core/a0;->x:J

    invoke-direct {v1, v2, v3}, Lio/sentry/e;-><init>(J)V

    const-string v2, "system"

    iput-object v2, v1, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v2, "device.event"

    iput-object v2, v1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v2, "Low memory"

    iput-object v2, v1, Lio/sentry/e;->z:Ljava/lang/String;

    const-string v2, "action"

    const-string v3, "LOW_MEMORY"

    invoke-virtual {v1, v3, v2}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "level"

    iget v3, p0, Lio/sentry/android/core/a0;->y:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    iput-object v2, v1, Lio/sentry/e;->I:Lio/sentry/n5;

    iget-object v0, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->x:Lio/sentry/i4;

    sget-object v2, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->E:Lio/sentry/g0;

    invoke-virtual {v0, v1, v2}, Lio/sentry/i4;->i(Lio/sentry/e;Lio/sentry/g0;)V

    :cond_0
    return-void
.end method
