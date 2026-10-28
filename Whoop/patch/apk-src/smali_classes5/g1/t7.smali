.class public final synthetic Lg1/t7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:Lx1/b;


# direct methods
.method public synthetic constructor <init>(JJZLx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/t7;->w:J

    iput-wide p3, p0, Lg1/t7;->x:J

    iput-boolean p5, p0, Lg1/t7;->y:Z

    iput-object p6, p0, Lg1/t7;->z:Lx1/b;

    iput p7, p0, Lg1/t7;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/t7;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-wide v0, p0, Lg1/t7;->w:J

    iget-wide v2, p0, Lg1/t7;->x:J

    iget-boolean v4, p0, Lg1/t7;->y:Z

    iget-object v5, p0, Lg1/t7;->z:Lx1/b;

    invoke-static/range {v0 .. v7}, Lg1/v7;->b(JJZLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
