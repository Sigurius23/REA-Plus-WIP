.class public Lah/k;
.super Lah/d;
.source "SourceFile"


# static fields
.field public static final d:Lah/k;


# instance fields
.field public final c:Lah/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lah/k;

    sget-object v1, Lah/l;->G:Lah/l;

    invoke-direct {v0, v1}, Lah/k;-><init>(Lah/l;)V

    sput-object v0, Lah/k;->d:Lah/k;

    return-void
.end method

.method public constructor <init>(Lah/l;)V
    .locals 1

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lah/d;-><init>(I)V

    iput-object p1, p0, Lah/k;->c:Lah/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lah/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/k;

    invoke-super {p0, p1}, Lah/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lah/k;->c:Lah/l;

    iget-object v0, v0, Lah/k;->c:Lah/l;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lah/d;->hashCode()I

    move-result v0

    iget-object v1, p0, Lah/k;->c:Lah/l;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lah/k;->c:Lah/l;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
