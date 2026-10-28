.class public final synthetic Lc31/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lc31/a;->w:I

    iput p1, p0, Lc31/a;->x:F

    iput p2, p0, Lc31/a;->y:F

    iput p3, p0, Lc31/a;->z:F

    iput-object p4, p0, Lc31/a;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/RuntimeShader;FFF)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc31/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc31/a;->E:Ljava/lang/Object;

    iput p2, p0, Lc31/a;->x:F

    iput p3, p0, Lc31/a;->y:F

    iput p4, p0, Lc31/a;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lc31/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc31/a;->E:Ljava/lang/Object;

    check-cast v0, Li91/h;

    check-cast p1, Lk2/e;

    iget v1, p0, Lc31/a;->x:F

    iget v2, p0, Lc31/a;->y:F

    iget v3, p0, Lc31/a;->z:F

    invoke-static {v1, v2, v3, v0, p1}, Lhy0/d;->a(FFFLi91/h;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc31/a;->E:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Lf2/d;

    iget v1, p0, Lc31/a;->x:F

    iget v2, p0, Lc31/a;->y:F

    iget v3, p0, Lc31/a;->z:F

    invoke-static {v1, v2, v3, v0, p1}, Lgb1/w;->a(FFFLc93/a;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc31/a;->E:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/RuntimeShader;

    iget v1, p0, Lc31/a;->z:F

    check-cast p1, Li2/g0;

    iget v2, p0, Lc31/a;->x:F

    iget v3, p0, Lc31/a;->y:F

    invoke-static {v0, v2, v3, v1, p1}, Lgb1/l;->b(Landroid/graphics/RuntimeShader;FFFLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc31/a;->E:Ljava/lang/Object;

    check-cast v0, Li2/d1;

    check-cast p1, Lk2/e;

    iget v1, p0, Lc31/a;->x:F

    iget v2, p0, Lc31/a;->y:F

    iget v3, p0, Lc31/a;->z:F

    invoke-static {v1, v2, v3, v0, p1}, Lc31/b;->b(FFFLi2/d1;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
