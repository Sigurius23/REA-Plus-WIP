.class public final enum Lm40/f;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lm40/h;


# static fields
.field public static final synthetic E:[Lm40/f;

.field public static final synthetic F:Lt83/b;

.field public static final enum x:Lm40/f;

.field public static final enum y:Lm40/f;

.field public static final enum z:Lm40/f;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lm40/f;

    const/4 v1, 0x0

    const-string v2, "image/jpeg"

    const-string v3, "Jpeg"

    invoke-direct {v0, v3, v1, v2}, Lm40/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm40/f;->x:Lm40/f;

    new-instance v1, Lm40/f;

    const/4 v2, 0x1

    const-string v3, "image/png"

    const-string v4, "Png"

    invoke-direct {v1, v4, v2, v3}, Lm40/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lm40/f;->y:Lm40/f;

    new-instance v2, Lm40/f;

    const/4 v3, 0x2

    const-string v4, "image/webp"

    const-string v5, "Webp"

    invoke-direct {v2, v5, v3, v4}, Lm40/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lm40/f;->z:Lm40/f;

    filled-new-array {v0, v1, v2}, [Lm40/f;

    move-result-object v0

    sput-object v0, Lm40/f;->E:[Lm40/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lm40/f;->F:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lm40/f;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm40/f;
    .locals 1

    const-class v0, Lm40/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm40/f;

    return-object p0
.end method

.method public static values()[Lm40/f;
    .locals 1

    sget-object v0, Lm40/f;->E:[Lm40/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm40/f;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm40/f;->w:Ljava/lang/String;

    return-object v0
.end method
