.class public final Lcx/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lcx/j;


# direct methods
.method public constructor <init>(Lcx/j;)V
    .locals 0

    iput-object p1, p0, Lcx/h;->w:Lcx/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    const-string v3, "task"

    iget-object v4, p0, Lcx/h;->w:Lcx/j;

    if-lt v0, v1, :cond_5

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v4, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_0

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget-object v0, v4, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, v4, Lcx/j;->y:Lcx/b;

    if-eqz v1, :cond_3

    check-cast v1, Lcx/a;

    iget-object v1, v1, Lcx/a;->c:Lcx/c;

    const-string v2, "android.permission.MANAGE_EXTERNAL_STORAGE"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_0

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string v0, "pb"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    iget-object v0, v4, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_6

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method
