.class public final synthetic Lg1/b;
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
.method public synthetic constructor <init>(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b;->w:Lx1/b;

    iput-object p2, p0, Lg1/b;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/b;->y:Lc93/m;

    iput-object p4, p0, Lg1/b;->z:Lc93/m;

    iput-object p5, p0, Lg1/b;->E:Li2/a1;

    iput-wide p6, p0, Lg1/b;->F:J

    iput-wide p8, p0, Lg1/b;->G:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Lg1/b;->w:Lx1/b;

    iget-object v1, p0, Lg1/b;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lg1/b;->y:Lc93/m;

    iget-object v3, p0, Lg1/b;->z:Lc93/m;

    iget-object v4, p0, Lg1/b;->E:Li2/a1;

    iget-wide v5, p0, Lg1/b;->F:J

    iget-wide v7, p0, Lg1/b;->G:J

    invoke-static/range {v0 .. v10}, Lg1/k;->b(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
