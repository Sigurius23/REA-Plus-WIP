.class public final synthetic Lj00/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg40/m3;

.field public final synthetic F:Lg40/m3;

.field public final synthetic G:Lg40/z1;

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(La33/d;Lg40/m3;Lg40/z1;Lg40/m3;ZLn00/d;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lj00/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/a0;->I:Ljava/lang/Object;

    iput-object p2, p0, Lj00/a0;->E:Lg40/m3;

    iput-object p3, p0, Lj00/a0;->G:Lg40/z1;

    iput-object p4, p0, Lj00/a0;->F:Lg40/m3;

    iput-boolean p5, p0, Lj00/a0;->x:Z

    iput-object p6, p0, Lj00/a0;->J:Ljava/lang/Object;

    iput-boolean p7, p0, Lj00/a0;->y:Z

    iput-boolean p8, p0, Lj00/a0;->z:Z

    iput-object p9, p0, Lj00/a0;->K:Ljava/lang/Object;

    iput-object p10, p0, Lj00/a0;->L:Ljava/lang/Object;

    iput p11, p0, Lj00/a0;->H:I

    return-void
.end method

.method public synthetic constructor <init>(ZLs20/a;ZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lj00/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj00/a0;->x:Z

    iput-object p2, p0, Lj00/a0;->I:Ljava/lang/Object;

    iput-boolean p3, p0, Lj00/a0;->y:Z

    iput-boolean p4, p0, Lj00/a0;->z:Z

    iput-object p5, p0, Lj00/a0;->E:Lg40/m3;

    iput-object p6, p0, Lj00/a0;->F:Lg40/m3;

    iput-object p7, p0, Lj00/a0;->G:Lg40/z1;

    iput-object p8, p0, Lj00/a0;->J:Ljava/lang/Object;

    iput-object p9, p0, Lj00/a0;->K:Ljava/lang/Object;

    iput-object p10, p0, Lj00/a0;->L:Ljava/lang/Object;

    iput p11, p0, Lj00/a0;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lj00/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj00/a0;->I:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ls20/a;

    iget-object v0, p0, Lj00/a0;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lg40/e;

    iget-object v0, p0, Lj00/a0;->K:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v0, p0, Lj00/a0;->L:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lg40/v2;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lj00/a0;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-boolean v1, p0, Lj00/a0;->x:Z

    iget-boolean v3, p0, Lj00/a0;->y:Z

    iget-boolean v4, p0, Lj00/a0;->z:Z

    iget-object v5, p0, Lj00/a0;->E:Lg40/m3;

    iget-object v6, p0, Lj00/a0;->F:Lg40/m3;

    iget-object v7, p0, Lj00/a0;->G:Lg40/z1;

    invoke-static/range {v1 .. v12}, Ls9/f;->g(ZLs20/a;ZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lj00/a0;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, La33/d;

    iget-object v0, p0, Lj00/a0;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ln00/d;

    iget-object v0, p0, Lj00/a0;->K:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    iget-object v0, p0, Lj00/a0;->L:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Landroidx/compose/ui/Modifier;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lj00/a0;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v2, p0, Lj00/a0;->E:Lg40/m3;

    iget-object v3, p0, Lj00/a0;->G:Lg40/z1;

    iget-object v4, p0, Lj00/a0;->F:Lg40/m3;

    iget-boolean v5, p0, Lj00/a0;->x:Z

    iget-boolean v7, p0, Lj00/a0;->y:Z

    iget-boolean v8, p0, Lj00/a0;->z:Z

    invoke-static/range {v1 .. v12}, Lug/m;->d(La33/d;Lg40/m3;Lg40/z1;Lg40/m3;ZLn00/d;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
