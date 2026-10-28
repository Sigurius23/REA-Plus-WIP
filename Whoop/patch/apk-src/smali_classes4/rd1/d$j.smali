.class final enum Lrd1/d$j;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lod1/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrd1/d$j;",
        ">;",
        "Lod1/t$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lrd1/d$j;

.field public static final enum DISABLE:Lrd1/d$j;

.field public static final enum DISABLED:Lrd1/d$j;

.field public static final enum DISCONNECTED:Lrd1/d$j;

.field public static final enum ENABLE:Lrd1/d$j;

.field public static final enum ENABLED:Lrd1/d$j;

.field public static final enum ENABLED_PRIMING:Lrd1/d$j;

.field public static final enum PRIMING_COMPLETE:Lrd1/d$j;

.field public static final enum REAL_TIME_DATA_RECEIVED:Lrd1/d$j;


# direct methods
.method private static synthetic $values()[Lrd1/d$j;
    .locals 8

    sget-object v0, Lrd1/d$j;->DISCONNECTED:Lrd1/d$j;

    sget-object v1, Lrd1/d$j;->ENABLE:Lrd1/d$j;

    sget-object v2, Lrd1/d$j;->ENABLED_PRIMING:Lrd1/d$j;

    sget-object v3, Lrd1/d$j;->PRIMING_COMPLETE:Lrd1/d$j;

    sget-object v4, Lrd1/d$j;->ENABLED:Lrd1/d$j;

    sget-object v5, Lrd1/d$j;->REAL_TIME_DATA_RECEIVED:Lrd1/d$j;

    sget-object v6, Lrd1/d$j;->DISABLE:Lrd1/d$j;

    sget-object v7, Lrd1/d$j;->DISABLED:Lrd1/d$j;

    filled-new-array/range {v0 .. v7}, [Lrd1/d$j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrd1/d$j;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->DISCONNECTED:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "ENABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->ENABLE:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "ENABLED_PRIMING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->ENABLED_PRIMING:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "PRIMING_COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->PRIMING_COMPLETE:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "ENABLED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->ENABLED:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "REAL_TIME_DATA_RECEIVED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->REAL_TIME_DATA_RECEIVED:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "DISABLE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->DISABLE:Lrd1/d$j;

    new-instance v0, Lrd1/d$j;

    const-string v1, "DISABLED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lrd1/d$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/d$j;->DISABLED:Lrd1/d$j;

    invoke-static {}, Lrd1/d$j;->$values()[Lrd1/d$j;

    move-result-object v0

    sput-object v0, Lrd1/d$j;->$VALUES:[Lrd1/d$j;

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

.method public static valueOf(Ljava/lang/String;)Lrd1/d$j;
    .locals 1

    const-class v0, Lrd1/d$j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrd1/d$j;

    return-object p0
.end method

.method public static values()[Lrd1/d$j;
    .locals 1

    sget-object v0, Lrd1/d$j;->$VALUES:[Lrd1/d$j;

    invoke-virtual {v0}, [Lrd1/d$j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrd1/d$j;

    return-object v0
.end method
