.class public final Lio/sentry/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/e1;


# static fields
.field public static final a:Lio/sentry/z2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/z2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/z2;->a:Lio/sentry/z2;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/d1;)Lio/sentry/i1;
    .locals 0

    sget-object p1, Lio/sentry/y2;->w:Lio/sentry/y2;

    return-object p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final get()Lio/sentry/d1;
    .locals 1

    sget-object v0, Lio/sentry/x2;->b:Lio/sentry/x2;

    return-object v0
.end method
