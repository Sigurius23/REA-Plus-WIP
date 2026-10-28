.class final Lo52/s0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo52/s0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lo52/s0;


# direct methods
.method public constructor <init>(Lo52/s0;)V
    .locals 0

    iput-object p1, p0, Lo52/s0$a$a;->w:Lo52/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_7

    iget-object v2, v0, Lo52/s0$a$a;->w:Lo52/s0;

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;->getCycleMetadata()Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;->getSleep()Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;->getCycleMetadata()Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;->getStrain()Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->getOptimalStrainMapping()Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_4

    :cond_2
    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;

    invoke-virtual {v7}, Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;->getRecovery()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7}, Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;->getLowerOptimalStrain()Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;->getOptimalStrain()Ljava/lang/Double;

    move-result-object v10

    invoke-virtual {v7}, Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;->getUpperOptimalStrain()Ljava/lang/Double;

    move-result-object v7

    if-eqz v8, :cond_4

    if-eqz v9, :cond_4

    if-eqz v10, :cond_4

    if-eqz v7, :cond_4

    new-instance v11, Lcom/whoop/domain/model/StrainRecoveryMapping;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v15

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v17

    invoke-direct/range {v11 .. v18}, Lcom/whoop/domain/model/StrainRecoveryMapping;-><init>(IDDD)V

    goto :goto_3

    :cond_4
    move-object v11, v5

    :goto_3
    if-eqz v11, :cond_3

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance v4, Lp92/j;

    invoke-direct {v4, v6}, Lp92/j;-><init>(Ljava/util/List;)V

    invoke-virtual {v4}, Lp92/j;->d()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v4, v3, v1}, Lo52/s0;->w(Lo52/s0;Lp92/j;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V

    goto :goto_5

    :cond_6
    :goto_4
    invoke-static {v2}, Lo52/s0;->z(Lo52/s0;)V

    goto :goto_5

    :cond_7
    iget-object v1, v0, Lo52/s0$a$a;->w:Lo52/s0;

    invoke-static {v1}, Lo52/s0;->z(Lo52/s0;)V

    :cond_8
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    invoke-virtual {p0, p1, p2}, Lo52/s0$a$a;->b(Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
