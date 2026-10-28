.class public final Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u001f\u001a\u00020\n2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010!\u001a\u00020\"H\u00d6\u0081\u0004J\n\u0010#\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;",
        "",
        "id",
        "",
        "trailingTimestamp",
        "",
        "title",
        "Lcom/whoop/design/util/TextResource;",
        "description",
        "alertState",
        "",
        "icon",
        "<init>",
        "(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getTrailingTimestamp",
        "()J",
        "getTitle",
        "()Lcom/whoop/design/util/TextResource;",
        "getDescription",
        "getAlertState",
        "()Z",
        "getIcon",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "labrador_release"
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
.field public static final $stable:I


# instance fields
.field private final alertState:Z

.field private final description:Lcom/whoop/design/util/TextResource;

.field private final icon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final trailingTimestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;-><init>(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    .line 5
    iput-object p4, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-boolean p6, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    .line 8
    iput-object p7, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 9
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 10
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p4

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    .line 11
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p5

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    const/4 p6, 0x0

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    move-object p8, v0

    :goto_0
    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-wide p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p8, p7

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;-><init>(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-wide p2, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p4, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p5, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p6, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    :cond_5
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->copy(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    return-wide v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;-><init>(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;

    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    iget-wide v5, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    iget-boolean v3, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAlertState()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    return v0
.end method

.method public final getDescription()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTrailingTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->id:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->trailingTimestamp:J

    iget-object v3, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->description:Lcom/whoop/design/util/TextResource;

    iget-boolean v5, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->alertState:Z

    iget-object v6, p0, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->icon:Ljava/lang/String;

    const-string v7, "LabradorPaginatedResultModel(id="

    const-string v8, ", trailingTimestamp="

    invoke-static {v7, v0, v1, v2, v8}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alertState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
