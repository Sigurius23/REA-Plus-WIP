.class public final enum Ln6/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Ln6/s;

.field public static final synthetic x:[Ln6/s;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ln6/s;

    const-string v1, "Visible"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln6/s;->w:Ln6/s;

    new-instance v1, Ln6/s;

    const-string v2, "Invisible"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Ln6/s;

    const-string v3, "Gone"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2}, [Ln6/s;

    move-result-object v0

    sput-object v0, Ln6/s;->x:[Ln6/s;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ln6/s;
    .locals 1

    const-class v0, Ln6/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln6/s;

    return-object p0
.end method

.method public static values()[Ln6/s;
    .locals 1

    sget-object v0, Ln6/s;->x:[Ln6/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln6/s;

    return-object v0
.end method
