.class public final Lc20/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/h;

.field public final H:Lv03/h;

.field public final I:Lv03/h;

.field public final J:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lu00/e;Lv03/e;Lv03/e;Lv03/h;Lv03/h;La30/c;Lv03/e;Lv03/e;La30/h;Lv03/e;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lc20/o;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p2, p0, Lc20/o;->x:Lv03/h;

    .line 13
    iput-object p3, p0, Lc20/o;->y:Lv03/h;

    .line 14
    iput-object p4, p0, Lc20/o;->E:Lv03/h;

    .line 15
    iput-object p5, p0, Lc20/o;->F:Lv03/h;

    .line 16
    iput-object p6, p0, Lc20/o;->G:Lv03/h;

    .line 17
    iput-object p7, p0, Lc20/o;->H:Lv03/h;

    .line 18
    iput-object p8, p0, Lc20/o;->I:Lv03/h;

    .line 19
    iput-object p9, p0, Lc20/o;->J:Lv03/h;

    .line 20
    iput-object p10, p0, Lc20/o;->z:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lv03/h;Lb20/g;Lv03/e;Lv03/e;Lv03/e;Lv03/e;Lv03/e;Lv03/h;Lc20/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc20/o;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc20/o;->x:Lv03/h;

    .line 3
    iput-object p2, p0, Lc20/o;->E:Lv03/h;

    .line 4
    iput-object p3, p0, Lc20/o;->z:Lv03/h;

    .line 5
    iput-object p4, p0, Lc20/o;->F:Lv03/h;

    .line 6
    iput-object p5, p0, Lc20/o;->G:Lv03/h;

    .line 7
    iput-object p6, p0, Lc20/o;->H:Lv03/h;

    .line 8
    iput-object p7, p0, Lc20/o;->I:Lv03/h;

    .line 9
    iput-object p8, p0, Lc20/o;->y:Lv03/h;

    .line 10
    iput-object p9, p0, Lc20/o;->J:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lc20/o;->w:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lc20/o;->x:Lv03/h;

    .line 23
    iput-object p2, p0, Lc20/o;->y:Lv03/h;

    .line 24
    iput-object p3, p0, Lc20/o;->E:Lv03/h;

    .line 25
    iput-object p4, p0, Lc20/o;->z:Lv03/h;

    .line 26
    iput-object p5, p0, Lc20/o;->F:Lv03/h;

    .line 27
    iput-object p6, p0, Lc20/o;->G:Lv03/h;

    .line 28
    iput-object p7, p0, Lc20/o;->H:Lv03/h;

    .line 29
    iput-object p8, p0, Lc20/o;->I:Lv03/h;

    .line 30
    iput-object p9, p0, Lc20/o;->J:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lc20/o;->w:I

    iget-object v2, v0, Lc20/o;->F:Lv03/h;

    iget-object v3, v0, Lc20/o;->J:Lv03/h;

    iget-object v4, v0, Lc20/o;->I:Lv03/h;

    iget-object v5, v0, Lc20/o;->H:Lv03/h;

    iget-object v6, v0, Lc20/o;->G:Lv03/h;

    iget-object v7, v0, Lc20/o;->z:Lv03/h;

    iget-object v8, v0, Lc20/o;->E:Lv03/h;

    iget-object v9, v0, Lc20/o;->y:Lv03/h;

    iget-object v10, v0, Lc20/o;->x:Lv03/h;

    packed-switch v1, :pswitch_data_0

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lk20/a;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lz20/g;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ls10/f;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lh20/f;

    invoke-interface {v6}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lv00/c0;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v17, Lkc3/d;->w:Lkc3/d;

    invoke-static/range {v17 .. v17}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lq83/j;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Lbc3/c0;

    move-object/from16 v20, v3

    check-cast v20, Lv03/b;

    new-instance v10, Lu10/u;

    iget-object v15, v0, Lc20/o;->F:Lv03/h;

    invoke-direct/range {v10 .. v20}, Lu10/u;-><init>(Lk20/a;Lz20/g;Ls10/f;Lh20/f;Lk83/a;Lv00/c0;Lq83/j;Lq83/j;Lbc3/c0;Lv03/b;)V

    return-object v10

    :pswitch_0
    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/content/Context;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lq83/j;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lq83/j;

    invoke-interface {v6}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lb10/b;

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lc93/a;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    check-cast v7, Lv03/e;

    iget-object v2, v7, Lv03/e;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    const-string v2, "context"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "workContext"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "uiContext"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentAnalyticsRequestFactory"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "publishableKeyProvider"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "productUsage"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v1

    invoke-static/range {v10 .. v18}, Lce/w;->F(Landroid/content/Context;Lb10/b;ZLq83/j;Lq83/j;Lc93/a;Ljava/util/Set;ZZ)Lc20/a;

    move-result-object v1

    invoke-static {v1}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v1

    :pswitch_1
    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lb20/g;

    invoke-virtual {v8}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lyy/j;

    check-cast v7, Lv03/e;

    iget-object v1, v7, Lv03/e;->w:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lb10/b;

    check-cast v2, Lv03/e;

    iget-object v1, v2, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    check-cast v6, Lv03/e;

    iget-object v1, v6, Lv03/e;->w:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, Lq83/j;

    check-cast v5, Lv03/e;

    iget-object v1, v5, Lv03/e;->w:Ljava/lang/Object;

    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    check-cast v4, Lv03/e;

    iget-object v1, v4, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lv10/a;

    check-cast v3, Lc20/g;

    invoke-virtual {v3}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Ld1/j;

    new-instance v10, Lc20/n;

    invoke-direct/range {v10 .. v19}, Lc20/n;-><init>(Lkotlin/jvm/functions/Function1;Lyy/j;Lb10/b;ZLq83/j;Lc93/a;ZLv10/a;Ld1/j;)V

    return-object v10

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
