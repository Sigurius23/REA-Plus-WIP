.class public final synthetic Lsl0/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lc93/a;

.field public final synthetic I:I

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/e3;->w:Lc93/a;

    iput-object p2, p0, Lsl0/e3;->x:Lc93/a;

    iput-object p3, p0, Lsl0/e3;->y:Lc93/a;

    iput-object p4, p0, Lsl0/e3;->z:Lc93/a;

    iput-boolean p5, p0, Lsl0/e3;->E:Z

    iput-boolean p6, p0, Lsl0/e3;->F:Z

    iput-boolean p7, p0, Lsl0/e3;->G:Z

    iput-object p8, p0, Lsl0/e3;->H:Lc93/a;

    iput p9, p0, Lsl0/e3;->I:I

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

    iget-object v0, p0, Lsl0/e3;->w:Lc93/a;

    iget-object v1, p0, Lsl0/e3;->x:Lc93/a;

    iget-object v2, p0, Lsl0/e3;->y:Lc93/a;

    iget-object v3, p0, Lsl0/e3;->z:Lc93/a;

    iget-boolean v4, p0, Lsl0/e3;->E:Z

    iget-boolean v5, p0, Lsl0/e3;->F:Z

    iget-boolean v6, p0, Lsl0/e3;->G:Z

    iget-object v7, p0, Lsl0/e3;->H:Lc93/a;

    iget v8, p0, Lsl0/e3;->I:I

    invoke-static/range {v0 .. v10}, Lsl0/g3;->k(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
