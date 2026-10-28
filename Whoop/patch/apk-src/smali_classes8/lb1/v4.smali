.class public abstract Llb1/v4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/v4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TickMarkStyle;",
        "style",
        "",
        "isLabel",
        "Ly81/f;",
        "a",
        "(Lcom/whoop/design/models/items/TickMarkStyle;Z)Ly81/f;",
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
.method public static final a(Lcom/whoop/design/models/items/TickMarkStyle;Z)Ly81/f;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Llb1/v4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    sget-object p0, Ly81/f;->WHITE_50:Ly81/f;

    return-object p0

    :pswitch_0
    sget-object p0, Ly81/f;->SURFACE_PREGNANCY_TRIMESTER_4:Ly81/f;

    return-object p0

    :pswitch_1
    sget-object p0, Ly81/f;->SURFACE_PREGNANCY_TRIMESTER_3:Ly81/f;

    return-object p0

    :pswitch_2
    sget-object p0, Ly81/f;->SURFACE_PREGNANCY_TRIMESTER_2:Ly81/f;

    return-object p0

    :pswitch_3
    sget-object p0, Ly81/f;->SURFACE_PREGNANCY_TRIMESTER_1:Ly81/f;

    return-object p0

    :pswitch_4
    sget-object p0, Ly81/f;->SURFACE_MCI_BIRTH_CONTROL_DIM:Ly81/f;

    return-object p0

    :pswitch_5
    sget-object p0, Ly81/f;->SURFACE_MCI_LUTEAL_DIM:Ly81/f;

    return-object p0

    :pswitch_6
    sget-object p0, Ly81/f;->SURFACE_MCI_OVULATORY_DIM:Ly81/f;

    return-object p0

    :pswitch_7
    sget-object p0, Ly81/f;->SURFACE_MCI_FOLLICULAR_DIM:Ly81/f;

    return-object p0

    :pswitch_8
    sget-object p0, Ly81/f;->WHITE_10:Ly81/f;

    return-object p0

    :pswitch_9
    sget-object p0, Ly81/f;->SURFACE_MCI_MENSTRUAL_DIM:Ly81/f;

    return-object p0

    :pswitch_a
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :pswitch_b
    sget-object p0, Ly81/f;->WHITE_50:Ly81/f;

    return-object p0

    :pswitch_c
    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    return-object p0

    :pswitch_d
    sget-object p0, Ly81/f;->SLEEP:Ly81/f;

    return-object p0

    :pswitch_e
    sget-object p0, Ly81/f;->SURFACE_MCI_LUTEAL:Ly81/f;

    return-object p0

    :pswitch_f
    sget-object p0, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    return-object p0

    :pswitch_10
    sget-object p0, Ly81/f;->SURFACE_MCI_FOLLICULAR:Ly81/f;

    return-object p0

    :pswitch_11
    if-eqz p1, :cond_1

    sget-object p0, Ly81/f;->WHITE_70:Ly81/f;

    return-object p0

    :cond_1
    sget-object p0, Ly81/f;->WHITE_30:Ly81/f;

    return-object p0

    :pswitch_12
    sget-object p0, Ly81/f;->WHITE_10:Ly81/f;

    return-object p0

    :pswitch_13
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :pswitch_14
    sget-object p0, Ly81/f;->SURFACE_MCI_MENSTRUAL:Ly81/f;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static synthetic b(Lcom/whoop/design/models/items/TickMarkStyle;ZILjava/lang/Object;)Ly81/f;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Llb1/v4;->a(Lcom/whoop/design/models/items/TickMarkStyle;Z)Ly81/f;

    move-result-object p0

    return-object p0
.end method
