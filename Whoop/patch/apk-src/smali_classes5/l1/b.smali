.class public final synthetic Ll1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/a1;

.field public final synthetic F:J

.field public final synthetic w:Ll1/d;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ll1/d;Landroidx/compose/ui/Modifier;FFLi2/a1;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/b;->w:Ll1/d;

    iput-object p2, p0, Ll1/b;->x:Landroidx/compose/ui/Modifier;

    iput p3, p0, Ll1/b;->y:F

    iput p4, p0, Ll1/b;->z:F

    iput-object p5, p0, Ll1/b;->E:Li2/a1;

    iput-wide p6, p0, Ll1/b;->F:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x30001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Ll1/b;->w:Ll1/d;

    iget-object v1, p0, Ll1/b;->x:Landroidx/compose/ui/Modifier;

    iget v2, p0, Ll1/b;->y:F

    iget v3, p0, Ll1/b;->z:F

    iget-object v4, p0, Ll1/b;->E:Li2/a1;

    iget-wide v5, p0, Ll1/b;->F:J

    invoke-virtual/range {v0 .. v8}, Ll1/d;->a(Landroidx/compose/ui/Modifier;FFLi2/a1;JLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
