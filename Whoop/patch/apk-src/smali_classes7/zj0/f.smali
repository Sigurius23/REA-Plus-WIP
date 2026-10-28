.class public final enum Lzj0/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzj0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lzj0/f;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getValue",
        "()I",
        "Companion",
        "a",
        "UNKNOWN",
        "SUCCESS",
        "FAILURE",
        "INCOMPLETE",
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

.field private static final synthetic $VALUES:[Lzj0/f;

.field public static final Companion:Lzj0/f$a;

.field public static final enum FAILURE:Lzj0/f;

.field public static final enum INCOMPLETE:Lzj0/f;

.field public static final enum SUCCESS:Lzj0/f;

.field public static final enum UNKNOWN:Lzj0/f;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lzj0/f;
    .locals 4

    sget-object v0, Lzj0/f;->UNKNOWN:Lzj0/f;

    sget-object v1, Lzj0/f;->SUCCESS:Lzj0/f;

    sget-object v2, Lzj0/f;->FAILURE:Lzj0/f;

    sget-object v3, Lzj0/f;->INCOMPLETE:Lzj0/f;

    filled-new-array {v0, v1, v2, v3}, [Lzj0/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzj0/f;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lzj0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/f;->UNKNOWN:Lzj0/f;

    new-instance v0, Lzj0/f;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lzj0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/f;->SUCCESS:Lzj0/f;

    new-instance v0, Lzj0/f;

    const-string v1, "FAILURE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lzj0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/f;->FAILURE:Lzj0/f;

    new-instance v0, Lzj0/f;

    const-string v1, "INCOMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lzj0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/f;->INCOMPLETE:Lzj0/f;

    invoke-static {}, Lzj0/f;->$values()[Lzj0/f;

    move-result-object v0

    sput-object v0, Lzj0/f;->$VALUES:[Lzj0/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lzj0/f;->$ENTRIES:Lt83/a;

    new-instance v0, Lzj0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/f;->Companion:Lzj0/f$a;

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

    iput p3, p0, Lzj0/f;->value:I

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

    sget-object v0, Lzj0/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzj0/f;
    .locals 1

    const-class v0, Lzj0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzj0/f;

    return-object p0
.end method

.method public static values()[Lzj0/f;
    .locals 1

    sget-object v0, Lzj0/f;->$VALUES:[Lzj0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzj0/f;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lzj0/f;->value:I

    return v0
.end method
