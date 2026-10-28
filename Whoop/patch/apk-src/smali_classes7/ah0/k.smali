.class public final enum Lah0/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah0/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lah0/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0080\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0006j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lah0/k;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "isMultiSelect",
        "()Z",
        "isFreeText",
        "Companion",
        "a",
        "SINGLE_SELECT",
        "MULTI_SELECT",
        "FREE_TEXT",
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

.field private static final synthetic $VALUES:[Lah0/k;

.field public static final Companion:Lah0/k$a;

.field public static final enum FREE_TEXT:Lah0/k;

.field public static final enum MULTI_SELECT:Lah0/k;

.field public static final enum SINGLE_SELECT:Lah0/k;


# direct methods
.method private static final synthetic $values()[Lah0/k;
    .locals 3

    sget-object v0, Lah0/k;->SINGLE_SELECT:Lah0/k;

    sget-object v1, Lah0/k;->MULTI_SELECT:Lah0/k;

    sget-object v2, Lah0/k;->FREE_TEXT:Lah0/k;

    filled-new-array {v0, v1, v2}, [Lah0/k;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lah0/k;

    const-string v1, "SINGLE_SELECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lah0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/k;->SINGLE_SELECT:Lah0/k;

    new-instance v0, Lah0/k;

    const-string v1, "MULTI_SELECT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lah0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/k;->MULTI_SELECT:Lah0/k;

    new-instance v0, Lah0/k;

    const-string v1, "FREE_TEXT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lah0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/k;->FREE_TEXT:Lah0/k;

    invoke-static {}, Lah0/k;->$values()[Lah0/k;

    move-result-object v0

    sput-object v0, Lah0/k;->$VALUES:[Lah0/k;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lah0/k;->$ENTRIES:Lt83/a;

    new-instance v0, Lah0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lah0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lah0/k;->Companion:Lah0/k$a;

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

    sget-object v0, Lah0/k;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lah0/k;
    .locals 1

    const-class v0, Lah0/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lah0/k;

    return-object p0
.end method

.method public static values()[Lah0/k;
    .locals 1

    sget-object v0, Lah0/k;->$VALUES:[Lah0/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lah0/k;

    return-object v0
.end method


# virtual methods
.method public final isFreeText()Z
    .locals 1

    sget-object v0, Lah0/k;->FREE_TEXT:Lah0/k;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isMultiSelect()Z
    .locals 1

    sget-object v0, Lah0/k;->MULTI_SELECT:Lah0/k;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
