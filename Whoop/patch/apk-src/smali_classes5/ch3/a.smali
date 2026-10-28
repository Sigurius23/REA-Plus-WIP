.class public final enum Lch3/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# static fields
.field public static final w:Lxg3/g;

.field public static final synthetic x:[Lch3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lch3/a;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0}, [Lch3/a;

    move-result-object v1

    sput-object v1, Lch3/a;->x:[Lch3/a;

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object v0

    sput-object v0, Lch3/a;->w:Lxg3/g;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lch3/a;
    .locals 1

    const-class v0, Lch3/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lch3/a;

    return-object p0
.end method

.method public static values()[Lch3/a;
    .locals 1

    sget-object v0, Lch3/a;->x:[Lch3/a;

    invoke-virtual {v0}, [Lch3/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lch3/a;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxg3/s;

    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    return-void
.end method
