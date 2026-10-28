.class public final Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;",
        "",
        "<init>",
        "()V",
        "fromPrivacyType",
        "",
        "privacyType",
        "Lcom/whoop/domain/model/teams/PrivacyType;",
        "toPrivacyType",
        "value",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/PrivacyType;->getValue()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object p1

    :cond_0
    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->SUMMARY:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object p1

    :cond_2
    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object p1
.end method
