.class public final synthetic Lwq1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwq1/d;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lwq1/d;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lwq1/a;->w:I

    iput-object p1, p0, Lwq1/a;->x:Lwq1/d;

    iput-object p2, p0, Lwq1/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwq1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwq1/a;->x:Lwq1/d;

    iget-object v1, p0, Lwq1/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lwq1/c;->p(Lwq1/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwq1/a;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, Lwq1/a;->x:Lwq1/d;

    invoke-static {v1, v0, p1}, Lwq1/c;->o(Lwq1/d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
