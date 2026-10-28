.class public final synthetic Lgb1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FLjava/util/List;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lgb1/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgb1/z;->y:F

    iput-object p2, p0, Lgb1/z;->x:Ljava/util/List;

    iput p3, p0, Lgb1/z;->z:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;FF)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lgb1/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb1/z;->x:Ljava/util/List;

    iput p2, p0, Lgb1/z;->y:F

    iput p3, p0, Lgb1/z;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lgb1/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lgb1/z;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Lgb1/z;->y:F

    iget-object v2, p0, Lgb1/z;->x:Ljava/util/List;

    invoke-static {v1, v2, v0, p1}, Lgb1/b0;->a(FLjava/util/List;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lgb1/z;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Lgb1/z;->y:F

    iget-object v2, p0, Lgb1/z;->x:Ljava/util/List;

    invoke-static {v1, v2, v0, p1}, Lgb1/b0;->j(FLjava/util/List;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
