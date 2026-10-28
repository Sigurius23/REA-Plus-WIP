.class public final synthetic Ll3/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll3/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Ll3/h0;->w:I

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    const/4 v5, 0x0

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->c(Lxf3/c;Luf3/a;)Ltb2/a;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->g(Lxf3/c;Luf3/a;)Lrb2/a;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->f(Lxf3/c;Luf3/a;)Llb2/b;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->e(Lxf3/c;Luf3/a;)Lpb2/c;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->a(Lxf3/c;Luf3/a;)Lcom/whoop/settings/gifthub/api/GiftHubApi;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->d(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->h(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lmb2/a;->b(Lxf3/c;Luf3/a;)Lnb2/d;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Llc2/a;->e(Lxf3/c;Luf3/a;)Lkc2/j;

    move-result-object v1

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Llc2/a;->b(Lxf3/c;Luf3/a;)Lcom/whoop/settings/referafriend/ReferAFriendCtaTileApi;

    move-result-object v1

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Llc2/a;->c(Lxf3/c;Luf3/a;)Lkc2/g;

    move-result-object v1

    return-object v1

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Llc2/a;->d(Lxf3/c;Luf3/a;)Lkc2/h;

    move-result-object v1

    return-object v1

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Ly1/b;

    move-object/from16 v2, p2

    check-cast v2, Ll3/s0;

    iget-object v3, v2, Ll3/s0;->a:Ll3/m0;

    sget-object v4, Ll3/l0;->i:Lp0/n0;

    invoke-static {v3, v4, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v3

    iget-object v5, v2, Ll3/s0;->b:Ll3/m0;

    invoke-static {v5, v4, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v2, Ll3/s0;->c:Ll3/m0;

    invoke-static {v6, v4, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v6

    iget-object v2, v2, Ll3/s0;->d:Ll3/m0;

    invoke-static {v2, v4, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v1

    filled-new-array {v3, v5, v6, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    return-object v1

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Ly1/b;

    move-object/from16 v2, p2

    check-cast v2, Ll3/m0;

    iget-object v3, v2, Ll3/m0;->a:Lw3/o;

    invoke-interface {v3}, Lw3/o;->b()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    sget-object v3, Ll3/l0;->r:Ll3/k0;

    invoke-static {v5, v3, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v6

    iget-wide v4, v2, Ll3/m0;->b:J

    new-instance v7, Ly3/o;

    invoke-direct {v7, v4, v5}, Ly3/o;-><init>(J)V

    sget-object v4, Ll3/l0;->s:Ll3/k0;

    invoke-static {v7, v4, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v7

    iget-object v5, v2, Ll3/m0;->c:Lp3/r;

    sget-object v8, Lp3/r;->x:Lp3/r;

    sget-object v8, Ll3/l0;->n:Lp0/n0;

    invoke-static {v5, v8, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v8

    iget-object v9, v2, Ll3/m0;->d:Lp3/n;

    iget-object v10, v2, Ll3/m0;->e:Lp3/o;

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iget-object v12, v2, Ll3/m0;->g:Ljava/lang/String;

    iget-wide v13, v2, Ll3/m0;->h:J

    new-instance v5, Ly3/o;

    invoke-direct {v5, v13, v14}, Ly3/o;-><init>(J)V

    invoke-static {v5, v4, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v13

    iget-object v4, v2, Ll3/m0;->i:Lw3/a;

    sget-object v5, Ll3/l0;->o:Lp0/n0;

    invoke-static {v4, v5, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v14

    iget-object v4, v2, Ll3/m0;->j:Lw3/p;

    sget-object v5, Ll3/l0;->l:Lp0/n0;

    invoke-static {v4, v5, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v15

    iget-object v4, v2, Ll3/m0;->k:Ls3/b;

    sget-object v5, Ls3/b;->y:Ls3/b;

    sget-object v5, Ll3/l0;->u:Lp0/n0;

    invoke-static {v4, v5, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v16

    iget-wide v4, v2, Ll3/m0;->l:J

    new-instance v0, Li2/x;

    invoke-direct {v0, v4, v5}, Li2/x;-><init>(J)V

    invoke-static {v0, v3, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v17

    iget-object v0, v2, Ll3/m0;->m:Lw3/l;

    sget-object v3, Ll3/l0;->k:Lp0/n0;

    invoke-static {v0, v3, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v18

    iget-object v0, v2, Ll3/m0;->n:Li2/z0;

    sget-object v2, Li2/z0;->d:Li2/z0;

    sget-object v2, Ll3/l0;->q:Lp0/n0;

    invoke-static {v0, v2, v1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v19

    filled-new-array/range {v6 .. v19}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ll3/b0;

    iget v2, v1, Ll3/b0;->a:I

    new-instance v3, Lw3/k;

    invoke-direct {v3, v2}, Lw3/k;-><init>(I)V

    iget v2, v1, Ll3/b0;->b:I

    new-instance v4, Lw3/m;

    invoke-direct {v4, v2}, Lw3/m;-><init>(I)V

    iget-wide v5, v1, Ll3/b0;->c:J

    new-instance v2, Ly3/o;

    invoke-direct {v2, v5, v6}, Ly3/o;-><init>(J)V

    sget-object v5, Ll3/l0;->s:Ll3/k0;

    invoke-static {v2, v5, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v5

    iget-object v2, v1, Ll3/b0;->d:Lw3/q;

    sget-object v6, Lw3/q;->c:Lw3/q;

    sget-object v6, Ll3/l0;->m:Lp0/n0;

    invoke-static {v2, v6, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v6

    iget-object v2, v1, Ll3/b0;->e:Ll3/e0;

    sget-object v7, Ll3/s;->b:Lp0/n0;

    invoke-static {v2, v7, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v7

    iget-object v2, v1, Ll3/b0;->f:Lw3/i;

    sget-object v8, Lw3/i;->c:Lw3/i;

    sget-object v8, Ll3/l0;->w:Lp0/n0;

    invoke-static {v2, v8, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v8

    iget v2, v1, Ll3/b0;->g:I

    new-instance v9, Lw3/e;

    invoke-direct {v9, v2}, Lw3/e;-><init>(I)V

    sget-object v2, Ll3/s;->c:Lp0/n0;

    invoke-static {v9, v2, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v9

    iget v2, v1, Ll3/b0;->h:I

    new-instance v10, Lw3/d;

    invoke-direct {v10, v2}, Lw3/d;-><init>(I)V

    iget-object v1, v1, Ll3/b0;->i:Lw3/s;

    sget-object v2, Ll3/s;->d:Lp0/n0;

    invoke-static {v1, v2, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v11

    filled-new-array/range {v3 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Ll3/w0;

    invoke-virtual {v0}, Ll3/w0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Ll3/x0;

    invoke-virtual {v0}, Ll3/x0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ll3/t;

    iget-object v2, v1, Ll3/t;->a:Ljava/lang/String;

    iget-object v1, v1, Ll3/t;->b:Ll3/s0;

    sget-object v3, Ll3/l0;->j:Lp0/n0;

    invoke-static {v1, v3, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ll3/e;

    iget-object v2, v1, Ll3/e;->a:Ljava/lang/Object;

    instance-of v3, v2, Ll3/b0;

    if-eqz v3, :cond_0

    sget-object v3, Ll3/k;->w:Ll3/k;

    goto :goto_0

    :cond_0
    instance-of v3, v2, Ll3/m0;

    if-eqz v3, :cond_1

    sget-object v3, Ll3/k;->x:Ll3/k;

    goto :goto_0

    :cond_1
    instance-of v3, v2, Ll3/x0;

    if-eqz v3, :cond_2

    sget-object v3, Ll3/k;->y:Ll3/k;

    goto :goto_0

    :cond_2
    instance-of v3, v2, Ll3/w0;

    if-eqz v3, :cond_3

    sget-object v3, Ll3/k;->z:Ll3/k;

    goto :goto_0

    :cond_3
    instance-of v3, v2, Ll3/u;

    if-eqz v3, :cond_4

    sget-object v3, Ll3/k;->E:Ll3/k;

    goto :goto_0

    :cond_4
    instance-of v3, v2, Ll3/t;

    if-eqz v3, :cond_5

    sget-object v3, Ll3/k;->F:Ll3/k;

    goto :goto_0

    :cond_5
    instance-of v3, v2, Ll3/o0;

    if-eqz v3, :cond_6

    sget-object v3, Ll3/k;->G:Ll3/k;

    :goto_0
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    packed-switch v4, :pswitch_data_1

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_12
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/o0;

    iget-object v0, v2, Ll3/o0;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_13
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/t;

    sget-object v4, Ll3/l0;->g:Lp0/n0;

    invoke-static {v2, v4, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :pswitch_14
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/u;

    sget-object v4, Ll3/l0;->f:Lp0/n0;

    invoke-static {v2, v4, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :pswitch_15
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/w0;

    sget-object v4, Ll3/l0;->e:Lp0/n0;

    invoke-static {v2, v4, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :pswitch_16
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/x0;

    sget-object v4, Ll3/l0;->d:Lp0/n0;

    invoke-static {v2, v4, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :pswitch_17
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/m0;

    sget-object v4, Ll3/l0;->i:Lp0/n0;

    invoke-static {v2, v4, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :pswitch_18
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ll3/b0;

    sget-object v4, Ll3/l0;->h:Lp0/n0;

    invoke-static {v2, v4, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget v2, v1, Ll3/e;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v4, v1, Ll3/e;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v1, v1, Ll3/e;->d:Ljava/lang/String;

    filled-new-array {v3, v0, v2, v4, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Lw3/i;

    iget v1, v0, Lw3/i;->a:F

    new-instance v2, Lw3/f;

    invoke-direct {v2, v1}, Lw3/f;-><init>(F)V

    iget v0, v0, Lw3/i;->b:I

    new-instance v1, Lw3/h;

    invoke-direct {v1, v0}, Lw3/h;-><init>(I)V

    new-instance v0, Lw3/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    filled-new-array {v2, v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Ls3/a;

    iget-object v0, v0, Ls3/a;->a:Ljava/util/Locale;

    invoke-static {v0}, Ls3/d;->i(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1b
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ls3/b;

    iget-object v1, v1, Ls3/b;->w:Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_2
    if-ge v5, v3, :cond_7

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls3/a;

    sget-object v6, Ll3/l0;->v:Lp0/n0;

    invoke-static {v4, v6, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    return-object v2

    :pswitch_1c
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Lh2/b;

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    iget-wide v5, v0, Lh2/b;->a:J

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v5, v6, v7, v8}, Lh2/b;->c(JJ)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_4

    :cond_9
    iget-wide v5, v0, Lh2/b;->a:J

    shr-long v4, v5, v4

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-wide v4, v0, Lh2/b;->a:J

    and-long/2addr v2, v4

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_4
    return-object v0

    :pswitch_1d
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Ly3/o;

    sget-wide v1, Ly3/o;->c:J

    if-nez v0, :cond_a

    goto :goto_5

    :cond_a
    iget-wide v3, v0, Ly3/o;->a:J

    invoke-static {v3, v4, v1, v2}, Ly3/o;->a(JJ)Z

    move-result v5

    :goto_5
    if-eqz v5, :cond_b

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_b
    iget-wide v1, v0, Ly3/o;->a:J

    invoke-static {v1, v2}, Ly3/o;->c(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-wide v2, v0, Ly3/o;->a:J

    invoke-static {v2, v3}, Ly3/o;->b(J)J

    move-result-wide v2

    new-instance v0, Ly3/p;

    invoke-direct {v0, v2, v3}, Ly3/p;-><init>(J)V

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_6
    return-object v0

    :pswitch_1e
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Li2/z0;

    iget-wide v2, v1, Li2/z0;->a:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    sget-object v2, Ll3/l0;->r:Ll3/k0;

    invoke-static {v4, v2, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v2

    iget-wide v3, v1, Li2/z0;->b:J

    new-instance v5, Lh2/b;

    invoke-direct {v5, v3, v4}, Lh2/b;-><init>(J)V

    sget-object v3, Ll3/l0;->t:Ll3/k0;

    invoke-static {v5, v3, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    iget v1, v1, Li2/z0;->c:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_1f
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Ll3/u0;

    iget-wide v5, v0, Ll3/u0;->a:J

    shr-long v4, v5, v4

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v4, v0, Ll3/u0;->a:J

    and-long/2addr v2, v4

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_20
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_7
    if-ge v5, v3, :cond_c

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    sget-object v6, Ll3/l0;->c:Lp0/n0;

    invoke-static {v4, v6, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_c
    return-object v2

    :pswitch_21
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Lw3/a;

    iget v0, v0, Lw3/a;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_22
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ll3/u;

    iget-object v2, v1, Ll3/u;->a:Ljava/lang/String;

    iget-object v1, v1, Ll3/u;->b:Ll3/s0;

    sget-object v3, Ll3/l0;->j:Lp0/n0;

    invoke-static {v1, v3, v0}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_23
    move-object/from16 v0, p1

    check-cast v0, Ly1/b;

    move-object/from16 v0, p2

    check-cast v0, Lp3/r;

    iget v0, v0, Lp3/r;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method
