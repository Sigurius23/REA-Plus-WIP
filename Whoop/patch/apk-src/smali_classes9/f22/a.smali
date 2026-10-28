.class public final synthetic Lf22/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg22/d;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lg22/d;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p4, p0, Lf22/a;->w:I

    iput-object p1, p0, Lf22/a;->x:Lg22/d;

    iput-object p2, p0, Lf22/a;->y:Ljava/lang/String;

    iput-object p3, p0, Lf22/a;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf22/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf22/a;->y:Ljava/lang/String;

    iget-object v1, p0, Lf22/a;->z:Ljava/lang/String;

    iget-object v2, p0, Lf22/a;->x:Lg22/d;

    invoke-static {v2, v0, v1}, Lf22/c;->c(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf22/a;->y:Ljava/lang/String;

    iget-object v1, p0, Lf22/a;->z:Ljava/lang/String;

    iget-object v2, p0, Lf22/a;->x:Lg22/d;

    invoke-static {v2, v0, v1}, Lf22/c;->i(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
