.class public final synthetic Le81/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FLi91/h;FLi91/h;F)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Le81/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le81/b0;->x:F

    iput-object p2, p0, Le81/b0;->E:Ljava/lang/Object;

    iput p3, p0, Le81/b0;->y:F

    iput-object p4, p0, Le81/b0;->F:Ljava/lang/Object;

    iput p5, p0, Le81/b0;->z:F

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Ljava/util/List;FFF)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Le81/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le81/b0;->E:Ljava/lang/Object;

    iput-object p2, p0, Le81/b0;->F:Ljava/lang/Object;

    iput p3, p0, Le81/b0;->x:F

    iput p4, p0, Le81/b0;->y:F

    iput p5, p0, Le81/b0;->z:F

    return-void
.end method

.method public synthetic constructor <init>(Li2/a1;FFFLi2/t;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Le81/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le81/b0;->E:Ljava/lang/Object;

    iput p2, p0, Le81/b0;->x:F

    iput p3, p0, Le81/b0;->y:F

    iput p4, p0, Le81/b0;->z:F

    iput-object p5, p0, Le81/b0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Le81/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le81/b0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li91/h;

    iget-object v0, p0, Le81/b0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Li91/h;

    iget v5, p0, Le81/b0;->z:F

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget v1, p0, Le81/b0;->x:F

    iget v3, p0, Le81/b0;->y:F

    invoke-static/range {v1 .. v6}, Lz71/l;->j(FLi91/h;FLi91/h;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Le81/b0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li2/a1;

    iget-object v0, p0, Le81/b0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Li2/t;

    move-object v6, p1

    check-cast v6, Lf2/d;

    iget v2, p0, Le81/b0;->x:F

    iget v3, p0, Le81/b0;->y:F

    iget v4, p0, Le81/b0;->z:F

    invoke-static/range {v1 .. v6}, Lgb1/g;->c(Li2/a1;FFFLi2/t;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Le81/b0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Le81/b0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget v5, p0, Le81/b0;->z:F

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget v3, p0, Le81/b0;->x:F

    iget v4, p0, Le81/b0;->y:F

    invoke-static/range {v1 .. v6}, Le81/d0;->e(Lc93/a;Ljava/util/List;FFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
