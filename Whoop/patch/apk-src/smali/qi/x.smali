.class public final enum Lqi/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lqi/x;

.field public static final synthetic x:[Lqi/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqi/x;

    const-string v1, "MergePathsApi19"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqi/x;->w:Lqi/x;

    filled-new-array {v0}, [Lqi/x;

    move-result-object v0

    sput-object v0, Lqi/x;->x:[Lqi/x;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqi/x;
    .locals 1

    const-class v0, Lqi/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqi/x;

    return-object p0
.end method

.method public static values()[Lqi/x;
    .locals 1

    sget-object v0, Lqi/x;->x:[Lqi/x;

    invoke-virtual {v0}, [Lqi/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqi/x;

    return-object v0
.end method
