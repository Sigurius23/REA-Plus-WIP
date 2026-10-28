.class public final synthetic Lgb1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLc93/a;FLi2/j;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lgb1/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgb1/v;->x:F

    iput-object p2, p0, Lgb1/v;->z:Ljava/lang/Object;

    iput p3, p0, Lgb1/v;->y:F

    iput-object p4, p0, Lgb1/v;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ld0/e;Li2/x;FF)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lgb1/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb1/v;->z:Ljava/lang/Object;

    iput-object p2, p0, Lgb1/v;->E:Ljava/lang/Object;

    iput p3, p0, Lgb1/v;->x:F

    iput p4, p0, Lgb1/v;->y:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lgb1/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgb1/v;->z:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    iget-object v1, p0, Lgb1/v;->E:Ljava/lang/Object;

    check-cast v1, Li2/x;

    iget v2, p0, Lgb1/v;->y:F

    check-cast p1, Lk2/e;

    iget v3, p0, Lgb1/v;->x:F

    invoke-static {v0, v1, v3, v2, p1}, Lgb1/y;->b(Ld0/e;Li2/x;FFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgb1/v;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lgb1/v;->E:Ljava/lang/Object;

    check-cast v1, Li2/j;

    check-cast p1, Lk2/c;

    iget v2, p0, Lgb1/v;->x:F

    iget v3, p0, Lgb1/v;->y:F

    invoke-static {v2, v0, v3, v1, p1}, Lgb1/w;->b(FLc93/a;FLi2/j;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
