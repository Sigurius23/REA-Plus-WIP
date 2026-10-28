.class public final enum Lah0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah0/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lah0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lah0/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "GREY_OUT_ALL",
        "COLLAPSE_TO_SELECTED",
        "bot_release"
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

.field private static final synthetic $VALUES:[Lah0/b;

.field public static final enum COLLAPSE_TO_SELECTED:Lah0/b;

.field public static final Companion:Lah0/b$a;

.field public static final enum GREY_OUT_ALL:Lah0/b;


# direct methods
.method private static final synthetic $values()[Lah0/b;
    .locals 2

    sget-object v0, Lah0/b;->GREY_OUT_ALL:Lah0/b;

    sget-object v1, Lah0/b;->COLLAPSE_TO_SELECTED:Lah0/b;

    filled-new-array {v0, v1}, [Lah0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lah0/b;

    const-string v1, "GREY_OUT_ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lah0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/b;->GREY_OUT_ALL:Lah0/b;

    new-instance v0, Lah0/b;

    const-string v1, "COLLAPSE_TO_SELECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lah0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/b;->COLLAPSE_TO_SELECTED:Lah0/b;

    invoke-static {}, Lah0/b;->$values()[Lah0/b;

    move-result-object v0

    sput-object v0, Lah0/b;->$VALUES:[Lah0/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lah0/b;->$ENTRIES:Lt83/a;

    new-instance v0, Lah0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lah0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lah0/b;->Companion:Lah0/b$a;

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

    sget-object v0, Lah0/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lah0/b;
    .locals 1

    const-class v0, Lah0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lah0/b;

    return-object p0
.end method

.method public static values()[Lah0/b;
    .locals 1

    sget-object v0, Lah0/b;->$VALUES:[Lah0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lah0/b;

    return-object v0
.end method
