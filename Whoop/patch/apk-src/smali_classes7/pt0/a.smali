.class public final enum Lpt0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpt0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpt0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lpt0/a;",
        "",
        "",
        "byte",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getByte",
        "()B",
        "Companion",
        "a",
        "UNUSED",
        "FULL_BLACK",
        "connectivity-core_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lpt0/a;

.field public static final Companion:Lpt0/a$a;

.field public static final enum FULL_BLACK:Lpt0/a;

.field public static final enum UNUSED:Lpt0/a;

.field private static final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Byte;",
            "Lpt0/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final byte:B


# direct methods
.method private static final synthetic $values()[Lpt0/a;
    .locals 2

    sget-object v0, Lpt0/a;->UNUSED:Lpt0/a;

    sget-object v1, Lpt0/a;->FULL_BLACK:Lpt0/a;

    filled-new-array {v0, v1}, [Lpt0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lpt0/a;

    const-string v1, "UNUSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lpt0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lpt0/a;->UNUSED:Lpt0/a;

    new-instance v0, Lpt0/a;

    const-string v1, "FULL_BLACK"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lpt0/a;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lpt0/a;->FULL_BLACK:Lpt0/a;

    invoke-static {}, Lpt0/a;->$values()[Lpt0/a;

    move-result-object v0

    sput-object v0, Lpt0/a;->$VALUES:[Lpt0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lpt0/a;->$ENTRIES:Lt83/a;

    new-instance v0, Lpt0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpt0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpt0/a;->Companion:Lpt0/a$a;

    invoke-static {}, Lpt0/a;->values()[Lpt0/a;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v3, 0x10

    if-ge v1, v3, :cond_0

    move v1, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    iget-byte v5, v4, Lpt0/a;->byte:B

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sput-object v3, Lpt0/a;->map:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lpt0/a;->byte:B

    return-void
.end method

.method public static final synthetic access$getMap$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lpt0/a;->map:Ljava/util/Map;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lpt0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpt0/a;
    .locals 1

    const-class v0, Lpt0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpt0/a;

    return-object p0
.end method

.method public static values()[Lpt0/a;
    .locals 1

    sget-object v0, Lpt0/a;->$VALUES:[Lpt0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpt0/a;

    return-object v0
.end method


# virtual methods
.method public final getByte()B
    .locals 1

    iget-byte v0, p0, Lpt0/a;->byte:B

    return v0
.end method
