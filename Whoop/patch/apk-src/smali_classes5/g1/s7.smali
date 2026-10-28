.class public final synthetic Lg1/s7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:Lx1/b;

.field public final synthetic w:Z

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZLc93/a;Landroidx/compose/ui/Modifier;ZJJLx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/s7;->w:Z

    iput-object p2, p0, Lg1/s7;->x:Lc93/a;

    iput-object p3, p0, Lg1/s7;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lg1/s7;->z:Z

    iput-wide p5, p0, Lg1/s7;->E:J

    iput-wide p7, p0, Lg1/s7;->F:J

    iput-object p9, p0, Lg1/s7;->G:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0xc00001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-boolean v0, p0, Lg1/s7;->w:Z

    iget-object v1, p0, Lg1/s7;->x:Lc93/a;

    iget-object v2, p0, Lg1/s7;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Lg1/s7;->z:Z

    iget-wide v4, p0, Lg1/s7;->E:J

    iget-wide v6, p0, Lg1/s7;->F:J

    iget-object v8, p0, Lg1/s7;->G:Lx1/b;

    invoke-static/range {v0 .. v10}, Lg1/v7;->a(ZLc93/a;Landroidx/compose/ui/Modifier;ZJJLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
