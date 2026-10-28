.class public final synthetic Lam2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ln0/u;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ln0/u;Ljava/lang/String;II)V
    .locals 0

    iput p4, p0, Lam2/h;->w:I

    iput-object p1, p0, Lam2/h;->x:Ln0/u;

    iput-object p2, p0, Lam2/h;->y:Ljava/lang/String;

    iput p3, p0, Lam2/h;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lam2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/h;->y:Ljava/lang/String;

    iget v1, p0, Lam2/h;->z:I

    iget-object v2, p0, Lam2/h;->x:Ln0/u;

    invoke-static {v2, v0, v1}, Lyd2/d;->h(Ln0/u;Ljava/lang/String;I)Z

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lam2/h;->y:Ljava/lang/String;

    iget v1, p0, Lam2/h;->z:I

    iget-object v2, p0, Lam2/h;->x:Ln0/u;

    invoke-static {v2, v0, v1}, Lgb1/q;->d(Ln0/u;Ljava/lang/String;I)Z

    move-result v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lam2/h;->y:Ljava/lang/String;

    iget v1, p0, Lam2/h;->z:I

    iget-object v2, p0, Lam2/h;->x:Ln0/u;

    invoke-static {v2, v0, v1}, Lau1/q;->n(Ln0/u;Ljava/lang/String;I)Z

    move-result v0

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lam2/h;->y:Ljava/lang/String;

    iget v1, p0, Lam2/h;->z:I

    iget-object v2, p0, Lam2/h;->x:Ln0/u;

    invoke-static {v2, v0, v1}, Lam2/w;->f(Ln0/u;Ljava/lang/String;I)Z

    move-result v0

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lam2/h;->y:Ljava/lang/String;

    iget v1, p0, Lam2/h;->z:I

    iget-object v2, p0, Lam2/h;->x:Ln0/u;

    invoke-static {v2, v0, v1}, Lam2/k;->u(Ln0/u;Ljava/lang/String;I)Z

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
