.class public final synthetic Lhh0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lhh0/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh0/e;->x:Lp1/c1;

    iput-boolean p2, p0, Lhh0/e;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lhh0/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhh0/e;->y:Z

    iput-object p2, p0, Lhh0/e;->x:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhh0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lhh0/e;->y:Z

    check-cast p1, Lc0/q;

    iget-object v1, p0, Lhh0/e;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lqu2/k;->a(Lp1/c1;ZLc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhh0/e;->x:Lp1/c1;

    check-cast p1, Lkd1/o;

    iget-boolean v1, p0, Lhh0/e;->y:Z

    invoke-static {v1, v0, p1}, Lhh0/f;->c(ZLp1/c1;Lkd1/o;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
