.class public final enum Lm40/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic x:[Lm40/e;

.field public static final synthetic y:Lt83/b;


# instance fields
.field public final w:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lm40/e;

    const-string v1, "png"

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const-string v2, "PNG"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lm40/e;-><init>(Ljava/lang/String;ILjava/util/List;)V

    new-instance v1, Lm40/e;

    const-string v2, "webp"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    const-string v3, "WEBP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lm40/e;-><init>(Ljava/lang/String;ILjava/util/List;)V

    new-instance v2, Lm40/e;

    const-string v3, "jpeg"

    const-string v4, "jpg"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const-string v4, "JPEG"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lm40/e;-><init>(Ljava/lang/String;ILjava/util/List;)V

    filled-new-array {v0, v1, v2}, [Lm40/e;

    move-result-object v0

    sput-object v0, Lm40/e;->x:[Lm40/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lm40/e;->y:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lm40/e;->w:Ljava/util/List;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm40/e;
    .locals 1

    const-class v0, Lm40/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm40/e;

    return-object p0
.end method

.method public static values()[Lm40/e;
    .locals 1

    sget-object v0, Lm40/e;->x:[Lm40/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm40/e;

    return-object v0
.end method
