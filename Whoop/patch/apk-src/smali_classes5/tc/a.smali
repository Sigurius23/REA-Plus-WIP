.class public abstract Ltc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "DiagnosticsWrkr"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ltc/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final a(Lqc/l;Lqc/w;Lqc/i;Ljava/util/List;)Ljava/lang/String;
    .locals 17

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqc/q;

    invoke-static {v2}, Lhg3/i;->P(Lqc/q;)Lqc/j;

    move-result-object v3

    iget-object v4, v2, Lqc/q;->a:Ljava/lang/String;

    move-object/from16 v5, p2

    invoke-virtual {v5, v3}, Lqc/i;->a(Lqc/j;)Lqc/h;

    move-result-object v3

    if-eqz v3, :cond_0

    iget v3, v3, Lqc/h;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "workSpecId"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p0

    iget-object v7, v6, Lqc/l;->a:Landroidx/room/z0;

    new-instance v8, Lht2/d;

    const/16 v9, 0x1b

    invoke-direct {v8, v4, v9}, Lht2/d;-><init>(Ljava/lang/String;I)V

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v7, v9, v10, v8}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    move-object v11, v7

    check-cast v11, Ljava/lang/Iterable;

    const/4 v15, 0x0

    const/16 v16, 0x3e

    const-string v12, ","

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v8, p1

    iget-object v11, v8, Lqc/w;->a:Landroidx/room/z0;

    new-instance v12, Le61/g;

    const/16 v13, 0x12

    invoke-direct {v12, v4, v13}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-static {v11, v9, v10, v12}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    move-object v10, v9

    check-cast v10, Ljava/lang/Iterable;

    const/16 v15, 0x3e

    const-string v11, ","

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v9

    const-string v10, "\n"

    const-string v11, "\t "

    invoke-static {v10, v4, v11}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v10, v2, Lqc/q;->c:Ljava/lang/String;

    invoke-static {v3, v10, v11, v11, v4}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v2, v2, Lqc/q;->b:Lic/m0;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x9

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
