.class public final Lay/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Lv03/h;Lv03/h;Lv03/h;I)V
    .locals 0

    iput p4, p0, Lay/w;->w:I

    iput-object p1, p0, Lay/w;->x:Lv03/h;

    iput-object p2, p0, Lay/w;->y:Lv03/h;

    iput-object p3, p0, Lay/w;->z:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lny/d;Lny/h;Lny/d;Lb20/f;Lny/c;)Lny/d;
    .locals 1

    const-string v0, "isStripeTerminalSdkAvailable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "connectionManager"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "terminalWrapper"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "errorReporter"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "createCardPresentSetupIntentCallbackRetriever"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lny/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lay/w;->w:I

    const/4 v2, 0x0

    iget-object v3, v0, Lay/w;->z:Lv03/h;

    iget-object v4, v0, Lay/w;->y:Lv03/h;

    iget-object v5, v0, Lay/w;->x:Lv03/h;

    packed-switch v1, :pswitch_data_0

    check-cast v5, Lc20/b;

    invoke-virtual {v5}, Lc20/b;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq/f;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbc3/c0;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk20/a;

    const-string v5, "viewModelScope"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "eventReporter"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lq/f;->y:Ljava/lang/Object;

    check-cast v5, Lv00/c0;

    iget-object v6, v1, Lq/f;->x:Ljava/lang/Object;

    check-cast v6, Lh20/f;

    iget-object v6, v6, Lh20/f;->b:Lec3/r1;

    iget-object v6, v6, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La30/a;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    iget-object v6, v6, La30/a;->w:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object v6, v7

    :goto_0
    const/4 v8, 0x1

    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    if-ne v9, v8, :cond_2

    invoke-static {v6}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/o4;

    iget-object v6, v2, Ly00/o4;->E:Ly00/f4;

    if-eqz v6, :cond_1

    iget-object v6, v6, Ly00/f4;->w:Ljava/lang/String;

    if-eqz v6, :cond_1

    invoke-virtual {v5, v6}, Lv00/c0;->R(Ljava/lang/String;)Lu00/f;

    move-result-object v6

    if-eqz v6, :cond_1

    iget-object v7, v6, Lu00/f;->c:Lzy/c;

    :cond_1
    invoke-static {v7}, Ls4/i;->p(Lzy/c;)Lzy/c;

    move-result-object v6

    iget-object v5, v5, Lv00/c0;->H:Lw30/c;

    instance-of v5, v5, Lw30/a;

    const/16 v7, 0x8

    invoke-static {v6, v2, v5, v7}, Lh20/t;->c(Lzy/c;Ly00/o4;ZI)Lh20/l;

    move-result-object v2

    new-instance v5, Lu10/o;

    iget-object v1, v1, Lq/f;->z:Ljava/lang/Object;

    check-cast v1, Lu10/d;

    invoke-virtual {v1, v2}, Lu10/d;->a(Lh20/l;)Lb30/y0;

    move-result-object v1

    invoke-direct {v5, v1}, Lu10/o;-><init>(Lb30/y0;)V

    goto :goto_1

    :cond_2
    new-instance v5, Lu10/n;

    iget-object v1, v1, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, La30/w0;

    new-instance v9, Ld30/h;

    iget-object v6, v1, La30/w0;->y:Ljava/lang/Object;

    check-cast v6, Lh20/f;

    iget-object v10, v6, Lh20/f;->c:Ln53/e;

    iget-object v6, v1, La30/w0;->x:Ljava/lang/Object;

    move-object v11, v6

    check-cast v11, Lv00/c0;

    iget-object v6, v1, La30/w0;->z:Ljava/lang/Object;

    check-cast v6, Ls10/f;

    iget-object v12, v6, Ls10/f;->b:Lec3/r1;

    iget-object v6, v1, La30/w0;->E:Ljava/lang/Object;

    check-cast v6, Lh20/z4;

    iget-object v13, v6, Lh20/z4;->q:Lec3/h2;

    iget-object v14, v6, Lh20/z4;->o:Ln53/e;

    new-instance v15, Lp00/j;

    iget-object v6, v1, La30/w0;->E:Ljava/lang/Object;

    move-object/from16 v17, v6

    check-cast v17, Lh20/z4;

    const/16 v21, 0x0

    const/16 v22, 0x14

    const/16 v16, 0x0

    const-class v18, Lh20/z4;

    const-string v19, "toggleEditing"

    const-string v20, "toggleEditing()V"

    invoke-direct/range {v15 .. v22}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v6, Lu10/a;

    invoke-direct {v6, v1, v2}, Lu10/a;-><init>(La30/w0;I)V

    new-instance v16, Lq00/h0;

    iget-object v2, v1, La30/w0;->E:Ljava/lang/Object;

    move-object/from16 v18, v2

    check-cast v18, Lh20/z4;

    const/16 v22, 0x0

    const/16 v23, 0x1c

    const/16 v17, 0x1

    const-class v19, Lh20/z4;

    const-string v20, "updatePaymentMethod"

    const-string v21, "updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V"

    invoke-direct/range {v16 .. v23}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v2, v18

    new-instance v7, Lu10/a;

    invoke-direct {v7, v1, v8}, Lu10/a;-><init>(La30/w0;I)V

    iget-object v1, v2, Lh20/z4;->m:Ln53/e;

    move-object/from16 v19, v1

    move-object/from16 v18, v7

    move-object/from16 v17, v16

    move-object/from16 v16, v6

    invoke-direct/range {v9 .. v19}, Ld30/h;-><init>(Ln53/e;Lv00/c0;Lec3/r1;Lec3/h2;Ln53/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln53/e;)V

    invoke-direct {v5, v9}, Lu10/n;-><init>(Ld30/h;)V

    :goto_1
    new-instance v1, Lu10/q;

    invoke-direct {v1, v4, v5, v3}, Lu10/q;-><init>(Lbc3/c0;Lu10/p;Lk20/a;)V

    return-object v1

    :pswitch_0
    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/k1;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls10/f;

    check-cast v3, Lc20/g;

    invoke-virtual {v3}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lec3/f2;

    const-string v4, "savedStateHandle"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "selectionHolder"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lrm2/d;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Lrm2/d;-><init>(I)V

    invoke-static {v3, v4}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v3

    iget-object v2, v2, Ls10/f;->b:Lec3/r1;

    new-instance v4, Lh20/f;

    invoke-direct {v4, v3, v1, v2}, Lh20/f;-><init>(Ln53/e;Landroidx/lifecycle/k1;Lec3/f2;)V

    return-object v4

    :pswitch_1
    new-instance v1, Lny/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lny/h;

    new-instance v5, Lny/d;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb20/f;

    check-cast v3, Lay/w;

    invoke-virtual {v3}, Lay/w;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lny/c;

    invoke-static {v1, v2, v5, v4, v3}, Lay/w;->a(Lny/d;Lny/h;Lny/d;Lb20/f;Lny/c;)Lny/d;

    move-result-object v1

    return-object v1

    :pswitch_2
    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb20/f;

    check-cast v3, La30/h;

    new-instance v2, Lny/c;

    invoke-direct {v2, v1, v4, v3}, Lny/c;-><init>(Lb20/f;Lk83/a;La30/h;)V

    return-object v2

    :pswitch_3
    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    check-cast v4, La30/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb20/f;

    new-instance v5, Li10/a;

    invoke-direct {v5, v1, v4, v3, v2}, Li10/a;-><init>(Ljava/lang/String;La30/h;Lb20/f;B)V

    return-object v5

    :pswitch_4
    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy/j;

    check-cast v4, La30/c;

    invoke-virtual {v4}, La30/c;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyy/c;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq83/j;

    new-instance v4, Lj20/c;

    invoke-direct {v4, v1, v2, v3}, Lj20/c;-><init>(Lyy/j;Lyy/c;Lq83/j;)V

    return-object v4

    :pswitch_5
    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    check-cast v4, La30/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb20/f;

    new-instance v3, Li10/a;

    invoke-direct {v3, v1, v4, v2}, Li10/a;-><init>(Ljava/lang/String;La30/h;Lb20/f;)V

    return-object v3

    :pswitch_6
    check-cast v5, La30/c;

    invoke-virtual {v5}, La30/c;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ltz/a;

    sget-object v7, Lf20/a;->a:Lf20/a;

    new-instance v8, Lu00/e;

    invoke-direct {v8, v2}, Lu00/e;-><init>(I)V

    check-cast v4, Ldz/m;

    invoke-virtual {v4}, Ldz/m;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, La33/d;

    check-cast v3, Ldz/m;

    invoke-virtual {v3}, Ldz/m;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lb20/f;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v11, Lkc3/d;->w:Lkc3/d;

    invoke-static {v11}, Ls93/k;->c(Ljava/lang/Object;)V

    new-instance v5, Lcz/w0;

    invoke-direct/range {v5 .. v11}, Lcz/w0;-><init>(Ltz/a;Lf20/a;Lu00/e;La33/d;Lb20/f;Lq83/j;)V

    return-object v5

    :pswitch_7
    check-cast v5, Lv03/e;

    iget-object v1, v5, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast v4, Lv03/e;

    iget-object v2, v4, Lv03/e;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    check-cast v3, Lv03/e;

    iget-object v3, v3, Lv03/e;->w:Ljava/lang/Object;

    check-cast v3, Lq83/j;

    new-instance v4, Lay/v;

    invoke-direct {v4, v1, v2, v3}, Lay/v;-><init>(Lc93/a;Ljava/util/Set;Lq83/j;)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
