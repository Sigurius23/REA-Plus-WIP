.class public final Lcom/whoop/navigation/StrengthTrainerScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/StrengthTrainerScreenModel$$serializer;,
        Lcom/whoop/navigation/StrengthTrainerScreenModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:BM\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBU\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JV\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020\u00082\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00083\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u0008\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u0010%\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/navigation/StrengthTrainerScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "",
        "startingId",
        "",
        "linkActivityId",
        "entryPoint",
        "openTab",
        "",
        "isFromWhoopCoach",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/StrengthTrainerScreenModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Long;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Z",
        "component6",
        "()Lcom/whoop/navigation/AiAction;",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/StrengthTrainerScreenModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Long;",
        "getStartingId",
        "Ljava/lang/String;",
        "getLinkActivityId",
        "getEntryPoint",
        "getOpenTab",
        "Z",
        "Lcom/whoop/navigation/AiAction;",
        "getAiAction",
        "Companion",
        "$serializer",
        "a",
        "navigation_release"
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

.field public static final Companion:Lcom/whoop/navigation/StrengthTrainerScreenModel$a;


# instance fields
.field private final aiAction:Lcom/whoop/navigation/AiAction;

.field private final entryPoint:Ljava/lang/String;

.field private final isFromWhoopCoach:Z

.field private final linkActivityId:Ljava/lang/String;

.field private final openTab:Ljava/lang/String;

.field private final startingId:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/StrengthTrainerScreenModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->Companion:Lcom/whoop/navigation/StrengthTrainerScreenModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/navigation/StrengthTrainerScreenModel;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    const/4 v0, 0x0

    if-nez p8, :cond_0

    iput-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    goto :goto_4

    :cond_4
    iput-boolean p6, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    :goto_4
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    iput-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-void

    :cond_5
    iput-object p7, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    .line 5
    iput-object p2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    .line 8
    iput-boolean p5, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    .line 9
    iput-object p6, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/4 p5, 0x0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move-object p7, v0

    :goto_0
    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p7, p6

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/whoop/navigation/StrengthTrainerScreenModel;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/StrengthTrainerScreenModel;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/StrengthTrainerScreenModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->copy(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/StrengthTrainerScreenModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/StrengthTrainerScreenModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    if-eqz v1, :cond_9

    :goto_4
    iget-boolean v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/navigation/AiAction$$serializer;->INSTANCE:Lcom/whoop/navigation/AiAction$$serializer;

    iget-object p0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    return v0
.end method

.method public final component6()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/StrengthTrainerScreenModel;
    .locals 7

    new-instance v0, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/whoop/navigation/StrengthTrainerScreenModel;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object p1, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAiAction()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final getEntryPoint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkActivityId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOpenTab()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartingId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final isFromWhoopCoach()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->startingId:Ljava/lang/Long;

    iget-object v1, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->linkActivityId:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->entryPoint:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->openTab:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach:Z

    iget-object v5, p0, Lcom/whoop/navigation/StrengthTrainerScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "StrengthTrainerScreenModel(startingId="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", linkActivityId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", entryPoint="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", openTab="

    const-string v1, ", isFromWhoopCoach="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", aiAction="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
