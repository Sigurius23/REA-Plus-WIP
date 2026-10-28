.class public final Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$$serializer;,
        Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0087\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J~\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020\u000e2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008;\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008<\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008=\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008>\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008?\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00109\u001a\u0004\u0008@\u0010\u001aR\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008A\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00109\u001a\u0004\u0008B\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008\u000f\u0010$\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;",
        "styleValues",
        "",
        "ageValueDisplay",
        "ageTitleDisplay",
        "ageSubtitleDisplay",
        "ageSubtitleStyle",
        "yearsDifferenceValueDisplay",
        "yearsDifferenceValueStyle",
        "yearsDifferenceSubtitleDisplay",
        "paceOfAgingDisplay",
        "paceOfAgingSubtitleDisplay",
        "",
        "isCalibrating",
        "<init>",
        "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Z",
        "copy",
        "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;",
        "getStyleValues",
        "Ljava/lang/String;",
        "getAgeValueDisplay",
        "getAgeTitleDisplay",
        "getAgeSubtitleDisplay",
        "getAgeSubtitleStyle",
        "getYearsDifferenceValueDisplay",
        "getYearsDifferenceValueStyle",
        "getYearsDifferenceSubtitleDisplay",
        "getPaceOfAgingDisplay",
        "getPaceOfAgingSubtitleDisplay",
        "Z",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$Companion;


# instance fields
.field private final ageSubtitleDisplay:Ljava/lang/String;

.field private final ageSubtitleStyle:Ljava/lang/String;

.field private final ageTitleDisplay:Ljava/lang/String;

.field private final ageValueDisplay:Ljava/lang/String;

.field private final isCalibrating:Z

.field private final paceOfAgingDisplay:Ljava/lang/String;

.field private final paceOfAgingSubtitleDisplay:Ljava/lang/String;

.field private final styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

.field private final yearsDifferenceSubtitleDisplay:Ljava/lang/String;

.field private final yearsDifferenceValueDisplay:Ljava/lang/String;

.field private final yearsDifferenceValueStyle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->Companion:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$$serializer;->INSTANCE:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    iput-object p3, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "styleValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageValueDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageSubtitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageSubtitleStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yearsDifferenceValueDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yearsDifferenceValueStyle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yearsDifferenceSubtitleDisplay"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paceOfAgingDisplay"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paceOfAgingSubtitleDisplay"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    .line 13
    iput-boolean p11, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-boolean p11, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    :cond_a
    move-object p12, p10

    move p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->copy(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues$$serializer;->INSTANCE:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xa

    iget-boolean p0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 13

    const-string v0, "styleValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageValueDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageTitleDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageSubtitleDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ageSubtitleStyle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yearsDifferenceValueDisplay"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yearsDifferenceValueStyle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yearsDifferenceSubtitleDisplay"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paceOfAgingDisplay"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paceOfAgingSubtitleDisplay"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-object v2, p1

    move-object v3, p2

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAgeSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAgeSubtitleStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getAgeTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAgeValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaceOfAgingDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaceOfAgingSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    return-object v0
.end method

.method public final getYearsDifferenceSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getYearsDifferenceValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getYearsDifferenceValueStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isCalibrating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->styleValues:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageValueDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageTitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->ageSubtitleStyle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceValueStyle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->yearsDifferenceSubtitleDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingDisplay:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->paceOfAgingSubtitleDisplay:Ljava/lang/String;

    iget-boolean v10, p0, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->isCalibrating:Z

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "WhoopAgeAmoeba(styleValues="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ageValueDisplay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ageTitleDisplay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ageSubtitleDisplay="

    const-string v1, ", ageSubtitleStyle="

    invoke-static {v11, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", yearsDifferenceValueDisplay="

    const-string v1, ", yearsDifferenceValueStyle="

    invoke-static {v11, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", yearsDifferenceSubtitleDisplay="

    const-string v1, ", paceOfAgingDisplay="

    invoke-static {v11, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", paceOfAgingSubtitleDisplay="

    const-string v1, ", isCalibrating="

    invoke-static {v11, v8, v0, v9, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
