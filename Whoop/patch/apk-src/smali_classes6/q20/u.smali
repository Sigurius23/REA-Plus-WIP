.class public final enum Lq20/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lq20/u;

.field public static final synthetic y:[Lq20/u;


# instance fields
.field public final w:Lq20/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lq20/u;

    const/4 v1, 0x0

    sget-object v2, Lq20/j;->x:Lq20/j;

    const-string v3, "GooglePay"

    invoke-direct {v0, v3, v1, v2}, Lq20/u;-><init>(Ljava/lang/String;ILq20/y;)V

    new-instance v1, Lq20/u;

    new-instance v2, Lq20/m;

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v2, v3, v3, v3, v4}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;I)V

    const-string v3, "Link"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lq20/u;-><init>(Ljava/lang/String;ILq20/y;)V

    sput-object v1, Lq20/u;->x:Lq20/u;

    filled-new-array {v0, v1}, [Lq20/u;

    move-result-object v0

    sput-object v0, Lq20/u;->y:[Lq20/u;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILq20/y;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lq20/u;->w:Lq20/y;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq20/u;
    .locals 1

    const-class v0, Lq20/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq20/u;

    return-object p0
.end method

.method public static values()[Lq20/u;
    .locals 1

    sget-object v0, Lq20/u;->y:[Lq20/u;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq20/u;

    return-object v0
.end method
