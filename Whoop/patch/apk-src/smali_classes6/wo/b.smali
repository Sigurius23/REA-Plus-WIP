.class public final Lwo/b;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldq/y;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ldq/y;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lwo/b;->a:Lcom/google/android/gms/common/api/f;

    return-void
.end method


# virtual methods
.method public final c(Luo/m;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    sget-object v1, Ljp/b;->a:Lcom/google/android/gms/common/c;

    filled-new-array {v1}, [Lcom/google/android/gms/common/c;

    move-result-object v1

    iput-object v1, v0, Le73/b;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, v0, Le73/b;->b:Z

    new-instance v1, Lty/c;

    const/16 v2, 0x15

    invoke-direct {v1, p1, v2}, Lty/c;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doBestEffortWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
