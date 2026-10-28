.class public final La00/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/e;


# direct methods
.method public constructor <init>(Lv03/e;Lv03/e;Lv03/h;I)V
    .locals 0

    iput p4, p0, La00/k;->w:I

    packed-switch p4, :pswitch_data_0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, La00/k;->x:Lv03/h;

    .line 7
    iput-object p2, p0, La00/k;->z:Lv03/e;

    .line 8
    iput-object p3, p0, La00/k;->y:Lv03/h;

    return-void

    .line 9
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, La00/k;->z:Lv03/e;

    .line 11
    iput-object p2, p0, La00/k;->x:Lv03/h;

    .line 12
    iput-object p3, p0, La00/k;->y:Lv03/h;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lv03/h;Lv03/h;Lv03/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La00/k;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La00/k;->x:Lv03/h;

    .line 3
    iput-object p2, p0, La00/k;->y:Lv03/h;

    .line 4
    iput-object p3, p0, La00/k;->z:Lv03/e;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget v0, p0, La00/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La00/k;->z:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, La00/k;->x:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, La00/k;->y:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/j;

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lp30/a;

    invoke-direct {v3, v0, v1, v2}, Lp30/a;-><init>(Landroid/content/Context;ZLq83/j;)V

    return-object v3

    :pswitch_0
    iget-object v0, p0, La00/k;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc20/n;

    iget-object v1, p0, La00/k;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc20/c;

    iget-object v2, p0, La00/k;->z:Lv03/e;

    iget-object v2, v2, Lv03/e;->w:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Lc20/i;

    invoke-direct {v3, v0, v1, v2}, Lc20/i;-><init>(Lc20/n;Lc20/c;Landroid/content/Context;)V

    return-object v3

    :pswitch_1
    iget-object v0, p0, La00/k;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/g0;

    iget-object v1, p0, La00/k;->z:Lv03/e;

    iget-object v1, v1, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Lv00/c0;

    iget-object v2, p0, La00/k;->y:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqy/d;

    new-instance v3, La00/i;

    invoke-direct {v3, v0, v1, v2}, La00/i;-><init>(Lwz/g0;Lv00/c0;Lqy/d;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
