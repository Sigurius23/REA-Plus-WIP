.class public final synthetic Lx30/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:Ll3/v0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLl3/v0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/x0;->w:Ljava/lang/String;

    iput-object p2, p0, Lx30/x0;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lx30/x0;->y:J

    iput-object p5, p0, Lx30/x0;->z:Ll3/v0;

    iput p6, p0, Lx30/x0;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lx30/x0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lx30/x0;->w:Ljava/lang/String;

    iget-object v1, p0, Lx30/x0;->x:Landroidx/compose/ui/Modifier;

    iget-wide v2, p0, Lx30/x0;->y:J

    iget-object v4, p0, Lx30/x0;->z:Ll3/v0;

    invoke-static/range {v0 .. v6}, Lx30/y0;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLl3/v0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
