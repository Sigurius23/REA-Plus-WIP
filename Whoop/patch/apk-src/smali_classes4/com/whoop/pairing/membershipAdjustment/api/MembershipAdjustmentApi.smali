.class public interface abstract Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J0\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0014\u0008\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\n\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;",
        "",
        "",
        "strapSerial",
        "strapSignature",
        "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;",
        "getMembershipAdjustment",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "url",
        "",
        "body",
        "Ll83/a0;",
        "adjustMembership",
        "(Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;",
        "postMembershipAdjustment",
        "(Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;Lq83/d;)Ljava/lang/Object;",
        "pairing-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract adjustMembership(Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method

.method public abstract getMembershipAdjustment(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "strapSerial"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "strapSignature"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v2/straps/pairing-adjustment"
    .end annotation
.end method

.method public abstract postMembershipAdjustment(Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v2/straps/pairing-adjustment"
    .end annotation
.end method
