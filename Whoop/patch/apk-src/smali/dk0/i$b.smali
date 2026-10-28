.class public final enum Ldk0/i$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldk0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk0/i$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldk0/i$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\n\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ldk0/i$b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "",
        "shortValue",
        "S",
        "getShortValue",
        "()S",
        "Companion",
        "a",
        "HISTORY_START",
        "HISTORY_END",
        "HISTORY_COMPLETE",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Ldk0/i$b;

.field public static final Companion:Ldk0/i$b$a;

.field public static final enum HISTORY_COMPLETE:Ldk0/i$b;

.field public static final enum HISTORY_END:Ldk0/i$b;

.field public static final enum HISTORY_START:Ldk0/i$b;

.field private static final map:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Short;",
            "Ldk0/i$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final shortValue:S


# direct methods
.method private static final synthetic $values()[Ldk0/i$b;
    .locals 3

    sget-object v0, Ldk0/i$b;->HISTORY_START:Ldk0/i$b;

    sget-object v1, Ldk0/i$b;->HISTORY_END:Ldk0/i$b;

    sget-object v2, Ldk0/i$b;->HISTORY_COMPLETE:Ldk0/i$b;

    filled-new-array {v0, v1, v2}, [Ldk0/i$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ldk0/i$b;

    const-string v1, "HISTORY_START"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ldk0/i$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldk0/i$b;->HISTORY_START:Ldk0/i$b;

    new-instance v0, Ldk0/i$b;

    const-string v1, "HISTORY_END"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Ldk0/i$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldk0/i$b;->HISTORY_END:Ldk0/i$b;

    new-instance v0, Ldk0/i$b;

    const-string v1, "HISTORY_COMPLETE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v4, v3}, Ldk0/i$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldk0/i$b;->HISTORY_COMPLETE:Ldk0/i$b;

    invoke-static {}, Ldk0/i$b;->$values()[Ldk0/i$b;

    move-result-object v0

    sput-object v0, Ldk0/i$b;->$VALUES:[Ldk0/i$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ldk0/i$b;->$ENTRIES:Lt83/a;

    new-instance v0, Ldk0/i$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldk0/i$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldk0/i$b;->Companion:Ldk0/i$b$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ldk0/i$b;->map:Ljava/util/HashMap;

    invoke-static {}, Ldk0/i$b;->values()[Ldk0/i$b;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    sget-object v4, Ldk0/i$b;->map:Ljava/util/HashMap;

    iget-short v5, v3, Ldk0/i$b;->shortValue:S

    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    int-to-short p1, p3

    iput-short p1, p0, Ldk0/i$b;->shortValue:S

    return-void
.end method

.method public static final synthetic access$getMap$cp()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Ldk0/i$b;->map:Ljava/util/HashMap;

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

    sget-object v0, Ldk0/i$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldk0/i$b;
    .locals 1

    const-class v0, Ldk0/i$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldk0/i$b;

    return-object p0
.end method

.method public static values()[Ldk0/i$b;
    .locals 1

    sget-object v0, Ldk0/i$b;->$VALUES:[Ldk0/i$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldk0/i$b;

    return-object v0
.end method


# virtual methods
.method public final getShortValue()S
    .locals 1

    iget-short v0, p0, Ldk0/i$b;->shortValue:S

    return v0
.end method
