.class public final enum Lny0/e0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lny0/e0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lny0/e0;",
        "",
        "Lb91/a;",
        "style",
        "<init>",
        "(Ljava/lang/String;ILb91/a;)V",
        "Lb91/a;",
        "getStyle",
        "()Lb91/a;",
        "TEXT",
        "NUMERIC",
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

.field private static final synthetic $VALUES:[Lny0/e0;

.field public static final enum NUMERIC:Lny0/e0;

.field public static final enum TEXT:Lny0/e0;


# instance fields
.field private final style:Lb91/a;


# direct methods
.method private static final synthetic $values()[Lny0/e0;
    .locals 2

    sget-object v0, Lny0/e0;->TEXT:Lny0/e0;

    sget-object v1, Lny0/e0;->NUMERIC:Lny0/e0;

    filled-new-array {v0, v1}, [Lny0/e0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lny0/e0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->m()Lb91/a;

    move-result-object v1

    const-string v2, "TEXT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lny0/e0;-><init>(Ljava/lang/String;ILb91/a;)V

    sput-object v0, Lny0/e0;->TEXT:Lny0/e0;

    new-instance v0, Lny0/e0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->E()Lb91/a;

    move-result-object v1

    const-string v2, "NUMERIC"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lny0/e0;-><init>(Ljava/lang/String;ILb91/a;)V

    sput-object v0, Lny0/e0;->NUMERIC:Lny0/e0;

    invoke-static {}, Lny0/e0;->$values()[Lny0/e0;

    move-result-object v0

    sput-object v0, Lny0/e0;->$VALUES:[Lny0/e0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lny0/e0;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILb91/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb91/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lny0/e0;->style:Lb91/a;

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

    sget-object v0, Lny0/e0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lny0/e0;
    .locals 1

    const-class v0, Lny0/e0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lny0/e0;

    return-object p0
.end method

.method public static values()[Lny0/e0;
    .locals 1

    sget-object v0, Lny0/e0;->$VALUES:[Lny0/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lny0/e0;

    return-object v0
.end method


# virtual methods
.method public final getStyle()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/e0;->style:Lb91/a;

    return-object v0
.end method
