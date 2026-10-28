.class public final synthetic Ll1/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ll83/e;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ZLp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ll1/s3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s3;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Ll1/s3;->y:Z

    iput-object p3, p0, Ll1/s3;->E:Ll83/e;

    iput-boolean p4, p0, Ll1/s3;->z:Z

    iput-object p5, p0, Ll1/s3;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ll1/s3;->w:I

    sget-object v0, Ll1/x3;->w:Ll1/x3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll1/s3;->y:Z

    iput-object p2, p0, Ll1/s3;->E:Ll83/e;

    iput-object p3, p0, Ll1/s3;->F:Ljava/lang/Object;

    iput-object p4, p0, Ll1/s3;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Ll1/s3;->z:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll1/s3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/s3;->E:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll1/s3;->F:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Ll1/s3;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Ll1/s3;->y:Z

    iget-boolean v4, p0, Ll1/s3;->z:Z

    invoke-static {v2, v3, v0, v4, v1}, Lm80/f;->h(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ZLp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll1/s3;->E:Ll83/e;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Ll1/s3;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    sget-object v5, Ll1/x3;->w:Ll1/x3;

    new-instance v1, Ll1/w3;

    iget-boolean v2, p0, Ll1/s3;->y:Z

    iget-object v6, p0, Ll1/s3;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v7, p0, Ll1/s3;->z:Z

    invoke-direct/range {v1 .. v7}, Ll1/w3;-><init>(ZLc93/a;Lc93/a;Ll1/x3;Lkotlin/jvm/functions/Function1;Z)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
