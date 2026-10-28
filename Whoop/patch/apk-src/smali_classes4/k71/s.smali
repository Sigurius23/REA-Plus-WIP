.class public final synthetic Lk71/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Lm91/u;

.field public final synthetic x:F

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lm91/u;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71/s;->w:Lm91/u;

    iput p2, p0, Lk71/s;->x:F

    iput-object p3, p0, Lk71/s;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lk71/s;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lk71/s;->E:I

    iput p6, p0, Lk71/s;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lk71/s;->w:Lm91/u;

    iget v1, p0, Lk71/s;->x:F

    iget-object v2, p0, Lk71/s;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lk71/s;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lk71/s;->E:I

    iget v5, p0, Lk71/s;->F:I

    invoke-static/range {v0 .. v7}, Lk71/z;->n(Lm91/u;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
