.class public final synthetic Lzt/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/b;


# instance fields
.field public final synthetic w:Landroid/content/Context;

.field public final synthetic x:Landroid/content/Intent;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/i;->w:Landroid/content/Context;

    iput-object p2, p0, Lzt/i;->x:Landroid/content/Intent;

    iput-boolean p3, p0, Lzt/i;->y:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x192

    if-eq v0, v1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lzt/i;->w:Landroid/content/Context;

    iget-object v0, p0, Lzt/i;->x:Landroid/content/Intent;

    iget-boolean v1, p0, Lzt/i;->y:Z

    invoke-static {p1, v0, v1}, Lzt/j;->a(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lm5/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm5/e;-><init>(I)V

    new-instance v1, Lux/f0;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lux/f0;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
