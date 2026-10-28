.class public final Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$$serializer;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBU\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JL\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010(\u001a\u00020\u00082\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010*\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010*\u0012\u0004\u00081\u0010/\u001a\u0004\u00080\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010*\u0012\u0004\u00083\u0010/\u001a\u0004\u00082\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u0008\t\u0010!\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;",
        "",
        "",
        "title",
        "description",
        "currentBarCopy",
        "weeklyIncreaseCopy",
        "targetBarCopy",
        "",
        "isOptimal",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getDescription",
        "getCurrentBarCopy",
        "getCurrentBarCopy$annotations",
        "()V",
        "getWeeklyIncreaseCopy",
        "getWeeklyIncreaseCopy$annotations",
        "getTargetBarCopy",
        "getTargetBarCopy$annotations",
        "Z",
        "Companion",
        "$serializer",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$Companion;


# instance fields
.field private final currentBarCopy:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final isOptimal:Z

.field private final targetBarCopy:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final weeklyIncreaseCopy:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$$serializer;

    invoke-virtual {p8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentBarCopy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weeklyIncreaseCopy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetBarCopy"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCurrentBarCopy$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "current_bar"
    .end annotation

    return-void
.end method

.method public static synthetic getTargetBarCopy$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "target_bar"
    .end annotation

    return-void
.end method

.method public static synthetic getWeeklyIncreaseCopy$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weekly_increase"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-boolean p0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentBarCopy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weeklyIncreaseCopy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetBarCopy"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    iget-boolean p1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCurrentBarCopy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getTargetBarCopy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeeklyIncreaseCopy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isOptimal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->description:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->currentBarCopy:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->weeklyIncreaseCopy:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->targetBarCopy:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;->isOptimal:Z

    const-string v6, ", description="

    const-string v7, ", currentBarCopy="

    const-string v8, "ProgressionToolTipV2(title="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weeklyIncreaseCopy="

    const-string v6, ", targetBarCopy="

    invoke-static {v0, v2, v1, v3, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isOptimal="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
