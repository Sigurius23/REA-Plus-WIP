.class public final synthetic Lg1/t5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic w:F

.field public final synthetic x:Lj0/i;

.field public final synthetic y:Lg1/w1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(FLj0/i;Lg1/w1;ZFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/t5;->w:F

    iput-object p2, p0, Lg1/t5;->x:Lj0/i;

    iput-object p3, p0, Lg1/t5;->y:Lg1/w1;

    iput-boolean p4, p0, Lg1/t5;->z:Z

    iput p5, p0, Lg1/t5;->E:F

    iput p6, p0, Lg1/t5;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/t5;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v0, p0, Lg1/t5;->w:F

    iget-object v1, p0, Lg1/t5;->x:Lj0/i;

    iget-object v2, p0, Lg1/t5;->y:Lg1/w1;

    iget-boolean v3, p0, Lg1/t5;->z:Z

    iget v4, p0, Lg1/t5;->E:F

    invoke-static/range {v0 .. v6}, Lg1/g6;->d(FLj0/i;Lg1/w1;ZFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
