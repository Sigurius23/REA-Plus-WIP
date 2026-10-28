.class public final enum Lk81/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk81/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lk81/a;",
        "",
        "Lb2/f;",
        "horizontalAlignment",
        "<init>",
        "(Ljava/lang/String;ILb2/f;)V",
        "Lb2/f;",
        "getHorizontalAlignment",
        "()Lb2/f;",
        "LEADING",
        "CENTER",
        "TRAILING",
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

.field private static final synthetic $VALUES:[Lk81/a;

.field public static final enum CENTER:Lk81/a;

.field public static final enum LEADING:Lk81/a;

.field public static final enum TRAILING:Lk81/a;


# instance fields
.field private final horizontalAlignment:Lb2/f;


# direct methods
.method private static final synthetic $values()[Lk81/a;
    .locals 3

    sget-object v0, Lk81/a;->LEADING:Lk81/a;

    sget-object v1, Lk81/a;->CENTER:Lk81/a;

    sget-object v2, Lk81/a;->TRAILING:Lk81/a;

    filled-new-array {v0, v1, v2}, [Lk81/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk81/a;

    const/4 v1, 0x0

    sget-object v2, Lb2/e;->M:Lb2/k;

    const-string v3, "LEADING"

    invoke-direct {v0, v3, v1, v2}, Lk81/a;-><init>(Ljava/lang/String;ILb2/f;)V

    sput-object v0, Lk81/a;->LEADING:Lk81/a;

    new-instance v0, Lk81/a;

    const/4 v1, 0x1

    sget-object v2, Lb2/e;->N:Lb2/k;

    const-string v3, "CENTER"

    invoke-direct {v0, v3, v1, v2}, Lk81/a;-><init>(Ljava/lang/String;ILb2/f;)V

    sput-object v0, Lk81/a;->CENTER:Lk81/a;

    new-instance v0, Lk81/a;

    const/4 v1, 0x2

    sget-object v2, Lb2/e;->O:Lb2/k;

    const-string v3, "TRAILING"

    invoke-direct {v0, v3, v1, v2}, Lk81/a;-><init>(Ljava/lang/String;ILb2/f;)V

    sput-object v0, Lk81/a;->TRAILING:Lk81/a;

    invoke-static {}, Lk81/a;->$values()[Lk81/a;

    move-result-object v0

    sput-object v0, Lk81/a;->$VALUES:[Lk81/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lk81/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILb2/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb2/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lk81/a;->horizontalAlignment:Lb2/f;

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

    sget-object v0, Lk81/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk81/a;
    .locals 1

    const-class v0, Lk81/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk81/a;

    return-object p0
.end method

.method public static values()[Lk81/a;
    .locals 1

    sget-object v0, Lk81/a;->$VALUES:[Lk81/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk81/a;

    return-object v0
.end method


# virtual methods
.method public final getHorizontalAlignment()Lb2/f;
    .locals 1

    iget-object v0, p0, Lk81/a;->horizontalAlignment:Lb2/f;

    return-object v0
.end method
