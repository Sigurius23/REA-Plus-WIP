.class public final synthetic Llive/hms/video/utils/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/utils/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/utils/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lm22/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lq22/h;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Llw1/e;->c(Lq22/h;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/whoop/payments/domain/models/Card;

    invoke-static {p1, p2}, Llw1/e;->f(ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Llw1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Le41/i;

    invoke-static {p1, p2}, Lln1/k;->i(ILe41/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lln1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->b(Lxf3/c;Luf3/a;)Luk2/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->u(Lxf3/c;Luf3/a;)Lpk2/b;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->j(Lxf3/c;Luf3/a;)Lmk2/r;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->n(Lxf3/c;Luf3/a;)Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->s(Lxf3/c;Luf3/a;)Lrk2/i;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->r(Lxf3/c;Luf3/a;)Lnm0/a;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->w(Lxf3/c;Luf3/a;)Lsk2/a;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->k(Lxf3/c;Luf3/a;)Lrk2/h;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->f(Lxf3/c;Luf3/a;)Lmk2/u;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->p(Lxf3/c;Luf3/a;)Lmk2/u;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->o(Lxf3/c;Luf3/a;)Lvk2/d;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->h(Lxf3/c;Luf3/a;)Lrk2/f;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->q(Lxf3/c;Luf3/a;)Lwk2/c;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->l(Lxf3/c;Luf3/a;)Ljava/time/Clock;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->m(Lxf3/c;Luf3/a;)Lwk2/g;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->t(Lxf3/c;Luf3/a;)Lwk2/a;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->c(Lxf3/c;Luf3/a;)Lwk2/j;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->g(Lxf3/c;Luf3/a;)Llk2/a;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->e(Lxf3/c;Luf3/a;)Llk2/b;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->d(Lxf3/c;Luf3/a;)Llk2/c;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->i(Lxf3/c;Luf3/a;)Lwk2/i;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->a(Lxf3/c;Luf3/a;)Ltk2/l;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Llk2/d;->x(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-static {p1, p2}, Llive/hms/video/utils/LogUtils;->a(Ljava/io/File;Ljava/io/File;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
.end method
