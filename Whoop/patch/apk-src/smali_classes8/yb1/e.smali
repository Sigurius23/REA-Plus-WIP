.class public abstract Lyb1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyb1/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;",
        "style",
        "Lk61/c;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/c;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/c;
    .locals 11

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyb1/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance v0, Lk61/c;

    const/4 p0, 0x1

    int-to-float v1, p0

    sget-object p0, Lyb1/e$d;->w:Lyb1/e$d;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    const/16 v8, 0x36

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_1
    new-instance v1, Lk61/c;

    sget-object p0, Lyb1/e$c;->w:Lyb1/e$c;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    const/16 v9, 0x37

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_2
    const/4 p0, 0x0

    return-object p0

    :pswitch_3
    new-instance v0, Lk61/c;

    sget-object p0, Lyb1/e$b;->w:Lyb1/e$b;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v1

    const p0, 0x3e4ccccd    # 0.2f

    invoke-static {p0, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v5

    const/16 v8, 0x27

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
