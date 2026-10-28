.class public abstract Ljc/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/d0;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ljc/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final A(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/d;)Lwb3/a;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static/range {p0 .. p2}, Lug/m;->t(Lj93/e;Ljava/util/List;Z)Lwb3/h;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v0, p0, Lj93/d;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lj93/d;

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {v0}, Lwb3/f;->c(Lj93/d;)Ljava/util/List;

    move-result-object v3

    :cond_2
    if-nez v3, :cond_3

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v0, v3}, Ljc/x;->p(II)V

    new-instance v0, Lwb3/q;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v9, p4

    invoke-direct/range {v0 .. v10}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v0
.end method

.method public static final A0(Lqa3/b1;Lsa3/h;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqa3/b1;->H:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object p0, p0, Lqa3/b1;->I:Ljava/util/List;

    const-string v0, "getUpperBoundIdList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static final B(Landroid/content/Context;Lic/b;)Ljc/v;
    .locals 9

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lsc/b;

    iget-object v0, p1, Lic/b;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v4, v0}, Lsc/b;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "getSerialTaskExecutor(...)"

    iget-object v3, v4, Lsc/b;->a:Landroidx/room/u1;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lic/b;->d:Lic/y;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f05000d

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v5

    const-string v6, "clock"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Landroidx/work/impl/WorkDatabase;

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    new-instance v5, Landroidx/room/p0;

    const/4 v8, 0x0

    invoke-direct {v5, v0, v6, v8}, Landroidx/room/p0;-><init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V

    iput-boolean v7, v5, Landroidx/room/p0;->i:Z

    goto :goto_0

    :cond_0
    const-string v5, "androidx.work.workdb"

    invoke-static {v0, v6, v5}, Ljc/x;->C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;

    move-result-object v5

    new-instance v6, Ljc/p;

    invoke-direct {v6, v0}, Ljc/p;-><init>(Landroid/content/Context;)V

    iput-object v6, v5, Landroidx/room/p0;->h:Ljc/p;

    :goto_0
    iput-object v3, v5, Landroidx/room/p0;->f:Ljava/util/concurrent/Executor;

    new-instance v3, Ljc/c;

    invoke-direct {v3, v2}, Ljc/c;-><init>(Lic/y;)V

    iget-object v2, v5, Landroidx/room/p0;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->f:Ljc/e;

    const/4 v6, 0x0

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-instance v2, Ljc/h;

    const/4 v3, 0x2

    const/4 v8, 0x3

    invoke-direct {v2, v0, v3, v8}, Ljc/h;-><init>(Landroid/content/Context;II)V

    new-array v3, v7, [Lmb/b;

    aput-object v2, v3, v6

    invoke-virtual {v5, v3}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->g:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->h:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-instance v2, Ljc/h;

    const/4 v3, 0x5

    const/4 v8, 0x6

    invoke-direct {v2, v0, v3, v8}, Ljc/h;-><init>(Landroid/content/Context;II)V

    new-array v3, v7, [Lmb/b;

    aput-object v2, v3, v6

    invoke-virtual {v5, v3}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->i:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->j:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->k:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-instance v2, Ljc/h;

    invoke-direct {v2, v0}, Ljc/h;-><init>(Landroid/content/Context;)V

    new-array v3, v7, [Lmb/b;

    aput-object v2, v3, v6

    invoke-virtual {v5, v3}, Landroidx/room/p0;->a([Lmb/b;)V

    new-instance v2, Ljc/h;

    const/16 v3, 0xa

    const/16 v8, 0xb

    invoke-direct {v2, v0, v3, v8}, Ljc/h;-><init>(Landroid/content/Context;II)V

    new-array v3, v7, [Lmb/b;

    aput-object v2, v3, v6

    invoke-virtual {v5, v3}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->b:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->c:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->d:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-array v2, v7, [Lmb/b;

    sget-object v3, Ljc/e;->e:Ljc/e;

    aput-object v3, v2, v6

    invoke-virtual {v5, v2}, Landroidx/room/p0;->a([Lmb/b;)V

    new-instance v2, Ljc/h;

    const/16 v3, 0x15

    const/16 v8, 0x16

    invoke-direct {v2, v0, v3, v8}, Ljc/h;-><init>(Landroid/content/Context;II)V

    new-array v0, v7, [Lmb/b;

    aput-object v2, v0, v6

    invoke-virtual {v5, v0}, Landroidx/room/p0;->a([Lmb/b;)V

    iput-boolean v6, v5, Landroidx/room/p0;->p:Z

    iput-boolean v7, v5, Landroidx/room/p0;->q:Z

    iput-boolean v7, v5, Landroidx/room/p0;->r:Z

    invoke-virtual {v5}, Landroidx/room/p0;->b()Landroidx/room/z0;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/work/impl/WorkDatabase;

    new-instance v6, Loc/i;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0, v4}, Loc/i;-><init>(Landroid/content/Context;Lsc/b;)V

    new-instance v7, Ljc/g;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v7, v0, p1, v4, v5}, Ljc/g;-><init>(Landroid/content/Context;Lic/b;Lsc/b;Landroidx/work/impl/WorkDatabase;)V

    sget-object v1, Ljc/w;->w:Ljc/w;

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v1 .. v7}, Ljc/w;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    new-instance v1, Ljc/v;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    move-object v8, v6

    move-object v6, p0

    invoke-direct/range {v1 .. v8}, Ljc/v;-><init>(Landroid/content/Context;Lic/b;Lsc/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ljc/g;Loc/i;)V

    return-object v1
.end method

.method public static final B0(Lqa3/e1;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/e1;->y:I

    and-int/lit8 v1, v0, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/e1;->H:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/e1;->I:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ":memory:"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/room/p0;

    invoke-direct {v0, p0, p1, p2}, Landroidx/room/p0;-><init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot build a database with the special name \':memory:\'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static C0(II)V
    .locals 2

    if-ltz p0, :cond_1

    if-lt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index"

    if-ltz p0, :cond_3

    if-gez p1, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0xf

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "negative size: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must be less than size (%s)"

    invoke-static {p1, p0}, Lv8/b;->b0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lv8/b;->b0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static D(Lr93/b;Lr93/b;)Z
    .locals 4

    const-string v0, "superDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lha3/e;

    if-eqz v0, :cond_2

    instance-of v0, p0, Lr93/w;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Lha3/e;

    invoke-virtual {v0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    check-cast p0, Lr93/w;

    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-virtual {v0}, Lu93/q0;->V0()Lu93/q0;

    move-result-object v0

    invoke-virtual {v0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {p0}, Lr93/w;->a()Lr93/w;

    move-result-object v2

    invoke-interface {v2}, Lr93/b;->v()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lr93/a1;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lr93/a1;

    move-object v3, p1

    check-cast v3, Lr93/w;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, v2}, Ljc/x;->b0(Lr93/w;Lr93/a1;)Loa3/l;

    move-result-object v2

    instance-of v2, v2, Loa3/k;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p0, v1}, Ljc/x;->b0(Lr93/w;Lr93/a1;)Loa3/l;

    move-result-object v1

    instance-of v1, v1, Loa3/k;

    if-eq v2, v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static D0(III)V
    .locals 1

    if-ltz p0, :cond_1

    if-lt p1, p0, :cond_1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    if-ltz p0, :cond_4

    if-gt p0, p2, :cond_4

    if-ltz p1, :cond_3

    if-le p1, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "end index (%s) must not be less than start index (%s)"

    invoke-static {p1, p0}, Lv8/b;->b0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    :goto_1
    const-string p0, "end index"

    invoke-static {p1, p2, p0}, Ljc/x;->E0(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_4
    const-string p1, "start index"

    invoke-static {p0, p2, p1}, Ljc/x;->E0(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static E(Ljava/lang/Double;)Ljava/math/BigDecimal;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p0

    const/4 v0, 0x6

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {p0, v0, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static E0(IILjava/lang/String;)Ljava/lang/String;
    .locals 1

    if-gez p0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lv8/b;->b0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-ltz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be greater than size (%s)"

    invoke-static {p1, p0}, Lv8/b;->b0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0xf

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "negative size: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final G(Lqa3/y0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/y0;->y:I

    and-int/lit8 v1, v0, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/y0;->I:Lqa3/w0;

    const-string p1, "getExpandedType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/y0;->J:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No expandedType in ProtoBuf.TypeAlias"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final H(Lqa3/w0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/w0;->y:I

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/w0;->G:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/w0;->H:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static I(Ljava/lang/String;Lb23/h;)Lgt/b;
    .locals 11

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    const-class v3, Lbu/a;

    invoke-static {v3}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    array-length v3, v0

    const/4 v7, 0x0

    move v4, v7

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    const-string v6, "Null interface"

    invoke-static {v5, v6}, Lts/o;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const-class v0, Landroid/content/Context;

    invoke-static {v0}, Lgt/j;->a(Ljava/lang/Class;)Lgt/j;

    move-result-object v0

    iget-object v3, v0, Lgt/j;->a:Lgt/p;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v9, Lbu/d;

    const/4 v0, 0x0

    invoke-direct {v9, v0, p0, p1}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lgt/b;

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v4, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v3 .. v10}, Lgt/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILgt/e;Ljava/util/Set;)V

    return-object v3

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final J(Lgf/b;Lgf/a;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No instance for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final K(Ljava/lang/annotation/Annotation;)Lj93/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object p0

    const-string v0, "annotationType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final L(J)J
    .locals 5

    const/16 v0, 0x20

    shr-long v1, p0, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const-wide v3, 0xffffffffL

    and-long/2addr p0, v3

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    div-float/2addr p0, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v1, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    shl-long v0, v1, v0

    and-long/2addr p0, v3

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final M(Ltb/c;Ljava/lang/String;)I
    .locals 1

    const-string v0, "stmt"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final N(Ltb/c;Ljava/lang/String;)I
    .locals 7

    const-string v0, "stmt"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Ltb/c;->getColumnCount()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ltb/c;->getColumnName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    const/16 v6, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Column \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' does not exist. Available columns: ["

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static O()Ljava/util/Date;
    .locals 1

    sget-object v0, Lio/sentry/vendor/gson/internal/bind/util/a;->a:Ljava/util/TimeZone;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static P(J)Ljava/util/Date;
    .locals 1

    sget-object v0, Lio/sentry/vendor/gson/internal/bind/util/a;->a:Ljava/util/TimeZone;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static Q(Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    :try_start_0
    new-instance v0, Ljava/text/ParsePosition;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-static {p0, v0}, Lio/sentry/vendor/gson/internal/bind/util/a;->c(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timestamp is not ISO format "

    invoke-static {v1, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static R(Ljava/lang/String;)Ljava/util/Date;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timestamp is not millis format "

    invoke-static {v1, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final S(Lj93/d;)Ljava/lang/Class;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/jvm/internal/d;

    invoke-interface {p0}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final T(Lj93/d;)Ljava/lang/Class;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/jvm/internal/d;

    invoke-interface {p0}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "short"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-class p0, Ljava/lang/Short;

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "float"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-class p0, Ljava/lang/Float;

    goto :goto_0

    :sswitch_2
    const-string v1, "boolean"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const-class p0, Ljava/lang/Boolean;

    goto :goto_0

    :sswitch_3
    const-string v1, "void"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const-class p0, Ljava/lang/Void;

    goto :goto_0

    :sswitch_4
    const-string v1, "long"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const-class p0, Ljava/lang/Long;

    goto :goto_0

    :sswitch_5
    const-string v1, "char"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const-class p0, Ljava/lang/Character;

    goto :goto_0

    :sswitch_6
    const-string v1, "byte"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const-class p0, Ljava/lang/Byte;

    goto :goto_0

    :sswitch_7
    const-string v1, "int"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const-class p0, Ljava/lang/Integer;

    goto :goto_0

    :sswitch_8
    const-string v1, "double"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const-class p0, Ljava/lang/Double;

    :goto_0
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static final U(Lj93/d;)Ljava/lang/Class;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/jvm/internal/d;

    invoke-interface {p0}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "java.lang.Double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_1
    const-string v0, "java.lang.Void"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_2
    const-string v0, "java.lang.Long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_3
    const-string v0, "java.lang.Byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_4
    const-string v0, "java.lang.Boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_5
    const-string v0, "java.lang.Character"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_6
    const-string v0, "java.lang.Short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_7
    const-string v0, "java.lang.Float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_8
    const-string v0, "java.lang.Integer"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_9
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7a988a96 -> :sswitch_8
        -0x1f76ce78 -> :sswitch_7
        -0x1ec16c58 -> :sswitch_6
        0x9415455 -> :sswitch_5
        0x148d6054 -> :sswitch_4
        0x17c0bc5c -> :sswitch_3
        0x17c521d0 -> :sswitch_2
        0x17c9ace8 -> :sswitch_1
        0x2d605225 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final V(Ljava/lang/Class;)Lj93/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    return-object p0
.end method

.method public static W(Ljava/util/Date;)Ljava/lang/String;
    .locals 7

    sget-object v0, Lio/sentry/vendor/gson/internal/bind/util/a;->a:Ljava/util/TimeZone;

    new-instance v1, Ljava/util/GregorianCalendar;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v0, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    invoke-virtual {v1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p0

    const/4 v2, 0x1

    if-nez p0, :cond_0

    move p0, v2

    goto :goto_0

    :cond_0
    const/4 p0, 0x6

    :goto_0
    const/16 v3, 0x17

    add-int/2addr v3, p0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x4

    invoke-static {p0, v3, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v3, 0x2d

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    add-int/2addr v5, v2

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {p0, v2, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v2, 0x54

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {p0, v2, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v2, 0x3a

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0xc

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0xd

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v5, 0x2e

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0xe

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v6, 0x3

    invoke-static {p0, v5, v6}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    if-eqz v0, :cond_2

    const v1, 0xea60

    div-int v1, v0, v1

    div-int/lit8 v5, v1, 0x3c

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    rem-int/lit8 v1, v1, 0x3c

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x2b

    :goto_1
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    goto :goto_2

    :cond_2
    const/16 v0, 0x5a

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "owner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljf3/a;

    new-instance v0, Laa3/i1;

    iget-object v5, p2, Ljf3/a;->a:Landroidx/lifecycle/e2;

    iget-object v6, p2, Ljf3/a;->b:Lpb/f;

    move-object v2, p1

    move-object v1, p3

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v6}, Laa3/i1;-><init>(Lj93/d;Lvf3/a;Lc93/a;Lc93/a;Landroidx/lifecycle/e2;Lpb/f;)V

    if-eqz v6, :cond_0

    new-instance p1, Landroidx/lifecycle/v1;

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/v1;-><init>(Lxf3/c;Laa3/i1;)V

    goto :goto_0

    :cond_0
    new-instance p1, Llf3/a;

    invoke-direct {p1, p0, v0}, Llf3/a;-><init>(Lxf3/c;Laa3/i1;)V

    :goto_0
    sget-object p0, Ll8/a;->b:Ll8/a;

    const-string p2, "defaultCreationExtras"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lzt/q;

    invoke-direct {p2, v5, p1, p0}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    invoke-static {v1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p0

    if-eqz v2, :cond_1

    move-object p1, v2

    check-cast p1, Lvf3/c;

    iget-object p1, p1, Lvf3/c;->a:Ljava/lang/String;

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const-string p1, "modelClass"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;
    .locals 1

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeQualifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lvf3/c;

    iget-object p1, p1, Lvf3/c;->a:Ljava/lang/String;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x3a

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final Z(Lqa3/k;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/k;->y:I

    and-int/lit8 v1, v0, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/k;->X:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/k;->Y:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final a0(Ll3/v0;Ll3/v0;F)Ll3/v0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    new-instance v3, Ll3/v0;

    iget-object v4, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v5, v1, Ll3/v0;->a:Ll3/m0;

    sget-object v6, Ll3/n0;->d:Lw3/o;

    iget-object v6, v4, Ll3/m0;->a:Lw3/o;

    iget-object v7, v5, Ll3/m0;->a:Lw3/o;

    invoke-static {v6, v7, v2}, Ls3/d;->n(Lw3/o;Lw3/o;F)Lw3/o;

    move-result-object v9

    iget-object v6, v4, Ll3/m0;->f:Lp3/i;

    iget-object v7, v5, Ll3/m0;->f:Lp3/i;

    invoke-static {v2, v6, v7}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lp3/i;

    iget-wide v6, v4, Ll3/m0;->b:J

    iget-wide v10, v5, Ll3/m0;->b:J

    invoke-static {v6, v7, v10, v11, v2}, Ll3/n0;->c(JJF)J

    move-result-wide v10

    iget-object v6, v4, Ll3/m0;->c:Lp3/r;

    if-nez v6, :cond_0

    sget-object v6, Lp3/r;->F:Lp3/r;

    :cond_0
    iget-object v7, v5, Ll3/m0;->c:Lp3/r;

    if-nez v7, :cond_1

    sget-object v7, Lp3/r;->F:Lp3/r;

    :cond_1
    invoke-static {v6, v7, v2}, Lse/h;->O(Lp3/r;Lp3/r;F)Lp3/r;

    move-result-object v12

    iget-object v6, v4, Ll3/m0;->d:Lp3/n;

    iget-object v7, v5, Ll3/m0;->d:Lp3/n;

    invoke-static {v2, v6, v7}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Lp3/n;

    iget-object v6, v4, Ll3/m0;->e:Lp3/o;

    iget-object v7, v5, Ll3/m0;->e:Lp3/o;

    invoke-static {v2, v6, v7}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Lp3/o;

    iget-object v6, v4, Ll3/m0;->g:Ljava/lang/String;

    iget-object v7, v5, Ll3/m0;->g:Ljava/lang/String;

    invoke-static {v2, v6, v7}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v16, v6

    check-cast v16, Ljava/lang/String;

    iget-wide v6, v4, Ll3/m0;->h:J

    move-object/from16 v17, v9

    iget-wide v8, v5, Ll3/m0;->h:J

    invoke-static {v6, v7, v8, v9, v2}, Ll3/n0;->c(JJF)J

    move-result-wide v6

    iget-object v8, v4, Ll3/m0;->i:Lw3/a;

    if-eqz v8, :cond_2

    iget v8, v8, Lw3/a;->a:F

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    :goto_0
    iget-object v9, v5, Ll3/m0;->i:Lw3/a;

    if-eqz v9, :cond_3

    iget v9, v9, Lw3/a;->a:F

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    invoke-static {v8, v9, v2}, Ls2/h;->i(FFF)F

    move-result v8

    iget-object v9, v4, Ll3/m0;->j:Lw3/p;

    sget-object v19, Lw3/p;->c:Lw3/p;

    if-nez v9, :cond_4

    move-object/from16 v9, v19

    :cond_4
    move-wide/from16 v20, v6

    iget-object v6, v5, Ll3/m0;->j:Lw3/p;

    if-nez v6, :cond_5

    move-object/from16 v6, v19

    :cond_5
    invoke-static {v9, v6, v2}, Ls30/b;->r(Lw3/p;Lw3/p;F)Lw3/p;

    move-result-object v6

    iget-object v7, v4, Ll3/m0;->k:Ls3/b;

    iget-object v9, v5, Ll3/m0;->k:Ls3/b;

    invoke-static {v2, v7, v9}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls3/b;

    move-object v9, v6

    move-object/from16 v19, v7

    iget-wide v6, v4, Ll3/m0;->l:J

    move-wide/from16 v22, v10

    move-object v11, v9

    iget-wide v9, v5, Ll3/m0;->l:J

    invoke-static {v6, v7, v9, v10, v2}, Li2/w0;->w(JJF)J

    move-result-wide v6

    iget-object v9, v4, Ll3/m0;->m:Lw3/l;

    iget-object v10, v5, Ll3/m0;->m:Lw3/l;

    invoke-static {v2, v9, v10}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v24, v9

    check-cast v24, Lw3/l;

    iget-object v9, v4, Ll3/m0;->n:Li2/z0;

    const/4 v10, 0x7

    if-nez v9, :cond_6

    new-instance v9, Li2/z0;

    move-wide/from16 v25, v6

    const/4 v6, 0x0

    invoke-direct {v9, v6, v10}, Li2/z0;-><init>(FI)V

    goto :goto_2

    :cond_6
    move-wide/from16 v25, v6

    const/4 v6, 0x0

    :goto_2
    iget-object v7, v5, Ll3/m0;->n:Li2/z0;

    if-nez v7, :cond_7

    new-instance v7, Li2/z0;

    invoke-direct {v7, v6, v10}, Li2/z0;-><init>(FI)V

    :cond_7
    invoke-static {v9, v7, v2}, Lvd/f;->z(Li2/z0;Li2/z0;F)Li2/z0;

    move-result-object v6

    iget-object v7, v4, Ll3/m0;->o:Ll3/f0;

    iget-object v9, v5, Ll3/m0;->o:Ll3/f0;

    const/16 v28, 0x0

    if-nez v7, :cond_8

    if-nez v9, :cond_8

    move-object/from16 v7, v28

    goto :goto_3

    :cond_8
    if-nez v7, :cond_9

    sget-object v7, Ll3/f0;->a:Ll3/f0;

    :cond_9
    :goto_3
    iget-object v4, v4, Ll3/m0;->p:Lk2/f;

    iget-object v5, v5, Ll3/m0;->p:Lk2/f;

    invoke-static {v2, v4, v5}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v27, v4

    check-cast v27, Lk2/f;

    new-instance v4, Ll3/m0;

    new-instance v5, Lw3/a;

    invoke-direct {v5, v8}, Lw3/a;-><init>(F)V

    move-object v8, v4

    move-object/from16 v9, v17

    move-wide/from16 v17, v20

    move-object/from16 v20, v11

    move-object/from16 v21, v19

    move-wide/from16 v10, v22

    move-wide/from16 v22, v25

    move-object/from16 v19, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    invoke-direct/range {v8 .. v27}, Ll3/m0;-><init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    iget-object v0, v0, Ll3/v0;->b:Ll3/b0;

    iget-object v1, v1, Ll3/v0;->b:Ll3/b0;

    sget v4, Ll3/c0;->b:I

    new-instance v9, Ll3/b0;

    iget v4, v0, Ll3/b0;->a:I

    new-instance v5, Lw3/k;

    invoke-direct {v5, v4}, Lw3/k;-><init>(I)V

    iget v4, v1, Ll3/b0;->a:I

    new-instance v6, Lw3/k;

    invoke-direct {v6, v4}, Lw3/k;-><init>(I)V

    invoke-static {v2, v5, v6}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw3/k;

    iget v10, v4, Lw3/k;->a:I

    iget v4, v0, Ll3/b0;->b:I

    new-instance v5, Lw3/m;

    invoke-direct {v5, v4}, Lw3/m;-><init>(I)V

    iget v4, v1, Ll3/b0;->b:I

    new-instance v6, Lw3/m;

    invoke-direct {v6, v4}, Lw3/m;-><init>(I)V

    invoke-static {v2, v5, v6}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw3/m;

    iget v11, v4, Lw3/m;->a:I

    iget-wide v4, v0, Ll3/b0;->c:J

    iget-wide v6, v1, Ll3/b0;->c:J

    invoke-static {v4, v5, v6, v7, v2}, Ll3/n0;->c(JJF)J

    move-result-wide v12

    iget-object v4, v0, Ll3/b0;->d:Lw3/q;

    if-nez v4, :cond_a

    sget-object v4, Lw3/q;->c:Lw3/q;

    :cond_a
    iget-object v5, v1, Ll3/b0;->d:Lw3/q;

    if-nez v5, :cond_b

    sget-object v5, Lw3/q;->c:Lw3/q;

    :cond_b
    invoke-static {v4, v5, v2}, Ls30/e;->j(Lw3/q;Lw3/q;F)Lw3/q;

    move-result-object v14

    iget-object v4, v0, Ll3/b0;->e:Ll3/e0;

    iget-object v5, v1, Ll3/b0;->e:Ll3/e0;

    if-nez v4, :cond_c

    if-nez v5, :cond_c

    move-object/from16 v15, v28

    goto :goto_5

    :cond_c
    sget-object v6, Ll3/e0;->b:Ll3/e0;

    if-nez v4, :cond_d

    move-object v4, v6

    :cond_d
    iget-boolean v7, v4, Ll3/e0;->a:Z

    if-nez v5, :cond_e

    move-object v5, v6

    :cond_e
    iget-boolean v5, v5, Ll3/e0;->a:Z

    if-ne v7, v5, :cond_f

    :goto_4
    move-object v15, v4

    goto :goto_5

    :cond_f
    new-instance v4, Ll3/e0;

    new-instance v6, Ll3/p;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v15, Ll3/p;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v6, v15}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/p;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v6, v5}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Ll3/e0;-><init>(ZI)V

    goto :goto_4

    :goto_5
    iget-object v4, v0, Ll3/b0;->f:Lw3/i;

    iget-object v5, v1, Ll3/b0;->f:Lw3/i;

    invoke-static {v2, v4, v5}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, Lw3/i;

    iget v4, v0, Ll3/b0;->g:I

    new-instance v5, Lw3/e;

    invoke-direct {v5, v4}, Lw3/e;-><init>(I)V

    iget v4, v1, Ll3/b0;->g:I

    new-instance v6, Lw3/e;

    invoke-direct {v6, v4}, Lw3/e;-><init>(I)V

    invoke-static {v2, v5, v6}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw3/e;

    iget v4, v4, Lw3/e;->a:I

    iget v5, v0, Ll3/b0;->h:I

    new-instance v6, Lw3/d;

    invoke-direct {v6, v5}, Lw3/d;-><init>(I)V

    iget v5, v1, Ll3/b0;->h:I

    new-instance v7, Lw3/d;

    invoke-direct {v7, v5}, Lw3/d;-><init>(I)V

    invoke-static {v2, v6, v7}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw3/d;

    iget v5, v5, Lw3/d;->a:I

    iget-object v0, v0, Ll3/b0;->i:Lw3/s;

    iget-object v1, v1, Ll3/b0;->i:Lw3/s;

    invoke-static {v2, v0, v1}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lw3/s;

    move/from16 v17, v4

    move/from16 v18, v5

    invoke-direct/range {v9 .. v19}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    invoke-direct {v3, v8, v9}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;)V

    return-object v3
.end method

.method public static final b(FF)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static b0(Lr93/w;Lr93/a1;)Loa3/l;
    .locals 4

    invoke-static {p0}, Lio/sentry/config/a;->y(Lr93/w;)Z

    move-result v0

    const-string v1, "getType(...)"

    if-nez v0, :cond_6

    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v2, v0, Lr93/e;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object p0

    const-string v2, "getValueParameters(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr93/a1;

    check-cast p0, Lu93/x0;

    invoke-virtual {p0}, Lu93/x0;->getType()Llb3/y;

    move-result-object p0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    instance-of v2, p0, Lr93/e;

    if-eqz v2, :cond_3

    move-object v3, p0

    check-cast v3, Lr93/e;

    :cond_3
    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lo93/h;->u(Lr93/e;)Lo93/j;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {v0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object p0

    invoke-static {v3}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lu93/x0;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/sentry/config/a;->R(Llb3/y;)Loa3/l;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_2
    check-cast p1, Lu93/x0;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/sentry/config/a;->Q(Llb3/y;)Llb3/f1;

    move-result-object p0

    invoke-static {p0}, Lio/sentry/config/a;->R(Llb3/y;)Loa3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lqa3/w0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/w0;->y:I

    and-int/lit16 v1, v0, 0x400

    const/16 v2, 0x400

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/w0;->O:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/w0;->P:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c0(Lgf/l;Lgf/b;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lgf/b;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgf/a;

    const-string v2, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.collections.AttributeKey<kotlin.Any>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v1, v2}, Lgf/l;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final d([F)I
    .locals 6

    array-length v0, p0

    const/16 v1, 0x10

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    aget v0, p0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_1

    aget v0, p0, v3

    cmpg-float v0, v0, v4

    if-nez v0, :cond_1

    const/4 v0, 0x2

    aget v0, p0, v0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_1

    const/4 v0, 0x4

    aget v0, p0, v0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_1

    const/4 v0, 0x5

    aget v0, p0, v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x6

    aget v0, p0, v0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_1

    const/16 v0, 0x8

    aget v0, p0, v0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_1

    const/16 v0, 0x9

    aget v0, p0, v0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_1

    const/16 v0, 0xa

    aget v0, p0, v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/16 v5, 0xc

    aget v5, p0, v5

    cmpg-float v5, v5, v4

    if-nez v5, :cond_2

    const/16 v5, 0xd

    aget v5, p0, v5

    cmpg-float v5, v5, v4

    if-nez v5, :cond_2

    const/16 v5, 0xe

    aget v5, p0, v5

    cmpg-float v4, v5, v4

    if-nez v4, :cond_2

    const/16 v4, 0xf

    aget p0, p0, v4

    cmpg-float p0, p0, v1

    if-nez p0, :cond_2

    move v2, v3

    :cond_2
    shl-int/lit8 p0, v0, 0x1

    or-int/2addr p0, v2

    return p0
.end method

.method public static d0(Ljava/lang/Throwable;)V
    .locals 2

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lio/reactivex/exceptions/MissingBackpressureException;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of v0, p0, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v0, p0, Ljava/lang/NullPointerException;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    instance-of v0, p0, Lio/reactivex/exceptions/CompositeException;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    new-instance v0, Lio/reactivex/exceptions/UndeliverableException;

    invoke-direct {v0, p0}, Lio/reactivex/exceptions/UndeliverableException;-><init>(Ljava/lang/Throwable;)V

    move-object p0, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-interface {v1, v0, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final f(Z)Ljava/util/concurrent/Executor;
    .locals 2

    new-instance v0, Lic/c;

    invoke-direct {v0, p0}, Lic/c;-><init>(Z)V

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/4 v1, 0x4

    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v1, 0x2

    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const-string v0, "newFixedThreadPool(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static final f0(Lqa3/w0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/w0;->y:I

    and-int/lit16 v1, v0, 0x100

    const/16 v2, 0x100

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/w0;->M:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/w0;->N:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final g0(Lrf3/b;Ljava/lang/String;)V
    .locals 3

    const-string v0, "factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapping"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/koin/core/error/DefinitionOverrideException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Already existing definition for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lrf3/b;->a:Lqf3/b;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " at "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/koin/core/error/DefinitionOverrideException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final h(J)Z
    .locals 2

    const-wide v0, 0x7fffffff7fffffffL

    invoke-static {p0, p1, v0, v1}, Ly3/j;->b(JJ)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static h0(Ljava/lang/String;)Li63/d;
    .locals 7

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Li63/d;->f:Li63/d;

    return-object p0

    :cond_0
    invoke-static {p0}, Lq83/g;->P(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li63/h;

    iget-object v1, v0, Li63/h;->a:Ljava/lang/String;

    iget-object v0, v0, Li63/h;->b:Ljava/util/List;

    const/4 v2, 0x6

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v4, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    const/4 v5, -0x1

    if-ne v2, v5, :cond_2

    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "*"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Li63/d;->f:Li63/d;

    return-object p0

    :cond_1
    new-instance v0, Lio/ktor/http/BadContentTypeFormatException;

    invoke-direct {v0, p0}, Lio/ktor/http/BadContentTypeFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_5

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).substring(startIndex)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x20

    invoke-static {v5, v2, v4}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {v1, v2, v4}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1, v3, v4}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance p0, Li63/d;

    invoke-direct {p0, v5, v1, v0}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p0

    :cond_3
    new-instance v0, Lio/ktor/http/BadContentTypeFormatException;

    invoke-direct {v0, p0}, Lio/ktor/http/BadContentTypeFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lio/ktor/http/BadContentTypeFormatException;

    invoke-direct {v0, p0}, Lio/ktor/http/BadContentTypeFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Lio/ktor/http/BadContentTypeFormatException;

    invoke-direct {v0, p0}, Lio/ktor/http/BadContentTypeFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/sentry/l5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static final i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ".preferences_pb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lv63/h;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgf/b;->d(Lgf/a;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1, p2}, Lgf/l;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final k(Llb3/c0;Lr93/i;I)Lq30/w0;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-static {p1}, Lnb3/l;->f(Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/i;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {p1}, Lr93/i;->isInner()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-static {p1}, Lya3/f;->m(Lr93/k;)Z

    move-result v1

    :cond_1
    new-instance v1, Lq30/w0;

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {v2, p2, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p1, p0, v0}, Lq30/w0;-><init>(Lr93/i;Ljava/util/List;Lq30/w0;)V

    return-object v1

    :cond_2
    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    new-instance v2, Lq30/w0;

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v3

    instance-of v4, v3, Lr93/i;

    if-eqz v4, :cond_3

    move-object v0, v3

    check-cast v0, Lr93/i;

    :cond_3
    invoke-static {p0, v0, v1}, Ljc/x;->k(Llb3/c0;Lr93/i;I)Lq30/w0;

    move-result-object p0

    invoke-direct {v2, p1, p2, p0}, Lq30/w0;-><init>(Lr93/i;Ljava/util/List;Lq30/w0;)V

    return-object v2

    :cond_4
    :goto_0
    return-object v0
.end method

.method public static final k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-static {p0, p1, p2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final l(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lh2/c;
    .locals 5

    sget-object v0, Lg2/g;->a:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, v0, v1

    aget v0, v0, v3

    sub-int/2addr v2, p1

    int-to-float p1, v2

    sub-int/2addr v4, v0

    int-to-float v0, v4

    new-instance v1, Lh2/c;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    add-float/2addr p0, v0

    invoke-direct {v1, p1, v0, v2, p0}, Lh2/c;-><init>(FFFF)V

    return-object v1
.end method

.method public static final l0(Lqa3/c0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/c0;->y:I

    and-int/lit8 v1, v0, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/c0;->J:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/c0;->K:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static m(Ljava/util/concurrent/Callable;)Ll73/g;
    .locals 1

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Scheduler Callable result can\'t be null"

    invoke-static {p0, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ll73/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lb83/d;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static final m0(Lqa3/k0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/k0;->y:I

    and-int/lit8 v1, v0, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/k0;->J:Lqa3/w0;

    return-object p0

    :cond_0
    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/k0;->K:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final n0(Lp1/q;)Lui/b;
    .locals 2

    const v0, 0x78ab5fda

    invoke-virtual {p0, v0}, Lp1/q;->f0(I)V

    const v0, -0x1d58f75c

    invoke-virtual {p0, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lui/i;

    invoke-direct {v0}, Lui/i;-><init>()V

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    check-cast v0, Lui/b;

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static final o0(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0

    :cond_1
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->isFocusable()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0

    :cond_3
    instance-of v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v1, :cond_4

    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0

    :cond_4
    if-eqz p2, :cond_6

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, p2, v1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0

    :cond_6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {v0}, Landroid/view/ViewGroup;->findFocus()Landroid/view/View;

    move-result-object p2

    goto :goto_0

    :cond_7
    const/4 p2, 0x0

    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v0, p2, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/view/View;->requestFocus(I)Z

    move-result p0

    return p0

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->requestFocus(I)Z

    move-result p0

    return p0
.end method

.method public static final p(II)V
    .locals 4

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " type parameters, but "

    const-string v2, " were provided."

    const-string v3, "Class declares "

    invoke-static {p0, p1, v3, v1, v2}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final p0(Ll3/v0;Ly3/m;)Ll3/v0;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Ll3/v0;

    iget-object v2, v0, Ll3/v0;->a:Ll3/m0;

    sget-object v3, Ll3/n0;->d:Lw3/o;

    iget-object v3, v2, Ll3/m0;->a:Lw3/o;

    sget-object v4, Lw3/n;->a:Lw3/n;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    :goto_0
    move-object v5, v3

    goto :goto_1

    :cond_0
    sget-object v3, Ll3/n0;->d:Lw3/o;

    goto :goto_0

    :goto_1
    iget-wide v3, v2, Ll3/m0;->b:J

    sget-object v6, Ly3/o;->b:[Ly3/p;

    const-wide v24, 0xff00000000L

    and-long v6, v3, v24

    const-wide/16 v26, 0x0

    cmp-long v6, v6, v26

    if-nez v6, :cond_1

    sget-wide v3, Ll3/n0;->a:J

    :cond_1
    move-wide v6, v3

    iget-object v3, v2, Ll3/m0;->c:Lp3/r;

    if-nez v3, :cond_2

    sget-object v3, Lp3/r;->F:Lp3/r;

    :cond_2
    move-object v8, v3

    iget-object v3, v2, Ll3/m0;->d:Lp3/n;

    if-eqz v3, :cond_3

    iget v3, v3, Lp3/n;->a:I

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    new-instance v9, Lp3/n;

    invoke-direct {v9, v3}, Lp3/n;-><init>(I)V

    iget-object v3, v2, Ll3/m0;->e:Lp3/o;

    if-eqz v3, :cond_4

    iget v3, v3, Lp3/o;->a:I

    goto :goto_3

    :cond_4
    const v3, 0xffff

    :goto_3
    new-instance v10, Lp3/o;

    invoke-direct {v10, v3}, Lp3/o;-><init>(I)V

    iget-object v3, v2, Ll3/m0;->f:Lp3/i;

    if-nez v3, :cond_5

    sget-object v3, Lp3/i;->w:Lp3/f;

    :cond_5
    move-object v11, v3

    iget-object v3, v2, Ll3/m0;->g:Ljava/lang/String;

    if-nez v3, :cond_6

    const-string v3, ""

    :cond_6
    move-object v12, v3

    iget-wide v3, v2, Ll3/m0;->h:J

    and-long v13, v3, v24

    cmp-long v13, v13, v26

    if-nez v13, :cond_7

    sget-wide v3, Ll3/n0;->b:J

    :cond_7
    move-wide v13, v3

    iget-object v3, v2, Ll3/m0;->i:Lw3/a;

    if-eqz v3, :cond_8

    iget v3, v3, Lw3/a;->a:F

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    :goto_4
    new-instance v15, Lw3/a;

    invoke-direct {v15, v3}, Lw3/a;-><init>(F)V

    iget-object v3, v2, Ll3/m0;->j:Lw3/p;

    if-nez v3, :cond_9

    sget-object v3, Lw3/p;->c:Lw3/p;

    :cond_9
    move-object/from16 v16, v3

    iget-object v3, v2, Ll3/m0;->k:Ls3/b;

    if-nez v3, :cond_a

    sget-object v3, Ls3/b;->y:Ls3/b;

    sget-object v3, Ls3/c;->a:Ls/m2;

    invoke-virtual {v3}, Ls/m2;->i()Ls3/b;

    move-result-object v3

    :cond_a
    move-object/from16 v17, v3

    iget-wide v3, v2, Ll3/m0;->l:J

    const-wide/16 v18, 0x10

    cmp-long v18, v3, v18

    if-eqz v18, :cond_b

    :goto_5
    move-wide/from16 v18, v3

    goto :goto_6

    :cond_b
    sget-wide v3, Ll3/n0;->c:J

    goto :goto_5

    :goto_6
    iget-object v3, v2, Ll3/m0;->m:Lw3/l;

    if-nez v3, :cond_c

    sget-object v3, Lw3/l;->b:Lw3/l;

    :cond_c
    move-object/from16 v20, v3

    iget-object v3, v2, Ll3/m0;->n:Li2/z0;

    if-nez v3, :cond_d

    sget-object v3, Li2/z0;->d:Li2/z0;

    :cond_d
    move-object/from16 v21, v3

    iget-object v3, v2, Ll3/m0;->o:Ll3/f0;

    iget-object v2, v2, Ll3/m0;->p:Lk2/f;

    if-nez v2, :cond_e

    sget-object v2, Lk2/h;->a:Lk2/h;

    :cond_e
    move-object/from16 v23, v2

    new-instance v4, Ll3/m0;

    move-object/from16 v22, v3

    invoke-direct/range {v4 .. v23}, Ll3/m0;-><init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    iget-object v2, v0, Ll3/v0;->b:Ll3/b0;

    sget v3, Ll3/c0;->b:I

    new-instance v5, Ll3/b0;

    iget v3, v2, Ll3/b0;->a:I

    const/4 v6, 0x5

    const/high16 v7, -0x80000000

    if-ne v3, v7, :cond_f

    move v3, v6

    :cond_f
    iget v8, v2, Ll3/b0;->b:I

    const/4 v9, 0x3

    const/4 v10, 0x1

    if-ne v8, v9, :cond_12

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_11

    if-ne v8, v10, :cond_10

    goto :goto_7

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_11
    const/4 v6, 0x4

    goto :goto_7

    :cond_12
    if-ne v8, v7, :cond_15

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_14

    if-ne v6, v10, :cond_13

    const/4 v6, 0x2

    goto :goto_7

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_14
    move v6, v10

    goto :goto_7

    :cond_15
    move v6, v8

    :goto_7
    iget-wide v8, v2, Ll3/b0;->c:J

    and-long v11, v8, v24

    cmp-long v11, v11, v26

    if-nez v11, :cond_16

    sget-wide v8, Ll3/c0;->a:J

    :cond_16
    iget-object v11, v2, Ll3/b0;->d:Lw3/q;

    if-nez v11, :cond_17

    sget-object v11, Lw3/q;->c:Lw3/q;

    :cond_17
    iget-object v12, v2, Ll3/b0;->e:Ll3/e0;

    move v13, v10

    move-object v10, v11

    move-object v11, v12

    iget-object v12, v2, Ll3/b0;->f:Lw3/i;

    iget v14, v2, Ll3/b0;->g:I

    if-nez v14, :cond_18

    sget v14, Lw3/e;->b:I

    :cond_18
    iget v15, v2, Ll3/b0;->h:I

    if-ne v15, v7, :cond_19

    move v15, v13

    :cond_19
    iget-object v2, v2, Ll3/b0;->i:Lw3/s;

    if-nez v2, :cond_1a

    sget-object v2, Lw3/s;->c:Lw3/s;

    :cond_1a
    move v7, v6

    move v13, v14

    move v14, v15

    move-object v15, v2

    move v6, v3

    invoke-direct/range {v5 .. v15}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    iget-object v0, v0, Ll3/v0;->c:Ll3/g0;

    invoke-direct {v1, v4, v5, v0}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;Ll3/g0;)V

    return-object v1
.end method

.method public static final q(JLh0/d2;)V
    .locals 2

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    const v1, 0x7fffffff

    if-ne p2, v0, :cond_1

    invoke-static {p0, p1}, Ly3/a;->h(J)I

    move-result p0

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    invoke-static {p0}, Lk0/a;->c(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p0, p1}, Ly3/a;->i(J)I

    move-result p0

    if-eq p0, v1, :cond_2

    :goto_0
    return-void

    :cond_2
    const-string p0, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    invoke-static {p0}, Lk0/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static final q0(Lqa3/c0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/c0;->y:I

    and-int/lit8 v1, v0, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/c0;->G:Lqa3/w0;

    const-string p1, "getReturnType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/c0;->H:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No returnType in ProtoBuf.Function"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    .locals 4

    if-eqz p0, :cond_8

    if-nez p1, :cond_7

    instance-of p1, p0, Ljava/lang/AutoCloseable;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    goto :goto_1

    :cond_0
    instance-of p1, p0, Ljava/util/concurrent/ExecutorService;

    if-eqz p1, :cond_4

    check-cast p0, Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object p1

    if-ne p0, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-interface {p0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    if-nez v0, :cond_2

    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_8

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    :cond_4
    instance-of p1, p0, Landroid/content/res/TypedArray;

    if-eqz p1, :cond_5

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1

    :cond_5
    instance-of p1, p0, Landroid/media/MediaMetadataRetriever;

    if-eqz p1, :cond_6

    check-cast p0, Landroid/media/MediaMetadataRetriever;

    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_1

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_7
    :try_start_1
    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_8
    :goto_1
    return-void
.end method

.method public static final r0(Lqa3/k0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/k0;->y:I

    and-int/lit8 v1, v0, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/k0;->G:Lqa3/w0;

    const-string p1, "getReturnType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/k0;->H:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No returnType in ProtoBuf.Property"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final s(Ltb/c;Ljava/lang/String;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljc/x;->t(Ltb/c;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "`"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x60

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ljc/x;->t(Ltb/c;Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_1

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static final s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p0, p1, p2}, Lgf/l;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final t(Ltb/c;Ljava/lang/String;)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ltb/c;->getColumnCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p0, v1}, Ltb/c;->getColumnName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static final t0(Lqa3/k;Lsa3/h;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqa3/k;->H:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object p0, p0, Lqa3/k;->I:Ljava/util/List;

    const-string v0, "getSupertypeIdList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static final u(Lr93/i;)Ljava/util/List;
    .locals 7

    invoke-interface {p0}, Lr93/i;->j()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/i;->isInner()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v2

    instance-of v2, v2, Lr93/b;

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    sget v2, Lcb3/e;->a:I

    sget-object v2, Lcb3/b;->x:Lcb3/b;

    invoke-static {p0, v2}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lxb3/k;->q(Lxb3/i;I)Lxb3/i;

    move-result-object v3

    sget-object v5, Lr93/t;->z:Lr93/t;

    new-instance v6, Lxb3/o;

    invoke-direct {v6, v3, v5}, Lxb3/o;-><init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Lr93/t;->E:Lr93/t;

    invoke-static {v6, v3}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v3

    sget-object v5, Lr93/t;->F:Lr93/t;

    invoke-static {v3, v5}, Lxb3/k;->t(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object v3

    invoke-static {v3}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v3

    invoke-static {p0, v2}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v2

    invoke-static {v2, v4}, Lxb3/k;->q(Lxb3/i;I)Lxb3/i;

    move-result-object v2

    invoke-interface {v2}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Lr93/e;

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    move-object v4, v5

    :goto_0
    check-cast v4, Lr93/e;

    if-eqz v4, :cond_3

    invoke-interface {v4}, Lr93/h;->e()Llb3/q0;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    :cond_3
    if-nez v5, :cond_4

    sget-object v5, Lm83/y;->w:Lm83/y;

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Lr93/i;->j()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_5
    check-cast v3, Ljava/util/Collection;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v3, v5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/x0;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Lr93/d;

    invoke-direct {v5, v3, p0, v4}, Lr93/d;-><init>(Lr93/x0;Lr93/i;I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(I)Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x5

    invoke-static {p0, v0}, Lg2/d;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x21

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x6

    invoke-static {p0, v0}, Lg2/d;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, 0x82

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v0, 0x3

    invoke-static {p0, v0}, Lg2/d;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0x11

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v0, 0x4

    invoke-static {p0, v0}, Lg2/d;->b(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p0, 0x42

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lg2/d;->b(II)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0, v2}, Lg2/d;->b(II)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final v(Lqa3/k;Lsa3/h;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqa3/k;->M:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object p0, p0, Lqa3/k;->N:Ljava/util/List;

    const-string v0, "getContextReceiverTypeIdList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static final v0(I)Lg2/d;
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_4

    const/16 v0, 0x11

    if-eq p0, v0, :cond_3

    const/16 v0, 0x21

    if-eq p0, v0, :cond_2

    const/16 v0, 0x42

    if-eq p0, v0, :cond_1

    const/16 v0, 0x82

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 p0, 0x6

    invoke-static {p0}, Lg2/d;->a(I)Lg2/d;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x4

    invoke-static {p0}, Lg2/d;->a(I)Lg2/d;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x5

    invoke-static {p0}, Lg2/d;->a(I)Lg2/d;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x3

    invoke-static {p0}, Lg2/d;->a(I)Lg2/d;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {v1}, Lg2/d;->a(I)Lg2/d;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-static {v0}, Lg2/d;->a(I)Lg2/d;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lqa3/c0;Lsa3/h;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqa3/c0;->L:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object p0, p0, Lqa3/c0;->M:Ljava/util/List;

    const-string v0, "getContextReceiverTypeIdList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static final w0(Lgf/b;)Lgf/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgf/c;

    invoke-direct {v0, p0}, Lgf/c;-><init>(Lgf/b;)V

    return-object v0
.end method

.method public static final x(Lqa3/k0;Lsa3/h;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqa3/k0;->L:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object p0, p0, Lqa3/k0;->M:Ljava/util/List;

    const-string v0, "getContextReceiverTypeIdList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static final x0(Lqa3/u0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/u0;->x:I

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/u0;->z:Lqa3/w0;

    return-object p0

    :cond_0
    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/u0;->E:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static y(Ljava/lang/String;Ljava/lang/String;)Lgt/b;
    .locals 9

    new-instance v0, Lbu/a;

    invoke-direct {v0, p0, p1}, Lbu/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    const-class v1, Lbu/a;

    invoke-static {v1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v7, Lcom/whoop/data/repositories/c;

    const/4 v1, 0x4

    invoke-direct {v7, v0, v1}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lgt/b;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v8}, Lgt/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILgt/e;Ljava/util/Set;)V

    return-object v1
.end method

.method public static final y0(Lqa3/e1;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/e1;->y:I

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/e1;->F:Lqa3/w0;

    const-string p1, "getType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/e1;->G:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No type in ProtoBuf.ValueParameter"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final z(Lj93/e;Ljava/util/List;ZLjava/util/List;)Lwb3/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Ljc/x;->A(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/d;)Lwb3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lqa3/y0;Lsa3/h;)Lqa3/w0;
    .locals 3

    const-string v0, "typeTable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/y0;->y:I

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    iget-object p0, p0, Lqa3/y0;->G:Lqa3/w0;

    const-string p1, "getUnderlyingType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget p0, p0, Lqa3/y0;->H:I

    invoke-virtual {p1, p0}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No underlyingType in ProtoBuf.TypeAlias"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract F(Lno/nordicsemi/android/ble/k0;)V
.end method

.method public abstract e0(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/m0;)V
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract n()V
.end method

.method public abstract o()V
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ljc/x;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Ljc/x;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method
