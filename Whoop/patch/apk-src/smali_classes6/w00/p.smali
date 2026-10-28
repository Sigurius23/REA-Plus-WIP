.class public final Lw00/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/n0;


# static fields
.field public static final b:Lw00/p;

.field public static final c:Lw00/p;

.field public static final d:Lw00/p;

.field public static final e:Lw00/p;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lw00/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw00/p;-><init>(I)V

    sput-object v0, Lw00/p;->b:Lw00/p;

    new-instance v0, Lw00/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw00/p;-><init>(I)V

    sput-object v0, Lw00/p;->c:Lw00/p;

    new-instance v0, Lw00/p;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lw00/p;-><init>(I)V

    sput-object v0, Lw00/p;->d:Lw00/p;

    new-instance v0, Lw00/p;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw00/p;-><init>(I)V

    sput-object v0, Lw00/p;->e:Lw00/p;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lw00/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;
    .locals 1

    iget v0, p0, Lw00/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;
    .locals 1

    iget v0, p0, Lw00/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(ZLq20/c;)Lt00/a;
    .locals 2

    iget v0, p0, Lw00/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lw00/p;->e()Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    const p2, 0x7f14105b

    invoke-static {p2}, Ls4/i;->h(I)Lzy/b;

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0x1fc

    invoke-static {p1, p2, v0, v1}, Lt00/a;->a(Lt00/a;Lzy/b;Ljava/lang/String;I)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0}, Lw00/p;->e()Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0}, Lw00/p;->e()Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    if-eqz p1, :cond_0

    const p1, 0x7f141057

    goto :goto_0

    :cond_0
    const p1, 0x7f141056

    :goto_0
    invoke-virtual {p0}, Lw00/p;->e()Lu00/f;

    move-result-object v0

    invoke-virtual {v0, p2}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p2

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    const/4 v0, 0x0

    const/16 v1, 0x1fc

    invoke-static {p2, p1, v0, v1}, Lt00/a;->a(Lt00/a;Lzy/b;Ljava/lang/String;I)Lt00/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Lu00/f;
    .locals 12

    iget v0, p0, Lw00/p;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lw00/v0;->b:Ly00/f4;

    iget-object v2, v0, Ly00/f4;->w:Ljava/lang/String;

    new-instance v1, Lu00/f;

    const/4 v7, 0x0

    const/16 v8, 0x102

    const/4 v3, 0x0

    const v4, 0x7f1410ba

    const v5, 0x7f080818

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v8}, Lu00/f;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLzy/b;I)V

    return-object v1

    :pswitch_0
    sget-object v0, Lw00/b0;->b:Ly00/f4;

    iget-object v2, v0, Ly00/f4;->w:Ljava/lang/String;

    new-instance v1, Lu00/f;

    const/4 v7, 0x0

    const/16 v8, 0x100

    const-string v3, "link_card_brand"

    const v4, 0x7f1410a7

    const v5, 0x7f080818

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v8}, Lu00/f;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLzy/b;I)V

    return-object v1

    :pswitch_1
    sget-object v0, Lw00/b0;->b:Ly00/f4;

    iget-object v2, v0, Ly00/f4;->w:Ljava/lang/String;

    new-instance v1, Lu00/f;

    const/4 v7, 0x0

    const/16 v8, 0x100

    const-string v3, "link_instant_debits"

    const v4, 0x7f1410a7

    const v5, 0x7f080818

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v8}, Lu00/f;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLzy/b;I)V

    return-object v1

    :pswitch_2
    sget-object v3, Lw00/o;->a:Lw00/o;

    new-instance v2, Lu00/f;

    const v0, 0x7f08081f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v11, 0x42

    const/4 v4, 0x0

    const v5, 0x7f14109f

    const v6, 0x7f08081e

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lv00/b0;Ljava/util/List;)Z
    .locals 1

    iget v0, p0, Lw00/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lv00/c0;Lv00/m0;)Ljava/util/List;
    .locals 27

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget v3, v1, Lw00/p;->a:I

    sget-object v4, Lm83/y;->w:Lm83/y;

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    return-object v4

    :pswitch_1
    iget-object v3, v0, Lv00/c0;->x:Lh20/l1;

    iget-object v5, v0, Lv00/c0;->l0:La30/l0;

    iget-boolean v6, v0, Lv00/c0;->a0:Z

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v7

    iget-object v9, v2, Lv00/m0;->a:Lzx/o;

    iget-object v10, v2, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "card_details"

    invoke-static {v8}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v16

    invoke-virtual {v3}, Lh20/l1;->h()Z

    move-result v12

    iget-object v13, v2, Lv00/m0;->h:Lw30/c;

    iget-object v14, v2, Lv00/m0;->l:Lux/a;

    iget-object v15, v2, Lv00/m0;->m:Lux/b;

    iget-object v11, v2, Lv00/m0;->s:Lb5/d;

    new-instance v8, Lx30/x;

    invoke-direct/range {v8 .. v16}, Lx30/x;-><init>(Lzx/o;Ljava/util/LinkedHashMap;Lb5/d;ZLw30/c;Lux/a;Lux/b;Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    invoke-virtual {v7, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v8, v3, Lh20/l1;->z:Lh20/j1;

    sget-object v9, Lh20/j1;->x:Lh20/j1;

    const/4 v11, 0x2

    const/4 v13, 0x1

    const/16 v19, 0x0

    if-ne v8, v9, :cond_1

    invoke-virtual {v3}, Lh20/l1;->f()Z

    move-result v9

    if-nez v9, :cond_1

    invoke-virtual {v3}, Lh20/l1;->i()Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    move v3, v11

    move v9, v13

    const/4 v8, 0x0

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-virtual {v3}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v9

    new-instance v17, Lu30/c;

    invoke-virtual {v3}, Lh20/l1;->f()Z

    move-result v22

    invoke-virtual {v3}, Lh20/l1;->i()Z

    move-result v23

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_4

    if-eq v3, v13, :cond_3

    if-ne v3, v11, :cond_2

    sget-object v3, Lu30/b;->y:Lu30/b;

    :goto_1
    move-object/from16 v24, v3

    goto :goto_2

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    sget-object v3, Lu30/b;->x:Lu30/b;

    goto :goto_1

    :cond_4
    sget-object v3, Lu30/b;->w:Lu30/b;

    goto :goto_1

    :goto_2
    const/16 v25, 0x10

    const/16 v21, 0x0

    move-object/from16 v20, v17

    invoke-direct/range {v20 .. v25}, Lu30/c;-><init>(ZZZLu30/b;I)V

    iget-object v14, v2, Lv00/m0;->o:Lg40/z;

    iget-object v3, v2, Lv00/m0;->e:Ljava/util/Map;

    if-eqz v3, :cond_5

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_5

    invoke-static {v8}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    new-instance v15, Lg40/v2;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    new-instance v12, Lg40/u2;

    invoke-direct {v12, v8}, Lg40/u2;-><init>(Z)V

    invoke-direct {v15, v11, v12}, Lg40/v2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/u2;)V

    goto :goto_3

    :cond_5
    move-object/from16 v15, v19

    :goto_3
    const-string v8, "credit_billing"

    invoke-static {v8}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    move-object v12, v10

    new-instance v10, Lx30/o;

    const/4 v8, 0x0

    const/16 v18, 0x108

    move/from16 v16, v13

    move-object v13, v9

    move/from16 v9, v16

    move-object/from16 v16, v3

    const/4 v3, 0x2

    invoke-direct/range {v10 .. v18}, Lx30/o;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/z;Lg40/v2;Ljava/util/Map;Lu30/c;I)V

    move-object v11, v10

    move-object/from16 v10, v17

    iget-object v12, v10, Lu30/c;->z:Lu30/b;

    sget-object v13, Lu30/b;->x:Lu30/b;

    if-ne v12, v13, :cond_7

    iget-boolean v12, v10, Lu30/c;->y:Z

    if-nez v12, :cond_6

    iget-boolean v10, v10, Lu30/c;->x:Z

    if-eqz v10, :cond_7

    :cond_6
    const v10, 0x7f140fea

    new-array v12, v8, [Ljava/lang/Object;

    invoke-static {v10, v12, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    goto :goto_4

    :cond_7
    const v10, 0x7f140fcc

    new-array v12, v8, [Ljava/lang/Object;

    invoke-static {v10, v12, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    :goto_4
    invoke-static {v11, v4}, Lg40/l0;->b(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object v4

    new-array v10, v3, [Lg40/i1;

    aput-object v4, v10, v8

    aput-object v15, v10, v9

    invoke-static {v10}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v7, v4}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    :goto_5
    sget-object v4, Ly00/f4;->G:Lt9/c0;

    iget-object v4, v0, Lv00/c0;->w:Ly00/c8;

    iget-object v10, v0, Lv00/c0;->S:Lv00/i0;

    iget-object v11, v0, Lv00/c0;->P:Lv00/p;

    if-eqz v11, :cond_8

    move v12, v9

    goto :goto_6

    :cond_8
    move v12, v8

    :goto_6
    const-string v9, "card"

    invoke-static {v9, v10, v4, v12}, Ls4/b;->q(Ljava/lang/String;Lv00/i0;Ly00/c8;Z)Z

    move-result v23

    if-eqz v23, :cond_9

    if-nez v6, :cond_9

    invoke-static {v7, v0, v2}, Ls4/b;->b(Ljava/util/AbstractList;Lv00/c0;Lv00/m0;)V

    :cond_9
    if-eqz v5, :cond_a

    iget-object v4, v5, La30/l0;->z:Lj00/d0;

    goto :goto_7

    :cond_a
    move-object/from16 v4, v19

    :goto_7
    if-eqz v4, :cond_b

    iget-object v12, v2, Lv00/m0;->b:Lwz/l1;

    if-eqz v12, :cond_b

    new-instance v9, Lx00/a;

    iget-object v10, v5, La30/l0;->z:Lj00/d0;

    iget-object v11, v5, La30/l0;->w:Lwz/g0;

    iget-object v13, v2, Lv00/m0;->d:Lj00/i0;

    iget-object v14, v2, Lv00/m0;->k:Lkotlin/jvm/functions/Function1;

    iget-object v15, v2, Lv00/m0;->r:Ljava/lang/Boolean;

    invoke-direct/range {v9 .. v15}, Lx00/a;-><init>(Lj00/d0;Lwz/g0;Lwz/l1;Lj00/i0;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V

    invoke-virtual {v7, v9}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v4, v5, La30/l0;->z:Lj00/d0;

    move-object/from16 v22, v4

    goto :goto_8

    :cond_b
    move-object/from16 v22, v19

    :goto_8
    sget-object v4, Lw00/o;->b:Ly00/f4;

    invoke-virtual {v0, v4}, Lv00/c0;->H(Ly00/f4;)Z

    move-result v5

    const-string v9, "card_mandate"

    if-eqz v6, :cond_e

    invoke-static {v9}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v21

    iget-object v3, v0, Lv00/c0;->I:Ljava/lang/String;

    iget-boolean v4, v2, Lv00/m0;->q:Z

    iget-object v5, v2, Lv00/m0;->p:Lh20/y;

    if-eqz v5, :cond_d

    iget-object v5, v5, Lh20/y;->b:Lec3/h2;

    if-nez v5, :cond_c

    goto :goto_a

    :cond_c
    :goto_9
    move-object/from16 v25, v5

    goto :goto_b

    :cond_d
    :goto_a
    invoke-static/range {v19 .. v19}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v5

    goto :goto_9

    :goto_b
    new-instance v20, Lw00/r;

    move-object/from16 v24, v3

    move/from16 v26, v4

    invoke-direct/range {v20 .. v26}, Lw00/r;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lj00/d0;ZLjava/lang/String;Lec3/f2;Z)V

    move-object/from16 v3, v20

    invoke-virtual {v7, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_e
    move-object/from16 v6, v22

    iget-object v4, v4, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_12

    if-eqz v5, :cond_12

    invoke-static {v9}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    sget-object v4, Lj00/d0;->x:Lj00/d0;

    if-ne v6, v4, :cond_f

    int-to-float v3, v8

    :goto_c
    move v14, v3

    goto :goto_e

    :cond_f
    sget-object v4, Lj00/d0;->w:Lj00/d0;

    if-ne v6, v4, :cond_11

    const/4 v3, 0x4

    :cond_10
    :goto_d
    int-to-float v3, v3

    goto :goto_c

    :cond_11
    if-eqz v23, :cond_10

    const/4 v3, 0x6

    goto :goto_d

    :goto_e
    iget-object v3, v0, Lv00/c0;->I:Ljava/lang/String;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    new-instance v10, Lx30/e1;

    const/16 v15, 0x10

    const v12, 0x7f141074

    invoke-direct/range {v10 .. v15}, Lx30/e1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILjava/util/List;FI)V

    invoke-virtual {v7, v10}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_12
    :goto_f
    invoke-static {v7}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v3

    iget-object v2, v2, Lv00/m0;->t:Lb30/m;

    iget-boolean v0, v0, Lv00/c0;->k0:Z

    if-eqz v0, :cond_13

    if-eqz v2, :cond_13

    new-instance v0, Lny/g;

    invoke-direct {v0, v2, v3}, Lny/g;-><init>(Lb30/m;Ln83/c;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :cond_13
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;
    .locals 1

    iget v0, p0, Lw00/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
