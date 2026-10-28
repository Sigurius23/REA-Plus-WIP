.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBk\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001fJf\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u0010\u0010*\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00083\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00087\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00100\u001a\u0004\u00088\u0010\u001f\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
        "",
        "",
        "submittingTitle",
        "submittingSubtitle",
        "submittedTitle",
        "submittedSubtitle",
        "submittedErrorTitle",
        "submittedErrorSubtitle",
        "submittedErrorPositiveCta",
        "submittedErrorNegativeCta",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lvy2/c;",
        "toDomain",
        "()Lvy2/c;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSubmittingTitle",
        "getSubmittingSubtitle",
        "getSubmittedTitle",
        "getSubmittedSubtitle",
        "getSubmittedErrorTitle",
        "getSubmittedErrorSubtitle",
        "getSubmittedErrorPositiveCta",
        "getSubmittedErrorNegativeCta",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$Companion;


# instance fields
.field private final submittedErrorNegativeCta:Ljava/lang/String;

.field private final submittedErrorPositiveCta:Ljava/lang/String;

.field private final submittedErrorSubtitle:Ljava/lang/String;

.field private final submittedErrorTitle:Ljava/lang/String;

.field private final submittedSubtitle:Ljava/lang/String;

.field private final submittedTitle:Ljava/lang/String;

.field private final submittingSubtitle:Ljava/lang/String;

.field private final submittingTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "submittingTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedErrorTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedErrorPositiveCta"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedErrorNegativeCta"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;
    .locals 10

    const-string v0, "submittingTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedErrorTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedErrorPositiveCta"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedErrorNegativeCta"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getSubmittedErrorNegativeCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedErrorPositiveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedErrorSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedErrorTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittingSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittingTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toDomain()Lvy2/c;
    .locals 9

    new-instance v0, Lvy2/c;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    invoke-direct/range {v0 .. v8}, Lvy2/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittingSubtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedSubtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorSubtitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorPositiveCta:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->submittedErrorNegativeCta:Ljava/lang/String;

    const-string v8, ", submittingSubtitle="

    const-string v9, ", submittedTitle="

    const-string v10, "ScreeningConfigDto(submittingTitle="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", submittedSubtitle="

    const-string v8, ", submittedErrorTitle="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submittedErrorSubtitle="

    const-string v2, ", submittedErrorPositiveCta="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submittedErrorNegativeCta="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
