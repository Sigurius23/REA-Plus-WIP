.class public final Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/membership/returns/domain/models/ReturnResponse;",
        "Lwx1/d;",
        "pdfHandler",
        "Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;",
        "toReturnDomainHolder",
        "(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lwx1/d;Lq83/d;)Ljava/lang/Object;",
        "membership_release"
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
.method public static final toReturnDomainHolder(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lwx1/d;Lq83/d;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/returns/domain/models/ReturnResponse;",
            "Lwx1/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;

    iget v2, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;

    invoke-direct {v1, v0}, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v3, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->I$1:I

    iget v6, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->I$0:I

    iget-object v7, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$15:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$14:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$13:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/design/util/TextResource;

    iget-object v10, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$12:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/design/util/TextResource;

    iget-object v11, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$11:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/design/util/TextResource;

    iget-object v12, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$10:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/design/util/TextResource;

    iget-object v13, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$9:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$8:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$7:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/membership/returns/domain/models/DownloadButton;

    iget-object v15, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$5:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v4, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v5, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lwx1/d;

    move-object/from16 v16, v0

    iget-object v0, v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v17, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v4

    move v4, v3

    move-object v3, v1

    move-object v1, v0

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object/from16 v16, v0

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getNavbarTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getAlertTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getAlertSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getInstructionsTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getInstructions()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/membership/returns/domain/models/Instruction;

    new-instance v10, Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;

    invoke-virtual {v9}, Lcom/whoop/membership/returns/domain/models/Instruction;->getIcon()Lgz0/m0;

    move-result-object v11

    invoke-virtual {v9}, Lcom/whoop/membership/returns/domain/models/Instruction;->getMarkdownText()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v10, v11, v9}, Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;-><init>(Lgz0/m0;Ljava/lang/String;)V

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getButtons()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v12, v0

    move-object v11, v3

    move-object v10, v4

    move-object v15, v6

    move-object v8, v7

    move-object v7, v9

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v3, v1

    move-object v9, v5

    move-object/from16 v1, p1

    :goto_2
    move-object/from16 v0, p0

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/membership/returns/domain/models/DownloadButton;

    invoke-virtual {v5}, Lcom/whoop/membership/returns/domain/models/DownloadButton;->getText()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5}, Lcom/whoop/membership/returns/domain/models/DownloadButton;->getUrl()Ljava/lang/String;

    move-result-object v14

    iput-object v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$1:Ljava/lang/Object;

    move-object/from16 v16, v0

    const/4 v0, 0x0

    iput-object v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$2:Ljava/lang/Object;

    iput-object v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$3:Ljava/lang/Object;

    iput-object v7, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$4:Ljava/lang/Object;

    iput-object v15, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$5:Ljava/lang/Object;

    iput-object v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$6:Ljava/lang/Object;

    iput-object v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$7:Ljava/lang/Object;

    iput-object v14, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$8:Ljava/lang/Object;

    iput-object v13, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$9:Ljava/lang/Object;

    iput-object v12, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$10:Ljava/lang/Object;

    iput-object v11, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$11:Ljava/lang/Object;

    iput-object v10, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$12:Ljava/lang/Object;

    iput-object v9, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$13:Ljava/lang/Object;

    iput-object v8, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$14:Ljava/lang/Object;

    iput-object v7, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->L$15:Ljava/lang/Object;

    iput v6, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->I$0:I

    iput v4, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->I$1:I

    const/4 v0, 0x0

    iput v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->I$2:I

    const/4 v0, 0x1

    iput v0, v3, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->label:I

    invoke-virtual {v1, v5, v3}, Lwx1/d;->d(Lcom/whoop/membership/returns/domain/models/DownloadButton;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_4

    return-object v2

    :cond_4
    move-object/from16 v17, v5

    move-object v5, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    :goto_3
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/String;

    move-object/from16 p0, v1

    new-instance v1, Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;

    invoke-direct {v1, v14, v15, v0}, Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v5

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v15, v17

    goto :goto_2

    :cond_5
    move-object/from16 v16, v0

    move-object/from16 v22, v7

    check-cast v22, Ljava/util/List;

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getFooterText()Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getPolicyCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->getPolicyCtaUrl()Ljava/lang/String;

    move-result-object v25

    new-instance v16, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    move-object/from16 v21, v8

    move-object/from16 v20, v9

    move-object/from16 v19, v10

    move-object/from16 v18, v11

    move-object/from16 v17, v12

    invoke-direct/range {v16 .. v25}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v16
.end method
