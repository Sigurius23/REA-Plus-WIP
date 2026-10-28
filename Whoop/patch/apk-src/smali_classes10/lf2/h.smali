.class public final enum Llf2/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llf2/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llf2/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llf2/h;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "PEAK",
        "PERFORM",
        "GET_BY",
        "sleep-coach_release"
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

.field private static final synthetic $VALUES:[Llf2/h;

.field public static final Companion:Llf2/h$a;

.field public static final enum GET_BY:Llf2/h;

.field public static final enum PEAK:Llf2/h;

.field public static final enum PERFORM:Llf2/h;


# direct methods
.method private static final synthetic $values()[Llf2/h;
    .locals 3

    sget-object v0, Llf2/h;->PEAK:Llf2/h;

    sget-object v1, Llf2/h;->PERFORM:Llf2/h;

    sget-object v2, Llf2/h;->GET_BY:Llf2/h;

    filled-new-array {v0, v1, v2}, [Llf2/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llf2/h;

    const-string v1, "PEAK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llf2/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llf2/h;->PEAK:Llf2/h;

    new-instance v0, Llf2/h;

    const-string v1, "PERFORM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llf2/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llf2/h;->PERFORM:Llf2/h;

    new-instance v0, Llf2/h;

    const-string v1, "GET_BY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llf2/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llf2/h;->GET_BY:Llf2/h;

    invoke-static {}, Llf2/h;->$values()[Llf2/h;

    move-result-object v0

    sput-object v0, Llf2/h;->$VALUES:[Llf2/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llf2/h;->$ENTRIES:Lt83/a;

    new-instance v0, Llf2/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llf2/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llf2/h;->Companion:Llf2/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Llf2/h;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llf2/h;
    .locals 1

    const-class v0, Llf2/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llf2/h;

    return-object p0
.end method

.method public static values()[Llf2/h;
    .locals 1

    sget-object v0, Llf2/h;->$VALUES:[Llf2/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llf2/h;

    return-object v0
.end method
