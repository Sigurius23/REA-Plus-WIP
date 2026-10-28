.class public final Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$$serializer;,
        Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0087\u0008\u0018\u0000 \\2\u00020\u0001:\u0002]\\B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001bJ\u009a\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010=\u0012\u0004\u0008B\u0010@\u001a\u0004\u0008A\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010=\u0012\u0004\u0008D\u0010@\u001a\u0004\u0008C\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010=\u0012\u0004\u0008F\u0010@\u001a\u0004\u0008E\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010=\u0012\u0004\u0008H\u0010@\u001a\u0004\u0008G\u0010\u001bR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010=\u0012\u0004\u0008J\u0010@\u001a\u0004\u0008I\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010=\u0012\u0004\u0008L\u0010@\u001a\u0004\u0008K\u0010\u001bR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010=\u0012\u0004\u0008N\u0010@\u001a\u0004\u0008M\u0010\u001bR \u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010O\u0012\u0004\u0008Q\u0010@\u001a\u0004\u0008P\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010R\u0012\u0004\u0008T\u0010@\u001a\u0004\u0008S\u0010&R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010U\u0012\u0004\u0008W\u0010@\u001a\u0004\u0008V\u0010(R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010U\u0012\u0004\u0008Y\u0010@\u001a\u0004\u0008X\u0010(R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010=\u0012\u0004\u0008[\u0010@\u001a\u0004\u0008Z\u0010\u001b\u00a8\u0006^"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;",
        "",
        "",
        "email",
        "username",
        "firstName",
        "lastName",
        "country",
        "state",
        "city",
        "birthday",
        "Lcom/whoop/profile/domain/models/Gender;",
        "gender",
        "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "physiologicalBaseline",
        "",
        "height",
        "weight",
        "unitSystem",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/profile/domain/models/Gender;",
        "component10",
        "()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "component11",
        "()F",
        "component12",
        "component13",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;",
        "toString",
        "hashCode",
        "()I",
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
        "write$Self$profile_release",
        "(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getEmail",
        "getEmail$annotations",
        "()V",
        "getUsername",
        "getUsername$annotations",
        "getFirstName",
        "getFirstName$annotations",
        "getLastName",
        "getLastName$annotations",
        "getCountry",
        "getCountry$annotations",
        "getState",
        "getState$annotations",
        "getCity",
        "getCity$annotations",
        "getBirthday",
        "getBirthday$annotations",
        "Lcom/whoop/profile/domain/models/Gender;",
        "getGender",
        "getGender$annotations",
        "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "getPhysiologicalBaseline",
        "getPhysiologicalBaseline$annotations",
        "F",
        "getHeight",
        "getHeight$annotations",
        "getWeight",
        "getWeight$annotations",
        "getUnitSystem",
        "getUnitSystem$annotations",
        "Companion",
        "$serializer",
        "profile_release"
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

.field public static final Companion:Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$Companion;


# instance fields
.field private final birthday:Ljava/lang/String;

.field private final city:Ljava/lang/String;

.field private final country:Ljava/lang/String;

.field private final email:Ljava/lang/String;

.field private final firstName:Ljava/lang/String;

.field private final gender:Lcom/whoop/profile/domain/models/Gender;

.field private final height:F

.field private final lastName:Ljava/lang/String;

.field private final physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

.field private final state:Ljava/lang/String;

.field private final unitSystem:Ljava/lang/String;

.field private final username:Ljava/lang/String;

.field private final weight:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->Companion:Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqv1/e;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lqv1/e;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lqv1/e;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lqv1/e;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v3, 0xd

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    const/16 v4, 0x8

    aput-object v2, v3, v4

    const/16 v2, 0x9

    aput-object v0, v3, v2

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1d9f

    const/16 v1, 0x1d9f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$$serializer;->INSTANCE:Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$$serializer;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    :goto_1
    iput-object p9, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    goto :goto_2

    :cond_3
    iput-object p11, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    :goto_2
    iput p12, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    iput p13, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)V
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birthday"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    .line 12
    iput-object p10, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    .line 13
    iput p11, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    .line 14
    iput p12, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    .line 15
    iput-object p13, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_2

    move-object v13, v2

    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move/from16 v14, p11

    move/from16 v15, p12

    move-object/from16 v16, p13

    goto :goto_3

    :cond_2
    move-object/from16 v13, p10

    goto :goto_2

    .line 16
    :goto_3
    invoke-direct/range {v3 .. v16}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->Companion:Lcom/whoop/profile/domain/models/Gender$Companion;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/Gender$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->Companion:Lcom/whoop/profile/domain/models/PhysiologicalBaseline$Companion;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget v10, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    goto :goto_9

    :cond_a
    move/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget v11, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    goto :goto_a

    :cond_b
    move/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move/from16 p13, v10

    move/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBirthday$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "birthday"
    .end annotation

    return-void
.end method

.method public static synthetic getCity$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "city"
    .end annotation

    return-void
.end method

.method public static synthetic getCountry$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "country"
    .end annotation

    return-void
.end method

.method public static synthetic getEmail$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "email"
    .end annotation

    return-void
.end method

.method public static synthetic getFirstName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "first_name"
    .end annotation

    return-void
.end method

.method public static synthetic getGender$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gender"
    .end annotation

    return-void
.end method

.method public static synthetic getHeight$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "height"
    .end annotation

    return-void
.end method

.method public static synthetic getLastName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_name"
    .end annotation

    return-void
.end method

.method public static synthetic getPhysiologicalBaseline$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "physiological_baseline"
    .end annotation

    return-void
.end method

.method public static synthetic getState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "state"
    .end annotation

    return-void
.end method

.method public static synthetic getUnitSystem$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "unit_system"
    .end annotation

    return-void
.end method

.method public static synthetic getUsername$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "username"
    .end annotation

    return-void
.end method

.method public static synthetic getWeight$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$profile_release(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    if-eqz v3, :cond_3

    :goto_1
    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xa

    iget v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v0, 0xb

    iget v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v0, 0xc

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    return-object v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    return v0
.end method

.method public final component12()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/profile/domain/models/Gender;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;
    .locals 15

    const-string v0, "email"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birthday"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    move-object/from16 v3, p2

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v14}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getBirthday()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public final getCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final getGender()Lcom/whoop/profile/domain/models/Gender;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    return-object v0
.end method

.method public final getHeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    return v0
.end method

.method public final getLastName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPhysiologicalBaseline()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    return-object v0
.end method

.method public final getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitSystem()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->email:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->username:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->firstName:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->lastName:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->country:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->state:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->city:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->birthday:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->gender:Lcom/whoop/profile/domain/models/Gender;

    iget-object v10, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    iget v11, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->height:F

    iget v12, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->weight:F

    iget-object v13, v0, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->unitSystem:Ljava/lang/String;

    const-string v14, ", username="

    const-string v15, ", firstName="

    const-string v0, "UpdateProfileRequest(email="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastName="

    const-string v2, ", country="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", state="

    const-string v2, ", city="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", birthday="

    const-string v2, ", gender="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", physiologicalBaseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    const-string v2, ", unitSystem="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v13, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
