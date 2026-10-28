.class public final Lpb3/a;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lpb3/a;

.field public static final y:Lpb3/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lpb3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpb3/a;-><init>(I)V

    sput-object v0, Lpb3/a;->x:Lpb3/a;

    new-instance v0, Lpb3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpb3/a;-><init>(I)V

    sput-object v0, Lpb3/a;->y:Lpb3/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpb3/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpb3/a;->w:I

    check-cast p1, Llb3/f1;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lr93/w0;

    if-nez v0, :cond_0

    instance-of p1, p1, Lr93/x0;

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    if-eqz p1, :cond_2

    instance-of v0, p1, Lr93/x0;

    if-eqz v0, :cond_2

    check-cast p1, Lr93/x0;

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    instance-of p1, p1, Lr93/w0;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
