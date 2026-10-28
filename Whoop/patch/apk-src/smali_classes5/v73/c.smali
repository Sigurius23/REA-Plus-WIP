.class public final enum Lv73/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp73/b;


# static fields
.field public static final enum w:Lv73/c;

.field public static final synthetic x:[Lv73/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv73/c;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv73/c;->w:Lv73/c;

    filled-new-array {v0}, [Lv73/c;

    move-result-object v0

    sput-object v0, Lv73/c;->x:[Lv73/c;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv73/c;
    .locals 1

    const-class v0, Lv73/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv73/c;

    return-object p0
.end method

.method public static values()[Lv73/c;
    .locals 1

    sget-object v0, Lv73/c;->x:[Lv73/c;

    invoke-virtual {v0}, [Lv73/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv73/c;

    return-object v0
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Leg3/b;

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Leg3/b;->request(J)V

    return-void
.end method
