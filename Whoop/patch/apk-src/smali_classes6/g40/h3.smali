.class public final synthetic Lg40/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:Lc93/a;

.field public final synthetic I:I

.field public final synthetic w:Z

.field public final synthetic x:Lzy/b;

.field public final synthetic y:Lg40/g3;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLzy/b;Lg40/g3;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg40/h3;->w:Z

    iput-object p2, p0, Lg40/h3;->x:Lzy/b;

    iput-object p3, p0, Lg40/h3;->y:Lg40/g3;

    iput-object p4, p0, Lg40/h3;->z:Ljava/lang/Object;

    iput-object p5, p0, Lg40/h3;->E:Lkotlin/jvm/functions/Function1;

    iput-wide p6, p0, Lg40/h3;->F:J

    iput-wide p8, p0, Lg40/h3;->G:J

    iput-object p10, p0, Lg40/h3;->H:Lc93/a;

    iput p11, p0, Lg40/h3;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/h3;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-boolean v0, p0, Lg40/h3;->w:Z

    iget-object v1, p0, Lg40/h3;->x:Lzy/b;

    iget-object v2, p0, Lg40/h3;->y:Lg40/g3;

    iget-object v3, p0, Lg40/h3;->z:Ljava/lang/Object;

    iget-object v4, p0, Lg40/h3;->E:Lkotlin/jvm/functions/Function1;

    iget-wide v5, p0, Lg40/h3;->F:J

    iget-wide v7, p0, Lg40/h3;->G:J

    iget-object v9, p0, Lg40/h3;->H:Lc93/a;

    invoke-static/range {v0 .. v11}, Lse/b;->s(ZLzy/b;Lg40/g3;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
