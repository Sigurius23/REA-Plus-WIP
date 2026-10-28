.class public final synthetic Lg1/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll0/k1;

.field public final synthetic F:Lx1/b;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JJFLl0/k1;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/k0;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Lg1/k0;->x:J

    iput-wide p4, p0, Lg1/k0;->y:J

    iput p6, p0, Lg1/k0;->z:F

    iput-object p7, p0, Lg1/k0;->E:Ll0/k1;

    iput-object p8, p0, Lg1/k0;->F:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x30c07

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Lg1/k0;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Lg1/k0;->x:J

    iget-wide v3, p0, Lg1/k0;->y:J

    iget v5, p0, Lg1/k0;->z:F

    iget-object v6, p0, Lg1/k0;->E:Ll0/k1;

    iget-object v7, p0, Lg1/k0;->F:Lx1/b;

    invoke-static/range {v0 .. v9}, Lg1/n0;->b(Landroidx/compose/ui/Modifier;JJFLl0/k1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
