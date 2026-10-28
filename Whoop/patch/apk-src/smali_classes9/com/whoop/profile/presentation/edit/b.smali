.class public final synthetic Lcom/whoop/profile/presentation/edit/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc93/m;II)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lcom/whoop/profile/presentation/edit/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iput p3, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;III)V
    .locals 0

    .line 2
    iput p4, p0, Lcom/whoop/profile/presentation/edit/b;->w:I

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    iput p2, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iput p3, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput v0, p0, Lcom/whoop/profile/presentation/edit/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iput p3, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    check-cast p1, Lkotlin/jvm/internal/i;

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lcom/whoop/profile/presentation/edit/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v2, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lw90/b;->f(Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v0, Lw31/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v2, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lw31/e;->g(Lw31/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/i;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v1, "str"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v2, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    if-lt v1, v2, :cond_3

    const/4 v3, 0x0

    invoke-static {p2, v3, p1}, Lug/m;->J(IILjava/lang/String;)V

    move v3, p2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_0

    sub-int v4, v3, p2

    if-ge v4, v1, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sub-int v0, v3, p2

    if-ge v0, v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-lt v3, p2, :cond_1

    new-instance p2, Laws/smithy/kotlin/runtime/time/IncompleteException;

    new-instance v1, Lug/d;

    sub-int/2addr v2, v0

    invoke-direct {v1, v2}, Lug/d;-><init>(I)V

    invoke-direct {p2, p1, v1}, Laws/smithy/kotlin/runtime/time/IncompleteException;-><init>(Ljava/lang/String;Ls2/d;)V

    throw p2

    :cond_1
    new-instance p2, Laws/smithy/kotlin/runtime/time/TakeWhileMNException;

    invoke-direct {p2, p1, v3, v2, v0}, Laws/smithy/kotlin/runtime/time/TakeWhileMNException;-><init>(Ljava/lang/String;III)V

    throw p2

    :cond_2
    new-instance p1, Lug/f;

    new-instance v0, Li93/j;

    add-int/lit8 v1, v3, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, p2, v1, v2}, Li93/h;-><init>(III)V

    invoke-direct {p1, v3, v0}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object p1

    :cond_3
    const-string p1, "min m="

    const-string p2, " cannot be greater than max="

    invoke-static {v2, v1, p1, p2}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_2
    iget v0, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "str"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v3, v4, p1}, Lug/m;->J(IILjava/lang/String;)V

    :try_start_0
    sget-object v4, Lug/l;->w:Lug/l;

    new-instance v5, Lcom/whoop/profile/presentation/edit/b;

    invoke-direct {v5, v4, v1, v0}, Lcom/whoop/profile/presentation/edit/b;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v5, p1, p2}, Lcom/whoop/profile/presentation/edit/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lug/f;

    iget v4, p2, Lug/f;->a:I

    iget-object p2, p2, Lug/f;->b:Ljava/lang/Object;

    check-cast p2, Li93/j;

    invoke-virtual {p2}, Li93/j;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface {v2, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    new-instance v2, Lug/f;

    invoke-direct {v2, v4, p2}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v2

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_2

    :cond_4
    new-instance p2, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v2, "expected integer"

    invoke-direct {p2, p1, v2, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw p2
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/time/TakeWhileMNException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Laws/smithy/kotlin/runtime/time/IncompleteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object p2, p2, Laws/smithy/kotlin/runtime/time/IncompleteException;->x:Ls2/d;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1, v0, p2}, Lug/m;->A(IIILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Laws/smithy/kotlin/runtime/time/ParseException;

    invoke-direct {v0, p1, p2, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "found "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p2, Laws/smithy/kotlin/runtime/time/TakeWhileMNException;->y:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget p2, p2, Laws/smithy/kotlin/runtime/time/TakeWhileMNException;->x:I

    invoke-static {v0, v1, p2, v2}, Lug/m;->A(IIILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Laws/smithy/kotlin/runtime/time/ParseException;

    invoke-direct {v0, p1, p2, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v0, Lgz0/m0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v2, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo01/d;->b(Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v0, Leb/a0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v2, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->g(Leb/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lcom/whoop/profile/presentation/edit/b;->x:I

    iget v2, p0, Lcom/whoop/profile/presentation/edit/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt;->a(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
