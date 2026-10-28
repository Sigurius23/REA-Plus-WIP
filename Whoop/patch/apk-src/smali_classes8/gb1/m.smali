.class public final synthetic Lgb1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lgb1/m;->w:I

    iput-object p1, p0, Lgb1/m;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgb1/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgb1/m;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lgb1/c0;->b(Lp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgb1/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lgb1/b0;->d(Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lgb1/m;->x:Ljava/lang/Object;

    check-cast v0, Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lgb1/b0;->h(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lgb1/m;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lgb1/n;->a(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
