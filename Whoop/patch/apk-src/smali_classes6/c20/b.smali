.class public final Lc20/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/d;


# direct methods
.method public synthetic constructor <init>(ILv03/d;Lv03/h;Lv03/h;Lv03/h;)V
    .locals 0

    .line 1
    iput p1, p0, Lc20/b;->w:I

    iput-object p3, p0, Lc20/b;->x:Lv03/h;

    iput-object p4, p0, Lc20/b;->E:Lv03/h;

    iput-object p5, p0, Lc20/b;->y:Lv03/h;

    iput-object p2, p0, Lc20/b;->z:Lv03/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lv03/h;Lv03/e;Lv03/e;Lv03/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc20/b;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc20/b;->x:Lv03/h;

    .line 4
    iput-object p2, p0, Lc20/b;->y:Lv03/h;

    .line 5
    iput-object p3, p0, Lc20/b;->z:Lv03/d;

    .line 6
    iput-object p4, p0, Lc20/b;->E:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lc20/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc20/b;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/f;

    iget-object v1, p0, Lc20/b;->E:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/c0;

    iget-object v2, p0, Lc20/b;->y:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu10/d;

    iget-object v3, p0, Lc20/b;->z:Lv03/d;

    check-cast v3, Ld20/d;

    invoke-virtual {v3}, Ld20/d;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La30/w0;

    new-instance v4, Lq/f;

    invoke-direct {v4, v0, v1, v2, v3}, Lq/f;-><init>(Lh20/f;Lv00/c0;Lu10/d;La30/w0;)V

    return-object v4

    :pswitch_0
    iget-object v0, p0, Lc20/b;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lux/t;

    iget-object v1, p0, Lc20/b;->y:Lv03/h;

    check-cast v1, Lv03/e;

    iget-object v1, v1, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lc20/b;->z:Lv03/d;

    check-cast v2, Lv03/e;

    iget-object v2, v2, Lv03/e;->w:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v3, p0, Lc20/b;->E:Lv03/h;

    check-cast v3, Lv03/e;

    iget-object v3, v3, Lv03/e;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/Set;

    new-instance v4, Ld20/i;

    invoke-direct {v4, v0, v1, v2, v3}, Ld20/i;-><init>(Lux/t;ZLc93/a;Ljava/util/Set;)V

    return-object v4

    :pswitch_1
    iget-object v0, p0, Lc20/b;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc20/c;

    iget-object v1, p0, Lc20/b;->E:Lv03/h;

    check-cast v1, Lv03/g;

    invoke-virtual {v1}, Lv03/g;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iget-object v2, p0, Lc20/b;->y:Lv03/h;

    check-cast v2, Lv03/e;

    iget-object v2, v2, Lv03/e;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Lc20/b;->z:Lv03/d;

    check-cast v3, Lv03/e;

    iget-object v3, v3, Lv03/e;->w:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    new-instance v4, Lc20/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lc20/a;-><init>(Lc20/c;Ljava/util/Map;ZLandroid/content/Context;)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
