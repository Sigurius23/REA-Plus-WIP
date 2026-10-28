.class public final La13/b;
.super La13/a;
.source "SourceFile"

# interfaces
.implements La13/c;


# instance fields
.field public final w:Ll83/p;

.field public x:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Push:Default-NPH"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, La13/b;->w:Ll83/p;

    return-void
.end method


# virtual methods
.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, La13/a;->onActivityStarted(Landroid/app/Activity;)V

    iput-object p1, p0, La13/b;->x:Landroid/app/Activity;

    return-void
.end method

.method public final onLastActivityStopped(Landroid/app/Activity;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, La13/b;->x:Landroid/app/Activity;

    return-void
.end method

.method public final onPermissionDenied()V
    .locals 6

    iget-object v0, p0, La13/b;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, La13/b;->x:Landroid/app/Activity;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[onPermissionDenied] currentActivity: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, La13/b;->x:Landroid/app/Activity;

    if-eqz v0, :cond_1

    const v1, 0x7f140d9d

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_1
    return-void
.end method

.method public final onPermissionGranted()V
    .locals 0

    return-void
.end method

.method public final onPermissionRationale()V
    .locals 0

    return-void
.end method

.method public final onPermissionRequested()V
    .locals 0

    return-void
.end method
