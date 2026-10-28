.class public abstract Llb1/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/o0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/SegmentModel;",
        "segment",
        "Ly11/e;",
        "a",
        "(Lcom/whoop/design/models/SegmentModel;)Ly11/e;",
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
.method public static final a(Lcom/whoop/design/models/SegmentModel;)Ly11/e;
    .locals 7

    const-string v0, "segment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/ComparisonSegmentStyle;->STRIPES:Lcom/whoop/design/models/ComparisonSegmentStyle;

    invoke-static {}, Lcom/whoop/design/models/ComparisonSegmentStyle;->values()[Lcom/whoop/design/models/ComparisonSegmentStyle;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    :goto_2
    sget-object v0, Llb1/o0$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance v0, Ly11/e$b;

    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getFillPercent()F

    move-result p0

    invoke-direct {v0, v1, p0}, Ly11/e$b;-><init>(Ly81/f;F)V

    return-object v0

    :pswitch_1
    new-instance v0, Ly11/e$a;

    sget-object v1, Ly81/f;->STRAIN:Ly81/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getFillPercent()F

    move-result p0

    invoke-direct {v0, v1, p0}, Ly11/e$a;-><init>(Ly81/f;F)V

    return-object v0

    :pswitch_2
    new-instance v0, Ly11/e$a;

    sget-object v1, Ly81/f;->WHITE_20:Ly81/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getFillPercent()F

    move-result p0

    invoke-direct {v0, v1, p0}, Ly11/e$a;-><init>(Ly81/f;F)V

    return-object v0

    :pswitch_3
    new-instance v0, Ly11/e$a;

    sget-object v1, Ly81/f;->WHITE_50:Ly81/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getFillPercent()F

    move-result p0

    invoke-direct {v0, v1, p0}, Ly11/e$a;-><init>(Ly81/f;F)V

    return-object v0

    :pswitch_4
    new-instance v0, Ly11/e$a;

    sget-object v1, Ly81/f;->SLEEP:Ly81/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getFillPercent()F

    move-result p0

    invoke-direct {v0, v1, p0}, Ly11/e$a;-><init>(Ly81/f;F)V

    return-object v0

    :pswitch_5
    new-instance v0, Ly11/e$a;

    sget-object v1, Ly81/f;->SLEEP_AWAKE:Ly81/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/SegmentModel;->getFillPercent()F

    move-result p0

    invoke-direct {v0, v1, p0}, Ly11/e$a;-><init>(Ly81/f;F)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
