.class public final synthetic Lf0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly2/k;

.field public final synthetic F:F

.field public final synthetic G:Li2/y;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Ln2/a;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lb2/h;


# direct methods
.method public synthetic constructor <init>(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/r0;->w:Ln2/a;

    iput-object p2, p0, Lf0/r0;->x:Ljava/lang/String;

    iput-object p3, p0, Lf0/r0;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lf0/r0;->z:Lb2/h;

    iput-object p5, p0, Lf0/r0;->E:Ly2/k;

    iput p6, p0, Lf0/r0;->F:F

    iput-object p7, p0, Lf0/r0;->G:Li2/y;

    iput p8, p0, Lf0/r0;->H:I

    iput p9, p0, Lf0/r0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lf0/r0;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Lf0/r0;->w:Ln2/a;

    iget-object v1, p0, Lf0/r0;->x:Ljava/lang/String;

    iget-object v2, p0, Lf0/r0;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lf0/r0;->z:Lb2/h;

    iget-object v4, p0, Lf0/r0;->E:Ly2/k;

    iget v5, p0, Lf0/r0;->F:F

    iget-object v6, p0, Lf0/r0;->G:Li2/y;

    iget v9, p0, Lf0/r0;->I:I

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
