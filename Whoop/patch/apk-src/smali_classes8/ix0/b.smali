.class public final Lix0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lix0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lix0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lix0/b;",
        "Lix0/a;",
        "Leu0/a;",
        "repository",
        "Lcom/whoop/researchPacket/api/ResearchMetricsApi;",
        "researchMetricsApi",
        "Ljs0/c;",
        "configurationRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Leu0/a;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;)V",
        "",
        "Lgu0/a;",
        "batch",
        "",
        "d",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lic/u;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Leu0/a;",
        "b",
        "Lcom/whoop/researchPacket/api/ResearchMetricsApi;",
        "c",
        "Ljs0/c;",
        "Ltr2/n;",
        "e",
        "data-sync-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lix0/b$a;


# instance fields
.field private final a:Leu0/a;

.field private final b:Lcom/whoop/researchPacket/api/ResearchMetricsApi;

.field private final c:Ljs0/c;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lix0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lix0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lix0/b;->e:Lix0/b$a;

    return-void
.end method

.method public constructor <init>(Leu0/a;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "researchMetricsApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lix0/b;->a:Leu0/a;

    .line 3
    iput-object p2, p0, Lix0/b;->b:Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    .line 4
    iput-object p3, p0, Lix0/b;->c:Ljs0/c;

    .line 5
    iput-object p4, p0, Lix0/b;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Leu0/a;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "DataSettingsUploader"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lix0/b;-><init>(Leu0/a;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic b(Lix0/b;)Lcom/whoop/researchPacket/api/ResearchMetricsApi;
    .locals 0

    iget-object p0, p0, Lix0/b;->b:Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    return-object p0
.end method

.method public static final synthetic c(Lix0/b;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lix0/b;->d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lix0/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lix0/b$b;

    iget v1, v0, Lix0/b$b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lix0/b$b;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lix0/b$b;

    invoke-direct {v0, p0, p2}, Lix0/b$b;-><init>(Lix0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lix0/b$b;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lix0/b$b;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lix0/b$b;->E:Ljava/lang/Object;

    check-cast p1, Lud3/v0;

    iget-object p1, v0, Lix0/b$b;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lix0/b$b;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    iget-object v4, v0, Lix0/b$b;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    iget-object v4, v0, Lix0/b$b;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v0

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lgu0/a;

    invoke-virtual {p2}, Lgu0/a;->b()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    move-result-object p2

    iget-object v2, p0, Lix0/b;->d:Ltr2/n;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {p2}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;->getStrapId()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgu0/a;

    invoke-virtual {v6}, Lgu0/a;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lgu0/a;

    invoke-virtual {v7}, Lgu0/a;->c()J

    move-result-wide v7

    invoke-static {v7, v8}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v7

    const-string v8, " Rev2 data settings frames for "

    const-string v9, ": "

    const-string v10, "Uploading "

    invoke-static {v4, v10, v8, v5, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " - "

    invoke-static {v4, v6, v5, v7}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v2, v4, v5}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p2}, Lix0/c;->a(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;)Ljava/util/Map;

    move-result-object p2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgu0/a;

    invoke-virtual {v4}, Lgu0/a;->d()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const p1, 0x4c4b40

    iget-object v4, p0, Lix0/b;->d:Ltr2/n;

    invoke-static {v2, p1, v4}, Lhx0/a;->a(Ljava/util/List;ILtr2/n;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v2, p2

    move-object v9, v0

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lud3/v0;

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v5, p0, Lix0/b;->d:Ltr2/n;

    new-instance v8, Lix0/b$c;

    const/4 v0, 0x0

    invoke-direct {v8, p0, p2, v2, v0}, Lix0/b$c;-><init>(Lix0/b;Lud3/v0;Ljava/util/Map;Lq83/d;)V

    iput-object v0, v9, Lix0/b$b;->w:Ljava/lang/Object;

    iput-object v0, v9, Lix0/b$b;->x:Ljava/lang/Object;

    iput-object v2, v9, Lix0/b$b;->y:Ljava/lang/Object;

    iput-object p1, v9, Lix0/b$b;->z:Ljava/lang/Object;

    iput-object v0, v9, Lix0/b$b;->E:Ljava/lang/Object;

    iput v3, v9, Lix0/b$b;->H:I

    const/4 v6, 0x0

    const-string v7, "Something went wrong uploading Rev2 data settings"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p2, p2, Lu02/a$b;

    if-eqz p2, :cond_4

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lix0/b$d;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lix0/b$d;

    iget v3, v2, Lix0/b$d;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lix0/b$d;->I:I

    goto :goto_0

    :cond_0
    new-instance v2, Lix0/b$d;

    invoke-direct {v2, v0, v1}, Lix0/b$d;-><init>(Lix0/b;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lix0/b$d;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lix0/b$d;->I:I

    const-string v6, "null cannot be cast to non-null type kotlin.Int"

    const-class v7, Ljava/lang/String;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v13, Ljava/lang/Integer;

    const/4 v15, 0x2

    const/4 v5, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v5, :cond_4

    if-eq v4, v15, :cond_3

    const/4 v15, 0x3

    if-ne v4, v15, :cond_2

    iget v4, v2, Lix0/b$d;->x:I

    iget v15, v2, Lix0/b$d;->w:I

    iget-object v5, v2, Lix0/b$d;->F:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lix0/b$d;->E:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v5, v4

    move-object/from16 v18, v6

    move-object/from16 v21, v7

    move-object/from16 v19, v13

    move v14, v15

    const/4 v1, 0x2

    const/4 v13, 0x0

    move-object v4, v0

    const/4 v0, 0x3

    :cond_1
    const/16 v16, 0x1

    goto/16 :goto_b

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget v4, v2, Lix0/b$d;->z:I

    iget v5, v2, Lix0/b$d;->y:I

    iget v15, v2, Lix0/b$d;->x:I

    iget v14, v2, Lix0/b$d;->w:I

    move-object/from16 v17, v1

    iget-object v1, v2, Lix0/b$d;->F:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v2, Lix0/b$d;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v18, v4

    move-object v4, v0

    move/from16 v0, v18

    move-object/from16 v18, v6

    move-object/from16 v21, v7

    move-object/from16 v19, v13

    move v6, v5

    move v5, v15

    move-object v15, v1

    const/4 v1, 0x2

    goto/16 :goto_9

    :cond_4
    move-object/from16 v17, v1

    iget v1, v2, Lix0/b$d;->z:I

    iget v4, v2, Lix0/b$d;->y:I

    iget v5, v2, Lix0/b$d;->x:I

    iget v14, v2, Lix0/b$d;->w:I

    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V

    move v0, v1

    move-object/from16 v18, v6

    move-object/from16 v19, v13

    move-object/from16 v1, v17

    move v6, v4

    const/4 v4, 0x0

    goto/16 :goto_6

    :cond_5
    move-object/from16 v17, v1

    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lix0/b;->c:Ljs0/c;

    sget-object v4, Lix0/b$a$a;->a:Lix0/b$a$a;

    invoke-virtual {v1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v1

    invoke-virtual {v4}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v14, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v14, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    move-object/from16 v17, v2

    invoke-virtual {v14, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    :cond_6
    const/4 v1, 0x0

    goto/16 :goto_1

    :cond_7
    invoke-virtual {v14, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_8
    invoke-virtual {v14, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    goto :goto_1

    :cond_9
    invoke-virtual {v14, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_a
    invoke-virtual {v14, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_b
    invoke-virtual {v14, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_c
    move-object v1, v4

    :goto_1
    if-nez v1, :cond_d

    goto :goto_2

    :cond_d
    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_1e

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v1

    move v14, v1

    move-object/from16 v2, v17

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v14, :cond_1d

    iget-object v1, v0, Lix0/b;->a:Leu0/a;

    iget-object v4, v0, Lix0/b;->c:Ljs0/c;

    sget-object v15, Lix0/b$a$b;->a:Lix0/b$a$b;

    invoke-virtual {v4}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v4

    move-object/from16 v17, v15

    invoke-virtual/range {v17 .. v17}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {v17 .. v17}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v6

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    move-object/from16 v19, v13

    invoke-virtual {v6, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-virtual {v4, v15}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_4

    :cond_e
    const/4 v0, 0x0

    goto/16 :goto_4

    :cond_f
    invoke-virtual {v6, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-virtual {v4, v15}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_4

    :cond_10
    invoke-virtual {v6, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    invoke-virtual {v4, v15}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    goto :goto_4

    :cond_11
    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-virtual {v4, v15}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    goto :goto_4

    :cond_12
    invoke-virtual {v6, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-virtual {v4, v15}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_4

    :cond_13
    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {v4, v15}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_4

    :cond_14
    move-object/from16 v0, v17

    :goto_4
    if-nez v0, :cond_15

    goto :goto_5

    :cond_15
    move-object/from16 v17, v0

    :goto_5
    if-eqz v17, :cond_1c

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v4, 0x0

    iput-object v4, v2, Lix0/b$d;->E:Ljava/lang/Object;

    iput-object v4, v2, Lix0/b$d;->F:Ljava/lang/Object;

    iput v14, v2, Lix0/b$d;->w:I

    iput v5, v2, Lix0/b$d;->x:I

    iput v5, v2, Lix0/b$d;->y:I

    const/4 v4, 0x0

    iput v4, v2, Lix0/b$d;->z:I

    const/4 v6, 0x1

    iput v6, v2, Lix0/b$d;->I:I

    invoke-interface {v1, v0, v2}, Leu0/a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_16

    move-object/from16 v4, p0

    goto/16 :goto_a

    :cond_16
    move v0, v4

    move v6, v5

    :goto_6
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_17

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v0

    return-object v0

    :cond_17
    move-object v13, v1

    check-cast v13, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_19

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v17, v4

    check-cast v17, Lgu0/a;

    move-object/from16 v20, v1

    invoke-virtual/range {v17 .. v17}, Lgu0/a;->b()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    move-result-object v1

    invoke-static/range {v20 .. v20}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lgu0/a;

    move-object/from16 v21, v7

    invoke-virtual/range {v17 .. v17}, Lgu0/a;->b()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_8

    :cond_18
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v20

    move-object/from16 v7, v21

    const/4 v4, 0x0

    goto :goto_7

    :cond_19
    move-object/from16 v21, v7

    :goto_8
    iput-object v15, v2, Lix0/b$d;->E:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v2, Lix0/b$d;->F:Ljava/lang/Object;

    iput v14, v2, Lix0/b$d;->w:I

    iput v5, v2, Lix0/b$d;->x:I

    iput v6, v2, Lix0/b$d;->y:I

    iput v0, v2, Lix0/b$d;->z:I

    const/4 v1, 0x2

    iput v1, v2, Lix0/b$d;->I:I

    move-object/from16 v4, p0

    invoke-direct {v4, v15, v2}, Lix0/b;->d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_1a

    goto :goto_a

    :cond_1a
    move-object/from16 v17, v7

    :goto_9
    check-cast v17, Ljava/lang/Boolean;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_1b

    new-instance v0, Lic/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_1b
    iget-object v7, v4, Lix0/b;->a:Leu0/a;

    const/4 v13, 0x0

    iput-object v13, v2, Lix0/b$d;->E:Ljava/lang/Object;

    iput-object v13, v2, Lix0/b$d;->F:Ljava/lang/Object;

    iput v14, v2, Lix0/b$d;->w:I

    iput v5, v2, Lix0/b$d;->x:I

    iput v6, v2, Lix0/b$d;->y:I

    iput v0, v2, Lix0/b$d;->z:I

    const/4 v0, 0x3

    iput v0, v2, Lix0/b$d;->I:I

    invoke-interface {v7, v15, v2}, Leu0/a;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_1

    :goto_a
    return-object v3

    :goto_b
    add-int/lit8 v5, v5, 0x1

    move-object v0, v4

    move-object/from16 v6, v18

    move-object/from16 v13, v19

    move-object/from16 v7, v21

    goto/16 :goto_3

    :cond_1c
    move-object/from16 v4, p0

    new-instance v0, Ljava/lang/NullPointerException;

    move-object/from16 v1, v18

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    move-object v4, v0

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v0

    return-object v0

    :cond_1e
    move-object v4, v0

    move-object v1, v6

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
