.class public final enum Lc61/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc61/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc61/a$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lc61/a$c;",
        "",
        "",
        "value",
        "code",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "getCode",
        "WEEK",
        "MONTH",
        "SIX_MONTH",
        "ALL",
        "NONE",
        "design_release"
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

.field private static final synthetic $VALUES:[Lc61/a$c;

.field public static final enum ALL:Lc61/a$c;

.field public static final enum MONTH:Lc61/a$c;

.field public static final enum NONE:Lc61/a$c;

.field public static final enum SIX_MONTH:Lc61/a$c;

.field public static final enum WEEK:Lc61/a$c;


# instance fields
.field private final code:Ljava/lang/String;

.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lc61/a$c;
    .locals 5

    sget-object v0, Lc61/a$c;->WEEK:Lc61/a$c;

    sget-object v1, Lc61/a$c;->MONTH:Lc61/a$c;

    sget-object v2, Lc61/a$c;->SIX_MONTH:Lc61/a$c;

    sget-object v3, Lc61/a$c;->ALL:Lc61/a$c;

    sget-object v4, Lc61/a$c;->NONE:Lc61/a$c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lc61/a$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lc61/a$c;

    const-string v1, "Week"

    const-string v2, "W"

    const-string v3, "WEEK"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lc61/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lc61/a$c;->WEEK:Lc61/a$c;

    new-instance v0, Lc61/a$c;

    const-string v1, "Month"

    const-string v2, "M"

    const-string v3, "MONTH"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lc61/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lc61/a$c;->MONTH:Lc61/a$c;

    new-instance v0, Lc61/a$c;

    const-string v1, "6 Month"

    const-string v2, "6M"

    const-string v3, "SIX_MONTH"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lc61/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lc61/a$c;->SIX_MONTH:Lc61/a$c;

    new-instance v0, Lc61/a$c;

    const/4 v1, 0x3

    const-string v2, "All"

    const-string v3, "ALL"

    invoke-direct {v0, v3, v1, v2, v3}, Lc61/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lc61/a$c;->ALL:Lc61/a$c;

    new-instance v0, Lc61/a$c;

    const/4 v1, 0x4

    const-string v2, "None"

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2, v3}, Lc61/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lc61/a$c;->NONE:Lc61/a$c;

    invoke-static {}, Lc61/a$c;->$values()[Lc61/a$c;

    move-result-object v0

    sput-object v0, Lc61/a$c;->$VALUES:[Lc61/a$c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lc61/a$c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lc61/a$c;->value:Ljava/lang/String;

    iput-object p4, p0, Lc61/a$c;->code:Ljava/lang/String;

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

    sget-object v0, Lc61/a$c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc61/a$c;
    .locals 1

    const-class v0, Lc61/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc61/a$c;

    return-object p0
.end method

.method public static values()[Lc61/a$c;
    .locals 1

    sget-object v0, Lc61/a$c;->$VALUES:[Lc61/a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc61/a$c;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc61/a$c;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc61/a$c;->value:Ljava/lang/String;

    return-object v0
.end method
