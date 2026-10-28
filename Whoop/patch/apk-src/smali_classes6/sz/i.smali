.class public final enum Lsz/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic w:[Lsz/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lsz/i;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lsz/i;

    const-string v2, "Full"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1}, [Lsz/i;

    move-result-object v0

    sput-object v0, Lsz/i;->w:[Lsz/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lsz/i;
    .locals 1

    const-class v0, Lsz/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsz/i;

    return-object p0
.end method

.method public static values()[Lsz/i;
    .locals 1

    sget-object v0, Lsz/i;->w:[Lsz/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsz/i;

    return-object v0
.end method
