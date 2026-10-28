.class public final synthetic Lxq2/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lxq2/f0;

.field public final synthetic G:I

.field public final synthetic w:F

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FZLkotlin/jvm/functions/Function1;IILxq2/f0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxq2/x0;->w:F

    iput-boolean p2, p0, Lxq2/x0;->x:Z

    iput-object p3, p0, Lxq2/x0;->y:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lxq2/x0;->z:I

    iput p5, p0, Lxq2/x0;->E:I

    iput-object p6, p0, Lxq2/x0;->F:Lxq2/f0;

    iput p7, p0, Lxq2/x0;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v0, p0, Lxq2/x0;->w:F

    iget-boolean v1, p0, Lxq2/x0;->x:Z

    iget-object v2, p0, Lxq2/x0;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lxq2/x0;->z:I

    iget v4, p0, Lxq2/x0;->E:I

    iget-object v5, p0, Lxq2/x0;->F:Lxq2/f0;

    iget v6, p0, Lxq2/x0;->G:I

    invoke-static/range {v0 .. v8}, Lxq2/c1;->f(FZLkotlin/jvm/functions/Function1;IILxq2/f0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
