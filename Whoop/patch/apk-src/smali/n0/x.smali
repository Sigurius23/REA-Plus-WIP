.class public abstract Ln0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v5, Ln0/w;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v16, Lh0/d2;->w:Lh0/d2;

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v8

    invoke-static {}, Lvb/g;->a()Ly3/d;

    move-result-object v9

    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-static {v0, v0, v1}, Ly3/b;->b(III)J

    move-result-wide v10

    new-instance v0, Ln0/n;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v12, Lm83/y;->w:Lm83/y;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v18}, Ln0/n;-><init>(Ln0/o;IZFLy2/s0;FZLbc3/c0;Ly3/c;JLjava/util/List;IIILh0/d2;II)V

    sput-object v0, Ln0/x;->a:Ln0/n;

    return-void
.end method

.method public static final a(IILandroidx/compose/runtime/Composer;I)Ln0/u;
    .locals 4

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p1, v1

    :cond_1
    new-array p3, v1, [Ljava/lang/Object;

    sget-object v0, Ln0/u;->x:Lp0/n0;

    move-object v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p0}, Lp1/q;->e(I)Z

    move-result v2

    move-object v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->e(I)Z

    move-result v3

    or-int/2addr v2, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_3

    :cond_2
    new-instance v3, Ln0/v;

    invoke-direct {v3, p0, p1}, Ln0/v;-><init>(II)V

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lc93/a;

    invoke-static {p3, v0, v3, p2, v1}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/u;

    return-object p0
.end method
