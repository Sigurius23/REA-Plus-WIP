.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0002DEB=\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eBQ\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010!\u001a\u00020\n\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*JL\u0010,\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010(J\u0010\u0010/\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\"J\u001a\u00102\u001a\u00020\u00062\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R&\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00104\u0012\u0004\u00086\u00107\u001a\u0004\u00085\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008:\u00107\u001a\u0004\u00089\u0010&R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010;\u0012\u0004\u0008=\u00107\u001a\u0004\u0008<\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010>\u0012\u0004\u0008@\u00107\u001a\u0004\u0008?\u0010*R\"\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010>\u0012\u0004\u0008B\u00107\u001a\u0004\u0008A\u0010*\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "Lvy/b;",
        "Landroid/os/Parcelable;",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        "data",
        "",
        "hasMore",
        "",
        "url",
        "",
        "count",
        "totalCount",
        "<init>",
        "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$financial_connections_core_release",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Z",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/lang/Integer;",
        "component5",
        "copy",
        "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getData",
        "getData$annotations",
        "()V",
        "Z",
        "getHasMore",
        "getHasMore$annotations",
        "Ljava/lang/String;",
        "getUrl",
        "getUrl$annotations",
        "Ljava/lang/Integer;",
        "getCount",
        "getCount$annotations",
        "getTotalCount",
        "getTotalCount$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/financialconnections/model/v",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/v;


# instance fields
.field private final count:Ljava/lang/Integer;

.field private final data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final hasMore:Z

.field private final totalCount:Ljava/lang/Integer;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/model/v;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->Companion:Lcom/stripe/android/financialconnections/model/v;

    new-instance v0, Lpn/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/4 v1, 0x5

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    const/4 v2, 0x0

    aput-object v2, v1, v0

    const/4 v0, 0x2

    aput-object v2, v1, v0

    const/4 v0, 0x3

    aput-object v2, v1, v0

    const/4 v0, 0x4

    aput-object v2, v1, v0

    sput-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    invoke-virtual {p7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    :goto_0
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    .line 4
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    .line 5
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->copy(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCount$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "count"
    .end annotation

    return-void
.end method

.method public static synthetic getData$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "data"
    .end annotation

    return-void
.end method

.method public static synthetic getHasMore$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "has_more"
    .end annotation

    return-void
.end method

.method public static synthetic getTotalCount$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "total_count"
    .end annotation

    return-void
.end method

.method public static synthetic getUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "url"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    return-object v0
.end method

.method public final getHasMore()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    return v0
.end method

.method public final getTotalCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

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

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "FinancialConnectionsAccountList(data="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hasMore="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", count="

    const-string v1, ", totalCount="

    invoke-static {v3, v2, v0, v1, v5}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->data:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hasMore:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->url:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->count:Ljava/lang/Integer;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->totalCount:Ljava/lang/Integer;

    if-nez p2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    return-void
.end method
