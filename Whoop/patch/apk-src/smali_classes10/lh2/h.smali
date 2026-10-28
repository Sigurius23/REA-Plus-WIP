.class public final synthetic Llh2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/stories/c;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stories/c;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Llh2/h;->w:I

    iput-object p1, p0, Llh2/h;->x:Lcom/whoop/stories/c;

    iput-object p2, p0, Llh2/h;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llh2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh2/h;->x:Lcom/whoop/stories/c;

    iget-object v1, p0, Llh2/h;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/stories/c;->f(Lcom/whoop/stories/c;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llh2/h;->x:Lcom/whoop/stories/c;

    iget-object v1, p0, Llh2/h;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/stories/c;->g(Lcom/whoop/stories/c;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
