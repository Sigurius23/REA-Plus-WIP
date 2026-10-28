.class public final Lpy2/b;
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
        "Lpy2/b;",
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
    .locals 15
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

    new-instance v0, Loy2/o;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Loy2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Loy2/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCta()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getInputRequired()Z

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getRequiredRegex()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getBlockedRegex()Ljava/lang/String;

    move-result-object v12

    move-object v1, v0

    new-instance v0, Loy2/b$a;

    const/16 v13, 0x1bc

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v14}, Loy2/b$a;-><init>(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
