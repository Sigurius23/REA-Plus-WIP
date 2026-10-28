.class public final synthetic Lgb1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(FILc93/a;)V
    .locals 0

    .line 1
    iput p2, p0, Lgb1/b;->w:I

    iput-object p3, p0, Lgb1/b;->x:Lc93/a;

    iput p1, p0, Lgb1/b;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(FLc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lgb1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgb1/b;->y:F

    iput-object p2, p0, Lgb1/b;->x:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lgb1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgb1/b;->x:Lc93/a;

    check-cast p1, Lf2/d;

    iget v1, p0, Lgb1/b;->y:F

    invoke-static {v1, v0, p1}, Lis0/x;->a(FLc93/a;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lgb1/b;->y:F

    check-cast p1, Lk2/e;

    iget-object v1, p0, Lgb1/b;->x:Lc93/a;

    invoke-static {v1, v0, p1}, Lis0/x;->d(Lc93/a;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lgb1/b;->y:F

    check-cast p1, Lk2/c;

    iget-object v1, p0, Lgb1/b;->x:Lc93/a;

    invoke-static {v1, v0, p1}, Lgb1/c;->a(Lc93/a;FLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
