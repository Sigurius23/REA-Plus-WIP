.class public final enum Ltd1/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltd1/a$a;,
        Ltd1/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltd1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ltd1/a;",
        "",
        "",
        "hardwareFamily",
        "<init>",
        "(Ljava/lang/String;II)V",
        "",
        "analyticsName",
        "()Ljava/lang/String;",
        "I",
        "getHardwareFamily",
        "()I",
        "Companion",
        "a",
        "MAVERICK",
        "HARVARD",
        "UNKNOWN",
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

.field private static final synthetic $VALUES:[Ltd1/a;

.field public static final Companion:Ltd1/a$a;

.field public static final enum HARVARD:Ltd1/a;

.field public static final enum MAVERICK:Ltd1/a;

.field public static final enum UNKNOWN:Ltd1/a;


# instance fields
.field private final hardwareFamily:I


# direct methods
.method private static final synthetic $values()[Ltd1/a;
    .locals 3

    sget-object v0, Ltd1/a;->MAVERICK:Ltd1/a;

    sget-object v1, Ltd1/a;->HARVARD:Ltd1/a;

    sget-object v2, Ltd1/a;->UNKNOWN:Ltd1/a;

    filled-new-array {v0, v1, v2}, [Ltd1/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ltd1/a;

    const/4 v1, 0x0

    const/16 v2, 0xd

    const-string v3, "MAVERICK"

    invoke-direct {v0, v3, v1, v2}, Ltd1/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltd1/a;->MAVERICK:Ltd1/a;

    new-instance v0, Ltd1/a;

    const/4 v1, 0x1

    const/4 v2, 0x6

    const-string v3, "HARVARD"

    invoke-direct {v0, v3, v1, v2}, Ltd1/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltd1/a;->HARVARD:Ltd1/a;

    new-instance v0, Ltd1/a;

    const/4 v1, 0x2

    const/4 v2, -0x1

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Ltd1/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltd1/a;->UNKNOWN:Ltd1/a;

    invoke-static {}, Ltd1/a;->$values()[Ltd1/a;

    move-result-object v0

    sput-object v0, Ltd1/a;->$VALUES:[Ltd1/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ltd1/a;->$ENTRIES:Lt83/a;

    new-instance v0, Ltd1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltd1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltd1/a;->Companion:Ltd1/a$a;

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

    iput p3, p0, Ltd1/a;->hardwareFamily:I

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

    sget-object v0, Ltd1/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltd1/a;
    .locals 1

    const-class v0, Ltd1/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltd1/a;

    return-object p0
.end method

.method public static values()[Ltd1/a;
    .locals 1

    sget-object v0, Ltd1/a;->$VALUES:[Ltd1/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltd1/a;

    return-object v0
.end method


# virtual methods
.method public final analyticsName()Ljava/lang/String;
    .locals 2

    sget-object v0, Ltd1/a$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "Gen4"

    return-object v0

    :cond_2
    const-string v0, "Maverick"

    return-object v0
.end method

.method public final getHardwareFamily()I
    .locals 1

    iget v0, p0, Ltd1/a;->hardwareFamily:I

    return v0
.end method
