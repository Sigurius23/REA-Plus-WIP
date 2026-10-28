.class public final synthetic Lvy0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Landroidx/compose/ui/Modifier;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;FILc93/a;Lc93/a;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/f;->w:Ljava/lang/String;

    iput p2, p0, Lvy0/f;->x:F

    iput p3, p0, Lvy0/f;->y:I

    iput-object p4, p0, Lvy0/f;->z:Lc93/a;

    iput-object p5, p0, Lvy0/f;->E:Lc93/a;

    iput-object p6, p0, Lvy0/f;->F:Landroidx/compose/ui/Modifier;

    iput p7, p0, Lvy0/f;->G:I

    iput p8, p0, Lvy0/f;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lvy0/f;->w:Ljava/lang/String;

    iget v1, p0, Lvy0/f;->x:F

    iget v2, p0, Lvy0/f;->y:I

    iget-object v3, p0, Lvy0/f;->z:Lc93/a;

    iget-object v4, p0, Lvy0/f;->E:Lc93/a;

    iget-object v5, p0, Lvy0/f;->F:Landroidx/compose/ui/Modifier;

    iget v6, p0, Lvy0/f;->G:I

    iget v7, p0, Lvy0/f;->H:I

    invoke-static/range {v0 .. v9}, Lvy0/p;->A(Ljava/lang/String;FILc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
