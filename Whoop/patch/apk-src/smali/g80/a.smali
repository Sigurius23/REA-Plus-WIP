.class public final Lg80/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lg80/a;",
        "",
        "<init>",
        "()V",
        "Lj80/a;",
        "event",
        "Lf70/d;",
        "a",
        "(Lj80/a;)Lf70/d;",
        "Lj80/c;",
        "Lm70/a;",
        "b",
        "(Lj80/c;)Lm70/a;",
        "Lj80/d;",
        "Lo70/d;",
        "c",
        "(Lj80/d;)Lo70/d;",
        "activation_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj80/a;)Lf70/d;
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj80/a$p;

    if-eqz v0, :cond_0

    sget-object p1, Lf70/d$o;->a:Lf70/d$o;

    return-object p1

    :cond_0
    instance-of v0, p1, Lj80/a$q;

    if-eqz v0, :cond_1

    sget-object p1, Lf70/d$p;->a:Lf70/d$p;

    return-object p1

    :cond_1
    instance-of v0, p1, Lj80/a$i;

    if-eqz v0, :cond_2

    sget-object p1, Lf70/d$h;->a:Lf70/d$h;

    return-object p1

    :cond_2
    instance-of v0, p1, Lj80/a$r;

    if-eqz v0, :cond_3

    sget-object p1, Lf70/d$q;->a:Lf70/d$q;

    return-object p1

    :cond_3
    instance-of v0, p1, Lj80/a$h;

    if-eqz v0, :cond_4

    sget-object p1, Lf70/d$g;->a:Lf70/d$g;

    return-object p1

    :cond_4
    instance-of v0, p1, Lj80/a$u;

    if-eqz v0, :cond_5

    sget-object p1, Lf70/d$t;->a:Lf70/d$t;

    return-object p1

    :cond_5
    instance-of v0, p1, Lj80/a$i0;

    if-eqz v0, :cond_6

    sget-object p1, Lf70/d$a0;->a:Lf70/d$a0;

    return-object p1

    :cond_6
    instance-of v0, p1, Lj80/a$c0;

    if-eqz v0, :cond_7

    new-instance v0, Lf70/d$z;

    check-cast p1, Lj80/a$c0;

    invoke-virtual {p1}, Lj80/a$c0;->e()Z

    move-result v1

    invoke-virtual {p1}, Lj80/a$c0;->c()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v2

    invoke-virtual {p1}, Lj80/a$c0;->d()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lf70/d$z;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lj80/a$j0;

    if-eqz v0, :cond_8

    sget-object p1, Lf70/d$b0;->a:Lf70/d$b0;

    return-object p1

    :cond_8
    instance-of v0, p1, Lj80/a$m0;

    if-eqz v0, :cond_9

    new-instance v0, Lf70/d$c0;

    check-cast p1, Lj80/a$m0;

    invoke-virtual {p1}, Lj80/a$m0;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$c0;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    return-object v0

    :cond_9
    instance-of v0, p1, Lj80/a$y;

    if-eqz v0, :cond_a

    new-instance v0, Lf70/d$x;

    check-cast p1, Lj80/a$y;

    invoke-virtual {p1}, Lj80/a$y;->a()Ld70/c;

    move-result-object v1

    invoke-virtual {p1}, Lj80/a$y;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lf70/d$x;-><init>(Ld70/c;Z)V

    return-object v0

    :cond_a
    instance-of v0, p1, Lj80/a$g;

    if-eqz v0, :cond_b

    new-instance v0, Lf70/d$f;

    check-cast p1, Lj80/a$g;

    invoke-virtual {p1}, Lj80/a$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$f;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_b
    instance-of v0, p1, Lj80/a$f;

    if-eqz v0, :cond_c

    sget-object p1, Lf70/d$y$a;->a:Lf70/d$y$a;

    return-object p1

    :cond_c
    instance-of v0, p1, Lj80/a$e;

    if-eqz v0, :cond_d

    sget-object p1, Lf70/d$e;->a:Lf70/d$e;

    return-object p1

    :cond_d
    instance-of v0, p1, Lj80/a$c;

    if-eqz v0, :cond_e

    sget-object p1, Lf70/d$d;->a:Lf70/d$d;

    return-object p1

    :cond_e
    instance-of v0, p1, Lj80/a$d;

    if-eqz v0, :cond_f

    new-instance v0, Lf70/d$y$e;

    check-cast p1, Lj80/a$d;

    invoke-virtual {p1}, Lj80/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_f
    instance-of v0, p1, Lj80/a$q0;

    if-eqz v0, :cond_10

    new-instance v0, Lf70/d$y$n;

    check-cast p1, Lj80/a$q0;

    invoke-virtual {p1}, Lj80/a$q0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$n;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_10
    instance-of v0, p1, Lj80/a$s0;

    if-eqz v0, :cond_11

    new-instance v0, Lf70/d$y$f;

    check-cast p1, Lj80/a$s0;

    invoke-virtual {p1}, Lj80/a$s0;->a()Ld70/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$f;-><init>(Ld70/c;)V

    return-object v0

    :cond_11
    instance-of v0, p1, Lj80/a$u0;

    if-eqz v0, :cond_12

    new-instance v0, Lf70/d$y$k;

    check-cast p1, Lj80/a$u0;

    invoke-virtual {p1}, Lj80/a$u0;->b()Ld70/e;

    move-result-object v1

    invoke-virtual {p1}, Lj80/a$u0;->a()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lf70/d$y$k;-><init>(Ld70/e;Z)V

    return-object v0

    :cond_12
    instance-of v0, p1, Lj80/a$t0;

    if-eqz v0, :cond_13

    new-instance v0, Lf70/d$y$j;

    check-cast p1, Lj80/a$t0;

    invoke-virtual {p1}, Lj80/a$t0;->a()Ld70/d;

    move-result-object v1

    invoke-virtual {p1}, Lj80/a$t0;->b()Ld70/d;

    move-result-object v2

    invoke-virtual {p1}, Lj80/a$t0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lf70/d$y$j;-><init>(Ld70/d;Ld70/d;Ljava/lang/String;)V

    return-object v0

    :cond_13
    instance-of v0, p1, Lj80/a$a0;

    if-eqz v0, :cond_14

    new-instance v0, Lf70/d$y$h;

    check-cast p1, Lj80/a$a0;

    invoke-virtual {p1}, Lj80/a$a0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_14
    instance-of v0, p1, Lj80/a$k0;

    if-eqz v0, :cond_15

    new-instance v0, Lf70/d$y$o;

    check-cast p1, Lj80/a$k0;

    invoke-virtual {p1}, Lj80/a$k0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$o;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_15
    instance-of v0, p1, Lj80/a$e0;

    if-eqz v0, :cond_16

    new-instance v0, Lf70/d$y$d;

    check-cast p1, Lj80/a$e0;

    invoke-virtual {p1}, Lj80/a$e0;->a()Ld70/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$d;-><init>(Ld70/b;)V

    return-object v0

    :cond_16
    instance-of v0, p1, Lj80/a$d0;

    if-eqz v0, :cond_17

    new-instance v0, Lf70/d$y$c;

    check-cast p1, Lj80/a$d0;

    invoke-virtual {p1}, Lj80/a$d0;->a()Lr80/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$c;-><init>(Lr80/a;)V

    return-object v0

    :cond_17
    instance-of v0, p1, Lj80/a$f0;

    if-eqz v0, :cond_18

    new-instance v0, Lf70/d$y$m;

    check-cast p1, Lj80/a$f0;

    invoke-virtual {p1}, Lj80/a$f0;->a()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$m;-><init>(Lcom/whoop/activation/domain/models/steps/CommitmentType;)V

    return-object v0

    :cond_18
    instance-of v0, p1, Lj80/a$h0;

    if-eqz v0, :cond_19

    new-instance v0, Lf70/d$y$l;

    check-cast p1, Lj80/a$h0;

    invoke-virtual {p1}, Lj80/a$h0;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lf70/d$y$l;-><init>(I)V

    return-object v0

    :cond_19
    instance-of v0, p1, Lj80/a$z;

    if-eqz v0, :cond_1a

    new-instance v0, Lf70/d$y$g;

    check-cast p1, Lj80/a$z;

    invoke-virtual {p1}, Lj80/a$z;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$g;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1a
    instance-of v0, p1, Lj80/a$v0;

    if-eqz v0, :cond_1b

    new-instance v0, Lf70/d$y$s;

    check-cast p1, Lj80/a$v0;

    invoke-virtual {p1}, Lj80/a$v0;->a()I

    move-result v1

    invoke-virtual {p1}, Lj80/a$v0;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lf70/d$y$s;-><init>(ILcom/whoop/domain/model/UnitSystem;)V

    return-object v0

    :cond_1b
    instance-of v0, p1, Lj80/a$b0;

    if-eqz v0, :cond_1c

    new-instance v0, Lf70/d$y$b;

    check-cast p1, Lj80/a$b0;

    invoke-virtual {p1}, Lj80/a$b0;->a()I

    move-result v1

    invoke-virtual {p1}, Lj80/a$b0;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lf70/d$y$b;-><init>(ILcom/whoop/domain/model/UnitSystem;)V

    return-object v0

    :cond_1c
    instance-of v0, p1, Lj80/a$l0;

    if-eqz v0, :cond_1d

    new-instance v0, Lf70/d$y$p;

    check-cast p1, Lj80/a$l0;

    invoke-virtual {p1}, Lj80/a$l0;->b()Z

    move-result v1

    invoke-virtual {p1}, Lj80/a$l0;->c()Z

    move-result v2

    invoke-virtual {p1}, Lj80/a$l0;->d()Z

    move-result v3

    invoke-virtual {p1}, Lj80/a$l0;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lf70/d$y$p;-><init>(ZZZLjava/util/List;)V

    return-object v0

    :cond_1d
    instance-of v0, p1, Lj80/a$n0;

    if-eqz v0, :cond_1e

    new-instance v0, Lf70/d$y$q;

    check-cast p1, Lj80/a$n0;

    invoke-virtual {p1}, Lj80/a$n0;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lf70/d$y$q;-><init>(I)V

    return-object v0

    :cond_1e
    instance-of v0, p1, Lj80/a$a;

    if-eqz v0, :cond_1f

    sget-object p1, Lf70/d$b;->a:Lf70/d$b;

    return-object p1

    :cond_1f
    instance-of v0, p1, Lj80/a$b;

    if-eqz v0, :cond_20

    sget-object p1, Lf70/d$c;->a:Lf70/d$c;

    return-object p1

    :cond_20
    instance-of v0, p1, Lj80/a$t;

    if-eqz v0, :cond_21

    sget-object p1, Lf70/d$s;->a:Lf70/d$s;

    return-object p1

    :cond_21
    instance-of v0, p1, Lj80/a$s;

    if-eqz v0, :cond_22

    sget-object p1, Lf70/d$r;->a:Lf70/d$r;

    return-object p1

    :cond_22
    instance-of v0, p1, Lj80/a$k;

    if-eqz v0, :cond_23

    sget-object p1, Lf70/d$j;->a:Lf70/d$j;

    return-object p1

    :cond_23
    instance-of v0, p1, Lj80/a$w;

    if-eqz v0, :cond_24

    sget-object p1, Lf70/d$v;->a:Lf70/d$v;

    return-object p1

    :cond_24
    instance-of v0, p1, Lj80/a$v;

    if-eqz v0, :cond_25

    sget-object p1, Lf70/d$u;->a:Lf70/d$u;

    return-object p1

    :cond_25
    instance-of v0, p1, Lj80/a$l;

    if-eqz v0, :cond_26

    new-instance v0, Lf70/d$k;

    check-cast p1, Lj80/a$l;

    invoke-virtual {p1}, Lj80/a$l;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$k;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_26
    instance-of v0, p1, Lj80/a$o;

    if-eqz v0, :cond_27

    sget-object p1, Lf70/d$n;->a:Lf70/d$n;

    return-object p1

    :cond_27
    instance-of v0, p1, Lj80/a$n;

    if-eqz v0, :cond_28

    sget-object p1, Lf70/d$m;->a:Lf70/d$m;

    return-object p1

    :cond_28
    instance-of v0, p1, Lj80/a$m;

    if-eqz v0, :cond_29

    sget-object p1, Lf70/d$l;->a:Lf70/d$l;

    return-object p1

    :cond_29
    instance-of v0, p1, Lj80/a$j;

    if-eqz v0, :cond_2a

    sget-object p1, Lf70/d$i;->a:Lf70/d$i;

    return-object p1

    :cond_2a
    instance-of v0, p1, Lj80/a$x;

    if-eqz v0, :cond_2b

    sget-object p1, Lf70/d$w;->a:Lf70/d$w;

    return-object p1

    :cond_2b
    instance-of v0, p1, Lj80/a$o0;

    if-eqz v0, :cond_2c

    new-instance v0, Lf70/d$d0;

    check-cast p1, Lj80/a$o0;

    invoke-virtual {p1}, Lj80/a$o0;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lf70/d$d0;-><init>(Z)V

    return-object v0

    :cond_2c
    instance-of v0, p1, Lj80/a$r0;

    if-eqz v0, :cond_2d

    new-instance v0, Lf70/d$y$r;

    check-cast p1, Lj80/a$r0;

    invoke-virtual {p1}, Lj80/a$r0;->a()Lp90/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lf70/d$y$r;-><init>(Lp90/e;)V

    return-object v0

    :cond_2d
    instance-of v0, p1, Lj80/a$g0;

    if-eqz v0, :cond_2e

    new-instance v0, Lf70/d$y$i;

    check-cast p1, Lj80/a$g0;

    invoke-virtual {p1}, Lj80/a$g0;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lf70/d$y$i;-><init>(Z)V

    return-object v0

    :cond_2e
    instance-of p1, p1, Lj80/a$p0;

    if-eqz p1, :cond_2f

    sget-object p1, Lf70/d$e0;->a:Lf70/d$e0;

    return-object p1

    :cond_2f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Lj80/c;)Lm70/a;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lj80/c$a;

    const-string v2, "substring(...)"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-eqz v1, :cond_4

    check-cast v0, Lj80/c$a;

    invoke-virtual {v0}, Lj80/c$a;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->d()Ld70/g;

    move-result-object v8

    invoke-virtual {v0}, Lj80/c$a;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->c()Ld70/g;

    move-result-object v1

    invoke-virtual {v1}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    new-instance v9, Ld70/f;

    invoke-direct {v9, v1}, Ld70/f;-><init>(I)V

    invoke-virtual {v0}, Lj80/c$a;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->c()Ld70/g;

    move-result-object v1

    invoke-virtual {v1}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v6, :cond_2

    move-object v4, v1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_3
    new-instance v10, Ld70/f;

    invoke-direct {v10, v5}, Ld70/f;-><init>(I)V

    invoke-virtual {v0}, Lj80/c$a;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->b()Ld70/g;

    move-result-object v11

    invoke-virtual {v0}, Lj80/c$a;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->e()Ld70/g;

    move-result-object v12

    invoke-virtual {v0}, Lj80/c$a;->b()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    move-result-object v13

    invoke-virtual {v0}, Lj80/c$a;->c()Ljava/lang/String;

    move-result-object v14

    new-instance v7, Lm70/a$a;

    invoke-direct/range {v7 .. v14}, Lm70/a$a;-><init>(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V

    return-object v7

    :cond_4
    instance-of v1, v0, Lj80/c$c;

    if-eqz v1, :cond_9

    check-cast v0, Lj80/c$c;

    invoke-virtual {v0}, Lj80/c$c;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->d()Ld70/g;

    move-result-object v8

    invoke-virtual {v0}, Lj80/c$c;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->c()Ld70/g;

    move-result-object v1

    invoke-virtual {v1}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v6, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_6
    move v1, v5

    :goto_3
    new-instance v9, Ld70/f;

    invoke-direct {v9, v1}, Ld70/f;-><init>(I)V

    invoke-virtual {v0}, Lj80/c$c;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->c()Ld70/g;

    move-result-object v1

    invoke-virtual {v1}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v6, :cond_7

    move-object v4, v1

    :cond_7
    if-eqz v4, :cond_8

    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_8
    new-instance v10, Ld70/f;

    invoke-direct {v10, v5}, Ld70/f;-><init>(I)V

    invoke-virtual {v0}, Lj80/c$c;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->b()Ld70/g;

    move-result-object v11

    invoke-virtual {v0}, Lj80/c$c;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->e()Ld70/g;

    move-result-object v12

    invoke-virtual {v0}, Lj80/c$c;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lj80/c$c;->d()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lj80/c$c;->b()Z

    move-result v15

    invoke-virtual {v0}, Lj80/c$c;->f()Z

    move-result v16

    invoke-virtual {v0}, Lj80/c$c;->e()Ljava/lang/String;

    move-result-object v17

    new-instance v7, Lm70/a$d;

    invoke-direct/range {v7 .. v17}, Lm70/a$d;-><init>(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    return-object v7

    :cond_9
    instance-of v1, v0, Lj80/c$b;

    if-eqz v1, :cond_e

    check-cast v0, Lj80/c$b;

    invoke-virtual {v0}, Lj80/c$b;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->d()Ld70/g;

    move-result-object v8

    invoke-virtual {v0}, Lj80/c$b;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->c()Ld70/g;

    move-result-object v1

    invoke-virtual {v1}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v6, :cond_a

    goto :goto_4

    :cond_a
    move-object v1, v4

    :goto_4
    if-eqz v1, :cond_b

    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_5

    :cond_b
    move v1, v5

    :goto_5
    new-instance v9, Ld70/f;

    invoke-direct {v9, v1}, Ld70/f;-><init>(I)V

    invoke-virtual {v0}, Lj80/c$b;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->c()Ld70/g;

    move-result-object v1

    invoke-virtual {v1}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v6, :cond_c

    move-object v4, v1

    :cond_c
    if-eqz v4, :cond_d

    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_d
    new-instance v10, Ld70/f;

    invoke-direct {v10, v5}, Ld70/f;-><init>(I)V

    invoke-virtual {v0}, Lj80/c$b;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->b()Ld70/g;

    move-result-object v11

    invoke-virtual {v0}, Lj80/c$b;->a()Lp90/e;

    move-result-object v1

    invoke-virtual {v1}, Lp90/e;->e()Ld70/g;

    move-result-object v12

    invoke-virtual {v0}, Lj80/c$b;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lj80/c$b;->d()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lj80/c$b;->b()Z

    move-result v15

    invoke-virtual {v0}, Lj80/c$b;->f()Z

    move-result v16

    invoke-virtual {v0}, Lj80/c$b;->e()Ljava/lang/String;

    move-result-object v17

    new-instance v7, Lm70/a$c;

    invoke-direct/range {v7 .. v17}, Lm70/a$c;-><init>(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    return-object v7

    :cond_e
    instance-of v0, v0, Lj80/c$d;

    if-eqz v0, :cond_f

    sget-object v0, Lm70/a$b;->a:Lm70/a$b;

    return-object v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final c(Lj80/d;)Lo70/d;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj80/d$f;

    if-eqz v0, :cond_0

    new-instance v0, Lo70/d$f;

    check-cast p1, Lj80/d$f;

    invoke-virtual {p1}, Lj80/d$f;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lo70/d$f;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lj80/d$c;

    if-eqz v0, :cond_1

    new-instance v0, Lo70/d$c;

    check-cast p1, Lj80/d$c;

    invoke-virtual {p1}, Lj80/d$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj80/d$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lo70/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lj80/d$a;

    if-eqz v0, :cond_2

    new-instance v0, Lo70/d$a;

    check-cast p1, Lj80/d$a;

    invoke-virtual {p1}, Lj80/d$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lo70/d$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lj80/d$d;

    if-eqz v0, :cond_3

    new-instance v0, Lo70/d$d;

    check-cast p1, Lj80/d$d;

    invoke-virtual {p1}, Lj80/d$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lo70/d$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lj80/d$e;

    if-eqz v0, :cond_4

    sget-object p1, Lo70/d$e;->a:Lo70/d$e;

    return-object p1

    :cond_4
    instance-of p1, p1, Lj80/d$b;

    if-eqz p1, :cond_5

    sget-object p1, Lo70/d$b;->a:Lo70/d$b;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
