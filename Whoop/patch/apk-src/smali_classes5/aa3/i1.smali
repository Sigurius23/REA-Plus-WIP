.class public final Laa3/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt/c;
.implements Ll3/a0;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Laa3/i1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La3/l0;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Laa3/i1;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 24
    iput-object p1, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 26
    iput-object p1, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Lcom/iterable/iterableapi/o1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Laa3/i1;->a:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 10
    iput-object p2, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 11
    iput-object p3, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Laa3/i1;->a:I

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 163
    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 164
    const-string p1, "topic_operation_queue"

    iput-object p1, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 165
    const-string p1, ","

    iput-object p1, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 166
    iput-object p2, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbh/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Laa3/i1;->a:I

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iget-object v0, p1, Lbh/b;->a:Ljava/util/List;

    .line 169
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 170
    iget-object v0, p1, Lbh/b;->b:Ljava/util/List;

    .line 171
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 172
    iget-object v0, p1, Lbh/b;->c:Ljava/util/List;

    .line 173
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 174
    iget-object v0, p1, Lbh/b;->d:Ljava/util/List;

    .line 175
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 176
    iget-object p1, p1, Lbh/b;->e:Ljava/util/List;

    .line 177
    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgt/b;Lgt/c;)V
    .locals 11

    const/4 v0, 0x4

    iput v0, p0, Laa3/i1;->a:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 36
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 37
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 38
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 39
    iget-object v5, p1, Lgt/b;->c:Ljava/util/Set;

    iget-object p1, p1, Lgt/b;->g:Ljava/util/Set;

    .line 40
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgt/j;

    .line 41
    iget v7, v6, Lgt/j;->c:I

    iget v8, v6, Lgt/j;->b:I

    if-nez v7, :cond_0

    const/4 v9, 0x1

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    .line 42
    :goto_1
    iget-object v6, v6, Lgt/j;->a:Lgt/p;

    const/4 v10, 0x2

    if-eqz v9, :cond_2

    if-ne v8, v10, :cond_1

    .line 43
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-ne v7, v10, :cond_3

    .line 45
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-ne v8, v10, :cond_4

    .line 46
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_4
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 48
    :cond_5
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    .line 49
    const-class p1, Lpt/a;

    invoke-static {p1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 51
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 52
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 53
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 54
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 55
    iput-object p2, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj93/d;Lvf3/a;Lc93/a;Lc93/a;Landroidx/lifecycle/e2;Lpb/f;)V
    .locals 0

    const/4 p5, 0x6

    iput p5, p0, Laa3/i1;->a:I

    const-string p5, "clazz"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 7
    iput-object p6, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Double;)V
    .locals 7

    const/4 v0, 0x5

    iput v0, p0, Laa3/i1;->a:I

    .line 13
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 7

    const/4 v0, 0x5

    iput v0, p0, Laa3/i1;->a:I

    .line 20
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Laa3/i1;->a:I

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 58
    iput-object p2, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 59
    iput-object p3, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 61
    iput-object p5, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Laa3/i1;->a:I

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 30
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Laa3/i1;->e:Ljava/lang/Object;

    .line 32
    new-instance p1, Lb3/z1;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lb3/z1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll3/g;Ll3/v0;Ljava/util/List;Ly3/c;Lp3/h;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v3, 0x8

    iput v3, v0, Laa3/i1;->a:I

    .line 62
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object v1, v0, Laa3/i1;->b:Ljava/lang/Object;

    move-object/from16 v3, p3

    .line 64
    iput-object v3, v0, Laa3/i1;->c:Ljava/lang/Object;

    .line 65
    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v4, Ll3/x;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Ll3/x;-><init>(Laa3/i1;I)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    iput-object v4, v0, Laa3/i1;->d:Ljava/lang/Object;

    .line 66
    new-instance v4, Ll3/x;

    const/4 v6, 0x1

    invoke-direct {v4, v0, v6}, Ll3/x;-><init>(Laa3/i1;I)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    iput-object v3, v0, Laa3/i1;->e:Ljava/lang/Object;

    .line 67
    iget-object v3, v2, Ll3/v0;->b:Ll3/b0;

    .line 68
    sget-object v4, Ll3/h;->a:Ll3/g;

    .line 69
    iget-object v4, v1, Ll3/g;->z:Ljava/util/ArrayList;

    iget-object v7, v1, Ll3/g;->x:Ljava/lang/String;

    .line 70
    sget-object v8, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_0

    .line 71
    new-instance v9, Ll3/f;

    invoke-direct {v9, v6}, Ll3/f;-><init>(I)V

    invoke-static {v4, v9}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v8

    .line 72
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 73
    new-instance v9, Lm83/m;

    invoke-direct {v9}, Lm83/m;-><init>()V

    .line 74
    move-object v10, v4

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    move v11, v5

    move v12, v11

    :goto_1
    if-ge v11, v10, :cond_9

    .line 75
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 76
    check-cast v13, Ll3/e;

    .line 77
    iget-object v14, v13, Ll3/e;->a:Ljava/lang/Object;

    .line 78
    check-cast v14, Ll3/b0;

    invoke-virtual {v3, v14}, Ll3/b0;->a(Ll3/b0;)Ll3/b0;

    move-result-object v14

    const/16 v15, 0xe

    invoke-static {v13, v14, v5, v15}, Ll3/e;->a(Ll3/e;Ll3/b;II)Ll3/e;

    move-result-object v13

    iget-object v14, v13, Ll3/e;->a:Ljava/lang/Object;

    iget v15, v13, Ll3/e;->c:I

    iget v13, v13, Ll3/e;->b:I

    :goto_2
    if-ge v12, v13, :cond_3

    .line 79
    invoke-virtual {v9}, Lm83/m;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_3

    .line 80
    invoke-virtual {v9}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Ll3/e;

    move-object/from16 v16, v4

    .line 81
    iget v4, v5, Ll3/e;->c:I

    move-object/from16 v17, v8

    iget-object v8, v5, Ll3/e;->a:Ljava/lang/Object;

    if-ge v13, v4, :cond_1

    .line 82
    new-instance v4, Ll3/e;

    invoke-direct {v4, v8, v12, v13}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v12, v13

    move-object/from16 v4, v16

    move-object/from16 v8, v17

    :goto_3
    const/4 v5, 0x0

    goto :goto_2

    :cond_1
    move/from16 v18, v10

    .line 83
    new-instance v10, Ll3/e;

    invoke-direct {v10, v8, v12, v4}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    iget v12, v5, Ll3/e;->c:I

    .line 85
    :goto_4
    invoke-virtual {v9}, Lm83/m;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v9}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    .line 86
    iget v4, v4, Ll3/e;->c:I

    if-ne v12, v4, :cond_2

    .line 87
    invoke-virtual {v9}, Lm83/m;->removeLast()Ljava/lang/Object;

    goto :goto_4

    :cond_2
    move-object/from16 v4, v16

    move-object/from16 v8, v17

    move/from16 v10, v18

    goto :goto_3

    :cond_3
    move-object/from16 v16, v4

    move-object/from16 v17, v8

    move/from16 v18, v10

    if-ge v12, v13, :cond_4

    .line 88
    new-instance v4, Ll3/e;

    invoke-direct {v4, v3, v12, v13}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v12, v13

    .line 89
    :cond_4
    invoke-virtual {v9}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    if-eqz v4, :cond_8

    .line 90
    iget v5, v4, Ll3/e;->c:I

    iget-object v8, v4, Ll3/e;->a:Ljava/lang/Object;

    .line 91
    iget v4, v4, Ll3/e;->b:I

    if-ne v4, v13, :cond_5

    if-ne v5, v15, :cond_5

    .line 92
    invoke-virtual {v9}, Lm83/m;->removeLast()Ljava/lang/Object;

    .line 93
    new-instance v4, Ll3/e;

    check-cast v8, Ll3/b0;

    check-cast v14, Ll3/b0;

    invoke-virtual {v8, v14}, Ll3/b0;->a(Ll3/b0;)Ll3/b0;

    move-result-object v5

    invoke-direct {v4, v5, v13, v15}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    .line 94
    invoke-virtual {v9, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    if-ne v4, v5, :cond_6

    .line 95
    new-instance v10, Ll3/e;

    invoke-direct {v10, v8, v4, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-virtual {v9}, Lm83/m;->removeLast()Ljava/lang/Object;

    .line 97
    new-instance v4, Ll3/e;

    invoke-direct {v4, v14, v13, v15}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    .line 98
    invoke-virtual {v9, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    if-lt v5, v15, :cond_7

    .line 99
    new-instance v4, Ll3/e;

    check-cast v8, Ll3/b0;

    check-cast v14, Ll3/b0;

    invoke-virtual {v8, v14}, Ll3/b0;->a(Ll3/b0;)Ll3/b0;

    move-result-object v5

    invoke-direct {v4, v5, v13, v15}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    .line 100
    invoke-virtual {v9, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_5

    .line 101
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    .line 102
    :cond_8
    new-instance v4, Ll3/e;

    invoke-direct {v4, v14, v13, v15}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    .line 103
    invoke-virtual {v9, v4}, Lm83/m;->addLast(Ljava/lang/Object;)V

    :goto_5
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v4, v16

    move-object/from16 v8, v17

    move/from16 v10, v18

    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_9
    move-object/from16 v17, v8

    .line 104
    :goto_6
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v12, v4, :cond_b

    invoke-virtual {v9}, Lm83/m;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_b

    .line 105
    invoke-virtual {v9}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    .line 106
    new-instance v5, Ll3/e;

    .line 107
    iget-object v8, v4, Ll3/e;->a:Ljava/lang/Object;

    iget v4, v4, Ll3/e;->c:I

    .line 108
    invoke-direct {v5, v8, v12, v4}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    :goto_7
    invoke-virtual {v9}, Lm83/m;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v9}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/e;

    .line 110
    iget v5, v5, Ll3/e;->c:I

    if-ne v4, v5, :cond_a

    .line 111
    invoke-virtual {v9}, Lm83/m;->removeLast()Ljava/lang/Object;

    goto :goto_7

    :cond_a
    move v12, v4

    goto :goto_6

    .line 112
    :cond_b
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v12, v4, :cond_c

    .line 113
    new-instance v4, Ll3/e;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct {v4, v3, v12, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_d

    .line 115
    new-instance v4, Ll3/e;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    const/4 v5, 0x0

    .line 116
    :goto_8
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v5

    :goto_9
    if-ge v9, v8, :cond_15

    .line 118
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 119
    check-cast v10, Ll3/e;

    .line 120
    iget v11, v10, Ll3/e;->b:I

    iget v12, v10, Ll3/e;->c:I

    .line 121
    new-instance v13, Ll3/g;

    if-eq v11, v12, :cond_e

    .line 122
    invoke-virtual {v7, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    const-string v15, "substring(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_e
    const-string v14, ""

    .line 123
    :goto_a
    new-instance v15, Lkg2/e;

    const/4 v5, 0x7

    invoke-direct {v15, v5}, Lkg2/e;-><init>(I)V

    invoke-static {v1, v11, v12, v15}, Ll3/h;->a(Ll3/g;IILkg2/e;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_f

    move-object/from16 v5, v17

    .line 124
    :cond_f
    invoke-direct {v13, v14, v5}, Ll3/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 125
    iget-object v5, v10, Ll3/e;->a:Ljava/lang/Object;

    .line 126
    check-cast v5, Ll3/b0;

    .line 127
    iget v10, v5, Ll3/b0;->b:I

    const/high16 v15, -0x80000000

    if-ne v10, v15, :cond_10

    .line 128
    iget v10, v3, Ll3/b0;->b:I

    .line 129
    iget v15, v5, Ll3/b0;->a:I

    move-object/from16 v29, v6

    move-object/from16 v16, v7

    .line 130
    iget-wide v6, v5, Ll3/b0;->c:J

    .line 131
    iget-object v1, v5, Ll3/b0;->d:Lw3/q;

    move-object/from16 v23, v1

    .line 132
    iget-object v1, v5, Ll3/b0;->e:Ll3/e0;

    move-object/from16 v24, v1

    .line 133
    iget-object v1, v5, Ll3/b0;->f:Lw3/i;

    move-object/from16 v25, v1

    .line 134
    iget v1, v5, Ll3/b0;->g:I

    move/from16 v26, v1

    .line 135
    iget v1, v5, Ll3/b0;->h:I

    .line 136
    iget-object v5, v5, Ll3/b0;->i:Lw3/s;

    .line 137
    new-instance v18, Ll3/b0;

    move/from16 v27, v1

    move-object/from16 v28, v5

    move-wide/from16 v21, v6

    move/from16 v20, v10

    move/from16 v19, v15

    invoke-direct/range {v18 .. v28}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    move-object/from16 v5, v18

    goto :goto_b

    :cond_10
    move-object/from16 v29, v6

    move-object/from16 v16, v7

    .line 138
    :goto_b
    new-instance v1, Ll3/z;

    .line 139
    new-instance v6, Ll3/v0;

    .line 140
    iget-object v7, v2, Ll3/v0;->a:Ll3/m0;

    .line 141
    invoke-virtual {v3, v5}, Ll3/b0;->a(Ll3/b0;)Ll3/b0;

    move-result-object v5

    .line 142
    invoke-direct {v6, v7, v5}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;)V

    .line 143
    iget-object v5, v13, Ll3/g;->w:Ljava/util/List;

    if-nez v5, :cond_11

    move-object/from16 v21, v17

    goto :goto_c

    :cond_11
    move-object/from16 v21, v5

    .line 144
    :goto_c
    iget-object v5, v0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    .line 145
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    move-object v10, v5

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v10, :cond_14

    .line 147
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 148
    check-cast v15, Ll3/e;

    .line 149
    iget v2, v15, Ll3/e;->b:I

    move-object/from16 v25, v3

    iget v3, v15, Ll3/e;->c:I

    .line 150
    invoke-static {v11, v12, v2, v3}, Ll3/h;->b(IIII)Z

    move-result v18

    if-eqz v18, :cond_13

    if-gt v11, v2, :cond_12

    if-gt v3, v12, :cond_12

    :goto_e
    move/from16 v18, v2

    goto :goto_f

    .line 151
    :cond_12
    const-string v18, "placeholder can not overlap with paragraph."

    .line 152
    invoke-static/range {v18 .. v18}, Lr3/a;->a(Ljava/lang/String;)V

    goto :goto_e

    .line 153
    :goto_f
    new-instance v2, Ll3/e;

    .line 154
    iget-object v15, v15, Ll3/e;->a:Ljava/lang/Object;

    move/from16 v19, v3

    sub-int v3, v18, v11

    move-object/from16 v18, v5

    sub-int v5, v19, v11

    .line 155
    invoke-direct {v2, v15, v3, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    .line 156
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_13
    move-object/from16 v18, v5

    :goto_10
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, p2

    move-object/from16 v5, v18

    move-object/from16 v3, v25

    goto :goto_d

    :cond_14
    move-object/from16 v25, v3

    .line 157
    new-instance v18, Lt3/c;

    move-object/from16 v24, p4

    move-object/from16 v23, p5

    move-object/from16 v20, v6

    move-object/from16 v22, v7

    move-object/from16 v19, v14

    invoke-direct/range {v18 .. v24}, Lt3/c;-><init>(Ljava/lang/String;Ll3/v0;Ljava/util/List;Ljava/util/List;Lp3/h;Ly3/c;)V

    move-object/from16 v2, v18

    .line 158
    invoke-direct {v1, v2, v11, v12}, Ll3/z;-><init>(Lt3/c;II)V

    .line 159
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v7, v16

    move-object/from16 v6, v29

    const/4 v5, 0x0

    goto/16 :goto_9

    .line 160
    :cond_15
    iput-object v4, v0, Laa3/i1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsa3/i;Lqa3/h1;Ll83/d;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Laa3/i1;->a:I

    const-string v0, "kind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Laa3/i1;->b:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Laa3/i1;->c:Ljava/lang/Object;

    .line 17
    iput-object p3, p0, Laa3/i1;->f:Ljava/lang/Object;

    .line 18
    iput-object p4, p0, Laa3/i1;->d:Ljava/lang/Object;

    .line 19
    iput-object p5, p0, Laa3/i1;->e:Ljava/lang/Object;

    return-void
.end method

.method public static m(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Laa3/i1;
    .locals 5

    new-instance v0, Laa3/i1;

    invoke-direct {v0, p0, p1}, Laa3/i1;-><init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    iget-object p0, v0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayDeque;

    monitor-enter p0

    :try_start_0
    iget-object p1, v0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iget-object p1, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/SharedPreferences;

    iget-object v1, v0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, ""

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, v0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, v0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    if-nez v1, :cond_1

    const-string v1, "FirebaseMessaging"

    const-string v2, "Corrupted queue. Please check the queue contents and item separator provided"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    array-length v1, p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, p1, v2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayDeque;

    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    monitor-exit p0

    return-object v0

    :cond_4
    :goto_2
    monitor-exit p0

    return-object v0

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {p1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Lgt/c;

    invoke-interface {v0, p1}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lpt/a;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lgt/q;

    check-cast v0, Lpt/a;

    invoke-direct {p1}, Lgt/q;-><init>()V

    return-object p1

    :cond_1
    new-instance v0, Lcom/google/firebase/components/DependencyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to request an undeclared dependency "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/firebase/components/DependencyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Z
    .locals 5

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/z;

    iget-object v4, v4, Ll3/z;->a:Lt3/c;

    invoke-virtual {v4}, Lt3/c;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public d(Lgt/p;)Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Lgt/c;

    invoke-interface {v0, p1}, Lgt/c;->d(Lgt/p;)Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/firebase/components/DependencyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to request an undeclared dependency Set<"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ">."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/firebase/components/DependencyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Ljava/lang/Class;)Lst/a;
    .locals 0

    invoke-static {p1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Laa3/i1;->f(Lgt/p;)Lst/a;

    move-result-object p1

    return-object p1
.end method

.method public f(Lgt/p;)Lst/a;
    .locals 3

    iget-object v0, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Lgt/c;

    invoke-interface {v0, p1}, Lgt/c;->f(Lgt/p;)Lst/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/firebase/components/DependencyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to request an undeclared dependency Provider<"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ">."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/firebase/components/DependencyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()F
    .locals 1

    iget-object v0, p0, Laa3/i1;->d:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public h(Lgt/p;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Lgt/c;

    invoke-interface {v0, p1}, Lgt/c;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/firebase/components/DependencyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to request an undeclared dependency "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/firebase/components/DependencyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Lgt/p;)Lst/a;
    .locals 3

    iget-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Lgt/c;

    invoke-interface {v0, p1}, Lgt/c;->i(Lgt/p;)Lst/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/firebase/components/DependencyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to request an undeclared dependency Provider<Set<"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ">>."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/firebase/components/DependencyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(Lgh/g;Ljava/lang/Class;)V
    .locals 2

    iget-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Ljh/a;Ljava/lang/Class;)V
    .locals 2

    iget-object v0, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l()V
    .locals 8

    iget-object v0, p0, Laa3/i1;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "java.vendor"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    const-string v3, "Android"

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_5

    iget-object v1, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    const-string v5, "iterable-encrypted-migration-completed"

    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "IterableKeychainMigrator"

    const-string v3, "Migration was already completed, skipping"

    invoke-static {v1, v3}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v1, La0/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    const-string v2, "iterable-encrypted-migration-started"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "IterableKeychainMigrator"

    const-string v2, "Previous migration attempt was interrupted"

    invoke-static {v1, v2}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Laa3/i1;->n()V

    new-instance v1, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;

    const-string v2, "Previous migration attempt was interrupted"

    invoke-direct {v1, v2}, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v2, La0/a1;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :cond_3
    :try_start_2
    iget-object v1, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "iterable-encrypted-migration-started"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v2, Landroidx/fragment/app/m;

    const/16 v5, 0xd

    invoke-direct {v2, p0, v5}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    const-string v5, "submit(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x1388

    invoke-interface {v2, v6, v7, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_5
    const-string v3, "IterableKeychainMigrator"

    const-string v4, "Migration failed"

    invoke-static {v3, v4, v2}, Ldt/b;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Laa3/i1;->n()V

    iget-object v3, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v3, La0/a1;

    if-eqz v3, :cond_4

    new-instance v4, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;

    const-string v5, "Migration failed"

    invoke-direct {v4, v2, v5}, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_1
    const-string v5, "IterableKeychainMigrator"

    const-string v6, "Migration timed out after 5000ms"

    invoke-static {v5, v6}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iget-object v2, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/SharedPreferences;

    const-string v3, "iterable-encrypted-migration-completed"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Laa3/i1;->n()V

    iget-object v2, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v2, La0/a1;

    if-eqz v2, :cond_4

    new-instance v3, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;

    const-string v4, "Migration timed out"

    invoke-direct {v3, v4}, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_4
    :goto_1
    :try_start_6
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    :try_start_7
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    throw v2

    :cond_5
    const-string v1, "IterableKeychainMigrator"

    const-string v3, "Running in JVM, skipping migration of encrypted shared preferences"

    invoke-static {v1, v3}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Laa3/i1;->n()V

    iget-object v1, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v1, La0/a1;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v2}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_6
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-encrypted-migration-started"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-encrypted-migration-completed"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public o(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lec3/p1;

    if-eqz p2, :cond_1

    check-cast p2, Lec3/h2;

    invoke-virtual {p2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Laa3/i1;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    iget-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "since "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v2, Lsa3/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v2, Ll83/d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    const-string v3, ""

    if-eqz v2, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " error "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KmVersionRequirement(kind="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Laa3/k1;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Laa3/j1;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v1, Laa3/h1;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "version"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string v0, "level"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string v0, "kind"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method
