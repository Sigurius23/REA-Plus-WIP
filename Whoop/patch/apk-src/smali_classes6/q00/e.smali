.class public final Lq00/e;
.super Lq00/f;
.source "SourceFile"


# static fields
.field public static final c:Lq00/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq00/e;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lm83/y;->w:Lm83/y;

    const v3, 0x7f141052

    invoke-static {v3, v1, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v1

    const-string v2, "DebitOrCreditCard"

    invoke-direct {v0, v2, v1}, Lq00/f;-><init>(Ljava/lang/String;Lzy/b;)V

    sput-object v0, Lq00/e;->c:Lq00/e;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lq00/e;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x5b265639

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Card"

    return-object v0
.end method
