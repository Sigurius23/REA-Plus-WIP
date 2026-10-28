.class public final enum Lsz/a0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lsz/a0;

.field public static final enum x:Lsz/a0;

.field public static final synthetic y:[Lsz/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lsz/a0;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsz/a0;->w:Lsz/a0;

    new-instance v1, Lsz/a0;

    const-string v2, "Full"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lsz/a0;->x:Lsz/a0;

    filled-new-array {v0, v1}, [Lsz/a0;

    move-result-object v0

    sput-object v0, Lsz/a0;->y:[Lsz/a0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lsz/a0;
    .locals 1

    const-class v0, Lsz/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsz/a0;

    return-object p0
.end method

.method public static values()[Lsz/a0;
    .locals 1

    sget-object v0, Lsz/a0;->y:[Lsz/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsz/a0;

    return-object v0
.end method
