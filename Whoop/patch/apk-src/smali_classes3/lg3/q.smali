.class public final Llg3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Llg3/b;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Llg3/q;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Llg3/q;->b:Z

    .line 9
    iput-boolean v0, p0, Llg3/q;->c:Z

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg3/q;->f:Ljava/io/Serializable;

    .line 11
    iget-object v1, p1, Llg3/b;->c:Llg3/t;

    .line 12
    iput-object v1, p0, Llg3/q;->d:Ljava/lang/Object;

    .line 13
    iget-object p1, p1, Llg3/b;->e:Lkg3/d;

    .line 14
    iput-object p1, p0, Llg3/q;->e:Ljava/lang/Object;

    .line 15
    new-instance p1, Llg3/p;

    .line 16
    invoke-direct {p1, p0}, Llg3/p;-><init>(Llg3/q;)V

    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Llg3/q;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Llg3/q;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Llg3/q;->b:Z

    .line 20
    iput-boolean v0, p0, Llg3/q;->c:Z

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg3/q;->f:Ljava/io/Serializable;

    .line 22
    iget-object v1, p1, Llg3/q;->d:Ljava/lang/Object;

    check-cast v1, Llg3/t;

    iput-object v1, p0, Llg3/q;->d:Ljava/lang/Object;

    .line 23
    iget-object v1, p1, Llg3/q;->e:Ljava/lang/Object;

    check-cast v1, Lkg3/d;

    iput-object v1, p0, Llg3/q;->e:Ljava/lang/Object;

    .line 24
    iget-boolean v1, p1, Llg3/q;->b:Z

    iput-boolean v1, p0, Llg3/q;->b:Z

    .line 25
    iget-boolean p1, p1, Llg3/q;->c:Z

    iput-boolean p1, p0, Llg3/q;->c:Z

    .line 26
    new-instance p1, Llg3/p;

    .line 27
    invoke-direct {p1, p0}, Llg3/p;-><init>(Llg3/q;)V

    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(Ls93/a;ZLzt/q;Lfa3/a;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Llg3/q;->a:I

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 29
    invoke-direct/range {v1 .. v6}, Llg3/q;-><init>(Ls93/a;ZLzt/q;Lfa3/a;Z)V

    return-void
.end method

.method public constructor <init>(Ls93/a;ZLzt/q;Lfa3/a;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Llg3/q;->a:I

    const-string v0, "containerContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llg3/q;->d:Ljava/lang/Object;

    .line 3
    iput-boolean p2, p0, Llg3/q;->b:Z

    .line 4
    iput-object p3, p0, Llg3/q;->e:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Llg3/q;->f:Ljava/io/Serializable;

    .line 6
    iput-boolean p5, p0, Llg3/q;->c:Z

    return-void
.end method

.method public static d(Ljava/lang/Object;Ljava/util/ArrayList;Ls;)V
    .locals 1

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2, p0}, Ls;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1, p2}, Llg3/q;->d(Ljava/lang/Object;Ljava/util/ArrayList;Ls;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static f(Llb3/c0;)Lva3/f;
    .locals 2

    sget-object v0, Llb3/d1;->a:Lnb3/i;

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    instance-of v0, p0, Lr93/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lr93/e;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static g(Lob3/g;)Lna3/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    invoke-static {v0}, Lmb3/g;->G(Lob3/g;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lna3/g;->x:Lna3/g;

    return-object p0

    :cond_2
    invoke-static {p0}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lmb3/g;->Z(Lob3/f;)Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    invoke-static {p0}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    invoke-static {v0}, Lmb3/g;->G(Lob3/g;)Z

    move-result p0

    if-nez p0, :cond_5

    sget-object p0, Lna3/g;->y:Lna3/g;

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a(CC)Z
    .locals 2

    iget-boolean v0, p0, Llg3/q;->b:Z

    if-eqz v0, :cond_0

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_0
    if-eq p1, p2, :cond_2

    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-static {p2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    if-eq v0, v1, :cond_2

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p2

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public b(Llb3/y;Ljava/lang/Iterable;Lna3/q;Z)Landroidx/room/d;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Llg3/q;->d:Ljava/lang/Object;

    check-cast v3, Ls93/a;

    iget-object v4, v0, Llg3/q;->e:Ljava/lang/Object;

    check-cast v4, Lzt/q;

    iget-boolean v5, v0, Llg3/q;->b:Z

    const-string v6, "<this>"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Llg3/q;->m(Lob3/g;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v2, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lob3/g;

    invoke-virtual {v0, v9}, Llg3/q;->m(Lob3/g;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v9, 0x1

    if-eqz v5, :cond_3

    instance-of v10, v2, Ljava/util/Collection;

    if-eqz v10, :cond_1

    move-object v10, v2

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lob3/g;

    const-string v11, "other"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v11, Lia3/a;

    iget-object v11, v11, Lia3/a;->u:Lmb3/k;

    check-cast v10, Llb3/y;

    check-cast v11, Lmb3/l;

    invoke-virtual {v11, v1, v10}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result v10

    if-nez v10, :cond_2

    move v1, v9

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v10, v2, [Lna3/d;

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v2, :cond_59

    sget-object v12, Ll83/i;->y:Ll83/i;

    new-instance v13, Lb30/a2;

    invoke-direct {v13, v0, v6, v11, v9}, Lb30/a2;-><init>(Ljava/lang/Object;Ljava/util/List;II)V

    invoke-static {v12, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v12

    sget-object v13, Lna3/d;->e:Lna3/d;

    if-lez v11, :cond_4

    if-eqz v1, :cond_4

    move/from16 p2, v1

    move/from16 v18, v2

    move-object/from16 v17, v4

    move/from16 v19, v5

    goto/16 :goto_3f

    :cond_4
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lna3/b;

    invoke-interface {v12}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lfa3/m;

    iget-object v15, v14, Lna3/b;->a:Lob3/g;

    iget-object v8, v14, Lna3/b;->c:Lob3/m;

    if-nez v15, :cond_7

    if-eqz v8, :cond_6

    instance-of v9, v8, Lr93/x0;

    if-eqz v9, :cond_5

    move-object v9, v8

    check-cast v9, Lr93/x0;

    invoke-interface {v9}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v9

    move/from16 p2, v1

    const-string v1, "getVariance(...)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Luf/c0;->H(Llb3/g1;)Lob3/p;

    move-result-object v1

    goto :goto_4

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v3, v2, v1}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    move/from16 p2, v1

    const/4 v1, 0x0

    :goto_4
    sget-object v9, Lob3/p;->x:Lob3/p;

    if-ne v1, v9, :cond_8

    move/from16 v18, v2

    move-object/from16 v17, v4

    move/from16 v19, v5

    move-object v1, v13

    const/4 v5, 0x0

    :goto_5
    const/4 v12, 0x1

    const/4 v13, 0x0

    goto/16 :goto_26

    :cond_7
    move/from16 p2, v1

    :cond_8
    if-nez v8, :cond_9

    const/4 v1, 0x1

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    :goto_6
    sget-object v9, Lm83/y;->w:Lm83/y;

    if-eqz v15, :cond_a

    move-object v13, v15

    check-cast v13, Llb3/y;

    invoke-virtual {v13}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v13

    goto :goto_7

    :cond_a
    move-object v13, v9

    :goto_7
    if-eqz v15, :cond_d

    invoke-static {v15}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v17

    if-nez v17, :cond_c

    invoke-static {v15}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v17

    if-eqz v17, :cond_b

    invoke-static/range {v17 .. v17}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v17

    if-nez v17, :cond_c

    :cond_b
    invoke-static {v15}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object/from16 v17, v15

    :cond_c
    invoke-static/range {v17 .. v17}, Lmb3/g;->X(Lob3/h;)Llb3/q0;

    move-result-object v15

    if-eqz v15, :cond_d

    invoke-static {v15}, Lmb3/g;->s(Lob3/l;)Lr93/x0;

    move-result-object v15

    :goto_8
    move/from16 v17, v1

    goto :goto_9

    :cond_d
    const/4 v15, 0x0

    goto :goto_8

    :goto_9
    iget-object v1, v0, Llg3/q;->f:Ljava/io/Serializable;

    check-cast v1, Lfa3/a;

    move/from16 v18, v2

    sget-object v2, Lfa3/a;->F:Lfa3/a;

    if-ne v1, v2, :cond_e

    const/4 v1, 0x1

    goto :goto_a

    :cond_e
    const/4 v1, 0x0

    :goto_a
    if-nez v17, :cond_f

    goto :goto_b

    :cond_f
    if-nez v1, :cond_10

    iget-object v1, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->t:Lia3/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_10
    if-eqz v3, :cond_11

    invoke-interface {v3}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object v1

    if-eqz v1, :cond_11

    move-object v9, v1

    :cond_11
    invoke-static {v9, v13}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v13

    :goto_b
    iget-object v1, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->q:Lfa3/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v9

    sget-object v17, Lfa3/y;->n:Ljava/util/Set;

    move-object/from16 v19, v1

    move-object/from16 v1, v17

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v9}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    sget-object v1, Lna3/e;->w:Lna3/e;

    goto :goto_d

    :cond_12
    sget-object v1, Lfa3/y;->o:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v9}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    sget-object v1, Lna3/e;->x:Lna3/e;

    :goto_d
    if-eqz v2, :cond_13

    if-eq v2, v1, :cond_13

    const/4 v2, 0x0

    goto :goto_e

    :cond_13
    move-object v2, v1

    :cond_14
    move-object/from16 v1, v19

    goto :goto_c

    :cond_15
    :goto_e
    iget-object v1, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->q:Lfa3/b;

    new-instance v9, Landroidx/room/d;

    move-object/from16 v17, v4

    const/4 v4, 0x5

    invoke-direct {v9, v4, v0, v14}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v13, 0x0

    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_21

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v9, v14}, Landroidx/room/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Boolean;

    move-object/from16 v20, v4

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v14, v4}, Lfa3/b;->g(Ljava/lang/Object;Z)Lna3/h;

    move-result-object v4

    if-eqz v4, :cond_16

    move-object/from16 p1, v1

    move/from16 v19, v5

    :goto_10
    const/4 v5, 0x0

    goto :goto_16

    :cond_16
    invoke-virtual {v1, v14}, Lfa3/b;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_18

    move/from16 v19, v5

    :cond_17
    move-object/from16 p1, v1

    const/4 v5, 0x0

    goto :goto_15

    :cond_18
    invoke-virtual {v1, v14}, Lfa3/b;->h(Ljava/lang/Object;)Lfa3/b0;

    move-result-object v14

    if-eqz v14, :cond_19

    :goto_11
    move/from16 v19, v5

    goto :goto_12

    :cond_19
    iget-object v14, v1, Lfa3/b;->a:Lch3/h;

    iget-object v14, v14, Lch3/h;->x:Ljava/lang/Object;

    check-cast v14, Lfa3/v;

    iget-object v14, v14, Lfa3/v;->a:Lfa3/b0;

    goto :goto_11

    :goto_12
    sget-object v5, Lfa3/b0;->x:Lfa3/b0;

    if-ne v14, v5, :cond_1a

    move-object/from16 p1, v1

    const/4 v4, 0x0

    goto :goto_10

    :cond_1a
    invoke-virtual {v9, v4}, Landroidx/room/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v1, v4, v5}, Lfa3/b;->g(Ljava/lang/Object;Z)Lna3/h;

    move-result-object v4

    if-eqz v4, :cond_17

    sget-object v5, Lfa3/b0;->y:Lfa3/b0;

    if-ne v14, v5, :cond_1b

    const/4 v14, 0x1

    :goto_13
    move-object/from16 p1, v1

    const/4 v1, 0x1

    const/4 v5, 0x0

    goto :goto_14

    :cond_1b
    const/4 v14, 0x0

    goto :goto_13

    :goto_14
    invoke-static {v4, v5, v14, v1}, Lna3/h;->a(Lna3/h;Lna3/g;ZI)Lna3/h;

    move-result-object v4

    goto :goto_16

    :goto_15
    move-object v4, v5

    :goto_16
    if-nez v13, :cond_1c

    goto :goto_17

    :cond_1c
    iget-boolean v1, v13, Lna3/h;->b:Z

    if-eqz v4, :cond_20

    invoke-virtual {v4, v13}, Lna3/h;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1d

    goto :goto_18

    :cond_1d
    iget-boolean v14, v4, Lna3/h;->b:Z

    if-eqz v14, :cond_1e

    if-nez v1, :cond_1e

    goto :goto_18

    :cond_1e
    if-nez v14, :cond_1f

    if-eqz v1, :cond_1f

    :goto_17
    move-object v13, v4

    goto :goto_18

    :cond_1f
    move-object v13, v5

    goto :goto_19

    :cond_20
    :goto_18
    move-object/from16 v1, p1

    move/from16 v5, v19

    move-object/from16 v4, v20

    goto/16 :goto_f

    :cond_21
    move/from16 v19, v5

    const/4 v5, 0x0

    :goto_19
    if-eqz v13, :cond_23

    new-instance v1, Lna3/d;

    iget-object v4, v13, Lna3/h;->a:Lna3/g;

    sget-object v8, Lna3/g;->y:Lna3/g;

    if-ne v4, v8, :cond_22

    if-eqz v15, :cond_22

    const/4 v8, 0x1

    goto :goto_1a

    :cond_22
    const/4 v8, 0x0

    :goto_1a
    iget-boolean v9, v13, Lna3/h;->b:Z

    invoke-direct {v1, v4, v2, v8, v9}, Lna3/d;-><init>(Lna3/g;Lna3/e;ZZ)V

    goto/16 :goto_5

    :cond_23
    if-eqz v15, :cond_24

    invoke-virtual {v0, v15}, Llg3/q;->e(Lob3/m;)Lna3/h;

    move-result-object v1

    goto :goto_1b

    :cond_24
    move-object v1, v5

    :goto_1b
    const/4 v4, 0x2

    if-eqz v1, :cond_25

    sget-object v9, Lna3/g;->y:Lna3/g;

    const/4 v13, 0x0

    invoke-static {v1, v9, v13, v4}, Lna3/h;->a(Lna3/h;Lna3/g;ZI)Lna3/h;

    move-result-object v9

    goto :goto_1c

    :cond_25
    if-eqz v12, :cond_26

    iget-object v9, v12, Lfa3/m;->a:Lna3/h;

    goto :goto_1c

    :cond_26
    move-object v9, v5

    :goto_1c
    if-eqz v1, :cond_27

    iget-object v1, v1, Lna3/h;->a:Lna3/g;

    goto :goto_1d

    :cond_27
    move-object v1, v5

    :goto_1d
    sget-object v13, Lna3/g;->y:Lna3/g;

    if-eq v1, v13, :cond_29

    if-eqz v15, :cond_28

    if-eqz v12, :cond_28

    iget-boolean v1, v12, Lfa3/m;->c:Z

    const/4 v12, 0x1

    if-ne v1, v12, :cond_28

    goto :goto_1e

    :cond_28
    const/4 v1, 0x0

    goto :goto_1f

    :cond_29
    :goto_1e
    const/4 v1, 0x1

    :goto_1f
    if-eqz v8, :cond_2b

    invoke-virtual {v0, v8}, Llg3/q;->e(Lob3/m;)Lna3/h;

    move-result-object v8

    if-eqz v8, :cond_2b

    iget-object v12, v8, Lna3/h;->a:Lna3/g;

    sget-object v13, Lna3/g;->x:Lna3/g;

    if-ne v12, v13, :cond_2a

    sget-object v12, Lna3/g;->w:Lna3/g;

    const/4 v13, 0x0

    invoke-static {v8, v12, v13, v4}, Lna3/h;->a(Lna3/h;Lna3/g;ZI)Lna3/h;

    move-result-object v8

    goto :goto_20

    :cond_2a
    const/4 v13, 0x0

    goto :goto_20

    :cond_2b
    const/4 v13, 0x0

    move-object v8, v5

    :goto_20
    if-nez v8, :cond_2c

    goto :goto_22

    :cond_2c
    iget-object v4, v8, Lna3/h;->a:Lna3/g;

    if-nez v9, :cond_2d

    goto :goto_21

    :cond_2d
    iget-object v12, v9, Lna3/h;->a:Lna3/g;

    iget-boolean v14, v9, Lna3/h;->b:Z

    iget-boolean v15, v8, Lna3/h;->b:Z

    if-eqz v15, :cond_2e

    if-nez v14, :cond_2e

    goto :goto_22

    :cond_2e
    if-nez v15, :cond_2f

    if-eqz v14, :cond_2f

    goto :goto_21

    :cond_2f
    invoke-virtual {v4, v12}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v14

    if-gez v14, :cond_30

    goto :goto_22

    :cond_30
    invoke-virtual {v4, v12}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-lez v4, :cond_31

    :goto_21
    move-object v9, v8

    :cond_31
    :goto_22
    new-instance v4, Lna3/d;

    if-eqz v9, :cond_32

    iget-object v8, v9, Lna3/h;->a:Lna3/g;

    goto :goto_23

    :cond_32
    move-object v8, v5

    :goto_23
    if-eqz v9, :cond_34

    iget-boolean v9, v9, Lna3/h;->b:Z

    const/4 v12, 0x1

    if-ne v9, v12, :cond_33

    move v9, v12

    goto :goto_25

    :cond_33
    :goto_24
    move v9, v13

    goto :goto_25

    :cond_34
    const/4 v12, 0x1

    goto :goto_24

    :goto_25
    invoke-direct {v4, v8, v2, v1, v9}, Lna3/d;-><init>(Lna3/g;Lna3/e;ZZ)V

    move-object v1, v4

    :goto_26
    iget-boolean v2, v1, Lna3/d;->d:Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_27
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_44

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-static {v11, v9}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lna3/b;

    if-eqz v9, :cond_42

    iget-object v9, v9, Lna3/b;->a:Lob3/g;

    if-eqz v9, :cond_42

    invoke-static {v9}, Llg3/q;->g(Lob3/g;)Lna3/g;

    move-result-object v14

    if-nez v14, :cond_36

    move-object v15, v9

    check-cast v15, Llb3/y;

    invoke-static {v15}, Llb3/o;->c(Llb3/y;)Llb3/y;

    move-result-object v15

    if-eqz v15, :cond_35

    invoke-static {v15}, Llg3/q;->g(Lob3/g;)Lna3/g;

    move-result-object v15

    goto :goto_28

    :cond_35
    move-object v15, v5

    goto :goto_28

    :cond_36
    move-object v15, v14

    :goto_28
    sget-object v16, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v9}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v16

    if-eqz v16, :cond_37

    invoke-static/range {v16 .. v16}, Lmb3/g;->O(Lob3/f;)Llb3/c0;

    move-result-object v16

    if-nez v16, :cond_38

    :cond_37
    invoke-static {v9}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_38
    invoke-static/range {v16 .. v16}, Llg3/q;->f(Llb3/c0;)Lva3/f;

    move-result-object v5

    sget-object v12, Lq93/d;->k:Ljava/util/HashMap;

    invoke-virtual {v12, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_39

    sget-object v5, Lna3/e;->w:Lna3/e;

    goto :goto_29

    :cond_39
    invoke-static {v9}, Lmb3/g;->f(Lob3/g;)Llb3/r;

    move-result-object v5

    if-eqz v5, :cond_3a

    invoke-static {v5}, Lmb3/g;->Z(Lob3/f;)Llb3/c0;

    move-result-object v5

    if-nez v5, :cond_3b

    :cond_3a
    invoke-static {v9}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3b
    invoke-static {v5}, Llg3/q;->f(Llb3/c0;)Lva3/f;

    move-result-object v5

    sget-object v12, Lq93/d;->j:Ljava/util/HashMap;

    invoke-virtual {v12, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3c

    sget-object v5, Lna3/e;->x:Lna3/e;

    goto :goto_29

    :cond_3c
    const/4 v5, 0x0

    :goto_29
    invoke-static {v9}, Lmb3/g;->g(Lob3/g;)Llb3/c0;

    move-result-object v12

    if-eqz v12, :cond_3d

    invoke-static {v12}, Lmb3/g;->e(Lob3/h;)Llb3/l;

    move-result-object v12

    goto :goto_2a

    :cond_3d
    const/4 v12, 0x0

    :goto_2a
    if-eqz v12, :cond_3e

    const/4 v12, 0x1

    goto :goto_2b

    :cond_3e
    move v12, v13

    :goto_2b
    if-nez v12, :cond_40

    check-cast v9, Llb3/y;

    invoke-virtual {v9}, Llb3/y;->p0()Llb3/f1;

    move-result-object v9

    instance-of v9, v9, Lna3/f;

    if-eqz v9, :cond_3f

    goto :goto_2c

    :cond_3f
    move v9, v13

    goto :goto_2d

    :cond_40
    :goto_2c
    const/4 v9, 0x1

    :goto_2d
    new-instance v12, Lna3/d;

    if-eq v15, v14, :cond_41

    const/4 v14, 0x1

    goto :goto_2e

    :cond_41
    move v14, v13

    :goto_2e
    invoke-direct {v12, v15, v5, v9, v14}, Lna3/d;-><init>(Lna3/g;Lna3/e;ZZ)V

    goto :goto_2f

    :cond_42
    const/4 v12, 0x0

    :goto_2f
    if-eqz v12, :cond_43

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_43
    const/4 v5, 0x0

    const/4 v12, 0x1

    goto/16 :goto_27

    :cond_44
    if-nez v11, :cond_45

    if-eqz v19, :cond_45

    const/4 v5, 0x1

    goto :goto_30

    :cond_45
    move v5, v13

    :goto_30
    if-nez v11, :cond_46

    instance-of v8, v3, Lr93/a1;

    if-eqz v8, :cond_46

    move-object v8, v3

    check-cast v8, Lr93/a1;

    check-cast v8, Lu93/w0;

    iget-object v8, v8, Lu93/w0;->K:Llb3/y;

    if-eqz v8, :cond_46

    const/4 v8, 0x1

    goto :goto_31

    :cond_46
    move v8, v13

    :goto_31
    iget-object v9, v1, Lna3/d;->a:Lna3/g;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_32
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_49

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lna3/d;

    iget-boolean v13, v15, Lna3/d;->d:Z

    if-eqz v13, :cond_47

    const/4 v13, 0x0

    goto :goto_33

    :cond_47
    iget-object v13, v15, Lna3/d;->a:Lna3/g;

    :goto_33
    if-eqz v13, :cond_48

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_48
    const/4 v13, 0x0

    goto :goto_32

    :cond_49
    invoke-static {v12}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    if-eqz v2, :cond_4a

    const/4 v13, 0x0

    goto :goto_34

    :cond_4a
    move-object v13, v9

    :goto_34
    sget-object v14, Lna3/g;->w:Lna3/g;

    if-ne v13, v14, :cond_4b

    goto :goto_35

    :cond_4b
    sget-object v14, Lna3/g;->y:Lna3/g;

    sget-object v15, Lna3/g;->x:Lna3/g;

    invoke-static {v12, v14, v15, v13, v5}, Lce/w;->c0(Ljava/util/Set;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Z)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Lna3/g;

    :goto_35
    if-nez v14, :cond_4f

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_4c
    :goto_36
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_4d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lna3/d;

    iget-object v15, v15, Lna3/d;->a:Lna3/g;

    if-eqz v15, :cond_4c

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_36

    :cond_4d
    invoke-static {v12}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    sget-object v13, Lna3/g;->w:Lna3/g;

    if-ne v9, v13, :cond_4e

    goto :goto_37

    :cond_4e
    sget-object v13, Lna3/g;->y:Lna3/g;

    sget-object v15, Lna3/g;->x:Lna3/g;

    invoke-static {v12, v13, v15, v9, v5}, Lce/w;->c0(Ljava/util/Set;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Z)Ljava/lang/Object;

    move-result-object v9

    move-object v13, v9

    check-cast v13, Lna3/g;

    goto :goto_37

    :cond_4f
    move-object v13, v14

    :goto_37
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_50
    :goto_38
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_51

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lna3/d;

    iget-object v15, v15, Lna3/d;->b:Lna3/e;

    if-eqz v15, :cond_50

    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_38

    :cond_51
    invoke-static {v9}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v9

    sget-object v12, Lna3/e;->x:Lna3/e;

    sget-object v15, Lna3/e;->w:Lna3/e;

    iget-object v0, v1, Lna3/d;->b:Lna3/e;

    invoke-static {v9, v12, v15, v0, v5}, Lce/w;->c0(Ljava/util/Set;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lna3/e;

    if-eqz v13, :cond_53

    if-nez p4, :cond_53

    if-eqz v8, :cond_52

    sget-object v5, Lna3/g;->x:Lna3/g;

    if-ne v13, v5, :cond_52

    goto :goto_39

    :cond_52
    move-object v9, v13

    goto :goto_3a

    :cond_53
    :goto_39
    const/4 v9, 0x0

    :goto_3a
    if-eqz v9, :cond_54

    if-nez v14, :cond_54

    const/4 v5, 0x1

    goto :goto_3b

    :cond_54
    const/4 v5, 0x0

    :goto_3b
    sget-object v8, Lna3/g;->y:Lna3/g;

    if-ne v9, v8, :cond_58

    if-ne v2, v5, :cond_55

    iget-boolean v1, v1, Lna3/d;->c:Z

    if-eqz v1, :cond_55

    goto :goto_3c

    :cond_55
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_56

    goto :goto_3d

    :cond_56
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_57
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_58

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lna3/d;

    iget-boolean v4, v2, Lna3/d;->d:Z

    if-ne v4, v5, :cond_57

    iget-boolean v2, v2, Lna3/d;->c:Z

    if-eqz v2, :cond_57

    :goto_3c
    const/4 v1, 0x1

    goto :goto_3e

    :cond_58
    :goto_3d
    const/4 v1, 0x0

    :goto_3e
    new-instance v13, Lna3/d;

    invoke-direct {v13, v9, v0, v1, v5}, Lna3/d;-><init>(Lna3/g;Lna3/e;ZZ)V

    :goto_3f
    aput-object v13, v10, v11

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v4, v17

    move/from16 v2, v18

    move/from16 v5, v19

    const/4 v9, 0x1

    goto/16 :goto_3

    :cond_59
    new-instance v0, Landroidx/room/d;

    const/4 v1, 0x6

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2, v10}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public c()Llg3/p;
    .locals 2

    iget-object v0, p0, Llg3/q;->f:Ljava/io/Serializable;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg3/p;

    return-object v0
.end method

.method public e(Lob3/m;)Lna3/h;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lja3/f0;

    if-nez v1, :cond_0

    goto/16 :goto_7

    :cond_0
    instance-of v1, p1, Lr93/x0;

    if-eqz v1, :cond_f

    check-cast p1, Lr93/x0;

    invoke-interface {p1}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    const-string v1, "getUpperBounds(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lob3/g;

    invoke-static {v3}, Lmb3/g;->C(Lob3/g;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lob3/g;

    invoke-static {v4}, Llg3/q;->g(Lob3/g;)Lna3/g;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v3, Lna3/a;

    invoke-direct {v3, p1, p0}, Lna3/a;-><init>(Ljava/util/List;Llg3/q;)V

    invoke-static {v1, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_7

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lob3/g;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    goto :goto_2

    :cond_6
    :goto_1
    new-instance p1, Lna3/h;

    sget-object v0, Lna3/g;->w:Lna3/g;

    invoke-direct {p1, v0, v5}, Lna3/h;-><init>(Lna3/g;Z)V

    return-object p1

    :cond_7
    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_8

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lob3/g;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :goto_2
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_9

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_3

    :cond_9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lob3/g;

    invoke-static {v2}, Lmb3/g;->I(Lob3/g;)Z

    move-result v2

    if-nez v2, :cond_a

    sget-object v1, Lna3/g;->y:Lna3/g;

    goto :goto_4

    :cond_b
    :goto_3
    sget-object v1, Lna3/g;->x:Lna3/g;

    :goto_4
    new-instance v2, Lna3/h;

    if-eq v0, p1, :cond_c

    goto :goto_5

    :cond_c
    move v4, v5

    :goto_5
    invoke-direct {v2, v1, v4}, Lna3/h;-><init>(Lna3/g;Z)V

    return-object v2

    :cond_d
    :goto_6
    new-instance p1, Lna3/h;

    sget-object v0, Lna3/g;->w:Lna3/g;

    invoke-direct {p1, v0, v4}, Lna3/h;-><init>(Lna3/g;Z)V

    return-object p1

    :cond_e
    :goto_7
    const/4 p1, 0x0

    return-object p1

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v1, p1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(Lng3/m;)Ljava/lang/Long;
    .locals 1

    invoke-virtual {p0}, Llg3/q;->c()Llg3/p;

    move-result-object v0

    iget-object v0, v0, Llg3/p;->G:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Llg3/q;->c:Z

    return v0
.end method

.method public j(Ljg3/o;)V
    .locals 1

    const-string v0, "zone"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llg3/q;->c()Llg3/p;

    move-result-object v0

    iput-object p1, v0, Llg3/p;->F:Ljg3/o;

    return-void
.end method

.method public k(Lng3/m;JII)I
    .locals 2

    const-string v0, "field"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llg3/q;->c()Llg3/p;

    move-result-object v0

    iget-object v0, v0, Llg3/p;->G:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-eqz p1, :cond_0

    not-int p1, p4

    return p1

    :cond_0
    return p5
.end method

.method public l(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z
    .locals 6

    add-int v0, p2, p5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-gt v0, v1, :cond_5

    add-int v0, p4, p5

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean v0, p0, Llg3/q;->b:Z

    if-eqz v0, :cond_2

    move v0, v2

    :goto_0
    if-ge v0, p5, :cond_4

    add-int v1, p2, v0

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int v3, p4, v0

    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_1
    if-ge v0, p5, :cond_4

    add-int v1, p2, v0

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int v3, p4, v0

    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_3

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v5

    if-eq v4, v5, :cond_3

    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v1

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    if-eq v1, v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    return v2
.end method

.method public m(Lob3/g;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Lna3/b;

    iget-object v1, p0, Llg3/q;->e:Ljava/lang/Object;

    check-cast v1, Lzt/q;

    iget-object v2, v1, Lzt/q;->z:Ljava/lang/Object;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfa3/t;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->q:Lfa3/b;

    const-string v3, "<this>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Llb3/y;

    invoke-virtual {v3}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lfa3/b;->b(Lfa3/b;Lfa3/t;Ls93/i;)Lfa3/t;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lna3/b;-><init>(Lob3/g;Lfa3/t;Lob3/m;)V

    new-instance p1, Ls;

    const/16 v1, 0xe

    invoke-direct {p1, p0, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v0, v1, p1}, Llg3/q;->d(Ljava/lang/Object;Ljava/util/ArrayList;Ls;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Llg3/q;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Llg3/q;->c()Llg3/p;

    move-result-object v0

    invoke-virtual {v0}, Llg3/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
