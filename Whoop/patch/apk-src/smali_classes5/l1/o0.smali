.class public final synthetic Ll1/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic F:I

.field public final synthetic w:Lc93/m;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lc93/m;JJFLx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/o0;->w:Lc93/m;

    iput-wide p2, p0, Ll1/o0;->x:J

    iput-wide p4, p0, Ll1/o0;->y:J

    iput p6, p0, Ll1/o0;->z:F

    iput-object p7, p0, Ll1/o0;->E:Lx1/b;

    iput p8, p0, Ll1/o0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/o0;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Ll1/o0;->w:Lc93/m;

    iget-wide v1, p0, Ll1/o0;->x:J

    iget-wide v3, p0, Ll1/o0;->y:J

    iget v5, p0, Ll1/o0;->z:F

    iget-object v6, p0, Ll1/o0;->E:Lx1/b;

    invoke-static/range {v0 .. v8}, Ll1/f1;->d(Lc93/m;JJFLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
