.class public final La1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/f;


# instance fields
.field public final w:J

.field public final synthetic x:La1/i;


# direct methods
.method public constructor <init>(La1/i;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/g;->x:La1/i;

    iput-wide p2, p0, La1/g;->w:J

    return-void
.end method


# virtual methods
.method public final G0(Ly2/y;)J
    .locals 3

    iget-object v0, p0, La1/g;->x:La1/i;

    iget-object v0, v0, La1/i;->R:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_0

    iget-wide v1, p0, La1/g;->w:J

    invoke-interface {p1, v0, v1, v2}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string p1, "Tried to open context menu before the anchor was placed."

    invoke-static {p1}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final s()Lx0/c;
    .locals 1

    iget-object v0, p0, La1/g;->x:La1/i;

    invoke-static {v0}, Lbi/g;->o(La3/n;)Lx0/c;

    move-result-object v0

    return-object v0
.end method

.method public final v0(Ly2/y;)Lh2/c;
    .locals 4

    invoke-virtual {p0, p1}, La1/g;->G0(Ly2/y;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object p1

    return-object p1
.end method
