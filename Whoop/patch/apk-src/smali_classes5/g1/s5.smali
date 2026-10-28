.class public final synthetic Lg1/s5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lj0/i;

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Z

.field public final synthetic x:F

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lg1/w1;


# direct methods
.method public synthetic constructor <init>(ZFLjava/util/List;Lg1/w1;FLj0/i;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/s5;->w:Z

    iput p2, p0, Lg1/s5;->x:F

    iput-object p3, p0, Lg1/s5;->y:Ljava/util/List;

    iput-object p4, p0, Lg1/s5;->z:Lg1/w1;

    iput p5, p0, Lg1/s5;->E:F

    iput-object p6, p0, Lg1/s5;->F:Lj0/i;

    iput-object p7, p0, Lg1/s5;->G:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-boolean v0, p0, Lg1/s5;->w:Z

    iget v1, p0, Lg1/s5;->x:F

    iget-object v2, p0, Lg1/s5;->y:Ljava/util/List;

    iget-object v3, p0, Lg1/s5;->z:Lg1/w1;

    iget v4, p0, Lg1/s5;->E:F

    iget-object v5, p0, Lg1/s5;->F:Lj0/i;

    iget-object v6, p0, Lg1/s5;->G:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v8}, Lg1/g6;->c(ZFLjava/util/List;Lg1/w1;FLj0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
