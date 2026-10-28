.class public final synthetic Lj1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic w:Z

.field public final synthetic x:Lj1/l;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ZLj1/l;Landroidx/compose/ui/Modifier;JJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj1/b;->w:Z

    iput-object p2, p0, Lj1/b;->x:Lj1/l;

    iput-object p3, p0, Lj1/b;->y:Landroidx/compose/ui/Modifier;

    iput-wide p4, p0, Lj1/b;->z:J

    iput-wide p6, p0, Lj1/b;->E:J

    iput p8, p0, Lj1/b;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lj1/b;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-boolean v0, p0, Lj1/b;->w:Z

    iget-object v1, p0, Lj1/b;->x:Lj1/l;

    iget-object v2, p0, Lj1/b;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lj1/b;->z:J

    iget-wide v5, p0, Lj1/b;->E:J

    invoke-static/range {v0 .. v8}, Lj1/g;->b(ZLj1/l;Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
