.class public final synthetic Lv81/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lhy0/i0;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Lc93/m;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv81/b;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lv81/b;->x:I

    iput p3, p0, Lv81/b;->y:I

    iput p4, p0, Lv81/b;->z:F

    iput-object p5, p0, Lv81/b;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lv81/b;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lv81/b;->G:Lhy0/i0;

    iput-object p8, p0, Lv81/b;->H:Ljava/lang/Object;

    iput-object p9, p0, Lv81/b;->I:Lc93/m;

    iput p10, p0, Lv81/b;->J:I

    iput p11, p0, Lv81/b;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lv81/b;->w:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lv81/b;->x:I

    iget v2, p0, Lv81/b;->y:I

    iget v3, p0, Lv81/b;->z:F

    iget-object v4, p0, Lv81/b;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lv81/b;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lv81/b;->G:Lhy0/i0;

    iget-object v7, p0, Lv81/b;->H:Ljava/lang/Object;

    iget-object v8, p0, Lv81/b;->I:Lc93/m;

    iget v9, p0, Lv81/b;->J:I

    iget v10, p0, Lv81/b;->K:I

    invoke-static/range {v0 .. v12}, Lv81/c;->e(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
