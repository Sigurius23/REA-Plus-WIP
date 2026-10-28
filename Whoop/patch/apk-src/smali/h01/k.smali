.class public final synthetic Lh01/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ll83/e;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZII)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lh01/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh01/k;->F:Ljava/lang/Object;

    iput-object p2, p0, Lh01/k;->y:Ll83/e;

    iput-object p3, p0, Lh01/k;->G:Ljava/lang/Object;

    iput-object p4, p0, Lh01/k;->H:Ljava/lang/Object;

    iput-boolean p5, p0, Lh01/k;->x:Z

    iput p6, p0, Lh01/k;->z:I

    iput p7, p0, Lh01/k;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lh01/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh01/k;->F:Ljava/lang/Object;

    iput-object p2, p0, Lh01/k;->G:Ljava/lang/Object;

    iput-object p3, p0, Lh01/k;->H:Ljava/lang/Object;

    iput-object p4, p0, Lh01/k;->y:Ll83/e;

    iput-boolean p5, p0, Lh01/k;->x:Z

    iput p6, p0, Lh01/k;->z:I

    iput p7, p0, Lh01/k;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZIII)V
    .locals 0

    .line 3
    iput p8, p0, Lh01/k;->w:I

    iput-object p1, p0, Lh01/k;->F:Ljava/lang/Object;

    iput-object p2, p0, Lh01/k;->G:Ljava/lang/Object;

    iput-object p3, p0, Lh01/k;->H:Ljava/lang/Object;

    iput-boolean p5, p0, Lh01/k;->x:Z

    iput-object p4, p0, Lh01/k;->y:Ll83/e;

    iput p6, p0, Lh01/k;->z:I

    iput p7, p0, Lh01/k;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk71/m;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 4
    const/4 v0, 0x5

    iput v0, p0, Lh01/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh01/k;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lh01/k;->x:Z

    iput-object p3, p0, Lh01/k;->y:Ll83/e;

    iput-object p4, p0, Lh01/k;->G:Ljava/lang/Object;

    iput-object p5, p0, Lh01/k;->H:Ljava/lang/Object;

    iput p6, p0, Lh01/k;->z:I

    iput p7, p0, Lh01/k;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lh01/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh01/k;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lk71/m;

    iget-object v0, p0, Lh01/k;->y:Ll83/e;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh01/k;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lh01/k;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Lh01/k;->x:Z

    iget v6, p0, Lh01/k;->z:I

    iget v7, p0, Lh01/k;->E:I

    invoke-static/range {v1 .. v9}, Lk71/j;->k(Lk71/m;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lh01/k;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lh01/k;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhs1/c;

    iget-object v0, p0, Lh01/k;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lh01/k;->y:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v4, p0, Lh01/k;->x:Z

    iget v6, p0, Lh01/k;->z:I

    iget v7, p0, Lh01/k;->E:I

    invoke-static/range {v1 .. v9}, Ljs1/l;->a(Landroidx/compose/ui/Modifier;Lhs1/c;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lh01/k;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfm1/i;

    iget-object v0, p0, Lh01/k;->y:Ll83/e;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh01/k;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh01/k;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v5, p0, Lh01/k;->x:Z

    iget v6, p0, Lh01/k;->z:I

    iget v7, p0, Lh01/k;->E:I

    invoke-static/range {v1 .. v9}, Ljk2/i;->e(Lfm1/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lh01/k;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lik2/b;

    iget-object v0, p0, Lh01/k;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lh01/k;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lh01/k;->y:Ll83/e;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v5, p0, Lh01/k;->x:Z

    iget v6, p0, Lh01/k;->z:I

    iget v7, p0, Lh01/k;->E:I

    invoke-static/range {v1 .. v9}, Ljk2/a;->a(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lh01/k;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfm1/a;

    iget-object v0, p0, Lh01/k;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lim1/d0;

    iget-object v0, p0, Lh01/k;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfm1/d;

    iget-object v0, p0, Lh01/k;->y:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v4, p0, Lh01/k;->x:Z

    iget v6, p0, Lh01/k;->z:I

    iget v7, p0, Lh01/k;->E:I

    invoke-static/range {v1 .. v9}, Lim1/j0;->f(Lfm1/a;Lim1/d0;Lfm1/d;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lh01/k;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lh01/k;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgz0/m0;

    iget-object v0, p0, Lh01/k;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lh01/k;->y:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v4, p0, Lh01/k;->x:Z

    iget v6, p0, Lh01/k;->z:I

    iget v7, p0, Lh01/k;->E:I

    invoke-static/range {v1 .. v9}, Lh01/p;->m(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/util/List;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
