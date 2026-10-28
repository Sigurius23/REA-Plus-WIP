.class public final Lcom/whoop/labrador/feature/details/domain/model/DomainMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0004*\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;",
        "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;",
        "toDomainHolder",
        "(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;",
        "",
        "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
        "Lsk1/b;",
        "toDeterminationViewState",
        "(Ljava/util/List;)Ljava/util/List;",
        "labrador_release"
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
.method public static final toDeterminationViewState(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
            ">;)",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;->getTrendType()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    invoke-static {}, Lhy0/b2;->values()[Lhy0/b2;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    move-object v3, v7

    :goto_3
    new-instance v1, Lsk1/b;

    invoke-direct {v1, v2, v3}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static final toDomainHolder(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;
    .locals 19

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getReportTimestamp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getSamples()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getArrhythmiaDetermination()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getArrhythmiaReadings()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/labrador/feature/details/domain/model/DomainMapperKt;->toDeterminationViewState(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getArrhythmiaInsightInformation()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getAverageHeartRate()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v7, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getShareResultTile()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CtaTileModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getDisclaimerLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getReadingSymptomsAndNotesTile()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;->getNotesSymptomsLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object v10, v0

    goto :goto_5

    :cond_3
    :goto_4
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getAddSymptomsAndNotesTile()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CtaTileModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_4
    sget v0, Lrs1/f;->l:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    goto :goto_3

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getClearReadingLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getId()Ljava/lang/String;

    move-result-object v12

    :try_start_0
    sget-object v0, Ljava/time/format/DateTimeFormatter;->ISO_OFFSET_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getTrailingTimestamp()Ljava/lang/String;

    move-result-object v13

    new-instance v14, Llj1/a;

    const/4 v15, 0x0

    invoke-direct {v14, v15}, Llj1/a;-><init>(I)V

    invoke-virtual {v0, v13, v14}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/time/Instant;
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    :goto_6
    move-object v13, v0

    goto :goto_7

    :catch_0
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getTrailingTimestamp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-long v13, v0

    invoke-static {v13, v14}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_6
    sget-object v0, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    goto :goto_6

    :goto_7
    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getReadingSymptomsAndNotesTile()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;->getReadingSymptoms()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v0, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v16, v0

    sget-object v0, Lrt1/f;->Companion:Lrt1/f$a;

    invoke-virtual {v0, v15}, Lrt1/f$a;->a(Ljava/lang/String;)Lrt1/f;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_7
    const-string v0, ""

    :cond_8
    invoke-interface {v14, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v16

    goto :goto_8

    :cond_9
    sget-object v14, Lm83/y;->w:Lm83/y;

    :cond_a
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getReadingSymptomsAndNotesTile()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    move-result-object v0

    const/4 v15, 0x0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;->getReadingNotes()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_b
    move-object v0, v15

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getPdfPresignedUrl()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getProtectYourPrivacy()Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    move-result-object v17

    if-eqz v17, :cond_c

    invoke-virtual/range {v17 .. v17}, Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;->getTitle()Ljava/lang/String;

    move-result-object v17

    goto :goto_a

    :cond_c
    move-object/from16 v17, v15

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->getProtectYourPrivacy()Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;->getDescription()Ljava/lang/String;

    move-result-object v15

    :cond_d
    move-object/from16 v18, v15

    new-instance v1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-object v15, v0

    invoke-direct/range {v1 .. v18}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
