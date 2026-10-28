.class public final Lkotlin/reflect/jvm/internal/TypeParameterTable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B5\u0008\u0002\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000c\u001a\u00020\u0006H\u0086\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/TypeParameterTable;",
        "",
        "",
        "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;",
        "ownTypeParameters",
        "",
        "",
        "Lj93/b0;",
        "map",
        "parent",
        "<init>",
        "(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;)V",
        "id",
        "get",
        "(I)Lj93/b0;",
        "Ljava/util/List;",
        "getOwnTypeParameters",
        "()Ljava/util/List;",
        "Ljava/util/Map;",
        "Lkotlin/reflect/jvm/internal/TypeParameterTable;",
        "Companion",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;

.field public static final EMPTY:Lkotlin/reflect/jvm/internal/TypeParameterTable;


# instance fields
.field private final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lj93/b0;",
            ">;"
        }
    .end annotation
.end field

.field private final ownTypeParameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final parent:Lkotlin/reflect/jvm/internal/TypeParameterTable;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->Companion:Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;

    new-instance v0, Lkotlin/reflect/jvm/internal/TypeParameterTable;

    sget-object v2, Lm83/y;->w:Lm83/y;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v2, v3, v1}, Lkotlin/reflect/jvm/internal/TypeParameterTable;-><init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->EMPTY:Lkotlin/reflect/jvm/internal/TypeParameterTable;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "+",
            "Lj93/b0;",
            ">;",
            "Lkotlin/reflect/jvm/internal/TypeParameterTable;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->ownTypeParameters:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->map:Ljava/util/Map;

    .line 5
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->parent:Lkotlin/reflect/jvm/internal/TypeParameterTable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lkotlin/reflect/jvm/internal/TypeParameterTable;-><init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;)V

    return-void
.end method


# virtual methods
.method public final get(I)Lj93/b0;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->map:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/b0;

    if-nez v0, :cond_1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->parent:Lkotlin/reflect/jvm/internal/TypeParameterTable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/TypeParameterTable;->get(I)Lj93/b0;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final getOwnTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/TypeParameterTable;->ownTypeParameters:Ljava/util/List;

    return-object v0
.end method
