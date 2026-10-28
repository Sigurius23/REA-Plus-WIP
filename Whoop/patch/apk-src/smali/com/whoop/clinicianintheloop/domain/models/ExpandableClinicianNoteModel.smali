.class public final Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$$serializer;,
        Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBi\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(Jb\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00042\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u00020\u00072\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00087\u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008\u0008\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010&R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010(R\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010;\u001a\u0004\u0008=\u0010(\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "stickyItems",
        "expandableItems",
        "",
        "isExpanded",
        "",
        "collapsedHeight",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "expandButton",
        "collapseButton",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "()Z",
        "component5",
        "()D",
        "component6",
        "()Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Ljava/util/List;",
        "getStickyItems",
        "getExpandableItems",
        "Z",
        "D",
        "getCollapsedHeight",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "getExpandButton",
        "getCollapseButton",
        "Companion",
        "$serializer",
        "clinician-in-the-loop_release"
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

.field public static final Companion:Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$Companion;


# instance fields
.field private final collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

.field private final collapsedHeight:D

.field private final expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

.field private final expandableItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final isExpanded:Z

.field private final stickyItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->Companion:Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljl0/a;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ljl0/a;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v0, v3, v2

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    iput-boolean p5, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    iput-wide p6, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    iput-object p8, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iput-object p9, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;ZD",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stickyItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandableItems"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandButton"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collapseButton"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    .line 7
    iput-wide p5, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    .line 8
    iput-object p7, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    .line 9
    iput-object p8, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-boolean p4, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-wide p5, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p7, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-object p8, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    :cond_6
    move-object p9, p7

    move-object p10, p8

    move-wide p7, p5

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object p0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    return v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    return-wide v0
.end method

.method public final component6()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;ZD",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")",
            "Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stickyItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandableItems"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandButton"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collapseButton"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-wide v6, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    iget-boolean v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    iget-wide v5, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCollapseButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final getCollapsedHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    return-wide v0
.end method

.method public final getExpandButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final getExpandableItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getStickyItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->stickyItems:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandableItems:Ljava/util/List;

    iget-boolean v3, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->isExpanded:Z

    iget-wide v4, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapsedHeight:D

    iget-object v6, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->expandButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v7, p0, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;->collapseButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const-string v8, ", stickyItems="

    const-string v9, ", expandableItems="

    const-string v10, "ExpandableClinicianNoteModel(id="

    invoke-static {v10, v0, v8, v9, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isExpanded="

    const-string v8, ", collapsedHeight="

    invoke-static {v1, v8, v0, v2, v3}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", expandButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", collapseButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
