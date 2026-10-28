.class public abstract Leb/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Ljava/util/LinkedHashMap;

.field public B:I

.field public final C:Ljava/util/ArrayList;

.field public final D:Ll83/p;

.field public final E:Lec3/w1;

.field public final F:Lec3/q1;

.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/Activity;

.field public c:Leb/r0;

.field public d:Landroid/os/Bundle;

.field public e:[Landroid/os/Parcelable;

.field public f:Z

.field public final g:Lm83/m;

.field public final h:Lec3/h2;

.field public final i:Lec3/r1;

.field public final j:Lec3/h2;

.field public final k:Lec3/r1;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/LinkedHashMap;

.field public final n:Ljava/util/LinkedHashMap;

.field public final o:Ljava/util/LinkedHashMap;

.field public p:Landroidx/lifecycle/g0;

.field public q:Leb/b0;

.field public final r:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public s:Landroidx/lifecycle/w;

.field public final t:Lb3/i3;

.field public final u:Leb/y;

.field public final v:Z

.field public final w:Leb/j1;

.field public final x:Ljava/util/LinkedHashMap;

.field public y:Lkotlin/jvm/internal/m;

.field public z:Leb/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/a0;->a:Landroid/content/Context;

    sget-object v0, Leb/c;->y:Leb/c;

    invoke-static {p1, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p1

    invoke-interface {p1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Leb/a0;->b:Landroid/app/Activity;

    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Leb/a0;->g:Lm83/m;

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Leb/a0;->h:Lec3/h2;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Leb/a0;->i:Lec3/r1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Leb/a0;->j:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Leb/a0;->k:Lec3/r1;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Leb/a0;->l:Ljava/util/LinkedHashMap;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Leb/a0;->m:Ljava/util/LinkedHashMap;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Leb/a0;->n:Ljava/util/LinkedHashMap;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Leb/a0;->o:Ljava/util/LinkedHashMap;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Leb/a0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object p1, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    iput-object p1, p0, Leb/a0;->s:Landroidx/lifecycle/w;

    new-instance p1, Lb3/i3;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lb3/i3;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Leb/a0;->t:Lb3/i3;

    new-instance p1, Leb/y;

    invoke-direct {p1, p0}, Leb/y;-><init>(Leb/a0;)V

    iput-object p1, p0, Leb/a0;->u:Leb/y;

    const/4 p1, 0x1

    iput-boolean p1, p0, Leb/a0;->v:Z

    new-instance v0, Leb/j1;

    invoke-direct {v0}, Leb/j1;-><init>()V

    iput-object v0, p0, Leb/a0;->w:Leb/j1;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Leb/a0;->x:Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Leb/a0;->A:Ljava/util/LinkedHashMap;

    new-instance v1, Leb/t0;

    invoke-direct {v1, v0}, Leb/t0;-><init>(Leb/j1;)V

    invoke-virtual {v0, v1}, Leb/j1;->a(Leb/i1;)V

    new-instance v1, Leb/d;

    iget-object v2, p0, Leb/a0;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Leb/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Leb/j1;->a(Leb/i1;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Leb/a0;->C:Ljava/util/ArrayList;

    new-instance v0, La3/l0;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Leb/a0;->D:Ll83/p;

    sget-object v0, Ldc3/a;->x:Ldc3/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Leb/a0;->E:Lec3/w1;

    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Leb/a0;->F:Lec3/q1;

    return-void
.end method

.method public static B(Leb/a0;Ljava/lang/String;Z)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Leb/a0;->D(Ljava/lang/String;ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Leb/a0;->c()Z

    :cond_0
    return-void
.end method

.method public static synthetic F(Leb/a0;Leb/q;)V
    .locals 2

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Leb/a0;->E(Leb/q;ZLm83/m;)V

    return-void
.end method

.method public static f(ILeb/n0;Leb/n0;Z)Leb/n0;
    .locals 2

    iget v0, p1, Leb/n0;->H:I

    if-ne v0, p0, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Leb/n0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Leb/n0;->x:Leb/r0;

    iget-object v1, p2, Leb/n0;->x:Leb/r0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-object p1

    :cond_1
    instance-of v0, p1, Leb/r0;

    if-eqz v0, :cond_2

    check-cast p1, Leb/r0;

    goto :goto_0

    :cond_2
    iget-object p1, p1, Leb/n0;->x:Leb/r0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1, p0, p1, p2, p3}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object p0

    return-object p0
.end method

.method public static y(Leb/a0;Ljava/lang/String;Leb/x0;I)V
    .locals 4

    and-int/lit8 p3, p3, 0x2

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move-object p2, v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "route"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Leb/a0;->c:Leb/r0;

    if-eqz p3, :cond_4

    iget-object p3, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {p0, p3}, Leb/a0;->n(Lm83/m;)Leb/r0;

    move-result-object p3

    const/4 v1, 0x1

    invoke-virtual {p3, p1, v1, p3}, Leb/r0;->u(Ljava/lang/String;ZLeb/r0;)Leb/l0;

    move-result-object p3

    if-eqz p3, :cond_3

    iget-object p1, p3, Leb/l0;->w:Leb/n0;

    iget-object p3, p3, Leb/l0;->x:Landroid/os/Bundle;

    invoke-virtual {p1, p3}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p3

    if-nez p3, :cond_1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_1
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    sget v2, Leb/n0;->K:I

    iget-object v2, p1, Leb/n0;->I:Ljava/lang/String;

    if-eqz v2, :cond_2

    const-string v3, "android-app://androidx.navigation/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v2, ""

    :goto_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->f(Landroid/net/Uri;)V

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, p1, p3, p2}, Leb/a0;->u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Navigation destination that matches route "

    const-string v0, " cannot be found in the navigation graph "

    invoke-static {p3, p1, v0}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p0, p0, Leb/a0;->c:Leb/r0;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Cannot navigate to "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Navigation graph has not been set for NavController "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A(IZ)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Leb/a0;->C(IZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Leb/a0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final C(IZZ)Z
    .locals 6

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->x:Leb/n0;

    iget-object v4, p0, Leb/a0;->w:Leb/j1;

    iget-object v5, v3, Leb/n0;->w:Ljava/lang/String;

    invoke-virtual {v4, v5}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v4

    if-nez p2, :cond_2

    iget v5, v3, Leb/n0;->H:I

    if-eq v5, p1, :cond_3

    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget v4, v3, Leb/n0;->H:I

    if-ne v4, p1, :cond_1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_5

    sget p2, Leb/n0;->K:I

    iget-object p2, p0, Leb/a0;->a:Landroid/content/Context;

    invoke-static {p2, p1}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Ignoring popBackStack to destination "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as it was not found on the current back stack"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NavController"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_5
    invoke-virtual {p0, v1, v3, p2, p3}, Leb/a0;->d(Ljava/util/ArrayList;Leb/n0;ZZ)Z

    move-result p1

    return p1
.end method

.method public final D(Ljava/lang/String;ZZ)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    iget-object v3, v0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    return v5

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Lm83/m;->a()I

    move-result v6

    invoke-virtual {v3, v6}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Leb/q;

    iget-object v9, v8, Leb/q;->x:Leb/n0;

    invoke-virtual {v8}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v10

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "route"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v9, Leb/n0;->I:Ljava/lang/String;

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const/4 v12, 0x1

    if-eqz v11, :cond_2

    :cond_1
    move/from16 v16, v5

    goto/16 :goto_9

    :cond_2
    invoke-virtual {v9, v1}, Leb/n0;->l(Ljava/lang/String;)Leb/l0;

    move-result-object v11

    if-eqz v11, :cond_3

    iget-object v13, v11, Leb/l0;->w:Leb/n0;

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {v9, v13}, Leb/n0;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    move v12, v5

    move/from16 v16, v12

    goto/16 :goto_9

    :cond_4
    iget-object v9, v11, Leb/l0;->x:Landroid/os/Bundle;

    if-eqz v10, :cond_5

    if-nez v9, :cond_6

    :cond_5
    :goto_2
    move/from16 v16, v5

    goto :goto_8

    :cond_6
    invoke-virtual {v9}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v13

    const-string v14, "matchingArgs.keySet()"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v10, v14}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_7

    goto :goto_2

    :cond_7
    iget-object v15, v11, Leb/l0;->w:Leb/n0;

    iget-object v15, v15, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-virtual {v15, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Leb/l;

    if-eqz v15, :cond_8

    iget-object v15, v15, Leb/l;->a:Leb/g1;

    :goto_4
    move/from16 v16, v5

    goto :goto_5

    :cond_8
    const/4 v15, 0x0

    goto :goto_4

    :goto_5
    const-string v5, "key"

    if-eqz v15, :cond_9

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15, v9, v14}, Leb/g1;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v7, v17

    goto :goto_6

    :cond_9
    const/4 v7, 0x0

    :goto_6
    if-eqz v15, :cond_a

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15, v10, v14}, Leb/g1;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_7

    :cond_a
    const/4 v5, 0x0

    :goto_7
    if-eqz v15, :cond_b

    invoke-virtual {v15, v7, v5}, Leb/g1;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_8

    :cond_b
    move/from16 v5, v16

    goto :goto_3

    :goto_8
    move/from16 v12, v16

    :goto_9
    if-nez v2, :cond_c

    if-nez v12, :cond_d

    :cond_c
    iget-object v5, v8, Leb/q;->x:Leb/n0;

    iget-object v5, v5, Leb/n0;->w:Ljava/lang/String;

    iget-object v7, v0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v7, v5}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    if-eqz v12, :cond_e

    goto :goto_a

    :cond_e
    move/from16 v5, v16

    goto/16 :goto_0

    :cond_f
    move/from16 v16, v5

    const/4 v6, 0x0

    :goto_a
    check-cast v6, Leb/q;

    if-eqz v6, :cond_10

    iget-object v7, v6, Leb/q;->x:Leb/n0;

    goto :goto_b

    :cond_10
    const/4 v7, 0x0

    :goto_b
    if-nez v7, :cond_11

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Ignoring popBackStack to route "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " as it was not found on the current back stack"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NavController"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v16

    :cond_11
    move/from16 v1, p3

    invoke-virtual {v0, v4, v7, v2, v1}, Leb/a0;->d(Ljava/util/ArrayList;Leb/n0;ZZ)Z

    move-result v1

    return v1
.end method

.method public final E(Leb/q;ZLm83/m;)V
    .locals 3

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v0}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    iget-object p1, v1, Leb/q;->x:Leb/n0;

    iget-object p1, p1, Leb/n0;->w:Ljava/lang/String;

    iget-object v0, p0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v0, p1}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object p1

    iget-object v0, p0, Leb/a0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/t;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p1, Leb/t;->f:Lec3/r1;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-eqz p1, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Leb/a0;->m:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object p1, v1, Leb/q;->H:Landroidx/lifecycle/i0;

    iget-object p1, p1, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v2, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_4

    if-eqz p2, :cond_2

    invoke-virtual {v1, v2}, Leb/q;->c(Landroidx/lifecycle/w;)V

    new-instance p1, Leb/r;

    invoke-direct {p1, v1}, Leb/r;-><init>(Leb/q;)V

    invoke-virtual {p3, p1}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    :cond_2
    if-nez v0, :cond_3

    sget-object p1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    invoke-virtual {v1, p1}, Leb/q;->c(Landroidx/lifecycle/w;)V

    invoke-virtual {p0, v1}, Leb/a0;->L(Leb/q;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1, v2}, Leb/q;->c(Landroidx/lifecycle/w;)V

    :cond_4
    :goto_1
    if-nez p2, :cond_5

    if-nez v0, :cond_5

    iget-object p1, p0, Leb/a0;->q:Leb/b0;

    if-eqz p1, :cond_5

    iget-object p2, v1, Leb/q;->F:Ljava/lang/String;

    const-string p3, "backStackEntryId"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Leb/b0;->w:Ljava/util/LinkedHashMap;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/e2;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroidx/lifecycle/e2;->a()V

    :cond_5
    return-void

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Attempted to pop "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Leb/q;->x:Leb/n0;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", which is not the top of the back stack ("

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v1, Leb/q;->x:Leb/n0;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final G()Ljava/util/ArrayList;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Leb/a0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/t;

    iget-object v2, v2, Leb/t;->f:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Leb/q;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v5, v5, Leb/q;->L:Landroidx/lifecycle/w;

    sget-object v6, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-ltz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v0, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Leb/q;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v4, v4, Leb/q;->L:Landroidx/lifecycle/w;

    sget-object v5, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-ltz v4, :cond_4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->x:Leb/n0;

    instance-of v3, v3, Leb/r0;

    if-nez v3, :cond_6

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    return-object v1
.end method

.method public final H(Landroid/os/Bundle;)V
    .locals 9

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Leb/a0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "android-support-nav:controller:navigatorState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Leb/a0;->d:Landroid/os/Bundle;

    const-string v0, "android-support-nav:controller:backStack"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Leb/a0;->e:[Landroid/os/Parcelable;

    iget-object v0, p0, Leb/a0;->o:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const-string v1, "android-support-nav:controller:backStackDestIds"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    const-string v2, "android-support-nav:controller:backStackIds"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_1

    aget v6, v1, v4

    add-int/lit8 v7, v5, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v8, p0, Leb/a0;->n:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v8, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    :cond_1
    const-string v1, "android-support-nav:controller:backStackStates"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android-support-nav:controller:backStackStates:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, "id"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lm83/m;

    array-length v5, v3

    invoke-direct {v4, v5}, Lm83/m;-><init>(I)V

    invoke-static {v3}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v3

    :goto_2
    invoke-virtual {v3}, La0/i1;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Parcelable;

    const-string v6, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Leb/r;

    invoke-virtual {v4, v5}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const-string v0, "android-support-nav:controller:deepLinkHandled"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Leb/a0;->f:Z

    return-void
.end method

.method public final I(ILandroid/os/Bundle;Leb/x0;)Z
    .locals 10

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Leb/a0;->n:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Leb/z;

    invoke-direct {v1, p1, v2}, Leb/z;-><init>(Ljava/lang/String;I)V

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lm83/s;->C0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z

    iget-object v0, p0, Leb/a0;->o:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm83/m;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    if-eqz v0, :cond_1

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Leb/a0;->k()Leb/r0;

    move-result-object v0

    :cond_2
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/r;

    iget v4, v3, Leb/r;->x:I

    invoke-static {v4, v0, v1, v2}, Leb/a0;->f(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v4

    iget-object v6, p0, Leb/a0;->a:Landroid/content/Context;

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v0

    iget-object v7, p0, Leb/a0;->q:Leb/b0;

    invoke-virtual {v3, v6, v4, v0, v7}, Leb/r;->b(Landroid/content/Context;Leb/n0;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v4

    goto :goto_0

    :cond_3
    sget p1, Leb/n0;->K:I

    iget p1, v3, Leb/r;->x:I

    invoke-static {v6, p1}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Restore State failed: destination "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be found from the current destination "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Leb/q;

    iget-object v4, v4, Leb/q;->x:Leb/n0;

    instance-of v4, v4, Leb/r0;

    if-nez v4, :cond_5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_7

    invoke-static {v3}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    if-eqz v4, :cond_7

    iget-object v4, v4, Leb/q;->x:Leb/n0;

    if-eqz v4, :cond_7

    iget-object v4, v4, Leb/n0;->w:Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v4, v1

    :goto_3
    iget-object v6, v2, Leb/q;->x:Leb/n0;

    iget-object v6, v6, Leb/n0;->w:Ljava/lang/String;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    filled-new-array {v2}, [Leb/q;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    new-instance v4, Lkotlin/jvm/internal/b0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    iget-object v2, v2, Leb/n0;->w:Ljava/lang/String;

    iget-object v3, p0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v3, v2}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v2

    new-instance v6, Lkotlin/jvm/internal/e0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lc4/k;

    const/4 v9, 0x1

    move-object v7, p0

    move-object v8, p2

    invoke-direct/range {v3 .. v9}, Lc4/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v3, v7, Leb/a0;->y:Lkotlin/jvm/internal/m;

    invoke-virtual {v2, v0, p3}, Leb/i1;->d(Ljava/util/List;Leb/x0;)V

    iput-object v1, v7, Leb/a0;->y:Lkotlin/jvm/internal/m;

    goto :goto_4

    :cond_a
    move-object v7, p0

    iget-boolean p1, v4, Lkotlin/jvm/internal/b0;->w:Z

    return p1
.end method

.method public final J()Landroid/os/Bundle;
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Leb/a0;->w:Leb/j1;

    iget-object v2, v2, Leb/j1;->a:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/i1;

    invoke-virtual {v3}, Leb/i1;->h()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v4, "android-support-nav:controller:navigatorState:names"

    invoke-virtual {v1, v4, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "android-support-nav:controller:navigatorState"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    const/4 v4, 0x0

    if-nez v1, :cond_5

    if-nez v2, :cond_3

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_3
    iget v1, v0, Lm83/m;->y:I

    new-array v1, v1, [Landroid/os/Parcelable;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v5, v4

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leb/q;

    add-int/lit8 v7, v5, 0x1

    new-instance v8, Leb/r;

    invoke-direct {v8, v6}, Leb/r;-><init>(Leb/q;)V

    aput-object v8, v1, v5

    move v5, v7

    goto :goto_2

    :cond_4
    const-string v0, "android-support-nav:controller:backStack"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_5
    iget-object v0, p0, Leb/a0;->n:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    if-nez v2, :cond_6

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_6
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [I

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v6, v4

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    add-int/lit8 v9, v6, 0x1

    aput v8, v1, v6

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v9

    goto :goto_3

    :cond_7
    const-string v0, "android-support-nav:controller:backStackDestIds"

    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "android-support-nav:controller:backStackIds"

    invoke-virtual {v2, v0, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_8
    iget-object v0, p0, Leb/a0;->o:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    if-nez v2, :cond_9

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm83/m;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v7, v5, Lm83/m;->y:I

    new-array v7, v7, [Landroid/os/Parcelable;

    invoke-virtual {v5}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v8, v4

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    if-ltz v8, :cond_a

    check-cast v9, Leb/r;

    aput-object v9, v7, v8

    move v8, v10

    goto :goto_5

    :cond_a
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_b
    const-string v5, "android-support-nav:controller:backStackStates:"

    invoke-static {v5, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v7}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_4

    :cond_c
    const-string v0, "android-support-nav:controller:backStackStates"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_d
    iget-boolean v0, p0, Leb/a0;->f:Z

    if-eqz v0, :cond_f

    if-nez v2, :cond_e

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_e
    const-string v0, "android-support-nav:controller:deepLinkHandled"

    iget-boolean v1, p0, Leb/a0;->f:Z

    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_f
    return-object v2
.end method

.method public final K(Leb/r0;Landroid/os/Bundle;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "graph"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Leb/r0;->L:La0/g1;

    iget-object v3, v1, Leb/a0;->g:Lm83/m;

    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v4

    sget-object v5, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v4, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v4, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v12, 0x0

    if-nez v4, :cond_31

    iget-object v2, v1, Leb/a0;->c:Leb/r0;

    const/4 v4, 0x0

    iget-object v6, v1, Leb/a0;->x:Ljava/util/LinkedHashMap;

    const/4 v7, 0x1

    if-eqz v2, :cond_6

    new-instance v8, Ljava/util/ArrayList;

    iget-object v9, v1, Leb/a0;->n:Ljava/util/LinkedHashMap;

    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    const-string v10, "id"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Leb/t;

    iput-boolean v7, v11, Leb/t;->d:Z

    goto :goto_2

    :cond_3
    sget-object v10, Leb/v;->x:Leb/v;

    invoke-static {v10}, Lse/h;->P(Lkotlin/jvm/functions/Function1;)Leb/x0;

    move-result-object v10

    invoke-virtual {v1, v9, v5, v10}, Leb/a0;->I(ILandroid/os/Bundle;Leb/x0;)Z

    move-result v10

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Leb/t;

    iput-boolean v12, v13, Leb/t;->d:Z

    goto :goto_3

    :cond_4
    if-eqz v10, :cond_2

    invoke-virtual {v1, v9, v7, v12}, Leb/a0;->C(IZZ)Z

    move-result v9

    goto :goto_1

    :cond_5
    iget v2, v2, Leb/n0;->H:I

    invoke-virtual {v1, v2, v7, v4}, Leb/a0;->C(IZZ)Z

    :cond_6
    iput-object v0, v1, Leb/a0;->c:Leb/r0;

    iget-object v0, v1, Leb/a0;->d:Landroid/os/Bundle;

    iget-object v2, v1, Leb/a0;->w:Leb/j1;

    if-eqz v0, :cond_8

    const-string v8, "android-support-nav:controller:navigatorState:names"

    invoke-virtual {v0, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_7
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, "name"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v10

    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v10, v9}, Leb/i1;->g(Landroid/os/Bundle;)V

    goto :goto_4

    :cond_8
    iget-object v0, v1, Leb/a0;->e:[Landroid/os/Parcelable;

    const-string v8, " cannot be found from the current destination "

    iget-object v9, v1, Leb/a0;->a:Landroid/content/Context;

    if-eqz v0, :cond_d

    array-length v10, v0

    move v11, v12

    :goto_5
    if-ge v11, v10, :cond_c

    aget-object v13, v0, v11

    const-string v14, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Leb/r;

    iget v14, v13, Leb/r;->x:I

    invoke-virtual {v1, v14, v5}, Leb/a0;->e(ILeb/n0;)Leb/n0;

    move-result-object v15

    if-eqz v15, :cond_b

    invoke-virtual {v1}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v14

    iget-object v4, v1, Leb/a0;->q:Leb/b0;

    invoke-virtual {v13, v9, v15, v14, v4}, Leb/r;->b(Landroid/content/Context;Leb/n0;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v4

    iget-object v13, v15, Leb/n0;->w:Ljava/lang/String;

    invoke-virtual {v2, v13}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_9

    new-instance v14, Leb/t;

    invoke-direct {v14, v1, v13}, Leb/t;-><init>(Leb/a0;Leb/i1;)V

    invoke-interface {v6, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    check-cast v14, Leb/t;

    invoke-virtual {v3, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    invoke-virtual {v14, v4}, Leb/t;->a(Leb/q;)V

    iget-object v13, v4, Leb/q;->x:Leb/n0;

    iget-object v13, v13, Leb/n0;->x:Leb/r0;

    if-eqz v13, :cond_a

    iget v13, v13, Leb/n0;->H:I

    invoke-virtual {v1, v13}, Leb/a0;->g(I)Leb/q;

    move-result-object v13

    invoke-virtual {v1, v4, v13}, Leb/a0;->o(Leb/q;Leb/q;)V

    :cond_a
    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x0

    goto :goto_5

    :cond_b
    sget v0, Leb/n0;->K:I

    invoke-static {v9, v14}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Restoring the Navigation back stack failed: destination "

    invoke-static {v3, v0, v8}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c
    invoke-virtual {v1}, Leb/a0;->N()V

    iput-object v5, v1, Leb/a0;->e:[Landroid/os/Parcelable;

    :cond_d
    iget-object v0, v2, Leb/j1;->a:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Leb/i1;

    iget-boolean v10, v10, Leb/i1;->b:Z

    if-nez v10, :cond_e

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/i1;

    invoke-virtual {v6, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_10

    new-instance v4, Leb/t;

    invoke-direct {v4, v1, v2}, Leb/t;-><init>(Leb/a0;Leb/i1;)V

    invoke-interface {v6, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    check-cast v4, Leb/t;

    invoke-virtual {v2, v4}, Leb/i1;->e(Leb/t;)V

    goto :goto_7

    :cond_11
    iget-object v0, v1, Leb/a0;->c:Leb/r0;

    if-eqz v0, :cond_30

    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_30

    iget-boolean v0, v1, Leb/a0;->f:Z

    if-nez v0, :cond_2f

    iget-object v2, v1, Leb/a0;->b:Landroid/app/Activity;

    if-eqz v2, :cond_2f

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    if-nez v4, :cond_12

    goto/16 :goto_15

    :cond_12
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    const-string v10, "NavController"

    if-eqz v6, :cond_13

    :try_start_0
    const-string v0, "android-support-nav:controller:deepLinkIds"

    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "handleDeepLink() could not extract deepLink from "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_13
    move-object v0, v5

    :goto_8
    if-eqz v6, :cond_14

    const-string v11, "android-support-nav:controller:deepLinkArgs"

    invoke-virtual {v6, v11}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    goto :goto_9

    :cond_14
    move-object v11, v5

    :goto_9
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    if-eqz v6, :cond_15

    const-string v14, "android-support-nav:controller:deepLinkExtras"

    invoke-virtual {v6, v14}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    goto :goto_a

    :cond_15
    move-object v6, v5

    :goto_a
    if-eqz v6, :cond_16

    invoke-virtual {v13, v6}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_16
    if-eqz v0, :cond_17

    array-length v6, v0

    if-nez v6, :cond_19

    :cond_17
    invoke-virtual {v1, v3}, Leb/a0;->n(Lm83/m;)Leb/r0;

    move-result-object v6

    new-instance v14, Leb/k0;

    invoke-direct {v14, v4}, Leb/k0;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v6, v14, v7, v6}, Leb/r0;->t(Leb/k0;ZLeb/r0;)Leb/l0;

    move-result-object v6

    if-eqz v6, :cond_19

    iget-object v0, v6, Leb/l0;->w:Leb/n0;

    invoke-virtual {v0, v5}, Leb/n0;->d(Leb/n0;)[I

    move-result-object v11

    iget-object v6, v6, Leb/l0;->x:Landroid/os/Bundle;

    invoke-virtual {v0, v6}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v13, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_18
    move-object v0, v11

    move-object v11, v5

    :cond_19
    if-eqz v0, :cond_2f

    array-length v6, v0

    if-nez v6, :cond_1a

    goto/16 :goto_15

    :cond_1a
    iget-object v6, v1, Leb/a0;->c:Leb/r0;

    array-length v14, v0

    move v15, v12

    :goto_b
    if-ge v15, v14, :cond_20

    move/from16 v17, v7

    aget v7, v0, v15

    if-nez v15, :cond_1c

    iget-object v5, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v5, v5, Leb/n0;->H:I

    if-ne v5, v7, :cond_1b

    iget-object v5, v1, Leb/a0;->c:Leb/r0;

    goto :goto_c

    :cond_1b
    const/4 v5, 0x0

    goto :goto_c

    :cond_1c
    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-virtual {v6, v7, v6, v5, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v18

    move-object/from16 v5, v18

    :goto_c
    if-nez v5, :cond_1d

    sget v5, Leb/n0;->K:I

    invoke-static {v9, v7}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_e

    :cond_1d
    array-length v7, v0

    add-int/lit8 v7, v7, -0x1

    if-eq v15, v7, :cond_1f

    instance-of v7, v5, Leb/r0;

    if-eqz v7, :cond_1f

    check-cast v5, Leb/r0;

    :goto_d
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v6, v5, Leb/r0;->M:I

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v5, v7, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v6

    instance-of v6, v6, Leb/r0;

    if-eqz v6, :cond_1e

    iget v6, v5, Leb/r0;->M:I

    invoke-virtual {v5, v6, v5, v7, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v5

    check-cast v5, Leb/r0;

    goto :goto_d

    :cond_1e
    move-object v6, v5

    :cond_1f
    add-int/lit8 v15, v15, 0x1

    move/from16 v7, v17

    const/4 v5, 0x0

    goto :goto_b

    :cond_20
    move/from16 v17, v7

    const/4 v5, 0x0

    :goto_e
    if-eqz v5, :cond_21

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Could not find destination "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in the navigation graph, ignoring the deep link from "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_15

    :cond_21
    const-string v5, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {v13, v5, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    array-length v5, v0

    new-array v6, v5, [Landroid/os/Bundle;

    move v7, v12

    :goto_f
    if-ge v7, v5, :cond_23

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v10, v13}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    if-eqz v11, :cond_22

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/os/Bundle;

    if-eqz v14, :cond_22

    invoke-virtual {v10, v14}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_22
    aput-object v10, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_f

    :cond_23
    invoke-virtual {v4}, Landroid/content/Intent;->getFlags()I

    move-result v5

    const/high16 v7, 0x10000000

    and-int/2addr v7, v5

    if-eqz v7, :cond_24

    const v10, 0x8000

    and-int/2addr v5, v10

    if-nez v5, :cond_24

    invoke-virtual {v4, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v9}, Landroidx/core/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/core/app/TaskStackBuilder;->addNextIntentWithParentStack(Landroid/content/Intent;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    const-string v3, "create(context).addNextI\u2026ntWithParentStack(intent)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/core/app/TaskStackBuilder;->startActivities()V

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    invoke-virtual {v2, v12, v12}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_19

    :cond_24
    const-string v2, "Deep Linking failed: destination "

    if-eqz v7, :cond_28

    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_25

    iget-object v3, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v3, Leb/n0;->H:I

    move/from16 v5, v17

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v5, v4}, Leb/a0;->C(IZZ)Z

    :cond_25
    :goto_10
    array-length v3, v0

    if-ge v12, v3, :cond_27

    aget v3, v0, v12

    add-int/lit8 v4, v12, 0x1

    aget-object v5, v6, v12

    const/4 v7, 0x0

    invoke-virtual {v1, v3, v7}, Leb/a0;->e(ILeb/n0;)Leb/n0;

    move-result-object v10

    if-eqz v10, :cond_26

    new-instance v3, Lb2/z;

    const/4 v7, 0x7

    invoke-direct {v3, v7, v10, v1}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lse/h;->P(Lkotlin/jvm/functions/Function1;)Leb/x0;

    move-result-object v3

    invoke-virtual {v1, v10, v5, v3}, Leb/a0;->u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V

    move v12, v4

    goto :goto_10

    :cond_26
    sget v0, Leb/n0;->K:I

    invoke-static {v9, v3}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-static {v2, v0, v8}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Leb/a0;->i()Leb/n0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_27
    const/4 v5, 0x1

    iput-boolean v5, v1, Leb/a0;->f:Z

    goto/16 :goto_19

    :cond_28
    iget-object v3, v1, Leb/a0;->c:Leb/r0;

    array-length v4, v0

    move v5, v12

    :goto_11
    if-ge v5, v4, :cond_2e

    aget v7, v0, v5

    aget-object v8, v6, v5

    if-nez v5, :cond_29

    iget-object v10, v1, Leb/a0;->c:Leb/r0;

    goto :goto_12

    :cond_29
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v10, 0x0

    invoke-virtual {v3, v7, v3, v10, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v11

    move-object v10, v11

    :goto_12
    if-eqz v10, :cond_2d

    array-length v7, v0

    const/16 v17, 0x1

    add-int/lit8 v7, v7, -0x1

    if-eq v5, v7, :cond_2c

    instance-of v7, v10, Leb/r0;

    if-eqz v7, :cond_2b

    check-cast v10, Leb/r0;

    :goto_13
    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v10, Leb/r0;->M:I

    const/4 v7, 0x0

    invoke-virtual {v10, v3, v10, v7, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v3

    instance-of v3, v3, Leb/r0;

    if-eqz v3, :cond_2a

    iget v3, v10, Leb/r0;->M:I

    invoke-virtual {v10, v3, v10, v7, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Leb/r0;

    goto :goto_13

    :cond_2a
    move-object/from16 p1, v0

    move/from16 v17, v4

    move/from16 v18, v5

    move-object/from16 v16, v6

    move-object v5, v9

    move-object v3, v10

    goto :goto_14

    :cond_2b
    move-object/from16 p1, v0

    move/from16 v17, v4

    move/from16 v18, v5

    move-object/from16 v16, v6

    move-object v5, v9

    goto :goto_14

    :cond_2c
    iget-object v7, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v7, v7, Leb/n0;->H:I

    move-object v11, v6

    new-instance v6, Leb/x0;

    move-object v13, v9

    move v9, v7

    const/4 v7, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    move-object v15, v10

    const/4 v10, 0x1

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v18, v14

    const/4 v14, -0x1

    move-object/from16 v19, v13

    move v13, v12

    move-object/from16 v20, v15

    move v15, v14

    move-object/from16 p1, v0

    move/from16 v17, v4

    move-object/from16 v0, v18

    move-object/from16 v4, v20

    move/from16 v18, v5

    move-object/from16 v5, v19

    invoke-direct/range {v6 .. v15}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-virtual {v1, v4, v0, v6}, Leb/a0;->u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V

    :goto_14
    add-int/lit8 v0, v18, 0x1

    move-object v9, v5

    move-object/from16 v6, v16

    move/from16 v4, v17

    move v5, v0

    move-object/from16 v0, p1

    goto/16 :goto_11

    :cond_2d
    move-object v5, v9

    sget v0, Leb/n0;->K:I

    invoke-static {v5, v7}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " cannot be found in graph "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_2e
    const/4 v5, 0x1

    iput-boolean v5, v1, Leb/a0;->f:Z

    goto/16 :goto_19

    :cond_2f
    :goto_15
    iget-object v0, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    const/4 v7, 0x0

    invoke-virtual {v1, v0, v2, v7}, Leb/a0;->u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V

    goto/16 :goto_19

    :cond_30
    invoke-virtual {v1}, Leb/a0;->c()Z

    return-void

    :cond_31
    invoke-virtual {v2}, La0/g1;->g()I

    move-result v4

    move v5, v12

    :goto_16
    if-ge v5, v4, :cond_34

    invoke-virtual {v2, v5}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leb/n0;

    iget-object v7, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v7, Leb/r0;->L:La0/g1;

    invoke-virtual {v7, v5}, La0/g1;->e(I)I

    move-result v7

    iget-object v8, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, v8, Leb/r0;->L:La0/g1;

    iget-boolean v9, v8, La0/g1;->w:Z

    if-eqz v9, :cond_32

    invoke-static {v8}, La0/z;->a(La0/g1;)V

    :cond_32
    iget-object v9, v8, La0/g1;->x:[I

    iget v10, v8, La0/g1;->z:I

    invoke-static {v10, v7, v9}, Lb0/a;->a(II[I)I

    move-result v7

    if-ltz v7, :cond_33

    iget-object v8, v8, La0/g1;->y:[Ljava/lang/Object;

    aget-object v9, v8, v7

    aput-object v6, v8, v7

    :cond_33
    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    :cond_34
    invoke-virtual {v3}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_38

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    sget v4, Leb/n0;->K:I

    iget-object v4, v3, Leb/q;->x:Leb/n0;

    invoke-static {v4}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v4

    invoke-static {v4}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object v4

    iget-object v5, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm83/j0;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_18
    move-object v6, v4

    check-cast v6, Lm83/h0;

    invoke-virtual {v6}, Lm83/h0;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_37

    invoke-virtual {v6}, Lm83/h0;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leb/n0;

    iget-object v7, v1, Leb/a0;->c:Leb/r0;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_36

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_36

    :cond_35
    const/4 v7, 0x0

    goto :goto_18

    :cond_36
    instance-of v7, v5, Leb/r0;

    if-eqz v7, :cond_35

    check-cast v5, Leb/r0;

    iget v6, v6, Leb/n0;->H:I

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v5, v7, v12}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_18

    :cond_37
    const/4 v7, 0x0

    const-string v4, "<set-?>"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v3, Leb/q;->x:Leb/n0;

    goto :goto_17

    :cond_38
    :goto_19
    return-void
.end method

.method public final L(Leb/q;)V
    .locals 3

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/a0;->l:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/q;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Leb/a0;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p1, Leb/q;->x:Leb/n0;

    iget-object v1, v1, Leb/n0;->w:Ljava/lang/String;

    iget-object v2, p0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v2, v1}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v1

    iget-object v2, p0, Leb/a0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/t;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Leb/t;->b(Leb/q;)V

    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_1
    return-void
.end method

.method public final M()V
    .locals 12

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v1, v1, Leb/q;->x:Leb/n0;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    instance-of v3, v1, Leb/e;

    if-eqz v3, :cond_2

    invoke-static {v0}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    iget-object v4, v4, Leb/q;->x:Leb/n0;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    instance-of v5, v4, Leb/e;

    if-nez v5, :cond_1

    instance-of v4, v4, Leb/r0;

    if-nez v4, :cond_1

    :cond_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/q;

    iget-object v6, v5, Leb/q;->L:Landroidx/lifecycle/w;

    iget-object v7, v5, Leb/q;->x:Leb/n0;

    const-string v8, "List is empty."

    const/4 v9, 0x0

    if-eqz v1, :cond_a

    iget v10, v7, Leb/n0;->H:I

    iget v11, v1, Leb/n0;->H:I

    if-ne v10, v11, :cond_a

    sget-object v10, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    if-eq v6, v10, :cond_7

    iget-object v6, p0, Leb/a0;->w:Leb/j1;

    iget-object v11, v7, Leb/n0;->w:Ljava/lang/String;

    invoke-virtual {v6, v11}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v6

    iget-object v11, p0, Leb/a0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v11, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leb/t;

    if-eqz v6, :cond_4

    iget-object v6, v6, Leb/t;->f:Lec3/r1;

    if-eqz v6, :cond_4

    iget-object v6, v6, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    if-eqz v6, :cond_4

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    iget-object v6, p0, Leb/a0;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v3, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    :goto_2
    sget-object v6, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_3
    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/n0;

    if-eqz v5, :cond_9

    iget v5, v5, Leb/n0;->H:I

    iget v6, v7, Leb/n0;->H:I

    if-ne v5, v6, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v8}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_4
    iget-object v1, v1, Leb/n0;->x:Leb/r0;

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_e

    iget v7, v7, Leb/n0;->H:I

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Leb/n0;

    iget v10, v10, Leb/n0;->H:I

    if-ne v7, v10, :cond_e

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Leb/n0;

    sget-object v8, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    if-ne v6, v8, :cond_b

    sget-object v6, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v5, v6}, Leb/q;->c(Landroidx/lifecycle/w;)V

    goto :goto_5

    :cond_b
    sget-object v8, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    if-eq v6, v8, :cond_c

    invoke-virtual {v3, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    :goto_5
    iget-object v5, v7, Leb/n0;->x:Leb/r0;

    if-eqz v5, :cond_3

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_d
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v8}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    sget-object v6, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {v5, v6}, Leb/q;->c(Landroidx/lifecycle/w;)V

    goto/16 :goto_0

    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/w;

    if-eqz v2, :cond_10

    invoke-virtual {v1, v2}, Leb/q;->c(Landroidx/lifecycle/w;)V

    goto :goto_6

    :cond_10
    invoke-virtual {v1}, Leb/q;->d()V

    goto :goto_6

    :cond_11
    :goto_7
    return-void
.end method

.method public final N()V
    .locals 2

    iget-boolean v0, p0, Leb/a0;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Leb/a0;->j()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Leb/a0;->u:Leb/y;

    invoke-virtual {v0, v1}, Lg/t;->j(Z)V

    return-void
.end method

.method public final a(Leb/n0;Landroid/os/Bundle;Leb/q;Ljava/util/List;)V
    .locals 11

    iget-object v0, p3, Leb/q;->x:Leb/n0;

    instance-of v1, v0, Leb/e;

    const/4 v2, 0x1

    iget-object v3, p0, Leb/a0;->g:Lm83/m;

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v1, v1, Leb/q;->x:Leb/n0;

    instance-of v1, v1, Leb/e;

    if-eqz v1, :cond_1

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v1, v1, Leb/q;->x:Leb/n0;

    iget v1, v1, Leb/n0;->H:I

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v2, v4}, Leb/a0;->C(IZZ)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    new-instance v1, Lm83/m;

    invoke-direct {v1}, Lm83/m;-><init>()V

    instance-of v4, p1, Leb/r0;

    iget-object v5, p0, Leb/a0;->a:Landroid/content/Context;

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    move-object v4, v0

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v4, Leb/n0;->x:Leb/r0;

    if-eqz v4, :cond_6

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {p4, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v7

    :cond_3
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Leb/q;

    iget-object v9, v9, Leb/q;->x:Leb/n0;

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_0

    :cond_4
    move-object v8, v6

    :goto_0
    check-cast v8, Leb/q;

    if-nez v8, :cond_5

    invoke-virtual {p0}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v7

    iget-object v8, p0, Leb/a0;->q:Leb/b0;

    invoke-static {v5, v4, p2, v7, v8}, Lio/sentry/hints/j;->o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v8

    :cond_5
    invoke-virtual {v1, v8}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Leb/q;

    iget-object v7, v7, Leb/q;->x:Leb/n0;

    if-ne v7, v4, :cond_6

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Leb/q;

    invoke-static {p0, v7}, Leb/a0;->F(Leb/a0;Leb/q;)V

    :cond_6
    if-eqz v4, :cond_7

    if-ne v4, p1, :cond_2

    :cond_7
    invoke-virtual {v1}, Lm83/m;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_8

    move-object v4, v0

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    iget-object v4, v4, Leb/q;->x:Leb/n0;

    :cond_9
    :goto_1
    if-eqz v4, :cond_e

    iget v7, v4, Leb/n0;->H:I

    invoke-virtual {p0, v7, v4}, Leb/a0;->e(ILeb/n0;)Leb/n0;

    move-result-object v7

    if-eq v7, v4, :cond_e

    iget-object v4, v4, Leb/n0;->x:Leb/r0;

    if-eqz v4, :cond_9

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v7

    if-ne v7, v2, :cond_a

    move-object v7, v6

    goto :goto_2

    :cond_a
    move-object v7, p2

    :goto_2
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v8

    invoke-interface {p4, v8}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v8

    :cond_b
    invoke-interface {v8}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v8}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Leb/q;

    iget-object v10, v10, Leb/q;->x:Leb/n0;

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    goto :goto_3

    :cond_c
    move-object v9, v6

    :goto_3
    check-cast v9, Leb/q;

    if-nez v9, :cond_d

    invoke-virtual {v4, v7}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual {p0}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v8

    iget-object v9, p0, Leb/a0;->q:Leb/b0;

    invoke-static {v5, v4, v7, v8, v9}, Lio/sentry/hints/j;->o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v9

    :cond_d
    invoke-virtual {v1, v9}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    goto :goto_1

    :cond_e
    invoke-virtual {v1}, Lm83/m;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_4

    :cond_f
    invoke-virtual {v1}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    :goto_4
    invoke-virtual {v3}, Lm83/m;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    instance-of v2, v2, Leb/r0;

    if-eqz v2, :cond_10

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    const-string v4, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Leb/r0;

    iget-object v2, v2, Leb/r0;->L:La0/g1;

    iget v4, v0, Leb/n0;->H:I

    invoke-virtual {v2, v4}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_10

    invoke-virtual {v3}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    invoke-static {p0, v2}, Leb/a0;->F(Leb/a0;Leb/q;)V

    goto :goto_4

    :cond_10
    invoke-virtual {v3}, Lm83/m;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    if-nez v0, :cond_11

    invoke-virtual {v1}, Lm83/m;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    :cond_11
    if-eqz v0, :cond_12

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    goto :goto_5

    :cond_12
    move-object v0, v6

    :goto_5
    iget-object v2, p0, Leb/a0;->c:Leb/r0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p4

    :cond_13
    invoke-interface {p4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    iget-object v4, p0, Leb/a0;->c:Leb/r0;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    move-object v6, v0

    :cond_14
    check-cast v6, Leb/q;

    if-nez v6, :cond_15

    iget-object p4, p0, Leb/a0;->c:Leb/r0;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Leb/a0;->c:Leb/r0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v0

    iget-object v2, p0, Leb/a0;->q:Leb/b0;

    invoke-static {v5, p4, p2, v0, v2}, Lio/sentry/hints/j;->o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v6

    :cond_15
    invoke-virtual {v1, v6}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    :cond_16
    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_18

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Leb/q;

    iget-object v0, p4, Leb/q;->x:Leb/n0;

    iget-object v0, v0, Leb/n0;->w:Ljava/lang/String;

    iget-object v2, p0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v2, v0}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v0

    iget-object v2, p0, Leb/a0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_17

    check-cast v0, Leb/t;

    invoke-virtual {v0, p4}, Leb/t;->a(Leb/q;)V

    goto :goto_6

    :cond_17
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "NavigatorBackStack for "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Leb/n0;->w:Ljava/lang/String;

    const-string p3, " should already be created"

    invoke-static {p1, p3, p2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_18
    invoke-virtual {v3, v1}, Lm83/m;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3, p3}, Lm83/m;->addLast(Ljava/lang/Object;)V

    invoke-static {p3, v1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_19
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/q;

    iget-object p3, p2, Leb/q;->x:Leb/n0;

    iget-object p3, p3, Leb/n0;->x:Leb/r0;

    if-eqz p3, :cond_19

    iget p3, p3, Leb/n0;->H:I

    invoke-virtual {p0, p3}, Leb/a0;->g(I)Leb/q;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Leb/a0;->o(Leb/q;Leb/q;)V

    goto :goto_7

    :cond_1a
    return-void
.end method

.method public final b(Leb/u;)V
    .locals 2

    iget-object v0, p0, Leb/a0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v1, v0, Leb/q;->x:Leb/n0;

    invoke-virtual {v0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, p0, v1, v0}, Leb/u;->a(Leb/a0;Leb/n0;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 9

    :goto_0
    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v1, v1, Leb/q;->x:Leb/n0;

    instance-of v1, v1, Leb/r0;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    invoke-static {p0, v0}, Leb/a0;->F(Leb/a0;Leb/q;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v2, p0, Leb/a0;->C:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v3, p0, Leb/a0;->B:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, Leb/a0;->B:I

    invoke-virtual {p0}, Leb/a0;->M()V

    iget v3, p0, Leb/a0;->B:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Leb/a0;->B:I

    if-nez v3, :cond_4

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    iget-object v5, p0, Leb/a0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leb/u;

    iget-object v7, v3, Leb/q;->x:Leb/n0;

    invoke-virtual {v3}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v8

    invoke-interface {v6, p0, v7, v8}, Leb/u;->a(Leb/a0;Leb/n0;Landroid/os/Bundle;)V

    goto :goto_2

    :cond_2
    iget-object v5, p0, Leb/a0;->E:Lec3/w1;

    invoke-virtual {v5, v3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Leb/a0;->h:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p0}, Leb/a0;->G()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Leb/a0;->j:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v3, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    if-eqz v1, :cond_5

    return v4

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public final d(Ljava/util/ArrayList;Leb/n0;ZZ)Z
    .locals 9

    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lm83/m;

    invoke-direct {v5}, Lm83/m;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Leb/i1;

    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Leb/q;

    new-instance v0, Leb/w;

    move-object v3, p0

    move v4, p4

    invoke-direct/range {v0 .. v5}, Leb/w;-><init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/internal/b0;Leb/a0;ZLm83/m;)V

    iput-object v0, v3, Leb/a0;->z:Leb/w;

    invoke-virtual {v7, v8, v4}, Leb/i1;->i(Leb/q;Z)V

    iput-object v6, v3, Leb/a0;->z:Leb/w;

    iget-boolean p4, v1, Lkotlin/jvm/internal/b0;->w:Z

    if-nez p4, :cond_0

    goto :goto_1

    :cond_0
    move p4, v4

    goto :goto_0

    :cond_1
    move-object v3, p0

    move v4, p4

    :goto_1
    if-eqz v4, :cond_5

    iget-object p1, v3, Leb/a0;->n:Ljava/util/LinkedHashMap;

    if-nez p3, :cond_3

    sget-object p3, Leb/v;->y:Leb/v;

    invoke-static {p2, p3}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p2

    new-instance p3, Leb/x;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Leb/x;-><init>(Leb/a0;I)V

    new-instance p4, Lxb3/o;

    invoke-direct {p4, p2, p3}, Lxb3/o;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p4}, Lxb3/o;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    move-object p3, p2

    check-cast p3, Lxb3/r;

    invoke-virtual {p3}, Lxb3/r;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {p3}, Lxb3/r;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Leb/n0;

    iget p3, p3, Leb/n0;->H:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v5}, Lm83/m;->g()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Leb/r;

    if-eqz p4, :cond_2

    iget-object p4, p4, Leb/r;->w:Ljava/lang/String;

    goto :goto_3

    :cond_2
    move-object p4, v6

    :goto_3
    invoke-interface {p1, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lm83/m;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {v5}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/r;

    iget p3, p2, Leb/r;->x:I

    iget-object p2, p2, Leb/r;->w:Ljava/lang/String;

    invoke-virtual {p0, p3, v6}, Leb/a0;->e(ILeb/n0;)Leb/n0;

    move-result-object p3

    sget-object p4, Leb/v;->z:Leb/v;

    invoke-static {p3, p4}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p3

    new-instance p4, Leb/x;

    const/4 v0, 0x1

    invoke-direct {p4, p0, v0}, Leb/x;-><init>(Leb/a0;I)V

    new-instance v0, Lxb3/o;

    invoke-direct {v0, p3, p4}, Lxb3/o;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lxb3/o;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_4
    move-object p4, p3

    check-cast p4, Lxb3/r;

    invoke-virtual {p4}, Lxb3/r;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p4}, Lxb3/r;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Leb/n0;

    iget p4, p4, Leb/n0;->H:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, v3, Leb/a0;->o:Ljava/util/LinkedHashMap;

    invoke-interface {p1, p2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {p0}, Leb/a0;->N()V

    iget-boolean p1, v2, Lkotlin/jvm/internal/b0;->w:Z

    return p1
.end method

.method public final e(ILeb/n0;)Leb/n0;
    .locals 2

    iget-object v0, p0, Leb/a0;->c:Leb/r0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget v1, v0, Leb/n0;->H:I

    if-ne v1, p1, :cond_2

    if-eqz p2, :cond_1

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p2, Leb/n0;->x:Leb/r0;

    if-nez v0, :cond_2

    iget-object p1, p0, Leb/a0;->c:Leb/r0;

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    if-eqz v0, :cond_3

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Leb/a0;->c:Leb/r0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Leb/a0;->f(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object p1

    return-object p1
.end method

.method public final g(I)Leb/q;
    .locals 3

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    iget v2, v2, Leb/n0;->H:I

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Leb/q;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const-string v0, "No destination with ID "

    const-string v1, " is on the NavController\'s back stack. The current destination is "

    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Leb/q;
    .locals 1

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    return-object v0
.end method

.method public final i()Leb/n0;
    .locals 1

    invoke-virtual {p0}, Leb/a0;->h()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Leb/a0;->g:Lm83/m;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    instance-of v2, v2, Leb/r0;

    if-nez v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->c0()V

    const/4 v0, 0x0

    throw v0

    :cond_3
    return v0
.end method

.method public final k()Leb/r0;
    .locals 2

    iget-object v0, p0, Leb/a0;->c:Leb/r0;

    if-eqz v0, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setGraph() before calling getGraph()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l()Landroidx/lifecycle/w;
    .locals 1

    iget-object v0, p0, Leb/a0;->p:Landroidx/lifecycle/g0;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    return-object v0

    :cond_0
    iget-object v0, p0, Leb/a0;->s:Landroidx/lifecycle/w;

    return-object v0
.end method

.method public final m()Leb/q;
    .locals 3

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-static {v0}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    :cond_0
    invoke-static {v0}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    check-cast v0, Lxb3/a;

    invoke-virtual {v0}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->x:Leb/n0;

    instance-of v2, v2, Leb/r0;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Leb/q;

    return-object v1
.end method

.method public final n(Lm83/m;)Leb/r0;
    .locals 1

    invoke-virtual {p1}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/q;

    if-eqz p1, :cond_0

    iget-object p1, p1, Leb/q;->x:Leb/n0;

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Leb/a0;->c:Leb/r0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    instance-of v0, p1, Leb/r0;

    if-eqz v0, :cond_2

    check-cast p1, Leb/r0;

    return-object p1

    :cond_2
    iget-object p1, p1, Leb/n0;->x:Leb/r0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final o(Leb/q;Leb/q;)V
    .locals 2

    iget-object v0, p0, Leb/a0;->l:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Leb/a0;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final p(ILandroid/os/Bundle;Leb/x0;)V
    .locals 8

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Leb/a0;->c:Leb/r0;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    :goto_0
    if-eqz v0, :cond_d

    invoke-virtual {v0, p1}, Leb/n0;->e(I)Leb/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    if-nez p3, :cond_1

    iget-object p3, v1, Leb/g;->b:Leb/x0;

    :cond_1
    iget v3, v1, Leb/g;->a:I

    iget-object v4, v1, Leb/g;->c:Landroid/os/Bundle;

    if-eqz v4, :cond_2

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, v2

    goto :goto_2

    :cond_3
    move v3, p1

    goto :goto_1

    :goto_2
    if-eqz p2, :cond_5

    if-nez v5, :cond_4

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_4
    invoke-virtual {v5, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_5
    if-nez v3, :cond_9

    if-eqz p3, :cond_9

    iget-boolean p2, p3, Leb/x0;->d:Z

    iget-object v4, p3, Leb/x0;->j:Ljava/lang/String;

    iget v6, p3, Leb/x0;->c:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_6

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    if-eqz v4, :cond_7

    invoke-static {p0, v4, p2}, Leb/a0;->B(Leb/a0;Ljava/lang/String;Z)V

    return-void

    :cond_7
    if-eq v6, v7, :cond_8

    invoke-virtual {p0, v6, p2}, Leb/a0;->A(IZ)Z

    :cond_8
    return-void

    :cond_9
    :goto_3
    if-eqz v3, :cond_c

    invoke-virtual {p0, v3, v2}, Leb/a0;->e(ILeb/n0;)Leb/n0;

    move-result-object p2

    if-nez p2, :cond_b

    sget p2, Leb/n0;->K:I

    iget-object p2, p0, Leb/a0;->a:Landroid/content/Context;

    invoke-static {p2, v3}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p3

    const-string v2, " cannot be found from the current destination "

    if-nez v1, :cond_a

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Navigation action/destination "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    const-string v1, "Navigation destination "

    const-string v3, " referenced from action "

    invoke-static {v1, p3, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-static {p2, p1}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    invoke-virtual {p0, p2, v5, p3}, Leb/a0;->u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "No current destination found. Ensure a navigation graph has been set for NavController "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p3, 0x2e

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Landroid/net/Uri;)V
    .locals 2

    const-string v0, "deepLink"

    const/4 v1, 0x0

    invoke-static {p1, v0, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {p0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void
.end method

.method public final r(Landroid/net/Uri;Leb/x0;)V
    .locals 2

    const-string v0, "deepLink"

    const/4 v1, 0x0

    invoke-static {p1, v0, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Leb/a0;->x(Leb/k0;Leb/x0;)V

    return-void
.end method

.method public final s(Leb/k0;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    return-void
.end method

.method public final t(Leb/k0;Leb/x0;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Leb/a0;->x(Leb/k0;Leb/x0;)V

    return-void
.end method

.method public final u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V
    .locals 24

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    iget-object v7, v2, Leb/a0;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/t;

    iput-boolean v4, v1, Leb/t;->d:Z

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-eqz v6, :cond_2

    iget-boolean v5, v6, Leb/x0;->e:Z

    iget-boolean v9, v6, Leb/x0;->d:Z

    iget-object v10, v6, Leb/x0;->j:Ljava/lang/String;

    if-eqz v10, :cond_1

    invoke-virtual {v2, v10, v9, v5}, Leb/a0;->D(Ljava/lang/String;ZZ)Z

    move-result v5

    :goto_1
    move v9, v5

    goto :goto_2

    :cond_1
    iget v10, v6, Leb/x0;->c:I

    if-eq v10, v0, :cond_2

    invoke-virtual {v2, v10, v9, v5}, Leb/a0;->C(IZZ)Z

    move-result v5

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    :goto_2
    invoke-virtual/range {p1 .. p2}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    if-eqz v6, :cond_3

    iget-boolean v10, v6, Leb/x0;->b:Z

    if-ne v10, v4, :cond_3

    iget v10, v3, Leb/n0;->H:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v2, Leb/a0;->n:Ljava/util/LinkedHashMap;

    invoke-interface {v11, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    iget v0, v3, Leb/n0;->H:I

    invoke-virtual {v2, v0, v5, v6}, Leb/a0;->I(ILandroid/os/Bundle;Leb/x0;)Z

    move-result v0

    iput-boolean v0, v1, Lkotlin/jvm/internal/b0;->w:Z

    const/16 v22, 0x0

    goto/16 :goto_a

    :cond_3
    iget-object v10, v2, Leb/a0;->w:Leb/j1;

    if-eqz v6, :cond_f

    iget-boolean v11, v6, Leb/x0;->a:Z

    if-ne v11, v4, :cond_f

    invoke-virtual {v2}, Leb/a0;->h()Leb/q;

    move-result-object v11

    iget-object v12, v2, Leb/a0;->g:Lm83/m;

    invoke-virtual {v12}, Lm83/m;->a()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v13

    :cond_4
    invoke-interface {v13}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-interface {v13}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Leb/q;

    iget-object v14, v14, Leb/q;->x:Leb/n0;

    if-ne v14, v3, :cond_4

    invoke-interface {v13}, Ljava/util/ListIterator;->nextIndex()I

    move-result v13

    goto :goto_3

    :cond_5
    move v13, v0

    :goto_3
    if-ne v13, v0, :cond_6

    goto/16 :goto_8

    :cond_6
    instance-of v0, v3, Leb/r0;

    if-eqz v0, :cond_9

    sget v0, Leb/r0;->P:I

    move-object v0, v3

    check-cast v0, Leb/r0;

    sget-object v11, Leb/v;->F:Leb/v;

    invoke-static {v0, v11}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v0

    sget-object v11, Leb/v;->E:Leb/v;

    invoke-static {v0, v11}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    iget v11, v12, Lm83/m;->y:I

    sub-int/2addr v11, v13

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    if-eq v11, v14, :cond_7

    goto/16 :goto_8

    :cond_7
    iget v11, v12, Lm83/m;->y:I

    invoke-virtual {v12, v13, v11}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v11, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Leb/q;

    iget-object v15, v15, Leb/q;->x:Leb/n0;

    iget v15, v15, Leb/n0;->H:I

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-virtual {v14, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_8

    :cond_9
    if-eqz v11, :cond_f

    iget-object v0, v11, Leb/q;->x:Leb/n0;

    if-eqz v0, :cond_f

    iget v11, v3, Leb/n0;->H:I

    iget v0, v0, Leb/n0;->H:I

    if-ne v11, v0, :cond_f

    :cond_a
    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    :goto_5
    invoke-static {v12}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v11

    if-lt v11, v13, :cond_b

    invoke-static {v12}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Leb/q;

    invoke-virtual {v2, v11}, Leb/a0;->L(Leb/q;)V

    new-instance v14, Leb/q;

    iget-object v15, v11, Leb/q;->x:Leb/n0;

    move-object/from16 v4, p2

    invoke-virtual {v15, v4}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v17

    iget-object v15, v11, Leb/q;->w:Landroid/content/Context;

    iget-object v8, v11, Leb/q;->x:Leb/n0;

    move-object/from16 v23, v1

    iget-object v1, v11, Leb/q;->z:Landroidx/lifecycle/w;

    move-object/from16 v18, v1

    iget-object v1, v11, Leb/q;->E:Leb/b0;

    move-object/from16 v19, v1

    iget-object v1, v11, Leb/q;->F:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v11, Leb/q;->G:Landroid/os/Bundle;

    move-object/from16 v21, v1

    move-object/from16 v16, v8

    invoke-direct/range {v14 .. v21}, Leb/q;-><init>(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v1, v11, Leb/q;->z:Landroidx/lifecycle/w;

    iput-object v1, v14, Leb/q;->z:Landroidx/lifecycle/w;

    iget-object v1, v11, Leb/q;->L:Landroidx/lifecycle/w;

    invoke-virtual {v14, v1}, Leb/q;->c(Landroidx/lifecycle/w;)V

    invoke-virtual {v0, v14}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    move-object/from16 v1, v23

    const/4 v4, 0x1

    goto :goto_5

    :cond_b
    move-object/from16 v23, v1

    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    iget-object v8, v4, Leb/q;->x:Leb/n0;

    iget-object v8, v8, Leb/n0;->x:Leb/r0;

    if-eqz v8, :cond_c

    iget v8, v8, Leb/n0;->H:I

    invoke-virtual {v2, v8}, Leb/a0;->g(I)Leb/q;

    move-result-object v8

    invoke-virtual {v2, v4, v8}, Leb/a0;->o(Leb/q;Leb/q;)V

    :cond_c
    invoke-virtual {v12, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v4, v1, Leb/q;->x:Leb/n0;

    iget-object v4, v4, Leb/n0;->w:Ljava/lang/String;

    invoke-virtual {v10, v4}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v4

    invoke-virtual {v4, v1}, Leb/i1;->f(Leb/q;)V

    goto :goto_7

    :cond_e
    const/16 v22, 0x1

    goto :goto_9

    :cond_f
    :goto_8
    move-object/from16 v23, v1

    const/16 v22, 0x0

    :goto_9
    if-nez v22, :cond_10

    invoke-virtual {v2}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v0

    iget-object v1, v2, Leb/a0;->q:Leb/b0;

    iget-object v4, v2, Leb/a0;->a:Landroid/content/Context;

    invoke-static {v4, v3, v5, v0, v1}, Lio/sentry/hints/j;->o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v0

    iget-object v1, v3, Leb/n0;->w:Ljava/lang/String;

    invoke-virtual {v10, v1}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v8

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v0, Lgb/g0;

    move-object v4, v5

    const/4 v5, 0x2

    move-object/from16 v1, v23

    invoke-direct/range {v0 .. v5}, Lgb/g0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, v2, Leb/a0;->y:Lkotlin/jvm/internal/m;

    invoke-virtual {v8, v10, v6}, Leb/i1;->d(Ljava/util/List;Leb/x0;)V

    const/4 v0, 0x0

    iput-object v0, v2, Leb/a0;->y:Lkotlin/jvm/internal/m;

    goto :goto_a

    :cond_10
    move-object/from16 v1, v23

    :goto_a
    invoke-virtual {v2}, Leb/a0;->N()V

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/t;

    const/4 v4, 0x0

    iput-boolean v4, v3, Leb/t;->d:Z

    goto :goto_b

    :cond_11
    if-nez v9, :cond_13

    iget-boolean v0, v1, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v0, :cond_13

    if-eqz v22, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v2}, Leb/a0;->M()V

    return-void

    :cond_13
    :goto_c
    invoke-virtual {v2}, Leb/a0;->c()Z

    return-void
.end method

.method public final v(Leb/p0;)V
    .locals 2

    const-string v0, "directions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Leb/p0;->a()I

    move-result v0

    invoke-interface {p1}, Leb/p0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lse/h;->P(Lkotlin/jvm/functions/Function1;)Leb/x0;

    move-result-object p2

    const/4 v0, 0x4

    invoke-static {p0, p1, p2, v0}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method

.method public final x(Leb/k0;Leb/x0;)V
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/a0;->c:Leb/r0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {p0, v0}, Leb/a0;->n(Lm83/m;)Leb/r0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, v0}, Leb/r0;->t(Leb/k0;ZLeb/r0;)Leb/l0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v0, Leb/l0;->w:Leb/n0;

    iget-object v0, v0, Leb/l0;->x:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    iget-object v3, p1, Leb/k0;->a:Landroid/net/Uri;

    iget-object v4, p1, Leb/k0;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p1, Leb/k0;->b:Ljava/lang/String;

    invoke-virtual {v2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, v1, v0, p2}, Leb/a0;->u(Leb/n0;Landroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Navigation destination that matches request "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be found in the navigation graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Leb/a0;->c:Leb/r0;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Cannot navigate to "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Navigation graph has not been set for NavController "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final z()Z
    .locals 2

    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v0, v0, Leb/n0;->H:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Leb/a0;->A(IZ)Z

    move-result v0

    return v0
.end method
