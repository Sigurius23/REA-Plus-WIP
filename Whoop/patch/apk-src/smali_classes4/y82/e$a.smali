.class Ly82/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly82/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final w:Ly82/b;

.field private final x:Landroid/content/Context;

.field private final y:I


# direct methods
.method public constructor <init>(Ly82/b;Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly82/e$a;->w:Ly82/b;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ly82/e$a;->x:Landroid/content/Context;

    iput p3, p0, Ly82/e$a;->y:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Ly82/e;->a()Ltr2/n;

    move-result-object v0

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "WhoopActionScheduler:PreemptRunnable"

    if-eqz v0, :cond_0

    invoke-static {}, Ly82/e;->a()Ltr2/n;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Preempting job: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Ly82/e$a;->y:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3, v4}, Ltr2/n;->b(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-static {}, Ly82/e;->b()Ljava/util/HashMap;

    move-result-object v0

    iget v3, p0, Ly82/e$a;->y:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ly82/e$a;->x:Landroid/content/Context;

    iget v3, p0, Ly82/e$a;->y:I

    invoke-static {v0, v3}, Ly82/e;->c(Landroid/content/Context;I)V

    iget-object v0, p0, Ly82/e$a;->w:Ly82/b;

    iget-object v3, p0, Ly82/e$a;->x:Landroid/content/Context;

    invoke-virtual {v0, v3}, Ly82/b;->perform(Landroid/content/Context;)Ly82/b$t;

    move-result-object v0

    invoke-static {}, Ly82/e;->a()Ltr2/n;

    move-result-object v3

    invoke-interface {v3}, Ltr2/n;->w()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Ly82/e;->a()Ltr2/n;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Performed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Ly82/e$a;->w:Ly82/b;

    invoke-virtual {v5}, Ly82/b;->getActionString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " Result: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v3, v2, v0, v1}, Ltr2/n;->b(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    return-void
.end method
