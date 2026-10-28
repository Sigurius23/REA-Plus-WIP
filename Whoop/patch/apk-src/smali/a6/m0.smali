.class public final La6/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/f1;


# static fields
.field public static final d:Ljava/util/LinkedHashSet;

.field public static final e:Ljava/lang/Object;


# instance fields
.field public final a:La6/y0;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lc93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, La6/m0;->d:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La6/m0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La6/y0;Lc93/a;)V
    .locals 2

    new-instance v0, La11/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/m0;->a:La6/y0;

    iput-object v0, p0, La6/m0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La6/m0;->c:Lc93/a;

    return-void
.end method


# virtual methods
.method public final a()La6/g1;
    .locals 6

    const-string v0, "There are multiple DataStores active for the same file: "

    iget-object v1, p0, La6/m0;->c:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v1

    sget-object v2, La6/m0;->e:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    sget-object v4, La6/m0;->d:Ljava/util/LinkedHashSet;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    new-instance v0, La6/p0;

    iget-object v2, p0, La6/m0;->a:La6/y0;

    iget-object v3, p0, La6/m0;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La6/d1;

    new-instance v4, La6/l0;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1, v2, v3, v4}, La6/p0;-><init>(Ljava/io/File;La6/y0;La6/d1;La6/l0;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled)."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
