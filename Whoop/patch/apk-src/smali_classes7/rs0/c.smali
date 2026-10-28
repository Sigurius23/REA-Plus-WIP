.class public final synthetic Lrs0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lms0/b;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lms0/b;Lc93/a;I)V
    .locals 0

    iput p3, p0, Lrs0/c;->w:I

    iput-object p1, p0, Lrs0/c;->x:Lms0/b;

    iput-object p2, p0, Lrs0/c;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lrs0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrs0/c;->x:Lms0/b;

    iget-object v1, p0, Lrs0/c;->y:Lc93/a;

    invoke-static {v0, v1}, Lrs0/d;->a(Lms0/b;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrs0/c;->x:Lms0/b;

    iget-object v1, p0, Lrs0/c;->y:Lc93/a;

    invoke-static {v0, v1}, Lrs0/d;->d(Lms0/b;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
