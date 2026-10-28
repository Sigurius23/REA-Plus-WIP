.class public Lcom/google/android/gms/location/ActivityRecognitionClient;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/h;"
    }
.end annotation


# static fields
.field public static final synthetic zza:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 1
    sget-object v3, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    sget-object v4, Lcom/google/android/gms/common/api/c;->g:Lcom/google/android/gms/common/api/b;

    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 3
    sget-object v3, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v2, 0x0

    .line 4
    sget-object v4, Lcom/google/android/gms/common/api/c;->g:Lcom/google/android/gms/common/api/b;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public removeActivityTransitionUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Ltp/p;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p1}, Ltp/p;-><init>(ILandroid/app/PendingIntent;)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    const/16 p1, 0x966

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public removeActivityUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Ltp/p;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ltp/p;-><init>(ILandroid/app/PendingIntent;)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    const/16 p1, 0x962

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public removeSleepSegmentUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Ltp/p;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p1}, Ltp/p;-><init>(ILandroid/app/PendingIntent;)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    const/16 p1, 0x96b

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public requestActivityTransitionUpdates(Ltp/d;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .param p1    # Ltp/d;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p2    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp/d;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getContextAttributionTag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ltp/d;->z:Ljava/lang/String;

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lpg3/p;

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-direct {v1, p1, p2, v3, v2}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    const/16 p1, 0x965

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public requestActivityUpdates(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p3    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lan/d;

    const/16 v2, 0xa

    invoke-direct {v1, p1, p2, p3, v2}, Lan/d;-><init>(JLjava/lang/Object;I)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    const/16 p1, 0x961

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public requestSleepSegmentUpdates(Landroid/app/PendingIntent;Ltp/n;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p2    # Ltp/n;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            "Ltp/n;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lt9/u;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Lt9/u;->w:Ljava/lang/Object;

    iput-object p2, v1, Lt9/u;->x:Ljava/lang/Object;

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    sget-object p1, Ltp/h;->b:Lcom/google/android/gms/common/c;

    filled-new-array {p1}, [Lcom/google/android/gms/common/c;

    move-result-object p1

    iput-object p1, v0, Le73/b;->c:Ljava/lang/Object;

    const/16 p1, 0x96a

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
