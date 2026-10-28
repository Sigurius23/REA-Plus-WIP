.class public final Landroidx/fragment/app/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/s1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 1

    iget v0, p0, Landroidx/fragment/app/s1;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lo8/e;

    invoke-direct {p1}, Lo8/e;-><init>()V

    return-object p1

    :pswitch_0
    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Leb/b0;

    invoke-direct {p1}, Leb/b0;-><init>()V

    return-object p1

    :pswitch_1
    new-instance p1, Landroidx/fragment/app/t1;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroidx/fragment/app/t1;-><init>(Z)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
