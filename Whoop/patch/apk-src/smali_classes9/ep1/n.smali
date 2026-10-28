.class public final synthetic Lep1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lep1/n;->w:I

    iput-object p1, p0, Lep1/n;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lep1/n;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Lep1/n;->z:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p4, p0, Lep1/n;->w:I

    iput-boolean p1, p0, Lep1/n;->z:Z

    iput-object p2, p0, Lep1/n;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lep1/n;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lep1/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lep1/n;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/n;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Lep1/n;->z:Z

    invoke-static {v0, v1, v2}, Lm80/a;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lep1/n;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lep1/n;->z:Z

    iget-object v2, p0, Lep1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Ll72/o;->j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lep1/n;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lep1/n;->z:Z

    iget-object v2, p0, Lep1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Ll72/o;->G(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lep1/n;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/n;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Lep1/n;->z:Z

    invoke-static {v0, v1, v2}, Lep1/q;->g(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
