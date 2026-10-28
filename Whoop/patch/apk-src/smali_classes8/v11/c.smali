.class public final enum Lv11/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv11/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lv11/c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "PRIMARY",
        "SECONDARY",
        "ICON",
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

.field private static final synthetic $VALUES:[Lv11/c;

.field public static final enum ICON:Lv11/c;

.field public static final enum PRIMARY:Lv11/c;

.field public static final enum SECONDARY:Lv11/c;


# direct methods
.method private static final synthetic $values()[Lv11/c;
    .locals 3

    sget-object v0, Lv11/c;->PRIMARY:Lv11/c;

    sget-object v1, Lv11/c;->SECONDARY:Lv11/c;

    sget-object v2, Lv11/c;->ICON:Lv11/c;

    filled-new-array {v0, v1, v2}, [Lv11/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv11/c;

    const-string v1, "PRIMARY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv11/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv11/c;->PRIMARY:Lv11/c;

    new-instance v0, Lv11/c;

    const-string v1, "SECONDARY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lv11/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv11/c;->SECONDARY:Lv11/c;

    new-instance v0, Lv11/c;

    const-string v1, "ICON"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lv11/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv11/c;->ICON:Lv11/c;

    invoke-static {}, Lv11/c;->$values()[Lv11/c;

    move-result-object v0

    sput-object v0, Lv11/c;->$VALUES:[Lv11/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lv11/c;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lv11/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv11/c;
    .locals 1

    const-class v0, Lv11/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv11/c;

    return-object p0
.end method

.method public static values()[Lv11/c;
    .locals 1

    sget-object v0, Lv11/c;->$VALUES:[Lv11/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv11/c;

    return-object v0
.end method
