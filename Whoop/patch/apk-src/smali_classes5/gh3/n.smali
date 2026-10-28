.class public final enum Lgh3/n;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lbh3/g;


# static fields
.field public static final enum w:Lgh3/n;

.field public static final synthetic x:[Lgh3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgh3/n;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgh3/n;->w:Lgh3/n;

    filled-new-array {v0}, [Lgh3/n;

    move-result-object v0

    sput-object v0, Lgh3/n;->x:[Lgh3/n;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgh3/n;
    .locals 1

    const-class v0, Lgh3/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgh3/n;

    return-object p0
.end method

.method public static values()[Lgh3/n;
    .locals 1

    sget-object v0, Lgh3/n;->x:[Lgh3/n;

    invoke-virtual {v0}, [Lgh3/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgh3/n;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method
