.class public final synthetic Lch0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic w:Lch0/v0;

.field public final synthetic x:Lzg0/i;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lf0/r1;


# direct methods
.method public synthetic constructor <init>(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/h;->w:Lch0/v0;

    iput-object p2, p0, Lch0/h;->x:Lzg0/i;

    iput-object p3, p0, Lch0/h;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lch0/h;->z:Lf0/r1;

    iput p5, p0, Lch0/h;->E:F

    iput-boolean p6, p0, Lch0/h;->F:Z

    iput-boolean p7, p0, Lch0/h;->G:Z

    iput p8, p0, Lch0/h;->H:I

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

    iget-object v0, p0, Lch0/h;->w:Lch0/v0;

    iget-object v1, p0, Lch0/h;->x:Lzg0/i;

    iget-object v2, p0, Lch0/h;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lch0/h;->z:Lf0/r1;

    iget v4, p0, Lch0/h;->E:F

    iget-boolean v5, p0, Lch0/h;->F:Z

    iget-boolean v6, p0, Lch0/h;->G:Z

    iget v7, p0, Lch0/h;->H:I

    invoke-static/range {v0 .. v9}, Lch0/n;->f(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
