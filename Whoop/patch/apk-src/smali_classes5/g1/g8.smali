.class public final synthetic Lg1/g8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg1/e8;

.field public final synthetic F:Li2/a1;

.field public final synthetic G:F

.field public final synthetic H:F

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Lg1/i8;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lj0/i;


# direct methods
.method public synthetic constructor <init>(Lg1/i8;ZZLj0/i;Lg1/e8;Li2/a1;FFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/g8;->w:Lg1/i8;

    iput-boolean p2, p0, Lg1/g8;->x:Z

    iput-boolean p3, p0, Lg1/g8;->y:Z

    iput-object p4, p0, Lg1/g8;->z:Lj0/i;

    iput-object p5, p0, Lg1/g8;->E:Lg1/e8;

    iput-object p6, p0, Lg1/g8;->F:Li2/a1;

    iput p7, p0, Lg1/g8;->G:F

    iput p8, p0, Lg1/g8;->H:F

    iput p9, p0, Lg1/g8;->I:I

    iput p10, p0, Lg1/g8;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/g8;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Lg1/g8;->w:Lg1/i8;

    iget-boolean v1, p0, Lg1/g8;->x:Z

    iget-boolean v2, p0, Lg1/g8;->y:Z

    iget-object v3, p0, Lg1/g8;->z:Lj0/i;

    iget-object v4, p0, Lg1/g8;->E:Lg1/e8;

    iget-object v5, p0, Lg1/g8;->F:Li2/a1;

    iget v6, p0, Lg1/g8;->G:F

    iget v7, p0, Lg1/g8;->H:F

    iget v10, p0, Lg1/g8;->J:I

    invoke-virtual/range {v0 .. v10}, Lg1/i8;->a(ZZLj0/i;Lg1/e8;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
