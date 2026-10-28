.class public final synthetic Lun1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic w:Lun1/h;

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lun1/h;IFZZZLc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun1/a;->w:Lun1/h;

    iput p2, p0, Lun1/a;->x:I

    iput p3, p0, Lun1/a;->y:F

    iput-boolean p4, p0, Lun1/a;->z:Z

    iput-boolean p5, p0, Lun1/a;->E:Z

    iput-boolean p6, p0, Lun1/a;->F:Z

    iput-object p7, p0, Lun1/a;->G:Lc93/a;

    iput-object p8, p0, Lun1/a;->H:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v8, p1

    check-cast v8, Lc0/i0;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lun1/a;->w:Lun1/h;

    iget v1, p0, Lun1/a;->x:I

    iget v2, p0, Lun1/a;->y:F

    iget-boolean v3, p0, Lun1/a;->z:Z

    iget-boolean v4, p0, Lun1/a;->E:Z

    iget-boolean v5, p0, Lun1/a;->F:Z

    iget-object v6, p0, Lun1/a;->G:Lc93/a;

    iget-object v7, p0, Lun1/a;->H:Lc93/a;

    invoke-static/range {v0 .. v10}, Lun1/c;->b(Lun1/h;IFZZZLc93/a;Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
