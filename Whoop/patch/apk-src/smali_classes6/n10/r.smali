.class public final Ln10/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/h0;


# instance fields
.field public final a:Ln10/u;

.field public final b:Ln10/o0;

.field public final c:Ln10/b0;

.field public final d:Ln10/h;

.field public final e:Ln10/s0;


# direct methods
.method public constructor <init>(Ln10/u;Ln10/o0;Ln10/b0;Ln10/h;Ln10/s0;)V
    .locals 1

    const-string v0, "deferredIntentCallbackRetriever"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentFirstConfirmationInterceptorFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deferredIntentConfirmationInterceptorFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationTokenConfirmationInterceptorFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPaymentTokenConfirmationInterceptorFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/r;->a:Ln10/u;

    iput-object p2, p0, Ln10/r;->b:Ln10/o0;

    iput-object p3, p0, Ln10/r;->c:Ln10/b0;

    iput-object p4, p0, Ln10/r;->d:Ln10/h;

    iput-object p5, p0, Ln10/r;->e:Ln10/s0;

    return-void
.end method


# virtual methods
.method public final a(Lv00/a0;Ljava/lang/String;Ljava/lang/String;Ly00/n;Lq83/d;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    instance-of v4, v3, Ln10/q;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Ln10/q;

    iget v5, v4, Ln10/q;->H:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Ln10/q;->H:I

    :goto_0
    move-object v11, v4

    goto :goto_1

    :cond_0
    new-instance v4, Ln10/q;

    check-cast v3, Ls83/c;

    invoke-direct {v4, v0, v3}, Ln10/q;-><init>(Ln10/r;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v3, v11, Ln10/q;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v11, Ln10/q;->H:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v11, Ln10/q;->x:Ljava/lang/Object;

    check-cast v1, Lh20/u2;

    iget-object v2, v11, Ln10/q;->w:Ljava/lang/Object;

    check-cast v2, Ln10/s0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v11, Ln10/q;->y:Landroid/os/Parcelable;

    check-cast v1, Lh20/u2;

    iget-object v2, v11, Ln10/q;->x:Ljava/lang/Object;

    check-cast v2, Ln10/b0;

    iget-object v4, v11, Ln10/q;->w:Ljava/lang/Object;

    check-cast v4, Ly00/n;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v4

    :goto_2
    move-object v6, v1

    goto/16 :goto_5

    :cond_3
    iget-object v1, v11, Ln10/q;->E:Lh20/u2;

    iget-object v2, v11, Ln10/q;->z:Ln10/h;

    iget-object v4, v11, Ln10/q;->y:Landroid/os/Parcelable;

    check-cast v4, Ly00/n;

    iget-object v5, v11, Ln10/q;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v11, Ln10/q;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    move-object/from16 v16, v6

    :goto_3
    move-object v15, v1

    goto :goto_4

    :cond_4
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lv00/u;

    if-nez v3, :cond_10

    sget-object v3, Lv00/s;->w:Lv00/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    instance-of v3, v1, Lv00/v;

    const-string v5, " must be implemented when using IntentConfiguration!"

    iget-object v9, v0, Ln10/r;->a:Ln10/u;

    if-eqz v3, :cond_7

    check-cast v1, Lv00/v;

    iget-object v1, v1, Lv00/v;->w:Lh20/u2;

    move-object/from16 v3, p2

    iput-object v3, v11, Ln10/q;->w:Ljava/lang/Object;

    move-object/from16 v12, p3

    iput-object v12, v11, Ln10/q;->x:Ljava/lang/Object;

    iput-object v2, v11, Ln10/q;->y:Landroid/os/Parcelable;

    iget-object v13, v0, Ln10/r;->d:Ln10/h;

    iput-object v13, v11, Ln10/q;->z:Ln10/h;

    iput-object v1, v11, Ln10/q;->E:Lh20/u2;

    iput v8, v11, Ln10/q;->H:I

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lb20/d;->J:Lb20/d;

    sget-object v7, Lb20/c;->Z:Lb20/c;

    const-class v8, Lc10/i;

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ln10/t;

    const/4 v5, 0x1

    invoke-direct {v10, v9, v5}, Ln10/t;-><init>(Ln10/u;I)V

    move-object v5, v9

    const-string v9, "deferredIntentCallbackNotFound"

    invoke-virtual/range {v5 .. v11}, Ln10/b;->a(Lb20/d;Lb20/c;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object/from16 v18, v2

    move-object/from16 v16, v3

    move-object v3, v5

    move-object/from16 v17, v12

    move-object v2, v13

    goto :goto_3

    :goto_4
    if-nez v3, :cond_6

    iget-object v1, v2, Ln10/h;->a:Lj00/i;

    iget-object v2, v1, Lj00/i;->a:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/content/Context;

    iget-object v2, v1, Lj00/i;->b:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lb10/c1;

    iget-object v2, v1, Lj00/i;->c:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lyy/f;

    iget-object v1, v1, Lj00/i;->d:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v22, v1

    check-cast v22, Lbz/i;

    new-instance v14, Ln10/g;

    invoke-direct/range {v14 .. v22}, Ln10/g;-><init>(Lh20/u2;Ljava/lang/String;Ljava/lang/String;Ly00/n;Landroid/content/Context;Lb10/c1;Lyy/f;Lbz/i;)V

    return-object v14

    :cond_6
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_7
    move-object v3, v9

    instance-of v8, v1, Lv00/w;

    if-eqz v8, :cond_9

    check-cast v1, Lv00/w;

    iget-object v1, v1, Lv00/w;->w:Lh20/u2;

    iput-object v2, v11, Ln10/q;->w:Ljava/lang/Object;

    iget-object v12, v0, Ln10/r;->c:Ln10/b0;

    iput-object v12, v11, Ln10/q;->x:Ljava/lang/Object;

    iput-object v1, v11, Ln10/q;->y:Landroid/os/Parcelable;

    iput v7, v11, Ln10/q;->H:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lb20/d;->I:Lb20/d;

    sget-object v7, Lb20/c;->Z:Lb20/c;

    const-class v8, Lh20/b;

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ln10/t;

    const/4 v5, 0x0

    invoke-direct {v10, v3, v5}, Ln10/t;-><init>(Ln10/u;I)V

    const-string v9, "deferredIntentCallbackNotFound"

    move-object v5, v3

    invoke-virtual/range {v5 .. v11}, Ln10/b;->a(Lb20/d;Lb20/c;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_8

    goto :goto_6

    :cond_8
    move-object v8, v2

    move-object v2, v12

    goto/16 :goto_2

    :goto_5
    move-object v7, v3

    check-cast v7, Lh20/b;

    iget-object v1, v2, Ln10/b0;->a:Ln10/a0;

    iget-object v2, v1, Ln10/a0;->a:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lb10/c1;

    iget-object v2, v1, Ln10/a0;->b:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lyy/f;

    iget-object v1, v1, Ln10/a0;->c:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    new-instance v5, Ln10/z;

    invoke-direct/range {v5 .. v11}, Ln10/z;-><init>(Lh20/u2;Lh20/b;Ly00/n;Lb10/c1;Lyy/f;Z)V

    return-object v5

    :cond_9
    instance-of v7, v1, Lv00/x;

    if-eqz v7, :cond_c

    check-cast v1, Lv00/x;

    iget-object v1, v1, Lv00/x;->w:Lh20/u2;

    iget-object v2, v0, Ln10/r;->e:Ln10/s0;

    iput-object v2, v11, Ln10/q;->w:Ljava/lang/Object;

    iput-object v1, v11, Ln10/q;->x:Ljava/lang/Object;

    iput v6, v11, Ln10/q;->H:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lb20/d;->K:Lb20/d;

    sget-object v7, Lb20/c;->a0:Lb20/c;

    const-class v8, Lc10/p;

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ln10/t;

    const/4 v5, 0x2

    invoke-direct {v10, v3, v5}, Ln10/t;-><init>(Ln10/u;I)V

    const-string v9, "deferredIntentCallbackNotFound"

    move-object v5, v3

    invoke-virtual/range {v5 .. v11}, Ln10/b;->a(Lb20/d;Lb20/c;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_a

    :goto_6
    return-object v4

    :cond_a
    :goto_7
    if-nez v3, :cond_b

    iget-object v2, v2, Ln10/s0;->a:Ln10/a0;

    iget-object v3, v2, Ln10/a0;->a:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb20/f;

    iget-object v4, v2, Ln10/a0;->b:Lv03/h;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb10/c1;

    iget-object v2, v2, Ln10/a0;->c:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyy/f;

    new-instance v5, Ln10/r0;

    invoke-direct {v5, v1, v3, v4, v2}, Ln10/r0;-><init>(Lh20/u2;Lb20/f;Lb10/c1;Lyy/f;)V

    return-object v5

    :cond_b
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_c
    instance-of v3, v1, Lv00/z;

    if-eqz v3, :cond_d

    check-cast v1, Lv00/z;

    iget-object v1, v1, Lv00/z;->w:Ljava/lang/String;

    iget-object v3, v0, Ln10/r;->b:Ln10/o0;

    iget-object v3, v3, Ln10/o0;->a:Ln10/n0;

    iget-object v3, v3, Ln10/n0;->b:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyy/f;

    new-instance v4, Ln10/m0;

    invoke-direct {v4, v1, v2, v3}, Ln10/m0;-><init>(Ljava/lang/String;Ly00/n;Lyy/f;)V

    return-object v4

    :cond_d
    instance-of v1, v1, Lv00/r;

    if-eqz v1, :cond_e

    new-instance v1, Ll83/j;

    const-string v2, "An operation is not implemented: CheckoutSession confirmation not yet supported."

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No intent confirmation interceptor for CryptoOnramp."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "CustomerSheet not supported by default confirmation interceptor!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
