.class public final Lg1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/a1;

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic w:Lx1/b;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/j;->w:Lx1/b;

    iput-object p2, p0, Lg1/j;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/j;->y:Lc93/m;

    iput-object p4, p0, Lg1/j;->z:Lc93/m;

    iput-object p5, p0, Lg1/j;->E:Li2/a1;

    iput-wide p6, p0, Lg1/j;->F:J

    iput-wide p8, p0, Lg1/j;->G:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

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

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v8, p0, Lg1/j;->G:J

    const/4 v11, 0x0

    iget-object v1, p0, Lg1/j;->w:Lx1/b;

    iget-object v2, p0, Lg1/j;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lg1/j;->y:Lc93/m;

    iget-object v4, p0, Lg1/j;->z:Lc93/m;

    iget-object v5, p0, Lg1/j;->E:Li2/a1;

    iget-wide v6, p0, Lg1/j;->F:J

    invoke-static/range {v1 .. v11}, Lg1/k;->b(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLandroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
