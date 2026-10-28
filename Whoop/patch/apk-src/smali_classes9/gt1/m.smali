.class public final synthetic Lgt1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lf0/r1;Lft1/c$g;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lc93/a;Lbc3/c0;Lg1/y3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lgt1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgt1/m;->y:Lc93/a;

    iput-object p2, p0, Lgt1/m;->E:Ljava/lang/Object;

    iput-object p3, p0, Lgt1/m;->H:Ljava/lang/Object;

    iput-object p4, p0, Lgt1/m;->I:Ljava/lang/Object;

    iput-object p5, p0, Lgt1/m;->F:Ljava/lang/Object;

    iput-boolean p6, p0, Lgt1/m;->x:Z

    iput-object p7, p0, Lgt1/m;->G:Ljava/lang/Object;

    iput-object p8, p0, Lgt1/m;->z:Ljava/lang/Object;

    iput-object p9, p0, Lgt1/m;->J:Ljava/lang/Object;

    iput-object p10, p0, Lgt1/m;->K:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lgt1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgt1/m;->E:Ljava/lang/Object;

    iput-object p2, p0, Lgt1/m;->F:Ljava/lang/Object;

    iput-object p3, p0, Lgt1/m;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Lgt1/m;->x:Z

    iput-object p5, p0, Lgt1/m;->H:Ljava/lang/Object;

    iput-object p6, p0, Lgt1/m;->I:Ljava/lang/Object;

    iput-object p7, p0, Lgt1/m;->J:Ljava/lang/Object;

    iput-object p8, p0, Lgt1/m;->y:Lc93/a;

    iput-object p9, p0, Lgt1/m;->z:Ljava/lang/Object;

    iput-object p10, p0, Lgt1/m;->K:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLj02/j;Lc93/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lgt1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgt1/m;->z:Ljava/lang/Object;

    iput-object p2, p0, Lgt1/m;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lgt1/m;->x:Z

    iput-object p4, p0, Lgt1/m;->F:Ljava/lang/Object;

    iput-object p5, p0, Lgt1/m;->y:Lc93/a;

    iput-object p6, p0, Lgt1/m;->G:Ljava/lang/Object;

    iput-object p7, p0, Lgt1/m;->H:Ljava/lang/Object;

    iput-object p8, p0, Lgt1/m;->I:Ljava/lang/Object;

    iput-object p9, p0, Lgt1/m;->J:Ljava/lang/Object;

    iput-object p10, p0, Lgt1/m;->K:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lgt1/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgt1/m;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lgt1/m;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lgt1/m;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lj02/j;

    iget-object v0, p0, Lgt1/m;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v0, p0, Lgt1/m;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    iget-object v0, p0, Lgt1/m;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lp1/c1;

    iget-object v0, p0, Lgt1/m;->J:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lp1/c1;

    iget-object v0, p0, Lgt1/m;->K:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lp1/c1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v3, p0, Lgt1/m;->x:Z

    iget-object v5, p0, Lgt1/m;->y:Lc93/a;

    invoke-static/range {v1 .. v12}, Lkd1/d;->g(Ljava/lang/String;Ljava/lang/String;ZLj02/j;Lc93/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgt1/m;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lgt1/m;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/e;

    iget-object v0, p0, Lgt1/m;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lgt1/m;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lg1/u0;

    iget-object v0, p0, Lgt1/m;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lf0/t;

    iget-object v0, p0, Lgt1/m;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lf0/t;

    iget-object v0, p0, Lgt1/m;->z:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lc93/a;

    iget-object v0, p0, Lgt1/m;->K:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lc93/a;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v4, p0, Lgt1/m;->x:Z

    iget-object v8, p0, Lgt1/m;->y:Lc93/a;

    invoke-static/range {v1 .. v12}, Lj11/n;->i(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lgt1/m;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lgt1/m;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lf0/r1;

    iget-object v0, p0, Lgt1/m;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lft1/c$g;

    iget-object v0, p0, Lgt1/m;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lgt1/m;->G:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lgt1/m;->z:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lc93/a;

    iget-object v0, p0, Lgt1/m;->J:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lbc3/c0;

    iget-object v0, p0, Lgt1/m;->K:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lg1/y3;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Lgt1/m;->y:Lc93/a;

    iget-boolean v6, p0, Lgt1/m;->x:Z

    invoke-static/range {v1 .. v12}, Lgt1/n;->m(Lc93/a;Lkotlin/jvm/functions/Function1;Lf0/r1;Lft1/c$g;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lc93/a;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
