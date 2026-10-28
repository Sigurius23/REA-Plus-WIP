.class public final Lnc0/d$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc0/d$l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Z

.field final synthetic y:Lnc0/d;


# direct methods
.method public constructor <init>(Lec3/m;ZLnc0/d;)V
    .locals 0

    iput-object p1, p0, Lnc0/d$l$a;->w:Lec3/m;

    iput-boolean p2, p0, Lnc0/d$l$a;->x:Z

    iput-object p3, p0, Lnc0/d$l$a;->y:Lnc0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lnc0/d$l$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lnc0/d$l$a$a;

    iget v3, v2, Lnc0/d$l$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lnc0/d$l$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lnc0/d$l$a$a;

    invoke-direct {v2, v0, v1}, Lnc0/d$l$a$a;-><init>(Lnc0/d$l$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lnc0/d$l$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lnc0/d$l$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lnc0/d$l$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lnc0/d$l$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lnc0/d$l$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lnc0/d$l$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_3

    new-instance v7, Lnc0/c;

    sget-object v8, Lnc0/a$b;->a:Lnc0/a$b;

    const/16 v16, 0xfe

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lnc0/c;-><init>(Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_4

    new-instance v7, Lnc0/c;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    iget-boolean v10, v0, Lnc0/d$l$a;->x:Z

    const/16 v16, 0xf1

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lnc0/c;-><init>(Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_5

    new-instance v7, Lnc0/c;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    const/16 v16, 0xfd

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lnc0/c;-><init>(Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_6

    new-instance v7, Lnc0/c;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    const/16 v16, 0xfd

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lnc0/c;-><init>(Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_8

    iget-object v6, v0, Lnc0/d$l$a;->y:Lnc0/d;

    check-cast v4, Lpm0/a$c;

    invoke-static {v6, v4}, Lnc0/d;->g(Lnc0/d;Lpm0/a$c;)Lnc0/c;

    move-result-object v7

    :goto_1
    const/4 v4, 0x0

    iput-object v4, v2, Lnc0/d$l$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lnc0/d$l$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lnc0/d$l$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lnc0/d$l$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lnc0/d$l$a$a;->H:I

    iput v5, v2, Lnc0/d$l$a$a;->x:I

    invoke-interface {v1, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
