.class public final Lio/sentry/transport/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/cache/d;


# static fields
.field public static final w:Lio/sentry/transport/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/transport/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/transport/i;->w:Lio/sentry/transport/i;

    return-void
.end method


# virtual methods
.method public final X0(Lcom/google/crypto/tink/internal/l0;)V
    .locals 0

    return-void
.end method

.method public final a0(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyIterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
