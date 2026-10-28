.class public abstract Lo0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v5, Lo0/z;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v17, Lh0/d2;->w:Lh0/d2;

    invoke-static {}, Lvb/g;->a()Ly3/d;

    move-result-object v9

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v8

    new-instance v0, Lo0/o;

    new-instance v11, Lny0/m;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lny0/m;-><init>(I)V

    new-instance v12, Lny0/m;

    const/4 v1, 0x5

    invoke-direct {v12, v1}, Lny0/m;-><init>(I)V

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    sget-object v13, Lm83/y;->w:Lm83/y;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v19}, Lo0/o;-><init>(Lo0/q;IZFLy2/s0;FZLbc3/c0;Ly3/c;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIILh0/d2;II)V

    sput-object v0, Lo0/a0;->a:Lo0/o;

    return-void
.end method

.method public static final a(ILandroidx/compose/runtime/Composer;I)Lo0/y;
    .locals 4

    and-int/lit8 p2, p2, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move p0, v0

    :cond_0
    new-array p2, v0, [Ljava/lang/Object;

    sget-object v1, Lo0/y;->w:Lp0/n0;

    move-object v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p0}, Lp1/q;->e(I)Z

    move-result v2

    move-object v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v3

    or-int/2addr v2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Liw0/r;

    const/4 v2, 0x1

    invoke-direct {v3, p0, v2}, Liw0/r;-><init>(II)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lc93/a;

    invoke-static {p2, v1, v3, p1, v0}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/y;

    return-object p0
.end method
