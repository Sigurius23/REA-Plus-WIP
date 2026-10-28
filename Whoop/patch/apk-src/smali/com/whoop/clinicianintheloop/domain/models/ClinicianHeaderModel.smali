.class public final Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$$serializer;,
        Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB_\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J^\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u00020\u000c2\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00087\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00088\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\'R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010)\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "headshot",
        "subtitle",
        "title",
        "Lcom/whoop/design/models/items/TagModel;",
        "tag",
        "Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;",
        "icon",
        "",
        "useTileBackground",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/ImageUrlModel;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component6",
        "()Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;",
        "component7",
        "()Z",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "getHeadshot",
        "getSubtitle",
        "getTitle",
        "Lcom/whoop/design/models/items/TagModel;",
        "getTag",
        "Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;",
        "getIcon",
        "Z",
        "getUseTileBackground",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$Companion;


# instance fields
.field private final headshot:Lcom/whoop/design/models/items/ImageUrlModel;

.field private final icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

.field private final id:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final tag:Lcom/whoop/design/models/items/TagModel;

.field private final title:Ljava/lang/String;

.field private final useTileBackground:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->Companion:Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$Companion;

    sget v0, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    sget v1, Lcom/whoop/design/models/items/TagModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/ImageUrlModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iput-object p7, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    return-void

    :cond_1
    iput-boolean p8, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v8}, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;ZILjava/lang/Object;)Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ImageUrlModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImageUrlModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    if-eqz v1, :cond_1

    :goto_0
    iget-boolean p0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/ImageUrlModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    iget-boolean p1, p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getHeadshot()Lcom/whoop/design/models/items/ImageUrlModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    return-object v0
.end method

.method public final getIcon()Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUseTileBackground()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImageUrlModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->headshot:Lcom/whoop/design/models/items/ImageUrlModel;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->title:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v5, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->icon:Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;

    iget-boolean v6, p0, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;->useTileBackground:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ClinicianHeaderModel(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", headshot="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    const-string v1, ", tag="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useTileBackground="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
