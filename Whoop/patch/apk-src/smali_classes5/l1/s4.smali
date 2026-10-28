.class public final synthetic Ll1/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:F

.field public final synthetic H:F

.field public final synthetic I:Lx1/b;

.field public final synthetic J:I

.field public final synthetic w:Ll1/w4;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:Li2/a1;


# direct methods
.method public synthetic constructor <init>(Ll1/w4;Landroidx/compose/ui/Modifier;FLi2/a1;JJFFLx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s4;->w:Ll1/w4;

    iput-object p2, p0, Ll1/s4;->x:Landroidx/compose/ui/Modifier;

    iput p3, p0, Ll1/s4;->y:F

    iput-object p4, p0, Ll1/s4;->z:Li2/a1;

    iput-wide p5, p0, Ll1/s4;->E:J

    iput-wide p7, p0, Ll1/s4;->F:J

    iput p9, p0, Ll1/s4;->G:F

    iput p10, p0, Ll1/s4;->H:F

    iput-object p11, p0, Ll1/s4;->I:Lx1/b;

    iput p12, p0, Ll1/s4;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/s4;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Ll1/s4;->w:Ll1/w4;

    iget-object v1, p0, Ll1/s4;->x:Landroidx/compose/ui/Modifier;

    iget v2, p0, Ll1/s4;->y:F

    iget-object v3, p0, Ll1/s4;->z:Li2/a1;

    iget-wide v4, p0, Ll1/s4;->E:J

    iget-wide v6, p0, Ll1/s4;->F:J

    iget v8, p0, Ll1/s4;->G:F

    iget v9, p0, Ll1/s4;->H:F

    iget-object v10, p0, Ll1/s4;->I:Lx1/b;

    invoke-static/range {v0 .. v12}, Ll1/u4;->a(Ll1/w4;Landroidx/compose/ui/Modifier;FLi2/a1;JJFFLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
