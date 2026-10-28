.class public final enum Lh20/i2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final w:Lh20/t;

.field public static final x:Lh20/i2;

.field public static final synthetic y:[Lh20/i2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh20/i2;

    const-string v1, "Filled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lh20/i2;

    const-string v2, "Outlined"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1}, [Lh20/i2;

    move-result-object v1

    sput-object v1, Lh20/i2;->y:[Lh20/i2;

    invoke-static {v1}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v1, Lh20/t;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lh20/i2;->w:Lh20/t;

    sput-object v0, Lh20/i2;->x:Lh20/i2;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh20/i2;
    .locals 1

    const-class v0, Lh20/i2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh20/i2;

    return-object p0
.end method

.method public static values()[Lh20/i2;
    .locals 1

    sget-object v0, Lh20/i2;->y:[Lh20/i2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh20/i2;

    return-object v0
.end method
