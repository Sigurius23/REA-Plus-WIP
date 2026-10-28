.class public abstract Llb1/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/s0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "style",
        "Ly81/f;",
        "a",
        "(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;",
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
.method public static final a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Llb1/s0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    sget-object p0, Ly81/f;->WHITE_70:Ly81/f;

    return-object p0

    :pswitch_0
    sget-object p0, Ly81/f;->SLEEP:Ly81/f;

    return-object p0

    :pswitch_1
    sget-object p0, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    return-object p0

    :pswitch_2
    sget-object p0, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    return-object p0

    :pswitch_3
    sget-object p0, Ly81/f;->SURFACE_MCI_LUTEAL:Ly81/f;

    return-object p0

    :pswitch_4
    sget-object p0, Ly81/f;->SURFACE_MCI_FOLLICULAR:Ly81/f;

    return-object p0

    :pswitch_5
    sget-object p0, Ly81/f;->SURFACE_MCI_MENSTRUAL:Ly81/f;

    return-object p0

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
