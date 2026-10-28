.class public final synthetic Lcom/whoop/profile/presentation/edit/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lp1/z0;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/presentation/edit/e;->w:I

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/e;->x:Lc93/m;

    iput-object p2, p0, Lcom/whoop/profile/presentation/edit/e;->y:Lp1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/presentation/edit/e;->w:I

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/e;->x:Lc93/m;

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/e;->y:Lp1/z0;

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->f(Lc93/m;Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/e;->x:Lc93/m;

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/e;->y:Lp1/z0;

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->h(Lc93/m;Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
