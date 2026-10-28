.class public final Li20/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li20/b0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Li20/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lh20/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li20/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Li20/a;-><init>(I)V

    sput-object v0, Li20/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lh20/h1;)V
    .locals 1

    const-string v0, "appearance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/a0;->w:Lh20/h1;

    return-void
.end method


# virtual methods
.method public final B(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "onBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x6ed2c2b5

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    const v0, -0x20aa8add

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, p4, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/4 v1, 0x0

    const/16 v2, 0x20

    if-le v0, v2, :cond_0

    invoke-virtual {p3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    and-int/lit8 v0, p4, 0x30

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_4

    :cond_3
    new-instance v2, Lg40/i3;

    const/16 v0, 0x12

    invoke-direct {v2, p2, v0}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/a;

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    and-int/lit8 p2, p4, 0xe

    invoke-static {p1, v2, p3, p2}, Lse/b;->a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final d0(Landroidx/compose/runtime/Composer;)J
    .locals 3

    check-cast p1, Lp1/q;

    const v0, -0xf13175b

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->h()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    return-wide v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e0()V
    .locals 1

    iget-object v0, p0, Li20/a0;->w:Lh20/h1;

    invoke-static {v0}, Luf/c0;->f0(Lh20/h1;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li20/a0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li20/a0;

    iget-object v1, p0, Li20/a0;->w:Lh20/h1;

    iget-object p1, p1, Li20/a0;->w:Lh20/h1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final h0(Lx1/b;Lp1/q;)V
    .locals 12

    const v0, 0x60df53dd

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lb30/l4;

    const/16 v1, 0xe

    invoke-direct {v0, p1, v1}, Lb30/l4;-><init>(Lx1/b;I)V

    const p1, -0x30131bf9

    invoke-static {p1, p2, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v11, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, p2

    invoke-static/range {v1 .. v11}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x0

    invoke-virtual {v9, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Li20/a0;->w:Lh20/h1;

    invoke-virtual {v0}, Lh20/h1;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PaymentElement(appearance="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li20/a0;->w:Lh20/h1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li20/a0;->w:Lh20/h1;

    invoke-virtual {v0, p1, p2}, Lh20/h1;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
