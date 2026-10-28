.class public final enum Llv1/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llv1/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llv1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Llv1/b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "NONE",
        "AVAILABLE",
        "UNAVAILABLE",
        "ERROR",
        "member-data-export_release"
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

.field private static final synthetic $VALUES:[Llv1/b;

.field public static final enum AVAILABLE:Llv1/b;

.field public static final Companion:Llv1/b$a;

.field public static final enum ERROR:Llv1/b;

.field public static final enum NONE:Llv1/b;

.field public static final enum UNAVAILABLE:Llv1/b;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Llv1/b;
    .locals 4

    sget-object v0, Llv1/b;->NONE:Llv1/b;

    sget-object v1, Llv1/b;->AVAILABLE:Llv1/b;

    sget-object v2, Llv1/b;->UNAVAILABLE:Llv1/b;

    sget-object v3, Llv1/b;->ERROR:Llv1/b;

    filled-new-array {v0, v1, v2, v3}, [Llv1/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llv1/b;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Llv1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llv1/b;->NONE:Llv1/b;

    new-instance v0, Llv1/b;

    const/4 v1, 0x1

    const-string v2, "available"

    const-string v3, "AVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Llv1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llv1/b;->AVAILABLE:Llv1/b;

    new-instance v0, Llv1/b;

    const/4 v1, 0x2

    const-string v2, "unavailable"

    const-string v3, "UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Llv1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llv1/b;->UNAVAILABLE:Llv1/b;

    new-instance v0, Llv1/b;

    const/4 v1, 0x3

    const-string v2, "error"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Llv1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llv1/b;->ERROR:Llv1/b;

    invoke-static {}, Llv1/b;->$values()[Llv1/b;

    move-result-object v0

    sput-object v0, Llv1/b;->$VALUES:[Llv1/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llv1/b;->$ENTRIES:Lt83/a;

    new-instance v0, Llv1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llv1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llv1/b;->Companion:Llv1/b$a;

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

    iput-object p3, p0, Llv1/b;->value:Ljava/lang/String;

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

    sget-object v0, Llv1/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llv1/b;
    .locals 1

    const-class v0, Llv1/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llv1/b;

    return-object p0
.end method

.method public static values()[Llv1/b;
    .locals 1

    sget-object v0, Llv1/b;->$VALUES:[Llv1/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llv1/b;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llv1/b;->value:Ljava/lang/String;

    return-object v0
.end method
