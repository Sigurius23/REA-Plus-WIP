.class public final synthetic Luw0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:J

.field public final synthetic w:I

.field public final synthetic x:Ln0/u;

.field public final synthetic y:Z

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Ln0/u;ZLp1/t2;FFJI)V
    .locals 0

    iput p8, p0, Luw0/b;->w:I

    iput-object p1, p0, Luw0/b;->x:Ln0/u;

    iput-boolean p2, p0, Luw0/b;->y:Z

    iput-object p3, p0, Luw0/b;->z:Lp1/t2;

    iput p4, p0, Luw0/b;->E:F

    iput p5, p0, Luw0/b;->F:F

    iput-wide p6, p0, Luw0/b;->G:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Luw0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v6, p0, Luw0/b;->G:J

    move-object v8, p1

    check-cast v8, Lk2/c;

    iget-object v1, p0, Luw0/b;->x:Ln0/u;

    iget-boolean v2, p0, Luw0/b;->y:Z

    iget-object v3, p0, Luw0/b;->z:Lp1/t2;

    iget v4, p0, Luw0/b;->E:F

    iget v5, p0, Luw0/b;->F:F

    invoke-static/range {v1 .. v8}, Lzr1/c;->c(Ln0/u;ZLp1/t2;FFJLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v5, p0, Luw0/b;->G:J

    move-object v7, p1

    check-cast v7, Lk2/c;

    iget-object v0, p0, Luw0/b;->x:Ln0/u;

    iget-boolean v1, p0, Luw0/b;->y:Z

    iget-object v2, p0, Luw0/b;->z:Lp1/t2;

    iget v3, p0, Luw0/b;->E:F

    iget v4, p0, Luw0/b;->F:F

    invoke-static/range {v0 .. v7}, Luw0/f;->h(Ln0/u;ZLp1/t2;FFJLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
