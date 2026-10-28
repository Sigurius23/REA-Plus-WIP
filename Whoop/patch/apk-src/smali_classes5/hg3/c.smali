.class public final Lhg3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lig3/d;


# instance fields
.field public final a:Lqt/e;

.field public final b:Lio/sentry/hints/j;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqt/e;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    iput-object v0, p0, Lhg3/c;->a:Lqt/e;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    iput-object v0, p0, Lhg3/c;->b:Lio/sentry/hints/j;

    return-void
.end method


# virtual methods
.method public final a()Lfg3/a;
    .locals 1

    iget-object v0, p0, Lhg3/c;->a:Lqt/e;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "2.0.99"

    return-object v0
.end method

.method public final c()Lig3/b;
    .locals 1

    iget-object v0, p0, Lhg3/c;->b:Lio/sentry/hints/j;

    return-object v0
.end method
