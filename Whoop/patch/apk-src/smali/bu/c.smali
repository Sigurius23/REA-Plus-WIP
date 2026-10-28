.class public Lbu/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/e0;
.implements Loh/a;
.implements Lbh3/g;
.implements Lcom/iterable/iterableapi/f0;
.implements Ld0/s;
.implements Lwk/f;
.implements Lig3/b;
.implements Lio/sentry/q1;
.implements Lio/sentry/l4;
.implements Lkb3/m;
.implements Lh5/u;
.implements Loa3/n;
.implements Lpg3/h;
.implements Ltb/b;


# static fields
.field public static volatile x:Lbu/c;

.field public static y:Ljava/lang/Boolean;


# instance fields
.field public w:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lbu/c;->y:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    sparse-switch p1, :sswitch_data_0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 9
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, La0/y;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 11
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Lio/sentry/util/f;

    new-instance v0, Li5/c;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Li5/c;-><init>(I)V

    invoke-direct {p1, v0}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 13
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, Ljava/lang/ThreadLocal;

    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 15
    new-instance p1, Lhg3/a;

    .line 16
    invoke-direct {p1}, Ljava/lang/InheritableThreadLocal;-><init>()V

    .line 17
    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    .line 19
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 20
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-object p1, Lek/b;->w:Lek/b;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget-object p1, La6/h1;->b:La6/h1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x9 -> :sswitch_5
        0xa -> :sswitch_4
        0xb -> :sswitch_3
        0x10 -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lub/e;)V
    .locals 1

    const-string v0, "openHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly3/c;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lc0/i1;

    .line 4
    sget v1, Lc0/t1;->a:F

    .line 5
    invoke-direct {v0, v1, p1}, Lc0/i1;-><init>(FLy3/c;)V

    iput-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    return-void
.end method

.method public static B(Lmh/j;Ljava/lang/Throwable;)Lmh/e;
    .locals 3

    new-instance v0, Lmh/e;

    instance-of v1, p1, Lcoil/request/NullRequestDataException;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lmh/j;->F:Lmh/c;

    iget-object v2, p0, Lmh/j;->D:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v2}, Lqh/b;->b(Lmh/j;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lmh/j;->C:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v2}, Lqh/b;->b(Lmh/j;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lmh/j;->C:Ljava/lang/Integer;

    iget-object v2, p0, Lmh/j;->F:Lmh/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v1}, Lqh/b;->b(Lmh/j;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-direct {v0, v2, p0, p1}, Lmh/e;-><init>(Landroid/graphics/drawable/Drawable;Lmh/j;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 1

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lp1/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public C()La6/e1;
    .locals 1

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/e1;

    return-object v0
.end method

.method public D(Ljava/util/Map;Ljava/util/ArrayList;ZZ)Ljava/util/ArrayList;
    .locals 9

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    const/4 v4, 0x0

    if-ne v3, v0, :cond_1

    if-eqz p3, :cond_2

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p3, :cond_3

    :cond_2
    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/StackTraceElement;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Thread;

    new-instance v6, Lio/sentry/protocol/c0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Thread;->getPriority()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/c0;->x:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Thread;->isDaemon()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/c0;->G:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v6, Lio/sentry/protocol/c0;->z:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v6, Lio/sentry/protocol/c0;->E:Ljava/lang/Boolean;

    if-eqz p4, :cond_4

    iget-object v2, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v2, Laj/d;

    invoke-virtual {v2, v5, v4}, Laj/d;->n([Ljava/lang/StackTraceElement;Z)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    new-instance v3, Lio/sentry/protocol/b0;

    invoke-direct {v3, v2}, Lio/sentry/protocol/b0;-><init>(Ljava/util/List;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, v3, Lio/sentry/protocol/b0;->y:Ljava/lang/Boolean;

    iput-object v3, v6, Lio/sentry/protocol/c0;->I:Lio/sentry/protocol/b0;

    :cond_4
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    return-object v1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method public E(Lgj/d;)Lfk/a;
    .locals 1

    const-string v0, "amplitude"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfk/a;

    return-object p1
.end method

.method public F(ILjava/lang/String;)V
    .locals 1

    sget-object v0, Lbu/c;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public G(Lmh/j;Lnh/h;)Lmh/m;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v4, p2

    iget-object v1, v0, Lmh/j;->i:Ljava/util/List;

    iget-object v2, v0, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v2, v1, :cond_2

    if-ne v2, v1, :cond_2

    iget-boolean v1, v0, Lmh/j;->n:Z

    if-nez v1, :cond_2

    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_2
    iget-object v1, v4, Lnh/h;->a:Ldt/b;

    sget-object v3, Lnh/b;->a:Lnh/b;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, v4, Lnh/h;->b:Ldt/b;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lmh/j;->z:Lnh/g;

    :goto_0
    move-object v5, v1

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v1, Lnh/g;->x:Lnh/g;

    goto :goto_0

    :goto_2
    iget-boolean v1, v0, Lmh/j;->o:Z

    if-eqz v1, :cond_5

    iget-object v1, v0, Lmh/j;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-eq v2, v1, :cond_5

    const/4 v1, 0x1

    :goto_3
    move v7, v1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    new-instance v1, Lmh/m;

    move-object v3, v1

    iget-object v1, v0, Lmh/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lqh/b;->a(Lmh/j;)Z

    move-result v6

    iget-boolean v8, v0, Lmh/j;->p:Z

    iget-object v10, v0, Lmh/j;->k:Lud3/d0;

    iget-object v11, v0, Lmh/j;->l:Lmh/p;

    iget-object v12, v0, Lmh/j;->A:Lmh/n;

    iget-object v13, v0, Lmh/j;->q:Lmh/b;

    iget-object v14, v0, Lmh/j;->r:Lmh/b;

    iget-object v15, v0, Lmh/j;->s:Lmh/b;

    move-object v0, v3

    const/4 v3, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v15}, Lmh/m;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lnh/h;Lnh/g;ZZZLjava/lang/String;Lud3/d0;Lmh/p;Lmh/n;Lmh/b;Lmh/b;Lmh/b;)V

    return-object v0
.end method

.method public H(Lso/q;Landroidx/compose/ui/platform/AndroidComposeView;)Lf1/p1;
    .locals 34

    move-object/from16 v0, p0

    iget-object v1, v0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v1, La0/y;

    new-instance v2, La0/y;

    invoke-virtual/range {p1 .. p1}, Lso/q;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, La0/y;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Lso/q;->e()Ljava/util/List;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/t;

    invoke-virtual {v7}, Lu2/t;->c()J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/s;

    if-nez v8, :cond_0

    invoke-virtual {v7}, Lu2/t;->j()J

    move-result-wide v8

    invoke-virtual {v7}, Lu2/t;->e()J

    move-result-wide v10

    move/from16 v27, v5

    move-wide/from16 v23, v8

    move-wide/from16 v25, v10

    move-object/from16 v8, p2

    goto :goto_1

    :cond_0
    invoke-virtual {v8}, Lu2/s;->c()J

    move-result-wide v9

    invoke-virtual {v8}, Lu2/s;->a()Z

    move-result v11

    invoke-virtual {v8}, Lu2/s;->b()J

    move-result-wide v12

    move-object/from16 v8, p2

    invoke-virtual {v8, v12, v13}, Landroidx/compose/ui/platform/AndroidComposeView;->K(J)J

    move-result-wide v12

    move-wide/from16 v23, v9

    move/from16 v27, v11

    move-wide/from16 v25, v12

    :goto_1
    invoke-virtual {v7}, Lu2/t;->c()J

    move-result-wide v9

    new-instance v14, Lu2/r;

    invoke-virtual {v7}, Lu2/t;->c()J

    move-result-wide v15

    invoke-virtual {v7}, Lu2/t;->j()J

    move-result-wide v17

    invoke-virtual {v7}, Lu2/t;->e()J

    move-result-wide v19

    invoke-virtual {v7}, Lu2/t;->a()Z

    move-result v21

    invoke-virtual {v7}, Lu2/t;->g()F

    move-result v22

    invoke-virtual {v7}, Lu2/t;->i()I

    move-result v28

    invoke-virtual {v7}, Lu2/t;->b()Ljava/util/List;

    move-result-object v29

    invoke-virtual {v7}, Lu2/t;->h()J

    move-result-wide v30

    invoke-virtual {v7}, Lu2/t;->d()J

    move-result-wide v32

    invoke-direct/range {v14 .. v33}, Lu2/r;-><init>(JJJZFJJZILjava/util/List;JJ)V

    invoke-virtual {v2, v9, v10, v14}, La0/y;->g(JLjava/lang/Object;)V

    invoke-virtual {v7}, Lu2/t;->a()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v7}, Lu2/t;->c()J

    move-result-wide v9

    new-instance v11, Lu2/s;

    invoke-virtual {v7}, Lu2/t;->j()J

    move-result-wide v12

    invoke-virtual {v7}, Lu2/t;->f()J

    move-result-wide v15

    invoke-virtual {v7}, Lu2/t;->a()Z

    move-result v14

    invoke-direct/range {v11 .. v16}, Lu2/s;-><init>(JZJ)V

    invoke-virtual {v1, v9, v10, v11}, La0/y;->g(JLjava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v7}, Lu2/t;->c()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, La0/y;->h(J)V

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_2
    new-instance v1, Lf1/p1;

    const/16 v3, 0x9

    move-object/from16 v4, p1

    invoke-direct {v1, v3, v2, v4}, Lf1/p1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public I(Lx93/n;)Lr93/e;
    .locals 4

    invoke-virtual {p1}, Lx93/n;->c()Lva3/e;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lma3/g;->w:[Lma3/g;

    :cond_0
    iget-object v1, p1, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v3, Lx93/n;

    invoke-direct {v3, v1}, Lx93/n;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_4

    invoke-virtual {p0, v3}, Lbu/c;->I(Lx93/n;)Lr93/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lr93/e;->H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lx93/n;->e()Lva3/h;

    move-result-object p1

    sget-object v1, Lz93/c;->H:Lz93/c;

    invoke-interface {v0, p1, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p1

    goto :goto_2

    :cond_3
    move-object p1, v2

    :goto_2
    instance-of v0, p1, Lr93/e;

    if-eqz v0, :cond_6

    check-cast p1, Lr93/e;

    return-object p1

    :cond_4
    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v1, Lia3/d;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lia3/d;->c(Lva3/e;)Lja3/q;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lja3/q;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lja3/q;->K:Lja3/d;

    iget-object v0, v0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lx93/n;->e()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lja3/v;->o(Lva3/h;Lx93/n;)Lr93/e;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_3
    return-object v2
.end method

.method public J(La6/e1;)V
    .locals 5

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    :cond_0
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, La6/e1;

    instance-of v3, v2, La6/v0;

    if-nez v3, :cond_5

    sget-object v3, La6/h1;->b:La6/h1;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    instance-of v3, v2, La6/b;

    if-eqz v3, :cond_2

    iget v3, p1, La6/e1;->a:I

    move-object v4, v2

    check-cast v4, La6/b;

    iget v4, v4, La6/e1;->a:I

    if-le v3, v4, :cond_6

    goto :goto_0

    :cond_2
    instance-of v3, v2, La6/s0;

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    instance-of p1, v2, La6/u0;

    if-eqz p1, :cond_4

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    move-object v2, p1

    :cond_6
    :goto_1
    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public K(Lmh/m;)Lmh/m;
    .locals 16

    move-object/from16 v0, p1

    iget-object v2, v0, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    iget-object v1, v0, Lmh/m;->o:Lmh/b;

    sget-object v3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iget-boolean v3, v1, Lmh/b;->w:Z

    if-eqz v3, :cond_0

    move-object/from16 v3, p0

    iget-object v4, v3, Lbu/c;->w:Ljava/lang/Object;

    check-cast v4, Lqh/g;

    monitor-enter v4

    :try_start_0
    invoke-virtual {v4}, Lqh/g;->a()V

    iget-boolean v5, v4, Lqh/g;->E:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    if-nez v5, :cond_1

    sget-object v1, Lmh/b;->z:Lmh/b;

    const/4 v4, 0x1

    :goto_0
    move-object v15, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    move-object/from16 v3, p0

    :cond_1
    const/4 v4, 0x0

    goto :goto_0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v1, v0, Lmh/m;->a:Landroid/content/Context;

    iget-object v3, v0, Lmh/m;->c:Landroid/graphics/ColorSpace;

    iget-object v4, v0, Lmh/m;->d:Lnh/h;

    iget-object v5, v0, Lmh/m;->e:Lnh/g;

    iget-boolean v6, v0, Lmh/m;->f:Z

    iget-boolean v7, v0, Lmh/m;->g:Z

    iget-boolean v8, v0, Lmh/m;->h:Z

    iget-object v9, v0, Lmh/m;->i:Ljava/lang/String;

    iget-object v10, v0, Lmh/m;->j:Lud3/d0;

    iget-object v11, v0, Lmh/m;->k:Lmh/p;

    iget-object v12, v0, Lmh/m;->l:Lmh/n;

    iget-object v13, v0, Lmh/m;->m:Lmh/b;

    iget-object v14, v0, Lmh/m;->n:Lmh/b;

    new-instance v0, Lmh/m;

    invoke-direct/range {v0 .. v15}, Lmh/m;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lnh/h;Lnh/g;ZZZLjava/lang/String;Lud3/d0;Lmh/p;Lmh/n;Lmh/b;Lmh/b;Lmh/b;)V

    :cond_2
    return-object v0
.end method

.method public L(ILjava/lang/Exception;)V
    .locals 1

    sget-object v0, Lbu/c;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public M(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0, p1}, Lbu/c;->L(ILjava/lang/Exception;)V

    return-void
.end method

.method public a([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 2

    check-cast p2, Ljava/lang/Integer;

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/security/MessageDigest;->update([B)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lbh3/g;

    invoke-interface {v0, p1}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lxg3/g;->u(Ljava/lang/Object;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lhg3/a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lhg3/a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_0
    return-void
.end method

.method public d(FJ)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p2, v0

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lc0/i1;

    invoke-virtual {v0, p1}, Lc0/i1;->a(F)Lc0/h1;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lc0/h1;->b(J)F

    move-result p1

    return p1
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    new-instance v1, Lcoil/compose/AsyncImagePainter$State$Loading;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lcoil/compose/AsyncImagePainter;->j(Landroid/graphics/drawable/Drawable;)Ln2/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v1, p1}, Lcoil/compose/AsyncImagePainter$State$Loading;-><init>(Ln2/a;)V

    invoke-virtual {v0, v1}, Lcoil/compose/AsyncImagePainter;->k(Lch/f;)V

    return-void
.end method

.method public f()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lhg3/a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Lpg3/e;Lpg3/v0;)V
    .locals 0

    iget-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public get(I)Ld0/d0;
    .locals 0

    iget-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Ld0/g0;

    return-object p1
.end method

.method public h(Ljava/lang/String;)Ltb/a;
    .locals 4

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lub/e;

    invoke-interface {v0}, Lub/e;->getDatabaseName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\' was requested."

    if-nez v1, :cond_1

    const-string v1, ":memory:"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "This driver is configured to open an in-memory database but a file-based named \'"

    invoke-static {v0, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const/16 v3, 0x2f

    invoke-static {v3, v1, v1}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, p1, p1}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "This driver is configured to open a database named \'"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Lub/e;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' but \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    new-instance p1, Lwb/a;

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-direct {p1, v0}, Lwb/a;-><init>(Lub/a;)V

    return-object p1
.end method

.method public i(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/d1;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "inAppMessages"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/iterable/iterableapi/j1;->d(Lorg/json/JSONObject;La3/p;)Lcom/iterable/iterableapi/j1;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, Lcom/iterable/iterableapi/d1;->c(Lcom/iterable/iterableapi/d1;Ljava/util/ArrayList;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/iterable/iterableapi/d1;->I:J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :goto_2
    const-string v0, "IterableInAppManager"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/iterable/iterableapi/d1;->h()V

    return-void
.end method

.method public j()Z
    .locals 2

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    iget-object v1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getFatalLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/l5;->c(Lio/sentry/v0;)Z

    move-result v0

    return v0
.end method

.method public k()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l()V
    .locals 0

    return-void
.end method

.method public lock()V
    .locals 1

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    return-void
.end method

.method public m(Lva3/h;)Loa3/o;
    .locals 1

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "d1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lpa3/c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lpa3/c;-><init>(Lbu/c;I)V

    return-object p1

    :cond_0
    const-string v0, "d2"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lpa3/c;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lpa3/c;-><init>(Lbu/c;I)V

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public n(Lva3/h;Lab3/f;)V
    .locals 0

    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 16

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->d()I

    move-result v1

    move-object/from16 v2, p0

    iget-object v0, v2, Lbu/c;->w:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lm/a0;

    iget-object v4, v3, Lm/a0;->K:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->d()I

    move-result v5

    iget-object v0, v3, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_11

    iget-object v0, v3, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v0, v3, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    const/4 v9, 0x1

    if-eqz v0, :cond_f

    iget-object v0, v3, Lm/a0;->C0:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v3, Lm/a0;->C0:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v3, Lm/a0;->D0:Landroid/graphics/Rect;

    :cond_0
    iget-object v10, v3, Lm/a0;->C0:Landroid/graphics/Rect;

    iget-object v0, v3, Lm/a0;->D0:Landroid/graphics/Rect;

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->b()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->d()I

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->c()I

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->a()I

    move-result v14

    invoke-virtual {v10, v11, v12, v13, v14}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v11, v3, Lm/a0;->a0:Landroid/view/ViewGroup;

    const-class v12, Landroid/graphics/Rect;

    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x1d

    if-lt v13, v14, :cond_1

    invoke-static {v11, v10, v0}, Ls/x2;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_1
    sget-boolean v13, Le93/b;->b:Z

    const-string v14, "ViewUtils"

    if-nez v13, :cond_2

    sput-boolean v9, Le93/b;->b:Z

    :try_start_0
    const-class v13, Landroid/view/View;

    const-string v15, "computeFitSystemWindows"

    filled-new-array {v12, v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v13, v15, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    sput-object v12, Le93/b;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v12}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v12

    if-nez v12, :cond_2

    sget-object v12, Le93/b;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v12, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v12, "Could not find method computeFitSystemWindows. Oh well."

    invoke-static {v14, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    sget-object v12, Le93/b;->c:Ljava/lang/reflect/Method;

    if-eqz v12, :cond_3

    :try_start_1
    filled-new-array {v10, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v11, "Could not invoke computeFitSystemWindows"

    invoke-static {v14, v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_1
    iget v0, v10, Landroid/graphics/Rect;->top:I

    iget v11, v10, Landroid/graphics/Rect;->left:I

    iget v10, v10, Landroid/graphics/Rect;->right:I

    iget-object v12, v3, Lm/a0;->a0:Landroid/view/ViewGroup;

    sget-object v13, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v12}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object v12

    if-nez v12, :cond_4

    move v13, v7

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lh5/q1;->b()I

    move-result v13

    :goto_2
    if-nez v12, :cond_5

    move v12, v7

    goto :goto_3

    :cond_5
    invoke-virtual {v12}, Lh5/q1;->c()I

    move-result v12

    :goto_3
    iget v14, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v14, v0, :cond_7

    iget v14, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v14, v11, :cond_7

    iget v14, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v14, v10, :cond_6

    goto :goto_4

    :cond_6
    move v10, v7

    goto :goto_5

    :cond_7
    :goto_4
    iput v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v10, v9

    :goto_5
    if-lez v0, :cond_8

    iget-object v0, v3, Lm/a0;->c0:Landroid/view/View;

    if-nez v0, :cond_8

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, v3, Lm/a0;->c0:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v14, 0x33

    const/4 v15, -0x1

    invoke-direct {v0, v15, v11, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v12, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v11, v3, Lm/a0;->a0:Landroid/view/ViewGroup;

    iget-object v12, v3, Lm/a0;->c0:Landroid/view/View;

    invoke-virtual {v11, v12, v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_6

    :cond_8
    iget-object v0, v3, Lm/a0;->c0:Landroid/view/View;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v11, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v14, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v11, v14, :cond_9

    iget v11, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v11, v13, :cond_9

    iget v11, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v11, v12, :cond_a

    :cond_9
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v11, v3, Lm/a0;->c0:Landroid/view/View;

    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    :goto_6
    iget-object v0, v3, Lm/a0;->c0:Landroid/view/View;

    if-eqz v0, :cond_b

    goto :goto_7

    :cond_b
    move v9, v7

    :goto_7
    if-eqz v9, :cond_d

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, v3, Lm/a0;->c0:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v11

    and-int/lit16 v11, v11, 0x2000

    if-eqz v11, :cond_c

    const v11, 0x7f060059

    invoke-static {v4, v11}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    goto :goto_8

    :cond_c
    const v11, 0x7f060058

    invoke-static {v4, v11}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    :goto_8
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_d
    iget-boolean v0, v3, Lm/a0;->h0:Z

    if-nez v0, :cond_e

    if-eqz v9, :cond_e

    move v5, v7

    :cond_e
    move v0, v9

    move v9, v10

    goto :goto_9

    :cond_f
    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v0, :cond_10

    iput v7, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v0, v7

    goto :goto_9

    :cond_10
    move v0, v7

    move v9, v0

    :goto_9
    if-eqz v9, :cond_12

    iget-object v4, v3, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_a

    :cond_11
    move v0, v7

    :cond_12
    :goto_a
    iget-object v3, v3, Lm/a0;->c0:Landroid/view/View;

    if-eqz v3, :cond_14

    if-eqz v0, :cond_13

    move v6, v7

    :cond_13
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    :cond_14
    if-eq v1, v5, :cond_15

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->b()I

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->c()I

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lh5/q1;->a()I

    move-result v3

    move-object/from16 v4, p2

    invoke-virtual {v4, v0, v5, v1, v3}, Lh5/q1;->f(IIII)Lh5/q1;

    move-result-object v0

    :goto_b
    move-object/from16 v1, p1

    goto :goto_c

    :cond_15
    move-object/from16 v4, p2

    move-object v0, v4

    goto :goto_b

    :goto_c
    invoke-static {v1, v0}, Lh5/p0;->i(Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object v0

    return-object v0
.end method

.method public p(Lva3/h;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lpa3/f;

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "k"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    instance-of p1, p2, Ljava/lang/Integer;

    if-eqz p1, :cond_4

    check-cast p2, Ljava/lang/Integer;

    sget-object p1, Lpa3/a;->x:Ljc/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lpa3/a;->y:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpa3/a;

    if-nez p1, :cond_0

    sget-object p1, Lpa3/a;->z:Lpa3/a;

    :cond_0
    iput-object p1, v0, Lpa3/f;->G:Lpa3/a;

    return-void

    :cond_1
    const-string v1, "mv"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of p1, p2, [I

    if-eqz p1, :cond_4

    check-cast p2, [I

    iput-object p2, v0, Lpa3/f;->w:[I

    return-void

    :cond_2
    const-string v1, "xs"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_4

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    iput-object p2, v0, Lpa3/f;->x:Ljava/lang/String;

    return-void

    :cond_3
    const-string v1, "xi"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    instance-of p1, p2, Ljava/lang/Integer;

    if-eqz p1, :cond_4

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lpa3/f;->y:I

    :cond_4
    return-void

    :cond_5
    const-string p2, "pn"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    return-void
.end method

.method public q(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 0

    return-void
.end method

.method public r(Lpg3/e;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public s(Lva3/c;Lva3/h;)Loa3/n;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public t(Lio/sentry/d1;Lio/sentry/q6;)Lio/sentry/k4;
    .locals 9

    const-string v0, "Scopes are required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SentryOptions is required"

    invoke-static {p2, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/p;

    iget-object v0, v0, Lio/sentry/android/core/p;->x:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-static {v1, v0}, Lio/sentry/l4;->y(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lio/sentry/a0;

    invoke-virtual {p2}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v4

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    invoke-virtual {p2}, Lio/sentry/q6;->getFlushTimeoutMillis()J

    move-result-wide v6

    invoke-virtual {p2}, Lio/sentry/q6;->getMaxQueueSize()I

    move-result v8

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lio/sentry/a0;-><init>(Lio/sentry/d1;Lio/sentry/j1;Lio/sentry/v0;JI)V

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lio/sentry/k4;

    invoke-direct {v1, p1, v0, v2, p2}, Lio/sentry/k4;-><init>(Lio/sentry/v0;Ljava/lang/String;Lio/sentry/v;Ljava/io/File;)V

    return-object v1

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "No cache dir path is defined in options."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public u(FJF)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p2, v0

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lc0/i1;

    invoke-virtual {v0, p4}, Lc0/i1;->a(F)Lc0/h1;

    move-result-object p4

    invoke-virtual {p4, p2, p3}, Lc0/h1;->a(J)F

    move-result p2

    add-float/2addr p2, p1

    return p2
.end method

.method public unlock()V
    .locals 1

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method public v(Ljava/util/Map;)V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Lhg3/a;

    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public w(F)J
    .locals 6

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lc0/i1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lc0/b;->a:[F

    iget v1, v0, Lc0/i1;->a:F

    iget v0, v0, Lc0/i1;->b:F

    mul-float/2addr v1, v0

    invoke-static {p1, v1}, Lc0/b;->a(FF)D

    move-result-wide v0

    sget p1, Lc0/j1;->a:F

    float-to-double v2, p1

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public x(FF)F
    .locals 8

    iget-object v0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Lc0/i1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lc0/b;->a:[F

    iget v1, v0, Lc0/i1;->a:F

    iget v0, v0, Lc0/i1;->b:F

    mul-float v2, v1, v0

    invoke-static {p2, v2}, Lc0/b;->a(FF)D

    move-result-wide v2

    sget v4, Lc0/j1;->a:F

    float-to-double v4, v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double v6, v4, v6

    mul-float/2addr v1, v0

    float-to-double v0, v1

    div-double/2addr v4, v6

    mul-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    mul-double/2addr v2, v0

    double-to-float v0, v2

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    mul-float/2addr p2, v0

    add-float/2addr p2, p1

    return p2
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
