.class public abstract Lcm2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcm2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "Lcom/whoop/trends/data/model/NavigationSectionV3;",
        "navSections",
        "Lor2/h0;",
        "currentGraphKey",
        "Lm91/u;",
        "b",
        "(Ljava/util/List;Lor2/h0;)Ljava/util/List;",
        "graphKey",
        "Ly71/g;",
        "a",
        "(Lor2/h0;)Ly71/g;",
        "trends_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lor2/h0;)Ly71/g;
    .locals 3

    const-string v0, "graphKey"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcm2/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->n()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_0
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/q;->v()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_1
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->r()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_2
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/q;->g()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_3
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/q;->u()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_4
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->e()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_5
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Lm4/a;->b(Lx81/d;)I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_6
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->R()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_7
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->g0()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_8
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->q()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_9
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->p()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_a
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->m()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_b
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Lm4/a;->b(Lx81/d;)I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_c
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->f()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_d
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->l()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_e
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->b()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_f
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->i()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_10
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->k()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_11
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->k()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_12
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->h()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_13
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->g()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_14
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->k()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_15
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->j()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_16
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->i()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_17
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->d()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_18
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->g()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_19
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->g()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_1a
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->n()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_1b
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->a()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_1c
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/q;->o()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_1d
    new-instance p0, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/e0;->c()I

    move-result v2

    invoke-direct {p0, v2, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static final b(Ljava/util/List;Lor2/h0;)Ljava/util/List;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/NavigationSectionV3;",
            ">;",
            "Lor2/h0;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navSections"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "currentGraphKey"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/trends/data/model/NavigationSectionV3;

    new-instance v4, Lhy0/e;

    invoke-virtual {v3}, Lcom/whoop/trends/data/model/NavigationSectionV3;->getSectionName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lcom/whoop/trends/data/model/NavigationSectionV3;->getNavigationItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/trends/data/model/NavigationItemV3;

    sget-object v5, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/NavigationItemV3;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/NavigationItemV3;->getGraphKey()Lor2/h0;

    move-result-object v7

    invoke-static {v7}, Lcm2/f;->a(Lor2/h0;)Ly71/g;

    move-result-object v11

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/NavigationItemV3;->getGraphKey()Lor2/h0;

    move-result-object v7

    if-ne v7, v1, :cond_1

    sget-object v7, Lcm2/f$b;->w:Lcm2/f$b;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    :goto_1
    move-object/from16 v19, v7

    goto :goto_2

    :cond_1
    sget-object v7, Lcm2/f$c;->w:Lcm2/f$c;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    goto :goto_1

    :goto_2
    invoke-virtual {v4}, Lcom/whoop/trends/data/model/NavigationItemV3;->getGraphKey()Lor2/h0;

    move-result-object v26

    const v29, 0x6fdfde

    const/16 v30, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v2
.end method
