.class public abstract Lpb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpb1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TileTagModel;",
        "Li21/u;",
        "a",
        "(Lcom/whoop/design/models/items/TileTagModel;)Li21/u;",
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
.method public static final a(Lcom/whoop/design/models/items/TileTagModel;)Li21/u;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TileTagModel;->getTagStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/items/TagStyle;->NEUTRAL:Lcom/whoop/design/models/items/TagStyle;

    invoke-static {}, Lcom/whoop/design/models/items/TagStyle;->values()[Lcom/whoop/design/models/items/TagStyle;

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
    sget-object v0, Lpb1/a$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance v0, Ll83/q;

    sget-object v1, Li21/v;->TREND_INDICATOR:Li21/v;

    sget-object v2, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v3, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {v0, v1, v2, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_1
    new-instance v0, Ll83/q;

    sget-object v1, Li21/v;->AUTO_DETECTED:Li21/v;

    sget-object v2, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v3, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {v0, v1, v2, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_2
    new-instance v0, Ll83/q;

    sget-object v1, Li21/v;->NEW:Li21/v;

    sget-object v2, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v3, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {v0, v1, v2, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_3
    new-instance v0, Ll83/q;

    sget-object v1, Li21/v;->NEUTRAL:Li21/v;

    sget-object v2, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v3, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v0, v1, v2, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    new-instance v0, Ll83/q;

    sget-object v1, Li21/v;->NEGATIVE:Li21/v;

    sget-object v2, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    sget-object v3, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    invoke-direct {v0, v1, v2, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_5
    new-instance v0, Ll83/q;

    sget-object v1, Li21/v;->POSITIVE:Li21/v;

    sget-object v2, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    sget-object v3, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    invoke-direct {v0, v1, v2, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    iget-object v1, v0, Ll83/q;->w:Ljava/lang/Object;

    check-cast v1, Li21/v;

    iget-object v2, v0, Ll83/q;->x:Ljava/lang/Object;

    check-cast v2, Ly81/f;

    iget-object v0, v0, Ll83/q;->y:Ljava/lang/Object;

    check-cast v0, Ly81/f;

    new-instance v3, Li21/u;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TileTagModel;->getTagTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v3, v1, p0, v2, v0}, Li21/u;-><init>(Li21/v;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
