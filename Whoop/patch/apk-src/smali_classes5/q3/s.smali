.class public final Lq3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/g0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll3/g;)Lq3/e0;
    .locals 3

    new-instance v0, Lq3/e0;

    new-instance v1, Ll3/g;

    const/16 v2, 0x2022

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1, v2}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ll3/g;-><init>(Ljava/lang/String;)V

    sget-object p1, Lq3/q;->a:Lq3/f0;

    invoke-direct {v0, v1, p1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lq3/s;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const/16 v0, 0x2022

    invoke-static {v0}, Ljava/lang/Character;->hashCode(C)I

    move-result v0

    return v0
.end method
