.class public final Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$$serializer;,
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 U2\u00020\u0001:\u0002VUB\u008b\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u00a3\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u00ae\u0001\u00100\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010 J\u0010\u00103\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010B\u001a\u0004\u0008C\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010D\u001a\u0004\u0008E\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010D\u001a\u0004\u0008F\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010D\u001a\u0004\u0008G\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010D\u001a\u0004\u0008H\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010D\u001a\u0004\u0008I\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010J\u001a\u0004\u0008K\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010L\u001a\u0004\u0008M\u0010(R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010N\u001a\u0004\u0008O\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010D\u001a\u0004\u0008P\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010D\u001a\u0004\u0008Q\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010D\u001a\u0004\u0008R\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010S\u001a\u0004\u0008T\u0010/\u00a8\u0006W"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
        "",
        "Lcom/whoop/navigation/e;",
        "action",
        "",
        "titleDisplay",
        "titleImage",
        "subtitleDisplay",
        "actionDisplay",
        "icon",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;",
        "style",
        "Lhy0/f;",
        "titleStyle",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "goalCards",
        "calloutDisplay",
        "calloutCtaDisplay",
        "id",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "secondaryButton",
        "<init>",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/navigation/e;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;",
        "component8",
        "()Lhy0/f;",
        "component9",
        "()Ljava/util/List;",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "copy",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
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
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/navigation/e;",
        "getAction",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "getTitleImage",
        "getSubtitleDisplay",
        "getActionDisplay",
        "getIcon",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;",
        "getStyle",
        "Lhy0/f;",
        "getTitleStyle",
        "Ljava/util/List;",
        "getGoalCards",
        "getCalloutDisplay",
        "getCalloutCtaDisplay",
        "getId",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "getSecondaryButton",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$Companion;


# instance fields
.field private final action:Lcom/whoop/navigation/e;

.field private final actionDisplay:Ljava/lang/String;

.field private final calloutCtaDisplay:Ljava/lang/String;

.field private final calloutDisplay:Ljava/lang/String;

.field private final goalCards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final icon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

.field private final style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

.field private final subtitleDisplay:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;

.field private final titleImage:Ljava/lang/String;

.field private final titleStyle:Lhy0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lur0/a;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lur0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lur0/a;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lur0/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lur0/a;

    const/16 v6, 0x17

    invoke-direct {v5, v6}, Lur0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lur0/a;

    const/16 v7, 0x18

    invoke-direct {v6, v7}, Lur0/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v6, 0xd

    new-array v6, v6, [Ll83/h;

    const/4 v7, 0x0

    aput-object v3, v6, v7

    const/4 v3, 0x1

    aput-object v1, v6, v3

    const/4 v3, 0x2

    aput-object v1, v6, v3

    const/4 v3, 0x3

    aput-object v1, v6, v3

    const/4 v3, 0x4

    aput-object v1, v6, v3

    const/4 v3, 0x5

    aput-object v1, v6, v3

    const/4 v3, 0x6

    aput-object v4, v6, v3

    const/4 v3, 0x7

    aput-object v5, v6, v3

    aput-object v2, v6, v0

    const/16 v0, 0x9

    aput-object v1, v6, v0

    const/16 v0, 0xa

    aput-object v1, v6, v0

    const/16 v0, 0xb

    aput-object v1, v6, v0

    const/16 v0, 0xc

    aput-object v1, v6, v0

    sput-object v6, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1fff

    const/16 v1, 0x1fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$$serializer;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    iput-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    iput-object p11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;",
            "Lhy0/f;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalCards"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    .line 10
    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    .line 11
    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;->Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.DividerTextPosition"

    invoke-static {}, Lhy0/f;->values()[Lhy0/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;ILjava/lang/Object;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

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

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->copy(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xb

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/16 v1, 0xc

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    return-object v0
.end method

.method public final component8()Lhy0/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;",
            "Lhy0/f;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;"
        }
    .end annotation

    const-string v0, "titleDisplay"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalCards"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object p1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAction()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getActionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalloutCtaDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalloutDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getGoalCards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleStyle()Lhy0/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->action:Lcom/whoop/navigation/e;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleImage:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->subtitleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->actionDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->icon:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->style:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;

    iget-object v7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->titleStyle:Lhy0/f;

    iget-object v8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->goalCards:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutDisplay:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->calloutCtaDisplay:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->id:Ljava/lang/String;

    iget-object v12, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "GoalSection(action="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleDisplay="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleImage="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitleDisplay="

    const-string v1, ", actionDisplay="

    invoke-static {v13, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", icon="

    const-string v1, ", style="

    invoke-static {v13, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleStyle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", goalCards="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", calloutDisplay="

    const-string v1, ", calloutCtaDisplay="

    invoke-static {v0, v9, v1, v13, v8}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v0, ", id="

    const-string v1, ", secondaryButton="

    invoke-static {v13, v10, v0, v11, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
