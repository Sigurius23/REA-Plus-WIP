.class public final enum Lny0/y0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lny0/y0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lny0/y0;",
        "",
        "Lb91/a;",
        "style",
        "Ll0/k1;",
        "padding",
        "<init>",
        "(Ljava/lang/String;ILb91/a;Ll0/k1;)V",
        "Lb91/a;",
        "getStyle",
        "()Lb91/a;",
        "Ll0/k1;",
        "getPadding",
        "()Ll0/k1;",
        "TextSmall",
        "TextLarge",
        "NumberSmall",
        "NumberLarge",
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

.field private static final synthetic $VALUES:[Lny0/y0;

.field public static final enum NumberLarge:Lny0/y0;

.field public static final enum NumberSmall:Lny0/y0;

.field public static final enum TextLarge:Lny0/y0;

.field public static final enum TextSmall:Lny0/y0;


# instance fields
.field private final padding:Ll0/k1;

.field private final style:Lb91/a;


# direct methods
.method private static final synthetic $values()[Lny0/y0;
    .locals 4

    sget-object v0, Lny0/y0;->TextSmall:Lny0/y0;

    sget-object v1, Lny0/y0;->TextLarge:Lny0/y0;

    sget-object v2, Lny0/y0;->NumberSmall:Lny0/y0;

    sget-object v3, Lny0/y0;->NumberLarge:Lny0/y0;

    filled-new-array {v0, v1, v2, v3}, [Lny0/y0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lny0/y0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->r()Lb91/a;

    move-result-object v1

    const/4 v2, 0x1

    int-to-float v3, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    new-instance v5, Ll0/l1;

    invoke-direct {v5, v3, v3, v3, v3}, Ll0/l1;-><init>(FFFF)V

    const-string v6, "TextSmall"

    const/4 v7, 0x0

    invoke-direct {v0, v6, v7, v1, v5}, Lny0/y0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;)V

    sput-object v0, Lny0/y0;->TextSmall:Lny0/y0;

    new-instance v0, Lny0/y0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->r()Lb91/a;

    move-result-object v1

    const/4 v5, 0x2

    int-to-float v6, v5

    mul-float/2addr v6, v4

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v6, v6, v6, v6}, Ll0/l1;-><init>(FFFF)V

    const-string v7, "TextLarge"

    invoke-direct {v0, v7, v2, v1, v4}, Lny0/y0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;)V

    sput-object v0, Lny0/y0;->TextLarge:Lny0/y0;

    new-instance v0, Lny0/y0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->D()Lb91/a;

    move-result-object v1

    new-instance v2, Ll0/l1;

    invoke-direct {v2, v3, v3, v3, v3}, Ll0/l1;-><init>(FFFF)V

    const-string v3, "NumberSmall"

    invoke-direct {v0, v3, v5, v1, v2}, Lny0/y0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;)V

    sput-object v0, Lny0/y0;->NumberSmall:Lny0/y0;

    new-instance v0, Lny0/y0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->D()Lb91/a;

    move-result-object v1

    new-instance v2, Ll0/l1;

    invoke-direct {v2, v6, v6, v6, v6}, Ll0/l1;-><init>(FFFF)V

    const-string v3, "NumberLarge"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lny0/y0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;)V

    sput-object v0, Lny0/y0;->NumberLarge:Lny0/y0;

    invoke-static {}, Lny0/y0;->$values()[Lny0/y0;

    move-result-object v0

    sput-object v0, Lny0/y0;->$VALUES:[Lny0/y0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lny0/y0;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILb91/a;Ll0/k1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb91/a;",
            "Ll0/k1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lny0/y0;->style:Lb91/a;

    iput-object p4, p0, Lny0/y0;->padding:Ll0/k1;

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

    sget-object v0, Lny0/y0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lny0/y0;
    .locals 1

    const-class v0, Lny0/y0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lny0/y0;

    return-object p0
.end method

.method public static values()[Lny0/y0;
    .locals 1

    sget-object v0, Lny0/y0;->$VALUES:[Lny0/y0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lny0/y0;

    return-object v0
.end method


# virtual methods
.method public final getPadding()Ll0/k1;
    .locals 1

    iget-object v0, p0, Lny0/y0;->padding:Ll0/k1;

    return-object v0
.end method

.method public final getStyle()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/y0;->style:Lb91/a;

    return-object v0
.end method
