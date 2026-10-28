.class public final enum Lam/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lam/g;

.field public static final synthetic y:[Lam/g;


# instance fields
.field public final w:Ll0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lam/g;

    const/4 v1, 0x0

    sget-object v2, Ll0/m;->e:Ll0/h;

    const-string v3, "Center"

    invoke-direct {v0, v3, v1, v2}, Lam/g;-><init>(Ljava/lang/String;ILl0/l;)V

    new-instance v1, Lam/g;

    const/4 v2, 0x1

    sget-object v3, Ll0/m;->c:Ll0/g;

    const-string v4, "Start"

    invoke-direct {v1, v4, v2, v3}, Lam/g;-><init>(Ljava/lang/String;ILl0/l;)V

    sput-object v1, Lam/g;->x:Lam/g;

    new-instance v2, Lam/g;

    const/4 v3, 0x2

    sget-object v4, Ll0/m;->d:Ll0/g;

    const-string v5, "End"

    invoke-direct {v2, v5, v3, v4}, Lam/g;-><init>(Ljava/lang/String;ILl0/l;)V

    new-instance v3, Lam/g;

    const/4 v4, 0x3

    sget-object v5, Ll0/m;->f:Ll0/h;

    const-string v6, "SpaceEvenly"

    invoke-direct {v3, v6, v4, v5}, Lam/g;-><init>(Ljava/lang/String;ILl0/l;)V

    new-instance v4, Lam/g;

    const/4 v5, 0x4

    sget-object v6, Ll0/m;->g:Ll0/h;

    const-string v7, "SpaceBetween"

    invoke-direct {v4, v7, v5, v6}, Lam/g;-><init>(Ljava/lang/String;ILl0/l;)V

    new-instance v5, Lam/g;

    const/4 v6, 0x5

    sget-object v7, Ll0/m;->h:Ll0/h;

    const-string v8, "SpaceAround"

    invoke-direct {v5, v8, v6, v7}, Lam/g;-><init>(Ljava/lang/String;ILl0/l;)V

    filled-new-array/range {v0 .. v5}, [Lam/g;

    move-result-object v0

    sput-object v0, Lam/g;->y:[Lam/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILl0/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lam/g;->w:Ll0/l;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lam/g;
    .locals 1

    const-class v0, Lam/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lam/g;

    return-object p0
.end method

.method public static values()[Lam/g;
    .locals 1

    sget-object v0, Lam/g;->y:[Lam/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lam/g;

    return-object v0
.end method
