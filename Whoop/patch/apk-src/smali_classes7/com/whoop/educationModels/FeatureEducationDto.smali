.class public final Lcom/whoop/educationModels/FeatureEducationDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/FeatureEducationDto$$serializer;,
        Lcom/whoop/educationModels/FeatureEducationDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0087\u0008\u0018\u0000 ^2\u00020\u0001:\u0002_^Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0010\u0010(\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u008c\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010#J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\u001dJ\u001a\u00104\u001a\u00020\u000f2\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105J\'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001\u00a2\u0006\u0004\u0008<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010?\u0012\u0004\u0008A\u0010B\u001a\u0004\u0008@\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010C\u0012\u0004\u0008E\u0010B\u001a\u0004\u0008D\u0010\u001fR&\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010F\u0012\u0004\u0008H\u0010B\u001a\u0004\u0008G\u0010!R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010I\u0012\u0004\u0008K\u0010B\u001a\u0004\u0008J\u0010#R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010I\u0012\u0004\u0008M\u0010B\u001a\u0004\u0008L\u0010#R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010N\u0012\u0004\u0008P\u0010B\u001a\u0004\u0008O\u0010&R \u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010I\u0012\u0004\u0008R\u0010B\u001a\u0004\u0008Q\u0010#R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010S\u0012\u0004\u0008U\u0010B\u001a\u0004\u0008T\u0010)R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010S\u0012\u0004\u0008W\u0010B\u001a\u0004\u0008V\u0010)R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010X\u0012\u0004\u0008Z\u0010B\u001a\u0004\u0008Y\u0010,R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010[\u0012\u0004\u0008]\u0010B\u001a\u0004\u0008\\\u0010.\u00a8\u0006`"
    }
    d2 = {
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "",
        "",
        "storyId",
        "Lcom/whoop/educationModels/NavBarDto;",
        "navBar",
        "",
        "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
        "screens",
        "",
        "createdAt",
        "updatedAt",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "type",
        "feature",
        "",
        "enabled",
        "deleted",
        "Lcom/whoop/educationModels/MediaHeader;",
        "mediaHeader",
        "Lcom/whoop/educationModels/StickyButton;",
        "stickyButton",
        "<init>",
        "(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Lcom/whoop/educationModels/NavBarDto;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "()Lcom/whoop/data/onboarding/FeatureEducationType;",
        "component7",
        "component8",
        "()Z",
        "component9",
        "component10",
        "()Lcom/whoop/educationModels/MediaHeader;",
        "component11",
        "()Lcom/whoop/educationModels/StickyButton;",
        "copy",
        "(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)Lcom/whoop/educationModels/FeatureEducationDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$education_models_release",
        "(Lcom/whoop/educationModels/FeatureEducationDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getStoryId",
        "getStoryId$annotations",
        "()V",
        "Lcom/whoop/educationModels/NavBarDto;",
        "getNavBar",
        "getNavBar$annotations",
        "Ljava/util/List;",
        "getScreens",
        "getScreens$annotations",
        "Ljava/lang/String;",
        "getCreatedAt",
        "getCreatedAt$annotations",
        "getUpdatedAt",
        "getUpdatedAt$annotations",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "getType",
        "getType$annotations",
        "getFeature",
        "getFeature$annotations",
        "Z",
        "getEnabled",
        "getEnabled$annotations",
        "getDeleted",
        "getDeleted$annotations",
        "Lcom/whoop/educationModels/MediaHeader;",
        "getMediaHeader",
        "getMediaHeader$annotations",
        "Lcom/whoop/educationModels/StickyButton;",
        "getStickyButton",
        "getStickyButton$annotations",
        "Companion",
        "$serializer",
        "education-models_release"
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

.field public static final Companion:Lcom/whoop/educationModels/FeatureEducationDto$Companion;


# instance fields
.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final enabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabled"
    .end annotation
.end field

.field private final feature:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "feature"
    .end annotation
.end field

.field private final mediaHeader:Lcom/whoop/educationModels/MediaHeader;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "media_header"
    .end annotation
.end field

.field private final navBar:Lcom/whoop/educationModels/NavBarDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "navigation_bar"
    .end annotation
.end field

.field private final screens:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screens"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
            ">;"
        }
    .end annotation
.end field

.field private final stickyButton:Lcom/whoop/educationModels/StickyButton;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sticky_button"
    .end annotation
.end field

.field private final storyId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final type:Lcom/whoop/data/onboarding/FeatureEducationType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/educationModels/FeatureEducationDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/educationModels/FeatureEducationDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/educationModels/FeatureEducationDto;->Companion:Lcom/whoop/educationModels/FeatureEducationDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/educationModels/FeatureEducationDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lve/a;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lve/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lve/a;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Lve/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xb

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v3, v5, v7

    const/4 v3, 0x3

    aput-object v1, v5, v3

    aput-object v1, v5, v4

    aput-object v2, v5, v6

    const/4 v2, 0x6

    aput-object v1, v5, v2

    const/4 v2, 0x7

    aput-object v1, v5, v2

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/educationModels/FeatureEducationDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7df

    const/16 v0, 0x7df

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/educationModels/FeatureEducationDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationDto$$serializer;

    invoke-virtual {p13}, Lcom/whoop/educationModels/FeatureEducationDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    iput-object p3, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    iput-object p4, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    :goto_0
    iput-object p8, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    iput-boolean p10, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    iput-object p11, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    iput-object p12, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    return-void
.end method

.method public constructor <init>(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/educationModels/NavBarDto;",
            "Ljava/util/List<",
            "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Ljava/lang/String;",
            "ZZ",
            "Lcom/whoop/educationModels/MediaHeader;",
            "Lcom/whoop/educationModels/StickyButton;",
            ")V"
        }
    .end annotation

    const-string v0, "screens"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feature"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    .line 5
    iput-object p3, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    .line 9
    iput-object p7, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    .line 11
    iput-boolean p9, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    .line 12
    iput-object p10, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    .line 13
    iput-object p11, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p12, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v7, v0

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    goto :goto_1

    :cond_0
    move-object/from16 v7, p6

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {v1 .. v12}, Lcom/whoop/educationModels/FeatureEducationDto;-><init>(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationScreenDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.data.onboarding.FeatureEducationType"

    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/educationModels/FeatureEducationDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/educationModels/FeatureEducationDto;ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;ILjava/lang/Object;)Lcom/whoop/educationModels/FeatureEducationDto;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-boolean p8, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-boolean p9, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/educationModels/FeatureEducationDto;->copy(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCreatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "created_at"
    .end annotation

    return-void
.end method

.method public static synthetic getDeleted$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "deleted"
    .end annotation

    return-void
.end method

.method public static synthetic getEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getFeature$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "feature"
    .end annotation

    return-void
.end method

.method public static synthetic getMediaHeader$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "media_header"
    .end annotation

    return-void
.end method

.method public static synthetic getNavBar$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "navigation_bar"
    .end annotation

    return-void
.end method

.method public static synthetic getScreens$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "screens"
    .end annotation

    return-void
.end method

.method public static synthetic getStickyButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sticky_button"
    .end annotation

    return-void
.end method

.method public static synthetic getStoryId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "name"
    .end annotation

    return-void
.end method

.method public static synthetic getUpdatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "updated_at"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$education_models_release(Lcom/whoop/educationModels/FeatureEducationDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/educationModels/FeatureEducationDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lcom/whoop/educationModels/NavBarDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/NavBarDto$$serializer;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x8

    iget-boolean v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/educationModels/MediaHeader$$serializer;->INSTANCE:Lcom/whoop/educationModels/MediaHeader$$serializer;

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    const/16 v2, 0x9

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/educationModels/StickyButton$$serializer;->INSTANCE:Lcom/whoop/educationModels/StickyButton$$serializer;

    iget-object p0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    return v0
.end method

.method public final component10()Lcom/whoop/educationModels/MediaHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    return-object v0
.end method

.method public final component11()Lcom/whoop/educationModels/StickyButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    return-object v0
.end method

.method public final component2()Lcom/whoop/educationModels/NavBarDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/data/onboarding/FeatureEducationType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    return v0
.end method

.method public final copy(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)Lcom/whoop/educationModels/FeatureEducationDto;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/educationModels/NavBarDto;",
            "Ljava/util/List<",
            "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Ljava/lang/String;",
            "ZZ",
            "Lcom/whoop/educationModels/MediaHeader;",
            "Lcom/whoop/educationModels/StickyButton;",
            ")",
            "Lcom/whoop/educationModels/FeatureEducationDto;"
        }
    .end annotation

    const-string v0, "screens"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feature"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/educationModels/FeatureEducationDto;

    move v2, p1

    move-object v3, p2

    move-object/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/educationModels/FeatureEducationDto;-><init>(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/educationModels/FeatureEducationDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/educationModels/FeatureEducationDto;

    iget v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    iget v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    iget-boolean v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    iget-object p1, p1, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    return v0
.end method

.method public final getFeature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    return-object v0
.end method

.method public final getMediaHeader()Lcom/whoop/educationModels/MediaHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    return-object v0
.end method

.method public final getNavBar()Lcom/whoop/educationModels/NavBarDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    return-object v0
.end method

.method public final getScreens()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    return-object v0
.end method

.method public final getStickyButton()Lcom/whoop/educationModels/StickyButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    return-object v0
.end method

.method public final getStoryId()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    return v0
.end method

.method public final getType()Lcom/whoop/data/onboarding/FeatureEducationType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/educationModels/NavBarDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/educationModels/MediaHeader;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/educationModels/StickyButton;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationDto;->storyId:I

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationDto;->navBar:Lcom/whoop/educationModels/NavBarDto;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationDto;->screens:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/educationModels/FeatureEducationDto;->createdAt:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/educationModels/FeatureEducationDto;->updatedAt:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/educationModels/FeatureEducationDto;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    iget-object v6, p0, Lcom/whoop/educationModels/FeatureEducationDto;->feature:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/whoop/educationModels/FeatureEducationDto;->enabled:Z

    iget-boolean v8, p0, Lcom/whoop/educationModels/FeatureEducationDto;->deleted:Z

    iget-object v9, p0, Lcom/whoop/educationModels/FeatureEducationDto;->mediaHeader:Lcom/whoop/educationModels/MediaHeader;

    iget-object v10, p0, Lcom/whoop/educationModels/FeatureEducationDto;->stickyButton:Lcom/whoop/educationModels/StickyButton;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "FeatureEducationDto(storyId="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", navBar="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", screens="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    const-string v1, ", updatedAt="

    invoke-static {v0, v3, v1, v11, v2}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", feature="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    const-string v1, ", deleted="

    invoke-static {v11, v6, v0, v7, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mediaHeader="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stickyButton="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
