.class public abstract Lyj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lyj/b;->a:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static a(Landroid/app/Activity;Lek/d;Lfk/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/fragment/app/r0;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/r0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    new-instance v0, Lyj/a;

    invoke-direct {v0, p1, p2}, Lyj/a;-><init>(Lek/d;Lfk/a;)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/o1;->X(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V

    sget-object p1, Lyj/b;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, p0, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast p2, Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    const-string p0, "Activity is not a FragmentActivity"

    invoke-interface {p2, p0}, Lfk/a;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/app/Activity;Lfk/a;)V
    .locals 2

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/fragment/app/r0;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/r0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    sget-object p1, Lyj/b;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyj/a;

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->m0(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    const-string p0, "Activity is not a FragmentActivity"

    invoke-interface {p1, p0}, Lfk/a;->debug(Ljava/lang/String;)V

    return-void
.end method
