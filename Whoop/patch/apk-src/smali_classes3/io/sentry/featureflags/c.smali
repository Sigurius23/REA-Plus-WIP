.class public final Lio/sentry/featureflags/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/featureflags/b;


# static fields
.field public static final w:Lio/sentry/featureflags/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/featureflags/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/featureflags/c;->w:Lio/sentry/featureflags/c;

    return-void
.end method


# virtual methods
.method public final clone()Lio/sentry/featureflags/b;
    .locals 1

    .line 2
    sget-object v0, Lio/sentry/featureflags/c;->w:Lio/sentry/featureflags/c;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/featureflags/c;->w:Lio/sentry/featureflags/c;

    return-object v0
.end method

.method public final r()Lio/sentry/protocol/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
