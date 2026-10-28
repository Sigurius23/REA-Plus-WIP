.class public final enum Ldz/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Ldz/a;

.field public static final synthetic y:[Ldz/a;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ldz/a;

    const/4 v1, 0x0

    const-string v2, "edit"

    const-string v3, "Edit"

    invoke-direct {v0, v3, v1, v2}, Ldz/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldz/a;->x:Ldz/a;

    new-instance v1, Ldz/a;

    const/4 v2, 0x1

    const-string v3, "add"

    const-string v4, "Add"

    invoke-direct {v1, v4, v2, v3}, Ldz/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1}, [Ldz/a;

    move-result-object v0

    sput-object v0, Ldz/a;->y:[Ldz/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ldz/a;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldz/a;
    .locals 1

    const-class v0, Ldz/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldz/a;

    return-object p0
.end method

.method public static values()[Ldz/a;
    .locals 1

    sget-object v0, Ldz/a;->y:[Ldz/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldz/a;

    return-object v0
.end method
