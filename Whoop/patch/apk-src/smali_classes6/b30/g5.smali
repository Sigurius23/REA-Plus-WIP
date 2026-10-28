.class public final synthetic Lb30/g5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Lh20/t0;

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lh20/t0;FZZZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/g5;->w:Lh20/t0;

    iput p2, p0, Lb30/g5;->x:F

    iput-boolean p3, p0, Lb30/g5;->y:Z

    iput-boolean p4, p0, Lb30/g5;->z:Z

    iput-boolean p5, p0, Lb30/g5;->E:Z

    iput-object p6, p0, Lb30/g5;->F:Lc93/a;

    iput-object p7, p0, Lb30/g5;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lb30/g5;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lb30/g5;->I:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Lb30/g5;->w:Lh20/t0;

    iget v1, p0, Lb30/g5;->x:F

    iget-boolean v2, p0, Lb30/g5;->y:Z

    iget-boolean v3, p0, Lb30/g5;->z:Z

    iget-boolean v4, p0, Lb30/g5;->E:Z

    iget-object v5, p0, Lb30/g5;->F:Lc93/a;

    iget-object v6, p0, Lb30/g5;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lb30/g5;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lb30/g5;->I:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v10}, Lb30/o5;->f(Lh20/t0;FZZZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
