.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase_Impl;",
        "Landroidx/work/impl/WorkDatabase;",
        "<init>",
        "()V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ll83/p;

.field public final b:Ll83/p;

.field public final c:Ll83/p;

.field public final d:Ll83/p;

.field public final e:Ll83/p;

.field public final f:Ll83/p;

.field public final g:Ll83/p;

.field public final h:Ll83/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    new-instance v0, Ljc/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->a:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->b:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->c:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->d:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->e:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->f:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->g:Ll83/p;

    new-instance v0, Ljc/t;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Ljc/t;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->h:Ll83/p;

    return-void
.end method


# virtual methods
.method public final b()Lqc/c;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/c;

    return-object v0
.end method

.method public final c()Lqc/e;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->g:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/e;

    return-object v0
.end method

.method public final clearAllTables()V
    .locals 7

    const-string v5, "WorkProgress"

    const-string v6, "Preference"

    const-string v0, "Dependency"

    const-string v1, "WorkSpec"

    const-string v2, "WorkTag"

    const-string v3, "SystemIdInfo"

    const-string v4, "WorkName"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public final createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 4

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljc/e;

    const/16 v1, 0xe

    const/16 v2, 0xa

    const/16 v3, 0xd

    invoke-direct {v0, v3, v1, v2}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljc/s;-><init>(I)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/e;

    const/16 v1, 0xb

    const/16 v2, 0x10

    const/16 v3, 0x11

    invoke-direct {v0, v2, v3, v1}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/e;

    const/16 v1, 0xc

    const/16 v2, 0x12

    invoke-direct {v0, v3, v2, v1}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/e;

    const/16 v1, 0x13

    const/16 v3, 0xd

    invoke-direct {v0, v2, v1, v3}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljc/s;-><init>(I)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/e;

    const/16 v1, 0x15

    const/16 v2, 0xe

    const/16 v3, 0x14

    invoke-direct {v0, v3, v1, v2}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/e;

    const/16 v1, 0xf

    const/16 v2, 0x16

    const/16 v3, 0x17

    invoke-direct {v0, v2, v3, v1}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljc/e;

    const/16 v1, 0x18

    const/16 v2, 0x10

    invoke-direct {v0, v3, v1, v2}, Ljc/e;-><init>(III)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final createInvalidationTracker()Landroidx/room/v;
    .locals 10

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Landroidx/room/v;

    const-string v8, "WorkProgress"

    const-string v9, "Preference"

    const-string v3, "Dependency"

    const-string v4, "WorkSpec"

    const-string v5, "WorkTag"

    const-string v6, "SystemIdInfo"

    const-string v7, "WorkName"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v2
.end method

.method public final createOpenDelegate()Landroidx/room/h1;
    .locals 1

    new-instance v0, Ljc/u;

    invoke-direct {v0, p0}, Ljc/u;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    return-object v0
.end method

.method public final d()Lqc/g;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->h:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/g;

    return-object v0
.end method

.method public final e()Lqc/i;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/i;

    return-object v0
.end method

.method public final f()Lqc/l;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/l;

    return-object v0
.end method

.method public final g()Lqc/n;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->f:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/n;

    return-object v0
.end method

.method public final getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public final getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lqc/u;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/w;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/i;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/l;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/n;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lqc/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final h()Lqc/u;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/u;

    return-object v0
.end method

.method public final i()Lqc/w;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/w;

    return-object v0
.end method
