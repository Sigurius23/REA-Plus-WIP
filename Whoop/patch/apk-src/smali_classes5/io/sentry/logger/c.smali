.class public final Lio/sentry/logger/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/logger/a;
.implements Lio/sentry/logger/b;


# static fields
.field public static final w:Lio/sentry/logger/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/logger/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/logger/c;->w:Lio/sentry/logger/c;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    return-void
.end method

.method public b(Lio/sentry/q6;Lcd3/g;)Lio/sentry/logger/a;
    .locals 1

    new-instance v0, La30/w0;

    invoke-direct {v0, p1, p2}, La30/w0;-><init>(Lio/sentry/q6;Lcd3/g;)V

    return-object v0
.end method

.method public d(J)V
    .locals 0

    return-void
.end method
