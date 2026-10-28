.class public final synthetic Lgb1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FFILjava/lang/Object;)V
    .locals 0

    iput p3, p0, Lgb1/x;->w:I

    iput-object p4, p0, Lgb1/x;->z:Ljava/lang/Object;

    iput p1, p0, Lgb1/x;->x:F

    iput p2, p0, Lgb1/x;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lgb1/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgb1/x;->z:Ljava/lang/Object;

    check-cast v0, Li2/k0;

    iget v1, p0, Lgb1/x;->y:F

    check-cast p1, Lk2/e;

    iget v2, p0, Lgb1/x;->x:F

    invoke-static {v0, v2, v1, p1}, Ll01/m;->k(Li2/k0;FFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgb1/x;->z:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget v1, p0, Lgb1/x;->y:F

    check-cast p1, Lk2/e;

    iget v2, p0, Lgb1/x;->x:F

    invoke-static {v0, v2, v1, p1}, Lgb1/y;->a(Li2/x;FFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
