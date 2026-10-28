.class public abstract Ldk/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqt/e;

.field public static final b:Ljc/a;

.field public static final c:Lio/sentry/hints/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Ldk/d;->a:Lqt/e;

    new-instance v0, Ljc/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Ldk/d;->b:Ljc/a;

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Ldk/d;->c:Lio/sentry/hints/j;

    return-void
.end method
