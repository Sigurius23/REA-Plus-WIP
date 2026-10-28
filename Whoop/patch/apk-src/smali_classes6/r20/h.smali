.class public final enum Lr20/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lr20/h;

.field public static final enum x:Lr20/h;

.field public static final synthetic y:[Lr20/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lr20/h;

    const-string v1, "PrimaryButtonAnchored"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr20/h;->w:Lr20/h;

    new-instance v1, Lr20/h;

    const-string v2, "FullPage"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lr20/h;->x:Lr20/h;

    filled-new-array {v0, v1}, [Lr20/h;

    move-result-object v0

    sput-object v0, Lr20/h;->y:[Lr20/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr20/h;
    .locals 1

    const-class v0, Lr20/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr20/h;

    return-object p0
.end method

.method public static values()[Lr20/h;
    .locals 1

    sget-object v0, Lr20/h;->y:[Lr20/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr20/h;

    return-object v0
.end method
