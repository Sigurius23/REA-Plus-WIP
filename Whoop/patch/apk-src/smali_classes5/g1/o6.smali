.class public final synthetic Lg1/o6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:F

.field public final synthetic H:I

.field public final synthetic w:Lg1/l6;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Li2/a1;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lg1/l6;Landroidx/compose/ui/Modifier;Li2/a1;JJJFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/o6;->w:Lg1/l6;

    iput-object p2, p0, Lg1/o6;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/o6;->y:Li2/a1;

    iput-wide p4, p0, Lg1/o6;->z:J

    iput-wide p6, p0, Lg1/o6;->E:J

    iput-wide p8, p0, Lg1/o6;->F:J

    iput p10, p0, Lg1/o6;->G:F

    iput p11, p0, Lg1/o6;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/o6;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v0, p0, Lg1/o6;->w:Lg1/l6;

    iget-object v1, p0, Lg1/o6;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lg1/o6;->y:Li2/a1;

    iget-wide v3, p0, Lg1/o6;->z:J

    iget-wide v5, p0, Lg1/o6;->E:J

    iget-wide v7, p0, Lg1/o6;->F:J

    iget v9, p0, Lg1/o6;->G:F

    invoke-static/range {v0 .. v11}, Lg1/s6;->c(Lg1/l6;Landroidx/compose/ui/Modifier;Li2/a1;JJJFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
