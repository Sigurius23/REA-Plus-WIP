.class public final Lio/sentry/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# static fields
.field public static final b:Lio/sentry/w2;


# instance fields
.field public final a:Lio/sentry/util/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/w2;

    invoke-direct {v0}, Lio/sentry/w2;-><init>()V

    sput-object v0, Lio/sentry/w2;->b:Lio/sentry/w2;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Li7/g;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Li7/g;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/w2;->a:Lio/sentry/util/f;

    return-void
.end method

.method public static g()Lio/sentry/w2;
    .locals 1

    sget-object v0, Lio/sentry/w2;->b:Lio/sentry/w2;

    return-object v0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final B(Lio/sentry/n1;)V
    .locals 0

    return-void
.end method

.method public final C()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final E()V
    .locals 0

    return-void
.end method

.method public final F()Lio/sentry/featureflags/b;
    .locals 1

    sget-object v0, Lio/sentry/featureflags/c;->w:Lio/sentry/featureflags/c;

    return-object v0
.end method

.method public final G()La3/p;
    .locals 2

    new-instance v0, La3/p;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, La3/p;-><init>(I)V

    return-object v0
.end method

.method public final H(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final I()Lio/sentry/g1;
    .locals 1

    sget-object v0, Lio/sentry/a3;->w:Lio/sentry/a3;

    return-object v0
.end method

.method public final J(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final K()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final L(Lio/sentry/e5;)V
    .locals 0

    return-void
.end method

.method public final M(Lio/sentry/z3;)La3/p;
    .locals 1

    new-instance p1, La3/p;

    const/16 v0, 0x9

    invoke-direct {p1, v0}, La3/p;-><init>(I)V

    return-object p1
.end method

.method public final N(Lio/sentry/b4;)V
    .locals 0

    return-void
.end method

.method public final O(Lio/sentry/protocol/v;)V
    .locals 0

    return-void
.end method

.method public final P()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final a()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final clear()V
    .locals 0

    return-void
.end method

.method public final clone()Lio/sentry/b1;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/w2;->b:Lio/sentry/w2;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 2
    sget-object v0, Lio/sentry/w2;->b:Lio/sentry/w2;

    return-object v0
.end method

.method public final d()Lio/sentry/protocol/q;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 0

    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getExtras()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public final getLevel()Lio/sentry/n5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUser()Lio/sentry/protocol/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 0

    return-void
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    iget-object v0, p0, Lio/sentry/w2;->a:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/q6;

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final o()Lio/sentry/b7;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final q()Lio/sentry/b7;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final r()Lio/sentry/protocol/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final s()Lio/sentry/protocol/v;
    .locals 1

    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object v0
.end method

.method public final t(Lio/sentry/protocol/v;)V
    .locals 0

    return-void
.end method

.method public final u()Lwe/o;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final v()Ljava/util/Queue;
    .locals 1

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    return-object v0
.end method

.method public final w(Lio/sentry/a4;)Lio/sentry/b7;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final x(La3/p;)V
    .locals 0

    return-void
.end method

.method public final y()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final z()Lio/sentry/protocol/c;
    .locals 1

    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    return-object v0
.end method
