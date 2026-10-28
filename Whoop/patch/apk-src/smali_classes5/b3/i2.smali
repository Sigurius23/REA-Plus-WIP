.class public final Lb3/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld1/o;

.field public final b:Lav/b;

.field public final c:Ljava/lang/Object;

.field public final d:Lr1/c;

.field public e:Z


# direct methods
.method public constructor <init>(Ld1/o;Lav/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/i2;->a:Ld1/o;

    iput-object p2, p0, Lb3/i2;->b:Lav/b;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/i2;->c:Ljava/lang/Object;

    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p2, p2, [La3/r2;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lb3/i2;->d:Lr1/c;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)Lq3/o;
    .locals 4

    iget-object v0, p0, Lb3/i2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb3/i2;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lb3/i2;->a:Ld1/o;

    invoke-virtual {v1, p1}, Ld1/o;->a(Landroid/view/inputmethod/EditorInfo;)Ld1/p;

    move-result-object p1

    new-instance v1, La0/a1;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, La0/a1;-><init>(Ljava/lang/Object;I)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x22

    if-lt v2, v3, :cond_1

    new-instance v2, Lq3/p;

    invoke-direct {v2, p1, v1}, Lq3/o;-><init>(Ld1/p;La0/a1;)V

    goto :goto_0

    :cond_1
    new-instance v2, Lq3/o;

    invoke-direct {v2, p1, v1}, Lq3/o;-><init>(Ld1/p;La0/a1;)V

    :goto_0
    iget-object p1, p0, Lb3/i2;->d:Lr1/c;

    new-instance v1, La3/r2;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lr1/c;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lb3/i2;->e:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
