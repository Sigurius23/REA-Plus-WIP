.class public final Lrm/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final F:Lqa/b;


# instance fields
.field public final E:Lrm/g0;

.field public final w:Ljava/lang/String;

.field public final x:Lrm/i0;

.field public final y:Lrm/h0;

.field public final z:Lrm/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lrm/e0;

    invoke-direct {v0}, Lrm/e0;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lrm/g0;

    invoke-direct {v1, v0}, Lrm/f0;-><init>(Lrm/e0;)V

    new-instance v2, Lrm/h0;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const v9, -0x800001

    move-wide v5, v3

    move-wide v7, v3

    move v10, v9

    invoke-direct/range {v2 .. v10}, Lrm/h0;-><init>(JJJFF)V

    sget-object v0, Lrm/m0;->h0:Lrm/m0;

    new-instance v0, Lqa/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lqa/b;-><init>(I)V

    sput-object v0, Lrm/k0;->F:Lqa/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lrm/g0;Lrm/i0;Lrm/h0;Lrm/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/k0;->w:Ljava/lang/String;

    iput-object p3, p0, Lrm/k0;->x:Lrm/i0;

    iput-object p4, p0, Lrm/k0;->y:Lrm/h0;

    iput-object p5, p0, Lrm/k0;->z:Lrm/m0;

    iput-object p2, p0, Lrm/k0;->E:Lrm/g0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lrm/k0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lrm/k0;

    iget-object v0, p0, Lrm/k0;->w:Ljava/lang/String;

    iget-object v1, p1, Lrm/k0;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrm/k0;->E:Lrm/g0;

    iget-object v1, p1, Lrm/k0;->E:Lrm/g0;

    invoke-virtual {v0, v1}, Lrm/f0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrm/k0;->x:Lrm/i0;

    iget-object v1, p1, Lrm/k0;->x:Lrm/i0;

    invoke-static {v0, v1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrm/k0;->y:Lrm/h0;

    iget-object v1, p1, Lrm/k0;->y:Lrm/h0;

    invoke-virtual {v0, v1}, Lrm/h0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrm/k0;->z:Lrm/m0;

    iget-object p1, p1, Lrm/k0;->z:Lrm/m0;

    invoke-static {v0, p1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lrm/k0;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrm/k0;->x:Lrm/i0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lrm/i0;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrm/k0;->y:Lrm/h0;

    invoke-virtual {v1}, Lrm/h0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lrm/k0;->E:Lrm/g0;

    invoke-virtual {v0}, Lrm/f0;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrm/k0;->z:Lrm/m0;

    invoke-virtual {v1}, Lrm/m0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
