.class public abstract Lio/sentry/r4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/AbstractMap;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:Lio/sentry/protocol/h0;

.field public transient J:Ljava/lang/Throwable;

.field public K:Ljava/lang/String;

.field public L:Ljava/lang/String;

.field public M:Ljava/util/List;

.field public N:Lio/sentry/protocol/d;

.field public O:Ljava/util/AbstractMap;

.field public w:Lio/sentry/protocol/v;

.field public final x:Lio/sentry/protocol/c;

.field public y:Lio/sentry/protocol/t;

.field public z:Lio/sentry/protocol/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    new-instance v0, Lio/sentry/protocol/v;

    invoke-direct {v0}, Lio/sentry/protocol/v;-><init>()V

    invoke-direct {p0, v0}, Lio/sentry/r4;-><init>(Lio/sentry/protocol/v;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    .line 3
    iput-object p1, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lio/sentry/r4;->J:Ljava/lang/Throwable;

    instance-of v1, v0, Lio/sentry/exception/ExceptionMechanismException;

    if-eqz v1, :cond_0

    check-cast v0, Lio/sentry/exception/ExceptionMechanismException;

    invoke-virtual {v0}, Lio/sentry/exception/ExceptionMechanismException;->c()Ljava/lang/Throwable;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_3

    iget-object p2, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-eqz p2, :cond_2

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Ljava/util/HashMap;)V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    return-void
.end method
