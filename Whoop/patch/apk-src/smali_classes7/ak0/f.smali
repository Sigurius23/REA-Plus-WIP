.class public final enum Lak0/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lak0/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lak0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0006j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lak0/f;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "Companion",
        "a",
        "SUCCESS",
        "PATTERN_UNDEFINED",
        "MAX_LOOPS_EXCEEDED",
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

.field private static final synthetic $VALUES:[Lak0/f;

.field public static final Companion:Lak0/f$a;

.field public static final enum MAX_LOOPS_EXCEEDED:Lak0/f;

.field public static final enum PATTERN_UNDEFINED:Lak0/f;

.field public static final enum SUCCESS:Lak0/f;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lak0/f;
    .locals 3

    sget-object v0, Lak0/f;->SUCCESS:Lak0/f;

    sget-object v1, Lak0/f;->PATTERN_UNDEFINED:Lak0/f;

    sget-object v2, Lak0/f;->MAX_LOOPS_EXCEEDED:Lak0/f;

    filled-new-array {v0, v1, v2}, [Lak0/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lak0/f;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lak0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lak0/f;->SUCCESS:Lak0/f;

    new-instance v0, Lak0/f;

    const/4 v1, 0x1

    const/16 v2, 0x8

    const-string v3, "PATTERN_UNDEFINED"

    invoke-direct {v0, v3, v1, v2}, Lak0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lak0/f;->PATTERN_UNDEFINED:Lak0/f;

    new-instance v0, Lak0/f;

    const/4 v1, 0x2

    const/16 v2, 0x9

    const-string v3, "MAX_LOOPS_EXCEEDED"

    invoke-direct {v0, v3, v1, v2}, Lak0/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lak0/f;->MAX_LOOPS_EXCEEDED:Lak0/f;

    invoke-static {}, Lak0/f;->$values()[Lak0/f;

    move-result-object v0

    sput-object v0, Lak0/f;->$VALUES:[Lak0/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lak0/f;->$ENTRIES:Lt83/a;

    new-instance v0, Lak0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lak0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lak0/f;->Companion:Lak0/f$a;

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

    iput p3, p0, Lak0/f;->value:I

    return-void
.end method

.method public static final synthetic access$getValue$p(Lak0/f;)I
    .locals 0

    iget p0, p0, Lak0/f;->value:I

    return p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lak0/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lak0/f;
    .locals 1

    const-class v0, Lak0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lak0/f;

    return-object p0
.end method

.method public static values()[Lak0/f;
    .locals 1

    sget-object v0, Lak0/f;->$VALUES:[Lak0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lak0/f;

    return-object v0
.end method
