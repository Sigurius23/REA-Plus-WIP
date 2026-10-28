.class public final Lsr/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lsr/h;

.field public final b:Lsr/l;


# direct methods
.method public constructor <init>(Lsr/h;Lsr/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsr/b;->a:Lsr/h;

    iput-object p2, p0, Lsr/b;->b:Lsr/l;

    return-void
.end method


# virtual methods
.method public final a(Lsr/n;)Lcom/google/android/gms/tasks/Task;
    .locals 6

    iget-wide v3, p1, Lsr/n;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lsr/b;->a:Lsr/h;

    iget-object v2, v1, Lsr/h;->a:Lxr/t;

    const-string v5, "warmUpIntegrityToken(%s)"

    invoke-virtual {v2, v5, v0}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Lcq/i;

    invoke-direct {v2}, Lcq/i;-><init>()V

    new-instance v0, Lsr/d;

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lsr/d;-><init>(Lsr/h;Lcq/i;JLcq/i;)V

    iget-object v1, v1, Lsr/h;->e:Lxr/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lxr/v;

    invoke-direct {v3, v1, v2, v2, v0}, Lxr/v;-><init>(Lxr/b;Lcq/i;Lcq/i;Lsr/g;)V

    invoke-virtual {v1}, Lxr/b;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance v0, Ld1/j;

    const/16 v1, 0x1d

    invoke-direct {v0, v1, p0, p1}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v2, Lcq/i;->a:Lcq/u;

    invoke-virtual {p1, v0}, Lcq/u;->onSuccessTask(Lcq/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
