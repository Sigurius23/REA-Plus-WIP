.class public final Lzj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field public final w:Lek/d;

.field public final x:Lfk/a;

.field public final y:Ljava/util/List;

.field public final z:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lek/d;Lfk/a;Ljava/util/List;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewTargetLocators"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzj/b;->w:Lek/d;

    iput-object p3, p0, Lzj/b;->x:Lfk/a;

    iput-object p4, p0, Lzj/b;->y:Ljava/util/List;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lzj/b;->z:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const-string p1, "e2"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const-string p1, "e2"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 19

    move-object/from16 v1, p0

    const-string v0, "e"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lzj/b;->z:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Activity;

    const/4 v4, 0x0

    iget-object v7, v1, Lzj/b;->x:Lfk/a;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v8, Ll83/k;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v8, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "viewTargetLocators"

    iget-object v9, v1, Lzj/b;->y:Ljava/util/List;

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "logger"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lp33/m;

    const/4 v10, 0x0

    const/16 v11, 0xf

    invoke-direct/range {v5 .. v11}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object v2, Lq83/k;->w:Lq83/k;

    invoke-static {v2, v5}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxj/b;

    if-nez v2, :cond_1

    const-string v0, "Unable to find click target. No event captured."

    invoke-interface {v7, v0}, Lfk/a;->warn(Ljava/lang/String;)V

    return v4

    :cond_1
    new-instance v8, Ll83/k;

    const-string v3, "[Amplitude] Action"

    const-string v5, "touch"

    invoke-direct {v8, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v2, Lxj/b;->b:Ljava/lang/String;

    new-instance v9, Ll83/k;

    const-string v5, "[Amplitude] Target Class"

    invoke-direct {v9, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v2, Lxj/b;->c:Ljava/lang/String;

    new-instance v10, Ll83/k;

    const-string v5, "[Amplitude] Target Resource"

    invoke-direct {v10, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v2, Lxj/b;->d:Ljava/lang/String;

    new-instance v11, Ll83/k;

    const-string v5, "[Amplitude] Target Tag"

    invoke-direct {v11, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v2, Lxj/b;->e:Ljava/lang/String;

    new-instance v12, Ll83/k;

    const-string v5, "[Amplitude] Target Text"

    invoke-direct {v12, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v2, Lxj/b;->f:Ljava/lang/String;

    const-string v5, "_"

    const-string v6, " "

    invoke-static {v3, v5, v6, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v3, v5, v6}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/Iterable;

    sget-object v17, Lzj/a;->w:Lzj/a;

    const/16 v18, 0x1e

    const-string v14, " "

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    new-instance v13, Ll83/k;

    const-string v5, "[Amplitude] Target Source"

    invoke-direct {v13, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v2, Lxj/b;->g:Ljava/lang/String;

    new-instance v14, Ll83/k;

    const-string v3, "[Amplitude] Hierarchy"

    invoke-direct {v14, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    const/16 v5, 0x80

    invoke-virtual {v3, v0, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0, v3}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v3

    goto :goto_2

    :cond_4
    :goto_1
    if-eqz v0, :cond_5

    iget-object v2, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Error getting screen name: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lfk/a;->error(Ljava/lang/String;)V

    :cond_5
    :goto_2
    new-instance v15, Ll83/k;

    const-string v0, "[Amplitude] Screen Name"

    invoke-direct {v15, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v8 .. v15}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, v1, Lzj/b;->w:Lek/d;

    const-string v3, "[Amplitude] Element Interacted"

    invoke-virtual {v2, v3, v0}, Lek/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v4

    :cond_6
    :goto_3
    const-string v0, "DecorView is null in onSingleTapUp()"

    invoke-interface {v7, v0}, Lfk/a;->error(Ljava/lang/String;)V

    return v4
.end method
