.class public final enum Lya3/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lya3/q;

.field public static final synthetic x:[Lya3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lya3/q;

    const-string v1, "MustUse"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lya3/q;->w:Lya3/q;

    new-instance v1, Lya3/q;

    const-string v2, "ExplicitlyIgnorable"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Lya3/q;

    const-string v3, "Unspecified"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2}, [Lya3/q;

    move-result-object v0

    sput-object v0, Lya3/q;->x:[Lya3/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lya3/q;
    .locals 1

    const-class v0, Lya3/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lya3/q;

    return-object p0
.end method

.method public static values()[Lya3/q;
    .locals 1

    sget-object v0, Lya3/q;->x:[Lya3/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lya3/q;

    return-object v0
.end method
