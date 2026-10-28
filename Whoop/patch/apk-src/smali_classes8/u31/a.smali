.class public final synthetic Lu31/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/util/List;

.field public final synthetic G:Lbc3/c0;

.field public final synthetic H:F

.field public final synthetic I:Lb91/a;

.field public final synthetic w:F

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lq0/y;


# direct methods
.method public synthetic constructor <init>(FZZLq0/b;ILjava/util/List;Lbc3/c0;FLb91/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu31/a;->w:F

    iput-boolean p2, p0, Lu31/a;->x:Z

    iput-boolean p3, p0, Lu31/a;->y:Z

    iput-object p4, p0, Lu31/a;->z:Lq0/y;

    iput p5, p0, Lu31/a;->E:I

    iput-object p6, p0, Lu31/a;->F:Ljava/util/List;

    iput-object p7, p0, Lu31/a;->G:Lbc3/c0;

    iput p8, p0, Lu31/a;->H:F

    iput-object p9, p0, Lu31/a;->I:Lb91/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Ll0/v;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v0, p0, Lu31/a;->w:F

    iget-boolean v1, p0, Lu31/a;->x:Z

    iget-boolean v2, p0, Lu31/a;->y:Z

    iget-object v3, p0, Lu31/a;->z:Lq0/y;

    iget v4, p0, Lu31/a;->E:I

    iget-object v5, p0, Lu31/a;->F:Ljava/util/List;

    iget-object v6, p0, Lu31/a;->G:Lbc3/c0;

    iget v7, p0, Lu31/a;->H:F

    iget-object v8, p0, Lu31/a;->I:Lb91/a;

    invoke-static/range {v0 .. v11}, Lu31/e;->d(FZZLq0/y;ILjava/util/List;Lbc3/c0;FLb91/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
