.class public abstract Lh22/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;",
        "Lg22/a;",
        "a",
        "(Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;)Lg22/a;",
        "pairing-ui_release"
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
.method public static final a(Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;)Lg22/a;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg22/a;

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getHeader()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getBody()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getContinueCtaTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getCancelCtaTitle()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getStrapImage()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;->getPayload()Ljava/util/Map;

    move-result-object v10

    invoke-direct/range {v1 .. v10}, Lg22/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method
