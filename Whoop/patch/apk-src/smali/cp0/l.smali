.class public final enum Lcp0/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcp0/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcp0/l;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "isDrawerDetent",
        "()Z",
        "Bar",
        "Preview",
        "HalfDrawer",
        "GaugeLevel",
        "FullDrawer",
        "coach-everywhere_release"
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

.field private static final synthetic $VALUES:[Lcp0/l;

.field public static final enum Bar:Lcp0/l;

.field public static final enum FullDrawer:Lcp0/l;

.field public static final enum GaugeLevel:Lcp0/l;

.field public static final enum HalfDrawer:Lcp0/l;

.field public static final enum Preview:Lcp0/l;


# direct methods
.method private static final synthetic $values()[Lcp0/l;
    .locals 5

    sget-object v0, Lcp0/l;->Bar:Lcp0/l;

    sget-object v1, Lcp0/l;->Preview:Lcp0/l;

    sget-object v2, Lcp0/l;->HalfDrawer:Lcp0/l;

    sget-object v3, Lcp0/l;->GaugeLevel:Lcp0/l;

    sget-object v4, Lcp0/l;->FullDrawer:Lcp0/l;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcp0/l;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcp0/l;

    const-string v1, "Bar"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcp0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcp0/l;->Bar:Lcp0/l;

    new-instance v0, Lcp0/l;

    const-string v1, "Preview"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcp0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcp0/l;->Preview:Lcp0/l;

    new-instance v0, Lcp0/l;

    const-string v1, "HalfDrawer"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcp0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcp0/l;->HalfDrawer:Lcp0/l;

    new-instance v0, Lcp0/l;

    const-string v1, "GaugeLevel"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcp0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcp0/l;->GaugeLevel:Lcp0/l;

    new-instance v0, Lcp0/l;

    const-string v1, "FullDrawer"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcp0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcp0/l;->FullDrawer:Lcp0/l;

    invoke-static {}, Lcp0/l;->$values()[Lcp0/l;

    move-result-object v0

    sput-object v0, Lcp0/l;->$VALUES:[Lcp0/l;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcp0/l;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcp0/l;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcp0/l;
    .locals 1

    const-class v0, Lcp0/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcp0/l;

    return-object p0
.end method

.method public static values()[Lcp0/l;
    .locals 1

    sget-object v0, Lcp0/l;->$VALUES:[Lcp0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcp0/l;

    return-object v0
.end method


# virtual methods
.method public final isDrawerDetent()Z
    .locals 1

    sget-object v0, Lcp0/l;->HalfDrawer:Lcp0/l;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcp0/l;->GaugeLevel:Lcp0/l;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcp0/l;->FullDrawer:Lcp0/l;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
