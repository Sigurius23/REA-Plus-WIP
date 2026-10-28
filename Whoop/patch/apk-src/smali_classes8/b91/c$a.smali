.class public final Lb91/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb91/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb91/c$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lb91/c$a;",
        "",
        "<init>",
        "()V",
        "Lb91/c;",
        "whoopTextStyle",
        "Lb91/a;",
        "a",
        "(Lb91/c;)Lb91/a;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb91/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb91/c;)Lb91/a;
    .locals 1

    const-string v0, "whoopTextStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb91/c$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->Q()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->P()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->O()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->N()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->n()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->m()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->v()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->F()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->E()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->D()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->C()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->B()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->A()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->z()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->y()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->x()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->w()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->u()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->h()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->g()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->f()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->k()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->j()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->i()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->e()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->d()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->c()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->b()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->a()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1d
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->G()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1e
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->M()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1f
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->L()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_20
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->K()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_21
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->J()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_22
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->I()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_23
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->t()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_24
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->s()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_25
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->r()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_26
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->q()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_27
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->p()Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_28
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->o()Lb91/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
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
