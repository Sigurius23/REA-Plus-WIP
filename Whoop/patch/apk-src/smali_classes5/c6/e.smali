.class public final Lc6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/f1;


# static fields
.field public static final f:Ljava/util/LinkedHashSet;

.field public static final g:Lkr/e;


# instance fields
.field public final a:Lne3/p;

.field public final b:Lz5/b;

.field public final c:Lc93/m;

.field public final d:Lal0/f;

.field public final e:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lc6/e;->f:Ljava/util/LinkedHashSet;

    new-instance v0, Lkr/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Lc6/e;->g:Lkr/e;

    return-void
.end method

.method public constructor <init>(Lne3/p;Lz5/b;Lal0/f;)V
    .locals 2

    new-instance v0, Lc41/w0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc41/w0;-><init>(I)V

    const-string v1, "fileSystem"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc6/e;->a:Lne3/p;

    iput-object p2, p0, Lc6/e;->b:Lz5/b;

    iput-object v0, p0, Lc6/e;->c:Lc93/m;

    iput-object p3, p0, Lc6/e;->d:Lal0/f;

    new-instance p1, Lc6/d;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lc6/d;-><init>(Lc6/e;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lc6/e;->e:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()La6/g1;
    .locals 11

    const-string v0, "There are multiple DataStores active for the same file: "

    iget-object v1, p0, Lc6/e;->e:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/e0;

    iget-object v1, v1, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v1}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lc6/e;->g:Lkr/e;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lc6/e;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    new-instance v5, Lc6/h;

    iget-object v6, p0, Lc6/e;->a:Lne3/p;

    iget-object v0, p0, Lc6/e;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lne3/e0;

    iget-object v8, p0, Lc6/e;->b:Lz5/b;

    iget-object v0, p0, Lc6/e;->c:Lc93/m;

    iget-object v1, p0, Lc6/e;->e:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/e0;

    iget-object v2, p0, Lc6/e;->a:Lne3/p;

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, La6/d1;

    new-instance v10, Lc6/d;

    const/4 v0, 0x0

    invoke-direct {v10, p0, v0}, Lc6/d;-><init>(Lc6/e;I)V

    invoke-direct/range {v5 .. v10}, Lc6/h;-><init>(Lne3/p;Lne3/e0;Lz5/b;La6/d1;Lc6/d;)V

    return-object v5

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled)."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v2

    throw v0
.end method
