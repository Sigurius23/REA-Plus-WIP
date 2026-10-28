.class public abstract Llb1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/TrendStateEnum;",
        "Ly81/f;",
        "b",
        "(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;",
        "arrowStat",
        "Lly0/a;",
        "a",
        "(Lcom/whoop/design/models/TrendStateEnum;)Lly0/a;",
        "design-models_release"
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
.method public static final a(Lcom/whoop/design/models/TrendStateEnum;)Lly0/a;
    .locals 5

    const-string v0, "arrowStat"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/o$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->d()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->e()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lly0/a;

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->d()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/i0;->m()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->e()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->d()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    :pswitch_7
    new-instance v0, Lly0/a;

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->e()I

    move-result v4

    invoke-direct {v3, v4, v2, v1, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v3, p0}, Lly0/a;-><init>(Ly71/g;Ly81/f;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static final b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/o$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p0

    :pswitch_1
    sget-object p0, Ly81/f;->WHITE_50:Ly81/f;

    return-object p0

    :pswitch_2
    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
