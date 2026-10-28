.class public final Lb42/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lb42/a;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lcom/whoop/pregnancy/api/PregnancySettingsDto;",
        "settingsDto",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "pregnancyEducation",
        "Lc42/r;",
        "f",
        "(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;",
        "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;",
        "dto",
        "d",
        "(Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)Lc42/r;",
        "",
        "currentDate",
        "Ll83/q;",
        "",
        "c",
        "(Ljava/lang/String;)Ll83/q;",
        "Lec3/l;",
        "Lz32/b;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lzr2/a;",
        "getDateAndTimeProvider",
        "()Lzr2/a;",
        "pregnancy_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb42/a;->a:Lzr2/a;

    return-void
.end method

.method public static final synthetic a(Lb42/a;Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)Lc42/r;
    .locals 0

    invoke-direct {p0, p1}, Lb42/a;->d(Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)Lc42/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lb42/a;Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;
    .locals 0

    invoke-direct {p0, p1, p2}, Lb42/a;->f(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;)Ll83/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ll83/q;"
        }
    .end annotation

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lb42/a;->a:Lzr2/a;

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    new-instance p1, Ll83/q;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v1, v2, v0}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private final d(Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)Lc42/r;
    .locals 23

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;->getWelcomeScreen()Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;

    move-result-object v0

    new-instance v1, Lc42/f;

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;->getButton()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lc42/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;->getDueDateScreen()Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;

    move-result-object v0

    new-instance v2, Lc42/d;

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getButton()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getCurrentDate()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getMaxDate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getMinDate()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyDueDateScreenDto;->getCurrentDate()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v10, p0

    invoke-direct {v10, v0}, Lb42/a;->c(Ljava/lang/String;)Ll83/q;

    move-result-object v9

    invoke-direct/range {v2 .. v9}, Lc42/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll83/q;)V

    new-instance v0, Lc42/h;

    invoke-direct {v0, v1, v2}, Lc42/h;-><init>(Lc42/f;Lc42/d;)V

    new-instance v11, Lc42/r;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1bf

    const/16 v22, 0x0

    move-object/from16 v18, v0

    invoke-direct/range {v11 .. v22}, Lc42/r;-><init>(ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method

.method private final f(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;
    .locals 41

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getPregnancyToggle()Lcom/whoop/pregnancy/api/PregnancyToggleDto;

    move-result-object v0

    new-instance v2, Lc42/s;

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyToggleDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyToggleDto;->getEnabled()Z

    move-result v3

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PregnancyToggleDto;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v2, v1, v3, v0}, Lc42/s;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getDueDate()Lcom/whoop/pregnancy/api/DueDateDto;

    move-result-object v0

    new-instance v3, Lc42/b;

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateDto;->getDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lc42/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getPrivacy()Lcom/whoop/pregnancy/api/PrivacyDto;

    move-result-object v0

    new-instance v4, Lc42/u;

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PrivacyDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PrivacyDto;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PrivacyDto;->getCtaText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/PrivacyDto;->getCtaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v1, v5, v6, v0}, Lc42/u;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getDueDateOptions()Lcom/whoop/pregnancy/api/DueDateOptionsDto;

    move-result-object v0

    new-instance v5, Lc42/a;

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateOptionsDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateOptionsDto;->getButton()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateOptionsDto;->getCurrentDate()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateOptionsDto;->getMaxDate()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateOptionsDto;->getMinDate()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/DueDateOptionsDto;->getCurrentDate()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v12, p0

    invoke-direct {v12, v0}, Lb42/a;->c(Ljava/lang/String;)Ll83/q;

    move-result-object v11

    invoke-direct/range {v5 .. v11}, Lc42/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll83/q;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getExitDialog()Lcom/whoop/pregnancy/api/ExitDialogDto;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getFeaturedDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getCtaUrl()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getDismissText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v0}, Lcom/whoop/pregnancy/api/ExitDialogDto;->getCtaText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v13, Lc42/c;

    invoke-direct/range {v13 .. v20}, Lc42/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    new-instance v0, Lc42/g;

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/educationModels/FeatureEducationDto;->getNavBar()Lcom/whoop/educationModels/NavBarDto;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/educationModels/NavBarDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_1
    invoke-static/range {p2 .. p2}, Lcom/whoop/educationModels/EducationDtoToModelMapperKt;->toStressEducationSections(Lcom/whoop/educationModels/FeatureEducationDto;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v0, v1, v6}, Lc42/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getPreviousPregnanciesSection()Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;

    move-result-object v1

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getPreviousPregnanciesSection()Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/pregnancy/api/PregnancySettingsDto;->getPreviousPregnanciesSection()Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;->getPregnancies()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/pregnancy/api/PregnancyDTO;

    sget-object v14, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v9}, Lcom/whoop/pregnancy/api/PregnancyDTO;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v9}, Lcom/whoop/pregnancy/api/PregnancyDTO;->getSubtitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v9}, Lcom/whoop/pregnancy/api/PregnancyDTO;->getLeftIcon()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_2

    new-instance v11, Ly71/g;

    invoke-static {v10}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v10

    move-object/from16 v40, v0

    const/4 v0, 0x2

    invoke-direct {v11, v10, v6, v0, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v11

    goto :goto_1

    :cond_2
    move-object/from16 v40, v0

    move-object/from16 v20, v6

    :goto_1
    invoke-virtual {v9}, Lcom/whoop/pregnancy/api/PregnancyDTO;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v31

    const v38, 0x7effd6

    const/16 v39, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v14 .. v39}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v40

    goto :goto_0

    :cond_3
    move-object/from16 v40, v0

    new-instance v6, Lc42/t;

    invoke-direct {v6, v1, v8}, Lc42/t;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    move-object/from16 v40, v0

    goto :goto_2

    :goto_3
    new-instance v14, Lc42/r;

    new-instance v1, Lc42/q;

    move-object v6, v5

    move-object v5, v13

    invoke-direct/range {v1 .. v7}, Lc42/q;-><init>(Lc42/s;Lc42/b;Lc42/u;Lc42/c;Lc42/a;Lc42/t;)V

    const/16 v24, 0xdf

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v20, v1

    move-object/from16 v23, v40

    invoke-direct/range {v14 .. v25}, Lc42/r;-><init>(ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc42/r;

    const/16 v11, 0x1fd

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lc42/r;-><init>(ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lb42/a$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lb42/a$a;-><init>(Lb42/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
