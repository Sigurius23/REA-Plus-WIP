.class public final synthetic Lqc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lqc/u;

.field public final synthetic y:Ltb/a;


# direct methods
.method public synthetic constructor <init>(Lqc/u;Ltb/a;I)V
    .locals 0

    iput p3, p0, Lqc/s;->w:I

    iput-object p1, p0, Lqc/s;->x:Lqc/u;

    iput-object p2, p0, Lqc/s;->y:Ltb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqc/s;->w:I

    check-cast p1, La0/g;

    packed-switch v0, :pswitch_data_0

    const-string v0, "_tmpMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqc/s;->x:Lqc/u;

    iget-object v1, p0, Lqc/s;->y:Ltb/a;

    invoke-virtual {v0, v1, p1}, Lqc/u;->b(Ltb/a;La0/g;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "_tmpMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqc/s;->x:Lqc/u;

    iget-object v1, p0, Lqc/s;->y:Ltb/a;

    invoke-virtual {v0, v1, p1}, Lqc/u;->a(Ltb/a;La0/g;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
