.class public final Laa2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Laa2/h;",
        "",
        "<init>",
        "()V",
        "Laa2/i;",
        "userProfileEntity",
        "Lcom/whoop/domain/model/UserProfile;",
        "b",
        "(Laa2/i;)Lcom/whoop/domain/model/UserProfile;",
        "Lcom/whoop/domain/model/User;",
        "user",
        "Laa2/g;",
        "d",
        "(Lcom/whoop/domain/model/User;)Laa2/g;",
        "userProfile",
        "",
        "id",
        "c",
        "(Lcom/whoop/domain/model/UserProfile;I)Laa2/i;",
        "userEntity",
        "a",
        "(Laa2/g;Laa2/i;)Lcom/whoop/domain/model/User;",
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

.method private final b(Laa2/i;)Lcom/whoop/domain/model/UserProfile;
    .locals 12

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/whoop/domain/model/UserProfile;

    invoke-virtual {p1}, Laa2/i;->d()Lcom/whoop/domain/model/Gender;

    move-result-object v1

    invoke-virtual {p1}, Laa2/i;->e()F

    move-result v2

    invoke-virtual {p1}, Laa2/i;->l()F

    move-result v3

    invoke-virtual {p1}, Laa2/i;->a()Lorg/joda/time/LocalDate;

    move-result-object v4

    invoke-virtual {p1}, Laa2/i;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Laa2/i;->k()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v6

    invoke-virtual {p1}, Laa2/i;->c()Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v7

    invoke-virtual {p1}, Laa2/i;->g()I

    move-result v8

    invoke-virtual {p1}, Laa2/i;->h()I

    move-result v9

    invoke-virtual {p1}, Laa2/i;->i()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Laa2/i;->b()Z

    move-result v11

    invoke-direct/range {v0 .. v11}, Lcom/whoop/domain/model/UserProfile;-><init>(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public final a(Laa2/g;Laa2/i;)Lcom/whoop/domain/model/User;
    .locals 17

    const-string v0, "userEntity"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Laa2/g;->k()I

    move-result v2

    invoke-virtual {v1}, Laa2/g;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Laa2/g;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Laa2/g;->l()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Laa2/g;->j()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Laa2/g;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Laa2/g;->m()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Laa2/g;->n()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Laa2/g;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Laa2/g;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Laa2/g;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Laa2/g;->f()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Laa2/g;->e()Z

    move-result v0

    invoke-virtual {v1}, Laa2/g;->b()I

    move-result v16

    move-object/from16 v1, p0

    move-object/from16 v14, p2

    invoke-direct {v1, v14}, Laa2/h;->b(Laa2/i;)Lcom/whoop/domain/model/UserProfile;

    move-result-object v14

    new-instance v1, Lcom/whoop/domain/model/User;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct/range {v1 .. v16}, Lcom/whoop/domain/model/User;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)V

    return-object v1
.end method

.method public final c(Lcom/whoop/domain/model/UserProfile;I)Laa2/i;
    .locals 14

    const-string v0, "userProfile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Laa2/i;

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getGender()Lcom/whoop/domain/model/Gender;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getHeight()F

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getWeight()F

    move-result v5

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getBirthday()Lorg/joda/time/LocalDate;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getTimeZoneOffset()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getFitnessLevel()Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getMaxHeartRate()I

    move-result v10

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getMinHeartRate()I

    move-result v11

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getPhysiologicalBaseline()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getCanUploadData()Z

    move-result v13

    move/from16 v2, p2

    invoke-direct/range {v1 .. v13}, Laa2/i;-><init>(ILcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V

    return-object v1
.end method

.method public final d(Lcom/whoop/domain/model/User;)Laa2/g;
    .locals 16

    const-string v0, "user"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Laa2/g;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getCreatedAt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getFirstName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getLastName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getPassword()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getUsername()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getCity()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getAdminDivision()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getConcealed()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    move v14, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/domain/model/User;->getAge()I

    move-result v15

    invoke-direct/range {v1 .. v15}, Laa2/g;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    return-object v1
.end method
