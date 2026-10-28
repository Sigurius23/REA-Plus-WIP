.class public final Lt9/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/q;
.implements Lcq/b;
.implements Lun/c;
.implements Lwm/b;
.implements Lwn/p;
.implements Lxf/f;


# direct methods
.method public static g(Ljava/lang/Integer;Ljava/lang/Integer;Ly00/w5;Ly00/v3;Ljava/util/Set;)Ly00/x5;
    .locals 7

    new-instance v0, Ly00/x5;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Ly00/x5;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ly00/w5;Ly00/v3;Ljava/util/Set;Ly00/r3;)V

    return-object v0
.end method

.method public static h(Ljava/lang/String;)Ly00/i;
    .locals 2

    if-eqz p0, :cond_3

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Lt9/c0;->q(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_2

    sget-object p0, Ly00/i;->X:Ly00/i;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :cond_2
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly00/i;

    return-object p0

    :cond_3
    :goto_1
    sget-object p0, Ly00/i;->X:Ly00/i;

    return-object p0
.end method

.method public static i(Ljava/lang/String;)Ly00/i;
    .locals 4

    sget-object v0, Ly00/i;->Z:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ly00/i;

    iget-object v2, v2, Ly00/i;->w:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v2, p0, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ly00/i;

    if-nez v0, :cond_2

    sget-object p0, Ly00/i;->X:Ly00/i;

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static k(Ljava/lang/String;)Ly00/f4;
    .locals 3

    sget-object v0, Ly00/f4;->v0:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ly00/f4;

    iget-object v2, v2, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ly00/f4;

    return-object v0
.end method

.method public static m(Ljava/lang/String;)Ly00/h8;
    .locals 3

    sget-object v0, Ly00/h8;->E:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ly00/h8;

    iget-object v2, v2, Ly00/h8;->w:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, p0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ly00/h8;

    return-object v0
.end method

.method public static n(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 3

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Usage;->F:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v2, v2, Lcom/stripe/android/model/StripeIntent$Usage;->w:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lcom/stripe/android/model/StripeIntent$Usage;

    return-object v0
.end method

.method public static p(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    if-eqz p0, :cond_3

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Lt9/c0;->q(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_2

    sget-object p0, Ly00/i;->X:Ly00/i;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    sget-object p0, Ly00/i;->N:Ljava/util/List;

    return-object p0
.end method

.method public static q(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    sget-object v0, Ly00/i;->Z:Lt83/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, La0/i1;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    :goto_0
    invoke-virtual {v2}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ly00/i;

    iget-object v4, v3, Ly00/i;->I:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/regex/Pattern;

    if-nez v4, :cond_1

    iget-object v4, v3, Ly00/i;->H:Ljava/util/regex/Pattern;

    :cond_1
    if-eqz v4, :cond_0

    invoke-virtual {v4, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ly00/i;

    iget-boolean v2, v2, Ly00/i;->K:Z

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object p0
.end method

.method public static r(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/y;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lux/y;->y:Lux/y;

    new-instance v0, Lux/x;

    invoke-direct {v0, p0}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "key_publishable_key"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "key_account_id"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    invoke-static {p0, p1}, Ls4/d;->a(Landroid/content/Context;Lq83/j;)Lty/a;

    move-result-object p0

    invoke-virtual {p0}, Lty/a;->b()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0xd

    const-string v3, "listener already unregistered"

    invoke-direct {v1, v2, v3, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-direct {p1, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public b()J
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public c()Lko/d0;
    .locals 3

    new-instance v0, Lwn/o;

    sget-object v1, Lwn/m;->n:Lwn/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwn/o;-><init>(Lwn/m;Lwn/j;)V

    return-object v0
.end method

.method public d(J)J
    .locals 0

    return-wide p1
.end method

.method public e()J
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public f(Lwn/m;Lwn/j;)Lko/d0;
    .locals 1

    new-instance v0, Lwn/o;

    invoke-direct {v0, p1, p2}, Lwn/o;-><init>(Lwn/m;Lwn/j;)V

    return-object v0
.end method

.method public j(Ljava/lang/String;)Lxf/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lnf/d;->w:Lnf/d;

    return-object p1
.end method

.method public l()V
    .locals 0

    return-void
.end method

.method public next()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(II)Lt9/k0;
    .locals 0

    new-instance p1, Lt9/m;

    invoke-direct {p1}, Lt9/m;-><init>()V

    return-object p1
.end method

.method public s(Lq3/i;F)V
    .locals 5

    iget-object v0, p1, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, Lz/a;

    iget-object v1, p1, Lq3/i;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/cardview/widget/CardView;

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    move-result v2

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    move-result v3

    iget v4, v0, Lz/a;->e:F

    cmpl-float v4, p2, v4

    if-nez v4, :cond_0

    iget-boolean v4, v0, Lz/a;->f:Z

    if-ne v4, v2, :cond_0

    iget-boolean v4, v0, Lz/a;->g:Z

    if-ne v4, v3, :cond_0

    goto :goto_0

    :cond_0
    iput p2, v0, Lz/a;->e:F

    iput-boolean v2, v0, Lz/a;->f:Z

    iput-boolean v3, v0, Lz/a;->g:Z

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Lz/a;->b(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :goto_0
    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Lq3/i;->i(IIII)V

    return-void

    :cond_1
    iget-object p2, p1, Lq3/i;->w:Ljava/lang/Object;

    check-cast p2, Landroid/graphics/drawable/Drawable;

    check-cast p2, Lz/a;

    iget v0, p2, Lz/a;->e:F

    iget p2, p2, Lz/a;->a:F

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    move-result v2

    invoke-static {v0, p2, v2}, Lz/b;->a(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    move-result v1

    invoke-static {v0, p2, v1}, Lz/b;->b(FFZ)F

    move-result p2

    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p2, v0

    invoke-virtual {p1, v2, p2, v2, p2}, Lq3/i;->i(IIII)V

    return-void
.end method

.method public v(Lt9/e0;)V
    .locals 0

    return-void
.end method
