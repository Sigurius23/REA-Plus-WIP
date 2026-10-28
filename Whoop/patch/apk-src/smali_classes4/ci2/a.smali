.class public abstract Lci2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lci2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ljk0/d;",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "b",
        "(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;",
        "deviceName",
        "",
        "serial",
        "firmwareVersion",
        "a",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "connectivity_release"
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
.method private static final a(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;
    .locals 3

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    new-instance v1, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;

    sget-object v2, Lht0/a;->AMBIQ:Lht0/a;

    invoke-direct {v1, v2, p2}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;-><init>(Lht0/a;Ljava/lang/String;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public static final b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getRawSerialNumber()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const-string v3, ""

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v4}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v1

    :goto_1
    if-nez v4, :cond_3

    move-object v4, v3

    :cond_3
    invoke-interface {p0}, Ljk0/d;->w0()Lst0/v;

    move-result-object p0

    sget-object v5, Lci2/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v5, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalAccessException;

    const-string v0, "Puffin should not be checked here from IWhoopStrap extension method"

    invoke-direct {p0, v0}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    sget-object p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->SYMPHONY:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {p0, v2, v4}, Lci2/a;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p0

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->MONUMENT:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {p0, v2, v4}, Lci2/a;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p0

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->GOOSE:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {p0, v2, v4}, Lci2/a;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p0

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->MAVERICK:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {p0, v2, v4}, Lci2/a;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p0

    return-object p0

    :pswitch_5
    new-instance p0, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    sget-object v5, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->HARVARD:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v6, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;

    sget-object v7, Lht0/a;->MAXIM:Lht0/a;

    invoke-direct {v6, v7, v4}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;-><init>(Lht0/a;Ljava/lang/String;)V

    new-instance v4, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;

    sget-object v7, Lht0/a;->NORDIC:Lht0/a;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getBluetoothVersion()Loh2/b;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v1

    :cond_4
    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v3, v1

    :goto_2
    invoke-direct {v4, v7, v3}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;-><init>(Lht0/a;Ljava/lang/String;)V

    filled-new-array {v6, v4}, [Lcom/whoop/connectivityCore/firmware/models/ChipDetails;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v5, v2, v0}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/util/List;)V

    return-object p0

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
