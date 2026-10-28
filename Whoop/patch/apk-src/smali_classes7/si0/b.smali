.class public abstract Lsi0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsi0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;",
        "Lti0/l;",
        "a",
        "(Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lti0/l;",
        "arch-v2_release"
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
.method public static final a(Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lti0/l;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lsi0/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    sget-object p0, Lti0/l;->NO_PHASE:Lti0/l;

    return-object p0

    :pswitch_2
    sget-object p0, Lti0/l;->HORMONAL_BIRTH_CONTROL:Lti0/l;

    return-object p0

    :pswitch_3
    sget-object p0, Lti0/l;->LUTEAL:Lti0/l;

    return-object p0

    :pswitch_4
    sget-object p0, Lti0/l;->OVULATORY:Lti0/l;

    return-object p0

    :pswitch_5
    sget-object p0, Lti0/l;->FOLLICULAR:Lti0/l;

    return-object p0

    :pswitch_6
    sget-object p0, Lti0/l;->MENSTRUAL:Lti0/l;

    return-object p0

    :pswitch_7
    sget-object p0, Lti0/l;->PROGRAM_HOME:Lti0/l;

    return-object p0

    :pswitch_8
    sget-object p0, Lti0/l;->TREND_NEGATIVE:Lti0/l;

    return-object p0

    :pswitch_9
    sget-object p0, Lti0/l;->WHOOP_BACKGROUND:Lti0/l;

    return-object p0

    :pswitch_a
    sget-object p0, Lti0/l;->AMERICA_250:Lti0/l;

    return-object p0

    :pswitch_b
    sget-object p0, Lti0/l;->DARK:Lti0/l;

    return-object p0

    :pswitch_c
    sget-object p0, Lti0/l;->AI_CHAT:Lti0/l;

    return-object p0

    :pswitch_d
    sget-object p0, Lti0/l;->DEFAULT:Lti0/l;

    return-object p0

    :pswitch_e
    sget-object p0, Lti0/l;->DEFAULT:Lti0/l;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_0
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
    .end packed-switch
.end method
