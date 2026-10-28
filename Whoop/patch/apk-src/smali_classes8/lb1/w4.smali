.class public abstract Llb1/w4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/w4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TileBorderStyle;",
        "tileBorderStyle",
        "Ld11/a;",
        "a",
        "(Lcom/whoop/design/models/items/TileBorderStyle;)Ld11/a;",
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
.method public static final a(Lcom/whoop/design/models/items/TileBorderStyle;)Ld11/a;
    .locals 4

    const-string v0, "tileBorderStyle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/w4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance p0, Ld11/j;

    invoke-static {}, Lgb1/b0;->L()Li2/t;

    move-result-object v3

    invoke-static {v3}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v3

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/j;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_1
    new-instance p0, Ld11/k;

    sget-object v3, Ly81/f;->SLEEP:Ly81/f;

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_2
    new-instance p0, Ld11/k;

    sget-object v3, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_3
    new-instance p0, Ld11/k;

    sget-object v3, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_4
    new-instance p0, Ld11/k;

    sget-object v3, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_5
    new-instance p0, Ld11/j;

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v3

    invoke-static {v3}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v3

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/j;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_6
    new-instance p0, Ld11/j;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v3

    invoke-static {v3}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v3

    invoke-direct {p0, v3, v1, v0, v2}, Ld11/j;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_7
    return-object v2

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
