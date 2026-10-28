.class public final Lpy2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loy2/m;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J.\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpy2/i;",
        "Loy2/m;",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
        "step",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "study",
        "",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
        "results",
        "Loy2/b$f;",
        "a",
        "(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "whooplabs_release"
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
.method public a(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
            ">;",
            "Lq83/d<",
            "-",
            "Loy2/b$f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v0

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    new-instance v1, Loy2/o;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Loy2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Loy2/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getId()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageUrl()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageAlt()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTypeFormUrl()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTypeFormTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTypeformSubmitted()Z

    move-result v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCta()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSurveyProvider()Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object v18

    move-object v2, v1

    new-instance v1, Loy2/b$g;

    const v19, 0xc07c

    const/16 v20, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v1 .. v20}, Loy2/b$g;-><init>(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Loy2/n;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/whoop/whooplabs/data/domain/SurveyProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
