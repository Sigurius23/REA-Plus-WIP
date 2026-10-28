.class public final Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBW\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JP\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00088\u0010%\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;",
        "",
        "",
        "title",
        "subtitle",
        "searchHeaderDisplay",
        "Lcom/whoop/advancedlabs/domain/models/TestTileModel;",
        "testTile",
        "Lcom/whoop/advancedlabs/domain/models/FormContent;",
        "formContent",
        "Lcom/whoop/advancedlabs/domain/models/SchedulingButton;",
        "button",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/advancedlabs/domain/models/TestTileModel;",
        "component5",
        "()Lcom/whoop/advancedlabs/domain/models/FormContent;",
        "component6",
        "()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "getSearchHeaderDisplay",
        "Lcom/whoop/advancedlabs/domain/models/TestTileModel;",
        "getTestTile",
        "Lcom/whoop/advancedlabs/domain/models/FormContent;",
        "getFormContent",
        "Lcom/whoop/advancedlabs/domain/models/SchedulingButton;",
        "getButton",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$Companion;


# instance fields
.field private final button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

.field private final formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

.field private final searchHeaderDisplay:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$$serializer;

    invoke-virtual {p8}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchHeaderDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/TestTileModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/TestTileModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/FormContent$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/FormContent$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulingButton$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulingButton$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/domain/models/TestTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/advancedlabs/domain/models/FormContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    return-object v0
.end method

.method public final component6()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchHeaderDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    return-object v0
.end method

.method public final getFormContent()Lcom/whoop/advancedlabs/domain/models/FormContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    return-object v0
.end method

.method public final getSearchHeaderDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTestTile()Lcom/whoop/advancedlabs/domain/models/TestTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestTileModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/FormContent;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->searchHeaderDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->testTile:Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->formContent:Lcom/whoop/advancedlabs/domain/models/FormContent;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->button:Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    const-string v6, ", subtitle="

    const-string v7, ", searchHeaderDisplay="

    const-string v8, "SchedulingFormResponse(title="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", testTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
