.class public final Lb10/a1;
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

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lv03/h;Le00/x;Lb10/c;Lv03/h;La30/h;Lv03/h;Lv03/h;Lv03/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb10/a1;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lb10/a1;->x:Lv03/h;

    .line 4
    iput-object p2, p0, Lb10/a1;->I:Lv03/h;

    .line 5
    iput-object p3, p0, Lb10/a1;->y:Lv03/h;

    .line 6
    iput-object p4, p0, Lb10/a1;->z:Lv03/h;

    .line 7
    iput-object p5, p0, Lb10/a1;->E:Lv03/h;

    .line 8
    iput-object p6, p0, Lb10/a1;->F:Lv03/h;

    .line 9
    iput-object p7, p0, Lb10/a1;->G:Lv03/h;

    .line 10
    iput-object p8, p0, Lb10/a1;->H:Lv03/h;

    return-void
.end method

.method public synthetic constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V
    .locals 0

    .line 1
    iput p9, p0, Lb10/a1;->w:I

    iput-object p1, p0, Lb10/a1;->x:Lv03/h;

    iput-object p2, p0, Lb10/a1;->y:Lv03/h;

    iput-object p3, p0, Lb10/a1;->z:Lv03/h;

    iput-object p4, p0, Lb10/a1;->E:Lv03/h;

    iput-object p5, p0, Lb10/a1;->F:Lv03/h;

    iput-object p6, p0, Lb10/a1;->G:Lv03/h;

    iput-object p7, p0, Lb10/a1;->H:Lv03/h;

    iput-object p8, p0, Lb10/a1;->I:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lb10/a1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb10/a1;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lk20/a;

    iget-object v0, p0, Lb10/a1;->I:Lv03/h;

    check-cast v0, Le00/x;

    invoke-virtual {v0}, Le00/x;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le00/w;

    iget-object v0, p0, Lb10/a1;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lb10/a1;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lq83/j;

    iget-object v0, p0, Lb10/a1;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, La30/e0;

    iget-object v0, p0, Lb10/a1;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lwz/l1;

    iget-object v0, p0, Lb10/a1;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iget-object v0, p0, Lb10/a1;->H:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lqy/d;

    new-instance v1, Lhy/c;

    invoke-direct/range {v1 .. v9}, Lhy/c;-><init>(Lk20/a;Le00/w;Ljava/lang/String;Lq83/j;La30/e0;Lwz/l1;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lqy/d;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Lb10/a1;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lv00/c0;

    iget-object v0, p0, Lb10/a1;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lb10/a1;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v0, p0, Lb10/a1;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ls10/f;

    iget-object v0, p0, Lb10/a1;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ls10/e;

    iget-object v0, p0, Lb10/a1;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lbc3/c0;

    iget-object v0, p0, Lb10/a1;->H:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lt10/e;

    iget-object v0, p0, Lb10/a1;->I:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lk20/a;

    new-instance v1, Ld30/f0;

    invoke-direct/range {v1 .. v9}, Ld30/f0;-><init>(Lv00/c0;Ljava/lang/String;ZLs10/f;Ls10/e;Lbc3/c0;Lt10/e;Lk20/a;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Lb10/a1;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lb10/a1;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lb10/a1;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lb10/d;

    iget-object v0, p0, Lb10/a1;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lq83/j;

    iget-object v0, p0, Lb10/a1;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Set;

    iget-object v0, p0, Lb10/a1;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lb10/b;

    iget-object v0, p0, Lb10/a1;->H:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lyy/j;

    iget-object v0, p0, Lb10/a1;->I:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lqy/d;

    new-instance v1, Lb10/z0;

    invoke-direct/range {v1 .. v9}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
