.class public final Lf1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lf1/m;

.field public final synthetic w:Lb3/j3;

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Lb3/j3;JZLandroidx/compose/ui/Modifier;Lf1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/d;->w:Lb3/j3;

    iput-wide p2, p0, Lf1/d;->x:J

    iput-boolean p4, p0, Lf1/d;->y:Z

    iput-object p5, p0, Lf1/d;->z:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lf1/d;->E:Lf1/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lb3/v1;->s:Lp1/u2;

    iget-object v0, p0, Lf1/d;->w:Lb3/j3;

    invoke-virtual {p2, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lf1/c;

    iget-object v4, p0, Lf1/d;->z:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Lf1/d;->E:Lf1/m;

    iget-wide v1, p0, Lf1/d;->x:J

    iget-boolean v3, p0, Lf1/d;->y:Z

    invoke-direct/range {v0 .. v5}, Lf1/c;-><init>(JZLandroidx/compose/ui/Modifier;Lf1/m;)V

    const v1, 0x4b1ac501    # 1.0142977E7f

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
