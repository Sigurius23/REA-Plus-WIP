.class public final Lcom/whoop/whooplabs/data/domain/ProtocolStepConfigKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;",
        "Loy2/i;",
        "toDomainState",
        "(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)Loy2/i;",
        "",
        "PROTOCOL_STEP_CONFIG_TABLE",
        "Ljava/lang/String;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final PROTOCOL_STEP_CONFIG_TABLE:Ljava/lang/String; = "whoop_labs_protocol_step_config"


# direct methods
.method public static final toDomainState(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)Loy2/i;
    .locals 10

    if-nez p0, :cond_0

    new-instance v0, Loy2/i;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Loy2/i;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Loy2/i;

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getInputLabel()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_1

    move-object v0, v2

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMin()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMax()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMinErrorText()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v5, v2

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMaxErrorText()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    move-object v6, v2

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getHint()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v7, v2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getRowCount()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :goto_0
    move v8, p0

    move-object v2, v0

    goto :goto_1

    :cond_5
    const/4 p0, 0x1

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v8}, Loy2/i;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method
