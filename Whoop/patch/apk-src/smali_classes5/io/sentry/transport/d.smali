.class public final Lio/sentry/transport/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/transport/f;


# static fields
.field public static final w:Lio/sentry/transport/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/transport/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/transport/d;->w:Lio/sentry/transport/d;

    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
