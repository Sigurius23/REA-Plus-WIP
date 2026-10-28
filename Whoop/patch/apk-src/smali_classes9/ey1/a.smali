.class public final enum Ley1/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ley1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ley1/a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "PRESENTED",
        "HIJACK_DETECTED",
        "metrics_release"
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

.field private static final synthetic $VALUES:[Ley1/a;

.field public static final enum HIJACK_DETECTED:Ley1/a;

.field public static final enum PRESENTED:Ley1/a;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ley1/a;
    .locals 2

    sget-object v0, Ley1/a;->PRESENTED:Ley1/a;

    sget-object v1, Ley1/a;->HIJACK_DETECTED:Ley1/a;

    filled-new-array {v0, v1}, [Ley1/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ley1/a;

    const/4 v1, 0x0

    const-string v2, "autopop.presented"

    const-string v3, "PRESENTED"

    invoke-direct {v0, v3, v1, v2}, Ley1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/a;->PRESENTED:Ley1/a;

    new-instance v0, Ley1/a;

    const/4 v1, 0x1

    const-string v2, "autopop.hijack_detected"

    const-string v3, "HIJACK_DETECTED"

    invoke-direct {v0, v3, v1, v2}, Ley1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/a;->HIJACK_DETECTED:Ley1/a;

    invoke-static {}, Ley1/a;->$values()[Ley1/a;

    move-result-object v0

    sput-object v0, Ley1/a;->$VALUES:[Ley1/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ley1/a;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Ley1/a;->value:Ljava/lang/String;

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

    sget-object v0, Ley1/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ley1/a;
    .locals 1

    const-class v0, Ley1/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ley1/a;

    return-object p0
.end method

.method public static values()[Ley1/a;
    .locals 1

    sget-object v0, Ley1/a;->$VALUES:[Ley1/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ley1/a;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ley1/a;->value:Ljava/lang/String;

    return-object v0
.end method
