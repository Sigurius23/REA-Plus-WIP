.class public final Lio/sentry/android/core/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lio/sentry/android/core/o;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/n;->w:Lio/sentry/android/core/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/n;->w:Lio/sentry/android/core/o;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/k0;->d(J)V

    return-void
.end method
