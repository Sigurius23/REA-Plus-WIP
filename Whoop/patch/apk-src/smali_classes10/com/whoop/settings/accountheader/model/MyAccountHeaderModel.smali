.class public final Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$$serializer;,
        Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bBW\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJN\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001fR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00081\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00082\u0010\u001f\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;",
        "",
        "",
        "icon",
        "title",
        "subtitle",
        "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;",
        "joinCta",
        "switchCta",
        "cancelCta",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$settings_release",
        "(Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getTitle",
        "getSubtitle",
        "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;",
        "getJoinCta",
        "getSwitchCta",
        "getCancelCta",
        "Companion",
        "$serializer",
        "settings_release"
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

.field public static final Companion:Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$Companion;


# instance fields
.field private final cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cancel_cta"
    .end annotation
.end field

.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "join_cta"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "switch_cta"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->Companion:Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$$serializer;->INSTANCE:Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iput-object p6, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iput-object p7, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinCta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelCta"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;ILjava/lang/Object;)Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$settings_release(Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel$$serializer;->INSTANCE:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel$$serializer;

    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;
    .locals 8

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinCta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelCta"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iget-object v3, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iget-object v3, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iget-object p1, p1, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCancelCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getJoinCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSwitchCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-virtual {v2}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->joinCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iget-object v4, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->switchCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    iget-object v5, p0, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->cancelCta:Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    const-string v6, ", title="

    const-string v7, ", subtitle="

    const-string v8, "MyAccountHeaderModel(icon="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", switchCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cancelCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
