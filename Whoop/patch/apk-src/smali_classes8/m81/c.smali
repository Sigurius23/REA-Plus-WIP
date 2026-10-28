.class public final synthetic Lm81/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;Ll3/m0;ILkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lm81/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm81/c;->x:Ljava/lang/String;

    iput-object p2, p0, Lm81/c;->G:Ljava/lang/Object;

    iput-object p3, p0, Lm81/c;->H:Ljava/lang/Object;

    iput-wide p4, p0, Lm81/c;->y:J

    iput-object p6, p0, Lm81/c;->I:Ljava/lang/Object;

    iput-object p7, p0, Lm81/c;->J:Ljava/lang/Object;

    iput p8, p0, Lm81/c;->z:I

    iput-object p9, p0, Lm81/c;->E:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Lm81/c;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lm81/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm81/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Lm81/c;->x:Ljava/lang/String;

    iput-wide p3, p0, Lm81/c;->y:J

    iput-object p5, p0, Lm81/c;->H:Ljava/lang/Object;

    iput-object p6, p0, Lm81/c;->I:Ljava/lang/Object;

    iput-object p7, p0, Lm81/c;->J:Ljava/lang/Object;

    iput-object p8, p0, Lm81/c;->E:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lm81/c;->z:I

    iput p10, p0, Lm81/c;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lnp1/e;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lm81/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm81/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Lm81/c;->x:Ljava/lang/String;

    iput-object p3, p0, Lm81/c;->H:Ljava/lang/Object;

    iput-wide p4, p0, Lm81/c;->y:J

    iput-object p6, p0, Lm81/c;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lm81/c;->I:Ljava/lang/Object;

    iput-object p8, p0, Lm81/c;->J:Ljava/lang/Object;

    iput p9, p0, Lm81/c;->z:I

    iput p10, p0, Lm81/c;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lm81/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm81/c;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnp1/e;

    iget-object v0, p0, Lm81/c;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lm81/c;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    iget-object v0, p0, Lm81/c;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v2, p0, Lm81/c;->x:Ljava/lang/String;

    iget-wide v4, p0, Lm81/c;->y:J

    iget-object v6, p0, Lm81/c;->E:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lm81/c;->z:I

    iget v10, p0, Lm81/c;->F:I

    invoke-static/range {v1 .. v12}, Lpp1/i;->z(Lnp1/e;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm81/c;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lm81/c;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    iget-object v0, p0, Lm81/c;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll3/v0;

    iget-object v0, p0, Lm81/c;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ll3/m0;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lm81/c;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v1, p0, Lm81/c;->x:Ljava/lang/String;

    iget-wide v4, p0, Lm81/c;->y:J

    iget v8, p0, Lm81/c;->z:I

    iget-object v9, p0, Lm81/c;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v11}, Lup/d;->e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;Ll3/m0;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lm81/c;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lm81/c;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly3/f;

    iget-object v0, p0, Lm81/c;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lm81/f;

    iget-object v0, p0, Lm81/c;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lm81/f;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v2, p0, Lm81/c;->x:Ljava/lang/String;

    iget-wide v3, p0, Lm81/c;->y:J

    iget-object v8, p0, Lm81/c;->E:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lm81/c;->z:I

    iget v10, p0, Lm81/c;->F:I

    invoke-static/range {v1 .. v12}, Lm81/e;->g(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
