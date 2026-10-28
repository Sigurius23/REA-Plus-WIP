.class public final synthetic Lg1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function3;

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:F

.field public final synthetic I:I

.field public final synthetic w:Lx1/b;

.field public final synthetic x:Ll0/b2;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lx1/b;Ll0/b2;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/i0;->w:Lx1/b;

    iput-object p2, p0, Lg1/i0;->x:Ll0/b2;

    iput-object p3, p0, Lg1/i0;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lg1/i0;->z:Lc93/m;

    iput-object p5, p0, Lg1/i0;->E:Lkotlin/jvm/functions/Function3;

    iput-wide p6, p0, Lg1/i0;->F:J

    iput-wide p8, p0, Lg1/i0;->G:J

    iput p10, p0, Lg1/i0;->H:F

    iput p11, p0, Lg1/i0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/i0;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v0, p0, Lg1/i0;->w:Lx1/b;

    iget-object v1, p0, Lg1/i0;->x:Ll0/b2;

    iget-object v2, p0, Lg1/i0;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lg1/i0;->z:Lc93/m;

    iget-object v4, p0, Lg1/i0;->E:Lkotlin/jvm/functions/Function3;

    iget-wide v5, p0, Lg1/i0;->F:J

    iget-wide v7, p0, Lg1/i0;->G:J

    iget v9, p0, Lg1/i0;->H:F

    invoke-static/range {v0 .. v11}, Lg1/n0;->c(Lx1/b;Ll0/b2;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
