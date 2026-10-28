.class public final Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$$serializer;,
        Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DEBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u007f\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J~\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00088\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00089\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u0008:\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u0008;\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008=\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008>\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u0008?\u0010\u0017R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010<\u001a\u0004\u0008@\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010\"\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "titleSuffix",
        "subtitle",
        "subtitleSuffix",
        "leadingIcon",
        "Ly81/f;",
        "leadingIconColor",
        "subtitleColor",
        "trailingIcon",
        "trailingIconColor",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ly81/f;",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitleSuffix",
        "getSubtitle",
        "getSubtitleSuffix",
        "getLeadingIcon",
        "Ly81/f;",
        "getLeadingIconColor",
        "getSubtitleColor",
        "getTrailingIcon",
        "getTrailingIconColor",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getGenericInteraction",
        "Companion",
        "$serializer",
        "a",
        "weightlifting_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$a;


# instance fields
.field private final genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final leadingIcon:Ljava/lang/String;

.field private final leadingIconColor:Ly81/f;

.field private final subtitle:Ljava/lang/String;

.field private final subtitleColor:Ly81/f;

.field private final subtitleSuffix:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleSuffix:Ljava/lang/String;

.field private final trailingIcon:Ljava/lang/String;

.field private final trailingIconColor:Ly81/f;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->Companion:Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$a;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lat2/k;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lat2/k;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lat2/k;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lat2/k;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lat2/k;

    const/16 v7, 0xa

    invoke-direct {v6, v7}, Lat2/k;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v6, v7, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v7, 0x2

    aput-object v1, v6, v7

    const/4 v7, 0x3

    aput-object v1, v6, v7

    const/4 v7, 0x4

    aput-object v1, v6, v7

    const/4 v7, 0x5

    aput-object v2, v6, v7

    const/4 v2, 0x6

    aput-object v4, v6, v2

    const/4 v2, 0x7

    aput-object v1, v6, v2

    aput-object v0, v6, v3

    aput-object v1, v6, v5

    sput-object v6, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    :goto_1
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p9, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    goto :goto_3

    :cond_4
    iput-object p10, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    :goto_3
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void

    :cond_5
    iput-object p11, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleSuffix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleSuffix"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingIcon"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    .line 12
    iput-object p10, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x20

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_2

    move-object p8, v0

    :cond_2
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_3

    move-object p9, v0

    :cond_3
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_4

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    return-object v0
.end method

.method public final component7()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;
    .locals 12

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleSuffix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleSuffix"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingIcon"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getLeadingIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeadingIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    return-object v0
.end method

.method public final getSubtitleSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->titleSuffix:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleSuffix:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIcon:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->leadingIconColor:Ly81/f;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->subtitleColor:Ly81/f;

    iget-object v7, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIcon:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->trailingIconColor:Ly81/f;

    iget-object v9, p0, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v10, ", titleSuffix="

    const-string v11, ", subtitle="

    const-string v12, "MeasurementEntryItemModel(title="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitleSuffix="

    const-string v10, ", leadingIcon="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", leadingIconColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingIconColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", genericInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
