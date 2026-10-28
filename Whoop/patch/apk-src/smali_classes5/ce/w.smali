.class public abstract Lce/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng3/k;


# static fields
.field public static E:I = 0x5

.field public static w:Z = true

.field public static x:Ljava/lang/reflect/Field;

.field public static y:Z

.field public static z:Lo2/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/graphics/Canvas;Landroid/graphics/Rect;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->clipOutRect(Landroid/graphics/Rect;)Z

    move-result p0

    return p0
.end method

.method public static B(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->clipOutRect(Landroid/graphics/RectF;)Z

    move-result p0

    return p0
.end method

.method public static C(Ljava/util/Map;)V
    .locals 1

    const-string v0, "extras"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final D(Lce/m;Lce/y;)Lce/x;
    .locals 2

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lce/m;->b:Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->a0(Ljava/lang/CharSequence;)C

    move-result v0

    invoke-static {v0}, Lva3/d;->i(C)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lce/y;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lce/x;

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lce/x;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final E(Ljava/util/ArrayList;Ljava/util/Collection;Lr93/w;)Ljava/util/ArrayList;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "oldValueParameters"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    move-object v10, v3

    check-cast v10, Llb3/y;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Lr93/a1;

    new-instance v4, Lu93/w0;

    move-object v3, v2

    check-cast v3, Lu93/w0;

    iget v7, v3, Lu93/w0;->G:I

    move-object v5, v2

    check-cast v5, Lal/a;

    invoke-virtual {v5}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v8

    move-object v5, v2

    check-cast v5, Lu93/n;

    invoke-virtual {v5}, Lu93/n;->getName()Lva3/h;

    move-result-object v9

    const-string v5, "getName(...)"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lu93/w0;->J0()Z

    move-result v11

    iget-boolean v12, v3, Lu93/w0;->I:Z

    iget-boolean v13, v3, Lu93/w0;->J:Z

    iget-object v3, v3, Lu93/w0;->K:Llb3/y;

    if-eqz v3, :cond_0

    invoke-static/range {p2 .. p2}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object v3

    invoke-interface {v3}, Lr93/b0;->c()Lo93/h;

    move-result-object v3

    invoke-virtual {v3, v10}, Lo93/h;->f(Llb3/y;)Llb3/y;

    move-result-object v3

    :goto_1
    move-object v14, v3

    goto :goto_2

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    check-cast v2, Lu93/o;

    invoke-virtual {v2}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v15

    const-string v2, "getSource(...)"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object/from16 v5, p2

    invoke-direct/range {v4 .. v15}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static F(Landroid/content/Context;Lb10/b;ZLq83/j;Lq83/j;Lc93/a;Ljava/util/Set;ZZ)Lc20/a;
    .locals 22

    const-string v0, "productUsage"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkr/e;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lkr/e;-><init>(I)V

    new-instance v2, Lt9/p;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lt9/p;-><init>(I)V

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static/range {p8 .. p8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    new-instance v6, Lv03/b;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Le20/b;

    const/4 v8, 0x0

    invoke-direct {v7, v6, v8}, Le20/b;-><init>(Lv03/b;I)V

    invoke-static {v7}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v9, La30/h;

    const/16 v10, 0x9

    invoke-direct {v9, v7, v10}, La30/h;-><init>(Lv03/h;I)V

    invoke-static {v9}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v9

    new-instance v10, La30/h;

    const/16 v11, 0xa

    invoke-direct {v10, v7, v11}, La30/h;-><init>(Lv03/h;I)V

    invoke-static {v10}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v10, La30/h;

    const/16 v11, 0xf

    invoke-direct {v10, v0, v7, v11}, La30/h;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static/range {p0 .. p0}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v0

    new-instance v7, Lc20/g;

    const/4 v11, 0x1

    invoke-direct {v7, v0, v11}, Lc20/g;-><init>(Lv03/e;I)V

    invoke-static {v7}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v11, Le20/a;

    invoke-direct {v11, v6, v7, v8}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v13

    invoke-static {v3}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v3

    new-instance v11, Le20/a;

    const/4 v12, 0x5

    invoke-direct {v11, v2, v3, v12}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    invoke-static/range {p3 .. p3}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v11

    new-instance v14, Lb20/g;

    const/16 v12, 0xb

    invoke-direct {v14, v2, v11, v12}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    invoke-static/range {p1 .. p1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v15

    invoke-static/range {p4 .. p4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v17

    invoke-static/range {p5 .. p5}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v18

    invoke-static {v4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v19

    new-instance v2, Lc20/g;

    invoke-direct {v2, v11, v8}, Lc20/g;-><init>(Lv03/e;I)V

    new-instance v12, Lc20/o;

    move-object/from16 v21, v2

    move-object/from16 v16, v3

    move-object/from16 v20, v7

    invoke-direct/range {v12 .. v21}, Lc20/o;-><init>(Lv03/h;Lb20/g;Lv03/e;Lv03/e;Lv03/e;Lv03/e;Lv03/e;Lv03/h;Lc20/g;)V

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    invoke-static {v12}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v11, La00/k;

    invoke-direct {v11, v7, v9, v0}, La00/k;-><init>(Lv03/h;Lv03/h;Lv03/e;)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v11

    invoke-static {v1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v1

    new-instance v12, Lay/w;

    invoke-direct {v12, v4, v1, v3, v8}, Lay/w;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    sget-object v3, Le20/c;->a:Lcy/b;

    invoke-static {v3}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v3

    new-instance v8, Lc20/b;

    invoke-direct {v8, v3, v2, v4, v1}, Lc20/b;-><init>(Lv03/h;Lv03/e;Lv03/e;Lv03/e;)V

    invoke-static {v8}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    sget v2, Lv03/g;->x:I

    new-instance v2, Lv03/f;

    invoke-direct {v2}, Lv03/f;-><init>()V

    const-class v3, Ly00/a8;

    invoke-virtual {v2, v3, v10}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/r7;

    invoke-virtual {v2, v3, v7}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/h7;

    invoke-virtual {v2, v3, v7}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/m7;

    invoke-virtual {v2, v3, v11}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/n7;

    invoke-virtual {v2, v3, v11}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/l7;

    invoke-virtual {v2, v3, v11}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/k7;

    invoke-virtual {v2, v3, v11}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/j7;

    invoke-virtual {v2, v3, v7}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/x7;

    invoke-virtual {v2, v3, v7}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/s7;

    invoke-virtual {v2, v3, v12}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    const-class v3, Ly00/v7;

    invoke-virtual {v2, v3, v1}, Lv03/f;->a(Ljava/lang/Class;Lv03/h;)V

    new-instance v1, Lv03/g;

    iget-object v2, v2, Lv03/f;->a:Ljava/util/LinkedHashMap;

    invoke-direct {v1, v2}, Lv03/a;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v5}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v2

    new-instance v3, Lc20/b;

    const/4 v4, 0x0

    move-object/from16 p2, v0

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p0, v3

    move/from16 p1, v4

    move-object/from16 p3, v9

    invoke-direct/range {p0 .. p5}, Lc20/b;-><init>(ILv03/d;Lv03/h;Lv03/h;Lv03/h;)V

    move-object/from16 v0, p0

    invoke-static {v0}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    invoke-static {v6, v0}, Lv03/b;->a(Lv03/h;Lv03/h;)V

    invoke-virtual {v6}, Lv03/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc20/a;

    return-object v0
.end method

.method public static G(Ljava/io/Serializable;)V
    .locals 2

    sget v0, Lce/w;->E:I

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lce/w;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RootBeer"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lce/w;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "QLog"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static H(Landroidx/datastore/preferences/protobuf/h;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/h;->a(I)B

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/16 v3, 0x27

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    const/16 v4, 0x20

    if-lt v2, v4, :cond_0

    const/16 v4, 0x7e

    if-gt v2, v4, :cond_0

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x7

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v2, "\\r"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v2, "\\f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string v2, "\\v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string v2, "\\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string v2, "\\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string v2, "\\b"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string v2, "\\a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\\\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "\\\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "\\\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final I(Lp1/f2;Lp1/t;)Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p0}, Lp1/f2;->d()Lp1/e2;

    move-result-object p0

    :try_start_0
    iget v0, p0, Lp1/e2;->c:I

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lce/w;->J(Lp1/e2;Lp1/t;II)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lp1/e2;->c()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lp1/e2;->c()V

    throw p1
.end method

.method public static final J(Lp1/e2;Lp1/t;II)Ljava/lang/Integer;
    .locals 5

    iget-object v0, p0, Lp1/e2;->b:[I

    :goto_0
    const/4 v1, 0x0

    if-ge p2, p3, :cond_3

    mul-int/lit8 v2, p2, 0x5

    add-int/lit8 v2, v2, 0x3

    aget v2, v0, v2

    add-int/2addr v2, p2

    invoke-virtual {p0, p2}, Lp1/e2;->j(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, p2}, Lp1/e2;->i(I)I

    move-result v3

    const/16 v4, 0xce

    if-ne v3, v4, :cond_1

    invoke-virtual {p0, v0, p2}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/r;->e:Lp1/e1;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {p0, p2, v3}, Lp1/e2;->h(II)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lp1/n;

    if-eqz v4, :cond_0

    move-object v1, v3

    check-cast v1, Lp1/n;

    :cond_0
    if-eqz v1, :cond_1

    iget-object v1, v1, Lp1/n;->w:Lp1/o;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0, p2}, Lp1/e2;->d(I)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 p2, p2, 0x1

    invoke-static {p0, p1, p2, v2}, Lce/w;->J(Lp1/e2;Lp1/t;II)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    move p2, v2

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static K(Landroidx/compose/runtime/Composer;)Lg00/b;
    .locals 2

    check-cast p0, Lp1/q;

    const v0, -0x1a6f7841

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static final L()Lo2/e;
    .locals 12

    sget-object v0, Lce/w;->z:Lo2/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lo2/d;

    const/4 v9, 0x0

    const/16 v11, 0x60

    const-string v2, "Filled.FlashOn"

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v11}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v0, Lo2/f0;->a:I

    new-instance v0, Li2/c1;

    sget-wide v2, Li2/x;->b:J

    invoke-direct {v0, v2, v3}, Li2/c1;-><init>(J)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Lo2/m;

    const/high16 v4, 0x40e00000    # 7.0f

    const/high16 v5, 0x40000000    # 2.0f

    invoke-direct {v3, v4, v5}, Lo2/m;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo2/y;

    const/high16 v5, 0x41300000    # 11.0f

    invoke-direct {v3, v5}, Lo2/y;-><init>(F)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo2/s;

    const/high16 v5, 0x40400000    # 3.0f

    invoke-direct {v3, v5}, Lo2/s;-><init>(F)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo2/y;

    const/high16 v5, 0x41100000    # 9.0f

    invoke-direct {v3, v5}, Lo2/y;-><init>(F)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo2/t;

    const/high16 v5, -0x3ec00000    # -12.0f

    invoke-direct {v3, v4, v5}, Lo2/t;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo2/s;

    const/high16 v4, -0x3f800000    # -4.0f

    invoke-direct {v3, v4}, Lo2/s;-><init>(F)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo2/t;

    const/high16 v4, 0x40800000    # 4.0f

    const/high16 v5, -0x3f000000    # -8.0f

    invoke-direct {v3, v4, v5}, Lo2/t;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lo2/i;->c:Lo2/i;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v2, v0}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v1}, Lo2/d;->b()Lo2/e;

    move-result-object v0

    sput-object v0, Lce/w;->z:Lo2/e;

    return-object v0
.end method

.method public static M()Lo93/e;
    .locals 1

    sget-object v0, Lo93/e;->f:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo93/e;

    return-object v0
.end method

.method public static N()Lq93/b;
    .locals 1

    sget-object v0, Lq93/b;->f:Lq93/b;

    return-object v0
.end method

.method public static final O(Lr93/e;)Lja3/d0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcb3/e;->a:I

    invoke-interface {p0}, Lr93/e;->i()Llb3/c0;

    move-result-object p0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    invoke-static {v0}, Lo93/h;->y(Llb3/y;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    sget v2, Lya3/f;->a:I

    sget-object v2, Lr93/f;->w:Lr93/f;

    invoke-static {v0, v2}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lr93/f;->y:Lr93/f;

    invoke-static {v0, v2}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const-string p0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    return-object v1

    :cond_3
    invoke-interface {v0}, Lr93/e;->V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p0

    instance-of v2, p0, Lja3/d0;

    if-eqz v2, :cond_4

    move-object v1, p0

    check-cast v1, Lja3/d0;

    :cond_4
    if-nez v1, :cond_5

    invoke-static {v0}, Lce/w;->O(Lr93/e;)Lja3/d0;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v1
.end method

.method public static final P(Lhg/i;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhg/i;->c:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-class v2, Ljg/e;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lhg/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lhg/d;

    if-eqz v1, :cond_2

    check-cast v1, Ljg/e;

    iget-object p0, v1, Ljg/e;->a:Ljava/lang/String;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected to find trait "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " but was not present."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static Q(Landroidx/compose/runtime/Composer;)Lg00/c;
    .locals 2

    check-cast p0, Lp1/q;

    const v0, -0x45773cff

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->d:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/c;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static R()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    const/16 v1, 0x2e

    invoke-virtual {v3, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "() ["

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static T(Landroidx/compose/runtime/Composer;)Lg00/e;
    .locals 2

    check-cast p0, Lp1/q;

    const v0, -0x548d6062

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->b:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/e;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static U(Llb3/p0;Lob3/h;Ls2/e;)Z
    .locals 8

    sget-object v0, Llb3/o0;->c:Llb3/o0;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "type"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Llb3/p0;->c:Lob3/o;

    invoke-interface {v1, p1}, Lob3/o;->j(Lob3/h;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v1, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    invoke-interface {v1, p1}, Lob3/o;->m(Lob3/h;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    return v3

    :cond_2
    invoke-virtual {p0}, Llb3/p0;->c()V

    iget-object v2, p0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, p0, Llb3/p0;->h:Lub3/h;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lob3/h;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, p1}, Lub3/h;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v5, v0

    goto :goto_1

    :cond_4
    move-object v5, p2

    :goto_1
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {v1, p1}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object p1

    invoke-interface {v1, p1}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lob3/g;

    invoke-virtual {v5, p0, v6}, Ls2/e;->i0(Llb3/p0;Lob3/g;)Lob3/h;

    move-result-object v6

    invoke-interface {v1, v6}, Lob3/o;->j(Lob3/h;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v1, v6}, Lob3/o;->R(Lob3/g;)Z

    move-result v7

    if-eqz v7, :cond_8

    :cond_7
    invoke-interface {v1, v6}, Lob3/o;->m(Lob3/h;)Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    invoke-virtual {p0}, Llb3/p0;->a()V

    return v3

    :cond_9
    invoke-virtual {v2, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Llb3/p0;->a()V

    const/4 p0, 0x0

    return p0
.end method

.method public static V(Llb3/p0;Lob3/h;Lob3/l;)Z
    .locals 2

    iget-object v0, p0, Llb3/p0;->c:Lob3/o;

    invoke-interface {v0, p1}, Lob3/o;->h(Lob3/h;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-interface {v0, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    iget-boolean p0, p0, Llb3/p0;->b:Z

    if-eqz p0, :cond_2

    invoke-interface {v0, p1}, Lob3/o;->a0(Lob3/h;)V

    :cond_2
    invoke-interface {v0, p1}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object p0

    invoke-interface {v0, p0, p2}, Lob3/o;->H(Lob3/l;Lob3/l;)Z

    move-result p0

    return p0
.end method

.method public static W(Ljava/util/List;)Z
    .locals 0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static X(Llb3/p0;Lob3/h;Lob3/h;)Z
    .locals 10

    const-string v0, "subType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb3/o0;->b:Llb3/o0;

    iget-object v1, p0, Llb3/p0;->c:Lob3/o;

    invoke-interface {v1, p2}, Lob3/o;->R(Lob3/g;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v1, p1}, Lob3/o;->o(Lob3/g;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1, p1}, Lob3/o;->m(Lob3/h;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    instance-of v2, p1, Lob3/d;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Lob3/d;

    invoke-interface {v1, v2}, Lob3/o;->d0(Lob3/d;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p0, p1, v0}, Lce/w;->U(Llb3/p0;Lob3/h;Ls2/e;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v1, p2}, Lob3/o;->m(Lob3/h;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    sget-object v2, Llb3/o0;->d:Llb3/o0;

    invoke-static {p0, p2, v2}, Lce/w;->U(Llb3/p0;Lob3/h;Ls2/e;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {v1, p1}, Lob3/o;->j(Lob3/h;)Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_0
    return v4

    :cond_7
    invoke-interface {v1, p2}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object p2

    sget-object v2, Llb3/o0;->c:Llb3/o0;

    const-string v5, "end"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lce/w;->V(Llb3/p0;Lob3/h;Lob3/l;)Z

    move-result v5

    if-eqz v5, :cond_8

    :goto_1
    return v3

    :cond_8
    invoke-virtual {p0}, Llb3/p0;->c()V

    iget-object v5, p0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, p0, Llb3/p0;->h:Lub3/h;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_9
    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lob3/h;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6, p1}, Lub3/h;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v1, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object v7, v2

    goto :goto_3

    :cond_a
    move-object v7, v0

    :goto_3
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_4

    :cond_b
    const/4 v7, 0x0

    :goto_4
    if-nez v7, :cond_c

    goto :goto_2

    :cond_c
    invoke-interface {v1, p1}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object p1

    invoke-interface {v1, p1}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lob3/g;

    invoke-virtual {v7, p0, v8}, Ls2/e;->i0(Llb3/p0;Lob3/g;)Lob3/h;

    move-result-object v8

    invoke-static {p0, v8, p2}, Lce/w;->V(Llb3/p0;Lob3/h;Lob3/l;)Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {p0}, Llb3/p0;->a()V

    return v3

    :cond_d
    invoke-virtual {v5, v8}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    invoke-virtual {p0}, Llb3/p0;->a()V

    return v4
.end method

.method public static Y(Lio/sentry/v0;)V
    .locals 3

    :try_start_0
    const-class v0, Lio/sentry/profiling/a;

    invoke-static {v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "No continuous profiler provider found, using NoOpContinuousProfiler"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p0, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to load continuous profiler provider, using NoOpContinuousProfiler"

    invoke-interface {p0, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static Z()V
    .locals 4

    sget-object v0, Lio/sentry/o4;->c:Lio/sentry/c4;

    iget-object v0, v0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    :try_start_0
    const-class v1, Lio/sentry/profiling/b;

    invoke-static {v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "No profile converter provider found, using NoOpProfileConverter"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to load profile converter provider, using NoOpProfileConverter"

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final a0(Lce/m;Lce/z;)Lce/y;
    .locals 2

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lce/m;->b:Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->a0(Ljava/lang/CharSequence;)C

    move-result v0

    invoke-static {v0}, Lva3/d;->i(C)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lbi/g;->J(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lbp/b;->H(Ljava/lang/String;)Ll83/k;

    move-result-object p0

    iget-object p1, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    new-instance v0, Lce/y;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, " #"

    invoke-static {p0, v1}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, " ;"

    invoke-static {p0, v1}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lce/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b0(Lc93/a;Lp1/q;)Landroid/app/Activity;
    .locals 3

    const-string v0, "errorMessage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1652e5ba

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const v1, 0x7e315b82

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_3

    :cond_0
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Landroid/app/Activity;

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    return-object v2

    :cond_4
    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final c0(Ljava/util/Set;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Z)Ljava/lang/Object;
    .locals 1

    if-eqz p4, :cond_4

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p4

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p0, p1

    goto :goto_0

    :cond_0
    invoke-interface {p0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    move-object p0, p2

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v0

    :cond_2
    if-nez p3, :cond_3

    return-object p0

    :cond_3
    return-object p3

    :cond_4
    if-eqz p3, :cond_5

    invoke-static {p3, p0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    :cond_5
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d0(Landroid/widget/RemoteViews;Lp6/x1;Lp6/x0;Ljava/util/List;)V
    .locals 3

    check-cast p3, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p3, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-ltz v0, :cond_0

    check-cast v1, Ln6/i;

    invoke-virtual {p1, p2, v0}, Lp6/x1;->b(Lp6/x0;I)Lp6/x1;

    move-result-object v0

    invoke-static {p0, v0, v1}, Lce/w;->k0(Landroid/widget/RemoteViews;Lp6/x1;Ln6/i;)V

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static final g0(Lce/m;Lce/y;)Lce/a0;
    .locals 3

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lce/m;->b:Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->a0(Ljava/lang/CharSequence;)C

    move-result v0

    invoke-static {v0}, Lva3/d;->i(C)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lva3/d;->i(C)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v0, ""

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbi/g;->J(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    iget-object p1, p1, Lce/y;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p0}, Lbp/b;->H(Ljava/lang/String;)Ll83/k;

    move-result-object p0

    iget-object p1, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    new-instance v0, Lce/a0;

    invoke-direct {v0, p1, p0}, Lce/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final h0(Lv6/c;)I
    .locals 7

    iget v0, p0, Lv6/c;->a:I

    const-string v1, "GlanceAppWidget"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const v4, 0x800003

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    const v4, 0x800005

    goto :goto_0

    :cond_1
    if-ne v0, v3, :cond_2

    move v4, v3

    goto :goto_0

    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unknown horizontal alignment: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lv6/a;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget p0, p0, Lv6/c;->b:I

    const/16 v0, 0x30

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    if-ne p0, v2, :cond_4

    const/16 v0, 0x50

    goto :goto_1

    :cond_4
    if-ne p0, v3, :cond_5

    const/16 v0, 0x10

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown vertical alignment: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lv6/b;->b(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    or-int p0, v4, v0

    return p0
.end method

.method public static i0(Ljava/util/Map;)Ljava/lang/String;
    .locals 6

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Lg40/y1;

    const/16 p0, 0x16

    invoke-direct {v4, p0}, Lg40/y1;-><init>(I)V

    const/16 v5, 0x1e

    const-string v1, " "

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j0(Lp1/e2;ILjava/lang/Integer;)Ljava/util/ArrayList;
    .locals 5

    new-instance v0, La2/i;

    invoke-direct {v0, p0}, La2/i;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lp1/e2;->q(I)I

    move-result v1

    invoke-virtual {p0, p1}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v2

    :goto_0
    if-ltz p1, :cond_1

    iget-object v3, p0, Lp1/e2;->a:Lp1/f2;

    invoke-virtual {v3, p1}, Lp1/f2;->j(I)Lp1/n0;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, La2/a;->E(Lp1/n0;Ljava/lang/Object;)V

    if-ltz v1, :cond_0

    invoke-virtual {p0, v1}, Lp1/e2;->a(I)Lp1/a;

    move-result-object p1

    invoke-virtual {p0, v1}, Lp1/e2;->q(I)I

    move-result p2

    move-object v4, v2

    move-object v2, p1

    move p1, v1

    move v1, p2

    move-object p2, v4

    goto :goto_0

    :cond_0
    move p1, v1

    move-object p2, v2

    goto :goto_0

    :cond_1
    iget-object p0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final k(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;FLandroidx/compose/runtime/Composer;II)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v8, p6

    move/from16 v0, p9

    move-object/from16 v10, p8

    check-cast v10, Lp1/q;

    const v2, -0x1920fec5

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0xe

    const/4 v5, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v6, v0, 0x70

    move-object/from16 v13, p1

    if-nez v6, :cond_3

    invoke-virtual {v10, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_3
    and-int/lit16 v6, v0, 0x380

    if-nez v6, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v2, v6

    :cond_5
    and-int/lit16 v6, v0, 0x1c00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_7
    move-object/from16 v6, p3

    :goto_5
    const v7, 0xe000

    and-int v9, v0, v7

    if-nez v9, :cond_9

    move-object/from16 v9, p4

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_6

    :cond_8
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v2, v11

    goto :goto_7

    :cond_9
    move-object/from16 v9, p4

    :goto_7
    const/high16 v14, 0x70000

    and-int v11, v0, v14

    move-object/from16 v15, p5

    if-nez v11, :cond_b

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v11, 0x10000

    :goto_8
    or-int/2addr v2, v11

    :cond_b
    const/high16 v16, 0x380000

    and-int v11, v0, v16

    if-nez v11, :cond_d

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v11, 0x80000

    :goto_9
    or-int/2addr v2, v11

    :cond_d
    const/high16 v17, 0x1c00000

    and-int v11, v0, v17

    if-nez v11, :cond_f

    move/from16 v11, p7

    invoke-virtual {v10, v11}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v12, 0x400000

    :goto_a
    or-int/2addr v2, v12

    goto :goto_b

    :cond_f
    move/from16 v11, p7

    :goto_b
    const/high16 v12, 0xe000000

    and-int/2addr v12, v0

    if-nez v12, :cond_11

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v12, 0x2000000

    :goto_c
    or-int/2addr v2, v12

    :cond_11
    const/high16 v12, 0x70000000

    and-int/2addr v12, v0

    const/4 v4, 0x1

    if-nez v12, :cond_13

    invoke-virtual {v10, v4}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_12

    const/high16 v12, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v12, 0x10000000

    :goto_d
    or-int/2addr v2, v12

    :cond_13
    and-int/lit8 v12, p10, 0xe

    if-nez v12, :cond_15

    invoke-virtual {v10, v4}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_14

    const/4 v4, 0x4

    goto :goto_e

    :cond_14
    move v4, v5

    :goto_e
    or-int v4, p10, v4

    move/from16 v18, v4

    goto :goto_f

    :cond_15
    move/from16 v18, p10

    :goto_f
    const v4, 0x5b6db6db

    and-int/2addr v4, v2

    const v12, 0x12492492

    if-ne v4, v12, :cond_17

    and-int/lit8 v4, v18, 0xb

    if-ne v4, v5, :cond_17

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_10

    :cond_16
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_12

    :cond_17
    :goto_10
    iget-object v4, v1, Lch/l;->a:Ljava/lang/Object;

    invoke-static {v4, v8, v10}, Lch/v;->c(Ljava/lang/Object;Ly2/k;Landroidx/compose/runtime/Composer;)Lmh/j;

    move-result-object v4

    iget-object v5, v1, Lch/l;->c:Lbh/e;

    iget-object v9, v1, Lch/l;->b:Lqt/e;

    shr-int/lit8 v12, v2, 0x3

    move/from16 p8, v7

    and-int/lit16 v7, v12, 0x380

    or-int/lit8 v7, v7, 0x48

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v7, v12

    shr-int/lit8 v12, v2, 0x6

    and-int v19, v12, p8

    or-int v7, v7, v19

    shr-int/lit8 v20, v2, 0xc

    and-int v20, v20, v14

    or-int v7, v7, v20

    move/from16 v20, v12

    const/4 v12, 0x0

    move v11, v7

    move/from16 p8, v14

    move/from16 v14, v20

    move-object/from16 v7, p4

    invoke-static/range {v4 .. v12}, Lch/k;->a(Lmh/j;Lbh/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Lqt/e;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;

    move-result-object v5

    iget-object v4, v4, Lmh/j;->y:Lnh/i;

    instance-of v6, v4, Lch/p;

    if-eqz v6, :cond_18

    check-cast v4, Landroidx/compose/ui/Modifier;

    invoke-interface {v3, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    goto :goto_11

    :cond_18
    move-object v4, v3

    :goto_11
    shl-int/lit8 v2, v2, 0x3

    and-int/lit16 v2, v2, 0x380

    and-int/lit16 v6, v14, 0x1c00

    or-int/2addr v2, v6

    or-int v2, v2, v19

    and-int v6, v14, p8

    or-int/2addr v2, v6

    and-int v6, v14, v16

    or-int/2addr v2, v6

    shl-int/lit8 v6, v18, 0x15

    and-int v6, v6, v17

    or-int v11, v2, v6

    move-object/from16 v8, p6

    move/from16 v9, p7

    move-object v6, v13

    move-object v7, v15

    invoke-static/range {v4 .. v11}, Lce/w;->l(Landroidx/compose/ui/Modifier;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;FLandroidx/compose/runtime/Composer;I)V

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_19

    new-instance v0, Lch/a;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lch/a;-><init>(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;FII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method public static final k0(Landroid/widget/RemoteViews;Lp6/x1;Ln6/i;)V
    .locals 20

    move-object/from16 v0, p2

    instance-of v1, v0, Lv6/j;

    if-eqz v1, :cond_1

    move-object v7, v0

    check-cast v7, Lv6/j;

    iget-object v8, v7, Ln6/k;->b:Ljava/util/ArrayList;

    sget-object v2, Lp6/g1;->y:Lp6/g1;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, v7, Lv6/j;->c:Ln6/o;

    iget-object v0, v7, Lv6/j;->d:Lv6/c;

    iget v1, v0, Lv6/c;->a:I

    new-instance v5, Lv6/a;

    invoke-direct {v5, v1}, Lv6/a;-><init>(I)V

    iget v0, v0, Lv6/c;->b:I

    new-instance v6, Lv6/b;

    invoke-direct {v6, v0}, Lv6/b;-><init>(I)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v6}, Lp6/c1;->b(Landroid/widget/RemoteViews;Lp6/x1;Lp6/g1;ILn6/o;Lv6/a;Lv6/b;)Lp6/x0;

    move-result-object v2

    move-object v3, v1

    move-object v1, v0

    iget-object v0, v7, Lv6/j;->c:Ln6/o;

    invoke-static {v3, v1, v0, v2}, Lvd/f;->e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln6/i;

    invoke-interface {v4}, Ln6/i;->c()Ln6/o;

    move-result-object v5

    new-instance v6, Lp6/a;

    iget-object v9, v7, Lv6/j;->d:Lv6/c;

    invoke-direct {v6, v9}, Lp6/a;-><init>(Lv6/c;)V

    invoke-interface {v5, v6}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object v5

    invoke-interface {v4, v5}, Ln6/i;->b(Ln6/o;)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v3, v2, v8}, Lce/w;->d0(Landroid/widget/RemoteViews;Lp6/x1;Lp6/x0;Ljava/util/List;)V

    return-void

    :cond_1
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    instance-of v2, v0, Lv6/l;

    const-string v7, "setGravity"

    const/16 v4, 0x1f

    if-eqz v2, :cond_3

    move-object v9, v0

    check-cast v9, Lv6/l;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_2

    iget-object v0, v9, Lv6/l;->c:Ln6/o;

    invoke-static {v0}, Lbp/b;->A(Ln6/o;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lp6/g1;->b0:Lp6/g1;

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_2
    sget-object v0, Lp6/g1;->w:Lp6/g1;

    goto :goto_1

    :goto_2
    iget-object v10, v9, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, v9, Lv6/l;->c:Ln6/o;

    iget v0, v9, Lv6/l;->e:I

    new-instance v6, Lv6/b;

    invoke-direct {v6, v0}, Lv6/b;-><init>(I)V

    const/4 v5, 0x0

    move-object v0, v1

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v6}, Lp6/c1;->b(Landroid/widget/RemoteViews;Lp6/x1;Lp6/g1;ILn6/o;Lv6/a;Lv6/b;)Lp6/x0;

    move-result-object v11

    move-object v12, v0

    iget v0, v11, Lp6/x0;->a:I

    new-instance v1, Lv6/c;

    iget v2, v9, Lv6/l;->d:I

    iget v3, v9, Lv6/l;->e:I

    invoke-direct {v1, v2, v3}, Lv6/c;-><init>(II)V

    invoke-static {v1}, Lce/w;->h0(Lv6/c;)I

    move-result v1

    invoke-virtual {v12, v0, v7, v1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    const/4 v7, 0x0

    const v8, 0xefff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v8}, Lp6/x1;->a(Lp6/x1;ILjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JLjava/lang/Integer;I)Lp6/x1;

    move-result-object v1

    move-object v3, v0

    iget-object v0, v9, Lv6/l;->c:Ln6/o;

    invoke-static {v1, v12, v0, v11}, Lvd/f;->e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V

    invoke-static {v12, v3, v11, v10}, Lce/w;->d0(Landroid/widget/RemoteViews;Lp6/x1;Lp6/x0;Ljava/util/List;)V

    iget-object v0, v9, Lv6/l;->c:Ln6/o;

    invoke-static {v0}, Lbp/b;->A(Ln6/o;)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {v10}, Lce/w;->w(Ljava/util/List;)V

    return-void

    :cond_3
    move-object v12, v1

    instance-of v1, v0, Lv6/k;

    if-eqz v1, :cond_5

    move-object v9, v0

    check-cast v9, Lv6/k;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_4

    iget-object v0, v9, Lv6/k;->c:Ln6/o;

    invoke-static {v0}, Lbp/b;->A(Ln6/o;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lp6/g1;->c0:Lp6/g1;

    :goto_3
    move-object v2, v0

    goto :goto_4

    :cond_4
    sget-object v0, Lp6/g1;->x:Lp6/g1;

    goto :goto_3

    :goto_4
    iget-object v10, v9, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, v9, Lv6/k;->c:Ln6/o;

    iget v0, v9, Lv6/k;->e:I

    new-instance v5, Lv6/a;

    invoke-direct {v5, v0}, Lv6/a;-><init>(I)V

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move-object v0, v12

    invoke-static/range {v0 .. v6}, Lp6/c1;->b(Landroid/widget/RemoteViews;Lp6/x1;Lp6/g1;ILn6/o;Lv6/a;Lv6/b;)Lp6/x0;

    move-result-object v11

    iget v0, v11, Lp6/x0;->a:I

    new-instance v1, Lv6/c;

    iget v2, v9, Lv6/k;->e:I

    iget v3, v9, Lv6/k;->d:I

    invoke-direct {v1, v2, v3}, Lv6/c;-><init>(II)V

    invoke-static {v1}, Lce/w;->h0(Lv6/c;)I

    move-result v1

    invoke-virtual {v12, v0, v7, v1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    const/4 v7, 0x0

    const v8, 0xefff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v8}, Lp6/x1;->a(Lp6/x1;ILjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JLjava/lang/Integer;I)Lp6/x1;

    move-result-object v1

    move-object v3, v0

    iget-object v0, v9, Lv6/k;->c:Ln6/o;

    invoke-static {v1, v12, v0, v11}, Lvd/f;->e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V

    invoke-static {v12, v3, v11, v10}, Lce/w;->d0(Landroid/widget/RemoteViews;Lp6/x1;Lp6/x0;Ljava/util/List;)V

    iget-object v0, v9, Lv6/k;->c:Ln6/o;

    invoke-static {v0}, Lbp/b;->A(Ln6/o;)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {v10}, Lce/w;->w(Ljava/util/List;)V

    return-void

    :cond_5
    instance-of v1, v0, Lz6/a;

    const/4 v5, 0x2

    const-string v6, "GlanceAppWidget"

    if-eqz v1, :cond_1e

    check-cast v0, Lz6/a;

    sget-object v1, Lp6/g1;->z:Lp6/g1;

    iget-object v9, v0, Lz6/a;->d:Ln6/o;

    invoke-static {v12, v3, v1, v9}, Lp6/c1;->c(Landroid/widget/RemoteViews;Lp6/x1;Lp6/g1;Ln6/o;)Lp6/x0;

    move-result-object v1

    iget v9, v1, Lp6/x0;->a:I

    iget-object v10, v0, Lz6/a;->a:Ljava/lang/String;

    iget-object v11, v0, Lz6/a;->b:Lz6/f;

    iget v13, v0, Lz6/a;->c:I

    iget-object v14, v3, Lp6/x1;->a:Landroid/content/Context;

    const v15, 0x7fffffff

    if-eq v13, v15, :cond_6

    const-string v15, "setMaxLines"

    invoke-virtual {v12, v9, v15, v13}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    :cond_6
    if-nez v11, :cond_7

    invoke-virtual {v12, v9, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    move-object v5, v3

    goto/16 :goto_d

    :cond_7
    new-instance v13, Landroid/text/SpannableString;

    invoke-direct {v13, v10}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    move-result v10

    iget-object v15, v11, Lz6/f;->b:Ly3/o;

    if-eqz v15, :cond_9

    iget-wide v2, v15, Ly3/o;->a:J

    const-wide v16, 0xff00000000L

    and-long v16, v2, v16

    const-wide v18, 0x100000000L

    cmp-long v15, v16, v18

    if-nez v15, :cond_8

    invoke-static {v2, v3}, Ly3/o;->c(J)F

    move-result v2

    invoke-virtual {v12, v9, v5, v2}, Landroid/widget/RemoteViews;->setTextViewTextSize(IIF)V

    goto :goto_5

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only Sp is currently supported for font sizes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v11, Lz6/f;->c:Lz6/b;

    if-eqz v3, :cond_c

    iget v3, v3, Lz6/b;->a:I

    const/16 v15, 0x2bc

    if-ne v3, v15, :cond_a

    const v3, 0x7f15018d

    goto :goto_6

    :cond_a
    const/16 v15, 0x1f4

    if-ne v3, v15, :cond_b

    const v3, 0x7f15018f

    goto :goto_6

    :cond_b
    const v3, 0x7f150190

    :goto_6
    new-instance v15, Landroid/text/style/TextAppearanceSpan;

    invoke-direct {v15, v14, v3}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    iget-object v3, v11, Lz6/f;->d:Lz6/c;

    if-eqz v3, :cond_1b

    iget v3, v3, Lz6/c;->a:I

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v15, "Unknown TextAlign: "

    const/4 v5, 0x3

    const/4 v8, 0x5

    if-lt v14, v4, :cond_13

    if-ne v3, v5, :cond_d

    const/4 v8, 0x1

    goto :goto_8

    :cond_d
    const/4 v5, 0x1

    if-ne v3, v5, :cond_e

    const/4 v8, 0x3

    goto :goto_8

    :cond_e
    const/4 v5, 0x2

    if-ne v3, v5, :cond_f

    goto :goto_8

    :cond_f
    const/4 v5, 0x4

    if-ne v3, v5, :cond_10

    :goto_7
    const v8, 0x800003

    goto :goto_8

    :cond_10
    if-ne v3, v8, :cond_11

    const v8, 0x800005

    goto :goto_8

    :cond_11
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lz6/c;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    :goto_8
    or-int/lit8 v3, v8, 0x30

    if-lt v14, v4, :cond_12

    invoke-virtual {v12, v9, v7, v3}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    goto :goto_a

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "setGravity is only available on SDK 31 and higher"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v4, Landroid/text/style/AlignmentSpan$Standard;

    move-object/from16 v5, p1

    iget-boolean v7, v5, Lp6/x1;->c:Z

    const/4 v14, 0x3

    if-ne v3, v14, :cond_14

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_14
    const/4 v14, 0x1

    if-ne v3, v14, :cond_16

    if-eqz v7, :cond_15

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_15
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_16
    const/4 v14, 0x2

    if-ne v3, v14, :cond_18

    if-eqz v7, :cond_17

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_17
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_18
    const/4 v7, 0x4

    if-ne v3, v7, :cond_19

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_19
    if-ne v3, v8, :cond_1a

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_9

    :cond_1a
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lz6/c;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_9
    invoke-direct {v4, v3}, Landroid/text/style/AlignmentSpan$Standard;-><init>(Landroid/text/Layout$Alignment;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1b
    :goto_a
    move-object/from16 v5, p1

    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/text/ParcelableSpan;

    const/16 v4, 0x11

    const/4 v7, 0x0

    invoke-virtual {v13, v3, v7, v10, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_c

    :cond_1c
    invoke-virtual {v12, v9, v13}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object v2, v11, Lz6/f;->a:La7/f;

    if-eqz v2, :cond_1d

    iget-wide v2, v2, La7/f;->a:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v2

    invoke-virtual {v12, v9, v2}, Landroid/widget/RemoteViews;->setTextColor(II)V

    goto :goto_d

    :cond_1d
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected text color: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_d
    iget-object v0, v0, Lz6/a;->d:Ln6/o;

    invoke-static {v5, v12, v0, v1}, Lvd/f;->e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V

    return-void

    :cond_1e
    move-object v5, v3

    instance-of v1, v0, Lv6/m;

    if-eqz v1, :cond_1f

    check-cast v0, Lv6/m;

    sget-object v1, Lp6/g1;->I:Lp6/g1;

    iget-object v2, v0, Lv6/m;->a:Ln6/o;

    invoke-static {v12, v5, v1, v2}, Lp6/c1;->c(Landroid/widget/RemoteViews;Lp6/x1;Lp6/g1;Ln6/o;)Lp6/x0;

    move-result-object v1

    iget-object v0, v0, Lv6/m;->a:Ln6/o;

    invoke-static {v5, v12, v0, v1}, Lvd/f;->e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V

    return-void

    :cond_1f
    instance-of v1, v0, Ln6/j;

    if-eqz v1, :cond_2d

    check-cast v0, Ln6/j;

    invoke-static {v0}, Lo73/a;->O(Ln6/j;)Z

    move-result v1

    iget v2, v0, Ln6/j;->d:I

    if-nez v2, :cond_21

    if-eqz v1, :cond_20

    sget-object v1, Lp6/g1;->W:Lp6/g1;

    goto :goto_e

    :cond_20
    sget-object v1, Lp6/g1;->T:Lp6/g1;

    goto :goto_e

    :cond_21
    const/4 v14, 0x1

    if-ne v2, v14, :cond_23

    if-eqz v1, :cond_22

    sget-object v1, Lp6/g1;->X:Lp6/g1;

    goto :goto_e

    :cond_22
    sget-object v1, Lp6/g1;->U:Lp6/g1;

    goto :goto_e

    :cond_23
    const/4 v14, 0x2

    if-ne v2, v14, :cond_25

    if-eqz v1, :cond_24

    sget-object v1, Lp6/g1;->Y:Lp6/g1;

    goto :goto_e

    :cond_24
    sget-object v1, Lp6/g1;->V:Lp6/g1;

    goto :goto_e

    :cond_25
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported ContentScale user: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Ln6/j;->d:I

    invoke-static {v2}, Lv6/i;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Lp6/g1;->U:Lp6/g1;

    :goto_e
    iget-object v2, v0, Ln6/j;->a:Ln6/o;

    invoke-static {v12, v5, v1, v2}, Lp6/c1;->c(Landroid/widget/RemoteViews;Lp6/x1;Lp6/g1;Ln6/o;)Lp6/x0;

    move-result-object v1

    iget v2, v1, Lp6/x0;->a:I

    iget-object v3, v0, Ln6/j;->b:Ln6/r;

    instance-of v4, v3, Ln6/a;

    if-eqz v4, :cond_26

    check-cast v3, Ln6/a;

    iget v3, v3, Ln6/a;->a:I

    invoke-virtual {v12, v2, v3}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_f

    :cond_26
    instance-of v4, v3, Ln6/f;

    if-eqz v4, :cond_2c

    check-cast v3, Ln6/f;

    iget-object v3, v3, Ln6/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v12, v2, v3}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    :goto_f
    iget-object v3, v0, Ln6/j;->c:Ljava/lang/Float;

    if-eqz v3, :cond_27

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v4, v6}, Le93/b;->m(FFF)F

    move-result v3

    const/16 v4, 0xff

    int-to-float v6, v4

    mul-float/2addr v3, v6

    float-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->rint(D)D

    move-result-wide v6

    double-to-float v3, v6

    float-to-int v3, v3

    const/4 v7, 0x0

    invoke-static {v3, v7, v4}, Le93/b;->n(III)I

    move-result v3

    const-string v4, "setImageAlpha"

    invoke-virtual {v12, v2, v4, v3}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    goto :goto_10

    :cond_27
    const/4 v7, 0x0

    :goto_10
    iget-object v3, v0, Ln6/j;->a:Ln6/o;

    invoke-static {v5, v12, v3, v1}, Lvd/f;->e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V

    iget v1, v0, Ln6/j;->d:I

    const/4 v14, 0x1

    if-ne v1, v14, :cond_2b

    iget-object v1, v0, Ln6/j;->a:Ln6/o;

    sget-object v3, Lt6/a;->x:Lt6/a;

    const/4 v4, 0x0

    invoke-interface {v1, v4, v3}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/v;

    if-eqz v1, :cond_28

    iget-object v1, v1, Lv6/v;->a:La7/e;

    goto :goto_11

    :cond_28
    move-object v1, v4

    :goto_11
    sget-object v3, La7/d;->a:La7/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    iget-object v0, v0, Ln6/j;->a:Ln6/o;

    sget-object v1, Lt6/a;->y:Lt6/a;

    invoke-interface {v0, v4, v1}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/n;

    if-eqz v0, :cond_29

    iget-object v4, v0, Lv6/n;->a:La7/e;

    :cond_29
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    :cond_2a
    const/4 v7, 0x1

    :cond_2b
    const-string v0, "setAdjustViewBounds"

    invoke-virtual {v12, v2, v0, v7}, Landroid/widget/RemoteViews;->setBoolean(ILjava/lang/String;Z)V

    return-void

    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "An unsupported ImageProvider type was used."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    instance-of v1, v0, Lp6/w;

    if-eqz v1, :cond_30

    check-cast v0, Lp6/w;

    iget-object v0, v0, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v14, 0x1

    if-gt v1, v14, :cond_2f

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/i;

    if-eqz v0, :cond_2e

    invoke-static {v12, v5, v0}, Lce/w;->k0(Landroid/widget/RemoteViews;Lp6/x1;Ln6/i;)V

    :cond_2e
    return-void

    :cond_2f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Size boxes can only have at most one child "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". The normalization of the composition tree failed."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_30
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown element type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;FLandroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p6, Lp1/q;

    const v0, 0x2e5be4e8    # 4.9998145E-11f

    invoke-virtual {p6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p7

    goto :goto_1

    :cond_1
    move v0, p7

    :goto_1
    and-int/lit8 v1, p7, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p7, 0x380

    if-nez v1, :cond_5

    invoke-virtual {p6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p7, 0x1c00

    if-nez v1, :cond_7

    invoke-virtual {p6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    const v1, 0xe000

    and-int/2addr v1, p7

    if-nez v1, :cond_9

    invoke-virtual {p6, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x4000

    goto :goto_5

    :cond_8
    const/16 v1, 0x2000

    :goto_5
    or-int/2addr v0, v1

    :cond_9
    const/high16 v1, 0x70000

    and-int/2addr v1, p7

    if-nez v1, :cond_b

    invoke-virtual {p6, p5}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_a

    const/high16 v1, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v1, 0x10000

    :goto_6
    or-int/2addr v0, v1

    :cond_b
    const/high16 v1, 0x380000

    and-int/2addr v1, p7

    if-nez v1, :cond_d

    const/4 v1, 0x0

    invoke-virtual {p6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    const/high16 v1, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v1, 0x80000

    :goto_7
    or-int/2addr v0, v1

    :cond_d
    const/high16 v1, 0x1c00000

    and-int/2addr v1, p7

    const/4 v2, 0x1

    if-nez v1, :cond_f

    invoke-virtual {p6, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_e

    const/high16 v1, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v1, 0x400000

    :goto_8
    or-int/2addr v0, v1

    :cond_f
    const v1, 0x16db6db

    and-int/2addr v0, v1

    const v1, 0x492492

    if-ne v0, v1, :cond_11

    invoke-virtual {p6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_9

    :cond_10
    invoke-virtual {p6}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_11
    :goto_9
    sget-object v0, Lch/v;->b:Lnh/e;

    const/4 v0, 0x0

    if-eqz p2, :cond_12

    new-instance v1, Lb30/y4;

    const/4 v3, 0x3

    invoke-direct {v1, p2, v3}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-static {p0, v0, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_a

    :cond_12
    move-object v1, p0

    :goto_a
    invoke-static {v1}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v3, Lcoil/compose/ContentPainterElement;

    invoke-direct {v3, p1, p3, p4, p5}, Lcoil/compose/ContentPainterElement;-><init>(Ln2/a;Lb2/h;Ly2/k;F)V

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lch/d;->b:Lch/d;

    const v4, 0x207baf9a

    invoke-virtual {p6, v4}, Lp1/q;->f0(I)V

    iget-wide v4, p6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-static {p6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {p6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    const v7, 0x53ca7ea5

    invoke-virtual {p6, v7}, Lp1/q;->f0(I)V

    invoke-virtual {p6}, Lp1/q;->i0()V

    iget-boolean v7, p6, Lp1/q;->S:Z

    if-eqz v7, :cond_13

    new-instance v7, Lch/c;

    invoke-direct {v7, v6, v0}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {p6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {p6}, Lp1/q;->s0()V

    :goto_b
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p6, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, p6, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v4, p6, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {p6, v2, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_c
    invoke-virtual {p6}, Lp1/q;->u()Lp1/v1;

    move-result-object p6

    if-eqz p6, :cond_16

    new-instance v0, Lch/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lch/b;-><init>(Landroidx/compose/ui/Modifier;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;FI)V

    iput-object v0, p6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final l0(Landroid/content/Context;ILp6/m1;Lp6/z0;ILandroid/content/ComponentName;Lp6/t0;)Landroid/widget/RemoteViews;
    .locals 21

    move/from16 v0, p4

    new-instance v1, Lp6/x1;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v4

    move v4, v3

    :goto_0
    new-instance v8, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v5, -0x1

    invoke-direct {v8, v5}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v9, Lp6/x0;

    const/4 v6, 0x0

    const/4 v7, 0x7

    invoke-direct {v9, v3, v6, v3, v7}, Lp6/x0;-><init>(ILjava/util/Map;II)V

    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v10, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    const/4 v13, -0x1

    const/4 v14, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v5, p3

    move-object/from16 v16, p5

    move-object/from16 v17, p6

    invoke-direct/range {v1 .. v17}, Lp6/x1;-><init>(Landroid/content/Context;IZLp6/z0;IZLjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JIZLjava/lang/Integer;Landroid/content/ComponentName;Lp6/t0;)V

    move-object v2, v1

    move-object/from16 v1, p2

    iget-object v1, v1, Ln6/k;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    const/4 v4, 0x0

    const/4 v6, -0x1

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln6/i;

    instance-of v4, v4, Lp6/w;

    if-nez v4, :cond_3

    invoke-static {v1}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/i;

    invoke-interface {v1}, Ln6/i;->c()Ln6/o;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lp6/c1;->a(Lp6/x1;Ln6/o;I)Lp6/l1;

    move-result-object v0

    iget-object v3, v0, Lp6/l1;->a:Landroid/widget/RemoteViews;

    iget-object v0, v0, Lp6/l1;->b:Lp6/x0;

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4}, Lp6/x1;->b(Lp6/x0;I)Lp6/x1;

    move-result-object v5

    new-instance v9, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v9, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v6, -0x1

    invoke-direct {v7, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    const/4 v12, 0x0

    const v13, 0xfebf

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    invoke-static/range {v5 .. v13}, Lp6/x1;->a(Lp6/x1;ILjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JLjava/lang/Integer;I)Lp6/x1;

    move-result-object v0

    invoke-static {v3, v0, v1}, Lce/w;->k0(Landroid/widget/RemoteViews;Lp6/x1;Ln6/i;)V

    return-object v3

    :goto_1
    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lp6/w;

    iget-object v3, v3, Lp6/w;->d:Lp6/u1;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ln6/i;

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v9

    check-cast v10, Lp6/w;

    iget-wide v11, v10, Lp6/w;->c:J

    invoke-virtual {v10}, Lp6/w;->c()Ln6/o;

    move-result-object v10

    invoke-static {v2, v10, v0}, Lp6/c1;->a(Lp6/x1;Ln6/o;I)Lp6/l1;

    move-result-object v10

    iget-object v13, v10, Lp6/l1;->a:Landroid/widget/RemoteViews;

    iget-object v10, v10, Lp6/l1;->b:Lp6/x0;

    invoke-virtual {v2, v10, v4}, Lp6/x1;->b(Lp6/x0;I)Lp6/x1;

    move-result-object v10

    new-instance v15, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v15, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    move-object v14, v13

    new-instance v13, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v13, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    const/16 v18, 0x0

    const v19, 0xfcbf

    move-wide/from16 v16, v11

    const/4 v12, 0x0

    move-object v11, v14

    const/4 v14, 0x0

    move-object/from16 v20, v11

    move-object v11, v10

    move-object/from16 v10, v20

    invoke-static/range {v11 .. v19}, Lp6/x1;->a(Lp6/x1;ILjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JLjava/lang/Integer;I)Lp6/x1;

    move-result-object v11

    invoke-static {v10, v11, v9}, Lce/w;->k0(Landroid/widget/RemoteViews;Lp6/x1;Ln6/i;)V

    new-instance v9, Landroid/util/SizeF;

    invoke-static/range {v16 .. v17}, Ly3/h;->c(J)F

    move-result v11

    invoke-static/range {v16 .. v17}, Ly3/h;->b(J)F

    move-result v12

    invoke-direct {v9, v11, v12}, Landroid/util/SizeF;-><init>(FF)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    instance-of v0, v3, Lp6/t1;

    if-eqz v0, :cond_5

    invoke-static {v7}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/RemoteViews;

    return-object v0

    :cond_5
    instance-of v0, v3, Lp6/s1;

    if-nez v0, :cond_7

    sget-object v0, Lp6/r1;->a:Lp6/r1;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_8

    invoke-static {v7}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ld2/b;->d(Ljava/util/Map;)Landroid/widget/RemoteViews;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_a

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v1, :cond_9

    goto :goto_4

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unsupported views size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v7, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Landroid/widget/RemoteViews;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eq v3, v2, :cond_d

    if-ne v3, v1, :cond_c

    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/RemoteViews;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RemoteViews;

    invoke-direct {v1, v3, v0}, Landroid/widget/RemoteViews;-><init>(Landroid/widget/RemoteViews;Landroid/widget/RemoteViews;)V

    return-object v1

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "There must be between 1 and 2 views."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public static m0(Ljava/lang/String;)V
    .locals 2

    sget v0, Lce/w;->E:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lce/w;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "RootBeer"

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static final n(ZLjava/lang/String;Ljava/util/List;Ls20/a;Lt20/n;Ll0/l1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v6, p6

    move-object/from16 v12, p7

    move/from16 v13, p9

    const-string v3, "selectedPaymentMethodCode"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "formElements"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "formArguments"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "usBankAccountFormArguments"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onFormFieldValuesChanged"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onInteractionEvent"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v3, 0x2dd01218

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v13, 0x6

    if-nez v3, :cond_1

    move/from16 v3, p0

    invoke-virtual {v8, v3}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_0

    const/4 v10, 0x4

    goto :goto_0

    :cond_0
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v10, v13

    goto :goto_1

    :cond_1
    move/from16 v3, p0

    move v10, v13

    :goto_1
    and-int/lit8 v11, v13, 0x30

    if-nez v11, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v10, v11

    :cond_3
    and-int/lit16 v11, v13, 0x180

    if-nez v11, :cond_5

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v10, v11

    :cond_5
    and-int/lit16 v11, v13, 0xc00

    if-nez v11, :cond_7

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v10, v11

    :cond_7
    and-int/lit16 v11, v13, 0x6000

    if-nez v11, :cond_9

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v10, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v13

    if-nez v11, :cond_b

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v11, 0x10000

    :goto_6
    or-int/2addr v10, v11

    :cond_b
    const/high16 v11, 0x180000

    and-int/2addr v11, v13

    if-nez v11, :cond_d

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v11, 0x80000

    :goto_7
    or-int/2addr v10, v11

    :cond_d
    const/high16 v11, 0xc00000

    and-int/2addr v11, v13

    const/high16 v14, 0x800000

    if-nez v11, :cond_f

    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    move v11, v14

    goto :goto_8

    :cond_e
    const/high16 v11, 0x400000

    :goto_8
    or-int/2addr v10, v11

    :cond_f
    const v11, 0x492493

    and-int/2addr v11, v10

    const v15, 0x492492

    if-ne v11, v15, :cond_11

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v11

    if-nez v11, :cond_10

    goto :goto_9

    :cond_10
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_11
    :goto_9
    const/4 v11, 0x0

    move v15, v14

    new-array v14, v11, [Ljava/lang/Object;

    const v15, -0x6e73a180

    invoke-virtual {v8, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    const/4 v9, 0x1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v15, v5, :cond_12

    new-instance v15, Lb1/h;

    invoke-direct {v15, v9}, Lb1/h;-><init>(I)V

    invoke-virtual {v8, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v16, v15

    check-cast v16, Lc93/a;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    const/16 v18, 0xc00

    const/16 v19, 0x6

    const/4 v15, 0x0

    move-object/from16 v17, v8

    const/high16 v8, 0x800000

    invoke-static/range {v14 .. v19}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v15, v17

    const-string v9, "rememberSaveable(...)"

    invoke-static {v14, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v14

    check-cast v9, Ljava/lang/String;

    new-array v14, v11, [Ljava/lang/Object;

    const v8, -0x6e737227

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_13

    new-instance v8, Lb1/h;

    const/4 v11, 0x2

    invoke-direct {v8, v11}, Lb1/h;-><init>(I)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v16, v8

    check-cast v16, Lc93/a;

    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    const/16 v18, 0xc00

    const/16 v19, 0x6

    move-object/from16 v17, v15

    const/4 v15, 0x0

    invoke-static/range {v14 .. v19}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v15, v17

    check-cast v8, Lp1/c1;

    const-string v11, "FORM_ELEMENT_UI"

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v11}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v3, -0x6e735dd9

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v10

    const/high16 v4, 0x800000

    if-ne v3, v4, :cond_14

    const/16 v16, 0x1

    goto :goto_a

    :cond_14
    const/16 v16, 0x0

    :goto_a
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v16, :cond_16

    if-ne v4, v5, :cond_15

    goto :goto_b

    :cond_15
    const/4 v7, 0x0

    goto :goto_c

    :cond_16
    :goto_b
    new-instance v4, Lb30/h2;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v4, v12, v6, v7}, Lb30/h2;-><init>(Lc93/a;Lq83/d;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v4, Lc93/m;

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    const-string v6, "AddPaymentMethod"

    invoke-static {v11, v6, v4}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v6, -0x6e733607

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x800000

    if-ne v3, v6, :cond_17

    const/4 v3, 0x1

    goto :goto_d

    :cond_17
    const/4 v3, 0x0

    :goto_d
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_18

    if-ne v6, v5, :cond_19

    :cond_18
    new-instance v6, Laz1/b;

    const/4 v3, 0x4

    invoke-direct {v6, v12, v3}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    invoke-static {v4, v6}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move-object v6, v8

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v16, v6

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-eqz v6, :cond_1a

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_e
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v15, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v15, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-nez v6, :cond_1b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    :cond_1b
    invoke-static {v7, v15, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v15, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ly00/f4;->G:Lt9/c0;

    const-string v3, "us_bank_account"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const v4, 0xe000

    if-nez v3, :cond_1d

    const-string v3, "link"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    :cond_1d
    move-object v8, v15

    const/4 v11, 0x0

    const/4 v15, 0x1

    goto :goto_f

    :cond_1e
    const v3, -0x2ce423d2

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    shr-int/lit8 v3, v10, 0x6

    and-int/lit8 v3, v3, 0x70

    shl-int/lit8 v5, v10, 0x6

    and-int/lit16 v6, v5, 0x380

    or-int/2addr v3, v6

    shr-int/lit8 v6, v10, 0x9

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v3, v6

    and-int/2addr v4, v5

    or-int v10, v3, v4

    const/4 v11, 0x0

    move/from16 v5, p0

    move-object/from16 v7, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p6

    move-object v3, v9

    move-object v9, v15

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static/range {v3 .. v11}, Lcom/squareup/wire/n;->d(Ljava/lang/String;Ls20/a;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_f
    const v3, -0x2cec533a

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const v3, 0x5121bf2e

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    move-object/from16 v6, v16

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_1f

    if-ne v7, v5, :cond_20

    :cond_1f
    new-instance v7, Li;

    const/16 v3, 0x11

    invoke-direct {v7, v3, v0, v6}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v5, v7

    check-cast v5, Lc93/a;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v3, v10, 0x9

    and-int/lit8 v3, v3, 0x7e

    shl-int/lit8 v7, v10, 0xc

    and-int/2addr v4, v7

    or-int v9, v3, v4

    move/from16 v7, p0

    move-object/from16 v3, p3

    move-object v4, v0

    invoke-static/range {v3 .. v9}, Ls9/f;->n(Ls20/a;Lt20/n;Lc93/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_21

    new-instance v0, Lb30/e2;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object v6, v1

    move-object v8, v12

    move v9, v13

    move/from16 v1, p0

    invoke-direct/range {v0 .. v9}, Lb30/e2;-><init>(ZLjava/lang/String;Ljava/util/List;Ls20/a;Lt20/n;Ll0/l1;Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method public static n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;
    .locals 7

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/mapbox/bindgen/Value;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/mapbox/bindgen/Value;

    return-object p0

    :cond_0
    instance-of v0, p0, Lvu/d;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/mapbox/bindgen/Value;

    return-object p0

    :cond_1
    instance-of v0, p0, Lcv/b;

    if-eqz v0, :cond_4

    check-cast p0, Lcv/b;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string v4, "delay"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string v2, "duration"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcv/b;->b:Ljava/lang/Long;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v5, v6}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object p0, p0, Lcv/b;->a:Ljava/lang/Long;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v3, v4}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    return-object p0

    :cond_4
    instance-of v0, p0, Lzu/a;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/mapbox/bindgen/Value;

    check-cast p0, Lzu/a;

    const-string p0, "round"

    invoke-direct {v0, p0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    instance-of v0, p0, Lcom/mapbox/maps/TileCacheBudget;

    if-eqz v0, :cond_9

    check-cast p0, Lcom/mapbox/maps/TileCacheBudget;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/mapbox/maps/TileCacheBudget;->getTypeInfo()Lcom/mapbox/maps/TileCacheBudget$Type;

    move-result-object v1

    if-nez v1, :cond_6

    const/4 v1, -0x1

    goto :goto_0

    :cond_6
    sget-object v2, Lav/f;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    const/4 v2, 0x1

    if-eq v1, v2, :cond_8

    const/4 v2, 0x2

    if-ne v1, v2, :cond_7

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-virtual {p0}, Lcom/mapbox/maps/TileCacheBudget;->getTileCacheBudgetInTiles()Lcom/mapbox/maps/TileCacheBudgetInTiles;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/maps/TileCacheBudgetInTiles;->getSize()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string p0, "tiles"

    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v0, Lcom/mapbox/maps/MapboxStyleException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse TileCacheBudget: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/mapbox/maps/MapboxStyleException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-virtual {p0}, Lcom/mapbox/maps/TileCacheBudget;->getTileCacheBudgetInMegabytes()Lcom/mapbox/maps/TileCacheBudgetInMegabytes;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/maps/TileCacheBudgetInMegabytes;->getSize()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string p0, "megabytes"

    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    return-object p0

    :cond_9
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_a

    new-instance v0, Lcom/mapbox/bindgen/Value;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    int-to-long v1, p0

    invoke-direct {v0, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    return-object v0

    :cond_a
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_b

    new-instance v0, Lcom/mapbox/bindgen/Value;

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, p0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_b
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_c

    new-instance v0, Lcom/mapbox/bindgen/Value;

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-direct {v0, p0}, Lcom/mapbox/bindgen/Value;-><init>(Z)V

    return-object v0

    :cond_c
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_e

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_d

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_d

    new-instance v0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    return-object v0

    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_10

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_f

    new-instance v0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    float-to-double v1, p0

    invoke-direct {v0, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    return-object v0

    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_10
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_11

    new-instance v0, Lcom/mapbox/bindgen/Value;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    return-object v0

    :cond_11
    instance-of v0, p0, [I

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    check-cast p0, [I

    new-instance v0, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_2
    if-ge v1, v2, :cond_12

    aget v3, p0, v1

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v3}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_12
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_13
    instance-of v0, p0, [Z

    if-eqz v0, :cond_15

    check-cast p0, [Z

    new-instance v0, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_3
    if-ge v1, v2, :cond_14

    aget-boolean v3, p0, v1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_14
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_15
    instance-of v0, p0, [D

    if-eqz v0, :cond_17

    check-cast p0, [D

    new-instance v0, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_4
    if-ge v1, v2, :cond_16

    aget-wide v3, p0, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_16
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_17
    instance-of v0, p0, [F

    if-eqz v0, :cond_19

    check-cast p0, [F

    new-instance v0, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_5
    if-ge v1, v2, :cond_18

    aget v3, p0, v1

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_18
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_19
    instance-of v0, p0, [J

    if-eqz v0, :cond_1b

    check-cast p0, [J

    new-instance v0, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_6
    if-ge v1, v2, :cond_1a

    aget-wide v3, p0, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v3}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_1a
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_1b
    instance-of v0, p0, [Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v0, :cond_1e

    check-cast p0, [Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    array-length v3, p0

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p0

    :goto_7
    if-ge v1, v3, :cond_1d

    aget-object v4, p0, v1

    if-eqz v4, :cond_1c

    invoke-static {v4}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v4

    goto :goto_8

    :cond_1c
    move-object v4, v2

    :goto_8
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1d
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_1e
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_21

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1f

    invoke-static {v1}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v1

    goto :goto_a

    :cond_1f
    move-object v1, v2

    :goto_a
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_20
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_21
    instance-of v0, p0, Ljava/util/HashMap;

    if-eqz v0, :cond_23

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "castedValue.keys"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "key"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lce/w;->n0(Ljava/lang/Object;)Lcom/mapbox/bindgen/Value;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_22
    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    return-object p0

    :cond_23
    instance-of v0, p0, Lcom/google/gson/JsonPrimitive;

    if-eqz v0, :cond_27

    move-object v0, p0

    check-cast v0, Lcom/google/gson/JsonPrimitive;

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isBoolean()Z

    move-result v1

    if-eqz v1, :cond_24

    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsBoolean()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Z)V

    return-object p0

    :cond_24
    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z

    move-result v1

    if-eqz v1, :cond_25

    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsDouble()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    return-object p0

    :cond_25
    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isString()Z

    move-result v1

    if-eqz v1, :cond_26

    new-instance p0, Lcom/mapbox/bindgen/Value;

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse JsonPrimitive: "

    invoke-static {p0, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrapping \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\" is not supported."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final o(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, -0xcc27209

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_1

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_2

    :cond_1
    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_1

    :cond_2
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    :goto_2
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_4

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v21, v1

    move-object v1, v4

    goto :goto_5

    :cond_4
    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_5
    move-object v3, v4

    :goto_4
    invoke-static {v1}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v4, v4, Ld40/n;->g:J

    invoke-static {v1}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v6

    iget-object v6, v6, Lg1/h9;->g:Ll3/v0;

    and-int/lit8 v22, v2, 0x7e

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object/from16 v21, v1

    move-object v1, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_5
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Lb30/j1;

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct {v3, v0, v1, v4, v5}, Lb30/j1;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final p(ZLjava/util/List;Ljava/lang/String;Lq20/c;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ls20/a;Lt20/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 27

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p2

    move-object/from16 v3, p3

    move-object/from16 v12, p4

    move-object/from16 v4, p5

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    move-object/from16 v15, p8

    move/from16 v0, p13

    move/from16 v5, p14

    const-string v6, "supportedPaymentMethods"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "selectedItemCode"

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "formElements"

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onItemSelectedListener"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "formArguments"

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "usBankAccountFormArguments"

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onFormFieldValuesChanged"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p12

    check-cast v8, Lp1/q;

    const v6, -0x11900fa2

    invoke-virtual {v8, v6}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    const/16 v16, 0x10

    const/16 v17, 0x20

    if-eqz v10, :cond_1

    move/from16 v10, v17

    goto :goto_1

    :cond_1
    move/from16 v10, v16

    :goto_1
    or-int/2addr v6, v10

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x100

    goto :goto_2

    :cond_2
    const/16 v10, 0x80

    :goto_2
    or-int/2addr v6, v10

    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_5

    and-int/lit16 v10, v0, 0x1000

    if-nez v10, :cond_3

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_3

    :cond_3
    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_3
    if-eqz v10, :cond_4

    const/16 v10, 0x800

    goto :goto_4

    :cond_4
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v6, v10

    :cond_5
    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x4000

    goto :goto_5

    :cond_6
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v6, v10

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/high16 v10, 0x20000

    goto :goto_6

    :cond_7
    const/high16 v10, 0x10000

    :goto_6
    or-int/2addr v6, v10

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/high16 v10, 0x100000

    goto :goto_7

    :cond_8
    const/high16 v10, 0x80000

    :goto_7
    or-int/2addr v6, v10

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/high16 v10, 0x800000

    goto :goto_8

    :cond_9
    const/high16 v10, 0x400000

    :goto_8
    or-int/2addr v6, v10

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x4000000

    goto :goto_9

    :cond_a
    const/high16 v10, 0x2000000

    :goto_9
    or-int/2addr v6, v10

    and-int/lit16 v10, v5, 0x200

    if-eqz v10, :cond_b

    const/high16 v18, 0x30000000

    or-int v6, v6, v18

    move-object/from16 v9, p9

    goto :goto_b

    :cond_b
    move-object/from16 v9, p9

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_c

    const/high16 v19, 0x20000000

    goto :goto_a

    :cond_c
    const/high16 v19, 0x10000000

    :goto_a
    or-int v6, v6, v19

    :goto_b
    and-int/lit16 v7, v5, 0x400

    if-eqz v7, :cond_d

    const/16 v18, 0x6

    move-object/from16 v0, p10

    goto :goto_c

    :cond_d
    move-object/from16 v0, p10

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_e

    const/16 v18, 0x4

    goto :goto_c

    :cond_e
    const/16 v18, 0x2

    :goto_c
    and-int/lit16 v0, v5, 0x800

    if-eqz v0, :cond_f

    or-int/lit8 v16, v18, 0x30

    move/from16 v20, v0

    move-object/from16 v0, p11

    goto :goto_d

    :cond_f
    move/from16 v20, v0

    move-object/from16 v0, p11

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_10

    move/from16 v16, v17

    :cond_10
    or-int v16, v18, v16

    :goto_d
    const v17, 0x12492493

    and-int v0, v6, v17

    const v1, 0x12492492

    const/16 v12, 0x12

    if-ne v0, v1, :cond_12

    and-int/lit8 v0, v16, 0x13

    if-ne v0, v12, :cond_12

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_e

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object v10, v3

    move-object/from16 v21, v9

    move-object v9, v8

    goto/16 :goto_17

    :cond_12
    :goto_e
    sget-object v21, Lb2/t;->w:Lb2/t;

    if-eqz v10, :cond_13

    move-object/from16 v0, v21

    goto :goto_f

    :cond_13
    move-object v0, v9

    :goto_f
    sget-object v1, Lp1/l;->a:Lp1/v0;

    const/4 v9, 0x0

    if-eqz v7, :cond_15

    const v7, -0x2e72a5b0

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_14

    new-instance v7, Lb01/f;

    invoke-direct {v7, v12}, Lb01/f;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    move-object/from16 v7, p10

    :goto_10
    if-eqz v20, :cond_17

    const v10, -0x2e72a090

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_16

    new-instance v10, Lou1/a;

    move/from16 p12, v12

    const/4 v12, 0x7

    invoke-direct {v10, v12}, Lou1/a;-><init>(I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_11

    :cond_16
    move/from16 p12, v12

    :goto_11
    check-cast v10, Lc93/a;

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object v12, v10

    goto :goto_12

    :cond_17
    move/from16 p12, v12

    move-object/from16 v12, p11

    :goto_12
    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    const v9, -0x2e7297ac

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_18

    new-instance v9, Lm40/w;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    const-string v3, "getApplicationContext(...)"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x1e

    invoke-direct {v9, v10, v3}, Lm40/w;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v9, Lm40/w;

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    sget-object v3, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v17

    const v3, -0x2e7283ad

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    and-int/lit16 v3, v6, 0x380

    const/16 v10, 0x100

    if-ne v3, v10, :cond_19

    const/4 v3, 0x1

    goto :goto_13

    :cond_19
    const/4 v3, 0x0

    :goto_13
    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v3, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_1a

    if-ne v10, v1, :cond_1c

    :cond_1a
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu00/f;

    iget-object v4, v4, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_1b
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    const v4, -0x2e72702b    # -7.600044E10f

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->e(I)Z

    move-result v4

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_1d

    if-ne v10, v1, :cond_1e

    :cond_1d
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lu00/f;

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lu00/f;

    const/4 v4, 0x0

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v18, v0

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v2, v8, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 p11, v3

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-eqz v3, :cond_1f

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1f
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_15
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_20

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    :cond_20
    invoke-static {v2, v8, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    const/high16 v19, 0x1c00000

    const v20, 0xe000

    const/4 v1, 0x1

    if-le v0, v1, :cond_22

    const v0, -0x35db2bda    # -2700553.5f

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/16 v0, 0xc

    int-to-float v0, v0

    const/16 v26, 0x7

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move/from16 v25, v0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v2, v6, 0x3

    and-int/lit8 v3, v2, 0xe

    const/high16 v4, 0x180000

    or-int/2addr v3, v4

    shl-int/lit8 v4, v6, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v4, v6, 0x1c00

    or-int/2addr v3, v4

    and-int v2, v2, v20

    or-int/2addr v2, v3

    const/high16 v3, 0x40000

    or-int/2addr v2, v3

    shl-int/lit8 v3, v16, 0x15

    and-int v3, v3, v19

    or-int/2addr v2, v3

    move-object v5, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move v13, v1

    move-object v11, v10

    move-object/from16 p9, v12

    move-object/from16 v21, v18

    const/4 v12, 0x0

    move/from16 v1, p11

    move v10, v2

    move/from16 v18, v6

    move/from16 v2, p0

    move-object v6, v0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v10}, Lbp/b;->b(Ljava/util/List;IZLq20/c;Lkotlin/jvm/functions/Function1;Lm40/w;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ln0/u;Landroidx/compose/runtime/Composer;I)V

    move v1, v2

    move-object v10, v3

    move-object/from16 v22, v7

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_22
    move v13, v1

    move-object/from16 v22, v7

    move-object v9, v8

    move-object v11, v10

    move-object/from16 p9, v12

    move-object/from16 v21, v18

    const/4 v12, 0x0

    move/from16 v1, p0

    move-object/from16 v10, p3

    move/from16 v18, v6

    invoke-static/range {p1 .. p1}, Lse/a;->P(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_23

    const v0, -0x35d2d6e8    # -2837062.0f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-static/range {p1 .. p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu00/f;

    invoke-virtual {v0, v10}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object v0

    and-int/lit8 v2, v18, 0xe

    invoke-static {v1, v0, v9, v2}, Lse/g;->l(ZLt00/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_23
    const v0, -0x35d101ab

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_16
    iget-object v0, v11, Lu00/f;->a:Ljava/lang/String;

    and-int/lit8 v2, v18, 0xe

    shr-int/lit8 v3, v18, 0x6

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    shr-int/lit8 v4, v18, 0x9

    and-int/lit16 v5, v4, 0x1c00

    or-int/2addr v2, v5

    and-int v4, v4, v20

    or-int/2addr v2, v4

    const/high16 v4, 0x380000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v16, 0x12

    and-int v3, v3, v19

    or-int/2addr v2, v3

    move v3, v1

    move-object v1, v0

    move v0, v3

    move-object/from16 v3, p6

    move-object/from16 v7, p9

    move-object v8, v9

    move-object v4, v14

    move-object v6, v15

    move-object/from16 v5, v17

    move v9, v2

    move-object/from16 v2, p4

    invoke-static/range {v0 .. v9}, Lce/w;->n(ZLjava/lang/String;Ljava/util/List;Ls20/a;Lt20/n;Ll0/l1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v9, v8

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object v12, v7

    move-object/from16 v11, v22

    :goto_17
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_24

    new-instance v0, Lb30/f2;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v13, p13

    move/from16 v14, p14

    move-object v4, v10

    move-object/from16 v10, v21

    invoke-direct/range {v0 .. v14}, Lb30/f2;-><init>(ZLjava/util/List;Ljava/lang/String;Lq20/c;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ls20/a;Lt20/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method public static final q(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 14

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x57e2e0aa

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SimulationContext;->getBypassCustomThrottles()Z

    move-result v1

    :goto_0
    move v7, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, v1

    check-cast v6, Lp1/c1;

    if-nez p1, :cond_2

    sget-object v1, Lcom/amplitude/android/engagement/types/DebugStatus;->ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_2
    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesCustomThrottles()Z

    move-result v1

    if-nez v7, :cond_4

    if-nez v1, :cond_4

    if-eqz p3, :cond_3

    goto :goto_3

    :cond_3
    sget-object v1, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_2

    :cond_4
    :goto_3
    sget-object v1, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_2

    :goto_4
    new-instance v2, Loj/h;

    move-object v4, p0

    move-object v5, p1

    move-object/from16 v8, p2

    invoke-direct/range {v2 .. v8}, Loj/h;-><init>(Lcom/amplitude/android/engagement/types/DebugStatus;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lp1/c1;ZLcom/amplitude/android/engagement/a;)V

    const v1, 0x473c86b7

    invoke-static {v1, v0, v2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x186

    const-string v4, "Throttle"

    invoke-static {v4, v3, v1, v0, v2}, Lx30/s0;->b(Ljava/lang/String;Lcom/amplitude/android/engagement/types/DebugStatus;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_5

    return-void

    :cond_5
    new-instance v8, Loj/m;

    move-object v9, p0

    move-object v10, p1

    move-object/from16 v11, p2

    move/from16 v12, p3

    move/from16 v13, p5

    invoke-direct/range {v8 .. v13}, Loj/m;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/a;ZI)V

    iput-object v8, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final r(Landroidx/lifecycle/x;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lki/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lki/e;

    iget v1, v0, Lki/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lki/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lki/e;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lki/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lki/e;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lki/e;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lki/e;->w:Landroidx/lifecycle/x;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p1

    sget-object v2, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_3

    return-object v3

    :cond_3
    new-instance p1, Lkotlin/jvm/internal/g0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :try_start_1
    iput-object p0, v0, Lki/e;->w:Landroidx/lifecycle/x;

    iput-object p1, v0, Lki/e;->x:Lkotlin/jvm/internal/g0;

    iput v4, v0, Lki/e;->z:I

    new-instance v2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    new-instance v0, Lki/f;

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lki/f;-><init>(Lbc3/m;I)V

    iput-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    move-object p0, p1

    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Landroidx/lifecycle/f0;

    if-eqz p0, :cond_5

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_5
    return-object v3

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v5

    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Landroidx/lifecycle/f0;

    if-eqz p0, :cond_6

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_6
    throw p1
.end method

.method public static final s(Lp1/e2;)Ljava/util/List;
    .locals 4

    iget-boolean v0, p0, Lp1/e2;->f:Z

    if-nez v0, :cond_1

    iget v0, p0, Lp1/e2;->c:I

    if-eqz v0, :cond_1

    new-instance v0, La2/i;

    invoke-direct {v0, p0}, La2/i;-><init>(Ljava/lang/Object;)V

    iget v1, p0, Lp1/e2;->i:I

    iget v2, p0, Lp1/e2;->l:I

    iget-object v3, p0, Lp1/e2;->b:[I

    invoke-static {v3, v1}, Lp1/h2;->c([II)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_0
    if-ltz v1, :cond_0

    iget-object v3, p0, Lp1/e2;->a:Lp1/f2;

    invoke-virtual {v3, v1}, Lp1/f2;->j(I)Lp1/n0;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, La2/a;->E(Lp1/n0;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v2

    invoke-virtual {p0, v1}, Lp1/e2;->q(I)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object p0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayList;

    return-object p0

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final t(Lp1/i2;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;
    .locals 4

    iget-boolean v0, p0, Lp1/i2;->w:Z

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lp1/i2;->p()I

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, La2/i;

    invoke-direct {v0, p0}, La2/i;-><init>(Ljava/lang/Object;)V

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_0

    :cond_0
    iget p3, p0, Lp1/i2;->v:I

    if-gez p3, :cond_1

    iget-object p3, p0, Lp1/i2;->b:[I

    invoke-virtual {p0, p3, p2}, Lp1/i2;->D([II)I

    move-result p3

    :cond_1
    :goto_0
    if-nez p1, :cond_3

    iget p1, p0, Lp1/i2;->i:I

    iget-object v1, p0, Lp1/i2;->b:[I

    invoke-virtual {p0, p2}, Lp1/i2;->r(I)I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lp1/i2;->M([II)I

    move-result v1

    sub-int/2addr p1, v1

    iget-object v1, p0, Lp1/i2;->s:La0/g0;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p2}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/q0;

    if-eqz v1, :cond_2

    iget v1, v1, La0/q0;->b:I

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    add-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_3
    :goto_2
    if-ltz p2, :cond_5

    invoke-virtual {p0, p2}, Lp1/i2;->N(I)Lp1/n0;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, La2/a;->E(Lp1/n0;Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lp1/i2;->b(I)Lp1/a;

    move-result-object p1

    if-ltz p3, :cond_4

    iget-object p2, p0, Lp1/i2;->b:[I

    invoke-virtual {p0, p2, p3}, Lp1/i2;->D([II)I

    move-result p2

    move v3, p3

    move p3, p2

    move p2, v3

    goto :goto_2

    :cond_4
    move p2, p3

    goto :goto_2

    :cond_5
    iget-object p0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayList;

    return-object p0

    :cond_6
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static u(Lp1/i2;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lp1/i2;->t:I

    invoke-static {p0, v0, v1, v0}, Lce/w;->t(Lp1/i2;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Landroidx/compose/ui/platform/AndroidComposeView;)J
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    move-object v0, p0

    :goto_0
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    goto :goto_1

    :cond_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-wide v1, 0xffffffffL

    const/16 v3, 0x20

    if-eqz v0, :cond_4

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt p0, v4, :cond_2

    sget-object p0, Lb3/m1;->a:Lb3/m1;

    goto :goto_2

    :cond_2
    const/16 v4, 0x1d

    if-lt p0, v4, :cond_3

    sget-object p0, Lb3/l1;->c:Lb3/l1;

    goto :goto_2

    :cond_3
    sget-object p0, Lb3/l1;->b:Lb3/l1;

    :goto_2
    invoke-interface {p0, v0}, Lb3/k1;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    int-to-long v4, v0

    :goto_3
    shl-long v3, v4, v3

    int-to-long v5, p0

    and-long v0, v5, v1

    or-long/2addr v0, v3

    return-wide v0

    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    iget v4, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v4, v4

    mul-float/2addr v4, p0

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v0, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v0, v0

    mul-float/2addr v0, p0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p0

    int-to-long v4, v4

    goto :goto_3
.end method

.method public static final w(Ljava/util/List;)V
    .locals 1

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/i;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static x(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->clipOutPath(Landroid/graphics/Path;)Z

    move-result p0

    return p0
.end method

.method public static y(Landroid/graphics/Canvas;FFFF)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipOutRect(FFFF)Z

    move-result p0

    return p0
.end method

.method public static z(Landroid/graphics/Canvas;IIII)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipOutRect(IIII)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public S(Landroid/view/View;)F
    .locals 1

    sget-boolean v0, Lce/w;->w:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, Lbc/h0;->a(Landroid/view/View;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, Lce/w;->w:Z

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    return p1
.end method

.method public d(Lng3/m;)Lng3/s;
    .locals 2

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_1

    invoke-interface {p0, p1}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lng3/a;

    iget-object p1, p1, Lng3/a;->x:Lng3/s;

    return-object p1

    :cond_0
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public e0(Landroid/view/View;F)V
    .locals 1

    sget-boolean v0, Lce/w;->w:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Lbc/h0;->b(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, Lce/w;->w:Z

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public f(Lng3/m;)I
    .locals 3

    invoke-virtual {p0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-interface {p0, p1}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    return p1
.end method

.method public f0(Landroid/view/View;I)V
    .locals 3

    sget-boolean v0, Lce/w;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "mViewFlags"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lce/w;->x:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "ViewUtilsApi19"

    const-string v2, "fetchViewFlagsField: "

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    sput-boolean v0, Lce/w;->y:Z

    :cond_0
    sget-object v0, Lce/w;->x:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sget-object v1, Lce/w;->x:Ljava/lang/reflect/Field;

    and-int/lit8 v0, v0, -0xd

    or-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method public g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
