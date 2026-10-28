.class public final enum Lvl2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvl2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvl2/a;",
        "",
        "",
        "durationName",
        "",
        "index",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "Ljava/lang/String;",
        "getDurationName",
        "()Ljava/lang/String;",
        "I",
        "getIndex",
        "()I",
        "WEEKLY",
        "MONTHLY",
        "SIX_MONTH",
        "ALL",
        "NONE",
        "trends_release"
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

.field private static final synthetic $VALUES:[Lvl2/a;

.field public static final enum ALL:Lvl2/a;

.field public static final enum MONTHLY:Lvl2/a;

.field public static final enum NONE:Lvl2/a;

.field public static final enum SIX_MONTH:Lvl2/a;

.field public static final enum WEEKLY:Lvl2/a;


# instance fields
.field private final durationName:Ljava/lang/String;

.field private final index:I


# direct methods
.method private static final synthetic $values()[Lvl2/a;
    .locals 5

    sget-object v0, Lvl2/a;->WEEKLY:Lvl2/a;

    sget-object v1, Lvl2/a;->MONTHLY:Lvl2/a;

    sget-object v2, Lvl2/a;->SIX_MONTH:Lvl2/a;

    sget-object v3, Lvl2/a;->ALL:Lvl2/a;

    sget-object v4, Lvl2/a;->NONE:Lvl2/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lvl2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lvl2/a;

    const/4 v1, 0x0

    const-string v2, "Week"

    const-string v3, "WEEKLY"

    invoke-direct {v0, v3, v1, v2, v1}, Lvl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lvl2/a;->WEEKLY:Lvl2/a;

    new-instance v0, Lvl2/a;

    const/4 v1, 0x1

    const-string v2, "Month"

    const-string v3, "MONTHLY"

    invoke-direct {v0, v3, v1, v2, v1}, Lvl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lvl2/a;->MONTHLY:Lvl2/a;

    new-instance v0, Lvl2/a;

    const/4 v1, 0x2

    const-string v2, "6 Month"

    const-string v3, "SIX_MONTH"

    invoke-direct {v0, v3, v1, v2, v1}, Lvl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lvl2/a;->SIX_MONTH:Lvl2/a;

    new-instance v0, Lvl2/a;

    const/4 v1, 0x3

    const-string v2, "All"

    const-string v3, "ALL"

    invoke-direct {v0, v3, v1, v2, v1}, Lvl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lvl2/a;->ALL:Lvl2/a;

    new-instance v0, Lvl2/a;

    const-string v1, "None"

    const/4 v2, -0x1

    const-string v3, "NONE"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lvl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lvl2/a;->NONE:Lvl2/a;

    invoke-static {}, Lvl2/a;->$values()[Lvl2/a;

    move-result-object v0

    sput-object v0, Lvl2/a;->$VALUES:[Lvl2/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lvl2/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lvl2/a;->durationName:Ljava/lang/String;

    iput p4, p0, Lvl2/a;->index:I

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

    sget-object v0, Lvl2/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvl2/a;
    .locals 1

    const-class v0, Lvl2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvl2/a;

    return-object p0
.end method

.method public static values()[Lvl2/a;
    .locals 1

    sget-object v0, Lvl2/a;->$VALUES:[Lvl2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvl2/a;

    return-object v0
.end method


# virtual methods
.method public final getDurationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvl2/a;->durationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Lvl2/a;->index:I

    return v0
.end method
