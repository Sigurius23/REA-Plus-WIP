.class public final Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$$serializer;,
        Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBU\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 JL\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010 J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00080\u0010 \u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "",
        "",
        "strapId",
        "strapGenCodeName",
        "hardwareVersion",
        "maximVersion",
        "dspVersion",
        "",
        "binaryVersion",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$connectivity_data_packets_model_release",
        "(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()I",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStrapId",
        "getStrapGenCodeName",
        "getHardwareVersion",
        "getMaximVersion",
        "getDspVersion",
        "I",
        "getBinaryVersion",
        "Companion",
        "$serializer",
        "a",
        "connectivity-data-packets-model_release"
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
.field public static final Companion:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;


# instance fields
.field private final binaryVersion:I

.field private final dspVersion:Ljava/lang/String;

.field private final hardwareVersion:Ljava/lang/String;

.field private final maximVersion:Ljava/lang/String;

.field private final strapGenCodeName:Ljava/lang/String;

.field private final strapId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->Companion:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$$serializer;->INSTANCE:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$$serializer;

    invoke-virtual {p8}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    iput p7, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "strapId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapGenCodeName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maximVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dspVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$connectivity_data_packets_model_release(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget p0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;
    .locals 8

    const-string v0, "strapId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapGenCodeName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maximVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dspVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    iget p1, p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBinaryVersion()I
    .locals 1

    iget v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    return v0
.end method

.method public final getDspVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getHardwareVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaximVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getStrapGenCodeName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    return-object v0
.end method

.method public final getStrapId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->strapGenCodeName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hardwareVersion:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->maximVersion:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->dspVersion:Ljava/lang/String;

    iget v5, p0, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->binaryVersion:I

    const-string v6, ", strapGenCodeName="

    const-string v7, ", hardwareVersion="

    const-string v8, "ConsolePacketsMetadata(strapId="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maximVersion="

    const-string v6, ", dspVersion="

    invoke-static {v0, v2, v1, v3, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", binaryVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
