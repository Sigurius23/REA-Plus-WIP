.class public final synthetic Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf0/h;


# direct methods
.method public synthetic constructor <init>(Lf0/h;I)V
    .locals 0

    iput p2, p0, Lf0/a;->w:I

    iput-object p1, p0, Lf0/a;->x:Lf0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lf0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf0/a;->x:Lf0/h;

    iget-object v0, v0, Lf0/h;->W:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    sget-object v0, Landroidx/compose/foundation/d;->a:Lp1/b0;

    iget-object v1, p0, Lf0/a;->x:Lf0/h;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/v0;

    instance-of v2, v0, Lf0/v0;

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v2, v1, Lf0/h;->Y:Lf0/v0;

    check-cast v0, Lf0/v0;

    iput-object v0, v1, Lf0/h;->Y:Lf0/v0;

    if-eqz v2, :cond_3

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v1, Lf0/h;->a0:La3/n;

    if-nez v0, :cond_1

    iget-boolean v2, v1, Lf0/h;->g0:Z

    if-nez v2, :cond_3

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v1, v0}, La3/o;->Y0(La3/n;)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, v1, Lf0/h;->a0:La3/n;

    invoke-virtual {v1}, Lf0/h;->f1()V

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
