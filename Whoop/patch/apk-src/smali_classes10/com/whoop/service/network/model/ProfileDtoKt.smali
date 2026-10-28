.class public final Lcom/whoop/service/network/model/ProfileDtoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toUserProfile",
        "Lcom/whoop/domain/model/UserProfile;",
        "Lcom/whoop/service/network/model/ProfileDto;",
        "core_release"
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
.method public static final toUserProfile(Lcom/whoop/service/network/model/ProfileDto;)Lcom/whoop/domain/model/UserProfile;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/domain/model/Gender;->Companion:Lcom/whoop/domain/model/Gender$Companion;

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    sget-object v1, Lcom/whoop/domain/model/Gender;->FEMALE:Lcom/whoop/domain/model/Gender;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Gender;->getValue()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/whoop/domain/model/Gender$Companion;->fromName(Ljava/lang/String;)Lcom/whoop/domain/model/Gender;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getHeight()F

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getWeight()F

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getTimezoneOffset()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lor2/n0;->d(Ljava/lang/String;)Lorg/joda/time/DateTimeZone;

    move-result-object v1

    invoke-static {v0, v1}, Lor2/n0;->a(Ljava/lang/String;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/LocalDate;

    move-result-object v6

    const-string v0, "IsoDateTimeStringToLocalDate(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getTimezoneOffset()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getUnitSystem()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/domain/model/UnitSystem;->fromName(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v8

    const-string v0, "fromName(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getFitnessLevel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/domain/model/FitnessLevel;->fromNameKey(Ljava/lang/String;)Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v9

    const-string v0, "fromNameKey(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getMaxHeartRate()I

    move-result v10

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getMinHeartRate()I

    move-result v11

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getPhysiologicalBaseline()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p0}, Lcom/whoop/service/network/model/ProfileDto;->getCanUploadData()Z

    move-result v13

    new-instance v2, Lcom/whoop/domain/model/UserProfile;

    invoke-direct/range {v2 .. v13}, Lcom/whoop/domain/model/UserProfile;-><init>(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V

    return-object v2
.end method
