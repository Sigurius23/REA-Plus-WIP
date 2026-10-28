.class public final enum Lbe/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lbe/b;

.field public static final x:Lbe/a;

.field public static final enum y:Lbe/b;

.field public static final enum z:Lbe/b;


# instance fields
.field public final w:Lef/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbe/b;

    new-instance v1, Lef/a;

    sget-object v2, Lcg/o;->i:Lcg/n;

    const-string v3, "http://169.254.169.254"

    invoke-static {v2, v3}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v3

    invoke-direct {v1, v3}, Lef/a;-><init>(Lcg/o;)V

    const-string v3, "IPv4"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1}, Lbe/b;-><init>(Ljava/lang/String;ILef/a;)V

    sput-object v0, Lbe/b;->y:Lbe/b;

    new-instance v1, Lbe/b;

    new-instance v3, Lef/a;

    const-string v4, "http://[fd00:ec2::254]"

    invoke-static {v2, v4}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v2

    invoke-direct {v3, v2}, Lef/a;-><init>(Lcg/o;)V

    const-string v2, "IPv6"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Lbe/b;-><init>(Ljava/lang/String;ILef/a;)V

    sput-object v1, Lbe/b;->z:Lbe/b;

    filled-new-array {v0, v1}, [Lbe/b;

    move-result-object v0

    sput-object v0, Lbe/b;->E:[Lbe/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lbe/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbe/b;->x:Lbe/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILef/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbe/b;->w:Lef/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbe/b;
    .locals 1

    const-class v0, Lbe/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbe/b;

    return-object p0
.end method

.method public static values()[Lbe/b;
    .locals 1

    sget-object v0, Lbe/b;->E:[Lbe/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbe/b;

    return-object v0
.end method
