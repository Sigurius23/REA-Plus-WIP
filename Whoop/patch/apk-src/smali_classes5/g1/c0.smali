.class public final synthetic Lg1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Li2/a1;

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic I:Lc4/a0;

.field public final synthetic J:I

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lx1/b;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/c0;->w:Lc93/a;

    iput-object p2, p0, Lg1/c0;->x:Lx1/b;

    iput-object p3, p0, Lg1/c0;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lg1/c0;->z:Lc93/m;

    iput-object p5, p0, Lg1/c0;->E:Lc93/m;

    iput-object p6, p0, Lg1/c0;->F:Li2/a1;

    iput-wide p7, p0, Lg1/c0;->G:J

    iput-wide p9, p0, Lg1/c0;->H:J

    iput-object p11, p0, Lg1/c0;->I:Lc4/a0;

    iput p12, p0, Lg1/c0;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/c0;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Lg1/c0;->w:Lc93/a;

    iget-object v1, p0, Lg1/c0;->x:Lx1/b;

    iget-object v2, p0, Lg1/c0;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lg1/c0;->z:Lc93/m;

    iget-object v4, p0, Lg1/c0;->E:Lc93/m;

    iget-object v5, p0, Lg1/c0;->F:Li2/a1;

    iget-wide v6, p0, Lg1/c0;->G:J

    iget-wide v8, p0, Lg1/c0;->H:J

    iget-object v10, p0, Lg1/c0;->I:Lc4/a0;

    invoke-static/range {v0 .. v12}, Ldc/a;->b(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
