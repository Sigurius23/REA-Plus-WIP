.class public final enum Laa3/l1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic x:[Laa3/l1;

.field public static final synthetic y:Lt83/b;


# instance fields
.field public final w:Lba3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Laa3/l1;

    const-string v1, "DECLARATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Laa3/l1;-><init>(Ljava/lang/String;II)V

    new-instance v1, Laa3/l1;

    const-string v2, "FAKE_OVERRIDE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Laa3/l1;-><init>(Ljava/lang/String;II)V

    new-instance v2, Laa3/l1;

    const-string v3, "DELEGATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Laa3/l1;-><init>(Ljava/lang/String;II)V

    new-instance v3, Laa3/l1;

    const-string v4, "SYNTHESIZED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Laa3/l1;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0, v1, v2, v3}, [Laa3/l1;

    move-result-object v0

    sput-object v0, Laa3/l1;->x:[Laa3/l1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Laa3/l1;->y:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance p1, Lba3/h;

    sget-object p2, Lsa3/d;->p:Lsa3/c;

    const-string v0, "MEMBER_KIND"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lba3/h;-><init>(Lq1/j0;I)V

    iput-object p1, p0, Laa3/l1;->w:Lba3/h;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Laa3/l1;
    .locals 1

    const-class v0, Laa3/l1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laa3/l1;

    return-object p0
.end method

.method public static values()[Laa3/l1;
    .locals 1

    sget-object v0, Laa3/l1;->x:[Laa3/l1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa3/l1;

    return-object v0
.end method
