.class public final Lp6/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Lp6/t;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/LinkedHashMap;

.field public c:I

.field public final d:I

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp6/z0;->g:Lp6/t;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/LinkedHashMap;IILjava/util/Set;)V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/z0;->a:Landroid/content/Context;

    iput-object p2, p0, Lp6/z0;->b:Ljava/util/LinkedHashMap;

    iput p3, p0, Lp6/z0;->c:I

    iput p4, p0, Lp6/z0;->d:I

    iput-object v0, p0, Lp6/z0;->e:Ljava/util/LinkedHashSet;

    iput-object p5, p0, Lp6/z0;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ln6/k;)I
    .locals 3

    invoke-static {p1}, Ldp/d;->x(Ln6/i;)Lr6/w;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp6/z0;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lp6/z0;->e:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_1
    iget v0, p0, Lp6/z0;->c:I

    :goto_0
    iget-object v1, p0, Lp6/z0;->f:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    sget v1, Lp6/c1;->c:I

    rem-int/2addr v0, v1

    iget v1, p0, Lp6/z0;->c:I

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "Cannot assign a valid layout index to the new layout: no free index left."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/lit8 v1, v0, 0x1

    sget v2, Lp6/c1;->c:I

    rem-int/2addr v1, v2

    iput v1, p0, Lp6/z0;->c:I

    iget-object v1, p0, Lp6/z0;->e:Ljava/util/LinkedHashSet;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lp6/z0;->f:Ljava/util/Set;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lp6/z0;->b:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final b(Lp6/h;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Ly6/f;->a:Ly6/f;

    iget v1, p0, Lp6/z0;->d:I

    const-string v2, "appWidgetLayout-"

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo23/p;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {v4, p0, v1, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iget-object v1, p0, Lp6/z0;->a:Landroid/content/Context;

    sget-object v2, Lp6/f1;->a:Lp6/f1;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Ly6/f;->d(Landroid/content/Context;Ly6/g;Ljava/lang/String;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
