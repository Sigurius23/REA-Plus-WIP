.class public final enum Lbg/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lbg/m;

.field public static final synthetic x:[Lbg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lbg/m;

    const-string v1, "TLS_1_0"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lbg/m;

    const-string v2, "TLS_1_1"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Lbg/m;

    const-string v3, "TLS_1_2"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lbg/m;->w:Lbg/m;

    new-instance v3, Lbg/m;

    const-string v4, "TLS_1_3"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2, v3}, [Lbg/m;

    move-result-object v0

    sput-object v0, Lbg/m;->x:[Lbg/m;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbg/m;
    .locals 1

    const-class v0, Lbg/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbg/m;

    return-object p0
.end method

.method public static values()[Lbg/m;
    .locals 1

    sget-object v0, Lbg/m;->x:[Lbg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbg/m;

    return-object v0
.end method
