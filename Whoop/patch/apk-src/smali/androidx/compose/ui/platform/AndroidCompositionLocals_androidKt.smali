.class public final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\" \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0002\u0010\u0003\" \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00008FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\t\u0010\u0005\u001a\u0004\u0008\u0008\u0010\u0003\u00a8\u0006\r\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lp1/t1;",
        "Landroidx/lifecycle/g0;",
        "getLocalLifecycleOwner",
        "()Lp1/t1;",
        "getLocalLifecycleOwner$annotations",
        "()V",
        "LocalLifecycleOwner",
        "Lpb/f;",
        "getLocalSavedStateRegistryOwner",
        "getLocalSavedStateRegistryOwner$annotations",
        "LocalSavedStateRegistryOwner",
        "Landroid/content/res/Configuration;",
        "configuration",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lp1/b0;

.field public static final b:Lp1/u2;

.field public static final c:Lp1/b0;

.field public static final d:Lp1/u2;

.field public static final e:Lp1/u2;

.field public static final f:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb3/p0;->x:Lb3/p0;

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    sget-object v0, Lb3/p0;->y:Lb3/p0;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    sget-object v0, Lb3/r;->z:Lb3/r;

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lkotlin/jvm/functions/Function1;)V

    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    sget-object v0, Lb3/p0;->z:Lb3/p0;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:Lp1/u2;

    sget-object v0, Lb3/p0;->E:Lb3/p0;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:Lp1/u2;

    sget-object v0, Lb3/p0;->F:Lb3/p0;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x1f032317

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v4, v6

    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x1

    if-eq v6, v7, :cond_2

    move v6, v9

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-int/2addr v4, v9

    invoke-virtual {v3, v4, v6}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_3

    new-instance v6, Landroid/content/res/Configuration;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-direct {v6, v10}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Lp1/c1;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_4

    new-instance v10, La3/m1;

    const/4 v11, 0x3

    invoke-direct {v10, v6, v11}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v10}, Landroidx/compose/ui/platform/AndroidComposeView;->setConfigurationChangeObserver(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_5

    new-instance v10, Lb3/e1;

    invoke-direct {v10, v4}, Lb3/e1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v10, Lb3/e1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Lb3/o;

    move-result-object v11

    if-eqz v11, :cond_19

    iget-object v12, v11, Lb3/o;->b:Lpb/f;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v7, :cond_a

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    const-string v14, "null cannot be cast to non-null type android.view.View"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Landroid/view/View;

    const v14, 0x7f0a032f

    invoke-virtual {v13, v14}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/String;

    const/16 v16, 0x0

    if-eqz v15, :cond_6

    check-cast v14, Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object/from16 v14, v16

    :goto_3
    if-nez v14, :cond_7

    invoke-virtual {v13}, Landroid/view/View;->getId()I

    move-result v13

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    :cond_7
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-class v15, Ly1/f;

    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x3a

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v14

    invoke-virtual {v14, v13}, Lpb/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v15

    if-eqz v15, :cond_9

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v15}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v16

    check-cast v16, Ljava/lang/Iterable;

    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v5, v17

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v15, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    move-object/from16 v19, v6

    const-string v6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, v19

    goto :goto_4

    :cond_8
    :goto_5
    move-object/from16 v19, v6

    goto :goto_6

    :cond_9
    move-object/from16 v9, v16

    goto :goto_5

    :goto_6
    sget-object v5, Lb3/r;->E:Lb3/r;

    sget-object v6, Ly1/h;->a:Lp1/u2;

    new-instance v6, Ly1/g;

    invoke-direct {v6, v9, v5}, Ly1/g;-><init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    :try_start_0
    new-instance v5, Lb3/z1;

    const/4 v8, 0x0

    invoke-direct {v5, v6, v8}, Lb3/z1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v13, v5}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x1

    goto :goto_7

    :catch_0
    const/4 v5, 0x0

    :goto_7
    new-instance v8, Lb3/y1;

    new-instance v9, Lb3/a2;

    invoke-direct {v9, v5, v14, v13}, Lb3/a2;-><init>(ZLpb/d;Ljava/lang/String;)V

    invoke-direct {v8, v6, v9}, Lb3/y1;-><init>(Ly1/g;Lb3/a2;)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v13, v8

    goto :goto_8

    :cond_a
    move-object/from16 v19, v6

    :goto_8
    check-cast v13, Lb3/y1;

    invoke-virtual {v3, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_b

    if-ne v6, v7, :cond_c

    :cond_b
    new-instance v6, La3/m1;

    const/4 v5, 0x4

    invoke-direct {v6, v13, v5}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-static {v5, v6, v3}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_e

    invoke-static {v4}, Lb3/g2;->a(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_d

    new-instance v5, Lb3/w1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object v6

    const/4 v8, 0x0

    invoke-direct {v5, v6, v8}, Lb3/w1;-><init>(Landroid/view/View;I)V

    goto :goto_9

    :cond_d
    new-instance v5, Lb3/q2;

    invoke-direct {v5}, Lb3/q2;-><init>()V

    :goto_9
    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lq2/a;

    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/res/Configuration;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_f

    new-instance v8, Lg3/c;

    invoke-direct {v8}, Lg3/c;-><init>()V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lg3/c;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_11

    new-instance v9, Landroid/content/res/Configuration;

    invoke-direct {v9}, Landroid/content/res/Configuration;-><init>()V

    if-eqz v6, :cond_10

    invoke-virtual {v9, v6}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_10
    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v9, Landroid/content/res/Configuration;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_12

    new-instance v6, Lb3/u0;

    invoke-direct {v6, v9, v8}, Lb3/u0;-><init>(Landroid/content/res/Configuration;Lg3/c;)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lb3/u0;

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v9, :cond_13

    if-ne v14, v7, :cond_14

    :cond_13
    new-instance v14, Lb3/t0;

    const/4 v9, 0x0

    invoke-direct {v14, v9, v4, v6}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v14, v3}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_15

    new-instance v6, Lg3/d;

    invoke-direct {v6}, Lg3/d;-><init>()V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v6, Lg3/d;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_16

    new-instance v9, Lb3/v0;

    invoke-direct {v9, v6}, Lb3/v0;-><init>(Lg3/d;)V

    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v9, Lb3/v0;

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_17

    if-ne v15, v7, :cond_18

    :cond_17
    new-instance v15, Lb3/t0;

    const/4 v7, 0x1

    invoke-direct {v15, v7, v4, v9}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v15, v3}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    sget-object v7, Lb3/v1;->v:Lp1/b0;

    invoke-virtual {v3, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getScrollCaptureInProgress$ui_release()Z

    move-result v14

    or-int/2addr v9, v14

    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/content/res/Configuration;

    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v15, v14}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v18

    sget-object v14, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v19

    sget-object v4, Lj8/c;->a:Lp1/t1;

    iget-object v11, v11, Lb3/o;->a:Landroidx/lifecycle/g0;

    invoke-virtual {v4, v11}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v20

    sget-object v4, Lqb/a;->a:Lp1/t1;

    invoke-virtual {v4, v12}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v21

    sget-object v4, Ly1/h;->a:Lp1/u2;

    invoke-virtual {v4, v13}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v22

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object v11

    invoke-virtual {v4, v11}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v23

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:Lp1/u2;

    invoke-virtual {v4, v8}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v24

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v25

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v26

    sget-object v4, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v4, v5}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v27

    filled-new-array/range {v18 .. v27}, [Lp1/u1;

    move-result-object v4

    new-instance v5, Lb3/r0;

    const/4 v8, 0x0

    invoke-direct {v5, v0, v10, v1, v8}, Lb3/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, 0x3f2ad1a9

    invoke-static {v6, v3, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v6, 0x38

    invoke-static {v4, v5, v3, v6}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Called when the ViewTreeOwnersAvailability is not yet in Available state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_1b

    new-instance v4, La3/n1;

    invoke-direct {v4, v0, v1, v2}, La3/n1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;I)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CompositionLocal "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not present"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c()Lp1/b0;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    return-object v0
.end method

.method public static final getLocalLifecycleOwner()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lj8/c;->a:Lp1/t1;

    return-object v0
.end method

.method public static final getLocalSavedStateRegistryOwner()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lqb/a;->a:Lp1/t1;

    return-object v0
.end method
