.class public final synthetic Lln1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lln1/p;->w:I

    iput-object p1, p0, Lln1/p;->y:Lbc3/c0;

    iput-object p2, p0, Lln1/p;->z:Lg1/y3;

    iput-object p3, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;I)V
    .locals 0

    .line 2
    iput p4, p0, Lln1/p;->w:I

    iput-object p1, p0, Lln1/p;->y:Lbc3/c0;

    iput-object p2, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lln1/p;->z:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lln1/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lln1/p;->y:Lbc3/c0;

    iput-object p3, p0, Lln1/p;->z:Lg1/y3;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lln1/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lln1/p;->z:Lg1/y3;

    iget-object v1, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lln1/p;->y:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lsv2/e;->p(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lln1/p;->z:Lg1/y3;

    iget-object v2, p0, Lln1/p;->y:Lbc3/c0;

    invoke-static {v2, v1, v0}, Lsv2/e;->v(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lln1/p;->z:Lg1/y3;

    iget-object v1, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lln1/p;->y:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lpp2/e;->b(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lln1/p;->y:Lbc3/c0;

    iget-object v1, p0, Lln1/p;->z:Lg1/y3;

    iget-object v2, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lox2/h;->i(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lln1/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lln1/p;->z:Lg1/y3;

    iget-object v2, p0, Lln1/p;->y:Lbc3/c0;

    invoke-static {v2, v1, v0}, Lln1/q;->c(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
