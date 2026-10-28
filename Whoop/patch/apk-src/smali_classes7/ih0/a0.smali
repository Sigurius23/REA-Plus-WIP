.class public final synthetic Lih0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Z

.field public final synthetic G:Lc93/m;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Lah0/f;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lah0/f;ZZZLc93/a;ZLc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/a0;->w:Lah0/f;

    iput-boolean p2, p0, Lih0/a0;->x:Z

    iput-boolean p3, p0, Lih0/a0;->y:Z

    iput-boolean p4, p0, Lih0/a0;->z:Z

    iput-object p5, p0, Lih0/a0;->E:Lc93/a;

    iput-boolean p6, p0, Lih0/a0;->F:Z

    iput-object p7, p0, Lih0/a0;->G:Lc93/m;

    iput p8, p0, Lih0/a0;->H:I

    iput p9, p0, Lih0/a0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lih0/a0;->w:Lah0/f;

    iget-boolean v1, p0, Lih0/a0;->x:Z

    iget-boolean v2, p0, Lih0/a0;->y:Z

    iget-boolean v3, p0, Lih0/a0;->z:Z

    iget-object v4, p0, Lih0/a0;->E:Lc93/a;

    iget-boolean v5, p0, Lih0/a0;->F:Z

    iget-object v6, p0, Lih0/a0;->G:Lc93/m;

    iget v7, p0, Lih0/a0;->H:I

    iget v8, p0, Lih0/a0;->I:I

    invoke-static/range {v0 .. v10}, Lih0/e0;->X(Lah0/f;ZZZLc93/a;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
