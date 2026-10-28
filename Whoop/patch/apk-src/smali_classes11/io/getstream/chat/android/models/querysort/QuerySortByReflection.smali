.class public Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
.super Lio/getstream/chat/android/models/querysort/BaseQuerySort;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/querysort/QuerySortByReflection$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/getstream/chat/android/models/querysort/BaseQuerySort<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 >*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001>B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J=\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\u0008\u0012\u0004\u0012\u00028\u0000`\u000b*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ+\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\u0008\u0012\u0004\u0012\u00028\u0000`\u000b*\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000fJ\'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J+\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J+\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u001cJ5\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\u0008\u0012\u0004\u0012\u00028\u0000`\u000b2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J5\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\u0008\u0012\u0004\u0012\u00028\u0000`\u000b2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008#\u0010$J#\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000%H\u0010\u00a2\u0006\u0004\u0008\'\u0010(J/\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008*\u0010+J/\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008,\u0010+J+\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015H\u0016\u00a2\u0006\u0004\u0008*\u0010-J+\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008*\u0010.J\u001d\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008,\u0010.J+\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aH\u0016\u00a2\u0006\u0004\u0008*\u0010/J+\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aH\u0016\u00a2\u0006\u0004\u0008,\u0010/J!\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00080100H\u0000\u00a2\u0006\u0004\u00082\u00103R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\u00a8\u0006?"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/QuerySortByReflection;",
        "",
        "T",
        "Lio/getstream/chat/android/models/querysort/BaseQuerySort;",
        "<init>",
        "()V",
        "Lj93/w;",
        "",
        "Lio/getstream/chat/android/models/querysort/SortDirection;",
        "sortDirection",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "comparator",
        "(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;",
        "",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;",
        "any",
        "field",
        "comparableFromExtraData",
        "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;",
        "fieldName",
        "Ljava/lang/Class;",
        "javaClass",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute;",
        "getSortFeature",
        "(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;",
        "Lj93/d;",
        "kClass",
        "(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;",
        "firstSort",
        "comparatorFromFieldSort",
        "(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;",
        "name",
        "comparatorFromNameAttribute",
        "(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;",
        "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;",
        "sortSpecification",
        "add$stream_chat_android_core",
        "(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;",
        "add",
        "asc",
        "(Lj93/w;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;",
        "desc",
        "(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;",
        "(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;",
        "",
        "Ll83/k;",
        "toList$stream_chat_android_core",
        "()Ljava/util/List;",
        "toList",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/models/querysort/FieldSearcher;",
        "fieldSearcher",
        "Lio/getstream/chat/android/models/querysort/FieldSearcher;",
        "Companion",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/models/querysort/QuerySortByReflection$Companion;


# instance fields
.field private final fieldSearcher:Lio/getstream/chat/android/models/querysort/FieldSearcher;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByReflection$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;-><init>()V

    const-string v0, "QuerySort"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->logger$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/models/querysort/FieldSearcher;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/FieldSearcher;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->fieldSearcher:Lio/getstream/chat/android/models/querysort/FieldSearcher;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->comparator$lambda$2(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->comparator$lambda$1$lambda$0(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private final comparableFromExtraData(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/models/CustomObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/models/CustomObject;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lio/getstream/chat/android/models/CustomObject;->getExtraData()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    instance-of p2, p1, Ljava/lang/Comparable;

    if-eqz p2, :cond_2

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_2
    return-object v1
.end method

.method private final comparator(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/w;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/querysort/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lio/getstream/chat/android/models/querysort/a;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/models/querysort/SortDirection;I)V

    return-object v0
.end method

.method private final comparator(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/getstream/chat/android/models/querysort/b;

    invoke-direct {v0, p0, p1, p2}, Lio/getstream/chat/android/models/querysort/b;-><init>(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    return-object v0
.end method

.method private static final comparator$lambda$1$lambda$0(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    invoke-interface {p0}, Lj93/w;->getGetter()Lj93/v;

    move-result-object v0

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p2}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/Comparable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/Comparable;

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    invoke-interface {p0}, Lj93/w;->getGetter()Lj93/v;

    move-result-object p0

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p0, p3}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p3, p0, Ljava/lang/Comparable;

    if-eqz p3, :cond_1

    move-object v1, p0

    check-cast v1, Ljava/lang/Comparable;

    :cond_1
    invoke-static {p2, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/ComparationsKt;->compare(Ljava/lang/Comparable;Ljava/lang/Comparable;Lio/getstream/chat/android/models/querysort/SortDirection;)I

    move-result p0

    return p0
.end method

.method private static final comparator$lambda$2(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p3, p1}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->comparableFromExtraData(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->fieldSearcher:Lio/getstream/chat/android/models/querysort/FieldSearcher;

    invoke-virtual {v0, p3, p1}, Lio/getstream/chat/android/models/querysort/FieldSearcher;->findComparable$stream_chat_android_core(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;

    move-result-object v0

    :cond_0
    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p4, p1}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->comparableFromExtraData(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;

    move-result-object p3

    if-nez p3, :cond_1

    iget-object p0, p0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->fieldSearcher:Lio/getstream/chat/android/models/querysort/FieldSearcher;

    invoke-virtual {p0, p4, p1}, Lio/getstream/chat/android/models/querysort/FieldSearcher;->findComparable$stream_chat_android_core(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;

    move-result-object p3

    :cond_1
    invoke-static {v0, p3, p2}, Lio/getstream/chat/android/models/querysort/internal/ComparationsKt;->compare(Ljava/lang/Comparable;Ljava/lang/Comparable;Lio/getstream/chat/android/models/querysort/SortDirection;)I

    move-result p0

    return p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getSortFeature(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj93/d;",
            ")",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->fieldSearcher:Lio/getstream/chat/android/models/querysort/FieldSearcher;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/models/querysort/FieldSearcher;->findComparableMemberProperty$stream_chat_android_core(Ljava/lang/String;Lj93/d;)Lj93/w;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 5
    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;

    invoke-direct {v1, p2, p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;-><init>(Lj93/w;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 6
    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->getLogger()Lb23/k;

    move-result-object p2

    .line 7
    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v3, p2, Lb23/k;->a:Ljava/lang/String;

    .line 8
    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[getSortFeature] A field to sort was found. Using field: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-interface {p2, v4, v3, v2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    if-eqz v1, :cond_2

    return-object v1

    .line 12
    :cond_2
    new-instance p2, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;-><init>(Ljava/lang/String;)V

    return-object p2
.end method

.method private final getSortFeature(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->createKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    .line 2
    const-string v0, "null cannot be cast to non-null type kotlin.reflect.KClass<T of io.getstream.chat.android.models.querysort.QuerySortByReflection>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->getSortFeature(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;)",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "sortSpecification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {p1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->setSortSpecifications(Ljava/util/List;)V

    return-object p0
.end method

.method public asc(Lj93/w;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/w;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    .line 2
    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;

    invoke-interface {p1}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->camelCaseToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;-><init>(Lj93/w;Ljava/lang/String;)V

    .line 3
    sget-object p1, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    .line 4
    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    .line 5
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public asc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    .line 8
    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;-><init>(Ljava/lang/String;)V

    .line 9
    sget-object p1, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    .line 10
    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    .line 11
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public asc(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj93/d;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->getSortFeature(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object p1

    sget-object p2, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public asc(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->getSortFeature(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object p1

    sget-object p2, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public comparatorFromFieldSort(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute<",
            "TT;>;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "firstSort"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;->getField()Lj93/w;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->comparator(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public comparatorFromNameAttribute(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute<",
            "TT;>;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->comparator(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public desc(Lj93/w;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/w;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    .line 2
    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;

    .line 3
    invoke-interface {p1}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->camelCaseToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;-><init>(Lj93/w;Ljava/lang/String;)V

    .line 5
    sget-object p1, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    .line 6
    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    .line 7
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public desc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    .line 10
    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;-><init>(Ljava/lang/String;)V

    .line 11
    sget-object p1, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    .line 12
    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    .line 13
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public desc(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj93/d;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->getSortFeature(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object p1

    sget-object p2, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public desc(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lio/getstream/chat/android/models/querysort/QuerySortByReflection<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->getSortFeature(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object p1

    sget-object p2, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByReflection;->add$stream_chat_android_core(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;

    move-result-object p1

    return-object p1
.end method

.method public final toList$stream_chat_android_core()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortDirection()Lio/getstream/chat/android/models/querysort/SortDirection;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
