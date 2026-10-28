.class public final synthetic Lf61/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lf61/i;Lg61/b;Li61/b;ZZII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lf61/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/a;->F:Ljava/lang/Object;

    iput-object p2, p0, Lf61/a;->G:Ljava/lang/Object;

    iput-object p3, p0, Lf61/a;->H:Ljava/lang/Object;

    iput-boolean p4, p0, Lf61/a;->x:Z

    iput-boolean p5, p0, Lf61/a;->y:Z

    iput p6, p0, Lf61/a;->z:I

    iput p7, p0, Lf61/a;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lfm1/f;ZLim1/d0;Lfm1/d;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lf61/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/a;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lf61/a;->x:Z

    iput-object p3, p0, Lf61/a;->G:Ljava/lang/Object;

    iput-object p4, p0, Lf61/a;->H:Ljava/lang/Object;

    iput-boolean p5, p0, Lf61/a;->y:Z

    iput p6, p0, Lf61/a;->z:I

    iput p7, p0, Lf61/a;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lf61/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf61/a;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfm1/f;

    iget-object v0, p0, Lf61/a;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lim1/d0;

    iget-object v0, p0, Lf61/a;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lfm1/d;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Lf61/a;->x:Z

    iget-boolean v5, p0, Lf61/a;->y:Z

    iget v6, p0, Lf61/a;->z:I

    iget v7, p0, Lf61/a;->E:I

    invoke-static/range {v1 .. v9}, Lim1/b;->c(Lfm1/f;ZLim1/d0;Lfm1/d;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf61/a;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf61/i;

    iget-object v0, p0, Lf61/a;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg61/b;

    iget-object v0, p0, Lf61/a;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li61/b;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v4, p0, Lf61/a;->x:Z

    iget-boolean v5, p0, Lf61/a;->y:Z

    iget v6, p0, Lf61/a;->z:I

    iget v7, p0, Lf61/a;->E:I

    invoke-static/range {v1 .. v9}, Lf61/i;->q(Lf61/i;Lg61/b;Li61/b;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
