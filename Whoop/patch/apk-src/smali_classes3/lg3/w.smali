.class public final enum Llg3/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Llg3/w;

.field public static final synthetic x:[Llg3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Llg3/w;

    const-string v1, "FULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg3/w;->w:Llg3/w;

    new-instance v1, Llg3/w;

    const-string v2, "FULL_STANDALONE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Llg3/w;

    const-string v3, "SHORT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Llg3/w;

    const-string v4, "SHORT_STANDALONE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v4, Llg3/w;

    const-string v5, "NARROW"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v5, Llg3/w;

    const-string v6, "NARROW_STANDALONE"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array/range {v0 .. v5}, [Llg3/w;

    move-result-object v0

    sput-object v0, Llg3/w;->x:[Llg3/w;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llg3/w;
    .locals 1

    const-class v0, Llg3/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg3/w;

    return-object p0
.end method

.method public static values()[Llg3/w;
    .locals 1

    sget-object v0, Llg3/w;->x:[Llg3/w;

    invoke-virtual {v0}, [Llg3/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg3/w;

    return-object v0
.end method
