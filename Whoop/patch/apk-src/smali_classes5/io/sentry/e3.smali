.class public final Lio/sentry/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/l1;


# static fields
.field public static final a:Lio/sentry/e3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/e3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/e3;->a:Lio/sentry/e3;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/i7;)V
    .locals 0

    return-void
.end method

.method public final b()Lio/sentry/w6;
    .locals 4

    new-instance v0, Lio/sentry/w6;

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    sget-object v2, Lio/sentry/h7;->x:Lio/sentry/h7;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/w6;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public final c()Lio/sentry/i7;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;)Lio/sentry/l1;
    .locals 0

    sget-object p1, Lio/sentry/e3;->a:Lio/sentry/e3;

    return-object p1
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 0

    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l(Lio/sentry/i7;)V
    .locals 0

    return-void
.end method

.method public final m(Ljava/io/IOException;)V
    .locals 0

    return-void
.end method

.method public final n(Ljava/util/List;)Lhc3/x;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final o(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final s(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/l2;)V
    .locals 0

    return-void
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final t()Lio/sentry/e7;
    .locals 5

    new-instance v0, Lio/sentry/e7;

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    sget-object v2, Lio/sentry/h7;->x:Lio/sentry/h7;

    const-string v3, "op"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    return-object v0
.end method

.method public final u()Lio/sentry/u4;
    .locals 1

    new-instance v0, Lio/sentry/x5;

    invoke-direct {v0}, Lio/sentry/x5;-><init>()V

    return-object v0
.end method

.method public final v(Lio/sentry/i7;Lio/sentry/u4;)V
    .locals 0

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/l1;
    .locals 0

    sget-object p1, Lio/sentry/e3;->a:Lio/sentry/e3;

    return-object p1
.end method

.method public final x()Lio/sentry/u4;
    .locals 1

    new-instance v0, Lio/sentry/x5;

    invoke-direct {v0}, Lio/sentry/x5;-><init>()V

    return-object v0
.end method
