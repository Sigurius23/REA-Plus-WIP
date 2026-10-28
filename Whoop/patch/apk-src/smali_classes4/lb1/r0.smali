.class public final enum Llb1/r0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llb1/r0;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llb1/r0;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "Ly81/f;",
        "statusColor",
        "<init>",
        "(Ljava/lang/String;ILy81/f;)V",
        "Ly81/f;",
        "getStatusColor",
        "()Ly81/f;",
        "HIGHER_POSITIVE",
        "HIGHER_NEUTRAL",
        "HIGHER_NEGATIVE",
        "EQUAL",
        "LOWER_POSITIVE",
        "LOWER_NEUTRAL",
        "LOWER_NEGATIVE",
        "NO_DATA",
        "design-models_release"
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

.field private static final synthetic $VALUES:[Llb1/r0;

.field public static final enum EQUAL:Llb1/r0;

.field public static final enum HIGHER_NEGATIVE:Llb1/r0;

.field public static final enum HIGHER_NEUTRAL:Llb1/r0;

.field public static final enum HIGHER_POSITIVE:Llb1/r0;

.field public static final enum LOWER_NEGATIVE:Llb1/r0;

.field public static final enum LOWER_NEUTRAL:Llb1/r0;

.field public static final enum LOWER_POSITIVE:Llb1/r0;

.field public static final enum NO_DATA:Llb1/r0;


# instance fields
.field private final statusColor:Ly81/f;


# direct methods
.method private static final synthetic $values()[Llb1/r0;
    .locals 8

    sget-object v0, Llb1/r0;->HIGHER_POSITIVE:Llb1/r0;

    sget-object v1, Llb1/r0;->HIGHER_NEUTRAL:Llb1/r0;

    sget-object v2, Llb1/r0;->HIGHER_NEGATIVE:Llb1/r0;

    sget-object v3, Llb1/r0;->EQUAL:Llb1/r0;

    sget-object v4, Llb1/r0;->LOWER_POSITIVE:Llb1/r0;

    sget-object v5, Llb1/r0;->LOWER_NEUTRAL:Llb1/r0;

    sget-object v6, Llb1/r0;->LOWER_NEGATIVE:Llb1/r0;

    sget-object v7, Llb1/r0;->NO_DATA:Llb1/r0;

    filled-new-array/range {v0 .. v7}, [Llb1/r0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Llb1/r0;

    sget-object v1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const-string v2, "HIGHER_POSITIVE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Llb1/r0;->HIGHER_POSITIVE:Llb1/r0;

    new-instance v4, Llb1/r0;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v5, "HIGHER_NEUTRAL"

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Llb1/r0;->HIGHER_NEUTRAL:Llb1/r0;

    new-instance v0, Llb1/r0;

    sget-object v2, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const-string v3, "HIGHER_NEGATIVE"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v2}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Llb1/r0;->HIGHER_NEGATIVE:Llb1/r0;

    new-instance v5, Llb1/r0;

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-string v6, "EQUAL"

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Llb1/r0;->EQUAL:Llb1/r0;

    new-instance v0, Llb1/r0;

    const-string v3, "LOWER_POSITIVE"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Llb1/r0;->LOWER_POSITIVE:Llb1/r0;

    new-instance v5, Llb1/r0;

    const-string v6, "LOWER_NEUTRAL"

    const/4 v7, 0x5

    invoke-direct/range {v5 .. v10}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Llb1/r0;->LOWER_NEUTRAL:Llb1/r0;

    new-instance v0, Llb1/r0;

    const-string v1, "LOWER_NEGATIVE"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Llb1/r0;->LOWER_NEGATIVE:Llb1/r0;

    new-instance v0, Llb1/r0;

    const/4 v1, 0x7

    sget-object v2, Ly81/f;->WHITE_70:Ly81/f;

    const-string v3, "NO_DATA"

    invoke-direct {v0, v3, v1, v2}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Llb1/r0;->NO_DATA:Llb1/r0;

    invoke-static {}, Llb1/r0;->$values()[Llb1/r0;

    move-result-object v0

    sput-object v0, Llb1/r0;->$VALUES:[Llb1/r0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llb1/r0;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Llb1/r0;->statusColor:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 3
    sget-object p3, Ly81/f;->WHITE_50:Ly81/f;

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llb1/r0;-><init>(Ljava/lang/String;ILy81/f;)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Llb1/r0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llb1/r0;
    .locals 1

    const-class v0, Llb1/r0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llb1/r0;

    return-object p0
.end method

.method public static values()[Llb1/r0;
    .locals 1

    sget-object v0, Llb1/r0;->$VALUES:[Llb1/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llb1/r0;

    return-object v0
.end method


# virtual methods
.method public final getStatusColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/r0;->statusColor:Ly81/f;

    return-object v0
.end method
