.class public final enum Lqr2/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqr2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqr2/a$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqr2/a$a;

.field public static final enum APPLICATION:Lqr2/a$a;

.field public static final enum BIOTELEMETRY:Lqr2/a$a;

.field public static final enum BLUETOOTH:Lqr2/a$a;

.field public static final enum CHATTY:Lqr2/a$a;

.field public static final enum HISTORY:Lqr2/a$a;

.field public static final enum IO:Lqr2/a$a;

.field public static final enum REAL_TIME:Lqr2/a$a;

.field public static final enum STATE_MACHINE:Lqr2/a$a;


# direct methods
.method private static synthetic $values()[Lqr2/a$a;
    .locals 8

    sget-object v0, Lqr2/a$a;->APPLICATION:Lqr2/a$a;

    sget-object v1, Lqr2/a$a;->BLUETOOTH:Lqr2/a$a;

    sget-object v2, Lqr2/a$a;->IO:Lqr2/a$a;

    sget-object v3, Lqr2/a$a;->CHATTY:Lqr2/a$a;

    sget-object v4, Lqr2/a$a;->STATE_MACHINE:Lqr2/a$a;

    sget-object v5, Lqr2/a$a;->REAL_TIME:Lqr2/a$a;

    sget-object v6, Lqr2/a$a;->HISTORY:Lqr2/a$a;

    sget-object v7, Lqr2/a$a;->BIOTELEMETRY:Lqr2/a$a;

    filled-new-array/range {v0 .. v7}, [Lqr2/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqr2/a$a;

    const-string v1, "APPLICATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->APPLICATION:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "BLUETOOTH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->BLUETOOTH:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "IO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->IO:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "CHATTY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->CHATTY:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "STATE_MACHINE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->STATE_MACHINE:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "REAL_TIME"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->REAL_TIME:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "HISTORY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->HISTORY:Lqr2/a$a;

    new-instance v0, Lqr2/a$a;

    const-string v1, "BIOTELEMETRY"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lqr2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqr2/a$a;->BIOTELEMETRY:Lqr2/a$a;

    invoke-static {}, Lqr2/a$a;->$values()[Lqr2/a$a;

    move-result-object v0

    sput-object v0, Lqr2/a$a;->$VALUES:[Lqr2/a$a;

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

.method public static valueOf(Ljava/lang/String;)Lqr2/a$a;
    .locals 1

    const-class v0, Lqr2/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqr2/a$a;

    return-object p0
.end method

.method public static values()[Lqr2/a$a;
    .locals 1

    sget-object v0, Lqr2/a$a;->$VALUES:[Lqr2/a$a;

    invoke-virtual {v0}, [Lqr2/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqr2/a$a;

    return-object v0
.end method
