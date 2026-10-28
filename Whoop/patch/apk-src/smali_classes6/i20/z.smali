.class public final Li20/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li20/b0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Li20/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Li20/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li20/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li20/z;->w:Li20/z;

    new-instance v0, Li20/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Li20/a;-><init>(I)V

    sput-object v0, Li20/z;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final B(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 5

    const-string v0, "onBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, 0x482700ef

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lh00/j;

    const/4 v1, 0x1

    xor-int/2addr p1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v2, p1, v3, v2}, Lh00/j;-><init>(ZZLzy/c;Z)V

    const p1, 0x411422ff

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    and-int/lit8 p1, p4, 0x70

    xor-int/lit8 p1, p1, 0x30

    const/16 v4, 0x20

    if-le p1, v4, :cond_0

    invoke-virtual {p3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_0
    and-int/lit8 p1, p4, 0x30

    if-ne p1, v4, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez v1, :cond_3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p1, p4, :cond_4

    :cond_3
    new-instance p1, Lg40/i3;

    const/16 p4, 0x11

    invoke-direct {p1, p2, p4}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {p3, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p1, Lc93/a;

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    invoke-static {v0, v3, p1, p3, v2}, Lse/b;->i(Lh00/j;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final d0(Landroidx/compose/runtime/Composer;)J
    .locals 4

    check-cast p1, Lp1/q;

    const v0, 0x1d4a34c9

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    const v0, -0x1a6f7841

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    iget-wide v2, v0, Lg00/b;->b:J

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-wide v2
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e0()V
    .locals 0

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Li20/z;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final h0(Lx1/b;Lp1/q;)V
    .locals 2

    const v0, 0x18f6c601

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lb30/l4;

    const/16 v1, 0xd

    invoke-direct {v0, p1, v1}, Lb30/l4;-><init>(Lx1/b;I)V

    const p1, 0x15fe647d

    invoke-static {p1, p2, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/16 v0, 0x30

    const/4 v1, 0x0

    invoke-static {v1, p1, p2, v0}, Lg00/g;->a(Lwz/d0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x15ebd7a9

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Link"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
