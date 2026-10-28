.class public final enum Lwz/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lwz/c;

.field public static final enum x:Lwz/c;

.field public static final synthetic y:[Lwz/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lwz/c;

    const-string v1, "LoggedOut"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwz/c;->w:Lwz/c;

    new-instance v1, Lwz/c;

    const-string v2, "PaymentConfirmed"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwz/c;->x:Lwz/c;

    filled-new-array {v0, v1}, [Lwz/c;

    move-result-object v0

    sput-object v0, Lwz/c;->y:[Lwz/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwz/c;
    .locals 1

    const-class v0, Lwz/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwz/c;

    return-object p0
.end method

.method public static values()[Lwz/c;
    .locals 1

    sget-object v0, Lwz/c;->y:[Lwz/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwz/c;

    return-object v0
.end method
