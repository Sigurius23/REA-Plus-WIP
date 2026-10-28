.class public final Lb3/a2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lpb/d;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLpb/d;Ljava/lang/String;)V
    .locals 0

    iput-boolean p1, p0, Lb3/a2;->w:Z

    iput-object p2, p0, Lb3/a2;->x:Lpb/d;

    iput-object p3, p0, Lb3/a2;->y:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lb3/a2;->w:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb3/a2;->x:Lpb/d;

    iget-object v1, p0, Lb3/a2;->y:Ljava/lang/String;

    iget-object v0, v0, Lpb/d;->a:Lrb/a;

    iget-object v2, v0, Lrb/a;->c:Ljc/b;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lrb/a;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpb/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
