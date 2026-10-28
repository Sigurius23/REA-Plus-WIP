.class public final Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001f\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;",
        "header",
        "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;",
        "body",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;",
        "component4",
        "()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;",
        "getHeader",
        "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;",
        "getBody",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$Companion;


# instance fields
.field private final body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

.field private final header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

.field private final id:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->Companion:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBody()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->header:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;->body:Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;

    const-string v4, ", title="

    const-string v5, ", header="

    const-string v6, "ClinicalReportCardModel(id="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
