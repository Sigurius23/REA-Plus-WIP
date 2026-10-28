.class public final synthetic Lj00/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZZFZLc93/a;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/t;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lj00/t;->x:Z

    iput-boolean p3, p0, Lj00/t;->y:Z

    iput p4, p0, Lj00/t;->z:F

    iput-boolean p5, p0, Lj00/t;->E:Z

    iput-object p6, p0, Lj00/t;->F:Lc93/a;

    iput-boolean p7, p0, Lj00/t;->G:Z

    iput p8, p0, Lj00/t;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lj00/t;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Lj00/t;->w:Ljava/lang/String;

    iget-boolean v1, p0, Lj00/t;->x:Z

    iget-boolean v2, p0, Lj00/t;->y:Z

    iget v3, p0, Lj00/t;->z:F

    iget-boolean v4, p0, Lj00/t;->E:Z

    iget-object v5, p0, Lj00/t;->F:Lc93/a;

    iget-boolean v6, p0, Lj00/t;->G:Z

    invoke-static/range {v0 .. v8}, Luf/c0;->l(Ljava/lang/String;ZZFZLc93/a;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
