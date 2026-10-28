.class public final synthetic Lp1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lp1/f0;

.field public final synthetic x:Lx1/d;

.field public final synthetic y:La0/m0;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lp1/f0;Lx1/d;La0/m0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/d0;->w:Lp1/f0;

    iput-object p2, p0, Lp1/d0;->x:Lx1/d;

    iput-object p3, p0, Lp1/d0;->y:La0/m0;

    iput p4, p0, Lp1/d0;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lp1/d0;->w:Lp1/f0;

    if-eq p1, v0, :cond_2

    instance-of v0, p1, Lz1/z;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp1/d0;->x:Lx1/d;

    iget v0, v0, Lx1/d;->a:I

    iget v1, p0, Lp1/d0;->z:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lp1/d0;->y:La0/m0;

    invoke-virtual {v1, p1}, La0/m0;->d(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v3, v1, La0/m0;->c:[I

    aget v2, v3, v2

    goto :goto_0

    :cond_0
    const v2, 0x7fffffff

    :goto_0
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, p1, v0}, La0/m0;->h(Ljava/lang/Object;I)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A derived state calculation cannot read itself"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
