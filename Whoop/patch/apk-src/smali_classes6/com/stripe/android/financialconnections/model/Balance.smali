.class public final Lcom/stripe/android/financialconnections/model/Balance;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/Balance$$serializer;,
        Lcom/stripe/android/financialconnections/model/Balance$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0003HIJBE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBW\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,JR\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010#J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00107\u0012\u0004\u00089\u0010:\u001a\u0004\u00088\u0010#R,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010;\u0012\u0004\u0008=\u0010:\u001a\u0004\u0008<\u0010&R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010>\u0012\u0004\u0008@\u0010:\u001a\u0004\u0008?\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010A\u0012\u0004\u0008C\u0010:\u001a\u0004\u0008B\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010D\u0012\u0004\u0008F\u0010:\u001a\u0004\u0008E\u0010,\u00a8\u0006K"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/Balance;",
        "Lvy/b;",
        "Landroid/os/Parcelable;",
        "",
        "asOf",
        "",
        "",
        "current",
        "Lcom/stripe/android/financialconnections/model/Balance$Type;",
        "type",
        "Lcom/stripe/android/financialconnections/model/CashBalance;",
        "cash",
        "Lcom/stripe/android/financialconnections/model/CreditBalance;",
        "credit",
        "<init>",
        "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$financial_connections_core_release",
        "(Lcom/stripe/android/financialconnections/model/Balance;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "component2",
        "()Ljava/util/Map;",
        "component3",
        "()Lcom/stripe/android/financialconnections/model/Balance$Type;",
        "component4",
        "()Lcom/stripe/android/financialconnections/model/CashBalance;",
        "component5",
        "()Lcom/stripe/android/financialconnections/model/CreditBalance;",
        "copy",
        "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)Lcom/stripe/android/financialconnections/model/Balance;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getAsOf",
        "getAsOf$annotations",
        "()V",
        "Ljava/util/Map;",
        "getCurrent",
        "getCurrent$annotations",
        "Lcom/stripe/android/financialconnections/model/Balance$Type;",
        "getType",
        "getType$annotations",
        "Lcom/stripe/android/financialconnections/model/CashBalance;",
        "getCash",
        "getCash$annotations",
        "Lcom/stripe/android/financialconnections/model/CreditBalance;",
        "getCredit",
        "getCredit$annotations",
        "Companion",
        "Type",
        "$serializer",
        "com/stripe/android/financialconnections/model/a",
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
            "Lcom/stripe/android/financialconnections/model/Balance;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/a;


# instance fields
.field private final asOf:I

.field private final cash:Lcom/stripe/android/financialconnections/model/CashBalance;

.field private final credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

.field private final current:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lcom/stripe/android/financialconnections/model/Balance$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/financialconnections/model/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/Balance;->Companion:Lcom/stripe/android/financialconnections/model/a;

    new-instance v0, Lcom/stripe/android/financialconnections/model/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/Balance;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/Balance$Type;->Companion:Lcom/stripe/android/financialconnections/model/c;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/c;->serializer()Lwc3/c;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v4, v2, v0

    const/4 v0, 0x4

    aput-object v4, v2, v0

    sput-object v2, Lcom/stripe/android/financialconnections/model/Balance;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    invoke-virtual {p7}, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    .line 3
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-void

    :cond_3
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-void
.end method

.method public constructor <init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance$Type;",
            "Lcom/stripe/android/financialconnections/model/CashBalance;",
            "Lcom/stripe/android/financialconnections/model/CreditBalance;",
            ")V"
        }
    .end annotation

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    .line 6
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    .line 7
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    .line 8
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    .line 9
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 10
    sget-object p3, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    const/4 p7, 0x0

    if-eqz p3, :cond_1

    move-object v4, p7

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move-object v5, p7

    :goto_1
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    goto :goto_2

    :cond_2
    move-object v5, p5

    goto :goto_1

    .line 11
    :goto_2
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/model/Balance;-><init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/Balance;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/Balance;ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/Balance;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/financialconnections/model/Balance;->copy(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)Lcom/stripe/android/financialconnections/model/Balance;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAsOf$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "as_of"
    .end annotation

    return-void
.end method

.method public static synthetic getCash$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cash"
    .end annotation

    return-void
.end method

.method public static synthetic getCredit$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "credit"
    .end annotation

    return-void
.end method

.method public static synthetic getCurrent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "current"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/Balance;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/stripe/android/financialconnections/model/Balance;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    iget v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    sget-object v3, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/CashBalance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/CashBalance$$serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/CreditBalance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/CreditBalance$$serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    return v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/Balance$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/CashBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/CreditBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-object v0
.end method

.method public final copy(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)Lcom/stripe/android/financialconnections/model/Balance;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance$Type;",
            "Lcom/stripe/android/financialconnections/model/CashBalance;",
            "Lcom/stripe/android/financialconnections/model/CreditBalance;",
            ")",
            "Lcom/stripe/android/financialconnections/model/Balance;"
        }
    .end annotation

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/Balance;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/model/Balance;-><init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/Balance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/Balance;

    iget v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iget v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAsOf()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    return v0
.end method

.method public final getCash()Lcom/stripe/android/financialconnections/model/CashBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    return-object v0
.end method

.method public final getCredit()Lcom/stripe/android/financialconnections/model/CreditBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-object v0
.end method

.method public final getCurrent()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/financialconnections/model/Balance$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/CashBalance;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/CreditBalance;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Balance(asOf="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", current="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cash="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", credit="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/CashBalance;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/CreditBalance;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
