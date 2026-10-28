.class final enum La72/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La72/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La72/b$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La72/b$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0082\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "La72/b$b;",
        "",
        "",
        "analyticsLabel",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getAnalyticsLabel",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "SLEEP",
        "PERFORMANCE",
        "RESILIENCE",
        "WELLBEING",
        "UNKNOWN",
        "sage_release"
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

.field private static final synthetic $VALUES:[La72/b$b;

.field public static final Companion:La72/b$b$a;

.field public static final enum PERFORMANCE:La72/b$b;

.field public static final enum RESILIENCE:La72/b$b;

.field public static final enum SLEEP:La72/b$b;

.field public static final enum UNKNOWN:La72/b$b;

.field public static final enum WELLBEING:La72/b$b;


# instance fields
.field private final analyticsLabel:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[La72/b$b;
    .locals 5

    sget-object v0, La72/b$b;->SLEEP:La72/b$b;

    sget-object v1, La72/b$b;->PERFORMANCE:La72/b$b;

    sget-object v2, La72/b$b;->RESILIENCE:La72/b$b;

    sget-object v3, La72/b$b;->WELLBEING:La72/b$b;

    sget-object v4, La72/b$b;->UNKNOWN:La72/b$b;

    filled-new-array {v0, v1, v2, v3, v4}, [La72/b$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La72/b$b;

    const/4 v1, 0x0

    const-string v2, "sleep"

    const-string v3, "SLEEP"

    invoke-direct {v0, v3, v1, v2}, La72/b$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La72/b$b;->SLEEP:La72/b$b;

    new-instance v0, La72/b$b;

    const/4 v1, 0x1

    const-string v2, "performance"

    const-string v3, "PERFORMANCE"

    invoke-direct {v0, v3, v1, v2}, La72/b$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La72/b$b;->PERFORMANCE:La72/b$b;

    new-instance v0, La72/b$b;

    const/4 v1, 0x2

    const-string v2, "resilience"

    const-string v3, "RESILIENCE"

    invoke-direct {v0, v3, v1, v2}, La72/b$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La72/b$b;->RESILIENCE:La72/b$b;

    new-instance v0, La72/b$b;

    const/4 v1, 0x3

    const-string v2, "wellbeing"

    const-string v3, "WELLBEING"

    invoke-direct {v0, v3, v1, v2}, La72/b$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La72/b$b;->WELLBEING:La72/b$b;

    new-instance v0, La72/b$b;

    const/4 v1, 0x4

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, La72/b$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La72/b$b;->UNKNOWN:La72/b$b;

    invoke-static {}, La72/b$b;->$values()[La72/b$b;

    move-result-object v0

    sput-object v0, La72/b$b;->$VALUES:[La72/b$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, La72/b$b;->$ENTRIES:Lt83/a;

    new-instance v0, La72/b$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La72/b$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La72/b$b;->Companion:La72/b$b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, La72/b$b;->analyticsLabel:Ljava/lang/String;

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

    sget-object v0, La72/b$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)La72/b$b;
    .locals 1

    const-class v0, La72/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La72/b$b;

    return-object p0
.end method

.method public static values()[La72/b$b;
    .locals 1

    sget-object v0, La72/b$b;->$VALUES:[La72/b$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La72/b$b;

    return-object v0
.end method


# virtual methods
.method public final getAnalyticsLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La72/b$b;->analyticsLabel:Ljava/lang/String;

    return-object v0
.end method
