.class public final enum Lf20/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lf20/b;

.field public static final enum x:Lf20/b;

.field public static final synthetic y:[Lf20/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf20/b;

    const-string v1, "Full"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf20/b;->w:Lf20/b;

    new-instance v1, Lf20/b;

    const-string v2, "Lite"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf20/b;->x:Lf20/b;

    filled-new-array {v0, v1}, [Lf20/b;

    move-result-object v0

    sput-object v0, Lf20/b;->y:[Lf20/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf20/b;
    .locals 1

    const-class v0, Lf20/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf20/b;

    return-object p0
.end method

.method public static values()[Lf20/b;
    .locals 1

    sget-object v0, Lf20/b;->y:[Lf20/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf20/b;

    return-object v0
.end method
